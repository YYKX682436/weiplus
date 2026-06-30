package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class f3 extends android.widget.LinearLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4 {

    /* renamed from: n, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d3 f172975n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d3(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f172976d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f172977e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f172978f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.C12775xebb90824 f172979g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.EditText f172980h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e3 f172981i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f172982m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(android.content.Context context, boolean z17, jg1.b bVar) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int hashCode = hashCode();
        this.f172976d = hashCode;
        this.f172977e = "MicroMsg.AppBrand.AppBrandSecureKeyboardPanel#" + hashCode;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.C12775xebb90824 c12775xebb90824 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.C12775xebb90824(context);
        this.f172979g = c12775xebb90824;
        super.setId(com.p314xaae8f345.mm.R.id.f564694y8);
        setOrientation(1);
        setBackgroundColor(-1);
        if (z17 && bVar != null) {
            android.view.ViewParent parent = bVar.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(bVar);
            }
            addView(bVar);
            this.f172978f = bVar;
        }
        addView(c12775xebb90824, new android.widget.LinearLayout.LayoutParams(-1, -2));
    }

    /* renamed from: getAttachedInputWidget */
    public final android.widget.EditText m53473x517ff734() {
        java.util.Objects.toString(this.f172980h);
        return this.f172980h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeAllViews();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4
    public boolean q() {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        return n3.x0.c(this);
    }

    @Override // android.view.View
    public void setId(int i17) {
    }

    /* renamed from: setInputWidget */
    public final void m53474x6430d8ec(android.widget.EditText editText) {
        java.util.Objects.toString(editText);
        this.f172980h = editText;
        this.f172979g.m121701xce4186ff(editText);
        if (editText != null) {
            editText.setShowSoftInputOnFocus(false);
        }
        if (editText != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.b(editText).hideSoftInputFromInputMethod(editText.getWindowToken(), 0);
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    /* renamed from: setOnDoneListener */
    public final void m53475x87046ad7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e3 e3Var) {
        java.util.Objects.toString(e3Var);
        this.f172981i = e3Var;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        int visibility = getVisibility();
        java.lang.String str = this.f172977e;
        if (i17 == visibility && (visibility == 0 || 8 == visibility)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setVisibility, same visibility");
            return;
        }
        if (i17 == 0) {
            super.setVisibility(i17);
            return;
        }
        super.setVisibility(8);
        if (this.f172982m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "performOnDone, performingOnDone");
            return;
        }
        this.f172982m = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e3 e3Var = this.f172981i;
        if (e3Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w2 w2Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u2) e3Var).f173206a;
            java.lang.String str2 = w2Var.f173237o;
            w2Var.p(false);
        }
        this.f172982m = false;
    }

    @Override // android.view.View
    public java.lang.String toString() {
        return "AppBrandSecureKeyboardPanel#" + this.f172976d;
    }

    public final void u(android.widget.EditText editText) {
        android.widget.EditText editText2;
        if (editText == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f172977e, "show, inputWidget is null");
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(editText, this.f172980h) && (editText2 = this.f172980h) != null) {
            editText2.clearFocus();
            this.f172980h = null;
            this.f172981i = null;
            this.f172982m = false;
        }
        m53474x6430d8ec(editText);
        setVisibility(0);
    }

    public final void v(boolean z17, jg1.b bVar) {
        if (!z17) {
            android.view.View view = this.f172978f;
            if (view != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this, view.getParent())) {
                removeView(view);
            }
            this.f172978f = null;
            return;
        }
        android.view.View view2 = this.f172978f;
        if (view2 != null) {
            android.view.ViewParent parent = view2.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view2);
            }
        }
        if (bVar != null) {
            android.view.ViewParent parent2 = bVar.getParent();
            android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(bVar);
            }
            addView(bVar, 0);
        }
        this.f172978f = bVar;
    }
}
