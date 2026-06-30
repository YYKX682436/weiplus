package com.google.android.material.appbar;

/* loaded from: classes15.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f44351a = {android.R.attr.stateListAnimator};

    public static void a(android.view.View view, float f17) {
        int integer = view.getResources().getInteger(com.tencent.mm.R.integer.f487805d);
        android.animation.StateListAnimator stateListAnimator = new android.animation.StateListAnimator();
        long j17 = integer;
        stateListAnimator.addState(new int[]{android.R.attr.enabled, com.tencent.mm.R.attr.f478407j0, -2130969928}, android.animation.ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j17));
        stateListAnimator.addState(new int[]{android.R.attr.enabled}, android.animation.ObjectAnimator.ofFloat(view, "elevation", f17).setDuration(j17));
        stateListAnimator.addState(new int[0], android.animation.ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
