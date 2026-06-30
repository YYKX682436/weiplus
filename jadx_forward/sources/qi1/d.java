package qi1;

/* loaded from: classes7.dex */
public final class d extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f445017d;

    /* renamed from: e, reason: collision with root package name */
    public qi1.a f445018e;

    /* renamed from: f, reason: collision with root package name */
    public qi1.b f445019f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 f445020g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f445021h;

    /* renamed from: i, reason: collision with root package name */
    public final qi1.c f445022i;

    /* renamed from: m, reason: collision with root package name */
    public int f445023m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f445018e = qi1.a.f445012d;
        this.f445022i = new qi1.c(this);
        super.setDescendantFocusability(262144);
    }

    public static int a(qi1.d dVar, boolean z17, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var;
        qi1.b bVar = dVar.f445019f;
        int K3 = (bVar == null || (n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12507x5a8d22f) bVar).f168099a.F()) == null) ? 0 : n7Var.K3(dVar);
        return K3 <= 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0.A(q75.a.a(dVar.getContext()), true).heightPixels : K3;
    }

    public static void b(qi1.d dVar, int i17, int i18, boolean z17, boolean z18, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = dVar.getMeasuredWidth();
        }
        if ((i19 & 2) != 0) {
            i18 = dVar.getMeasuredHeight();
        }
        if ((i19 & 4) != 0) {
            z17 = false;
        }
        if ((i19 & 8) != 0) {
            z18 = false;
        }
        if (z17) {
            dVar.f445023m = i18;
        }
        if (!dVar.f445017d) {
            boolean z19 = dVar.f445021h;
            if (!z17 || z19) {
                return;
            }
            android.view.KeyEvent.Callback childAt = dVar.getChildAt(0);
            if (childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb fbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb) childAt;
                if (fbVar.A()) {
                    fbVar.N(i17, i18);
                    return;
                }
                return;
            }
            return;
        }
        android.view.KeyEvent.Callback childAt2 = dVar.getChildAt(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb fbVar2 = childAt2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb) childAt2 : null;
        if (fbVar2 == null) {
            return;
        }
        int ordinal = dVar.f445018e.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            if (z18) {
                java.lang.String msg = "resetContentSize FitToMax width:" + i17 + " height:" + ((android.view.View) fbVar2).getMeasuredHeight();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
            }
            fbVar2.N(i17, ((android.view.View) fbVar2).getMeasuredHeight());
            return;
        }
        if (z18) {
            java.lang.String msg2 = "resetContentSize FitToLayout width:" + i17 + " height:" + i18 + " lastLayoutHeight:" + dVar.f445023m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg2, "msg");
        }
        if (!z17) {
            i18 = dVar.f445023m;
        }
        fbVar2.N(i17, i18);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new java.lang.IllegalStateException("can host only one child".toString());
    }

    /* renamed from: getEnableFixSize */
    public final boolean m160172xcdc452fd() {
        return this.f445017d;
    }

    /* renamed from: getFixedSizeMode */
    public final qi1.a m160173x3aacf922() {
        return this.f445018e;
    }

    /* renamed from: getMaxVisibleScreenHeightProvider */
    public final qi1.b m160174xf3ebe048() {
        return this.f445019f;
    }

    @Override // android.view.ViewGroup
    public void measureChild(android.view.View view, int i17, int i18) {
        if (!this.f445017d) {
            super.measureChild(view, i17, i18);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        view.measure(android.view.ViewGroup.getChildMeasureSpec(i17, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), android.view.ViewGroup.getChildMeasureSpec(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), getPaddingTop() + getPaddingBottom(), java.lang.Math.max(kz5.z.F(new int[]{Integer.MIN_VALUE, 1073741824}, android.view.View.MeasureSpec.getMode(i18)) ? android.view.View.MeasureSpec.getSize(i18) : 0, a(this, false, 1, null))));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(android.view.View view, int i17, int i18, int i19, int i27) {
        if (!this.f445017d) {
            super.measureChildWithMargins(view, i17, i18, i19, i27);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i17, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i18, marginLayoutParams.width);
        view.measure(childMeasureSpec, android.view.ViewGroup.getChildMeasureSpec(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i27, java.lang.Math.max(kz5.z.F(new int[]{Integer.MIN_VALUE, 1073741824}, android.view.View.MeasureSpec.getMode(i19)) ? android.view.View.MeasureSpec.getSize(i19) : 0, a(this, false, 1, null))));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.e(this);
        this.f445020g = e17;
        if (e17 != null) {
            e17.a(this.f445022i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 l2Var = this.f445020g;
        if (l2Var != null) {
            l2Var.g(this.f445022i);
        }
        this.f445020g = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        b(this, i19 - i17, i27 - i18, true, false, 8, null);
    }

    @Override // android.view.ViewGroup
    public void setDescendantFocusability(int i17) {
        if (getChildAt(0) instanceof android.view.ViewGroup) {
            android.view.View childAt = getChildAt(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) childAt).setDescendantFocusability(i17);
        }
    }

    /* renamed from: setEnableFixSize */
    public final void m160175x609ab971(boolean z17) {
        this.f445017d = z17;
    }

    /* renamed from: setFixedSizeMode */
    public final void m160176xcd835f96(qi1.a value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        if (this.f445018e != value) {
            java.lang.String msg = "fixedSizeMode.set " + this.f445018e + " -> " + value;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
            this.f445018e = value;
            b(this, 0, 0, false, true, 7, null);
            android.view.KeyEvent.Callback childAt = getChildAt(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb fbVar = childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb) childAt : null;
            if (fbVar != null) {
                fbVar.mo52161x9ae7be9(value == qi1.a.f445013e);
            }
        }
    }

    @Override // android.view.View
    public void setFocusable(boolean z17) {
        if (getChildAt(0) instanceof android.view.ViewGroup) {
            android.view.View childAt = getChildAt(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) childAt).setFocusable(z17);
        }
    }

    @Override // android.view.View
    public void setFocusableInTouchMode(boolean z17) {
        if (getChildAt(0) instanceof android.view.ViewGroup) {
            android.view.View childAt = getChildAt(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) childAt).setFocusableInTouchMode(z17);
        }
    }

    /* renamed from: setMaxVisibleScreenHeightProvider */
    public final void m160177xda08b054(qi1.b bVar) {
        this.f445019f = bVar;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17) {
        if (getChildCount() <= 0) {
            super.addView(view, i17);
            return;
        }
        throw new java.lang.IllegalStateException("can host only one  child".toString());
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new java.lang.IllegalStateException("can host only one child".toString());
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i17, layoutParams);
            return;
        }
        throw new java.lang.IllegalStateException("can host only one child".toString());
    }
}
