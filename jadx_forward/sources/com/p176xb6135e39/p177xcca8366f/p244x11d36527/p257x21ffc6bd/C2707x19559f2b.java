package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd;

/* renamed from: com.google.android.material.internal.NavigationMenuItemView */
/* loaded from: classes15.dex */
public class C2707x19559f2b extends com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2706xe6b763b2 implements o.h0 {
    public static final int[] L = {android.R.attr.state_checked};
    public final int B;
    public boolean C;
    public boolean D;
    public final android.widget.CheckedTextView E;
    public android.widget.FrameLayout F;
    public o.u G;
    public android.content.res.ColorStateList H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public android.graphics.drawable.Drawable f126052J;
    public final n3.c K;

    public C2707x19559f2b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: setActionView */
    private void m20306x8ac727fd(android.view.View view) {
        if (view != null) {
            if (this.F == null) {
                this.F = (android.widget.FrameLayout) ((android.view.ViewStub) findViewById(com.p314xaae8f345.mm.R.id.f565594cv2)).inflate();
            }
            this.F.removeAllViews();
            this.F.addView(view);
        }
    }

    @Override // o.h0
    public void a(o.u uVar, int i17) {
        android.graphics.drawable.StateListDrawable stateListDrawable;
        this.G = uVar;
        setVisibility(uVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (getContext().getTheme().resolveAttribute(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559707cn, typedValue, true)) {
                stateListDrawable = new android.graphics.drawable.StateListDrawable();
                stateListDrawable.addState(L, new android.graphics.drawable.ColorDrawable(typedValue.data));
                stateListDrawable.addState(android.view.ViewGroup.EMPTY_STATE_SET, new android.graphics.drawable.ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.q(this, stateListDrawable);
        }
        m20307x7388e820(uVar.isCheckable());
        m20308xdd7d58e5(uVar.isChecked());
        setEnabled(uVar.isEnabled());
        m20316x53bfe316(uVar.f423341h);
        m20310x764b6bfb(uVar.getIcon());
        m20306x8ac727fd(uVar.getActionView());
        setContentDescription(uVar.f423353w);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.a3.a(this, uVar.f423354x);
        o.u uVar2 = this.G;
        boolean z17 = uVar2.f423341h == null && uVar2.getIcon() == null && this.G.getActionView() != null;
        android.widget.CheckedTextView checkedTextView = this.E;
        if (z17) {
            checkedTextView.setVisibility(8);
            android.widget.FrameLayout frameLayout = this.F;
            if (frameLayout != null) {
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams layoutParams = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams) frameLayout.getLayoutParams();
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width = -1;
                this.F.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        android.widget.FrameLayout frameLayout2 = this.F;
        if (frameLayout2 != null) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams layoutParams2 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams) frameLayout2.getLayoutParams();
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width = -2;
            this.F.setLayoutParams(layoutParams2);
        }
    }

    @Override // o.h0
    /* renamed from: getItemData */
    public o.u mo2574xc2025ad3() {
        return this.G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i17) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i17 + 1);
        o.u uVar = this.G;
        if (uVar != null && uVar.isCheckable() && this.G.isChecked()) {
            android.view.View.mergeDrawableStates(onCreateDrawableState, L);
        }
        return onCreateDrawableState;
    }

    /* renamed from: setCheckable */
    public void m20307x7388e820(boolean z17) {
        refreshDrawableState();
        if (this.D != z17) {
            this.D = z17;
            this.K.mo83646xf64a1b94(this.E, 2048);
        }
    }

    /* renamed from: setChecked */
    public void m20308xdd7d58e5(boolean z17) {
        refreshDrawableState();
        this.E.setChecked(z17);
    }

    /* renamed from: setHorizontalPadding */
    public void m20309x49d2ab0b(int i17) {
        setPadding(i17, 0, i17, 0);
    }

    /* renamed from: setIcon */
    public void m20310x764b6bfb(android.graphics.drawable.Drawable drawable) {
        int i17 = this.B;
        if (drawable != null) {
            if (this.I) {
                android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                f3.b.h(drawable, this.H);
            }
            drawable.setBounds(0, 0, i17, i17);
        } else if (this.C) {
            if (this.f126052J == null) {
                android.content.res.Resources resources = getResources();
                android.content.res.Resources.Theme theme = getContext().getTheme();
                java.lang.ThreadLocal threadLocal = d3.q.f307641a;
                android.graphics.drawable.Drawable a17 = d3.l.a(resources, com.p314xaae8f345.mm.R.C30861xcebc809e.asj, theme);
                this.f126052J = a17;
                if (a17 != null) {
                    a17.setBounds(0, 0, i17, i17);
                }
            }
            drawable = this.f126052J;
        }
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.u.e(this.E, drawable, null, null, null);
    }

    /* renamed from: setIconPadding */
    public void m20311x1a060796(int i17) {
        this.E.setCompoundDrawablePadding(i17);
    }

    /* renamed from: setIconTintList */
    public void m20312x7f562754(android.content.res.ColorStateList colorStateList) {
        this.H = colorStateList;
        this.I = colorStateList != null;
        o.u uVar = this.G;
        if (uVar != null) {
            m20310x764b6bfb(uVar.getIcon());
        }
    }

    /* renamed from: setNeedsEmptyIcon */
    public void m20313xefc0324b(boolean z17) {
        this.C = z17;
    }

    /* renamed from: setTextAppearance */
    public void m20314x1d8f3e73(int i17) {
        this.E.setTextAppearance(i17);
    }

    /* renamed from: setTextColor */
    public void m20315x1c5c5ff4(android.content.res.ColorStateList colorStateList) {
        this.E.setTextColor(colorStateList);
    }

    /* renamed from: setTitle */
    public void m20316x53bfe316(java.lang.CharSequence charSequence) {
        this.E.setText(charSequence);
    }

    public C2707x19559f2b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        fa.i iVar = new fa.i(this);
        this.K = iVar;
        m2727x1a6eb00e(0);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570236a41, (android.view.ViewGroup) this, true);
        this.B = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561820tk);
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) findViewById(com.p314xaae8f345.mm.R.id.f565595cv3);
        this.E = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        n3.l1.l(checkedTextView, iVar);
    }
}
