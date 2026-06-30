package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class bl0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gl0 f193582d;

    public bl0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gl0 gl0Var) {
        this.f193582d = gl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f193582d.f194245p;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        view.animate().alpha(0.0f).withEndAction(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.al0(view)).start();
    }
}
