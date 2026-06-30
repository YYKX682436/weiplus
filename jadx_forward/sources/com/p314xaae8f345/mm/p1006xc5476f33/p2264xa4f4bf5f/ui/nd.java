package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes5.dex */
public final class nd {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f255662a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f255663b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f255664c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f255665d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f255666e;

    public nd(boolean z17) {
        this.f255662a = z17;
    }

    public final void a(android.widget.FrameLayout frameLayout) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(frameLayout, "scaleX", 1.2f, 1.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(frameLayout, "scaleY", 1.2f, 1.0f);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(frameLayout, "alpha", 1.0f, 0.0f);
        frameLayout.setPivotX(frameLayout.getWidth() / 2.0f);
        frameLayout.setPivotY(frameLayout.getHeight() / 2.0f);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        animatorSet.start();
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78, android.widget.FrameLayout frameLayout, boolean z17) {
        kk4.b player;
        if (c18690x34c5bc78 == null || (player = c18690x34c5bc78.getPlayer()) == null) {
            return;
        }
        boolean s17 = ((kk4.v) player).s();
        boolean z18 = this.f255664c;
        if (z17) {
            s17 = s17 && z18;
        }
        if (s17) {
            kk4.b.i(player, false, false, 3, null);
            a(frameLayout);
        }
        this.f255664c = false;
    }
}
