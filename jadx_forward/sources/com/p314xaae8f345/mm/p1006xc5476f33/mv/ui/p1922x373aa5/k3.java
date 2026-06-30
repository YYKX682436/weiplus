package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes15.dex */
public final class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.l3 f233419d;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.l3 l3Var) {
        this.f233419d = l3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.l3 l3Var = this.f233419d;
        l3Var.f233427d = 2;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.m3 m3Var = l3Var.f233424a;
        float f17 = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.n3) m3Var).f233443a.f233236f + ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.n3) m3Var).f233443a.f233238h;
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.n3) m3Var).f233443a.f233239i.startScroll(0, 0, (int) f17, 0, (int) ((f17 / l3Var.f233425b) * 1000));
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.n3) l3Var.f233424a).f233443a.postInvalidate();
    }
}
