package com.google.android.material.internal;

/* loaded from: classes15.dex */
public class NavigationMenuItemView extends com.google.android.material.internal.ForegroundLinearLayout implements o.h0 {
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
    public android.graphics.drawable.Drawable f44519J;
    public final n3.c K;

    public NavigationMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(android.view.View view) {
        if (view != null) {
            if (this.F == null) {
                this.F = (android.widget.FrameLayout) ((android.view.ViewStub) findViewById(com.tencent.mm.R.id.f484061cv2)).inflate();
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
            if (getContext().getTheme().resolveAttribute(com.tencent.mm.R.attr.f478174cn, typedValue, true)) {
                stateListDrawable = new android.graphics.drawable.StateListDrawable();
                stateListDrawable.addState(L, new android.graphics.drawable.ColorDrawable(typedValue.data));
                stateListDrawable.addState(android.view.ViewGroup.EMPTY_STATE_SET, new android.graphics.drawable.ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.q(this, stateListDrawable);
        }
        setCheckable(uVar.isCheckable());
        setChecked(uVar.isChecked());
        setEnabled(uVar.isEnabled());
        setTitle(uVar.f341808h);
        setIcon(uVar.getIcon());
        setActionView(uVar.getActionView());
        setContentDescription(uVar.f341820w);
        androidx.appcompat.widget.a3.a(this, uVar.f341821x);
        o.u uVar2 = this.G;
        boolean z17 = uVar2.f341808h == null && uVar2.getIcon() == null && this.G.getActionView() != null;
        android.widget.CheckedTextView checkedTextView = this.E;
        if (z17) {
            checkedTextView.setVisibility(8);
            android.widget.FrameLayout frameLayout = this.F;
            if (frameLayout != null) {
                androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width = -1;
                this.F.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        android.widget.FrameLayout frameLayout2 = this.F;
        if (frameLayout2 != null) {
            androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams2 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width = -2;
            this.F.setLayoutParams(layoutParams2);
        }
    }

    @Override // o.h0
    public o.u getItemData() {
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

    public void setCheckable(boolean z17) {
        refreshDrawableState();
        if (this.D != z17) {
            this.D = z17;
            this.K.sendAccessibilityEvent(this.E, 2048);
        }
    }

    public void setChecked(boolean z17) {
        refreshDrawableState();
        this.E.setChecked(z17);
    }

    public void setHorizontalPadding(int i17) {
        setPadding(i17, 0, i17, 0);
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
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
            if (this.f44519J == null) {
                android.content.res.Resources resources = getResources();
                android.content.res.Resources.Theme theme = getContext().getTheme();
                java.lang.ThreadLocal threadLocal = d3.q.f226108a;
                android.graphics.drawable.Drawable a17 = d3.l.a(resources, com.tencent.mm.R.drawable.asj, theme);
                this.f44519J = a17;
                if (a17 != null) {
                    a17.setBounds(0, 0, i17, i17);
                }
            }
            drawable = this.f44519J;
        }
        androidx.core.widget.u.e(this.E, drawable, null, null, null);
    }

    public void setIconPadding(int i17) {
        this.E.setCompoundDrawablePadding(i17);
    }

    public void setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.H = colorStateList;
        this.I = colorStateList != null;
        o.u uVar = this.G;
        if (uVar != null) {
            setIcon(uVar.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z17) {
        this.C = z17;
    }

    public void setTextAppearance(int i17) {
        this.E.setTextAppearance(i17);
    }

    public void setTextColor(android.content.res.ColorStateList colorStateList) {
        this.E.setTextColor(colorStateList);
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        this.E.setText(charSequence);
    }

    public NavigationMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        fa.i iVar = new fa.i(this);
        this.K = iVar;
        setOrientation(0);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488703a41, (android.view.ViewGroup) this, true);
        this.B = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480287tk);
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) findViewById(com.tencent.mm.R.id.f484062cv3);
        this.E = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        n3.l1.l(checkedTextView, iVar);
    }
}
