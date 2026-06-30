package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252;

/* loaded from: classes15.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f125884a = {android.R.attr.stateListAnimator};

    public static void a(android.view.View view, float f17) {
        int integer = view.getResources().getInteger(com.p314xaae8f345.mm.R.C30862x74b5813e.f569338d);
        android.animation.StateListAnimator stateListAnimator = new android.animation.StateListAnimator();
        long j17 = integer;
        stateListAnimator.addState(new int[]{android.R.attr.enabled, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559940j0, -2130969928}, android.animation.ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j17));
        stateListAnimator.addState(new int[]{android.R.attr.enabled}, android.animation.ObjectAnimator.ofFloat(view, "elevation", f17).setDuration(j17));
        stateListAnimator.addState(new int[0], android.animation.ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
