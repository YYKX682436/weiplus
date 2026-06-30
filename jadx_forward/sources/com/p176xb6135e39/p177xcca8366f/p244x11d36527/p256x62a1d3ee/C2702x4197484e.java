package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee;

@p012xc85e97e9.p073xee01125a.p074xd1075a44.b(m7206x6ac9171 = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e.Behavior.class)
/* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton */
/* loaded from: classes15.dex */
public class C2702x4197484e extends com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2711x10f79281 implements da.a {

    /* renamed from: e, reason: collision with root package name */
    public android.content.res.ColorStateList f126024e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f126025f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.res.ColorStateList f126026g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f126027h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.res.ColorStateList f126028i;

    /* renamed from: m, reason: collision with root package name */
    public int f126029m;

    /* renamed from: n, reason: collision with root package name */
    public int f126030n;

    /* renamed from: o, reason: collision with root package name */
    public int f126031o;

    /* renamed from: p, reason: collision with root package name */
    public final int f126032p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f126033q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Rect f126034r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Rect f126035s;

    /* renamed from: t, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.j0 f126036t;

    /* renamed from: u, reason: collision with root package name */
    public final da.b f126037u;

    /* renamed from: v, reason: collision with root package name */
    public ea.l f126038v;

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$Behavior */
    /* loaded from: classes15.dex */
    public static class Behavior extends com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e.BaseBehavior<com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e> {
        public Behavior() {
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public C2702x4197484e(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559808ff);
    }

    /* renamed from: getImpl */
    private ea.l m20261xfb80ca96() {
        if (this.f126038v == null) {
            this.f126038v = new ea.n(this, new ea.b(this));
        }
        return this.f126038v;
    }

    public static int m(int i17, int i18) {
        int mode = android.view.View.MeasureSpec.getMode(i18);
        int size = android.view.View.MeasureSpec.getSize(i18);
        if (mode == Integer.MIN_VALUE) {
            return java.lang.Math.min(i17, size);
        }
        if (mode == 0) {
            return i17;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new java.lang.IllegalArgumentException();
    }

    public void c(android.animation.Animator.AnimatorListener animatorListener) {
        ea.l m20261xfb80ca96 = m20261xfb80ca96();
        if (m20261xfb80ca96.f332030r == null) {
            m20261xfb80ca96.f332030r = new java.util.ArrayList();
        }
        m20261xfb80ca96.f332030r.add(animatorListener);
    }

    public void d(android.animation.Animator.AnimatorListener animatorListener) {
        ea.l m20261xfb80ca96 = m20261xfb80ca96();
        if (m20261xfb80ca96.f332029q == null) {
            m20261xfb80ca96.f332029q = new java.util.ArrayList();
        }
        m20261xfb80ca96.f332029q.add(animatorListener);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m20261xfb80ca96().j(getDrawableState());
    }

    public boolean e(android.graphics.Rect rect) {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (!n3.x0.c(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        i(rect);
        return true;
    }

    public final int f(int i17) {
        int i18 = this.f126030n;
        if (i18 != 0) {
            return i18;
        }
        android.content.res.Resources resources = getResources();
        return i17 != -1 ? i17 != 1 ? resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561815tf) : resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561814te) : java.lang.Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? f(1) : f(0);
    }

    public void g(ea.a aVar, boolean z17) {
        ea.l m20261xfb80ca96 = m20261xfb80ca96();
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2711x10f79281 c2711x10f79281 = m20261xfb80ca96.f332031s;
        boolean z18 = false;
        if (c2711x10f79281.getVisibility() != 0 ? m20261xfb80ca96.f332013a != 2 : m20261xfb80ca96.f332013a == 1) {
            return;
        }
        android.animation.Animator animator = m20261xfb80ca96.f332014b;
        if (animator != null) {
            animator.cancel();
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2711x10f79281 c2711x10f792812 = m20261xfb80ca96.f332031s;
        if (n3.x0.c(c2711x10f792812) && !c2711x10f792812.isInEditMode()) {
            z18 = true;
        }
        if (!z18) {
            c2711x10f79281.a(z17 ? 8 : 4, z17);
            return;
        }
        w9.h hVar = m20261xfb80ca96.f332016d;
        if (hVar == null) {
            if (m20261xfb80ca96.f332018f == null) {
                m20261xfb80ca96.f332018f = w9.h.b(c2711x10f79281.getContext(), com.p314xaae8f345.mm.R.C30855xd09a2ae7.f559491c);
            }
            hVar = m20261xfb80ca96.f332018f;
        }
        android.animation.AnimatorSet b17 = m20261xfb80ca96.b(hVar, 0.0f, 0.0f, 0.0f);
        b17.addListener(new ea.c(m20261xfb80ca96, z17, null));
        java.util.ArrayList arrayList = m20261xfb80ca96.f332030r;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b17.addListener((android.animation.Animator.AnimatorListener) it.next());
            }
        }
        b17.start();
    }

