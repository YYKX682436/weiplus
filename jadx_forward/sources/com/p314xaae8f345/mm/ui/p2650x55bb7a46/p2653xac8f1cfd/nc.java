package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes12.dex */
public class nc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281117d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f281118e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lc f281119f;

    public nc(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.oc ocVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, m11.b0 b0Var, boolean z17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lc lcVar) {
        this.f281117d = f9Var;
        this.f281118e = z17;
        this.f281119f = lcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.l0 Di = m11.b1.Di();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f281117d;
        boolean z07 = Di.z0(f9Var, com.p314xaae8f345.mm.R.C30861xcebc809e.bzt, 1, -1);
        if (z07) {
            mt1.b0.f412724a.r(f9Var.m124847x74d37ac6(), f9Var.Q0());
            if (this.f281118e) {
                ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).nj(f9Var, 1);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(f9Var.m124847x74d37ac6(), f9Var);
            }
            ((v70.b0) ((xs.f1) i95.n0.c(xs.f1.class))).bj(f9Var, "GetImageComponent");
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lc lcVar = this.f281119f;
        if (lcVar != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ic icVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ic) lcVar;
            if (z07) {
                icVar.f280757d.f280817d.f280113d.q().mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hc(icVar));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.GetImageComponent", "createHdThumbDone failed, hd thumb path = " + icVar.f280754a);
        }
    }
}
