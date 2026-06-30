package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes13.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f95856a;

    /* renamed from: b, reason: collision with root package name */
    public final int f95857b;

    /* renamed from: c, reason: collision with root package name */
    public final int f95858c;

    /* renamed from: d, reason: collision with root package name */
    public final android.media.MediaMuxer f95859d;

    /* renamed from: e, reason: collision with root package name */
    public final android.media.MediaCodec f95860e;

    /* renamed from: f, reason: collision with root package name */
    public final android.media.MediaCodec f95861f;

    /* renamed from: g, reason: collision with root package name */
    public final android.media.MediaCodec f95862g;

    /* renamed from: h, reason: collision with root package name */
    public int f95863h;

    /* renamed from: i, reason: collision with root package name */
    public int f95864i;

    /* renamed from: j, reason: collision with root package name */
    public int f95865j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f95866k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f95867l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f95868m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f95869n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Object f95870o;

    /* renamed from: p, reason: collision with root package name */
    public long f95871p;

    /* renamed from: q, reason: collision with root package name */
    public long f95872q;

    public c0(java.lang.String outputFile, int i17, int i18, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b0 audioInfo, long j17, int i19) {
        kotlin.jvm.internal.o.g(outputFile, "outputFile");
        kotlin.jvm.internal.o.g(audioInfo, "audioInfo");
        this.f95856a = i17;
        this.f95857b = i18;
        this.f95858c = i19;
        this.f95859d = new android.media.MediaMuxer(outputFile, 0);
        this.f95863h = -1;
        this.f95864i = -1;
        this.f95865j = -1;
        android.media.MediaFormat createVideoFormat = android.media.MediaFormat.createVideoFormat("video/avc", i17, i18);
        kotlin.jvm.internal.o.f(createVideoFormat, "createVideoFormat(...)");
        int i27 = audioInfo.f95828a;
        int i28 = audioInfo.f95829b;
        android.media.MediaFormat createAudioFormat = android.media.MediaFormat.createAudioFormat("audio/mp4a-latm", i27, i28);
        kotlin.jvm.internal.o.f(createAudioFormat, "createAudioFormat(...)");
        android.media.MediaFormat createAudioFormat2 = android.media.MediaFormat.createAudioFormat("audio/mp4a-latm", i27, i28);
        kotlin.jvm.internal.o.f(createAudioFormat2, "createAudioFormat(...)");
        this.f95870o = new java.lang.Object();
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceMuxer", "init recordType:%d, sampleRate:%d, channelCount:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
        createVideoFormat.setInteger("color-format", 2135033992);
        createVideoFormat.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, i17 * i18 * 6);
        createVideoFormat.setInteger("frame-rate", 30);
        createVideoFormat.setInteger("i-frame-interval", 1);
        android.media.MediaCodec createEncoderByType = android.media.MediaCodec.createEncoderByType("video/avc");
        kotlin.jvm.internal.o.f(createEncoderByType, "createEncoderByType(...)");
        this.f95860e = createEncoderByType;
        createEncoderByType.configure(createVideoFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
        createEncoderByType.start();
        createAudioFormat.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, 48000);
        createAudioFormat.setInteger("aac-profile", 2);
        android.media.MediaCodec createEncoderByType2 = android.media.MediaCodec.createEncoderByType("audio/mp4a-latm");
        kotlin.jvm.internal.o.f(createEncoderByType2, "createEncoderByType(...)");
        this.f95861f = createEncoderByType2;
        createEncoderByType2.configure(createAudioFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
        createEncoderByType2.start();
        if ((i19 & 4) > 0) {
            createAudioFormat2.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, 48000);
            createAudioFormat2.setInteger("aac-profile", 2);
            android.media.MediaCodec createEncoderByType3 = android.media.MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.f95862g = createEncoderByType3;
            if (createEncoderByType3 != null) {
                createEncoderByType3.configure(createAudioFormat2, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
            }
            if (createEncoderByType3 != null) {
                createEncoderByType3.start();
            }
        }
    }

    public final void a(byte[] input, long j17) {
        kotlin.jvm.internal.o.g(input, "input");
        synchronized (this.f95870o) {
            if (!this.f95869n) {
                if ((this.f95858c & 2) > 0) {
                    long j18 = this.f95871p;
                    this.f95871p = 1 + j18;
                    if (j18 % 100 == 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceMuxer", "encodeAudio");
                    }
                    int dequeueInputBuffer = this.f95861f.dequeueInputBuffer(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                    if (dequeueInputBuffer >= 0) {
                        java.nio.ByteBuffer inputBuffer = this.f95861f.getInputBuffer(dequeueInputBuffer);
                        if (inputBuffer != null) {
                            inputBuffer.clear();
                        }
                        if (inputBuffer != null) {
                            inputBuffer.put(input);
                        }
                        this.f95861f.queueInputBuffer(dequeueInputBuffer, 0, input.length, j17, 0);
                    }
                    android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                    int dequeueOutputBuffer = this.f95861f.dequeueOutputBuffer(bufferInfo, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                    if (dequeueOutputBuffer == -2) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceMuxer", "encode audio: new video output format " + this.f95861f.getOutputFormat());
                        this.f95864i = this.f95859d.addTrack(this.f95861f.getOutputFormat());
                        this.f95867l = true;
                        e();
                    }
                    while (dequeueOutputBuffer >= 0) {
                        java.nio.ByteBuffer outputBuffer = this.f95861f.getOutputBuffer(dequeueOutputBuffer);
                        if ((bufferInfo.flags & 2) != 0) {
                            bufferInfo.size = 0;
                        }
                        if (bufferInfo.size != 0) {
                            if (outputBuffer != null) {
                                outputBuffer.position(bufferInfo.offset);
                            }
                            if (outputBuffer != null) {
                                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                            }
                            android.media.MediaMuxer mediaMuxer = this.f95859d;
                            int i17 = this.f95864i;
                            kotlin.jvm.internal.o.d(outputBuffer);
                            mediaMuxer.writeSampleData(i17, outputBuffer, bufferInfo);
                        }
                        this.f95861f.releaseOutputBuffer(dequeueOutputBuffer, false);
                        dequeueOutputBuffer = this.f95861f.dequeueOutputBuffer(bufferInfo, 0L);
                    }
                }
            }
        }
    }

    public final void b(byte[] input, long j17) {
        kotlin.jvm.internal.o.g(input, "input");
        synchronized (this.f95870o) {
            if (this.f95869n) {
                return;
            }
            if (this.f95862g != null) {
                if ((this.f95858c & 4) > 0) {
                    long j18 = this.f95872q;
                    this.f95872q = 1 + j18;
                    if (j18 % 100 == 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceMuxer", "encodeLocalAudio");
                    }
                    android.media.MediaCodec mediaCodec = this.f95862g;
                    kotlin.jvm.internal.o.d(mediaCodec);
                    int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                    if (dequeueInputBuffer >= 0) {
                        android.media.MediaCodec mediaCodec2 = this.f95862g;
                        java.nio.ByteBuffer inputBuffer = mediaCodec2 != null ? mediaCodec2.getInputBuffer(dequeueInputBuffer) : null;
                        if (inputBuffer != null) {
                            inputBuffer.clear();
                        }
                        if (inputBuffer != null) {
                            inputBuffer.put(input);
                        }
                        android.media.MediaCodec mediaCodec3 = this.f95862g;
                        if (mediaCodec3 != null) {
                            mediaCodec3.queueInputBuffer(dequeueInputBuffer, 0, input.length, j17, 0);
                        }
                    }
                    android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                    android.media.MediaCodec mediaCodec4 = this.f95862g;
                    kotlin.jvm.internal.o.d(mediaCodec4);
                    int dequeueOutputBuffer = mediaCodec4.dequeueOutputBuffer(bufferInfo, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                    if (dequeueOutputBuffer == -2) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("encode audio: new video output format ");
                        android.media.MediaCodec mediaCodec5 = this.f95862g;
                        sb6.append(mediaCodec5 != null ? mediaCodec5.getOutputFormat() : null);
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceMuxer", sb6.toString());
                        android.media.MediaMuxer mediaMuxer = this.f95859d;
                        android.media.MediaCodec mediaCodec6 = this.f95862g;
                        kotlin.jvm.internal.o.d(mediaCodec6);
                        this.f95865j = mediaMuxer.addTrack(mediaCodec6.getOutputFormat());
                        this.f95868m = true;
                        e();
                    }
                    while (dequeueOutputBuffer >= 0) {
                        android.media.MediaCodec mediaCodec7 = this.f95862g;
                        java.nio.ByteBuffer outputBuffer = mediaCodec7 != null ? mediaCodec7.getOutputBuffer(dequeueOutputBuffer) : null;
                        if ((bufferInfo.flags & 2) != 0) {
                            bufferInfo.size = 0;
                        }
                        if (bufferInfo.size != 0) {
                            if (outputBuffer != null) {
                                outputBuffer.position(bufferInfo.offset);
                            }
                            if (outputBuffer != null) {
                                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                            }
                            android.media.MediaMuxer mediaMuxer2 = this.f95859d;
                            int i17 = this.f95865j;
                            kotlin.jvm.internal.o.d(outputBuffer);
                            mediaMuxer2.writeSampleData(i17, outputBuffer, bufferInfo);
                        }
                        android.media.MediaCodec mediaCodec8 = this.f95862g;
                        if (mediaCodec8 != null) {
                            mediaCodec8.releaseOutputBuffer(dequeueOutputBuffer, false);
                        }
                        android.media.MediaCodec mediaCodec9 = this.f95862g;
                        kotlin.jvm.internal.o.d(mediaCodec9);
                        dequeueOutputBuffer = mediaCodec9.dequeueOutputBuffer(bufferInfo, 0L);
                    }
                }
            }
        }
    }

    public final void c(byte[] input, long j17) {
        kotlin.jvm.internal.o.g(input, "input");
        synchronized (this.f95870o) {
            if (!this.f95869n) {
                if ((this.f95858c & 1) > 0) {
                    android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                    int dequeueInputBuffer = this.f95860e.dequeueInputBuffer(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                    if (dequeueInputBuffer >= 0) {
                        java.nio.ByteBuffer inputBuffer = this.f95860e.getInputBuffer(dequeueInputBuffer);
                        if (inputBuffer == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceMuxer", "encode video: Failed to get output buffer for index " + dequeueInputBuffer);
                            return;
                        }
                        inputBuffer.put(input);
                        this.f95860e.queueInputBuffer(dequeueInputBuffer, 0, input.length, j17, 0);
                    }
                    if ((bufferInfo.flags & 4) != 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceMuxer", "encode video: encode buffer stream end");
                    }
                    int dequeueOutputBuffer = this.f95860e.dequeueOutputBuffer(bufferInfo, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                    if (dequeueOutputBuffer == -2) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceMuxer", "encode video: new video output format " + this.f95860e.getOutputFormat());
                        this.f95863h = this.f95859d.addTrack(this.f95860e.getOutputFormat());
                        this.f95866k = true;
                        e();
                    }
                    int i17 = dequeueOutputBuffer;
                    while (i17 >= 0) {
                        java.nio.ByteBuffer outputBuffer = this.f95860e.getOutputBuffer(i17);
                        if (outputBuffer == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceMuxer", "encode video: Failed to get output buffer for index " + i17);
                            return;
                        } else {
                            try {
                                this.f95859d.writeSampleData(this.f95863h, outputBuffer, bufferInfo);
                            } catch (java.lang.IllegalStateException e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceMuxer", "writeVideoData returned an error " + e17);
                            }
                            this.f95860e.releaseOutputBuffer(i17, false);
                            i17 = this.f95860e.dequeueOutputBuffer(bufferInfo, 0L);
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceMuxer", "release");
        try {
            synchronized (this.f95870o) {
                this.f95869n = true;
            }
            this.f95860e.stop();
            this.f95860e.release();
            this.f95861f.stop();
            this.f95861f.release();
            android.media.MediaCodec mediaCodec = this.f95862g;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
            android.media.MediaCodec mediaCodec2 = this.f95862g;
            if (mediaCodec2 != null) {
                mediaCodec2.release();
            }
            this.f95859d.stop();
            this.f95859d.release();
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceMuxer", "Error occurs in release " + e17);
        }
    }

    public final void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceMuxer", "tryStartMuxer");
        int i17 = this.f95858c;
        boolean z17 = (i17 & 1) > 0;
        android.media.MediaMuxer mediaMuxer = this.f95859d;
        if (z17 && this.f95866k && (this.f95867l || this.f95868m)) {
            mediaMuxer.start();
            return;
        }
        if (!((i17 & 1) > 0) && this.f95867l && this.f95868m) {
            mediaMuxer.start();
        }
    }
}
