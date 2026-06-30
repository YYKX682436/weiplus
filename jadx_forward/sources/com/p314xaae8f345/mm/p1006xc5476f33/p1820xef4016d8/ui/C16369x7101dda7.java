package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView */
/* loaded from: classes9.dex */
public class C16369x7101dda7 extends android.widget.LinearLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16351xd5aedaa0 f227677d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f227678e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f227679f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ik f227680g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 f227681h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f227682i;

    /* renamed from: m, reason: collision with root package name */
    public double f227683m;

    /* renamed from: n, reason: collision with root package name */
    public double f227684n;

    /* renamed from: o, reason: collision with root package name */
    public int f227685o;

    /* renamed from: p, reason: collision with root package name */
    public int f227686p;

    public C16369x7101dda7(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f227685o = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.e6 e6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.e6(this);
        this.f227681h = hb3.o.Ni().wi().a();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bun, (android.view.ViewGroup) this, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16351xd5aedaa0 c16351xd5aedaa0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16351xd5aedaa0) inflate.findViewById(com.p314xaae8f345.mm.R.id.j1d);
        this.f227677d = c16351xd5aedaa0;
        c16351xd5aedaa0.setTypeface(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.F(context, 7));
        this.f227677d.addTextChangedListener(e6Var);
        this.f227678e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.j2n);
        this.f227679f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.j2l);
        this.f227678e.setContentDescription(((java.lang.Object) this.f227678e.getText()) + "0");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public void a() {
        this.f227678e.setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.i(getContext()));
        this.f227677d.setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.i(getContext()));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public void b() {
        this.f227678e.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        this.f227677d.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public int c() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f227677d.getText().toString())) {
            return 0;
        }
        double m66174x7498fe14 = m66174x7498fe14();
        if (m66174x7498fe14 < 0.0d) {
            return 3;
        }
        double d17 = this.f227683m;
        if (m66174x7498fe14 <= d17 || d17 <= 0.0d) {
            return (m66174x7498fe14 >= this.f227684n || m66174x7498fe14 <= 0.0d) ? 0 : 2;
        }
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public java.lang.String d(int i17) {
        int i18 = this.f227685o;
        if (i18 == 1) {
            this.f227681h = hb3.o.Ni().Di().a();
        } else if (i18 == 2) {
            this.f227681h = hb3.o.Ni().Bi().a();
        } else {
            this.f227681h = hb3.o.Ni().wi().a();
        }
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 == 4 || i17 == 3) {
                    return getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573968gn2, this.f227678e.getText());
                }
                return null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 c1Var = this.f227681h;
            if (!((c1Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c1Var.f226727s)) ? false : true)) {
                android.content.Context context = getContext();
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(this.f227684n) + "";
                java.lang.String str = this.f227681h.f226725q;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                objArr[1] = str != null ? str : "";
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gj_, objArr);
            }
            android.content.Context context2 = getContext();
            java.lang.Object[] objArr2 = new java.lang.Object[3];
            objArr2[0] = this.f227681h.f226727s;
            objArr2[1] = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(this.f227684n) + "";
            java.lang.String str2 = this.f227681h.f226725q;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            objArr2[2] = str2 != null ? str2 : "";
            return context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gja, objArr2);
        }
        if (this.f227686p == 1) {
            android.content.Context context3 = getContext();
            java.lang.Object[] objArr3 = new java.lang.Object[2];
            objArr3[0] = java.lang.Math.round(this.f227683m) + "";
            java.lang.String str3 = this.f227681h.f226725q;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            objArr3[1] = str3 != null ? str3 : "";
            return context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.go7, objArr3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 c1Var2 = this.f227681h;
        if (!((c1Var2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c1Var2.f226727s)) ? false : true)) {
            android.content.Context context4 = getContext();
            java.lang.Object[] objArr4 = new java.lang.Object[2];
            objArr4[0] = java.lang.Math.round(this.f227683m) + "";
            java.lang.String str4 = this.f227681h.f226725q;
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            objArr4[1] = str4 != null ? str4 : "";
            return context4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gj8, objArr4);
        }
        android.content.Context context5 = getContext();
        java.lang.Object[] objArr5 = new java.lang.Object[3];
        objArr5[0] = this.f227681h.f226727s;
        objArr5[1] = java.lang.Math.round(this.f227683m) + "";
        java.lang.String str5 = this.f227681h.f226725q;
        boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr5[2] = str5 != null ? str5 : "";
        return context5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gj9, objArr5);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public int e() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f227677d.getText().toString())) {
            return 4;
        }
        double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(this.f227677d.getText().toString(), -1.0d);
        if (F <= 0.0d) {
            return 3;
        }
        double d17 = this.f227683m;
        if (F <= d17 || d17 <= 0.0d) {
            return (F >= this.f227684n || F <= 0.0d) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: getEditText */
    public android.widget.EditText m66173xdb574fcd() {
        return this.f227677d;
    }

    /* renamed from: getInput */
    public double m66174x7498fe14() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(this.f227677d.getText().toString(), 0.0d);
    }

    /* renamed from: getInputViewId */
    public int m66175xcc1739d4() {
        return getId();
    }

    /* renamed from: getMaxAmount */
    public double m66176xbdedb826() {
        return this.f227683m;
    }

    /* renamed from: setAmount */
    public void m66177x406a75a(java.lang.String str) {
        this.f227677d.setText(str);
        android.text.Editable text = this.f227677d.getText();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(text) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        this.f227677d.setSelection(java.lang.Math.min(str.length(), text.length()));
    }

    /* renamed from: setCurrencyUnitPrefix */
    public void m66178xea49d429(java.lang.String str) {
        this.f227682i = str;
        this.f227677d.m66155xa2132e2f(str);
    }

    /* renamed from: setGroupIconIv */
    public void m66179x8b7c8d23(int i17) {
        this.f227679f.setImageResource(i17);
    }

    /* renamed from: setHint */
    public void m66180x764b0e09(java.lang.String str) {
        this.f227677d.setHint(str);
    }

    /* renamed from: setMaxAmount */
    public void m66181x1a41789a(double d17) {
        this.f227683m = d17;
    }

    /* renamed from: setMaxLen */
    public void m66182x17db3113(int i17) {
        this.f227677d.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i17)});
    }

    /* renamed from: setMinAmount */
    public void m66183x484c8f08(double d17) {
        this.f227684n = d17;
    }

    /* renamed from: setOnInputValidChangerListener */
    public void m66184x4af3f603(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ik ikVar) {
        this.f227680g = ikVar;
    }

    /* renamed from: setRtxLuckyMoney */
    public void m66185x3290c48c(int i17) {
        this.f227685o = i17;
    }

    /* renamed from: setShowGroupIcon */
    public void m66186xd192c3d9(boolean z17) {
        if (z17) {
            this.f227679f.setVisibility(0);
        } else {
            this.f227679f.setVisibility(8);
        }
    }

    /* renamed from: setTitle */
    public void m66187x53bfe316(java.lang.String str) {
        this.f227678e.setText(str);
    }

    /* renamed from: setType */
    public void m66188x7650bebc(int i17) {
        this.f227686p = i17;
    }
}
