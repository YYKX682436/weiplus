package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes3.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f102914d;

    public b0(android.view.View view) {
        this.f102914d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.view.View view = this.f102914d;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationX", -i65.a.f(view.getContext(), com.tencent.mm.R.dimen.f479714d7), 0.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.ALPHA, 0.0f, 1.0f);
        animatorSet.setDuration(350L);
        ta5.h hVar = ta5.h.f416879a;
        ofFloat2.setInterpolator(hVar.b());
        ofFloat.setInterpolator(hVar.b());
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.addListener(new com.tencent.mm.plugin.finder.convert.a0(view));
        animatorSet.start();
    }
}
