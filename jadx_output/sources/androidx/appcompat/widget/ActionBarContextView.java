package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class ActionBarContextView extends androidx.appcompat.widget.b {

    /* renamed from: o, reason: collision with root package name */
    public java.lang.CharSequence f9304o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.CharSequence f9305p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f9306q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f9307r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f9308s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f9309t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f9310u;

    /* renamed from: v, reason: collision with root package name */
    public final int f9311v;

    /* renamed from: w, reason: collision with root package name */
    public final int f9312w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9313x;

    /* renamed from: y, reason: collision with root package name */
    public final int f9314y;

    public ActionBarContextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478084a8);
    }

    public void f(n.b bVar) {
        android.view.View view = this.f9306q;
        if (view == null) {
            android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(this.f9314y, (android.view.ViewGroup) this, false);
            this.f9306q = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f9306q);
        }
        this.f9306q.findViewById(com.tencent.mm.R.id.f482480fo).setOnClickListener(new androidx.appcompat.widget.d(this, bVar));
        o.r rVar = (o.r) bVar.e();
        androidx.appcompat.widget.q qVar = this.f9514g;
        if (qVar != null) {
            qVar.l();
            androidx.appcompat.widget.i iVar = qVar.B;
            if (iVar != null && iVar.b()) {
                iVar.f341711j.dismiss();
            }
        }
        androidx.appcompat.widget.q qVar2 = new androidx.appcompat.widget.q(getContext());
        this.f9514g = qVar2;
        qVar2.f9674s = true;
        qVar2.f9675t = true;
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-2, -1);
        rVar.b(this.f9514g, this.f9512e);
        androidx.appcompat.widget.q qVar3 = this.f9514g;
        o.i0 i0Var = qVar3.f341697n;
        if (i0Var == null) {
            o.i0 i0Var2 = (o.i0) qVar3.f341693g.inflate(qVar3.f341695i, (android.view.ViewGroup) this, false);
            qVar3.f341697n = i0Var2;
            i0Var2.r(qVar3.f341692f);
            qVar3.c(true);
        }
        o.i0 i0Var3 = qVar3.f341697n;
        if (i0Var != i0Var3) {
            ((androidx.appcompat.widget.ActionMenuView) i0Var3).setPresenter(qVar3);
        }
        androidx.appcompat.widget.ActionMenuView actionMenuView = (androidx.appcompat.widget.ActionMenuView) i0Var3;
        this.f9513f = actionMenuView;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.q(actionMenuView, null);
        addView(this.f9513f, layoutParams);
    }

    public final void g() {
        if (this.f9308s == null) {
            android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f487878af, this);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) getChildAt(getChildCount() - 1);
            this.f9308s = linearLayout;
            this.f9309t = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.f482442ep);
            this.f9310u = (android.widget.TextView) this.f9308s.findViewById(com.tencent.mm.R.id.f482441eo);
            int i17 = this.f9311v;
            if (i17 != 0) {
                this.f9309t.setTextAppearance(getContext(), i17);
            }
            int i18 = this.f9312w;
            if (i18 != 0) {
                this.f9310u.setTextAppearance(getContext(), i18);
            }
        }
        this.f9309t.setText(this.f9304o);
        this.f9310u.setText(this.f9305p);
        boolean z17 = !android.text.TextUtils.isEmpty(this.f9304o);
        boolean z18 = !android.text.TextUtils.isEmpty(this.f9305p);
        int i19 = 0;
        this.f9310u.setVisibility(z18 ? 0 : 8);
        android.widget.LinearLayout linearLayout2 = this.f9308s;
        if (!z17 && !z18) {
            i19 = 8;
        }
        linearLayout2.setVisibility(i19);
        if (this.f9308s.getParent() == null) {
            addView(this.f9308s);
        }
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f9516i != null ? this.f9511d.f9506b : getVisibility();
    }

    public int getContentHeight() {
        return this.f9515h;
    }

    public java.lang.CharSequence getSubtitle() {
        return this.f9305p;
    }

    public java.lang.CharSequence getTitle() {
        return this.f9304o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.q qVar = this.f9514g;
        if (qVar != null) {
            qVar.l();
            androidx.appcompat.widget.i iVar = this.f9514g.B;
            if (iVar == null || !iVar.b()) {
                return;
            }
            iVar.f341711j.dismiss();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f9304o);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        boolean a17 = androidx.appcompat.widget.h3.a(this);
        int paddingRight = a17 ? (i19 - i17) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i27 - i18) - getPaddingTop()) - getPaddingBottom();
        android.view.View view = this.f9306q;
        if (view != null && view.getVisibility() != 8) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f9306q.getLayoutParams();
            int i28 = a17 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i29 = a17 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i37 = a17 ? paddingRight - i28 : paddingRight + i28;
            int d17 = i37 + d(this.f9306q, i37, paddingTop, paddingTop2, a17);
            paddingRight = a17 ? d17 - i29 : d17 + i29;
        }
        int i38 = paddingRight;
        android.widget.LinearLayout linearLayout = this.f9308s;
        if (linearLayout != null && this.f9307r == null && linearLayout.getVisibility() != 8) {
            i38 += d(this.f9308s, i38, paddingTop, paddingTop2, a17);
        }
        int i39 = i38;
        android.view.View view2 = this.f9307r;
        if (view2 != null) {
            d(view2, i39, paddingTop, paddingTop2, a17);
        }
        int paddingLeft = a17 ? getPaddingLeft() : (i19 - i17) - getPaddingRight();
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f9513f;
        if (actionMenuView != null) {
            d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a17);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        if (android.view.View.MeasureSpec.getMode(i17) != 1073741824) {
            throw new java.lang.IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (android.view.View.MeasureSpec.getMode(i18) == 0) {
            throw new java.lang.IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = android.view.View.MeasureSpec.getSize(i17);
        int i19 = this.f9515h;
        if (i19 <= 0) {
            i19 = android.view.View.MeasureSpec.getSize(i18);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i27 = i19 - paddingTop;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i27, Integer.MIN_VALUE);
        android.view.View view = this.f9306q;
        if (view != null) {
            int c17 = c(view, paddingLeft, makeMeasureSpec, 0);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f9306q.getLayoutParams();
            paddingLeft = c17 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f9513f;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f9513f, paddingLeft, makeMeasureSpec, 0);
        }
        android.widget.LinearLayout linearLayout = this.f9308s;
        if (linearLayout != null && this.f9307r == null) {
            if (this.f9313x) {
                this.f9308s.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f9308s.getMeasuredWidth();
                boolean z17 = measuredWidth <= paddingLeft;
                if (z17) {
                    paddingLeft -= measuredWidth;
                }
                this.f9308s.setVisibility(z17 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        android.view.View view2 = this.f9307r;
        if (view2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i28 = layoutParams.width;
            int i29 = i28 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i28 >= 0) {
                paddingLeft = java.lang.Math.min(i28, paddingLeft);
            }
            int i37 = layoutParams.height;
            int i38 = i37 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i37 >= 0) {
                i27 = java.lang.Math.min(i37, i27);
            }
            this.f9307r.measure(android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, i29), android.view.View.MeasureSpec.makeMeasureSpec(i27, i38));
        }
        if (this.f9515h > 0) {
            setMeasuredDimension(size, i19);
            return;
        }
        int childCount = getChildCount();
        int i39 = 0;
        for (int i47 = 0; i47 < childCount; i47++) {
            int measuredHeight = getChildAt(i47).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i39) {
                i39 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i39);
    }

    @Override // androidx.appcompat.widget.b
    public void setContentHeight(int i17) {
        this.f9515h = i17;
    }

    public void setCustomView(android.view.View view) {
        android.widget.LinearLayout linearLayout;
        android.view.View view2 = this.f9307r;
        if (view2 != null) {
            removeView(view2);
        }
        this.f9307r = view;
        if (view != null && (linearLayout = this.f9308s) != null) {
            removeView(linearLayout);
            this.f9308s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(java.lang.CharSequence charSequence) {
        this.f9305p = charSequence;
        g();
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        this.f9304o = charSequence;
        g();
    }

    public void setTitleOptional(boolean z17) {
        if (z17 != this.f9313x) {
            requestLayout();
        }
        this.f9313x = z17;
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i17) {
        super.setVisibility(i17);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.graphics.drawable.Drawable drawable;
        int resourceId;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f296176d, i17, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = k.a.a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.q(this, drawable);
        this.f9311v = obtainStyledAttributes.getResourceId(5, 0);
        this.f9312w = obtainStyledAttributes.getResourceId(4, 0);
        this.f9515h = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f9314y = obtainStyledAttributes.getResourceId(2, com.tencent.mm.R.layout.f487882aj);
        obtainStyledAttributes.recycle();
    }
}
