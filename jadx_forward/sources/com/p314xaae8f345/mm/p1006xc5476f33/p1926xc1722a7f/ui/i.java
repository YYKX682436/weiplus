package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes11.dex */
public class i extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f233677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.z9 f233678b;

    public i(boolean z17, com.p314xaae8f345.mm.ui.z9 z9Var) {
        this.f233677a = z17;
        this.f233678b = z9Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int n17 = c01.z1.n();
        boolean z17 = this.f233677a;
        int i17 = z17 ? n17 & (-513) : n17 | 512;
        gm0.j1.u().c().w(34, java.lang.Integer.valueOf(i17));
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i17, "", 0, "", 0));
        if (!z17) {
            gm0.j1.b().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u8 u8Var = (com.p314xaae8f345.mm.p2621x8fb0427b.u8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi();
            u8Var.f277798d.mo70514xb06685ab(u8Var.mo145255x88e404c3(), null, null);
            gm0.j1.d().g(new an3.f(2, 0.0f, 0.0f, 0, 0, "", ""));
        }
        com.p314xaae8f345.mm.ui.z9 z9Var = this.f233678b;
        if (z9Var != null) {
            z9Var.mo735xb0dfc7d8(null, null);
        }
    }
}
