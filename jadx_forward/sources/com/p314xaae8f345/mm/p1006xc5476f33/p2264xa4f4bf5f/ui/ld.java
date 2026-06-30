package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes5.dex */
public final class ld extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.nd f255590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f255591e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.nd ndVar, android.widget.FrameLayout frameLayout) {
        super(3);
        this.f255590d = ndVar;
        this.f255591e = frameLayout;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.widget.FrameLayout frameLayout;
        ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.nd ndVar = this.f255590d;
        if (!ndVar.f255663b && (frameLayout = this.f255591e) != null) {
            if (!ndVar.f255662a || ndVar.f255665d) {
                frameLayout.performHapticFeedback(4);
            }
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(frameLayout, "scaleX", 1.0f, 1.2f);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(frameLayout, "scaleY", 1.0f, 1.2f);
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(frameLayout, "alpha", 0.0f, 1.0f);
            frameLayout.setPivotX(frameLayout.getWidth() / 2.0f);
            frameLayout.setPivotY(frameLayout.getHeight() / 2.0f);
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
            animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
            animatorSet.start();
            ndVar.f255663b = true;
        }
        return jz5.f0.f384359a;
    }
}
