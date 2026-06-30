package fs0;

/* loaded from: classes10.dex */
public final class i extends android.media.MediaCodec.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fs0.l f347788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f347790c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hs0.a f347791d;

    public i(fs0.l lVar, java.lang.String str, long j17, hs0.a aVar) {
        this.f347788a = lVar;
        this.f347789b = str;
        this.f347790c = j17;
        this.f347791d = aVar;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec codec, android.media.MediaCodec.CodecException e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(android.media.MediaCodec codec, int i17) {
        long j17;
        int i18;
        hs0.a aVar = this.f347791d;
        java.lang.String str = this.f347789b;
        fs0.l lVar = this.f347788a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f347794u, "onInputBufferAvailable, index:" + i17 + ", audioId:" + str);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            lVar.f347757n = android.os.SystemClock.elapsedRealtime();
            if (i17 < 0) {
                return;
            }
            wo.i1 i1Var = lVar.f347751h;
            java.nio.ByteBuffer j18 = i1Var != null ? i1Var.j(i17) : null;
            if (j18 != null) {
                j18.clear();
            }
            if (j18 == null) {
                return;
            }
            lVar.f347797x = false;
            if (!hs0.a.c(aVar, j18, 0, 2, null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f347794u, "read sample end");
                lVar.f347797x = true;
            }
            if (lVar.f347797x) {
                j17 = 0;
                i18 = 0;
            } else {
                int i19 = aVar.f366088i;
                j18.position(0);
                long a17 = aVar.a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f347794u, "sampleTime : " + a17 + ", sampleSize:" + i19 + ", audioId:" + str);
                if (i19 < 0 || a17 >= lVar.f347796w * 1000) {
                    lVar.f347797x = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f347794u, "sawInputEOS, audioId:" + str);
                }
                i18 = i19;
                j17 = a17;
            }
            wo.i1 i1Var2 = lVar.f347751h;
            if (i1Var2 != null) {
                i1Var2.p(i17, 0, i18, j17, lVar.f347797x ? 4 : 0);
            }
            if (lVar.f347797x) {
                final yz5.a aVar2 = lVar.f347798y;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(new java.lang.Runnable(aVar2) { // from class: fs0.j

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ yz5.a f347792d;

                    {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar2, "function");
                        this.f347792d = aVar2;
                    }

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f347792d.mo152xb9724478();
                    }
                });
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new java.lang.Runnable(aVar2) { // from class: fs0.j

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ yz5.a f347792d;

                    {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar2, "function");
                        this.f347792d = aVar2;
                    }

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f347792d.mo152xb9724478();
                    }
                }, 3000L);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(lVar.f347794u, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(android.media.MediaCodec codec, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
        java.lang.String str = this.f347789b;
        fs0.l lVar = this.f347788a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferInfo, "bufferInfo");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f347794u, "onOutputBufferAvailable, index:" + i17 + ", bufferInfo:" + bufferInfo + " size:" + bufferInfo.size + ", audioId:" + str);
            if (i17 < 0) {
                wo.i1 i1Var = lVar.f347751h;
                if (i1Var != null) {
                    i1Var.s(i17, false);
                    return;
                }
                return;
            }
            long j17 = bufferInfo.presentationTimeUs;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f347794u, "presentationTimeUs : " + j17);
            long j18 = 1000;
            long j19 = this.f347790c;
            if (j17 < j19 * j18 && (bufferInfo.flags & 4) == 0) {
                wo.i1 i1Var2 = lVar.f347751h;
                if (i1Var2 != null) {
                    i1Var2.s(i17, false);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f347794u, "decoder pts: " + j17 + ", not reach start: " + (j19 * j18) + ", audioId:" + str);
                return;
            }
            if (bufferInfo.size == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f347794u, "decode zero size:" + str + ", zeroCount:" + lVar.f347795v);
                lVar.f347795v = lVar.f347795v + 1;
                wo.i1 i1Var3 = lVar.f347751h;
                if (i1Var3 != null) {
                    i1Var3.s(i17, false);
                    return;
                }
                return;
            }
            wo.i1 i1Var4 = lVar.f347751h;
            lVar.c(i1Var4 != null ? i1Var4.m(i17) : null, bufferInfo);
            wo.i1 i1Var5 = lVar.f347751h;
            if (i1Var5 != null) {
                i1Var5.s(i17, false);
            }
            long j27 = lVar.f347796w;
            if (j27 * j18 != 1 && j17 >= j27 * j18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(lVar.f347794u, "exceed endTimeMs, audioId:" + str);
                lVar.e();
                return;
            }
            if ((bufferInfo.flags & 4) != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f347794u, "receive eos! audioId:" + str);
                lVar.e();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(lVar.f347794u, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec codec, android.media.MediaFormat format) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        fs0.l lVar = this.f347788a;
        lVar.f347752i = format;
        if (format.containsKey("sample-rate")) {
            android.media.MediaFormat mediaFormat = lVar.f347752i;
            int integer = mediaFormat != null ? mediaFormat.getInteger("sample-rate") : 0;
            if (integer > 0) {
                lVar.f347755l = integer;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f347794u, "onOutputFormatChanged:" + lVar.f347752i + ", aacSampleRate:" + lVar.f347755l + ", audioId:" + this.f347789b);
    }
}
