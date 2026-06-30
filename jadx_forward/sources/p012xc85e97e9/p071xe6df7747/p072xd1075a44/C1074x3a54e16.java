package p012xc85e97e9.p071xe6df7747.p072xd1075a44;

/* renamed from: androidx.constraintlayout.widget.Constraints */
/* loaded from: classes15.dex */
public class C1074x3a54e16 extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.c f92449d;

    public C1074x3a54e16(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1074x3a54e16.LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1074x3a54e16.LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: getConstraintSet */
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.c m7185x3d4a418f() {
        if (this.f92449d == null) {
            this.f92449d = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar = this.f92449d;
        cVar.getClass();
        int childCount = getChildCount();
        java.util.HashMap hashMap = cVar.f92517a;
        hashMap.clear();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1074x3a54e16.LayoutParams layoutParams = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1074x3a54e16.LayoutParams) childAt.getLayoutParams();
            int id6 = childAt.getId();
            if (id6 == -1) {
                throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(java.lang.Integer.valueOf(id6))) {
                hashMap.put(java.lang.Integer.valueOf(id6), new p012xc85e97e9.p071xe6df7747.p072xd1075a44.b());
            }
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.b bVar = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.b) hashMap.get(java.lang.Integer.valueOf(id6));
            if (childAt instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.AbstractC1072x7767bc0b) {
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.AbstractC1072x7767bc0b abstractC1072x7767bc0b = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.AbstractC1072x7767bc0b) childAt;
                bVar.c(id6, layoutParams);
                if (abstractC1072x7767bc0b instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1071x4f5d3b97) {
                    bVar.f92506t0 = 1;
                    p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1071x4f5d3b97 c1071x4f5d3b97 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1071x4f5d3b97) abstractC1072x7767bc0b;
                    bVar.f92504s0 = c1071x4f5d3b97.m7168xfb85f7b0();
                    bVar.f92508u0 = c1071x4f5d3b97.m7172x1cd2f1c9();
                }
            }
            bVar.c(id6, layoutParams);
        }
        return this.f92449d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(layoutParams);
    }

    public C1074x3a54e16(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        super.setVisibility(8);
    }

    /* renamed from: androidx.constraintlayout.widget.Constraints$LayoutParams */
    /* loaded from: classes15.dex */
    public static class LayoutParams extends p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams {

        /* renamed from: l0, reason: collision with root package name */
        public final float f92450l0;

        /* renamed from: m0, reason: collision with root package name */
        public final boolean f92451m0;

        /* renamed from: n0, reason: collision with root package name */
        public final float f92452n0;

        /* renamed from: o0, reason: collision with root package name */
        public final float f92453o0;

        /* renamed from: p0, reason: collision with root package name */
        public final float f92454p0;

        /* renamed from: q0, reason: collision with root package name */
        public final float f92455q0;

        /* renamed from: r0, reason: collision with root package name */
        public final float f92456r0;

        /* renamed from: s0, reason: collision with root package name */
        public final float f92457s0;

        /* renamed from: t0, reason: collision with root package name */
        public final float f92458t0;

        /* renamed from: u0, reason: collision with root package name */
        public final float f92459u0;

        /* renamed from: v0, reason: collision with root package name */
        public final float f92460v0;

        /* renamed from: w0, reason: collision with root package name */
        public final float f92461w0;

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f92450l0 = 1.0f;
            this.f92451m0 = false;
            this.f92452n0 = 0.0f;
            this.f92453o0 = 0.0f;
            this.f92454p0 = 0.0f;
            this.f92455q0 = 0.0f;
            this.f92456r0 = 1.0f;
            this.f92457s0 = 1.0f;
            this.f92458t0 = 0.0f;
            this.f92459u0 = 0.0f;
            this.f92460v0 = 0.0f;
            this.f92461w0 = 0.0f;
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f92450l0 = 1.0f;
            this.f92451m0 = false;
            this.f92452n0 = 0.0f;
            this.f92453o0 = 0.0f;
            this.f92454p0 = 0.0f;
            this.f92455q0 = 0.0f;
            this.f92456r0 = 1.0f;
            this.f92457s0 = 1.0f;
            this.f92458t0 = 0.0f;
            this.f92459u0 = 0.0f;
            this.f92460v0 = 0.0f;
            this.f92461w0 = 0.0f;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2778xaf89b525);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i17 = 0; i17 < indexCount; i17++) {
                int index = obtainStyledAttributes.getIndex(i17);
                if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2779x128e9df4) {
                    this.f92450l0 = obtainStyledAttributes.getFloat(index, this.f92450l0);
                } else if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2780xf0addff3) {
                    this.f92452n0 = obtainStyledAttributes.getFloat(index, this.f92452n0);
                    this.f92451m0 = true;
                } else if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2796xa6799230) {
                    this.f92454p0 = obtainStyledAttributes.getFloat(index, this.f92454p0);
                } else if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2797xa6799231) {
                    this.f92455q0 = obtainStyledAttributes.getFloat(index, this.f92455q0);
                } else if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2795xda0d328) {
                    this.f92453o0 = obtainStyledAttributes.getFloat(index, this.f92453o0);
                } else if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2798x5d76c678) {
                    this.f92456r0 = obtainStyledAttributes.getFloat(index, this.f92456r0);
                } else if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2799x5d76c679) {
                    this.f92457s0 = obtainStyledAttributes.getFloat(index, this.f92457s0);
                } else if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2800x7d747bf8) {
                    this.f92458t0 = obtainStyledAttributes.getFloat(index, this.f92458t0);
                } else if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2801x7d747bf9) {
                    this.f92459u0 = obtainStyledAttributes.getFloat(index, this.f92459u0);
                } else if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2802x30be4271) {
                    this.f92460v0 = obtainStyledAttributes.getFloat(index, this.f92460v0);
                } else if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2803x30be4272) {
                    this.f92461w0 = obtainStyledAttributes.getFloat(index, this.f92461w0);
                } else if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2804x30be4273) {
                    this.f92460v0 = obtainStyledAttributes.getFloat(index, 0.0f);
                }
            }
        }
    }
}
