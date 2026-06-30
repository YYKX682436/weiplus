package f65;

/* loaded from: classes12.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341495d;

    public r0(java.lang.String str) {
        this.f341495d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f65.y0 y0Var = f65.y0.f341552a;
        f65.q0 q0Var = f65.q0.f341493d;
        java.lang.String str = this.f341495d;
        r45.qz6 c17 = f65.y0.c(y0Var, str, q0Var);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7000x9f9cdd79 a17 = f65.y0.a(y0Var, c17);
        f65.w[] wVarArr = f65.w.f341530d;
        a17.f143156k = 4L;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f143152g)) {
            a17.k();
            return;
        }
        t21.v2 h17 = t21.d3.h(str);
        if (h17 == null) {
            return;
        }
        pt0.e0 e0Var = pt0.f0.f439742b1;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(h17.f496553r, h17.f496549n);
        if (k17 == null) {
            k17 = e0Var.n(h17.h(), h17.f496549n);
        }
        c17.f465918h = h17.h();
        c17.f465919i = h17.f496548m * 1000;
        i95.m c18 = i95.n0.c(tg3.u0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        c17.f465921n = com.p314xaae8f345.mm.vfs.w6.k(tg3.u0.e8((tg3.u0) c18, k17, bm5.f0.f104104s, this.f341495d, false, 8, null));
        c17.f465920m = com.p314xaae8f345.mm.vfs.w6.k(h17.f());
        c17.f465917g = h17.S != null ? 1L : 2L;
        a17.f143152g = a17.b("ToUsername", c17.f465918h, true);
        a17.f143153h = c17.f465919i;
        a17.f143155j = c17.f465921n;
        a17.f143154i = c17.f465920m;
        a17.f143151f = c17.f465917g;
        a17.k();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c c6423x452b9f7c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c();
        c6423x452b9f7c.f137646e = 7033L;
        c6423x452b9f7c.r(str);
        c6423x452b9f7c.k();
    }
}