    @Override // android.view.View
    public android.content.res.ColorStateList getBackgroundTintList() {
        return this.f126024e;
    }

    @Override // android.view.View
    public android.graphics.PorterDuff.Mode getBackgroundTintMode() {
        return this.f126025f;
    }

    /* renamed from: getCompatElevation */
    public float m20262x1206bec5() {
        return m20261xfb80ca96().e();
    }

    /* renamed from: getCompatHoveredFocusedTranslationZ */
    public float m20263x95210a9d() {
        return m20261xfb80ca96().f332025m;
    }

    /* renamed from: getCompatPressedTranslationZ */
    public float m20264xbd8a6f73() {
        return m20261xfb80ca96().f332026n;
    }

    /* renamed from: getContentBackground */
    public android.graphics.drawable.Drawable m20265x4efd69d1() {
        return m20261xfb80ca96().f332023k;
    }

    /* renamed from: getCustomSize */
    public int m20266x8ff97708() {
        return this.f126030n;
    }

    /* renamed from: getExpandedComponentIdHint */
    public int m20267x5cb3b70() {
        return this.f126037u.f309261c;
    }

    /* renamed from: getHideMotionSpec */
    public w9.h m20268x8fe7bc69() {
        return m20261xfb80ca96().f332016d;
    }

    @java.lang.Deprecated
    /* renamed from: getRippleColor */
    public int m20269xaba02ddd() {
        android.content.res.ColorStateList colorStateList = this.f126028i;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    /* renamed from: getRippleColorStateList */
    public android.content.res.ColorStateList m20270x2fc37372() {
        return this.f126028i;
    }

    /* renamed from: getShowMotionSpec */
    public w9.h m20271x22a30c64() {
        return m20261xfb80ca96().f332015c;
    }

    /* renamed from: getSize */
    public int m20272xfb854877() {
        return this.f126029m;
    }

    /* renamed from: getSizeDimension */
    public int m20273x963cdaaf() {
        return f(this.f126029m);
    }

    /* renamed from: getSupportBackgroundTintList */
    public android.content.res.ColorStateList m20274x6bcb5100() {
        return getBackgroundTintList();
    }

    /* renamed from: getSupportBackgroundTintMode */
    public android.graphics.PorterDuff.Mode m20275x6bcbda05() {
        return getBackgroundTintMode();
    }

    /* renamed from: getSupportImageTintList */
    public android.content.res.ColorStateList m20276x36b6d99b() {
        return this.f126026g;
    }

    /* renamed from: getSupportImageTintMode */
    public android.graphics.PorterDuff.Mode m20277x36b762a0() {
        return this.f126027h;
    }

    /* renamed from: getUseCompatPadding */
    public boolean m20278xb4864f5e() {
        return this.f126033q;
    }

    public boolean h() {
        ea.l m20261xfb80ca96 = m20261xfb80ca96();
        if (m20261xfb80ca96.f332031s.getVisibility() != 0) {
            if (m20261xfb80ca96.f332013a != 2) {
                return false;
            }
        } else if (m20261xfb80ca96.f332013a == 1) {
            return false;
        }
        return true;
    }

    public final void i(android.graphics.Rect rect) {
        int i17 = rect.left;
        android.graphics.Rect rect2 = this.f126034r;
        rect.left = i17 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void j() {
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        android.content.res.ColorStateList colorStateList = this.f126026g;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        android.graphics.PorterDuff.Mode mode = this.f126027h;
        if (mode == null) {
            mode = android.graphics.PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0.j(colorForState, mode));
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        m20261xfb80ca96().g();
    }

    public void k(android.animation.Animator.AnimatorListener animatorListener) {
        java.util.ArrayList arrayList = m20261xfb80ca96().f332030r;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void l(android.animation.Animator.AnimatorListener animatorListener) {
        java.util.ArrayList arrayList = m20261xfb80ca96().f332029q;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void n(ea.a aVar, boolean z17) {
        ea.l m20261xfb80ca96 = m20261xfb80ca96();
        if (m20261xfb80ca96.f332031s.getVisibility() == 0 ? m20261xfb80ca96.f332013a != 1 : m20261xfb80ca96.f332013a == 2) {
            return;
        }
        android.animation.Animator animator = m20261xfb80ca96.f332014b;
        if (animator != null) {
            animator.cancel();
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2711x10f79281 c2711x10f79281 = m20261xfb80ca96.f332031s;
        boolean z18 = n3.x0.c(c2711x10f79281) && !c2711x10f79281.isInEditMode();
        android.graphics.Matrix matrix = m20261xfb80ca96.f332036x;
        if (!z18) {
            c2711x10f79281.a(0, z17);
            c2711x10f79281.setAlpha(1.0f);
            c2711x10f79281.setScaleY(1.0f);
            c2711x10f79281.setScaleX(1.0f);
            m20261xfb80ca96.f332028p = 1.0f;
            m20261xfb80ca96.a(1.0f, matrix);
            c2711x10f79281.setImageMatrix(matrix);
            return;
        }
        if (c2711x10f79281.getVisibility() != 0) {
            c2711x10f79281.setAlpha(0.0f);
            c2711x10f79281.setScaleY(0.0f);
            c2711x10f79281.setScaleX(0.0f);
            m20261xfb80ca96.f332028p = 0.0f;
            m20261xfb80ca96.a(0.0f, matrix);
            c2711x10f79281.setImageMatrix(matrix);
        }
        w9.h hVar = m20261xfb80ca96.f332015c;
        if (hVar == null) {
            if (m20261xfb80ca96.f332017e == null) {
                m20261xfb80ca96.f332017e = w9.h.b(c2711x10f79281.getContext(), com.p314xaae8f345.mm.R.C30855xd09a2ae7.f559492d);
            }
            hVar = m20261xfb80ca96.f332017e;
        }
        android.animation.AnimatorSet b17 = m20261xfb80ca96.b(hVar, 1.0f, 1.0f, 1.0f);
        b17.addListener(new ea.d(m20261xfb80ca96, z17, null));
        java.util.ArrayList arrayList = m20261xfb80ca96.f332029q;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b17.addListener((android.animation.Animator.AnimatorListener) it.next());
            }
        }
        b17.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ea.l m20261xfb80ca96 = m20261xfb80ca96();
        m20261xfb80ca96.getClass();
        if (!(m20261xfb80ca96 instanceof ea.n)) {
            if (m20261xfb80ca96.f332037y == null) {
                m20261xfb80ca96.f332037y = new ea.e(m20261xfb80ca96);
            }
            m20261xfb80ca96.f332031s.getViewTreeObserver().addOnPreDrawListener(m20261xfb80ca96.f332037y);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ea.l m20261xfb80ca96 = m20261xfb80ca96();
        if (m20261xfb80ca96.f332037y != null) {
            m20261xfb80ca96.f332031s.getViewTreeObserver().removeOnPreDrawListener(m20261xfb80ca96.f332037y);
            m20261xfb80ca96.f332037y = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        int m20273x963cdaaf = m20273x963cdaaf();
        this.f126031o = (m20273x963cdaaf - this.f126032p) / 2;
        m20261xfb80ca96().o();
        int min = java.lang.Math.min(m(m20273x963cdaaf, i17), m(m20273x963cdaaf, i18));
        android.graphics.Rect rect = this.f126034r;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p260x4e92334c.C2716x7426e8fe)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p260x4e92334c.C2716x7426e8fe c2716x7426e8fe = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p260x4e92334c.C2716x7426e8fe) parcelable;
        super.onRestoreInstanceState(c2716x7426e8fe.f92645d);
        android.os.Bundle bundle = (android.os.Bundle) c2716x7426e8fe.f126069f.m174751x4aabfc28("expandableWidgetHelper", null);
        da.b bVar = this.f126037u;
        bVar.getClass();
        bVar.f309260b = bundle.getBoolean("expanded", false);
        bVar.f309261c = bundle.getInt("expandedComponentIdHint", 0);
        if (bVar.f309260b) {
            android.view.View view = bVar.f309259a;
            android.view.ViewParent parent = view.getParent();
            if (parent instanceof p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a) {
                ((p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a) parent).g(view);
            }
        }
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p260x4e92334c.C2716x7426e8fe c2716x7426e8fe = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p260x4e92334c.C2716x7426e8fe(super.onSaveInstanceState());
        x.n nVar = c2716x7426e8fe.f126069f;
        da.b bVar = this.f126037u;
        bVar.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("expanded", bVar.f309260b);
        bundle.putInt("expandedComponentIdHint", bVar.f309261c);
        nVar.put("expandableWidgetHelper", bundle);
        return c2716x7426e8fe;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            android.graphics.Rect rect = this.f126035s;
            if (e(rect) && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i17) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        if (this.f126024e != colorStateList) {
            this.f126024e = colorStateList;
            ea.l m20261xfb80ca96 = m20261xfb80ca96();
            android.graphics.drawable.Drawable drawable = m20261xfb80ca96.f332020h;
            if (drawable != null) {
                f3.b.h(drawable, colorStateList);
            }
            fa.d dVar = m20261xfb80ca96.f332022j;
            if (dVar != null) {
                if (colorStateList != null) {
                    dVar.f342123k = colorStateList.getColorForState(dVar.getState(), dVar.f342123k);
                }
                dVar.f342122j = colorStateList;
                dVar.f342124l = true;
                dVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.f126025f != mode) {
            this.f126025f = mode;
            android.graphics.drawable.Drawable drawable = m20261xfb80ca96().f332020h;
            if (drawable != null) {
                f3.b.i(drawable, mode);
            }
        }
    }

    /* renamed from: setCompatElevation */
    public void m20279x48dd5839(float f17) {
        ea.l m20261xfb80ca96 = m20261xfb80ca96();
        if (m20261xfb80ca96.f332024l != f17) {
            m20261xfb80ca96.f332024l = f17;
            m20261xfb80ca96.k(f17, m20261xfb80ca96.f332025m, m20261xfb80ca96.f332026n);
        }
    }

    /* renamed from: setCompatElevationResource */
    public void m20280x94c83767(int i17) {
        m20279x48dd5839(getResources().getDimension(i17));
    }

    /* renamed from: setCompatHoveredFocusedTranslationZ */
    public void m20281x674a07a9(float f17) {
        ea.l m20261xfb80ca96 = m20261xfb80ca96();
        if (m20261xfb80ca96.f332025m != f17) {
            m20261xfb80ca96.f332025m = f17;
            m20261xfb80ca96.k(m20261xfb80ca96.f332024l, f17, m20261xfb80ca96.f332026n);
        }
    }

    /* renamed from: setCompatHoveredFocusedTranslationZResource */
    public void m20282x2d0676d7(int i17) {
        m20281x674a07a9(getResources().getDimension(i17));
    }

    /* renamed from: setCompatPressedTranslationZ */
    public void m20283x756c7e7(float f17) {
        ea.l m20261xfb80ca96 = m20261xfb80ca96();
        if (m20261xfb80ca96.f332026n != f17) {
            m20261xfb80ca96.f332026n = f17;
            m20261xfb80ca96.k(m20261xfb80ca96.f332024l, m20261xfb80ca96.f332025m, f17);
        }
    }

    /* renamed from: setCompatPressedTranslationZResource */
    public void m20284x3ce61915(int i17) {
        m20283x756c7e7(getResources().getDimension(i17));
    }

    /* renamed from: setCustomSize */
    public void m20285xbe1dc514(int i17) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException("Custom size must be non-negative");
        }
        this.f126030n = i17;
    }

    /* renamed from: setExpandedComponentIdHint */
    public void m20286x1bfb20e4(int i17) {
        this.f126037u.f309261c = i17;
    }

    /* renamed from: setHideMotionSpec */
    public void m20287x57de2475(w9.h hVar) {
        m20261xfb80ca96().f332016d = hVar;
    }

    /* renamed from: setHideMotionSpecResource */
    public void m20288xec4707a3(int i17) {
        m20287x57de2475(w9.h.b(getContext(), i17));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        super.setImageDrawable(drawable);
        ea.l m20261xfb80ca96 = m20261xfb80ca96();
        float f17 = m20261xfb80ca96.f332028p;
        m20261xfb80ca96.f332028p = f17;
        android.graphics.Matrix matrix = m20261xfb80ca96.f332036x;
        m20261xfb80ca96.a(f17, matrix);
        m20261xfb80ca96.f332031s.setImageMatrix(matrix);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i17) {
        this.f126036t.c(i17);
    }

    /* renamed from: setRippleColor */
    public void m20289x4205a151(int i17) {
        m20290x4205a151(android.content.res.ColorStateList.valueOf(i17));
    }

    /* renamed from: setShowMotionSpec */
    public void m20291xea997470(w9.h hVar) {
        m20261xfb80ca96().f332015c = hVar;
    }

    /* renamed from: setShowMotionSpecResource */
    public void m20292x115c2c9e(int i17) {
        m20291xea997470(w9.h.b(getContext(), i17));
    }

    /* renamed from: setSize */
    public void m20293x76500f83(int i17) {
        this.f126030n = 0;
        if (i17 != this.f126029m) {
            this.f126029m = i17;
            requestLayout();
        }
    }

    /* renamed from: setSupportBackgroundTintList */
    public void m20294xb597a974(android.content.res.ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    /* renamed from: setSupportBackgroundTintMode */
    public void m20295xb5983279(android.graphics.PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    /* renamed from: setSupportImageTintList */
    public void m20296xb10a08a7(android.content.res.ColorStateList colorStateList) {
        if (this.f126026g != colorStateList) {
            this.f126026g = colorStateList;
            j();
        }
    }

    /* renamed from: setSupportImageTintMode */
    public void m20297xb10a91ac(android.graphics.PorterDuff.Mode mode) {
        if (this.f126027h != mode) {
            this.f126027h = mode;
            j();
        }
    }

    /* renamed from: setUseCompatPadding */
    public void m20298x5882e46a(boolean z17) {
        if (this.f126033q != z17) {
            this.f126033q = z17;
            m20261xfb80ca96().i();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior */
    /* loaded from: classes15.dex */
    public static class BaseBehavior<T extends com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e> extends p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior<T> {

        /* renamed from: d, reason: collision with root package name */
        public android.graphics.Rect f126039d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f126040e;

        public BaseBehavior() {
            this.f126040e = true;
        }

        public final boolean A(android.view.View view, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e c2702x4197484e) {
            if (!y(view, c2702x4197484e)) {
                return false;
            }
            if (view.getTop() < (c2702x4197484e.getHeight() / 2) + ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) c2702x4197484e.getLayoutParams())).topMargin) {
                c2702x4197484e.g(null, false);
                return true;
            }
            c2702x4197484e.n(null, false);
            return true;
        }

        @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
        public boolean a(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.graphics.Rect rect) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e c2702x4197484e = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e) view;
            android.graphics.Rect rect2 = c2702x4197484e.f126034r;
            rect.set(c2702x4197484e.getLeft() + rect2.left, c2702x4197484e.getTop() + rect2.top, c2702x4197484e.getRight() - rect2.right, c2702x4197484e.getBottom() - rect2.bottom);
            return true;
        }

        @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
        public void c(p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar) {
            if (cVar.f92546h == 0) {
                cVar.f92546h = 80;
            }
        }

        @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
        public boolean d(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e c2702x4197484e = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e) view;
            if (view2 instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) {
                z(c1081xa22a3e5a, (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view2, c2702x4197484e);
            } else {
                android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof p012xc85e97e9.p073xee01125a.p074xd1075a44.c ? ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) layoutParams).f92539a instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 : false) {
                    A(view2, c2702x4197484e);
                }
            }
            return false;
        }

