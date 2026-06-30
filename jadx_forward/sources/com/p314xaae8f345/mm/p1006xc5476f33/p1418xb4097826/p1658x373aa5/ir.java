package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class ir extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15370xc796f908 f213938d;

    public ir(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15370xc796f908 c15370xc796f908) {
        this.f213938d = c15370xc796f908;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15370xc796f908 c15370xc796f908 = this.f213938d;
        long j17 = c15370xc796f908.f213076u == 1 ? c15370xc796f908.f213074s : c15370xc796f908.f213075t;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15370xc796f908.f213069n, "showNextText timeInterval: " + j17);
        c15370xc796f908.f213076u = c15370xc796f908.f213076u + 1;
        c15370xc796f908.f213065g = 0.0f;
        c15370xc796f908.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.hr(c15370xc796f908), j17);
    }
}
