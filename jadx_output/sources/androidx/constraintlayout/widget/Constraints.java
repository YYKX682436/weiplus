package androidx.constraintlayout.widget;

/* loaded from: classes15.dex */
public class Constraints extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public androidx.constraintlayout.widget.c f10916d;

    public Constraints(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new androidx.constraintlayout.widget.Constraints.LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.constraintlayout.widget.Constraints.LayoutParams(getContext(), attributeSet);
    }

    public androidx.constraintlayout.widget.c getConstraintSet() {
        if (this.f10916d == null) {
            this.f10916d = new androidx.constraintlayout.widget.c();
        }
        androidx.constraintlayout.widget.c cVar = this.f10916d;
        cVar.getClass();
        int childCount = getChildCount();
        java.util.HashMap hashMap = cVar.f10984a;
        hashMap.clear();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            androidx.constraintlayout.widget.Constraints.LayoutParams layoutParams = (androidx.constraintlayout.widget.Constraints.LayoutParams) childAt.getLayoutParams();
            int id6 = childAt.getId();
            if (id6 == -1) {
                throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(java.lang.Integer.valueOf(id6))) {
                hashMap.put(java.lang.Integer.valueOf(id6), new androidx.constraintlayout.widget.b());
            }
            androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) hashMap.get(java.lang.Integer.valueOf(id6));
            if (childAt instanceof androidx.constraintlayout.widget.ConstraintHelper) {
                androidx.constraintlayout.widget.ConstraintHelper constraintHelper = (androidx.constraintlayout.widget.ConstraintHelper) childAt;
                bVar.c(id6, layoutParams);
                if (constraintHelper instanceof androidx.constraintlayout.widget.Barrier) {
                    bVar.f10973t0 = 1;
                    androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) constraintHelper;
                    bVar.f10971s0 = barrier.getType();
                    bVar.f10975u0 = barrier.getReferencedIds();
                }
            }
            bVar.c(id6, layoutParams);
        }
        return this.f10916d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        super.setVisibility(8);
    }

    /* loaded from: classes15.dex */
    public static class LayoutParams extends androidx.constraintlayout.widget.ConstraintLayout.LayoutParams {

        /* renamed from: l0, reason: collision with root package name */
        public final float f10917l0;

        /* renamed from: m0, reason: collision with root package name */
        public final boolean f10918m0;

        /* renamed from: n0, reason: collision with root package name */
        public final float f10919n0;

        /* renamed from: o0, reason: collision with root package name */
        public final float f10920o0;

        /* renamed from: p0, reason: collision with root package name */
        public final float f10921p0;

        /* renamed from: q0, reason: collision with root package name */
        public final float f10922q0;

        /* renamed from: r0, reason: collision with root package name */
        public final float f10923r0;

        /* renamed from: s0, reason: collision with root package name */
        public final float f10924s0;

        /* renamed from: t0, reason: collision with root package name */
        public final float f10925t0;

        /* renamed from: u0, reason: collision with root package name */
        public final float f10926u0;

        /* renamed from: v0, reason: collision with root package name */
        public final float f10927v0;

        /* renamed from: w0, reason: collision with root package name */
        public final float f10928w0;

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f10917l0 = 1.0f;
            this.f10918m0 = false;
            this.f10919n0 = 0.0f;
            this.f10920o0 = 0.0f;
            this.f10921p0 = 0.0f;
            this.f10922q0 = 0.0f;
            this.f10923r0 = 1.0f;
            this.f10924s0 = 1.0f;
            this.f10925t0 = 0.0f;
            this.f10926u0 = 0.0f;
            this.f10927v0 = 0.0f;
            this.f10928w0 = 0.0f;
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10917l0 = 1.0f;
            this.f10918m0 = false;
            this.f10919n0 = 0.0f;
            this.f10920o0 = 0.0f;
            this.f10921p0 = 0.0f;
            this.f10922q0 = 0.0f;
            this.f10923r0 = 1.0f;
            this.f10924s0 = 1.0f;
            this.f10925t0 = 0.0f;
            this.f10926u0 = 0.0f;
            this.f10927v0 = 0.0f;
            this.f10928w0 = 0.0f;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R$styleable.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i17 = 0; i17 < indexCount; i17++) {
                int index = obtainStyledAttributes.getIndex(i17);
                if (index == androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_alpha) {
                    this.f10917l0 = obtainStyledAttributes.getFloat(index, this.f10917l0);
                } else if (index == androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_elevation) {
                    this.f10919n0 = obtainStyledAttributes.getFloat(index, this.f10919n0);
                    this.f10918m0 = true;
                } else if (index == androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_rotationX) {
                    this.f10921p0 = obtainStyledAttributes.getFloat(index, this.f10921p0);
                } else if (index == androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_rotationY) {
                    this.f10922q0 = obtainStyledAttributes.getFloat(index, this.f10922q0);
                } else if (index == androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_rotation) {
                    this.f10920o0 = obtainStyledAttributes.getFloat(index, this.f10920o0);
                } else if (index == androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_scaleX) {
                    this.f10923r0 = obtainStyledAttributes.getFloat(index, this.f10923r0);
                } else if (index == androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_scaleY) {
                    this.f10924s0 = obtainStyledAttributes.getFloat(index, this.f10924s0);
                } else if (index == androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_transformPivotX) {
                    this.f10925t0 = obtainStyledAttributes.getFloat(index, this.f10925t0);
                } else if (index == androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_transformPivotY) {
                    this.f10926u0 = obtainStyledAttributes.getFloat(index, this.f10926u0);
                } else if (index == androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_translationX) {
                    this.f10927v0 = obtainStyledAttributes.getFloat(index, this.f10927v0);
                } else if (index == androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_translationY) {
                    this.f10928w0 = obtainStyledAttributes.getFloat(index, this.f10928w0);
                } else if (index == androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_translationZ) {
                    this.f10927v0 = obtainStyledAttributes.getFloat(index, 0.0f);
                }
            }
        }
    }
}
