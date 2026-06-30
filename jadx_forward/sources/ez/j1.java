package ez;

/* loaded from: classes12.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f339279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ez.k1 f339281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339282g;

    public j1(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, ez.k1 k1Var, java.lang.String str2) {
        this.f339279d = f9Var;
        this.f339280e = str;
        this.f339281f = k1Var;
        this.f339282g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        long c17 = c01.id.c();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f339279d;
        if (c17 - f9Var.mo78012x3fdd41df() > 1209600000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFeatureService", "ignore report, msgId:" + f9Var.m124847x74d37ac6());
            return;
        }
        java.lang.String str2 = this.f339280e;
        if (this.f339281f.f339284d.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str2))) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
            c6754x4f2fd58c.p("msg_check_talker");
            c6754x4f2fd58c.u(str2);
            c6754x4f2fd58c.f140812h = c6754x4f2fd58c.b("msgTalker", f9Var.Q0(), true);
            c6754x4f2fd58c.f140811g = f9Var.mo78013xfb85f7b0();
            c6754x4f2fd58c.f140813i = f9Var.m124847x74d37ac6();
            c6754x4f2fd58c.f140814j = f9Var.I0();
            c6754x4f2fd58c.r(this.f339282g);
            c6754x4f2fd58c.s(bm5.w.a(f9Var).name());
            c6754x4f2fd58c.t(java.lang.String.valueOf(f9Var.mo78012x3fdd41df()));
            c6754x4f2fd58c.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
            c6754x4f2fd58c.k();
        }
    }
}
