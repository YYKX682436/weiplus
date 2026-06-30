package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class p80 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80 f195375d;

    public p80(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80 x80Var) {
        this.f195375d = x80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80 x80Var = this.f195375d;
        x80Var.F.removeCallbacks(x80Var.G);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveScreenClearPlugin", "autoClearScreen business(LiveCommonSlice::class.java).screenClear:" + ((mm2.c1) x80Var.P0(mm2.c1.class)).N1);
        if (((mm2.c1) x80Var.P0(mm2.c1.class)).N1) {
            return;
        }
        x80Var.u1(true);
    }
}
