package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class w2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f173237o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f173238p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b3 f173239q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3 f173240r;

    /* renamed from: s, reason: collision with root package name */
    public pl1.i f173241s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f173242t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f173243u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f173244v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(java.lang.String inputType, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 pageView, pl1.f inputParams) {
        super(inputType, pageView, inputParams.Q);
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b3 b3Var;
        c01.l2 b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputType, "inputType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputParams, "inputParams");
        this.f173237o = "MicroMsg.AppBrand.AppBrandSecureInputComponent#" + this.f172966f;
        java.lang.Integer num = inputParams.X;
        java.lang.String str2 = null;
        if (num != null) {
            str = java.lang.String.format("AppBrandSecureInput#%s#%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(pageView.mo50260x9f1221c2()), num}, 2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "format(...)");
        } else {
            str = null;
        }
        this.f173238p = str;
        android.content.Context mo50352x76847179 = pageView.mo50352x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo50352x76847179, "getContext(...)");
        this.f173239q = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b3(mo50352x76847179);
        pageView.w(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.s2(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b3 b3Var2 = this.f173239q;
        if (b3Var2 != null) {
            b3Var2.m53453xc6cf6336(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t2(this));
        }
        if (str != null && (b17 = c01.n2.d().b(str)) != null) {
            str2 = b17.f("SecureInputValue", null);
        }
        if ((str2 == null || str2.length() == 0) || (b3Var = this.f173239q) == null) {
            return;
        }
        b3Var.setText(str2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    public int b() {
        pl1.i iVar = this.f173241s;
        java.lang.Integer num = iVar != null ? iVar.f438144y : null;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    public boolean c(int i17, int i18, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3 f3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b3 b3Var = this.f173239q;
        java.lang.String str = this.f173237o;
        if (b3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showKeyboard, inputWidget is null");
            return false;
        }
        java.lang.ref.WeakReference weakReference = this.f172968h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get();
        android.view.View mo51310xc2a54588 = v5Var != null ? v5Var.mo51310xc2a54588() : null;
        if (mo51310xc2a54588 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "showKeyboard, pageContentView is null");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d3 d3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3.f172975n;
        pl1.i iVar = this.f173241s;
        java.lang.Boolean bool = iVar != null ? iVar.G : null;
        boolean booleanValue = bool == null ? false : bool.booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3 b17 = d3Var.b(mo51310xc2a54588, booleanValue, v5Var2 != null ? v5Var2.V1() : null);
        this.f173240r = b17;
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "showKeyboard, keyboardPanel is null");
            return false;
        }
        this.f173243u = true;
        k();
        this.f173242t = z17;
        if (z17 && (f3Var = this.f173240r) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.C12775xebb90824 c12775xebb90824 = f3Var.f172979g;
            android.widget.TextView textView = (android.widget.TextView) c12775xebb90824.findViewById(c12775xebb90824.m121699x5db1b11("tenpay_keyboard_0"));
            textView.setTextColor(c12775xebb90824.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b5p);
            android.widget.TextView textView2 = (android.widget.TextView) c12775xebb90824.findViewById(c12775xebb90824.m121699x5db1b11("tenpay_keyboard_1"));
            textView2.setTextColor(c12775xebb90824.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            textView2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b5p);
            android.widget.TextView textView3 = (android.widget.TextView) c12775xebb90824.findViewById(c12775xebb90824.m121699x5db1b11("tenpay_keyboard_2"));
            textView3.setTextColor(c12775xebb90824.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            textView3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b5p);
            android.widget.TextView textView4 = (android.widget.TextView) c12775xebb90824.findViewById(c12775xebb90824.m121699x5db1b11("tenpay_keyboard_3"));
            textView4.setTextColor(c12775xebb90824.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            textView4.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b5p);
            android.widget.TextView textView5 = (android.widget.TextView) c12775xebb90824.findViewById(c12775xebb90824.m121699x5db1b11("tenpay_keyboard_4"));
            textView5.setTextColor(c12775xebb90824.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            textView5.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b5p);
            android.widget.TextView textView6 = (android.widget.TextView) c12775xebb90824.findViewById(c12775xebb90824.m121699x5db1b11("tenpay_keyboard_5"));
            textView6.setTextColor(c12775xebb90824.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            textView6.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b5p);
            android.widget.TextView textView7 = (android.widget.TextView) c12775xebb90824.findViewById(c12775xebb90824.m121699x5db1b11("tenpay_keyboard_6"));
            textView7.setTextColor(c12775xebb90824.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            textView7.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b5p);
            android.widget.TextView textView8 = (android.widget.TextView) c12775xebb90824.findViewById(c12775xebb90824.m121699x5db1b11("tenpay_keyboard_7"));
            textView8.setTextColor(c12775xebb90824.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            textView8.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b5p);
            android.widget.TextView textView9 = (android.widget.TextView) c12775xebb90824.findViewById(c12775xebb90824.m121699x5db1b11("tenpay_keyboard_8"));
            textView9.setTextColor(c12775xebb90824.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            textView9.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b5p);
            android.widget.TextView textView10 = (android.widget.TextView) c12775xebb90824.findViewById(c12775xebb90824.m121699x5db1b11("tenpay_keyboard_9"));
            textView10.setTextColor(c12775xebb90824.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            textView10.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b5p);
            android.widget.TextView textView11 = (android.widget.TextView) c12775xebb90824.findViewById(c12775xebb90824.m121699x5db1b11("tenpay_keyboard_x"));
            textView11.setTextColor(c12775xebb90824.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            textView11.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b5k);
            c12775xebb90824.findViewById(c12775xebb90824.m121699x5db1b11("tenpay_keyboard_d")).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b5k);
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) c12775xebb90824.findViewById(c12775xebb90824.m121699x5db1b11("tenpay_keyboard_d_inner"))).m82040x7541828(c12775xebb90824.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            c12775xebb90824.findViewById(com.p314xaae8f345.mm.R.id.f78309xcc53afe2).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77706x9d4f2621);
            c12775xebb90824.findViewById(com.p314xaae8f345.mm.R.id.f78248x15b65038).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e);
            c12775xebb90824.findViewById(com.p314xaae8f345.mm.R.id.f78252x15b65039).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e);
            c12775xebb90824.findViewById(com.p314xaae8f345.mm.R.id.f78253x15b6503a).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e);
            c12775xebb90824.findViewById(com.p314xaae8f345.mm.R.id.f78254x15b6503b).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e);
            c12775xebb90824.findViewById(com.p314xaae8f345.mm.R.id.f78255x15b6503c).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e);
            c12775xebb90824.findViewById(com.p314xaae8f345.mm.R.id.f78256x15b6503d).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e);
            c12775xebb90824.findViewById(com.p314xaae8f345.mm.R.id.f78257x15b6503e).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e);
            c12775xebb90824.findViewById(com.p314xaae8f345.mm.R.id.f78258x15b6503f).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e);
            c12775xebb90824.findViewById(com.p314xaae8f345.mm.R.id.f78259x15b65040).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e);
            c12775xebb90824.findViewById(com.p314xaae8f345.mm.R.id.f78249xa113b6f8).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e);
            c12775xebb90824.findViewById(com.p314xaae8f345.mm.R.id.f78250xa113b6f9).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e);
            c12775xebb90824.findViewById(com.p314xaae8f345.mm.R.id.f78251xa113b6fa).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3 f3Var2 = this.f173240r;
        if (f3Var2 != null) {
            f3Var2.u(this.f173239q);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3 f3Var3 = this.f173240r;
        if (f3Var3 != null) {
            f3Var3.m53475x87046ad7(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u2(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b.b(n(), i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1.b(weakReference).d(this.f172966f);
        this.f173243u = false;
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    /* renamed from: currentValue */
    public android.text.Editable mo53471x57066778() {
        android.text.Editable mo53471x57066778 = super.mo53471x57066778();
        java.util.Objects.toString(mo53471x57066778);
        return mo53471x57066778;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    /* renamed from: getInputPanel */
    public android.view.View mo53483x400bc850() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3 v17 = v();
        java.util.Objects.toString(v17);
        return v17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    /* renamed from: hideKeyboard */
    public boolean mo53484x3f895349() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3 v17 = v();
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f173237o, "hideKeyboardInternal, keyboardPanel is null");
            return false;
        }
        if (!w()) {
            return false;
        }
        v17.setVisibility(8);
        android.widget.EditText editText = v17.f172980h;
        if (editText != null) {
            editText.clearFocus();
            v17.f172980h = null;
            v17.f172981i = null;
            v17.f172982m = false;
        }
        java.util.Objects.toString(this.f173239q);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b3 b3Var = this.f173239q;
        if (b3Var != null) {
            b3Var.setFocusable(false);
            b3Var.setFocusableInTouchMode(false);
            b3Var.setEnabled(false);
        }
        r();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1.b(this.f172968h).c(this.f172966f);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    public boolean i() {
        pl1.i iVar = this.f173241s;
        if (iVar != null) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Boolean.TRUE, iVar.B);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f
    public android.widget.EditText n() {
        java.util.Objects.toString(this.f173239q);
        return this.f173239q;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f
    public android.graphics.Rect o() {
        pl1.i iVar = this.f173241s;
        if (iVar == null) {
            return null;
        }
        java.lang.Integer inputLeft = iVar.f438124e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inputLeft, "inputLeft");
        int intValue = inputLeft.intValue();
        java.lang.Integer inputTop = iVar.f438123d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inputTop, "inputTop");
        int intValue2 = inputTop.intValue();
        int intValue3 = iVar.f438124e.intValue();
        java.lang.Integer inputWidth = iVar.f438121b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inputWidth, "inputWidth");
        int intValue4 = intValue3 + inputWidth.intValue();
        int intValue5 = iVar.f438123d.intValue();
        java.lang.Integer inputHeight = iVar.f438122c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inputHeight, "inputHeight");
        return new android.graphics.Rect(intValue, intValue2, intValue4, intValue5 + inputHeight.intValue());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f
    public boolean p(boolean z17) {
        if (z17) {
            boolean w17 = w();
            if (this.f173243u || w17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f173237o, "doShowKeyboard, performingShowKeyboard: " + this.f173243u + ", isFocused: " + w17);
            } else {
                this.f173243u = true;
                c(-2, -2, this.f173242t);
                this.f173243u = false;
            }
        } else {
            u(false);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f
    public pl1.i s(pl1.i params) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b3 b3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        pl1.i iVar = this.f173241s;
        if (iVar == null) {
            this.f173241s = params;
        } else if (iVar != null) {
            iVar.a(params);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h6.f173015a.a(iVar, params);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b3 b3Var2 = this.f173239q;
        if (b3Var2 == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b.a(b3Var2, this.f173241s);
        pl1.i iVar2 = this.f173241s;
        java.lang.Integer num = iVar2 != null ? iVar2.I : null;
        if (num != null && (b3Var = this.f173239q) != null) {
            b3Var.m53452xcad46072(num.intValue());
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v2(this, num));
        return this.f173241s;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f
    public boolean t(java.lang.String str) {
        if (!(str == null || str.length() == 0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b3 b3Var = this.f173239q;
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
        boolean z18 = this.f173244v;
        java.lang.String str4 = this.f173237o;
        if (z18 || !w17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "doHideKeyboard, performingHideKeyboard: " + this.f173244v + ", isFocused: " + w17);
            return;
        }
        this.f173244v = true;
        if (z17) {
            try {
                str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.c3.a(this.f173239q, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) this.f172968h.get(), this.f173241s);
                str = null;
            } catch (java.lang.IllegalStateException e17) {
                java.lang.String message = e17.getMessage();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "dispatchKeyboardComplete, encryptErrorMsg: " + message);
                str = message;
                str2 = null;
            }
            m(mo53471x57066778(), str2, str);
        } else {
            l(mo53471x57066778());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b3 b3Var = this.f173239q;
        java.lang.String m53449x421201ab = b3Var != null ? b3Var.m53449x421201ab() : null;
        if (m53449x421201ab != null && (str3 = this.f173238p) != null) {
            c01.n2.d().c(str3, true).k("SecureInputValue", m53449x421201ab);
        }
        mo53484x3f895349();
        q();
        this.f173244v = false;
        this.f173239q = null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3 v() {
        if (this.f173240r == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b3 b3Var = this.f173239q;
            this.f173240r = b3Var != null ? b3Var.mo53433x400bc850() : null;
        }
        return this.f173240r;
    }

    public boolean w() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b3 b3Var = this.f173239q;
        if (b3Var == null) {
            return false;
        }
        if (b3Var != null && true == b3Var.isFocused()) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3 v17 = v();
        if (v17 != null && v17.isShown()) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(v17.m53473x517ff734(), this.f173239q);
        }
        return false;
    }
}
