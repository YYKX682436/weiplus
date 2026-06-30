package gs0;

/* loaded from: classes10.dex */
public final class p extends gs0.b {

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f356538j;

    /* renamed from: k, reason: collision with root package name */
    public final wo.i1 f356539k;

    /* renamed from: l, reason: collision with root package name */
    public long f356540l;

    /* renamed from: m, reason: collision with root package name */
    public final android.os.HandlerThread f356541m;

    /* renamed from: n, reason: collision with root package name */
    public final android.os.Handler f356542n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(es0.d videoCodecConfig, yz5.l lVar) {
        super(videoCodecConfig, lVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoCodecConfig, "videoCodecConfig");
        this.f356538j = "MicroMsg.MediaCodecTransEncoderAsync";
        wo.i1 b17 = wo.i1.b(videoCodecConfig.f337851h);
        this.f356539k = b17;
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("MediaCodecTransEncoder_encodeThread", 5);
        this.f356541m = a17;
        gs0.m mVar = new gs0.m(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransEncoderAsync", "MediaCodecTransEncoderAsync start");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(985L, 165L, 1L, false);
        g0Var.mo68477x336bdfd8(985L, 143L, 1L, false);
        b17.a(videoCodecConfig.b(), null, null, 1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_REMUX_THROW_ERROR_INT_SYNC, -1), 1)) {
            dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "remuxer 抛出异常", 0).show();
            throw new java.lang.IllegalStateException("leex test error");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransEncoderAsync", "MediaCodecTransEncoderAsync end");
        g0Var.mo68477x336bdfd8(985L, 144L, 1L, false);
        boolean c17 = fp.h.c(23);
        android.media.MediaCodec mediaCodec = b17.f529252a;
        if (c17) {
            a17.start();
            android.os.Handler handler = new android.os.Handler(a17.getLooper());
            this.f356542n = handler;
            mediaCodec.setCallback(mVar, handler);
        } else {
            mediaCodec.setCallback(mVar);
        }
        android.view.Surface e17 = b17.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "createInputSurface(...)");
        this.f356505b = e17;
        b17.x();
        if (lVar != null) {
            lVar.mo146xb9724478(this);
        }
    }

    @Override // gs0.b
    public void a(long j17) {
        if (0 == this.f356540l) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f356540l = android.os.SystemClock.elapsedRealtime();
        }
    }

    @Override // gs0.b
    public void b() {
        android.os.Handler handler = this.f356542n;
        try {
            if (handler == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("encodeHandler");
                throw null;
            }
            handler.removeCallbacksAndMessages(null);
            if (handler != null) {
                handler.post(new gs0.n(this));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("encodeHandler");
                throw null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f356538j, e17, "finishEncode " + hashCode() + " \n signalEndOfInputStream error:" + e17.getMessage(), new java.lang.Object[0]);
        }
    }

    @Override // gs0.b
    public long d() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return android.os.SystemClock.elapsedRealtime() - this.f356540l;
    }

    @Override // gs0.b
    public void f() {
        try {
            android.os.Handler handler = this.f356542n;
            if (handler != null) {
                handler.post(new gs0.o(this));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("encodeHandler");
                throw null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f356538j, "release encoder error " + e17.getMessage());
        }
    }
}
