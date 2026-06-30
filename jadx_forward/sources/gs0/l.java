package gs0;

/* loaded from: classes10.dex */
public final class l extends gs0.b {

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f356527j;

    /* renamed from: k, reason: collision with root package name */
    public final wo.i1 f356528k;

    /* renamed from: l, reason: collision with root package name */
    public final long f356529l;

    /* renamed from: m, reason: collision with root package name */
    public final android.media.MediaCodec.BufferInfo f356530m;

    /* renamed from: n, reason: collision with root package name */
    public final android.os.HandlerThread f356531n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f356532o;

    /* renamed from: p, reason: collision with root package name */
    public long f356533p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f356534q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(es0.d videoCodecConfig, yz5.l lVar) {
        super(videoCodecConfig, lVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoCodecConfig, "videoCodecConfig");
        this.f356527j = "MicroMsg.MediaCodecTransEncoder";
        this.f356529l = 50000L;
        this.f356530m = new android.media.MediaCodec.BufferInfo();
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("MediaCodecTransEncoder_encodeThread", 0);
        this.f356531n = a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 163L, 1L, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransEncoder", "create mp4encoder " + hashCode());
        wo.i1 b17 = wo.i1.b(videoCodecConfig.f337851h);
        this.f356528k = b17;
        b17.a(videoCodecConfig.b(), null, null, 1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_RECORD_THROW_ERROR_INT_SYNC, -1), 1)) {
            dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "remuxer 抛出异常", 0).show();
            throw new java.lang.IllegalStateException("leex test error");
        }
        android.view.Surface e17 = b17.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "createInputSurface(...)");
        this.f356505b = e17;
        b17.x();
        a17.start();
        this.f356532o = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17.getLooper());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransEncoder", "create mp4encoder finish " + hashCode());
        if (lVar != null) {
            lVar.mo146xb9724478(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0137, code lost:
    
        if (r8.f356510g == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0139, code lost:
    
        if (r0 < 3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x013b, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8.f356527j, "isFinishEncode && timeout >= 3");
        r8.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(gs0.l r8) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs0.l.g(gs0.l):void");
    }

    @Override // gs0.b
    public void a(long j17) {
        if (0 == this.f356533p) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f356533p = android.os.SystemClock.elapsedRealtime();
        }
        this.f356532o.mo50293x3498a0(new gs0.i(this));
    }

    @Override // gs0.b
    public void b() {
        if (this.f356534q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f356527j, "has received eos");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f356532o;
        n3Var.mo50302x6b17ad39(null);
        n3Var.mo50293x3498a0(new gs0.j(this));
    }

    @Override // gs0.b
    public long d() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return android.os.SystemClock.elapsedRealtime() - this.f356533p;
    }

    @Override // gs0.b
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f356527j, "try to release " + hashCode());
        this.f356532o.mo50293x3498a0(new gs0.k(this));
    }

    /* renamed from: finalize */
    public final void m132143xd764dc1e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f356527j, "finalize");
        if (this.f356511h) {
            return;
        }
        this.f356528k.q();
    }
}
