package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o f182427d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o oVar) {
        this.f182427d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o oVar = this.f182427d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = oVar.f182563q;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        oVar.f182563q = null;
    }
}
