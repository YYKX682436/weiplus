package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f222878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f222879e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c1 f222880f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.d1 f222881g;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.d1 d1Var, boolean z17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c1 c1Var) {
        this.f222881g = d1Var;
        this.f222878d = z17;
        this.f222879e = i17;
        this.f222880f = c1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f222878d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c1 c1Var = this.f222880f;
        if (!z17) {
            c1Var.f222783d.setVisibility(4);
            c1Var.f222782c.setVisibility(8);
            return;
        }
        int i17 = this.f222879e;
        if (i17 <= 0) {
            c1Var.f222783d.setVisibility(4);
            c1Var.f222782c.setVisibility(0);
        } else {
            this.f222881g.d(c1Var.f222783d, i17);
            c1Var.f222782c.setVisibility(4);
        }
    }
}