        @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
        public boolean g(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, int i17) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e c2702x4197484e = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e) view;
            java.util.ArrayList arrayList = (java.util.ArrayList) c1081xa22a3e5a.k(c2702x4197484e);
            int size = arrayList.size();
            int i18 = 0;
            for (int i19 = 0; i19 < size; i19++) {
                android.view.View view2 = (android.view.View) arrayList.get(i19);
                if (!(view2 instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c)) {
                    android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof p012xc85e97e9.p073xee01125a.p074xd1075a44.c ? ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) layoutParams).f92539a instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 : false) && A(view2, c2702x4197484e)) {
                        break;
                    }
                } else {
                    if (z(c1081xa22a3e5a, (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view2, c2702x4197484e)) {
                        break;
                    }
                }
            }
            c1081xa22a3e5a.s(c2702x4197484e, i17);
            android.graphics.Rect rect = c2702x4197484e.f126034r;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) c2702x4197484e.getLayoutParams();
            int i27 = c2702x4197484e.getRight() >= c1081xa22a3e5a.getWidth() - ((android.view.ViewGroup.MarginLayoutParams) cVar).rightMargin ? rect.right : c2702x4197484e.getLeft() <= ((android.view.ViewGroup.MarginLayoutParams) cVar).leftMargin ? -rect.left : 0;
            if (c2702x4197484e.getBottom() >= c1081xa22a3e5a.getHeight() - ((android.view.ViewGroup.MarginLayoutParams) cVar).bottomMargin) {
                i18 = rect.bottom;
            } else if (c2702x4197484e.getTop() <= ((android.view.ViewGroup.MarginLayoutParams) cVar).topMargin) {
                i18 = -rect.top;
            }
            if (i18 != 0) {
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                c2702x4197484e.offsetTopAndBottom(i18);
            }
            if (i27 == 0) {
                return true;
            }
            java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
            c2702x4197484e.offsetLeftAndRight(i27);
            return true;
        }

        public final boolean y(android.view.View view, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e c2702x4197484e) {
            return this.f126040e && ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) c2702x4197484e.getLayoutParams()).f92544f == view.getId() && c2702x4197484e.m20319x4d6cf653() == 0;
        }

        public final boolean z(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e c2702x4197484e) {
            if (!y(c2678xa407981c, c2702x4197484e)) {
                return false;
            }
            if (this.f126039d == null) {
                this.f126039d = new android.graphics.Rect();
            }
            android.graphics.Rect rect = this.f126039d;
            fa.g.a(c1081xa22a3e5a, c2678xa407981c, rect);
            if (rect.bottom <= c2678xa407981c.m19969xbdc95208()) {
                c2702x4197484e.g(null, false);
                return true;
            }
            c2702x4197484e.n(null, false);
            return true;
        }

        public BaseBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v9.a.f515654k);
            this.f126040e = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public C2702x4197484e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f126034r = new android.graphics.Rect();
        this.f126035s = new android.graphics.Rect();
        android.content.res.TypedArray d17 = fa.d0.d(context, attributeSet, v9.a.f515653j, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576280v5, new int[0]);
        this.f126024e = ia.a.a(context, d17, 0);
        this.f126025f = fa.e0.a(d17.getInt(1, -1), null);
        this.f126028i = ia.a.a(context, d17, 10);
        this.f126029m = d17.getInt(5, -1);
        this.f126030n = d17.getDimensionPixelSize(4, 0);
        int dimensionPixelSize = d17.getDimensionPixelSize(2, 0);
        float dimension = d17.getDimension(3, 0.0f);
        float dimension2 = d17.getDimension(7, 0.0f);
        float dimension3 = d17.getDimension(9, 0.0f);
        this.f126033q = d17.getBoolean(12, false);
        int dimensionPixelSize2 = d17.getDimensionPixelSize(8, 0);
        this.f126032p = dimensionPixelSize2;
        w9.h a17 = w9.h.a(context, d17, 11);
        w9.h a18 = w9.h.a(context, d17, 6);
        d17.recycle();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.j0 j0Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.j0(this);
        this.f126036t = j0Var;
        j0Var.b(attributeSet, i17);
        this.f126037u = new da.b(this);
        m20261xfb80ca96().m(this.f126024e, this.f126025f, this.f126028i, dimensionPixelSize);
        ea.l m20261xfb80ca96 = m20261xfb80ca96();
        if (m20261xfb80ca96.f332024l != dimension) {
            m20261xfb80ca96.f332024l = dimension;
            m20261xfb80ca96.k(dimension, m20261xfb80ca96.f332025m, m20261xfb80ca96.f332026n);
        }
        ea.l m20261xfb80ca962 = m20261xfb80ca96();
        if (m20261xfb80ca962.f332025m != dimension2) {
            m20261xfb80ca962.f332025m = dimension2;
            m20261xfb80ca962.k(m20261xfb80ca962.f332024l, dimension2, m20261xfb80ca962.f332026n);
        }
        ea.l m20261xfb80ca963 = m20261xfb80ca96();
        if (m20261xfb80ca963.f332026n != dimension3) {
            m20261xfb80ca963.f332026n = dimension3;
            m20261xfb80ca963.k(m20261xfb80ca963.f332024l, m20261xfb80ca963.f332025m, dimension3);
        }
        ea.l m20261xfb80ca964 = m20261xfb80ca96();
        if (m20261xfb80ca964.f332027o != dimensionPixelSize2) {
            m20261xfb80ca964.f332027o = dimensionPixelSize2;
            float f17 = m20261xfb80ca964.f332028p;
            m20261xfb80ca964.f332028p = f17;
            android.graphics.Matrix matrix = m20261xfb80ca964.f332036x;
            m20261xfb80ca964.a(f17, matrix);
            m20261xfb80ca964.f332031s.setImageMatrix(matrix);
        }
        m20261xfb80ca96().f332015c = a17;
        m20261xfb80ca96().f332016d = a18;
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    /* renamed from: setRippleColor */
    public void m20290x4205a151(android.content.res.ColorStateList colorStateList) {
        if (this.f126028i != colorStateList) {
            this.f126028i = colorStateList;
            m20261xfb80ca96().n(this.f126028i);
        }
    }
}
