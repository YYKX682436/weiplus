package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView */
/* loaded from: classes9.dex */
public class C16323xdfbab327 extends android.widget.LinearLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6 {

    /* renamed from: d, reason: collision with root package name */
    public com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 f226538d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f226539e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f226540f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f226541g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ik f226542h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 f226543i;

    /* renamed from: m, reason: collision with root package name */
    public double f226544m;

    /* renamed from: n, reason: collision with root package name */
    public double f226545n;

    /* renamed from: o, reason: collision with root package name */
    public lb3.i f226546o;

    public C16323xdfbab327(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        mb3.b bVar = new mb3.b(this);
        this.f226543i = hb3.o.Ni().wi().a();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d_p, (android.view.ViewGroup) this, true);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359) inflate.findViewById(com.p314xaae8f345.mm.R.id.j1d);
        this.f226538d = c28001xdd2bb359;
        c28001xdd2bb359.addTextChangedListener(bVar);
        this.f226539e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.j2n);
        this.f226541g = inflate.findViewById(com.p314xaae8f345.mm.R.id.j2l);
        this.f226540f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567289iy3);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public void a() {
        this.f226539e.setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.i(getContext()));
        this.f226538d.setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.i(getContext()));
        this.f226540f.setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.i(getContext()));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public void b() {
        this.f226539e.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        this.f226538d.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        this.f226540f.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public int c() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f226538d.getText().toString())) {
            return 0;
        }
        double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(this.f226538d.getText().toString(), -1.0d);
        if (F < 0.0d) {
            return 3;
        }
        double d17 = this.f226544m;
        if (F <= d17 || d17 <= 0.0d) {
            return (F >= this.f226545n || F <= 0.0d) ? 0 : 2;
        }
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public java.lang.String d(int i17) {
        this.f226543i = hb3.o.Ni().wi().a();
        if (i17 != 1) {
            if (i17 != 2) {
                return null;
            }
            android.content.Context context = getContext();
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(this.f226545n) + "";
            java.lang.String str = this.f226543i.f226725q;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            objArr[1] = str != null ? str : "";
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gj_, objArr);
        }
        if (this.f226546o == lb3.i.RANDOM_LUCK) {
            android.content.Context context2 = getContext();
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = java.lang.Math.round(this.f226544m) + "";
            java.lang.String str2 = this.f226543i.f226725q;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            objArr2[1] = str2 != null ? str2 : "";
            return context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.go7, objArr2);
        }
        android.content.Context context3 = getContext();
        java.lang.Object[] objArr3 = new java.lang.Object[2];
        objArr3[0] = java.lang.Math.round(this.f226544m) + "";
        java.lang.String str3 = this.f226543i.f226725q;
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr3[1] = str3 != null ? str3 : "";
        return context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gj8, objArr3);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public int e() {
        return c();
    }

    /* renamed from: getInput */
    public double m66033x7498fe14() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(this.f226538d.getText().toString(), 0.0d);
    }

    /* renamed from: getInputViewId */
    public int m66034xcc1739d4() {
        return getId();
    }

    /* renamed from: setAmount */
    public void m66035x406a75a(java.lang.String str) {
        this.f226538d.setText(str);
    }

    /* renamed from: setHint */
    public void m66036x764b0e09(java.lang.String str) {
        this.f226538d.setHint(str);
    }

    /* renamed from: setMaxAmount */
    public void m66037x1a41789a(double d17) {
        this.f226544m = d17;
    }

    /* renamed from: setMaxLen */
    public void m66038x17db3113(int i17) {
        this.f226538d.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i17)});
    }

    /* renamed from: setMinAmount */
    public void m66039x484c8f08(double d17) {
        this.f226545n = d17;
    }

    /* renamed from: setOnInputValidChangerListener */
    public void m66040x4af3f603(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ik ikVar) {
        this.f226542h = ikVar;
    }

    /* renamed from: setShowGroupIcon */
    public void m66041xd192c3d9(boolean z17) {
        if (z17) {
            android.view.View view = this.f226541g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyMoneyInputView", "setShowGroupIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyMoneyInputView", "setShowGroupIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f226541g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyMoneyInputView", "setShowGroupIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyMoneyInputView", "setShowGroupIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: setTitle */
    public void m66042x53bfe316(java.lang.String str) {
        this.f226539e.setText(str);
    }

    /* renamed from: setType */
    public void m66043x7650bebc(lb3.i iVar) {
        this.f226546o = iVar;
    }
}
