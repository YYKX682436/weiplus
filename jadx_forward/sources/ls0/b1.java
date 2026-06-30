package ls0;

/* loaded from: classes10.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f402333a;

    /* renamed from: b, reason: collision with root package name */
    public final long f402334b;

    /* renamed from: c, reason: collision with root package name */
    public final int f402335c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f402336d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h f402337e;

    /* renamed from: f, reason: collision with root package name */
    public int f402338f;

    /* renamed from: g, reason: collision with root package name */
    public final int f402339g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f402340h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f402341i;

    public b1(long j17, long j18, int i17, boolean z17, boolean z18, rs0.q qVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar;
        this.f402333a = j17;
        this.f402334b = j18;
        this.f402335c = i17;
        this.f402336d = z17;
        int i18 = (int) (j18 - j17);
        this.f402339g = i18;
        if (i18 != 0 && !z17) {
            this.f402337e = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h.f243946b.a(z18);
        }
        this.f402340h = false;
        this.f402341i = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.c(z17, z18);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init endTime:");
        sb6.append(j18);
        sb6.append(", startTime:");
        sb6.append(j17);
        sb6.append(", duration:");
        sb6.append(i18);
        sb6.append(", bufId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar2 = this.f402337e;
        sb6.append(hVar2 != null ? java.lang.Integer.valueOf(hVar2.f243948a) : null);
        sb6.append(", enableHevc:");
        sb6.append(z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixMuxerController", sb6.toString());
        if (qVar == null || (hVar = this.f402337e) == null) {
            return;
        }
        rs0.r.f480849a.b(hVar, qVar);
    }

    public static void d(ls0.b1 b1Var, hs0.a aVar, long j17, long j18, int i17, java.lang.Object obj) {
        long j19 = (i17 & 2) != 0 ? b1Var.f402333a : j17;
        long j27 = (i17 & 4) != 0 ? b1Var.f402334b : j18;
        if (aVar == null) {
            b1Var.getClass();
            return;
        }
        if (b1Var.f402340h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MixMuxerController", "writeAudioData, already release");
            return;
        }
        if (aVar.f366091l) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MixMuxerController", "writeAudioData, mediaExtractor already release");
            return;
        }
        java.lang.Object obj2 = null;
        android.media.MediaFormat mediaFormat = aVar.f366085f;
        java.lang.String string = mediaFormat != null ? mediaFormat.getString("mime") : null;
        int i18 = aVar.f366083d;
        if (i18 < 0 || mediaFormat == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixMuxerController", "writeAudioData, startTime: " + j19);
        aVar.f();
        int i19 = 1000;
        if (j19 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixMuxerController", "writeAudioData, seek to startTime:" + b1Var.f402333a);
            aVar.e(((long) 1000) * j19);
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(mediaFormat.containsKey("max-input-size") ? mediaFormat.getInteger("max-input-size") : 1024);
        while (true) {
            try {
                allocateDirect.clear();
                hs0.a.c(aVar, allocateDirect, 0, 2, obj2);
                int i27 = aVar.f366088i;
                if (i27 <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixMuxerController", "muxAudio size = %d. Saw eos.", java.lang.Integer.valueOf(i27));
                    return;
                }
                long a17 = aVar.a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixMuxerController", "aac pts:" + a17);
                long j28 = (long) i19;
                if (a17 >= j27 * j28) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixMuxerController", "pts exceed endTime");
                    return;
                }
                if (aVar.f366081b.c() != i18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MixMuxerController", "track index not match! break");
                    return;
                }
                if (a17 < j28 * j19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixMuxerController", "not reach start");
                } else {
                    allocateDirect.position(0);
                    android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                    bufferInfo.set(0, i27, a17, 0);
                    b1Var.c(allocateDirect, bufferInfo, mediaFormat);
                }
                obj2 = null;
                i19 = 1000;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MixMuxerController", e17, "writeAudioData error", new java.lang.Object[0]);
                return;
            }
        }
    }

    public final int a(hs0.a aVar, java.lang.String muxOuputFilePath, int i17, int i18, boolean z17) {
        int i19;
        int i27;
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(muxOuputFilePath, "muxOuputFilePath");
        if (this.f402340h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MixMuxerController", "output, already release");
            return -1;
        }
        if (this.f402338f <= 0 && !this.f402336d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MixMuxerController", "output, no write h264 frame!!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxResultVideoFrameCountError");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 83L, 1L);
            return -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixMuxerController", "sampelRate:" + i17 + ", channelCount:" + i18);
        if (i17 == 0 || i18 == 0) {
            if (aVar != null) {
                android.media.MediaFormat mediaFormat = aVar.f366085f;
                java.lang.String string = mediaFormat != null ? mediaFormat.getString("mime") : null;
                if (aVar.f366083d >= 0 && mediaFormat != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    int integer = mediaFormat.getInteger("channel-count");
                    int integer2 = mediaFormat.getInteger("sample-rate");
                    i27 = integer;
                    z18 = false;
                    i19 = integer2;
                }
            }
            i19 = i17;
            i27 = i18;
            z18 = true;
        } else {
            i27 = i18;
            i19 = i17;
            z18 = false;
        }
        int i28 = this.f402339g;
        float f17 = (this.f402338f * 1000.0f) / i28;
        boolean z19 = (i27 > 0 || i19 > 0) ? z18 : true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("output, fps:");
        sb6.append(f17);
        sb6.append(", frameCount:");
        sb6.append(this.f402338f);
        sb6.append(", outputBitrate:");
        sb6.append(this.f402335c);
        sb6.append(", finalChannelCount:");
        sb6.append(i27);
        sb6.append(", finalSampleRate:");
        sb6.append(i19);
        sb6.append(", outputPath:");
        sb6.append(muxOuputFilePath);
        sb6.append(", bufId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar = this.f402337e;
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.f243948a) : null);
        sb6.append(", mute:");
        sb6.append(z17);
        sb6.append(", videoMute:");
        sb6.append(z19);
        sb6.append(", mediaExtractor:");
        sb6.append(aVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixMuxerController", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar2 = this.f402337e;
        int b17 = hVar2 != null ? hVar2.b(muxOuputFilePath, java.lang.Math.max(1000, i28), f17, z17, i19, i27) : -1;
        b();
        if (b17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxMuxVideoError");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 84L, 1L);
        }
        return b17;
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixMuxerController", "release");
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar = this.f402337e;
        if (hVar != null) {
            hVar.c();
        }
        this.f402337e = null;
        this.f402340h = true;
    }

    public final void c(java.nio.ByteBuffer encodeData, android.media.MediaCodec.BufferInfo bufferInfo, android.media.MediaFormat mediaFormat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encodeData, "encodeData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferInfo, "bufferInfo");
        if (this.f402340h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MixMuxerController", "writeAACData, already release");
            return;
        }
        if (this.f402341i) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar = this.f402337e;
            if (hVar != null) {
                int i17 = bufferInfo.size;
                long j17 = bufferInfo.presentationTimeUs;
                boolean z17 = false;
                int integer = mediaFormat != null && mediaFormat.containsKey("aac-profile") ? mediaFormat.getInteger("aac-profile") : 2;
                int b17 = mediaFormat != null && mediaFormat.containsKey("sample-rate") ? di3.a.b(mediaFormat.getInteger("sample-rate")) : 4;
                if (mediaFormat != null && mediaFormat.containsKey("channel-count")) {
                    z17 = true;
                }
                hVar.d(encodeData, i17, j17, integer, b17, z17 ? mediaFormat.getInteger("channel-count") : 1);
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("writeAACData: ");
        sb6.append(encodeData.capacity());
        sb6.append(", ");
        sb6.append(bufferInfo.size);
        sb6.append(", bufId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar2 = this.f402337e;
        sb6.append(hVar2 != null ? java.lang.Integer.valueOf(hVar2.f243948a) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixMuxerController", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar3 = this.f402337e;
        if (hVar3 != null) {
            hVar3.d(encodeData, bufferInfo.size, bufferInfo.presentationTimeUs, (r18 & 8) != 0 ? -1 : 0, (r18 & 16) != 0 ? -1 : 0, (r18 & 32) != 0 ? -1 : 0);
        }
    }

    public final void e(java.nio.ByteBuffer encodeData, android.media.MediaCodec.BufferInfo bufferInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encodeData, "encodeData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferInfo, "bufferInfo");
        if (this.f402340h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MixMuxerController", "writeVideoData, already release");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("writeH264Data: ");
        sb6.append(encodeData.capacity());
        sb6.append(", ");
        sb6.append(bufferInfo.size);
        sb6.append(", bufId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar = this.f402337e;
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.f243948a) : null);
        sb6.append(", pts:");
        sb6.append(bufferInfo.presentationTimeUs);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixMuxerController", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar2 = this.f402337e;
        if (hVar2 != null) {
            int i17 = bufferInfo.size;
            long j17 = bufferInfo.presentationTimeUs;
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h.f243947c) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69259x798715d1(hVar2.f243948a, encodeData, i17, j17);
            }
        }
        this.f402338f++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixMuxerController", "frameCount: " + this.f402338f);
    }

    public final void f(long j17) {
        if (this.f402340h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MixMuxerController", "writeVideoDts, already release");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixMuxerController", "writeVideoDts: " + j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar = this.f402337e;
        if (hVar != null) {
            hVar.f(j17);
        }
    }

    public /* synthetic */ b1(long j17, long j18, int i17, boolean z17, boolean z18, rs0.q qVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? 0L : j17, (i18 & 2) != 0 ? 0L : j18, i17, (i18 & 8) != 0 ? false : z17, (i18 & 16) != 0 ? false : z18, (i18 & 32) != 0 ? null : qVar);
    }

    public b1(long j17, long j18, int i17, int i18, int i19, boolean z17, float f17, boolean z18, rs0.q qVar) {
        this(j17, j18, i17, z17, z18, qVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixMuxerController", "secondary create MixMuxerController, outputFps:" + f17 + ", outputVideoWidth:" + i18 + ", outputVideoHeight:" + i19 + ", enableHevc:" + z18);
        boolean c18 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.c(z17, z18);
        this.f402341i = c18;
        int i27 = (int) (j18 - j17);
        this.f402339g = i27;
        if (i27 != 0) {
            if (z17) {
                if (qVar != null) {
                    c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.g.c(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h.f243946b, i18, i19, i17, f17, z18, c18, qVar.f480845a, qVar.f480846b, qVar.f480847c, 0, 0.0f, 0, 0, 7680, null);
                } else {
                    c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.g.c(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h.f243946b, i18, i19, i17, f17, z18, c18, 0, 0, 0, 0, 0.0f, 0, 0, 8128, null);
                }
                this.f402337e = c17;
            } else {
                this.f402337e = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h.f243946b.a(z18);
            }
        }
        this.f402340h = false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("secondary init endTime:");
        sb6.append(j18);
        sb6.append(", startTime:");
        sb6.append(j17);
        sb6.append(", duration:");
        sb6.append(i27);
        sb6.append(", bufId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar = this.f402337e;
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.f243948a) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixMuxerController", sb6.toString());
    }
}
