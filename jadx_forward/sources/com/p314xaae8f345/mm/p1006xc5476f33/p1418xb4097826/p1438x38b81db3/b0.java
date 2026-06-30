package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes3.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184447d;

    public b0(android.view.View view) {
        this.f184447d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.view.View view = this.f184447d;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationX", -i65.a.f(view.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7), 0.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.ALPHA, 0.0f, 1.0f);
        animatorSet.setDuration(350L);
        ta5.h hVar = ta5.h.f498412a;
        ofFloat2.setInterpolator(hVar.b());
        ofFloat.setInterpolator(hVar.b());
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.a0(view));
        animatorSet.start();
    }
}
