package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.ActionBarContextView */
/* loaded from: classes15.dex */
public class C0073x5080ced7 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b {

    /* renamed from: o, reason: collision with root package name */
    public java.lang.CharSequence f90837o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.CharSequence f90838p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f90839q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f90840r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f90841s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f90842t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f90843u;

    /* renamed from: v, reason: collision with root package name */
    public final int f90844v;

    /* renamed from: w, reason: collision with root package name */
    public final int f90845w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f90846x;

    /* renamed from: y, reason: collision with root package name */
    public final int f90847y;

    public C0073x5080ced7(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559617a8);
    }

    public void f(n.b bVar) {
        android.view.View view = this.f90839q;
        if (view == null) {
            android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(this.f90847y, (android.view.ViewGroup) this, false);
            this.f90839q = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f90839q);
        }
        this.f90839q.findViewById(com.p314xaae8f345.mm.R.id.f564013fo).setOnClickListener(new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d(this, bVar));
        o.r rVar = (o.r) bVar.e();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar = this.f91047g;
        if (qVar != null) {
            qVar.l();
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.i iVar = qVar.B;
            if (iVar != null && iVar.b()) {
                iVar.f423244j.mo2732x63a3b28a();
            }
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar2 = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q(getContext());
        this.f91047g = qVar2;
        qVar2.f91207s = true;
        qVar2.f91208t = true;
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-2, -1);
        rVar.b(this.f91047g, this.f91045e);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar3 = this.f91047g;
        o.i0 i0Var = qVar3.f423230n;
        if (i0Var == null) {
            o.i0 i0Var2 = (o.i0) qVar3.f423226g.inflate(qVar3.f423228i, (android.view.ViewGroup) this, false);
            qVar3.f423230n = i0Var2;
            i0Var2.r(qVar3.f423225f);
            qVar3.c(true);
        }
        o.i0 i0Var3 = qVar3.f423230n;
        if (i0Var != i0Var3) {
            ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a) i0Var3).m2632x24cd7466(qVar3);
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a c0076xa566151a = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a) i0Var3;
        this.f91046f = c0076xa566151a;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.q(c0076xa566151a, null);
        addView(this.f91046f, layoutParams);
    }

    public final void g() {
        if (this.f90841s == null) {
            android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569411af, this);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) getChildAt(getChildCount() - 1);
            this.f90841s = linearLayout;
            this.f90842t = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.f563975ep);
            this.f90843u = (android.widget.TextView) this.f90841s.findViewById(com.p314xaae8f345.mm.R.id.f563974eo);
            int i17 = this.f90844v;
            if (i17 != 0) {
                this.f90842t.setTextAppearance(getContext(), i17);
            }
            int i18 = this.f90845w;
            if (i18 != 0) {
                this.f90843u.setTextAppearance(getContext(), i18);
            }
        }
        this.f90842t.setText(this.f90837o);
        this.f90843u.setText(this.f90838p);
        boolean z17 = !android.text.TextUtils.isEmpty(this.f90837o);
        boolean z18 = !android.text.TextUtils.isEmpty(this.f90838p);
        int i19 = 0;
        this.f90843u.setVisibility(z18 ? 0 : 8);
        android.widget.LinearLayout linearLayout2 = this.f90841s;
        if (!z17 && !z18) {
            i19 = 8;
        }
        linearLayout2.setVisibility(i19);
        if (this.f90841s.getParent() == null) {
            addView(this.f90841s);
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

    /* renamed from: getAnimatedVisibility */
    public int m2598xc43d5b0b() {
        return this.f91049i != null ? this.f91044d.f91039b : getVisibility();
    }

    /* renamed from: getContentHeight */
    public int m2599x964f6f4a() {
        return this.f91048h;
    }

    /* renamed from: getSubtitle */
    public java.lang.CharSequence m2600x109898e() {
        return this.f90838p;
    }

    /* renamed from: getTitle */
    public java.lang.CharSequence m2601x7531c8a2() {
        return this.f90837o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar = this.f91047g;
        if (qVar != null) {
            qVar.l();
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.i iVar = this.f91047g.B;
            if (iVar == null || !iVar.b()) {
                return;
            }
            iVar.f423244j.mo2732x63a3b28a();
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
        accessibilityEvent.setContentDescription(this.f90837o);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        boolean a17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h3.a(this);
        int paddingRight = a17 ? (i19 - i17) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i27 - i18) - getPaddingTop()) - getPaddingBottom();
        android.view.View view = this.f90839q;
        if (view != null && view.getVisibility() != 8) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f90839q.getLayoutParams();
            int i28 = a17 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i29 = a17 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i37 = a17 ? paddingRight - i28 : paddingRight + i28;
            int d17 = i37 + d(this.f90839q, i37, paddingTop, paddingTop2, a17);
            paddingRight = a17 ? d17 - i29 : d17 + i29;
        }
        int i38 = paddingRight;
        android.widget.LinearLayout linearLayout = this.f90841s;
        if (linearLayout != null && this.f90840r == null && linearLayout.getVisibility() != 8) {
            i38 += d(this.f90841s, i38, paddingTop, paddingTop2, a17);
        }
        int i39 = i38;
        android.view.View view2 = this.f90840r;
        if (view2 != null) {
            d(view2, i39, paddingTop, paddingTop2, a17);
        }
        int paddingLeft = a17 ? getPaddingLeft() : (i19 - i17) - getPaddingRight();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a c0076xa566151a = this.f91046f;
        if (c0076xa566151a != null) {
            d(c0076xa566151a, paddingLeft, paddingTop, paddingTop2, !a17);
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
        int i19 = this.f91048h;
        if (i19 <= 0) {
            i19 = android.view.View.MeasureSpec.getSize(i18);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i27 = i19 - paddingTop;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i27, Integer.MIN_VALUE);
        android.view.View view = this.f90839q;
        if (view != null) {
            int c17 = c(view, paddingLeft, makeMeasureSpec, 0);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f90839q.getLayoutParams();
            paddingLeft = c17 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a c0076xa566151a = this.f91046f;
        if (c0076xa566151a != null && c0076xa566151a.getParent() == this) {
            paddingLeft = c(this.f91046f, paddingLeft, makeMeasureSpec, 0);
        }
        android.widget.LinearLayout linearLayout = this.f90841s;
        if (linearLayout != null && this.f90840r == null) {
            if (this.f90846x) {
                this.f90841s.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f90841s.getMeasuredWidth();
                boolean z17 = measuredWidth <= paddingLeft;
                if (z17) {
                    paddingLeft -= measuredWidth;
                }
                this.f90841s.setVisibility(z17 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        android.view.View view2 = this.f90840r;
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
            this.f90840r.measure(android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, i29), android.view.View.MeasureSpec.makeMeasureSpec(i27, i38));
        }
        if (this.f91048h > 0) {
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

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b
    /* renamed from: setContentHeight */
    public void mo2602x2925d5be(int i17) {
        this.f91048h = i17;
    }

    /* renamed from: setCustomView */
    public void m2603xbe1f1fb8(android.view.View view) {
        android.widget.LinearLayout linearLayout;
        android.view.View view2 = this.f90840r;
        if (view2 != null) {
            removeView(view2);
        }
        this.f90840r = view;
        if (view != null && (linearLayout = this.f90841s) != null) {
            removeView(linearLayout);
            this.f90841s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    /* renamed from: setSubtitle */
    public void m2604xfbc1ea9a(java.lang.CharSequence charSequence) {
        this.f90838p = charSequence;
        g();
    }

    /* renamed from: setTitle */
    public void m2605x53bfe316(java.lang.CharSequence charSequence) {
        this.f90837o = charSequence;
        g();
    }

    /* renamed from: setTitleOptional */
    public void m2606x90331c96(boolean z17) {
        if (z17 != this.f90846x) {
            requestLayout();
        }
        this.f90846x = z17;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i17) {
        super.setVisibility(i17);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public C0073x5080ced7(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.graphics.drawable.Drawable drawable;
        int resourceId;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f377709d, i17, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = k.a.a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.q(this, drawable);
        this.f90844v = obtainStyledAttributes.getResourceId(5, 0);
        this.f90845w = obtainStyledAttributes.getResourceId(4, 0);
        this.f91048h = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f90847y = obtainStyledAttributes.getResourceId(2, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569415aj);
        obtainStyledAttributes.recycle();
    }
}
