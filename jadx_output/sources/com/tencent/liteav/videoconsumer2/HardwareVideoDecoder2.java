package com.tencent.liteav.videoconsumer2;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class HardwareVideoDecoder2 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {
    private static final int DRAIN_ERROR = -1;
    private static final int DRAIN_SUCCESS = 0;
    private static final int DRAIN_SUCCESS_MEET_END_OF_STREAM = 1;
    private static final int INVALID_COLOR_FORMAT = 0;
    private android.view.Surface mExternalSurface;
    private int mHeight;
    private boolean mIsHevc;
    private boolean mIsRealTime;
    private boolean mIsStarted;
    private long mNativeVideoDecoderImplAndroid;
    private android.view.Surface mOutputSurface;
    private android.graphics.SurfaceTexture mSurfaceTexture;
    private final java.lang.String mTAG;
    private boolean mUseAsyncMode;
    private boolean mUseByteBuffer;
    private boolean mUseSoftwareDecoder;
    private int mWidth;
    private final com.tencent.liteav.base.b.b mThrottlers = new com.tencent.liteav.base.b.b();
    private android.media.MediaCodec mMediaCodec = null;
    private final java.util.Queue<java.lang.Integer> mInputBufferQueue = new java.util.LinkedList();
    private final java.util.Queue<android.util.Pair<java.lang.Integer, android.media.MediaCodec.BufferInfo>> mOutputBufferQueue = new java.util.LinkedList();
    private boolean mEnableLimitMaxDecFrameBufferingInH264Sps = true;
    private final com.tencent.liteav.videoconsumer.a.a mSPSModifier = new com.tencent.liteav.videoconsumer.a.a();
    private long mLastPresentationTimeUs = 0;

    public HardwareVideoDecoder2(java.lang.String str, boolean z17, boolean z18, int i17, int i18, boolean z19, boolean z27, boolean z28, long j17) {
        this.mUseSoftwareDecoder = false;
        this.mUseByteBuffer = false;
        this.mUseAsyncMode = false;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mIsHevc = false;
        this.mTAG = str + "HardwareVideoDecoder2";
        this.mIsRealTime = z17;
        this.mUseSoftwareDecoder = z19;
        this.mUseByteBuffer = z27;
        this.mUseAsyncMode = z28;
        this.mNativeVideoDecoderImplAndroid = j17;
        this.mWidth = i17;
        this.mHeight = i18;
        this.mIsHevc = z18;
    }

    private boolean configureDecoder(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat, android.view.Surface surface) {
        try {
            mediaCodec.configure(mediaFormat, surface, (android.media.MediaCrypto) null, 0);
            mediaCodec.setVideoScalingMode(1);
            mediaCodec.start();
            com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "Start MediaCodec(%s) success.", mediaCodec.getName());
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(this.mTAG, "Configure MediaCodec failed: ", th6);
            return false;
        }
    }

    private void destroyMediaCodec(android.media.MediaCodec mediaCodec) {
        if (mediaCodec != null) {
            try {
                try {
                    com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "mediaCodec stop");
                    mediaCodec.stop();
                    com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "mediaCodec release");
                    mediaCodec.release();
                } catch (java.lang.Throwable th6) {
                    try {
                        com.tencent.liteav.base.util.LiteavLog.e(this.mTAG, "Stop MediaCodec failed." + th6.getMessage());
                        com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "mediaCodec release");
                        mediaCodec.release();
                    } catch (java.lang.Throwable th7) {
                        try {
                            com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "mediaCodec release");
                            mediaCodec.release();
                        } catch (java.lang.Throwable th8) {
                            com.tencent.liteav.base.util.LiteavLog.e(this.mTAG, "release MediaCodec failed.", th8);
                        }
                        throw th7;
                    }
                }
            } catch (java.lang.Throwable th9) {
                com.tencent.liteav.base.util.LiteavLog.e(this.mTAG, "release MediaCodec failed.", th9);
            }
        }
    }

    private int drainDecodedFrameAsyncMode() {
        if (this.mOutputBufferQueue.isEmpty()) {
            return -1;
        }
        android.util.Pair<java.lang.Integer, android.media.MediaCodec.BufferInfo> poll = this.mOutputBufferQueue.poll();
        int intValue = ((java.lang.Integer) poll.first).intValue();
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) poll.second;
        this.mLastPresentationTimeUs = bufferInfo.presentationTimeUs;
        if ((bufferInfo.flags & 4) != 0) {
            com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "meet end of stream.");
            this.mMediaCodec.releaseOutputBuffer(intValue, true);
            return 1;
        }
        int handleOutputBuffer = this.mUseByteBuffer ? handleOutputBuffer(intValue, bufferInfo) : 0;
        this.mMediaCodec.releaseOutputBuffer(intValue, true);
        if (this.mExternalSurface != null) {
            long millis = java.util.concurrent.TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
            long j17 = this.mNativeVideoDecoderImplAndroid;
            if (j17 != 0) {
                nativeOnDecodedFrameWithSurface(j17, millis);
            }
        }
        return handleOutputBuffer;
    }

    private int drainDecodedFrameSyncMode() {
        android.media.MediaCodec.BufferInfo bufferInfo;
        int dequeueOutputBuffer;
        int i17 = 0;
        while (true) {
            if (i17 >= 3 || (dequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer((bufferInfo = new android.media.MediaCodec.BufferInfo()), java.util.concurrent.TimeUnit.MILLISECONDS.toMicros(10L))) == -1) {
                return -1;
            }
            if (dequeueOutputBuffer == -3) {
                com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "on output buffers changed");
            } else if (dequeueOutputBuffer == -2) {
                outputFormatChange();
            } else {
                if (dequeueOutputBuffer >= 0) {
                    this.mLastPresentationTimeUs = bufferInfo.presentationTimeUs;
                    if ((bufferInfo.flags & 4) != 0) {
                        com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "meet end of stream.");
                        this.mMediaCodec.releaseOutputBuffer(dequeueOutputBuffer, true);
                        return 1;
                    }
                    int handleOutputBuffer = this.mUseByteBuffer ? handleOutputBuffer(dequeueOutputBuffer, bufferInfo) : 0;
                    this.mMediaCodec.releaseOutputBuffer(dequeueOutputBuffer, true);
                    if (this.mExternalSurface != null) {
                        long millis = java.util.concurrent.TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
                        long j17 = this.mNativeVideoDecoderImplAndroid;
                        if (j17 != 0) {
                            nativeOnDecodedFrameWithSurface(j17, millis);
                        }
                    }
                    return handleOutputBuffer;
                }
                com.tencent.liteav.base.util.LiteavLog.d(this.mTAG, "dequeueOutputBuffer get invalid index: %d", java.lang.Integer.valueOf(dequeueOutputBuffer));
            }
            i17++;
        }
    }

    private boolean feedDataToMediaCodec(com.tencent.liteav.videobase.common.EncodedVideoFrame encodedVideoFrame) {
        java.nio.ByteBuffer byteBuffer;
        int i17;
        java.nio.ByteBuffer byteBuffer2;
        if (this.mMediaCodec == null) {
            com.tencent.liteav.base.util.LiteavLog.w(this.mTAG, "MediaCodec is stopped.");
            return false;
        }
        if (encodedVideoFrame == null || (!encodedVideoFrame.isEosFrame && ((byteBuffer2 = encodedVideoFrame.data) == null || byteBuffer2.remaining() == 0))) {
            com.tencent.liteav.base.util.LiteavLog.w(this.mTAG, "receive empty buffer.");
            return true;
        }
        if (!this.mUseAsyncMode) {
            java.nio.ByteBuffer[] inputBuffers = this.mMediaCodec.getInputBuffers();
            if (inputBuffers == null || inputBuffers.length == 0) {
                com.tencent.liteav.base.util.LiteavLog.e(this.mTAG, "get invalid input buffers.");
                return false;
            }
            int dequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            if (dequeueInputBuffer < 0) {
                return false;
            }
            byteBuffer = inputBuffers[dequeueInputBuffer];
            i17 = dequeueInputBuffer;
        } else {
            if (this.mInputBufferQueue.isEmpty()) {
                return false;
            }
            int intValue = this.mInputBufferQueue.poll().intValue();
            byteBuffer = this.mMediaCodec.getInputBuffer(intValue);
            i17 = intValue;
        }
        if (encodedVideoFrame.isEosFrame) {
            com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "feedDataToMediaCodec BUFFER_FLAG_END_OF_STREAM");
            this.mMediaCodec.queueInputBuffer(i17, 0, 0, 0L, 4);
        } else {
            limitMaxDecFrameBufferingInH264Sps(encodedVideoFrame);
            int remaining = encodedVideoFrame.data.remaining();
            byteBuffer.put(encodedVideoFrame.data);
            this.mMediaCodec.queueInputBuffer(i17, 0, remaining, java.util.concurrent.TimeUnit.MILLISECONDS.toMicros(encodedVideoFrame.pts), 0);
        }
        return true;
    }

    private byte[] getSpsData(byte[] bArr, int[] iArr) {
        int i17 = 0;
        while (true) {
            if (i17 + 4 >= bArr.length || (i17 = com.tencent.liteav.videobase.common.EncodedVideoFrame.getNextNALHeaderPos(i17, java.nio.ByteBuffer.wrap(bArr))) < 0) {
                break;
            }
            if ((bArr[i17] & 31) == 7) {
                iArr[0] = i17;
                break;
            }
        }
        int i18 = iArr[0];
        if (i18 < 0) {
            return null;
        }
        int length = bArr.length - i18;
        while (true) {
            int i19 = i18 + 3;
            if (i19 >= bArr.length) {
                break;
            }
            byte b17 = bArr[i18];
            if ((b17 != 0 || bArr[i18 + 1] != 0 || bArr[i18 + 2] != 1) && (b17 != 0 || bArr[i18 + 1] != 0 || bArr[i18 + 2] != 0 || bArr[i19] != 1)) {
                i18++;
            }
        }
        length = i18 - iArr[0];
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, iArr[0], bArr2, 0, length);
        return bArr2;
    }

    private int getSupportedByteBufferColorFormat(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        boolean z17 = false;
        boolean z18 = false;
        for (int i17 : codecCapabilities.colorFormats) {
            if (i17 == 19) {
                z17 = true;
            } else if (i17 == 21) {
                z18 = true;
            }
        }
        if (z17) {
            return 19;
        }
        if (z18) {
            return 21;
        }
        com.tencent.liteav.base.util.LiteavLog.e(this.mTAG, "I420/NV12 not found, formats: " + java.util.Arrays.toString(codecCapabilities.colorFormats));
        return 0;
    }

    private void handleDecoderError(int i17) {
        long j17 = this.mNativeVideoDecoderImplAndroid;
        if (j17 != 0) {
            nativeOnDecodedFrameFailed(j17, i17);
        }
    }

    private int handleOutputBuffer(int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
        int value;
        synchronized (this) {
            java.nio.ByteBuffer outputBuffer = this.mMediaCodec.getOutputBuffer(i17);
            outputBuffer.position(bufferInfo.offset);
            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            outputBuffer.rewind();
            android.media.MediaFormat outputFormat = this.mMediaCodec.getOutputFormat();
            int integer = outputFormat.getInteger("color-format");
            if (integer == 19) {
                value = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.I420.getValue();
            } else {
                if (integer != 21) {
                    com.tencent.liteav.base.util.LiteavLog.e(this.mTAG, "Unsupported color format:".concat(java.lang.String.valueOf(integer)));
                    handleDecoderError(6);
                    return -1;
                }
                value = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.NV12.getValue();
            }
            int i18 = value;
            int integer2 = outputFormat.getInteger("width");
            int integer3 = outputFormat.getInteger("height");
            int abs = (outputFormat.containsKey("crop-right") && outputFormat.containsKey("crop-left")) ? java.lang.Math.abs(outputFormat.getInteger("crop-right") - outputFormat.getInteger("crop-left")) + 1 : integer2;
            int abs2 = (outputFormat.containsKey("crop-bottom") && outputFormat.containsKey("crop-top")) ? java.lang.Math.abs(outputFormat.getInteger("crop-bottom") - outputFormat.getInteger("crop-top")) + 1 : integer3;
            if (outputFormat.containsKey("stride")) {
                integer2 = outputFormat.getInteger("stride");
            }
            int i19 = integer2;
            int integer4 = outputFormat.containsKey("slice-height") ? outputFormat.getInteger("slice-height") : integer3;
            long millis = java.util.concurrent.TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
            long j17 = this.mNativeVideoDecoderImplAndroid;
            if (j17 != 0) {
                nativeOnByteBuffer(j17, i18, outputBuffer, bufferInfo.size, abs, abs2, i19, integer4, millis);
            }
            return 0;
        }
    }

    private boolean initializeSurface(int i17) {
        synchronized (this) {
            try {
                this.mSurfaceTexture = new android.graphics.SurfaceTexture(i17);
                this.mOutputSurface = new android.view.Surface(this.mSurfaceTexture);
                this.mSurfaceTexture.setOnFrameAvailableListener(this);
            } catch (android.view.Surface.OutOfResourcesException e17) {
                com.tencent.liteav.base.util.LiteavLog.e(this.mTAG, "Initialize surface failed: ", e17);
                return false;
            }
        }
        com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "Initialize surface ok.");
        return true;
    }

    private boolean isResolutionSupported(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, int i17, int i18) {
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() < 21 || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return true;
        }
        android.util.Range<java.lang.Integer> supportedWidths = videoCapabilities.getSupportedWidths();
        android.util.Range<java.lang.Integer> supportedHeights = videoCapabilities.getSupportedHeights();
        if (supportedWidths == null || supportedHeights == null) {
            return true;
        }
        if (i17 < supportedWidths.getLower().intValue() || i18 < supportedHeights.getLower().intValue()) {
            com.tencent.liteav.base.util.LiteavLog.e(this.mTAG, "Resolution %dx%d below range: %sx%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), supportedWidths.toString(), supportedHeights.toString());
            return false;
        }
        if (i17 > supportedWidths.getUpper().intValue() || i18 > supportedHeights.getUpper().intValue()) {
            com.tencent.liteav.base.util.LiteavLog.w(this.mTAG, "Resolution %dx%d above range: %sx%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), supportedWidths.toString(), supportedHeights.toString());
        }
        return true;
    }

    public static /* synthetic */ boolean lambda$limitMaxDecFrameBufferingInH264Sps$0(com.tencent.liteav.videoconsumer2.HardwareVideoDecoder2 hardwareVideoDecoder2, int i17, int i18, int i19, int i27) {
        com.tencent.liteav.base.util.LiteavLog.e(hardwareVideoDecoder2.mTAG, "frame cropping flag exist, crop[l:" + i17 + ",r:" + i18 + ",t:" + i19 + ",b:" + i27 + "]");
        hardwareVideoDecoder2.mEnableLimitMaxDecFrameBufferingInH264Sps = false;
        long j17 = hardwareVideoDecoder2.mNativeVideoDecoderImplAndroid;
        if (j17 != 0) {
            hardwareVideoDecoder2.nativeOnFrameFlagCropExist(j17, i17, i18, i19, i27);
        }
        return false;
    }

    private void limitMaxDecFrameBufferingInH264Sps(com.tencent.liteav.videobase.common.EncodedVideoFrame encodedVideoFrame) {
        byte[] a17;
        byte[] bArr;
        java.nio.ByteBuffer b17;
        byte[] bArr2;
        boolean z17;
        byte b18;
        if (encodedVideoFrame.isIDRFrame() && encodedVideoFrame.codecType == com.tencent.liteav.videobase.common.CodecType.H264 && this.mEnableLimitMaxDecFrameBufferingInH264Sps && this.mIsRealTime && (a17 = com.tencent.liteav.videobase.utils.d.a(encodedVideoFrame.data.remaining())) != null) {
            encodedVideoFrame.data.get(a17);
            encodedVideoFrame.data.rewind();
            int[] iArr = {-1};
            byte[] spsData = getSpsData(a17, iArr);
            if (spsData == null || iArr[0] < 0) {
                return;
            }
            try {
                com.tencent.liteav.videoconsumer.a.a aVar = this.mSPSModifier;
                com.tencent.liteav.videoconsumer.a.a.InterfaceC0012a interfaceC0012a = new com.tencent.liteav.videoconsumer.a.a.InterfaceC0012a(this) { // from class: com.tencent.liteav.videoconsumer2.a

                    /* renamed from: a, reason: collision with root package name */
                    private final com.tencent.liteav.videoconsumer2.HardwareVideoDecoder2 f46989a;

                    {
                        this.f46989a = this;
                    }

                    @Override // com.tencent.liteav.videoconsumer.a.a.InterfaceC0012a
                    public final boolean a(int i17, int i18, int i19, int i27) {
                        return com.tencent.liteav.videoconsumer2.HardwareVideoDecoder2.lambda$limitMaxDecFrameBufferingInH264Sps$0(this.f46989a, i17, i18, i19, i27);
                    }
                };
                byte[] bArr3 = new byte[spsData.length];
                int i17 = 0;
                int i18 = 0;
                while (i17 < spsData.length) {
                    if (i17 < spsData.length - 3 && (b18 = spsData[i17]) == 0) {
                        int i19 = i17 + 1;
                        if (spsData[i19] == 0 && spsData[i17 + 2] == 3) {
                            int i27 = i17 + 3;
                            if (spsData[i27] <= 3) {
                                int i28 = i18 + 1;
                                bArr3[i18] = b18;
                                i18 = i28 + 1;
                                bArr3[i28] = spsData[i19];
                                i17 = i27;
                            }
                        }
                    }
                    bArr3[i18] = spsData[i17];
                    i17++;
                    i18++;
                }
                if (i18 != spsData.length) {
                    bArr2 = new byte[i18];
                    java.lang.System.arraycopy(bArr3, 0, bArr2, 0, i18);
                } else {
                    bArr2 = null;
                }
                if (bArr2 != null) {
                    z17 = true;
                } else {
                    bArr2 = spsData;
                    z17 = false;
                }
                byte[] a18 = aVar.a(new java.io.ByteArrayInputStream(bArr2), interfaceC0012a);
                if (a18 != null && z17) {
                    a18 = com.tencent.liteav.videoconsumer.a.a.a(a18);
                }
                bArr = a18;
            } catch (java.lang.Throwable th6) {
                com.tencent.liteav.base.util.LiteavLog.e(this.mTAG, "modify dec buffer error ", th6);
                bArr = null;
            }
            if (bArr == null || (b17 = com.tencent.liteav.videobase.utils.d.b((a17.length - spsData.length) + bArr.length)) == null) {
                return;
            }
            encodedVideoFrame.data = b17;
            int i29 = iArr[0];
            if (i29 > 0) {
                b17.put(a17, 0, i29);
            }
            encodedVideoFrame.data.put(bArr);
            java.nio.ByteBuffer byteBuffer = encodedVideoFrame.data;
            int i37 = iArr[0];
            byteBuffer.put(a17, spsData.length + i37, (a17.length - i37) - spsData.length);
            encodedVideoFrame.data.rewind();
        }
    }

    private native void nativeOnByteBuffer(long j17, int i17, java.nio.ByteBuffer byteBuffer, int i18, int i19, int i27, int i28, int i29, long j18);

    private native void nativeOnDecodedFrameFailed(long j17, int i17);

    private native void nativeOnDecodedFrameWithSurface(long j17, long j18);

    private native void nativeOnFrameAvailable(long j17, long j18);

    private native void nativeOnFrameFlagCropExist(long j17, int i17, int i18, int i19, int i27);

    private native void nativeOnInputBufferAvailable(long j17);

    private native void nativeOnOutputBufferAvailable(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaCodecError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CodecException codecException) {
        if (mediaCodec != this.mMediaCodec) {
            com.tencent.liteav.base.util.LiteavLog.w(this.mTAG, "onMediaCodecOutputBufferAvailable: MediaCodec changed.");
            return;
        }
        com.tencent.liteav.base.util.LiteavLog.e(this.mTAG, "onMediaCodecError: " + codecException.toString());
        handleDecoderError(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaCodecInputBufferAvailable(android.media.MediaCodec mediaCodec, int i17) {
        if (mediaCodec != this.mMediaCodec) {
            com.tencent.liteav.base.util.LiteavLog.w(this.mTAG, "onMediaCodecInputBufferAvailable: MediaCodec changed.");
            return;
        }
        this.mInputBufferQueue.offer(java.lang.Integer.valueOf(i17));
        long j17 = this.mNativeVideoDecoderImplAndroid;
        if (j17 != 0) {
            nativeOnInputBufferAvailable(j17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaCodecOutputBufferAvailable(android.media.MediaCodec mediaCodec, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
        if (mediaCodec != this.mMediaCodec) {
            com.tencent.liteav.base.util.LiteavLog.w(this.mTAG, "onMediaCodecOutputBufferAvailable: MediaCodec changed.");
            return;
        }
        this.mOutputBufferQueue.offer(new android.util.Pair<>(java.lang.Integer.valueOf(i17), bufferInfo));
        long j17 = this.mNativeVideoDecoderImplAndroid;
        if (j17 != 0) {
            nativeOnOutputBufferAvailable(j17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaCodecOutputFormatChanged(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        if (mediaCodec != this.mMediaCodec) {
            com.tencent.liteav.base.util.LiteavLog.w(this.mTAG, "onMediaCodecOutputFormatChanged: MediaCodec changed.");
        } else {
            com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "onMediaCodecOutputFormatChanged: ".concat(java.lang.String.valueOf(mediaFormat)));
        }
    }

    private void outputFormatChange() {
        com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "decode output format changed: ".concat(java.lang.String.valueOf(this.mMediaCodec.getOutputFormat())));
    }

    private void setCallback(android.media.MediaCodec mediaCodec) {
        android.media.MediaCodec.Callback callback = new android.media.MediaCodec.Callback() { // from class: com.tencent.liteav.videoconsumer2.HardwareVideoDecoder2.1
            @Override // android.media.MediaCodec.Callback
            public final void onError(android.media.MediaCodec mediaCodec2, android.media.MediaCodec.CodecException codecException) {
                com.tencent.liteav.videoconsumer2.HardwareVideoDecoder2.this.onMediaCodecError(mediaCodec2, codecException);
            }

            @Override // android.media.MediaCodec.Callback
            public final void onInputBufferAvailable(android.media.MediaCodec mediaCodec2, int i17) {
                com.tencent.liteav.videoconsumer2.HardwareVideoDecoder2.this.onMediaCodecInputBufferAvailable(mediaCodec2, i17);
            }

            @Override // android.media.MediaCodec.Callback
            public final void onOutputBufferAvailable(android.media.MediaCodec mediaCodec2, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
                com.tencent.liteav.videoconsumer2.HardwareVideoDecoder2.this.onMediaCodecOutputBufferAvailable(mediaCodec2, i17, bufferInfo);
            }

            @Override // android.media.MediaCodec.Callback
            public final void onOutputFormatChanged(android.media.MediaCodec mediaCodec2, android.media.MediaFormat mediaFormat) {
                com.tencent.liteav.videoconsumer2.HardwareVideoDecoder2.this.onMediaCodecOutputFormatChanged(mediaCodec2, mediaFormat);
            }
        };
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() < 23) {
            mediaCodec.setCallback(callback);
        } else {
            mediaCodec.setCallback(callback, new android.os.Handler(android.os.Looper.myLooper()));
        }
    }

    private int startInternal() {
        android.view.Surface surface;
        int i17;
        try {
            java.lang.String str = this.mIsHevc ? "video/hevc" : "video/avc";
            android.media.MediaCodec createMediaCodecInternal = createMediaCodecInternal(this.mUseSoftwareDecoder, str);
            this.mMediaCodec = createMediaCodecInternal;
            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = createMediaCodecInternal.getCodecInfo().getCapabilitiesForType(str);
            int i18 = this.mWidth;
            if (i18 > 0 && (i17 = this.mHeight) > 0 && !isResolutionSupported(capabilitiesForType, i18, i17)) {
                return 18;
            }
            com.tencent.liteav.videobase.utils.b bVar = new com.tencent.liteav.videobase.utils.b();
            bVar.f46794c = str;
            bVar.f46792a = this.mWidth;
            bVar.f46793b = this.mHeight;
            bVar.f46796e = capabilitiesForType;
            bVar.f46795d = this.mIsRealTime;
            android.media.MediaFormat a17 = bVar.a();
            if (this.mUseByteBuffer) {
                int supportedByteBufferColorFormat = getSupportedByteBufferColorFormat(capabilitiesForType);
                if (supportedByteBufferColorFormat == 0) {
                    return 6;
                }
                a17.setInteger("color-format", supportedByteBufferColorFormat);
            }
            if (this.mUseAsyncMode) {
                setCallback(this.mMediaCodec);
            }
            com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "Start with media format: ".concat(java.lang.String.valueOf(a17)));
            if (this.mUseByteBuffer) {
                surface = null;
            } else {
                surface = this.mExternalSurface;
                if (surface == null) {
                    surface = this.mOutputSurface;
                }
            }
            if (!configureDecoder(this.mMediaCodec, a17, surface)) {
                return 1;
            }
            this.mIsStarted = true;
            return 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(this.mTAG, "Start MediaCodec failed: ", th6);
            return 1;
        }
    }

    private void uninitializeSurface() {
        com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "Uninitialize surface");
        synchronized (this) {
            android.view.Surface surface = this.mOutputSurface;
            if (surface != null) {
                surface.release();
                this.mOutputSurface = null;
            }
            android.graphics.SurfaceTexture surfaceTexture = this.mSurfaceTexture;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                this.mSurfaceTexture = null;
            }
        }
    }

    public android.media.MediaCodec createMediaCodecInternal(boolean z17, java.lang.String str) {
        if (!z17) {
            return android.media.MediaCodec.createDecoderByType(str);
        }
        for (android.media.MediaCodecInfo mediaCodecInfo : new android.media.MediaCodecList(0).getCodecInfos()) {
            java.lang.String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            if (!mediaCodecInfo.isEncoder()) {
                for (java.lang.String str2 : supportedTypes) {
                    if (str2.contains(str) && com.tencent.liteav.videobase.common.MediaCodecAbility.isSoftOnlyDecoder(mediaCodecInfo)) {
                        com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "Use soft only decoder:%s", mediaCodecInfo.getName());
                        return android.media.MediaCodec.createByCodecName(mediaCodecInfo.getName());
                    }
                }
            }
        }
        return android.media.MediaCodec.createDecoderByType(str);
    }

    public boolean decodeFrame(com.tencent.liteav.videobase.common.EncodedVideoFrame encodedVideoFrame) {
        if (this.mMediaCodec == null) {
            com.tencent.liteav.base.util.LiteavLog.w(this.mTAG, "MediaCodec is stopped.");
            return false;
        }
        if (encodedVideoFrame == null) {
            return true;
        }
        try {
            if (!feedDataToMediaCodec(encodedVideoFrame)) {
                encodedVideoFrame.release();
                return false;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(this.mTAG, "Feed data failed: ", th6);
            handleDecoderError(4);
        }
        encodedVideoFrame.release();
        return true;
    }

    public int drainDecodedFrame() {
        try {
            return this.mUseAsyncMode ? drainDecodedFrameAsyncMode() : drainDecodedFrameSyncMode();
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(this.mTAG, "Drain frame failed: ", th6);
            handleDecoderError(4);
            return -1;
        }
    }

    public int getValidInputBufferCount() {
        return this.mInputBufferQueue.size();
    }

    public int getValidOutputBufferCount() {
        return this.mOutputBufferQueue.size();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        synchronized (this) {
            android.graphics.SurfaceTexture surfaceTexture2 = this.mSurfaceTexture;
            if (surfaceTexture2 != null && surfaceTexture2 == surfaceTexture) {
                long millis = java.util.concurrent.TimeUnit.MICROSECONDS.toMillis(this.mLastPresentationTimeUs);
                long j17 = this.mNativeVideoDecoderImplAndroid;
                if (j17 != 0) {
                    nativeOnFrameAvailable(j17, millis);
                }
            }
        }
    }

    public void resetNativeHandle() {
        this.mNativeVideoDecoderImplAndroid = 0L;
    }

    public void setEnableVui(boolean z17) {
        this.mEnableLimitMaxDecFrameBufferingInH264Sps = z17;
    }

    public int start(int i17) {
        if (this.mIsStarted) {
            return 0;
        }
        com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "Start: texture_id = %d", java.lang.Integer.valueOf(i17));
        if (!this.mUseByteBuffer && !initializeSurface(i17)) {
            return 16;
        }
        int start = start();
        if (start != 0) {
            uninitializeSurface();
        }
        return start;
    }

    public void stop() {
        com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "stop");
        if (this.mIsStarted) {
            destroyMediaCodec(this.mMediaCodec);
            this.mMediaCodec = null;
            uninitializeSurface();
            this.mIsStarted = false;
            this.mExternalSurface = null;
        }
    }

    public float[] updateTexImage() {
        android.graphics.SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture == null) {
            return null;
        }
        try {
            float[] fArr = new float[16];
            surfaceTexture.updateTexImage();
            this.mSurfaceTexture.getTransformMatrix(fArr);
            return fArr;
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.w(this.mThrottlers.a("updateImage"), this.mTAG, "updateTexImage exception: ".concat(java.lang.String.valueOf(th6)), new java.lang.Object[0]);
            return null;
        }
    }

    public int start(android.view.Surface surface) {
        if (this.mIsStarted) {
            return 0;
        }
        com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "Start with surface ".concat(java.lang.String.valueOf(surface)));
        if (surface == null) {
            return 17;
        }
        this.mExternalSurface = surface;
        return start();
    }

    private int start() {
        int startInternal = startInternal();
        if (startInternal != 0 && this.mIsRealTime) {
            destroyMediaCodec(this.mMediaCodec);
            this.mMediaCodec = null;
            this.mIsRealTime = false;
            startInternal = startInternal();
        }
        if (startInternal != 0) {
            destroyMediaCodec(this.mMediaCodec);
            this.mMediaCodec = null;
        }
        return startInternal;
    }
}
