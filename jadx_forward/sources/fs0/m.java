package fs0;

/* loaded from: classes10.dex */
public final class m extends fs0.g {

    /* renamed from: x, reason: collision with root package name */
    public final android.media.MediaCodec.BufferInfo f347799x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f347800y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f347801z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j17, long j18, hs0.a mediaExtractorWrapper, android.view.Surface surface, int i17, boolean z17, yz5.l lVar) {
        super(j17, j18, mediaExtractorWrapper, surface, i17, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaExtractorWrapper, "mediaExtractorWrapper");
        this.f347799x = new android.media.MediaCodec.BufferInfo();
        this.f347800y = "MicroMsg.MediaCodecTransDecoder";
        try {
            this.f347770g = mediaExtractorWrapper.f366084e;
            java.lang.String b17 = mediaExtractorWrapper.b();
            if (r26.i0.p("video/dolby-vision", b17, true) && !ph3.f.f()) {
                b17 = "video/hevc";
            }
            wo.i1 c17 = wo.i1.c(b17);
            this.f347769f = c17;
            c17.a(this.f347770g, surface, null, 0);
            wo.i1 i1Var = this.f347769f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var);
            i1Var.x();
            if (lVar != null) {
                lVar.mo146xb9724478(this);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f347800y, e17, "create decoder error:" + e17.getMessage(), new java.lang.Object[0]);
            throw new java.lang.IllegalStateException("init decoder error");
        }
    }

    @Override // fs0.g
    public void e() {
        boolean z17;
        do {
            z17 = true;
            try {
                synchronized (this.f347777n) {
                    if (this.f347778o) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347800y, "inputDecoder already finished");
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347800y, "inputDecoder");
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                wo.i1 i1Var = this.f347769f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var);
                java.nio.ByteBuffer[] k17 = i1Var.k();
                if (k17 == null) {
                    z17 = false;
                } else {
                    wo.i1 i1Var2 = this.f347769f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var2);
                    int f17 = i1Var2.f(60000L);
                    for (int i17 = 0; f17 < 0 && i17 < 15; i17++) {
                        if (f()) {
                            break;
                        }
                        wo.i1 i1Var3 = this.f347769f;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var3);
                        f17 = i1Var3.f(60000L);
                    }
                    this.f347801z = false;
                    if (f17 >= 0) {
                        java.nio.ByteBuffer byteBuffer = k17[f17];
                        byteBuffer.clear();
                        hs0.a aVar = this.f347766c;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
                        if (hs0.a.c(aVar, byteBuffer, 0, 2, null)) {
                            long a17 = this.f347766c.a();
                            int i18 = this.f347766c.f366088i;
                            byteBuffer.position(0);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347800y, "sampleTime : " + a17 + " us");
                            if (i18 < 0 || a17 >= this.f347765b * 1000) {
                                this.f347801z = true;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347800y, "sawInputEOS");
                            }
                            wo.i1 i1Var4 = this.f347769f;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var4);
                            i1Var4.p(f17, 0, i18, a17, this.f347801z ? 4 : 0);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347800y, "read sample end");
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f347800y, "input buffer not available");
                    }
                    boolean f18 = f();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347800y, "inputDecoder cost " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                    if (f18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347800y, "drainDecoder eos");
                    } else {
                        z17 = this.f347801z;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f347800y, e17, "inputDecoder error", new java.lang.Object[0]);
                if (this.f347782s) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxDecodeFrameFailed");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 76L, 1L);
                }
            }
        } while (!z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347800y, "inputDecoder end");
        try {
            synchronized (this.f347777n) {
                if (this.f347778o) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347800y, "drainDecoder already finished");
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347800y, "sendDecoderEOS");
            wo.i1 i1Var5 = this.f347769f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var5);
            java.nio.ByteBuffer[] k18 = i1Var5.k();
            wo.i1 i1Var6 = this.f347769f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var6);
            int f19 = i1Var6.f(60000L);
            while (true) {
                if (f19 >= 0) {
                    if (f19 >= 0) {
                        java.nio.ByteBuffer byteBuffer2 = k18[f19];
                        byteBuffer2.clear();
                        hs0.a aVar2 = this.f347766c;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar2);
                        hs0.a.c(aVar2, byteBuffer2, 0, 2, null);
                        long a18 = this.f347766c.a();
                        byteBuffer2.position(0);
                        if (f19 >= 0) {
                            wo.i1 i1Var7 = this.f347769f;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var7);
                            i1Var7.p(f19, 0, 0, a18, 4);
                        }
                    }
                    f();
                } else {
                    if (f()) {
                        break;
                    }
                    wo.i1 i1Var8 = this.f347769f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var8);
                    f19 = i1Var8.f(60000L);
                }
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f347800y, e18, "sendDecoderEOS error", new java.lang.Object[0]);
        }
        c();
        yz5.a aVar3 = this.f347772i;
        if (aVar3 != null) {
            aVar3.mo152xb9724478();
        }
    }

    public final boolean f() {
        yz5.l lVar;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347800y, "drainDecoder");
            synchronized (this.f347777n) {
                if (this.f347778o) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347800y, "drainDecoder already finished");
                }
            }
            wo.i1 i1Var = this.f347769f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var);
            int g17 = i1Var.g(this.f347799x, 100L);
            while (true) {
                if (g17 == -1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347800y, "no output from decoder available, break");
                    break;
                }
                if (g17 == -3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347800y, "decoder output buffers changed");
                    break;
                }
                if (g17 == -2) {
                    wo.i1 i1Var2 = this.f347769f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var2);
                    this.f347770g = i1Var2.o();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347800y, "decoder output format changed: " + this.f347770g);
                    android.media.MediaFormat mediaFormat = this.f347770g;
                    if (mediaFormat != null && (lVar = this.f347773j) != null) {
                        lVar.mo146xb9724478(mediaFormat);
                    }
                } else {
                    if (g17 < 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f347800y, "unexpected result from decoder.dequeueOutputBuffer: " + g17);
                        break;
                    }
                    long j17 = this.f347799x.presentationTimeUs;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347800y, "presentationTimeUs : " + j17);
                    long j18 = (long) 1000;
                    if (j17 < this.f347764a * j18 && (this.f347799x.flags & 4) == 0) {
                        wo.i1 i1Var3 = this.f347769f;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var3);
                        i1Var3.s(g17, false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347800y, "decoder pts: " + j17 + ", not reach start: " + (this.f347764a * j18));
                        return false;
                    }
                    android.media.MediaCodec.BufferInfo bufferInfo = this.f347799x;
                    if (bufferInfo.size != 0) {
                        b(g17, bufferInfo);
                        long j19 = this.f347765b;
                        if (j19 * j18 != 1 && j17 >= j19 * j18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f347800y, "exceed endTimeMs");
                            return true;
                        }
                        if ((this.f347799x.flags & 4) == 0) {
                            return false;
                        }
                        try {
                            wo.i1 i1Var4 = this.f347769f;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var4);
                            i1Var4.y();
                            wo.i1 i1Var5 = this.f347769f;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var5);
                            i1Var5.q();
                        } catch (java.lang.Exception unused) {
                        }
                        return true;
                    }
                    wo.i1 i1Var6 = this.f347769f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var6);
                    i1Var6.s(g17, false);
                    wo.i1 i1Var7 = this.f347769f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var7);
                    g17 = i1Var7.g(this.f347799x, 100L);
                    if (g17 < 0) {
                        break;
                    }
                }
            }
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f347800y, e17, "drainDecoder error", new java.lang.Object[0]);
            if (this.f347782s) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxDecodeFrameFailed");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 76L, 1L);
            }
            return false;
        }
    }
}
