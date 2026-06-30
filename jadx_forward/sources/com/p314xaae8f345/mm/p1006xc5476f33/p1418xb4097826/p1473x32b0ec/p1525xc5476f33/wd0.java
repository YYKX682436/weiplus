package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class wd0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f196453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0 f196454e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd0(android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0 de0Var) {
        super(0);
        this.f196453d = viewGroup;
        this.f196454e = de0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f196453d, "alpha", 0.0f, 1.0f);
        h0Var.f391656d = ofFloat;
        ofFloat.setDuration(300L);
        ((android.animation.ObjectAnimator) h0Var.f391656d).setInterpolator(new android.view.animation.DecelerateInterpolator());
        ((android.animation.ObjectAnimator) h0Var.f391656d).addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vd0(h0Var, this.f196454e));
        return (android.animation.ObjectAnimator) h0Var.f391656d;
    }
}
