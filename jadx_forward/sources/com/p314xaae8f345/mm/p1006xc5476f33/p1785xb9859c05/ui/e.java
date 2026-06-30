package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o f224320d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o oVar) {
        this.f224320d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o oVar = this.f224320d;
        if (currentTimeMillis - oVar.f224498q < 500) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.d(this));
            return;
        }
        oVar.f224495n = t83.c.e(oVar.f224490i, oVar.f224493l + oVar.f224494m);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c(this, com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.wi().D0(oVar.f224495n)));
    }
}
