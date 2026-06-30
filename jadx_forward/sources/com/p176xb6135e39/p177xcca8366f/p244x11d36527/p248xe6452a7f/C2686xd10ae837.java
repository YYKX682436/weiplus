package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f;

/* renamed from: com.google.android.material.bottomnavigation.BottomNavigationItemView */
/* loaded from: classes15.dex */
public class C2686xd10ae837 extends android.widget.FrameLayout implements o.h0 {

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f125922s = {android.R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public final int f125923d;

    /* renamed from: e, reason: collision with root package name */
    public float f125924e;

    /* renamed from: f, reason: collision with root package name */
    public float f125925f;

    /* renamed from: g, reason: collision with root package name */
    public float f125926g;

    /* renamed from: h, reason: collision with root package name */
    public int f125927h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f125928i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f125929m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f125930n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f125931o;

    /* renamed from: p, reason: collision with root package name */
    public int f125932p;

    /* renamed from: q, reason: collision with root package name */
    public o.u f125933q;

    /* renamed from: r, reason: collision with root package name */
    public android.content.res.ColorStateList f125934r;

    public C2686xd10ae837(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // o.h0
    public void a(o.u uVar, int i17) {
        this.f125933q = uVar;
        m20039x7388e820(uVar.isCheckable());
        m20040xdd7d58e5(uVar.isChecked());
        setEnabled(uVar.isEnabled());
        m20041x764b6bfb(uVar.getIcon());
        m20052x53bfe316(uVar.f423341h);
        setId(uVar.f423337d);
        if (!android.text.TextUtils.isEmpty(uVar.f423353w)) {
            setContentDescription(uVar.f423353w);
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.a3.a(this, uVar.f423354x);
        setVisibility(uVar.isVisible() ? 0 : 8);
    }

    public final void b(android.view.View view, int i17, int i18) {
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i17;
        layoutParams.gravity = i18;
        view.setLayoutParams(layoutParams);
    }

    public final void c(android.view.View view, float f17, float f18, int i17) {
        view.setScaleX(f17);
        view.setScaleY(f18);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/google/android/material/bottomnavigation/BottomNavigationItemView", "setViewValues", "(Landroid/view/View;FFI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/google/android/material/bottomnavigation/BottomNavigationItemView", "setViewValues", "(Landroid/view/View;FFI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // o.h0
    /* renamed from: getItemData */
    public o.u mo2574xc2025ad3() {
        return this.f125933q;
    }

    /* renamed from: getItemPosition */
    public int m20038xb2fa47d2() {
        return this.f125932p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i17) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i17 + 1);
        o.u uVar = this.f125933q;
        if (uVar != null && uVar.isCheckable() && this.f125933q.isChecked()) {
            android.view.View.mergeDrawableStates(onCreateDrawableState, f125922s);
        }
        return onCreateDrawableState;
    }

    /* renamed from: setCheckable */
    public void m20039x7388e820(boolean z17) {
        refreshDrawableState();
    }

    /* renamed from: setChecked */
    public void m20040xdd7d58e5(boolean z17) {
        android.widget.TextView textView = this.f125931o;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        android.widget.TextView textView2 = this.f125930n;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        int i17 = this.f125927h;
        int i18 = this.f125923d;
        android.view.View view = this.f125929m;
        if (i17 != -1) {
            if (i17 == 0) {
                if (z17) {
                    b(view, i18, 49);
                    c(textView, 1.0f, 1.0f, 0);
                } else {
                    b(view, i18, 17);
                    c(textView, 0.5f, 0.5f, 4);
                }
                textView2.setVisibility(4);
            } else if (i17 != 1) {
                if (i17 == 2) {
                    b(view, i18, 17);
                    textView.setVisibility(8);
                    textView2.setVisibility(8);
                }
            } else if (z17) {
                b(view, (int) (i18 + this.f125924e), 49);
                c(textView, 1.0f, 1.0f, 0);
                float f17 = this.f125925f;
                c(textView2, f17, f17, 4);
            } else {
                b(view, i18, 49);
                float f18 = this.f125926g;
                c(textView, f18, f18, 4);
                c(textView2, 1.0f, 1.0f, 0);
            }
        } else if (this.f125928i) {
            if (z17) {
                b(view, i18, 49);
                c(textView, 1.0f, 1.0f, 0);
            } else {
                b(view, i18, 17);
                c(textView, 0.5f, 0.5f, 4);
            }
            textView2.setVisibility(4);
        } else if (z17) {
            b(view, (int) (i18 + this.f125924e), 49);
            c(textView, 1.0f, 1.0f, 0);
            float f19 = this.f125925f;
            c(textView2, f19, f19, 4);
        } else {
            b(view, i18, 49);
            float f27 = this.f125926g;
            c(textView, f27, f27, 4);
            c(textView2, 1.0f, 1.0f, 0);
        }
        refreshDrawableState();
        setSelected(z17);
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        super.setEnabled(z17);
        this.f125930n.setEnabled(z17);
        this.f125931o.setEnabled(z17);
        this.f125929m.setEnabled(z17);
        if (!z17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.c1.d(this, null);
        } else {
            android.view.PointerIcon b17 = n3.n0.b(getContext(), 1002);
            java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
            n3.c1.d(this, b17);
        }
    }

    /* renamed from: setIcon */
    public void m20041x764b6bfb(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            f3.b.h(drawable, this.f125934r);
        }
        this.f125929m.setImageDrawable(drawable);
    }

    /* renamed from: setIconSize */
    public void m20042x4a964a9c(int i17) {
        android.widget.ImageView imageView = this.f125929m;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i17;
        layoutParams.height = i17;
        imageView.setLayoutParams(layoutParams);
    }

    /* renamed from: setIconTintList */
    public void m20043x7f562754(android.content.res.ColorStateList colorStateList) {
        this.f125934r = colorStateList;
        o.u uVar = this.f125933q;
        if (uVar != null) {
            m20041x764b6bfb(uVar.getIcon());
        }
    }

    /* renamed from: setItemBackground */
    public void m20044x3c565a3(int i17) {
        m20045x3c565a3(i17 == 0 ? null : b3.l.m9707x4a96be14(getContext(), i17));
    }

    /* renamed from: setItemPosition */
    public void m20046xe94342de(int i17) {
        this.f125932p = i17;
    }

    /* renamed from: setLabelVisibilityMode */
    public void m20047x8ef6e427(int i17) {
        if (this.f125927h != i17) {
            this.f125927h = i17;
            o.u uVar = this.f125933q;
            if (uVar != null) {
                m20040xdd7d58e5(uVar.isChecked());
            }
        }
    }

    /* renamed from: setShifting */
    public void m20048x574262a2(boolean z17) {
        if (this.f125928i != z17) {
            this.f125928i = z17;
            o.u uVar = this.f125933q;
            if (uVar != null) {
                m20040xdd7d58e5(uVar.isChecked());
            }
        }
    }

    /* renamed from: setTextAppearanceActive */
    public void m20049x70a9c759(int i17) {
        android.widget.TextView textView = this.f125931o;
        textView.setTextAppearance(i17);
        float textSize = this.f125930n.getTextSize();
        float textSize2 = textView.getTextSize();
        this.f125924e = textSize - textSize2;
        this.f125925f = (textSize2 * 1.0f) / textSize;
        this.f125926g = (textSize * 1.0f) / textSize2;
    }

    /* renamed from: setTextAppearanceInactive */
    public void m20050x5181dbfe(int i17) {
        android.widget.TextView textView = this.f125930n;
        textView.setTextAppearance(i17);
        float textSize = textView.getTextSize();
        float textSize2 = this.f125931o.getTextSize();
        this.f125924e = textSize - textSize2;
        this.f125925f = (textSize2 * 1.0f) / textSize;
        this.f125926g = (textSize * 1.0f) / textSize2;
    }

    /* renamed from: setTextColor */
    public void m20051x1c5c5ff4(android.content.res.ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f125930n.setTextColor(colorStateList);
            this.f125931o.setTextColor(colorStateList);
        }
    }

    /* renamed from: setTitle */
    public void m20052x53bfe316(java.lang.CharSequence charSequence) {
        this.f125930n.setText(charSequence);
        this.f125931o.setText(charSequence);
        o.u uVar = this.f125933q;
        if (uVar == null || android.text.TextUtils.isEmpty(uVar.f423353w)) {
            setContentDescription(charSequence);
        }
    }

    public C2686xd10ae837(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f125932p = -1;
        android.content.res.Resources resources = getResources();
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a3r, (android.view.ViewGroup) this, true);
        setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562882r2);
        this.f125923d = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561808t8);
        this.f125929m = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.h5n);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.n09);
        this.f125930n = textView;
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hsy);
        this.f125931o = textView2;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.s(textView, 2);
        n3.u0.s(textView2, 2);
        setFocusable(true);
        float textSize = textView.getTextSize();
        float textSize2 = textView2.getTextSize();
        this.f125924e = textSize - textSize2;
        this.f125925f = (textSize2 * 1.0f) / textSize;
        this.f125926g = (textSize * 1.0f) / textSize2;
    }

    /* renamed from: setItemBackground */
    public void m20045x3c565a3(android.graphics.drawable.Drawable drawable) {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.q(this, drawable);
    }
}
