package ze5;

/* loaded from: classes9.dex */
public final class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f553344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f553346f;

    public a2(ot0.q qVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        this.f553344d = qVar;
        this.f553345e = f9Var;
        this.f553346f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f553345e;
        ot0.q qVar = this.f553344d;
        if (qVar == null) {
            qVar = ot0.q.v(f9Var.j());
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6853x996853e3 c6853x996853e3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6853x996853e3();
        c6853x996853e3.f141717d = this.f553346f;
        c6853x996853e3.f141718e = qVar != null ? qVar.f430215m : 0L;
        java.lang.String str = qVar != null ? qVar.f430223o : null;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.lang.String lowerCase = str.toLowerCase();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        c6853x996853e3.f141719f = c6853x996853e3.b("FileExt", lowerCase, true);
        c6853x996853e3.f141720g = c6853x996853e3.b("ChatName", f9Var.Q0(), true);
        rt0.b bVar = qVar != null ? (rt0.b) qVar.y(rt0.b.class) : null;
        c6853x996853e3.f141721h = c6853x996853e3.b("MsgSvrId", java.lang.String.valueOf(bVar != null ? java.lang.Long.valueOf(bVar.f480905b) : null), true);
        c6853x996853e3.f141722i = 1L;
        c6853x996853e3.k();
    }
}
