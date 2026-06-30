package com.tencent.liteav.videoproducer2;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class HardwareVideoEncoder2 {
    private com.tencent.liteav.videobase.egl.EGLCore mEGLCore;
    private android.view.Surface mInputSurface;
    private long mNativeHandler;
    private final com.tencent.liteav.videoproducer.encoder.VideoEncodeParams mParams;
    private com.tencent.liteav.videobase.frame.h mPixelFrameRenderer;
    private com.tencent.liteav.videoproducer2.HWEncoderServerConfig mServerConfig;
    private java.lang.Object mSharedContext;
    private com.tencent.liteav.videoproducer.encoder.b mSurfaceInputVideoEncoder;
    private java.lang.String mTAG;
    private java.lang.String mTraceId;
    private final com.tencent.liteav.base.util.Size mSurfaceSize = new com.tencent.liteav.base.util.Size(0, 0);
    private final java.util.concurrent.atomic.AtomicBoolean mNeedRestart = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final android.os.Bundle mSessionStates = new android.os.Bundle();
    private final com.tencent.liteav.base.b.b mThrottlers = new com.tencent.liteav.base.b.b();
    private long mPreFrameTimeStamp = 0;
    private final com.tencent.liteav.videoproducer.encoder.e.a mVideoEncoderListener = new com.tencent.liteav.videoproducer.encoder.e.a() { // from class: com.tencent.liteav.videoproducer2.HardwareVideoEncoder2.1
        @Override // com.tencent.liteav.videoproducer.encoder.e.a
        public final void a() {
            com.tencent.liteav.videoproducer2.HardwareVideoEncoder2.this.mNeedRestart.set(true);
        }

        @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.b
        public final void onBitrateModeUpdated(com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode bitrateMode) {
            com.tencent.liteav.videoproducer2.HardwareVideoEncoder2 hardwareVideoEncoder2 = com.tencent.liteav.videoproducer2.HardwareVideoEncoder2.this;
            hardwareVideoEncoder2.nativeOnBitrateModeUpdated(hardwareVideoEncoder2.mNativeHandler, bitrateMode.mValue);
        }

        @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.b
        public final void onEncodedFail(com.tencent.liteav.videobase.videobase.e.a aVar) {
            com.tencent.liteav.videobase.videobase.e.a aVar2 = com.tencent.liteav.videobase.videobase.e.a.ERR_CODE_NONE;
            com.tencent.liteav.videoproducer2.HardwareVideoEncoder2.this.notifyEncodeFail();
        }

        @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.b
        public final synchronized void onEncodedNAL(com.tencent.liteav.videobase.common.EncodedVideoFrame encodedVideoFrame, boolean z17) {
            if (com.tencent.liteav.videoproducer2.HardwareVideoEncoder2.this.mNativeHandler == 0 || z17) {
                com.tencent.liteav.base.util.LiteavLog.d(com.tencent.liteav.videoproducer2.HardwareVideoEncoder2.this.mTAG, "onEncodedNAL mNativeHandler=%d,isEos=%b", java.lang.Long.valueOf(com.tencent.liteav.videoproducer2.HardwareVideoEncoder2.this.mNativeHandler), java.lang.Boolean.valueOf(z17));
                return;
            }
            com.tencent.liteav.videoproducer2.HardwareVideoEncoder2 hardwareVideoEncoder2 = com.tencent.liteav.videoproducer2.HardwareVideoEncoder2.this;
            long j17 = hardwareVideoEncoder2.mNativeHandler;
            java.nio.ByteBuffer byteBuffer = encodedVideoFrame.data;
            int i17 = encodedVideoFrame.nalType.mValue;
            int i18 = encodedVideoFrame.profileType.mValue;
            int i19 = encodedVideoFrame.codecType.mValue;
            int i27 = encodedVideoFrame.rotation;
            long j18 = encodedVideoFrame.dts;
            long j19 = encodedVideoFrame.pts;
            long j27 = encodedVideoFrame.gopIndex;
            long j28 = encodedVideoFrame.gopFrameIndex;
            long j29 = encodedVideoFrame.frameIndex;
            long j37 = encodedVideoFrame.refFrameIndex;
            int i28 = encodedVideoFrame.width;
            int i29 = encodedVideoFrame.height;
            java.lang.Integer num = encodedVideoFrame.svcInfo;
            hardwareVideoEncoder2.nativeOnEncodedNAL(j17, encodedVideoFrame, byteBuffer, i17, i18, i19, i27, j18, j19, j27, j28, j29, j37, i28, i29, num != null, num == null ? 0 : num.intValue());
        }
    };

    public HardwareVideoEncoder2(long j17, java.lang.String str, com.tencent.liteav.videoproducer.encoder.VideoEncodeParams videoEncodeParams) {
        this.mTraceId = str;
        this.mTAG = str + "HardwareVideoEncoder2_" + hashCode();
        this.mNativeHandler = j17;
        this.mParams = videoEncodeParams;
    }

    public static com.tencent.liteav.videobase.frame.PixelFrame createPixelFrameByTexture(int i17, int i18, int i19, int i27, long j17, int i28, boolean z17, boolean z18, int i29, java.lang.Object obj) {
        int i37 = com.tencent.liteav.videobase.base.GLConstants.a.TEXTURE_2D.mValue;
        com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.RGBA.getValue();
        com.tencent.liteav.videobase.frame.PixelFrame pixelFrame = new com.tencent.liteav.videobase.frame.PixelFrame(i17, i18, 0, i19, i27);
        pixelFrame.setMirrorHorizontal(z17);
        pixelFrame.setMirrorVertical(z18);
        pixelFrame.setTextureId(i29);
        pixelFrame.setGLContext(obj);
        pixelFrame.setRotation(com.tencent.liteav.base.util.k.a(i28));
        pixelFrame.setTimestamp(j17);
        return pixelFrame;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[Catch: d -> 0x00b9, TryCatch #0 {d -> 0x00b9, blocks: (B:6:0x0005, B:8:0x0017, B:11:0x0020, B:14:0x0028, B:15:0x0037, B:17:0x0044, B:18:0x004a, B:20:0x0058, B:21:0x0061, B:23:0x007d, B:24:0x009e, B:28:0x002c, B:31:0x0034), top: B:5:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[Catch: d -> 0x00b9, TryCatch #0 {d -> 0x00b9, blocks: (B:6:0x0005, B:8:0x0017, B:11:0x0020, B:14:0x0028, B:15:0x0037, B:17:0x0044, B:18:0x004a, B:20:0x0058, B:21:0x0061, B:23:0x007d, B:24:0x009e, B:28:0x002c, B:31:0x0034), top: B:5:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d A[Catch: d -> 0x00b9, TryCatch #0 {d -> 0x00b9, blocks: (B:6:0x0005, B:8:0x0017, B:11:0x0020, B:14:0x0028, B:15:0x0037, B:17:0x0044, B:18:0x004a, B:20:0x0058, B:21:0x0061, B:23:0x007d, B:24:0x009e, B:28:0x002c, B:31:0x0034), top: B:5:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void drawFrameToInputSurface(com.tencent.liteav.videobase.frame.PixelFrame r7) {
        /*
            r6 = this;
            com.tencent.liteav.videobase.egl.EGLCore r0 = r6.mEGLCore
            if (r0 != 0) goto L5
            return
        L5:
            r0.makeCurrent()     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            com.tencent.liteav.videobase.frame.PixelFrame r0 = new com.tencent.liteav.videobase.frame.PixelFrame     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            r0.<init>(r7)     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            com.tencent.liteav.base.util.k r7 = r0.getRotation()     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            com.tencent.liteav.base.util.k r1 = com.tencent.liteav.base.util.k.ROTATION_90     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            r2 = 1
            r3 = 0
            if (r7 == r1) goto L2c
            com.tencent.liteav.base.util.k r7 = r0.getRotation()     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            com.tencent.liteav.base.util.k r1 = com.tencent.liteav.base.util.k.ROTATION_270     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            if (r7 != r1) goto L20
            goto L2c
        L20:
            boolean r7 = r0.isMirrorVertical()     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            if (r7 != 0) goto L27
            goto L28
        L27:
            r2 = r3
        L28:
            r0.setMirrorVertical(r2)     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            goto L37
        L2c:
            boolean r7 = r0.isMirrorHorizontal()     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            if (r7 != 0) goto L33
            goto L34
        L33:
            r2 = r3
        L34:
            r0.setMirrorHorizontal(r2)     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
        L37:
            com.tencent.liteav.base.util.Size r7 = r6.mSurfaceSize     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            int r1 = r7.width     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            int r7 = r7.height     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            com.tencent.liteav.videobase.utils.OpenGlUtils.glViewport(r3, r3, r1, r7)     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            com.tencent.liteav.videobase.frame.h r7 = r6.mPixelFrameRenderer     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            if (r7 == 0) goto L4a
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r1 = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.CENTER_CROP     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            r2 = 0
            r7.a(r0, r1, r2)     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
        L4a:
            com.tencent.liteav.videoproducer.encoder.b r7 = r6.mSurfaceInputVideoEncoder     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            long r1 = r0.getTimestamp()     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            java.util.Deque<java.lang.Long> r3 = r7.f47146i     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            boolean r3 = r3.isEmpty()     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            if (r3 == 0) goto L61
            java.util.concurrent.atomic.AtomicLong r3 = r7.f47147j     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            r3.set(r4)     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
        L61:
            java.util.Deque<java.lang.Long> r3 = r7.f47146i     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            r3.addLast(r1)     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            com.tencent.liteav.base.util.CustomHandler r7 = r7.f47140c     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            r1 = 10
            r2 = 10
            r7.sendEmptyMessageDelayed(r1, r2)     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            long r1 = r0.getTimestamp()     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            long r3 = r6.mPreFrameTimeStamp     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 >= 0) goto L9e
            java.lang.String r7 = r6.mTAG     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            java.lang.String r2 = "timestamp is not increase. pre: "
            r1.<init>(r2)     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            long r2 = r6.mPreFrameTimeStamp     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            r1.append(r2)     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            java.lang.String r2 = ", cur: "
            r1.append(r2)     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            long r2 = r0.getTimestamp()     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            r1.append(r2)     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            java.lang.String r1 = r1.toString()     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            com.tencent.liteav.base.util.LiteavLog.e(r7, r1)     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
        L9e:
            long r1 = r0.getTimestamp()     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            r6.mPreFrameTimeStamp = r1     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            com.tencent.liteav.videobase.egl.EGLCore r7 = r6.mEGLCore     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            long r2 = r0.getTimestamp()     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            long r0 = r1.toNanos(r2)     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            r7.setPresentationTime(r0)     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            com.tencent.liteav.videobase.egl.EGLCore r7 = r6.mEGLCore     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            r7.swapBuffers()     // Catch: com.tencent.liteav.videobase.egl.d -> Lb9
            return
        Lb9:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VideoEncode: swapBuffer error, EGLCode:"
            r0.<init>(r1)
            int r1 = r7.mErrorCode
            r0.append(r1)
            java.lang.String r1 = " message:"
            r0.append(r1)
            java.lang.String r1 = r7.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.liteav.base.b.b r1 = r6.mThrottlers
            java.lang.String r2 = "EncodeFrameError"
            com.tencent.liteav.base.b.a r1 = r1.a(r2)
            java.lang.String r2 = r6.mTAG
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "makeCurrent failed. error = "
            java.lang.String r0 = r3.concat(r0)
            com.tencent.liteav.base.util.LiteavLog.e(r1, r2, r0, r7)
            r6.notifyEncodeFail()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer2.HardwareVideoEncoder2.drawFrameToInputSurface(com.tencent.liteav.videobase.frame.PixelFrame):void");
    }

    public static java.lang.Object getCurrentContext() {
        return com.tencent.liteav.videobase.utils.OpenGlUtils.getCurrentContext();
    }

    private com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig getServerVideoProducerConfig(com.tencent.liteav.videoproducer2.HWEncoderServerConfig hWEncoderServerConfig) {
        com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig serverVideoProducerConfig = new com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig();
        serverVideoProducerConfig.setHardwareEncodeType(hWEncoderServerConfig.getHardwareEncodeType());
        serverVideoProducerConfig.setHardwareEncoderHighProfileEnable(hWEncoderServerConfig.getHardwareEncoderHighProfileEnable());
        serverVideoProducerConfig.setHardwareEncoderHighProfileSupport(hWEncoderServerConfig.getHardwareEncoderHighProfileSupport());
        java.lang.Boolean isHardwareEncoderBitrateModeCBRSupported = hWEncoderServerConfig.isHardwareEncoderBitrateModeCBRSupported();
        if (isHardwareEncoderBitrateModeCBRSupported != null) {
            serverVideoProducerConfig.setHardwareEncoderBitrateModeCBRSupported(isHardwareEncoderBitrateModeCBRSupported.booleanValue());
        }
        return serverVideoProducerConfig;
    }

    private boolean initOpenGLComponents(java.lang.Object obj, android.view.Surface surface) {
        if (surface == null) {
            com.tencent.liteav.base.util.LiteavLog.w(this.mThrottlers.a("NoSurface"), this.mTAG, "init opengl: surface is null.", new java.lang.Object[0]);
            return false;
        }
        com.tencent.liteav.base.util.LiteavLog.d(this.mThrottlers.a("initGL"), this.mTAG, "initOpenGLComponents", new java.lang.Object[0]);
        com.tencent.liteav.videobase.egl.EGLCore eGLCore = new com.tencent.liteav.videobase.egl.EGLCore();
        this.mEGLCore = eGLCore;
        try {
            com.tencent.liteav.base.util.Size size = this.mSurfaceSize;
            eGLCore.initialize(obj, surface, size.width, size.height);
            this.mSharedContext = obj;
            com.tencent.liteav.base.util.Size size2 = this.mSurfaceSize;
            this.mPixelFrameRenderer = new com.tencent.liteav.videobase.frame.h(size2.width, size2.height);
            return true;
        } catch (com.tencent.liteav.videobase.egl.d e17) {
            com.tencent.liteav.base.util.LiteavLog.e(this.mThrottlers.a("initGLError"), this.mTAG, "create EGLCore failed. error = ".concat(java.lang.String.valueOf("VideoEncode: create EGLCore failed, EGLCode:" + e17.mErrorCode + " message:" + e17.getMessage())), e17);
            notifyStartEncodedFail();
            this.mEGLCore = null;
            return false;
        }
    }

    public static boolean isInUIThread() {
        return android.os.Looper.getMainLooper() == android.os.Looper.myLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnBitrateModeUpdated(long j17, int i17);

    private native void nativeOnEncodedFail(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnEncodedNAL(long j17, com.tencent.liteav.videobase.common.EncodedVideoFrame encodedVideoFrame, java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int i27, long j18, long j19, long j27, long j28, long j29, long j37, int i28, int i29, boolean z17, int i37);

    private native void nativeOnStartEncodedFail(long j17);

    private boolean restart() {
        com.tencent.liteav.base.util.LiteavLog.d(this.mTAG, "reStart");
        stop();
        return start();
    }

    private boolean start() {
        if (this.mSurfaceInputVideoEncoder != null) {
            return this.mInputSurface != null;
        }
        com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "Start hw video encoder. %s", this.mParams);
        com.tencent.liteav.videoproducer.encoder.b bVar = new com.tencent.liteav.videoproducer.encoder.b(this.mSessionStates, new com.tencent.liteav.videobase.videobase.d(), this.mTraceId);
        this.mSurfaceInputVideoEncoder = bVar;
        bVar.f47140c = new com.tencent.liteav.base.util.CustomHandler(android.os.Looper.myLooper()) { // from class: com.tencent.liteav.videoproducer.encoder.b.1
            public AnonymousClass1(android.os.Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public final void handleMessage(android.os.Message message) {
                super.handleMessage(message);
                if (message.what == 10) {
                    com.tencent.liteav.videoproducer.encoder.b.this.c();
                }
            }
        };
        this.mSurfaceInputVideoEncoder.a(getServerVideoProducerConfig(this.mServerConfig));
        com.tencent.liteav.videoproducer.encoder.b bVar2 = this.mSurfaceInputVideoEncoder;
        com.tencent.liteav.videoproducer.encoder.VideoEncodeParams videoEncodeParams = this.mParams;
        com.tencent.liteav.videoproducer.encoder.e.a aVar = this.mVideoEncoderListener;
        com.tencent.liteav.base.util.LiteavLog.d(bVar2.f47138a, "start");
        bVar2.f47142e = aVar;
        android.view.Surface a17 = bVar2.a(videoEncodeParams);
        com.tencent.liteav.base.util.LiteavLog.i(bVar2.f47138a, "startCodecInternal success");
        com.tencent.liteav.base.util.Size size = new com.tencent.liteav.base.util.Size(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, 1280);
        com.tencent.liteav.videoproducer.encoder.VideoEncodeParams videoEncodeParams2 = bVar2.f47143f;
        if (videoEncodeParams2 != null) {
            size.set(videoEncodeParams2.width, videoEncodeParams2.height);
        }
        android.util.Pair pair = new android.util.Pair(a17, size);
        this.mInputSurface = (android.view.Surface) pair.first;
        this.mSurfaceSize.set((com.tencent.liteav.base.util.Size) pair.second);
        if (this.mInputSurface != null) {
            return true;
        }
        notifyStartEncodedFail();
        return false;
    }

    private void stop() {
        uninitOpenGLComponents();
        android.view.Surface surface = this.mInputSurface;
        if (surface != null) {
            surface.release();
            this.mInputSurface = null;
        }
        com.tencent.liteav.videoproducer.encoder.b bVar = this.mSurfaceInputVideoEncoder;
        if (bVar != null) {
            com.tencent.liteav.base.util.LiteavLog.i(bVar.f47138a, "stop");
            bVar.b();
            bVar.a();
            this.mSurfaceInputVideoEncoder.a();
            this.mSurfaceInputVideoEncoder = null;
        }
    }

    private void uninitOpenGLComponents() {
        if (this.mEGLCore == null) {
            return;
        }
        com.tencent.liteav.base.util.LiteavLog.d(this.mThrottlers.a("uninitGL"), this.mTAG, "uninitOpenGLComponents", new java.lang.Object[0]);
        try {
            this.mEGLCore.makeCurrent();
            com.tencent.liteav.videobase.frame.h hVar = this.mPixelFrameRenderer;
            if (hVar != null) {
                hVar.a();
                this.mPixelFrameRenderer = null;
            }
        } catch (com.tencent.liteav.videobase.egl.d e17) {
            com.tencent.liteav.base.util.LiteavLog.e(this.mThrottlers.a("unintGLError"), this.mTAG, "makeCurrent failed.", e17);
        }
        com.tencent.liteav.videobase.egl.EGLCore.destroy(this.mEGLCore);
        this.mEGLCore = null;
    }

    public void encodeFrame(com.tencent.liteav.videobase.frame.PixelFrame pixelFrame) {
        if (pixelFrame == null) {
            return;
        }
        if (!this.mNeedRestart.getAndSet(false) || restart()) {
            if (this.mSurfaceInputVideoEncoder != null || start()) {
                pixelFrame.getGLContext();
                if (!com.tencent.liteav.base.util.CommonUtil.equals(pixelFrame.getGLContext(), this.mSharedContext)) {
                    uninitOpenGLComponents();
                }
                if (this.mEGLCore != null || initOpenGLComponents(pixelFrame.getGLContext(), this.mInputSurface)) {
                    this.mSurfaceInputVideoEncoder.c();
                    drawFrameToInputSurface(pixelFrame);
                }
            }
        }
    }

    public synchronized void notifyEncodeFail() {
        long j17 = this.mNativeHandler;
        if (j17 != 0) {
            nativeOnEncodedFail(j17);
        }
    }

    public synchronized void notifyStartEncodedFail() {
        long j17 = this.mNativeHandler;
        if (j17 != 0) {
            nativeOnStartEncodedFail(j17);
        }
    }

    public synchronized void release() {
        com.tencent.liteav.base.util.LiteavLog.d(this.mTAG, "release");
        this.mNativeHandler = 0L;
        stop();
    }

    public void requestKeyFrame() {
        com.tencent.liteav.videoproducer.encoder.b bVar = this.mSurfaceInputVideoEncoder;
        if (bVar != null) {
            bVar.d();
        }
    }

    public void setBitrate(int i17) {
        android.media.MediaCodec mediaCodec;
        com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "SetBitrate ".concat(java.lang.String.valueOf(i17)));
        this.mParams.bitrate = i17;
        com.tencent.liteav.videoproducer.encoder.b bVar = this.mSurfaceInputVideoEncoder;
        if (bVar == null) {
            return;
        }
        com.tencent.liteav.videoproducer.encoder.VideoEncodeParams videoEncodeParams = bVar.f47143f;
        if (videoEncodeParams == null) {
            com.tencent.liteav.base.util.LiteavLog.w(bVar.f47138a, "encoder not started yet. set bitrate to " + i17 + " kbps will not take effect.");
            return;
        }
        if (videoEncodeParams.bitrate != i17) {
            com.tencent.liteav.base.util.LiteavLog.i(bVar.f47138a, "set bitrate to " + i17 + " kbps");
            boolean z17 = false;
            if (i17 < bVar.f47143f.bitrate) {
                if (bVar.f47139b.getBoolean("need_restart_when_down_bitrate", false)) {
                    z17 = true;
                } else {
                    bVar.a(i17);
                }
            }
            bVar.f47143f.bitrate = i17;
            if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() < 19 || (mediaCodec = bVar.f47141d) == null) {
                return;
            }
            if (!z17) {
                bVar.a(mediaCodec, i17);
                return;
            }
            bVar.f47140c.removeCallbacks(bVar.f47148k);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - bVar.f47144g;
            if (elapsedRealtime >= java.util.concurrent.TimeUnit.SECONDS.toMillis(2L)) {
                bVar.f47148k.run();
            } else {
                bVar.f47140c.postDelayed(bVar.f47148k, 2000 - elapsedRealtime);
            }
        }
    }

    public void setHWEncoderServerConfig(com.tencent.liteav.videoproducer2.HWEncoderServerConfig hWEncoderServerConfig) {
        this.mServerConfig = hWEncoderServerConfig;
        com.tencent.liteav.videoproducer.encoder.b bVar = this.mSurfaceInputVideoEncoder;
        if (bVar != null) {
            bVar.a(getServerVideoProducerConfig(hWEncoderServerConfig));
        }
    }

    public void signalEndOfStream() {
        final com.tencent.liteav.videoproducer.encoder.b bVar = this.mSurfaceInputVideoEncoder;
        if (bVar != null) {
            com.tencent.liteav.base.util.LiteavLog.i(bVar.f47138a, "signalEndOfStream");
            android.media.MediaCodec mediaCodec = bVar.f47141d;
            if (mediaCodec != null) {
                try {
                    mediaCodec.signalEndOfInputStream();
                } catch (java.lang.Throwable th6) {
                    com.tencent.liteav.base.util.LiteavLog.e(bVar.f47138a, "signalEndOfStream failed.", th6);
                }
            }
            if (bVar.f47145h == null) {
                com.tencent.liteav.base.util.t tVar = new com.tencent.liteav.base.util.t(android.os.Looper.myLooper(), new com.tencent.liteav.base.util.t.a(bVar) { // from class: com.tencent.liteav.videoproducer.encoder.d

                    /* renamed from: a, reason: collision with root package name */
                    private final com.tencent.liteav.videoproducer.encoder.b f47166a;

                    {
                        this.f47166a = bVar;
                    }

                    @Override // com.tencent.liteav.base.util.t.a
                    public final void onTimeout() {
                        this.f47166a.c();
                    }
                });
                bVar.f47145h = tVar;
                tVar.a(30);
            }
        }
    }
}
