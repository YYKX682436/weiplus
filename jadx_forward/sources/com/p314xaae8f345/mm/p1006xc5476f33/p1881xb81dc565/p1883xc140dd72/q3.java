package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f231283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 f231284e;

    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var, int i17) {
        this.f231284e = i4Var;
        this.f231283d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = this.f231284e;
        int i17 = this.f231283d;
        if (i17 == 101) {
            i4Var.f231186x0 = 1;
            i4Var.f231175p0 = false;
            java.lang.String str = i4Var.f231189y0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 c0Var = i4Var.f231156f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w b17 = c0Var.b(str);
            ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(i4Var.f231162i.a((int) i4Var.f231166l1, c0Var.f231053d, c0Var.f231057h, c0Var.f231051b, i4Var.f231189y0, b17 != null ? b17.f231374b : null, null), new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.p3(this));
            long j17 = c0Var.f231051b;
        } else if (i17 == 102) {
            i4Var.f231186x0 = 2;
            i4Var.f231175p0 = false;
        } else if (i17 != 104) {
            i4Var.f231186x0 = 0;
        } else {
            i4Var.f231186x0 = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231118c.m120013xfec52689(i4Var.T1 ? 1 : 0, i4Var.f231175p0 ? 1 : 0, i4Var.f231186x0);
    }
}
