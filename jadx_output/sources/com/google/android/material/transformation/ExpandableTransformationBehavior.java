package com.google.android.material.transformation;

/* loaded from: classes13.dex */
public abstract class ExpandableTransformationBehavior extends com.google.android.material.transformation.ExpandableBehavior {

    /* renamed from: e, reason: collision with root package name */
    public android.animation.AnimatorSet f44624e;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public boolean y(android.view.View view, android.view.View view2, boolean z17, boolean z18) {
        android.animation.AnimatorSet animatorSet = this.f44624e;
        boolean z19 = animatorSet != null;
        if (z19) {
            animatorSet.cancel();
        }
        android.animation.AnimatorSet z27 = z(view, view2, z17, z19);
        this.f44624e = z27;
        z27.addListener(new pa.b(this));
        this.f44624e.start();
        if (!z18) {
            this.f44624e.end();
        }
        return true;
    }

    public abstract android.animation.AnimatorSet z(android.view.View view, android.view.View view2, boolean z17, boolean z18);

    public ExpandableTransformationBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
