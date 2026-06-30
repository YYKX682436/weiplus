package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes13.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f177389a;

    /* renamed from: b, reason: collision with root package name */
    public final int f177390b;

    /* renamed from: c, reason: collision with root package name */
    public final int f177391c;

    /* renamed from: d, reason: collision with root package name */
    public final android.media.MediaMuxer f177392d;

    /* renamed from: e, reason: collision with root package name */
    public final android.media.MediaCodec f177393e;

    /* renamed from: f, reason: collision with root package name */
    public final android.media.MediaCodec f177394f;

    /* renamed from: g, reason: collision with root package name */
    public final android.media.MediaCodec f177395g;

    /* renamed from: h, reason: collision with root package name */
    public int f177396h;

    /* renamed from: i, reason: collision with root package name */
    public int f177397i;

    /* renamed from: j, reason: collision with root package name */
    public int f177398j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f177399k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f177400l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f177401m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f177402n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Object f177403o;

    /* renamed from: p, reason: collision with root package name */
    public long f177404p;

    /* renamed from: q, reason: collision with root package name */
    public long f177405q;

    public c0(java.lang.String outputFile, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b0 audioInfo, long j17, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputFile, "outputFile");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioInfo, "audioInfo");
        this.f177389a = i17;
        this.f177390b = i18;
        this.f177391c = i19;
        this.f177392d = new android.media.MediaMuxer(outputFile, 0);
        this.f177396h = -1;
        this.f177397i = -1;
        this.f177398j = -1;
        android.media.MediaFormat createVideoFormat = android.media.MediaFormat.createVideoFormat("video/avc", i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createVideoFormat, "createVideoFormat(...)");
        int i27 = audioInfo.f177361a;
        int i28 = audioInfo.f177362b;
        android.media.MediaFormat createAudioFormat = android.media.MediaFormat.createAudioFormat("audio/mp4a-latm", i27, i28);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createAudioFormat, "createAudioFormat(...)");
        android.media.MediaFormat createAudioFormat2 = android.media.MediaFormat.createAudioFormat("audio/mp4a-latm", i27, i28);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createAudioFormat2, "createAudioFormat(...)");
        this.f177403o = new java.lang.Object();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceMuxer", "init recordType:%d, sampleRate:%d, channelCount:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
        createVideoFormat.setInteger("color-format", 2135033992);
        createVideoFormat.setInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, i17 * i18 * 6);
        createVideoFormat.setInteger("frame-rate", 30);
        createVideoFormat.setInteger("i-frame-interval", 1);
        android.media.MediaCodec createEncoderByType = android.media.MediaCodec.createEncoderByType("video/avc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createEncoderByType, "createEncoderByType(...)");
        this.f177393e = createEncoderByType;
        createEncoderByType.configure(createVideoFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
        createEncoderByType.start();
        createAudioFormat.setInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, 48000);
        createAudioFormat.setInteger("aac-profile", 2);
        android.media.MediaCodec createEncoderByType2 = android.media.MediaCodec.createEncoderByType("audio/mp4a-latm");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createEncoderByType2, "createEncoderByType(...)");
        this.f177394f = createEncoderByType2;
        createEncoderByType2.configure(createAudioFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
        createEncoderByType2.start();
        if ((i19 & 4) > 0) {
            createAudioFormat2.setInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, 48000);
            createAudioFormat2.setInteger("aac-profile", 2);
            android.media.MediaCodec createEncoderByType3 = android.media.MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.f177395g = createEncoderByType3;
            if (createEncoderByType3 != null) {
                createEncoderByType3.configure(createAudioFormat2, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
            }
            if (createEncoderByType3 != null) {
                createEncoderByType3.start();
            }
        }
    }

    public final void a(byte[] input, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        synchronized (this.f177403o) {
            if (!this.f177402n) {
                if ((this.f177391c & 2) > 0) {
                    long j18 = this.f177404p;
                    this.f177404p = 1 + j18;
                    if (j18 % 100 == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceMuxer", "encodeAudio");
                    }
                    int dequeueInputBuffer = this.f177394f.dequeueInputBuffer(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                    if (dequeueInputBuffer >= 0) {
                        java.nio.ByteBuffer inputBuffer = this.f177394f.getInputBuffer(dequeueInputBuffer);
                        if (inputBuffer != null) {
                            inputBuffer.clear();
                        }
                        if (inputBuffer != null) {
                            inputBuffer.put(input);
                        }
                        this.f177394f.queueInputBuffer(dequeueInputBuffer, 0, input.length, j17, 0);
                    }
                    android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                    int dequeueOutputBuffer = this.f177394f.dequeueOutputBuffer(bufferInfo, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                    if (dequeueOutputBuffer == -2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceMuxer", "encode audio: new video output format " + this.f177394f.getOutputFormat());
                        this.f177397i = this.f177392d.addTrack(this.f177394f.getOutputFormat());
                        this.f177400l = true;
                        e();
                    }
                    while (dequeueOutputBuffer >= 0) {
                        java.nio.ByteBuffer outputBuffer = this.f177394f.getOutputBuffer(dequeueOutputBuffer);
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
                            android.media.MediaMuxer mediaMuxer = this.f177392d;
                            int i17 = this.f177397i;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(outputBuffer);
                            mediaMuxer.writeSampleData(i17, outputBuffer, bufferInfo);
                        }
                        this.f177394f.releaseOutputBuffer(dequeueOutputBuffer, false);
                        dequeueOutputBuffer = this.f177394f.dequeueOutputBuffer(bufferInfo, 0L);
                    }
                }
            }
        }
    }

    public final void b(byte[] input, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        synchronized (this.f177403o) {
            if (this.f177402n) {
                return;
            }
            if (this.f177395g != null) {
                if ((this.f177391c & 4) > 0) {
                    long j18 = this.f177405q;
                    this.f177405q = 1 + j18;
                    if (j18 % 100 == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceMuxer", "encodeLocalAudio");
                    }
                    android.media.MediaCodec mediaCodec = this.f177395g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mediaCodec);
                    int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                    if (dequeueInputBuffer >= 0) {
                        android.media.MediaCodec mediaCodec2 = this.f177395g;
                        java.nio.ByteBuffer inputBuffer = mediaCodec2 != null ? mediaCodec2.getInputBuffer(dequeueInputBuffer) : null;
                        if (inputBuffer != null) {
                            inputBuffer.clear();
                        }
                        if (inputBuffer != null) {
                            inputBuffer.put(input);
                        }
                        android.media.MediaCodec mediaCodec3 = this.f177395g;
                        if (mediaCodec3 != null) {
                            mediaCodec3.queueInputBuffer(dequeueInputBuffer, 0, input.length, j17, 0);
                        }
                    }
                    android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                    android.media.MediaCodec mediaCodec4 = this.f177395g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mediaCodec4);
                    int dequeueOutputBuffer = mediaCodec4.dequeueOutputBuffer(bufferInfo, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                    if (dequeueOutputBuffer == -2) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("encode audio: new video output format ");
                        android.media.MediaCodec mediaCodec5 = this.f177395g;
                        sb6.append(mediaCodec5 != null ? mediaCodec5.getOutputFormat() : null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceMuxer", sb6.toString());
                        android.media.MediaMuxer mediaMuxer = this.f177392d;
                        android.media.MediaCodec mediaCodec6 = this.f177395g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mediaCodec6);
                        this.f177398j = mediaMuxer.addTrack(mediaCodec6.getOutputFormat());
                        this.f177401m = true;
                        e();
                    }
                    while (dequeueOutputBuffer >= 0) {
                        android.media.MediaCodec mediaCodec7 = this.f177395g;
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
                            android.media.MediaMuxer mediaMuxer2 = this.f177392d;
                            int i17 = this.f177398j;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(outputBuffer);
                            mediaMuxer2.writeSampleData(i17, outputBuffer, bufferInfo);
                        }
                        android.media.MediaCodec mediaCodec8 = this.f177395g;
                        if (mediaCodec8 != null) {
                            mediaCodec8.releaseOutputBuffer(dequeueOutputBuffer, false);
                        }
                        android.media.MediaCodec mediaCodec9 = this.f177395g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mediaCodec9);
                        dequeueOutputBuffer = mediaCodec9.dequeueOutputBuffer(bufferInfo, 0L);
                    }
                }
            }
        }
    }

    public final void c(byte[] input, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        synchronized (this.f177403o) {
            if (!this.f177402n) {
                if ((this.f177391c & 1) > 0) {
                    android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                    int dequeueInputBuffer = this.f177393e.dequeueInputBuffer(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                    if (dequeueInputBuffer >= 0) {
                        java.nio.ByteBuffer inputBuffer = this.f177393e.getInputBuffer(dequeueInputBuffer);
                        if (inputBuffer == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceMuxer", "encode video: Failed to get output buffer for index " + dequeueInputBuffer);
                            return;
                        }
                        inputBuffer.put(input);
                        this.f177393e.queueInputBuffer(dequeueInputBuffer, 0, input.length, j17, 0);
                    }
                    if ((bufferInfo.flags & 4) != 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceMuxer", "encode video: encode buffer stream end");
                    }
                    int dequeueOutputBuffer = this.f177393e.dequeueOutputBuffer(bufferInfo, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                    if (dequeueOutputBuffer == -2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceMuxer", "encode video: new video output format " + this.f177393e.getOutputFormat());
                        this.f177396h = this.f177392d.addTrack(this.f177393e.getOutputFormat());
                        this.f177399k = true;
                        e();
                    }
                    int i17 = dequeueOutputBuffer;
                    while (i17 >= 0) {
                        java.nio.ByteBuffer outputBuffer = this.f177393e.getOutputBuffer(i17);
                        if (outputBuffer == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceMuxer", "encode video: Failed to get output buffer for index " + i17);
                            return;
                        } else {
                            try {
                                this.f177392d.writeSampleData(this.f177396h, outputBuffer, bufferInfo);
                            } catch (java.lang.IllegalStateException e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceMuxer", "writeVideoData returned an error " + e17);
                            }
                            this.f177393e.releaseOutputBuffer(i17, false);
                            i17 = this.f177393e.dequeueOutputBuffer(bufferInfo, 0L);
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceMuxer", "release");
        try {
            synchronized (this.f177403o) {
                this.f177402n = true;
            }
            this.f177393e.stop();
            this.f177393e.release();
            this.f177394f.stop();
            this.f177394f.release();
            android.media.MediaCodec mediaCodec = this.f177395g;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
            android.media.MediaCodec mediaCodec2 = this.f177395g;
            if (mediaCodec2 != null) {
                mediaCodec2.release();
            }
            this.f177392d.stop();
            this.f177392d.release();
        } catch (java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceMuxer", "Error occurs in release " + e17);
        }
    }

    public final void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceMuxer", "tryStartMuxer");
        int i17 = this.f177391c;
        boolean z17 = (i17 & 1) > 0;
        android.media.MediaMuxer mediaMuxer = this.f177392d;
        if (z17 && this.f177399k && (this.f177400l || this.f177401m)) {
            mediaMuxer.start();
            return;
        }
        if (!((i17 & 1) > 0) && this.f177400l && this.f177401m) {
            mediaMuxer.start();
        }
    }
}
