package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class f3 extends android.widget.LinearLayout implements com.tencent.mm.plugin.appbrand.widget.input.u4 {

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.widget.input.d3 f91442n = new com.tencent.mm.plugin.appbrand.widget.input.d3(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f91443d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f91444e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f91445f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.AppBrandSecureKeyboard f91446g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.EditText f91447h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.e3 f91448i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f91449m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(android.content.Context context, boolean z17, jg1.b bVar) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        int hashCode = hashCode();
        this.f91443d = hashCode;
        this.f91444e = "MicroMsg.AppBrand.AppBrandSecureKeyboardPanel#" + hashCode;
        com.tencent.mm.plugin.appbrand.widget.input.AppBrandSecureKeyboard appBrandSecureKeyboard = new com.tencent.mm.plugin.appbrand.widget.input.AppBrandSecureKeyboard(context);
        this.f91446g = appBrandSecureKeyboard;
        super.setId(com.tencent.mm.R.id.f483161y8);
        setOrientation(1);
        setBackgroundColor(-1);
        if (z17 && bVar != null) {
            android.view.ViewParent parent = bVar.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(bVar);
            }
            addView(bVar);
            this.f91445f = bVar;
        }
        addView(appBrandSecureKeyboard, new android.widget.LinearLayout.LayoutParams(-1, -2));
    }

    public final android.widget.EditText getAttachedInputWidget() {
        java.util.Objects.toString(this.f91447h);
        return this.f91447h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeAllViews();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u4
    public boolean q() {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        return n3.x0.c(this);
    }

    @Override // android.view.View
    public void setId(int i17) {
    }

    public final void setInputWidget(android.widget.EditText editText) {
        java.util.Objects.toString(editText);
        this.f91447h = editText;
        this.f91446g.setInputEditText(editText);
        if (editText != null) {
            editText.setShowSoftInputOnFocus(false);
        }
        if (editText != null) {
            com.tencent.mm.plugin.appbrand.widget.input.m5.b(editText).hideSoftInputFromInputMethod(editText.getWindowToken(), 0);
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    public final void setOnDoneListener(com.tencent.mm.plugin.appbrand.widget.input.e3 e3Var) {
        java.util.Objects.toString(e3Var);
        this.f91448i = e3Var;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        int visibility = getVisibility();
        java.lang.String str = this.f91444e;
        if (i17 == visibility && (visibility == 0 || 8 == visibility)) {
            com.tencent.mars.xlog.Log.i(str, "setVisibility, same visibility");
            return;
        }
        if (i17 == 0) {
            super.setVisibility(i17);
            return;
        }
        super.setVisibility(8);
        if (this.f91449m) {
            com.tencent.mars.xlog.Log.i(str, "performOnDone, performingOnDone");
            return;
        }
        this.f91449m = true;
        com.tencent.mm.plugin.appbrand.widget.input.e3 e3Var = this.f91448i;
        if (e3Var != null) {
            com.tencent.mm.plugin.appbrand.widget.input.w2 w2Var = ((com.tencent.mm.plugin.appbrand.widget.input.u2) e3Var).f91673a;
            java.lang.String str2 = w2Var.f91704o;
            w2Var.p(false);
        }
        this.f91449m = false;
    }

    @Override // android.view.View
    public java.lang.String toString() {
        return "AppBrandSecureKeyboardPanel#" + this.f91443d;
    }

    public final void u(android.widget.EditText editText) {
        android.widget.EditText editText2;
        if (editText == null) {
            com.tencent.mars.xlog.Log.i(this.f91444e, "show, inputWidget is null");
            return;
        }
        if (!kotlin.jvm.internal.o.b(editText, this.f91447h) && (editText2 = this.f91447h) != null) {
            editText2.clearFocus();
            this.f91447h = null;
            this.f91448i = null;
            this.f91449m = false;
        }
        setInputWidget(editText);
        setVisibility(0);
    }

    public final void v(boolean z17, jg1.b bVar) {
        if (!z17) {
            android.view.View view = this.f91445f;
            if (view != null && kotlin.jvm.internal.o.b(this, view.getParent())) {
                removeView(view);
            }
            this.f91445f = null;
            return;
        }
        android.view.View view2 = this.f91445f;
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
        this.f91445f = bVar;
    }
}
