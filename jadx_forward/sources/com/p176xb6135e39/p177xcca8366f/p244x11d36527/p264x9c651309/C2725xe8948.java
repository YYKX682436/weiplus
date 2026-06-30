package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309;

/* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior */
/* loaded from: classes13.dex */
public class C2725xe8948 extends com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.AbstractC2723x75b6e8af {

    /* renamed from: f, reason: collision with root package name */
    public final w9.i f126162f;

    /* renamed from: g, reason: collision with root package name */
    public final w9.i f126163g;

    public C2725xe8948() {
        this.f126162f = new w9.i(75L, 150L);
        this.f126163g = new w9.i(0L, 150L);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.AbstractC2722x95223586, p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean b(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2) {
        return view2 instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e;
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean x(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.AbstractC2723x75b6e8af
    public android.animation.AnimatorSet z(android.view.View view, android.view.View view2, boolean z17, boolean z18) {
        android.animation.ObjectAnimator ofFloat;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        new java.util.ArrayList();
        w9.i iVar = z17 ? this.f126162f : this.f126163g;
        if (z17) {
            if (!z18) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/google/android/material/transformation/FabTransformationScrimBehavior", "createScrimAnimation", "(Landroid/view/View;ZZLjava/util/List;Ljava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view2, "com/google/android/material/transformation/FabTransformationScrimBehavior", "createScrimAnimation", "(Landroid/view/View;ZZLjava/util/List;Ljava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            ofFloat = android.animation.ObjectAnimator.ofFloat(view2, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.ALPHA, 1.0f);
        } else {
            ofFloat = android.animation.ObjectAnimator.ofFloat(view2, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.ALPHA, 0.0f);
        }
        iVar.a(ofFloat);
        arrayList.add(ofFloat);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        w9.b.a(animatorSet, arrayList);
        animatorSet.addListener(new pa.h(this, z17, view2));
        return animatorSet;
    }

    public C2725xe8948(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f126162f = new w9.i(75L, 150L);
        this.f126163g = new w9.i(0L, 150L);
    }
}
