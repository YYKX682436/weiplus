package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309;

/* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior */
/* loaded from: classes13.dex */
public abstract class AbstractC2723x75b6e8af extends com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.AbstractC2722x95223586 {

    /* renamed from: e, reason: collision with root package name */
    public android.animation.AnimatorSet f126157e;

    public AbstractC2723x75b6e8af() {
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.AbstractC2722x95223586
    public boolean y(android.view.View view, android.view.View view2, boolean z17, boolean z18) {
        android.animation.AnimatorSet animatorSet = this.f126157e;
        boolean z19 = animatorSet != null;
        if (z19) {
            animatorSet.cancel();
        }
        android.animation.AnimatorSet z27 = z(view, view2, z17, z19);
        this.f126157e = z27;
        z27.addListener(new pa.b(this));
        this.f126157e.start();
        if (!z18) {
            this.f126157e.end();
        }
        return true;
    }

    public abstract android.animation.AnimatorSet z(android.view.View view, android.view.View view2, boolean z17, boolean z18);

    public AbstractC2723x75b6e8af(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
