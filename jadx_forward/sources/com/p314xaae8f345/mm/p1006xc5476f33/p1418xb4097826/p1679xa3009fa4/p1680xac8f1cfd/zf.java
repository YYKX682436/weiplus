package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class zf extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg f218215d;

    public zf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg ggVar) {
        this.f218215d = ggVar;
    }

    @Override // qn5.a
    public void a(android.animation.Animator animator) {
        super.a(animator);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg ggVar = this.f218215d;
        ggVar.m158354x19263085().finish();
        ggVar.m158354x19263085().overridePendingTransition(0, 0);
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        b(animation);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "checkBackPressedAnim onAnimationEnd");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg ggVar = this.f218215d;
        ggVar.m158354x19263085().finish();
        ggVar.m158354x19263085().overridePendingTransition(0, 0);
    }
}
