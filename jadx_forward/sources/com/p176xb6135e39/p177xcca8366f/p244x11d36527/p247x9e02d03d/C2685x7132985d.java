package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d;

/* renamed from: com.google.android.material.bottomappbar.BottomAppBar */
/* loaded from: classes15.dex */
public class C2685x7132985d extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b implements p012xc85e97e9.p073xee01125a.p074xd1075a44.a {
    public static final /* synthetic */ int B1 = 0;
    public final android.animation.AnimatorListenerAdapter A1;
    public final int W;

    /* renamed from: l1, reason: collision with root package name */
    public android.animation.Animator f125895l1;

    /* renamed from: p0, reason: collision with root package name */
    public final la.c f125896p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.animation.Animator f125897p1;

    /* renamed from: x0, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.i f125898x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f125899x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.animation.Animator f125900y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f125901y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f125902z1;

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState */
    /* loaded from: classes15.dex */
    public static class SavedState extends p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d.SavedState> f7856x681a0c0c = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.h();

        /* renamed from: f, reason: collision with root package name */
        public int f125904f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f125905g;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f125904f = parcel.readInt();
            this.f125905g = parcel.readInt() != 0;
        }

        @Override // p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f92645d, i17);
            parcel.writeInt(this.f125904f);
            parcel.writeInt(this.f125905g ? 1 : 0);
        }
    }

    public C2685x7132985d(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559648b3);
    }

    /* renamed from: getActionMenuView */
    private p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a m20020xcfb715f0() {
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a) {
                return (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a) childAt;
            }
        }
        return null;
    }

    /* renamed from: getFabTranslationX */
    private float m20021x55bfc238() {
        return t(this.f125899x1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getFabTranslationY */
    public float m20022x55bfc239() {
        return u(this.f125902z1);
    }

    public static void r(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d c2685x7132985d, boolean z17) {
        c2685x7132985d.getClass();
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.c(c2685x7132985d)) {
            android.animation.Animator animator = c2685x7132985d.f125900y0;
            if (animator != null) {
                animator.cancel();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            boolean z18 = z17 && c2685x7132985d.v();
            if (z18) {
                c2685x7132985d.f125898x0.f125921e = c2685x7132985d.m20021x55bfc238();
            }
            float[] fArr = new float[2];
            fArr[0] = c2685x7132985d.f125896p0.f398965o;
            fArr[1] = z18 ? 1.0f : 0.0f;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(fArr);
            ofFloat.addUpdateListener(new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.f(c2685x7132985d));
            ofFloat.setDuration(300L);
            arrayList.add(ofFloat);
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e s17 = c2685x7132985d.s();
            if (s17 != null) {
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(s17, "translationY", c2685x7132985d.u(z17));
                ofFloat2.setDuration(300L);
                arrayList.add(ofFloat2);
            }
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(arrayList);
            c2685x7132985d.f125900y0 = animatorSet;
            animatorSet.addListener(new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.e(c2685x7132985d));
            c2685x7132985d.f125900y0.start();
        }
    }

    /* renamed from: getBackgroundTint */
    public android.content.res.ColorStateList m20023x43ada23f() {
        return this.f125896p0.f398974x;
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.a
    /* renamed from: getBehavior */
    public p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior<com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d> mo7205xd5e8efc8() {
        return new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d.Behavior();
    }

    /* renamed from: getCradleVerticalOffset */
    public float m20024x1392aaca() {
        return this.f125898x0.f125920d;
    }

    /* renamed from: getFabAlignmentMode */
    public int m20025xc5eb15d5() {
        return this.f125899x1;
    }

    /* renamed from: getFabCradleMargin */
    public float m20026x9baae5ca() {
        return this.f125898x0.f125918b;
    }

    /* renamed from: getFabCradleRoundedCornerRadius */
    public float m20027x4de8eff8() {
        return this.f125898x0.f125917a;
    }

    /* renamed from: getHideOnScroll */
    public boolean m20028xdb502f64() {
        return this.f125901y1;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        android.animation.Animator animator = this.f125900y0;
        if (animator != null) {
            animator.cancel();
        }
        android.animation.Animator animator2 = this.f125897p1;
        if (animator2 != null) {
            animator2.cancel();
        }
        android.animation.Animator animator3 = this.f125895l1;
        if (animator3 != null) {
            animator3.cancel();
        }
        x();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d.SavedState savedState = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f92645d);
        this.f125899x1 = savedState.f125904f;
        this.f125902z1 = savedState.f125905g;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d.SavedState savedState = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d.SavedState(super.onSaveInstanceState());
        savedState.f125904f = this.f125899x1;
        savedState.f125905g = this.f125902z1;
        return savedState;
    }

    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e s() {
        if (!(getParent() instanceof p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a)) {
            return null;
        }
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a = (p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a) getParent();
        java.util.List list = (java.util.List) c1081xa22a3e5a.f92521e.f533012b.m174751x4aabfc28(this, null);
        java.util.ArrayList arrayList = (java.util.ArrayList) c1081xa22a3e5a.f92523g;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            if (view instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e) {
                return (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e) view;
            }
        }
        return null;
    }

    /* renamed from: setBackgroundTint */
    public void m20029xba40a4b(android.content.res.ColorStateList colorStateList) {
        f3.b.h(this.f125896p0, colorStateList);
    }

    /* renamed from: setCradleVerticalOffset */
    public void m20030x8de5d9d6(float f17) {
        if (f17 != m20024x1392aaca()) {
            this.f125898x0.f125920d = f17;
            this.f125896p0.invalidateSelf();
        }
    }

    /* renamed from: setFabAlignmentMode */
    public void m20031x69e7aae1(int i17) {
        if (this.f125899x1 != i17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.c(this)) {
                android.animation.Animator animator = this.f125895l1;
                if (animator != null) {
                    animator.cancel();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (this.f125902z1) {
                    android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.f125898x0.f125921e, t(i17));
                    ofFloat.addUpdateListener(new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.b(this));
                    ofFloat.setDuration(300L);
                    arrayList.add(ofFloat);
                }
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(s(), "translationX", t(i17));
                ofFloat2.setDuration(300L);
                arrayList.add(ofFloat2);
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                animatorSet.playTogether(arrayList);
                this.f125895l1 = animatorSet;
                animatorSet.addListener(new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.a(this));
                this.f125895l1.start();
            }
        }
        w(i17, this.f125902z1);
        this.f125899x1 = i17;
    }

    /* renamed from: setFabCradleMargin */
    public void m20032xd2817f3e(float f17) {
        if (f17 != m20026x9baae5ca()) {
            this.f125898x0.f125918b = f17;
            this.f125896p0.invalidateSelf();
        }
    }

    /* renamed from: setFabCradleRoundedCornerRadius */
    public void m20033x48d25304(float f17) {
        if (f17 != m20027x4de8eff8()) {
            this.f125898x0.f125917a = f17;
            this.f125896p0.invalidateSelf();
        }
    }

    /* renamed from: setFabDiameter */
    public void m20034xb5546f2(int i17) {
        float f17 = i17;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.i iVar = this.f125898x0;
        if (f17 != iVar.f125919c) {
            iVar.f125919c = f17;
            this.f125896p0.invalidateSelf();
        }
    }

    /* renamed from: setHideOnScroll */
    public void m20035x11992a70(boolean z17) {
        this.f125901y1 = z17;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b
    /* renamed from: setSubtitle */
    public void mo2846xfbc1ea9a(java.lang.CharSequence charSequence) {
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b
    /* renamed from: setTitle */
    public void mo2849x53bfe316(java.lang.CharSequence charSequence) {
    }

    public final int t(int i17) {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        boolean z17 = n3.v0.d(this) == 1;
        if (i17 == 1) {
            return ((getMeasuredWidth() / 2) - this.W) * (z17 ? -1 : 1);
        }
        return 0;
    }

    public final float u(boolean z17) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e s17 = s();
        if (s17 == null) {
            return 0.0f;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        s17.e(rect);
        float height = rect.height();
        if (height == 0.0f) {
            height = s17.getMeasuredHeight();
        }
        float height2 = s17.getHeight() - rect.bottom;
        float height3 = s17.getHeight() - rect.height();
        float f17 = (-m20024x1392aaca()) + (height / 2.0f) + height2;
        float paddingBottom = height3 - s17.getPaddingBottom();
        float f18 = -getMeasuredHeight();
        if (!z17) {
            f17 = paddingBottom;
        }
        return f18 + f17;
    }

    public final boolean v() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e s17 = s();
        return s17 != null && s17.h();
    }

    public final void w(int i17, boolean z17) {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.c(this)) {
            android.animation.Animator animator = this.f125897p1;
            if (animator != null) {
                animator.cancel();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (!v()) {
                i17 = 0;
                z17 = false;
            }
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a m20020xcfb715f0 = m20020xcfb715f0();
            if (m20020xcfb715f0 != null) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(m20020xcfb715f0, "alpha", 1.0f);
                if ((this.f125902z1 || (z17 && v())) && (this.f125899x1 == 1 || i17 == 1)) {
                    android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(m20020xcfb715f0, "alpha", 0.0f);
                    ofFloat2.addListener(new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.d(this, m20020xcfb715f0, i17, z17));
                    android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                    animatorSet.setDuration(150L);
                    animatorSet.playSequentially(ofFloat2, ofFloat);
                    arrayList.add(animatorSet);
                } else if (m20020xcfb715f0.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.f125897p1 = animatorSet2;
            animatorSet2.addListener(new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.c(this));
            this.f125897p1.start();
        }
    }

    public final void x() {
        this.f125898x0.f125921e = m20021x55bfc238();
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e s17 = s();
        float f17 = (this.f125902z1 && v()) ? 1.0f : 0.0f;
        la.c cVar = this.f125896p0;
        cVar.f398965o = f17;
        cVar.invalidateSelf();
        if (s17 != null) {
            s17.setTranslationY(m20022x55bfc239());
            s17.setTranslationX(m20021x55bfc238());
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a m20020xcfb715f0 = m20020xcfb715f0();
        if (m20020xcfb715f0 != null) {
            m20020xcfb715f0.setAlpha(1.0f);
            if (v()) {
                y(m20020xcfb715f0, this.f125899x1, this.f125902z1);
            } else {
                y(m20020xcfb715f0, 0, false);
            }
        }
    }

    public final void y(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a c0076xa566151a, int i17, boolean z17) {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        boolean z18 = n3.v0.d(this) == 1;
        int i18 = 0;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            android.view.View childAt = getChildAt(i19);
            if ((childAt.getLayoutParams() instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams) && (((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams) childAt.getLayoutParams()).f90603a & 8388615) == 8388611) {
                i18 = java.lang.Math.max(i18, z18 ? childAt.getLeft() : childAt.getRight());
            }
        }
        c0076xa566151a.setTranslationX((i17 == 1 && z17) ? i18 - (z18 ? c0076xa566151a.getRight() : c0076xa566151a.getLeft()) : 0.0f);
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior */
    /* loaded from: classes15.dex */
    public static class Behavior extends com.p176xb6135e39.p177xcca8366f.p244x11d36527.p246x5a0eb252.C2683xf9e73e90<com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d> {

        /* renamed from: g, reason: collision with root package name */
        public final android.graphics.Rect f125903g;

        public Behavior() {
            this.f125903g = new android.graphics.Rect();
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p246x5a0eb252.C2683xf9e73e90
        public void A(android.view.View view) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d c2685x7132985d = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d) view;
            super.A(c2685x7132985d);
            int i17 = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d.B1;
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e s17 = c2685x7132985d.s();
            if (s17 != null) {
                s17.clearAnimation();
                s17.animate().translationY(c2685x7132985d.m20022x55bfc239()).setInterpolator(w9.a.f525570d).setDuration(225L);
            }
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p246x5a0eb252.C2683xf9e73e90, p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
        public boolean g(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, int i17) {
            android.animation.Animator animator;
            android.animation.Animator animator2;
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d c2685x7132985d = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d) view;
            int i18 = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d.B1;
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e s17 = c2685x7132985d.s();
            if (s17 != null) {
                ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) s17.getLayoutParams()).f92542d = 17;
                android.animation.AnimatorListenerAdapter animatorListenerAdapter = c2685x7132985d.A1;
                s17.k(animatorListenerAdapter);
                s17.l(animatorListenerAdapter);
                s17.c(animatorListenerAdapter);
                s17.d(animatorListenerAdapter);
                int measuredWidth = s17.getMeasuredWidth();
                int measuredHeight = s17.getMeasuredHeight();
                android.graphics.Rect rect = this.f125903g;
                rect.set(0, 0, measuredWidth, measuredHeight);
                s17.i(rect);
                c2685x7132985d.m20034xb5546f2(rect.height());
            }
            android.animation.Animator animator3 = c2685x7132985d.f125900y0;
            if (!((animator3 != null && animator3.isRunning()) || ((animator = c2685x7132985d.f125897p1) != null && animator.isRunning()) || ((animator2 = c2685x7132985d.f125895l1) != null && animator2.isRunning()))) {
                c2685x7132985d.x();
            }
            c1081xa22a3e5a.s(c2685x7132985d, i17);
            this.f125885d = c2685x7132985d.getMeasuredHeight();
            return false;
        }

        @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
        public boolean u(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, android.view.View view3, int i17, int i18) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d c2685x7132985d = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d) view;
            return c2685x7132985d.m20028xdb502f64() && super.u(c1081xa22a3e5a, c2685x7132985d, view2, view3, i17, i18);
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p246x5a0eb252.C2683xf9e73e90
        public void z(android.view.View view) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d c2685x7132985d = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d) view;
            super.z(c2685x7132985d);
            int i17 = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d.B1;
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e s17 = c2685x7132985d.s();
            if (s17 != null) {
                android.graphics.Rect rect = this.f125903g;
                s17.e(rect);
                float measuredHeight = s17.getMeasuredHeight() - rect.height();
                s17.clearAnimation();
                s17.animate().translationY((-s17.getPaddingBottom()) + measuredHeight).setInterpolator(w9.a.f525569c).setDuration(175L);
            }
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f125903g = new android.graphics.Rect();
        }
    }

    public C2685x7132985d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f125902z1 = true;
        this.A1 = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.g(this);
        android.content.res.TypedArray d17 = fa.d0.d(context, attributeSet, v9.a.f515646c, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.v_, new int[0]);
        android.content.res.ColorStateList a17 = ia.a.a(context, d17, 0);
        float dimensionPixelOffset = d17.getDimensionPixelOffset(2, 0);
        float dimensionPixelOffset2 = d17.getDimensionPixelOffset(3, 0);
        float dimensionPixelOffset3 = d17.getDimensionPixelOffset(4, 0);
        this.f125899x1 = d17.getInt(1, 0);
        this.f125901y1 = d17.getBoolean(5, false);
        d17.recycle();
        this.W = getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f562106a66);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.i iVar = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.i(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f125898x0 = iVar;
        la.h hVar = new la.h();
        hVar.f398991a = iVar;
        la.c cVar = new la.c(hVar);
        this.f125896p0 = cVar;
        cVar.f398964n = true;
        cVar.invalidateSelf();
        cVar.f398971u = android.graphics.Paint.Style.FILL;
        cVar.invalidateSelf();
        f3.b.h(cVar, a17);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.q(this, cVar);
    }
}
