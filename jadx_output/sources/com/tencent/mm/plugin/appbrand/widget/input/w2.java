package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class w2 extends com.tencent.mm.plugin.appbrand.widget.input.f {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f91704o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f91705p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.b3 f91706q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.f3 f91707r;

    /* renamed from: s, reason: collision with root package name */
    public pl1.i f91708s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f91709t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f91710u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f91711v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(java.lang.String inputType, com.tencent.mm.plugin.appbrand.page.v5 pageView, pl1.f inputParams) {
        super(inputType, pageView, inputParams.Q);
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.widget.input.b3 b3Var;
        c01.l2 b17;
        kotlin.jvm.internal.o.g(inputType, "inputType");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        kotlin.jvm.internal.o.g(inputParams, "inputParams");
        this.f91704o = "MicroMsg.AppBrand.AppBrandSecureInputComponent#" + this.f91433f;
        java.lang.Integer num = inputParams.X;
        java.lang.String str2 = null;
        if (num != null) {
            str = java.lang.String.format("AppBrandSecureInput#%s#%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(pageView.getComponentId()), num}, 2));
            kotlin.jvm.internal.o.f(str, "format(...)");
        } else {
            str = null;
        }
        this.f91705p = str;
        android.content.Context context = pageView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f91706q = new com.tencent.mm.plugin.appbrand.widget.input.b3(context);
        pageView.w(new com.tencent.mm.plugin.appbrand.widget.input.s2(this));
        com.tencent.mm.plugin.appbrand.widget.input.b3 b3Var2 = this.f91706q;
        if (b3Var2 != null) {
            b3Var2.setListener(new com.tencent.mm.plugin.appbrand.widget.input.t2(this));
        }
        if (str != null && (b17 = c01.n2.d().b(str)) != null) {
            str2 = b17.f("SecureInputValue", null);
        }
        if ((str2 == null || str2.length() == 0) || (b3Var = this.f91706q) == null) {
            return;
        }
        b3Var.setText(str2);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public int b() {
        pl1.i iVar = this.f91708s;
        java.lang.Integer num = iVar != null ? iVar.f356611y : null;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public boolean c(int i17, int i18, boolean z17) {
        com.tencent.mm.plugin.appbrand.widget.input.f3 f3Var;
        com.tencent.mm.plugin.appbrand.widget.input.b3 b3Var = this.f91706q;
        java.lang.String str = this.f91704o;
        if (b3Var == null) {
            com.tencent.mars.xlog.Log.i(str, "showKeyboard, inputWidget is null");
            return false;
        }
        java.lang.ref.WeakReference weakReference = this.f91435h;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get();
        android.view.View contentView = v5Var != null ? v5Var.getContentView() : null;
        if (contentView == null) {
            com.tencent.mars.xlog.Log.w(str, "showKeyboard, pageContentView is null");
            return false;
        }
        com.tencent.mm.plugin.appbrand.widget.input.d3 d3Var = com.tencent.mm.plugin.appbrand.widget.input.f3.f91442n;
        pl1.i iVar = this.f91708s;
        java.lang.Boolean bool = iVar != null ? iVar.G : null;
        boolean booleanValue = bool == null ? false : bool.booleanValue();
        com.tencent.mm.plugin.appbrand.page.v5 v5Var2 = (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get();
        com.tencent.mm.plugin.appbrand.widget.input.f3 b17 = d3Var.b(contentView, booleanValue, v5Var2 != null ? v5Var2.V1() : null);
        this.f91707r = b17;
        if (b17 == null) {
            com.tencent.mars.xlog.Log.w(str, "showKeyboard, keyboardPanel is null");
            return false;
        }
        this.f91710u = true;
        k();
        this.f91709t = z17;
        if (z17 && (f3Var = this.f91707r) != null) {
            com.tencent.mm.plugin.appbrand.widget.input.AppBrandSecureKeyboard appBrandSecureKeyboard = f3Var.f91446g;
            android.widget.TextView textView = (android.widget.TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_0"));
            textView.setTextColor(appBrandSecureKeyboard.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            textView.setBackgroundResource(com.tencent.mm.R.drawable.b5p);
            android.widget.TextView textView2 = (android.widget.TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_1"));
            textView2.setTextColor(appBrandSecureKeyboard.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            textView2.setBackgroundResource(com.tencent.mm.R.drawable.b5p);
            android.widget.TextView textView3 = (android.widget.TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_2"));
            textView3.setTextColor(appBrandSecureKeyboard.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            textView3.setBackgroundResource(com.tencent.mm.R.drawable.b5p);
            android.widget.TextView textView4 = (android.widget.TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_3"));
            textView4.setTextColor(appBrandSecureKeyboard.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            textView4.setBackgroundResource(com.tencent.mm.R.drawable.b5p);
            android.widget.TextView textView5 = (android.widget.TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_4"));
            textView5.setTextColor(appBrandSecureKeyboard.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            textView5.setBackgroundResource(com.tencent.mm.R.drawable.b5p);
            android.widget.TextView textView6 = (android.widget.TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_5"));
            textView6.setTextColor(appBrandSecureKeyboard.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            textView6.setBackgroundResource(com.tencent.mm.R.drawable.b5p);
            android.widget.TextView textView7 = (android.widget.TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_6"));
            textView7.setTextColor(appBrandSecureKeyboard.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            textView7.setBackgroundResource(com.tencent.mm.R.drawable.b5p);
            android.widget.TextView textView8 = (android.widget.TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_7"));
            textView8.setTextColor(appBrandSecureKeyboard.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            textView8.setBackgroundResource(com.tencent.mm.R.drawable.b5p);
            android.widget.TextView textView9 = (android.widget.TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_8"));
            textView9.setTextColor(appBrandSecureKeyboard.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            textView9.setBackgroundResource(com.tencent.mm.R.drawable.b5p);
            android.widget.TextView textView10 = (android.widget.TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_9"));
            textView10.setTextColor(appBrandSecureKeyboard.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            textView10.setBackgroundResource(com.tencent.mm.R.drawable.b5p);
            android.widget.TextView textView11 = (android.widget.TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_x"));
            textView11.setTextColor(appBrandSecureKeyboard.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            textView11.setBackgroundResource(com.tencent.mm.R.drawable.b5k);
            appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_d")).setBackgroundResource(com.tencent.mm.R.drawable.b5k);
            ((com.tencent.mm.ui.widget.imageview.WeImageView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_d_inner"))).setIconColor(appBrandSecureKeyboard.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            appBrandSecureKeyboard.findViewById(com.tencent.mm.R.id.root_view).setBackgroundResource(com.tencent.mm.R.color.BW_BG_100);
            appBrandSecureKeyboard.findViewById(com.tencent.mm.R.id.divider1).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(com.tencent.mm.R.id.divider2).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(com.tencent.mm.R.id.divider3).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(com.tencent.mm.R.id.divider4).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(com.tencent.mm.R.id.divider5).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(com.tencent.mm.R.id.divider6).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(com.tencent.mm.R.id.divider7).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(com.tencent.mm.R.id.divider8).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(com.tencent.mm.R.id.divider9).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(com.tencent.mm.R.id.divider10).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(com.tencent.mm.R.id.divider11).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(com.tencent.mm.R.id.divider12).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
        }
        com.tencent.mm.plugin.appbrand.widget.input.f3 f3Var2 = this.f91707r;
        if (f3Var2 != null) {
            f3Var2.u(this.f91706q);
        }
        com.tencent.mm.plugin.appbrand.widget.input.f3 f3Var3 = this.f91707r;
        if (f3Var3 != null) {
            f3Var3.setOnDoneListener(new com.tencent.mm.plugin.appbrand.widget.input.u2(this));
        }
        com.tencent.mm.plugin.appbrand.widget.input.b.b(n(), i17, i18);
        com.tencent.mm.plugin.appbrand.widget.input.d1.b(weakReference).d(this.f91433f);
        this.f91710u = false;
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.f, com.tencent.mm.plugin.appbrand.widget.input.p4
    public android.text.Editable currentValue() {
        android.text.Editable currentValue = super.currentValue();
        java.util.Objects.toString(currentValue);
        return currentValue;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public android.view.View getInputPanel() {
        com.tencent.mm.plugin.appbrand.widget.input.f3 v17 = v();
        java.util.Objects.toString(v17);
        return v17;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public boolean hideKeyboard() {
        com.tencent.mm.plugin.appbrand.widget.input.f3 v17 = v();
        if (v17 == null) {
            com.tencent.mars.xlog.Log.i(this.f91704o, "hideKeyboardInternal, keyboardPanel is null");
            return false;
        }
        if (!w()) {
            return false;
        }
        v17.setVisibility(8);
        android.widget.EditText editText = v17.f91447h;
        if (editText != null) {
            editText.clearFocus();
            v17.f91447h = null;
            v17.f91448i = null;
            v17.f91449m = false;
        }
        java.util.Objects.toString(this.f91706q);
        com.tencent.mm.plugin.appbrand.widget.input.b3 b3Var = this.f91706q;
        if (b3Var != null) {
            b3Var.setFocusable(false);
            b3Var.setFocusableInTouchMode(false);
            b3Var.setEnabled(false);
        }
        r();
        com.tencent.mm.plugin.appbrand.widget.input.d1.b(this.f91435h).c(this.f91433f);
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public boolean i() {
        pl1.i iVar = this.f91708s;
        if (iVar != null) {
            return kotlin.jvm.internal.o.b(java.lang.Boolean.TRUE, iVar.B);
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.f
    public android.widget.EditText n() {
        java.util.Objects.toString(this.f91706q);
        return this.f91706q;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.f
    public android.graphics.Rect o() {
        pl1.i iVar = this.f91708s;
        if (iVar == null) {
            return null;
        }
        java.lang.Integer inputLeft = iVar.f356591e;
        kotlin.jvm.internal.o.f(inputLeft, "inputLeft");
        int intValue = inputLeft.intValue();
        java.lang.Integer inputTop = iVar.f356590d;
        kotlin.jvm.internal.o.f(inputTop, "inputTop");
        int intValue2 = inputTop.intValue();
        int intValue3 = iVar.f356591e.intValue();
        java.lang.Integer inputWidth = iVar.f356588b;
        kotlin.jvm.internal.o.f(inputWidth, "inputWidth");
        int intValue4 = intValue3 + inputWidth.intValue();
        int intValue5 = iVar.f356590d.intValue();
        java.lang.Integer inputHeight = iVar.f356589c;
        kotlin.jvm.internal.o.f(inputHeight, "inputHeight");
        return new android.graphics.Rect(intValue, intValue2, intValue4, intValue5 + inputHeight.intValue());
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.f
    public boolean p(boolean z17) {
        if (z17) {
            boolean w17 = w();
            if (this.f91710u || w17) {
                com.tencent.mars.xlog.Log.i(this.f91704o, "doShowKeyboard, performingShowKeyboard: " + this.f91710u + ", isFocused: " + w17);
            } else {
                this.f91710u = true;
                c(-2, -2, this.f91709t);
                this.f91710u = false;
            }
        } else {
            u(false);
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.f
    public pl1.i s(pl1.i params) {
        com.tencent.mm.plugin.appbrand.widget.input.b3 b3Var;
        kotlin.jvm.internal.o.g(params, "params");
        pl1.i iVar = this.f91708s;
        if (iVar == null) {
            this.f91708s = params;
        } else if (iVar != null) {
            iVar.a(params);
            com.tencent.mm.plugin.appbrand.widget.input.h6.f91482a.a(iVar, params);
        }
        com.tencent.mm.plugin.appbrand.widget.input.b3 b3Var2 = this.f91706q;
        if (b3Var2 == null) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.widget.input.b.a(b3Var2, this.f91708s);
        pl1.i iVar2 = this.f91708s;
        java.lang.Integer num = iVar2 != null ? iVar2.I : null;
        if (num != null && (b3Var = this.f91706q) != null) {
            b3Var.setLength$luggage_wxa_app_input_ext_release(num.intValue());
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.widget.input.v2(this, num));
        return this.f91708s;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.f
    public boolean t(java.lang.String str) {
        if (!(str == null || str.length() == 0)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.widget.input.b3 b3Var = this.f91706q;
        if (b3Var != null) {
            b3Var.setText(str);
        }
        return true;
    }

    public final void u(boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean w17 = w();
        boolean z18 = this.f91711v;
        java.lang.String str4 = this.f91704o;
        if (z18 || !w17) {
            com.tencent.mars.xlog.Log.i(str4, "doHideKeyboard, performingHideKeyboard: " + this.f91711v + ", isFocused: " + w17);
            return;
        }
        this.f91711v = true;
        if (z17) {
            try {
                str2 = com.tencent.mm.plugin.appbrand.widget.input.c3.a(this.f91706q, (com.tencent.mm.plugin.appbrand.page.v5) this.f91435h.get(), this.f91708s);
                str = null;
            } catch (java.lang.IllegalStateException e17) {
                java.lang.String message = e17.getMessage();
                com.tencent.mars.xlog.Log.i(str4, "dispatchKeyboardComplete, encryptErrorMsg: " + message);
                str = message;
                str2 = null;
            }
            m(currentValue(), str2, str);
        } else {
            l(currentValue());
        }
        com.tencent.mm.plugin.appbrand.widget.input.b3 b3Var = this.f91706q;
        java.lang.String realText$luggage_wxa_app_input_ext_release = b3Var != null ? b3Var.getRealText$luggage_wxa_app_input_ext_release() : null;
        if (realText$luggage_wxa_app_input_ext_release != null && (str3 = this.f91705p) != null) {
            c01.n2.d().c(str3, true).k("SecureInputValue", realText$luggage_wxa_app_input_ext_release);
        }
        hideKeyboard();
        q();
        this.f91711v = false;
        this.f91706q = null;
    }

    public final com.tencent.mm.plugin.appbrand.widget.input.f3 v() {
        if (this.f91707r == null) {
            com.tencent.mm.plugin.appbrand.widget.input.b3 b3Var = this.f91706q;
            this.f91707r = b3Var != null ? b3Var.getInputPanel() : null;
        }
        return this.f91707r;
    }

    public boolean w() {
        com.tencent.mm.plugin.appbrand.widget.input.b3 b3Var = this.f91706q;
        if (b3Var == null) {
            return false;
        }
        if (b3Var != null && true == b3Var.isFocused()) {
            return true;
        }
        com.tencent.mm.plugin.appbrand.widget.input.f3 v17 = v();
        if (v17 != null && v17.isShown()) {
            return kotlin.jvm.internal.o.b(v17.getAttachedInputWidget(), this.f91706q);
        }
        return false;
    }
}
