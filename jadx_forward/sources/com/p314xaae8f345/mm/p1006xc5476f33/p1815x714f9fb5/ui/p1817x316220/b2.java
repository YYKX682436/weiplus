package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1 f226289d;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1 y1Var) {
        this.f226289d = y1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackMapUI", "stopLocateRunnable run() called");
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1 y1Var = this.f226289d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackMapUI", "doPause: hasClickTakeCarBtn:%s", java.lang.Boolean.valueOf(y1Var.f226485x0));
        i11.e eVar = y1Var.f226277w;
        if (eVar != null) {
            ((i11.h) eVar).m(y1Var.f226408J);
        }
        za3.i1 i1Var = y1Var.S;
        if (i1Var != null) {
            i1Var.b();
        }
    }
}
