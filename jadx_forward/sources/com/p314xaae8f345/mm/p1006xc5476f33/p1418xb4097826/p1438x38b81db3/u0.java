package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f186190e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.b1 f186191f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(in5.s0 s0Var, so2.u1 u1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.b1 b1Var) {
        super(2);
        this.f186189d = s0Var;
        this.f186190e = u1Var;
        this.f186191f = b1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator alpha2;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator listener2;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        in5.s0 s0Var = this.f186189d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k);
        if (c15196x85976f5f != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f.X(c15196x85976f5f, hc2.o0.s(this.f186190e), false, false, 0, 12, null);
        }
        this.f186191f.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.p(com.p314xaae8f345.mm.R.id.g99);
        if (booleanValue) {
            android.view.ViewPropertyAnimator animate = c22699x3dcdb352.animate();
            if (animate != null) {
                animate.cancel();
            }
            c22699x3dcdb352.setVisibility(0);
            c22699x3dcdb352.setAlpha(0.0f);
            android.view.ViewPropertyAnimator animate2 = c22699x3dcdb352.animate();
            if (animate2 != null && (alpha2 = animate2.alpha(1.0f)) != null && (duration2 = alpha2.setDuration(200L)) != null && (listener2 = duration2.setListener(null)) != null) {
                listener2.start();
            }
        } else if (c22699x3dcdb352.getVisibility() == 0) {
            android.view.ViewPropertyAnimator animate3 = c22699x3dcdb352.animate();
            if (animate3 != null) {
                animate3.cancel();
            }
            c22699x3dcdb352.setAlpha(1.0f);
            android.view.ViewPropertyAnimator animate4 = c22699x3dcdb352.animate();
            if (animate4 != null && (alpha = animate4.alpha(0.0f)) != null && (duration = alpha.setDuration(200L)) != null && (listener = duration.setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.a1(c22699x3dcdb352))) != null) {
                listener.start();
            }
        } else {
            c22699x3dcdb352.setVisibility(4);
        }
        return jz5.f0.f384359a;
    }
}
