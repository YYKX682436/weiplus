package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView */
/* loaded from: classes9.dex */
public class C16388xef85efa1 extends android.widget.LinearLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f228026d;

    /* renamed from: e, reason: collision with root package name */
    public com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 f228027e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f228028f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ik f228029g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 f228030h;

    /* renamed from: i, reason: collision with root package name */
    public int f228031i;

    /* renamed from: m, reason: collision with root package name */
    public int f228032m;

    /* renamed from: n, reason: collision with root package name */
    public int f228033n;

    /* renamed from: o, reason: collision with root package name */
    public int f228034o;

    /* renamed from: p, reason: collision with root package name */
    public int f228035p;

    public C16388xef85efa1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f228031i = 1;
        this.f228032m = Integer.MAX_VALUE;
        this.f228033n = 1;
        this.f228034o = 0;
        this.f228035p = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.hk hkVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.hk(this);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.buw, (android.view.ViewGroup) this, true);
        this.f228026d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567340j51);
        this.f228027e = (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359) inflate.findViewById(com.p314xaae8f345.mm.R.id.j1d);
        this.f228028f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567341j52);
        this.f228027e.setText(this.f228031i + "");
        ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.j2o)).setVisibility(0);
        this.f228027e.addTextChangedListener(hkVar);
        this.f228026d.setContentDescription(((java.lang.Object) this.f228026d.getText()) + "0" + ((java.lang.Object) this.f228028f.getText()));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public void a() {
        this.f228026d.setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.i(getContext()));
        this.f228027e.setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.i(getContext()));
        this.f228028f.setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.i(getContext()));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public void b() {
        this.f228026d.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        this.f228027e.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        this.f228028f.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public int c() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f228027e.getText().toString())) {
            return 0;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(this.f228027e.getText().toString(), -1);
        if (P < 0) {
            return 3;
        }
        int i17 = this.f228035p;
        if (P > i17 && i17 > 0) {
            return 5;
        }
        int i18 = this.f228032m;
        if (P > i18 && i18 > 0) {
            return 1;
        }
        int i19 = this.f228033n;
        return (P >= i19 || i19 <= 0) ? 0 : 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public java.lang.String d(int i17) {
        int i18 = this.f228034o;
        if (i18 == 1) {
            this.f228030h = hb3.o.Ni().Di().a();
        } else if (i18 == 2) {
            this.f228030h = hb3.o.Ni().Bi().a();
        } else {
            this.f228030h = hb3.o.Ni().wi().a();
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 c1Var = this.f228030h;
            return (c1Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c1Var.f226727s)) ? false : true ? getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gmg, java.lang.Integer.valueOf(this.f228032m), this.f228030h.f226727s) : getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gmf, java.lang.Integer.valueOf(this.f228032m));
        }
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 c1Var2 = this.f228030h;
            return (c1Var2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c1Var2.f226727s)) ? false : true ? getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gme, java.lang.Integer.valueOf(this.f228033n), this.f228030h.f226727s) : getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gmd);
        }
        if (i17 == 4 || i17 == 3) {
            return getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573968gn2, this.f228026d.getText());
        }
        if (i17 != 5) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 c1Var3 = this.f228030h;
        return (c1Var3 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c1Var3.f226727s)) ? false : true ? getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gma, this.f228030h.f226727s) : getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gm_);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public int e() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f228027e.getText().toString())) {
            return 4;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(this.f228027e.getText().toString(), -1);
        if (P <= 0) {
            return 3;
        }
        int i17 = this.f228032m;
        if (P > i17 && i17 > 0) {
            return 1;
        }
        int i18 = this.f228035p;
        if (P > i18 && i18 > 0) {
            return 5;
        }
        int i19 = this.f228033n;
        return (P >= i19 || i19 <= 0) ? 0 : 2;
    }

    /* renamed from: getEditText */
    public android.widget.EditText m66198xdb574fcd() {
        return this.f228027e;
    }

    /* renamed from: getInput */
    public int m66199x7498fe14() {
        try {
            return java.lang.Integer.parseInt(this.f228027e.getText().toString(), 10);
        } catch (java.lang.NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: getInputViewId */
    public int m66200xcc1739d4() {
        return getId();
    }

    /* renamed from: setGroupChatNumber */
    public void m66201xf5bae3de(int i17) {
        this.f228035p = i17;
    }

    /* renamed from: setHint */
    public void m66202x764b0e09(java.lang.String str) {
        this.f228027e.setHint(str);
    }

    /* renamed from: setMaxNum */
    public void m66203x17db3a84(int i17) {
        this.f228032m = i17;
        int i18 = 0;
        while (i17 > 0) {
            i18++;
            i17 /= 10;
        }
        if (i18 <= 3) {
            i18 = 3;
        }
        this.f228027e.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i18)});
    }

    /* renamed from: setMinNum */
    public void m66204x18476ad6(int i17) {
        this.f228033n = i17;
    }

    /* renamed from: setNum */
    public void m66205xca0283c4(java.lang.String str) {
        this.f228027e.setText(str);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f228027e;
        c28001xdd2bb359.setSelection(c28001xdd2bb359.getText().length());
        this.f228031i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0);
    }

    /* renamed from: setOnInputValidChangerListener */
    public void m66206x4af3f603(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ik ikVar) {
        this.f228029g = ikVar;
    }

    /* renamed from: setRtxLuckyMoney */
    public void m66207x3290c48c(int i17) {
        this.f228034o = i17;
    }
}
