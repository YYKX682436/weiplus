package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class k3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f197968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f197969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14303x54da38a2 f197970f;

    public k3(int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14303x54da38a2 c14303x54da38a2) {
        this.f197968d = i17;
        this.f197969e = i18;
        this.f197970f = c14303x54da38a2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14303x54da38a2.c(this.f197970f, this.f197968d, this.f197969e, 1.0f);
    }
}
