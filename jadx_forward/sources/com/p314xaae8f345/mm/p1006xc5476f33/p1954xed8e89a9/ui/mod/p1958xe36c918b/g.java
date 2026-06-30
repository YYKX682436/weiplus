package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b;

/* loaded from: classes11.dex */
public final class g extends kr3.t {

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f235592r;

    /* renamed from: s, reason: collision with root package name */
    public final android.text.TextWatcher f235593s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f235594t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f235593s = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.f(this);
        this.f235594t = new int[3];
    }

    @Override // kr3.t
    public void P6(xg3.q0 op6, com.p314xaae8f345.mm.p944x882e457a.f cgiBack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(op6, "op");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiBack, "cgiBack");
        super.P6(op6, cgiBack);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) this.f393013h;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518214g, vg3.b.f518179f, l7(java.lang.String.valueOf(c21503x6e5a020a != null ? c21503x6e5a020a.m79028xfb85ada3() : null), this.f235592r), cgiBack.f152149b, kz5.b0.c(m144228x6c03c64c())));
    }

    @Override // kr3.t
    public java.lang.Object R6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) this.f393013h;
        if (c21503x6e5a020a == null) {
            return java.lang.Boolean.FALSE;
        }
        java.lang.String obj = c21503x6e5a020a.m79028xfb85ada3().toString();
        com.p314xaae8f345.mm.p670x38b72420.o U6 = U6();
        if (U6 == null) {
            return java.lang.Boolean.FALSE;
        }
        yq3.v vVar = (yq3.v) U6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "<set-?>");
        vVar.f546082t.b(vVar, yq3.v.f546062z[1], obj);
        return java.lang.Boolean.TRUE;
    }

    @Override // kr3.t
    public java.lang.Object S6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.b(this, null), interfaceC29045xdcb5ca57);
        return g17 == pz5.a.f440719d ? g17 : jz5.f0.f384359a;
    }

    @Override // kr3.t
    public java.lang.String V6() {
        return "ModDescriptionUIC";
    }

    @Override // kr3.t
    public xg3.q0 W6() {
        yq3.v vVar;
        java.lang.String h17;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) this.f393013h;
        if (c21503x6e5a020a == null) {
            return null;
        }
        java.lang.String newDesc = c21503x6e5a020a.m79028xfb85ada3().toString();
        com.p314xaae8f345.mm.p670x38b72420.o U6 = U6();
        if (U6 == null || (h17 = (vVar = (yq3.v) U6).h()) == null || !vVar.k()) {
            return null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518214g, vg3.b.f518178e, l7(newDesc, this.f235592r), 0, kz5.b0.c(h17), 8, null));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newDesc, "newDesc");
        r45.wn4 wn4Var = new r45.wn4();
        wn4Var.f470844d = h17;
        wn4Var.f470845e = newDesc;
        return new xg3.p0(54, wn4Var);
    }

    @Override // kr3.t
    public lr3.a Y6() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.c(this);
    }

    @Override // kr3.t
    public boolean Z6() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) this.f393013h;
        if (c21503x6e5a020a == null) {
            return false;
        }
        java.lang.String obj = c21503x6e5a020a.m79028xfb85ada3().toString();
        java.lang.String str = this.f235592r;
        if (str == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, obj)) {
            return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235592r) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) ? false : true;
        }
        return false;
    }

    @Override // kr3.t
    public boolean a7() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) this.f393013h;
        return (c21503x6e5a020a == null || c21503x6e5a020a.c()) ? false : true;
    }

    @Override // kr3.t
    public android.view.View b7(java.lang.String username, com.p314xaae8f345.mm.p670x38b72420.o contact) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = new com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a(m158354x19263085(), null, 2, null);
        c21503x6e5a020a.m79041xdb583a52(c21503x6e5a020a.getResources().getInteger(com.p314xaae8f345.mm.R.C30862x74b5813e.f569352y));
        c21503x6e5a020a.getEditText().setInputType(131073);
        c21503x6e5a020a.m79033x764b0e09(i65.a.r(m158354x19263085(), com.p314xaae8f345.mm.R.C30867xcad56011.gxw));
        c21503x6e5a020a.getEditText().setImeOptions(5);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21525x1d56253b editText = c21503x6e5a020a.getEditText();
        int d17 = i65.a.d(m158354x19263085(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
        editText.setTextColor(d17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
        c21503x6e5a020a.m79034x5afba1b1(false);
        c21503x6e5a020a.m79038x938e106e(false);
        c21503x6e5a020a.getEditText().setMinimumHeight(c21503x6e5a020a.getEditText().getLineHeight());
        c21503x6e5a020a.getEditText().setMaxHeight(c21503x6e5a020a.getEditText().getLineHeight() * 10);
        c21503x6e5a020a.setId(com.p314xaae8f345.mm.R.id.d98);
        this.f235592r = ((yq3.v) contact).f();
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        java.lang.String str = this.f235592r;
        ((ke0.e) xVar).getClass();
        c21503x6e5a020a.m79039x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m158354x19263085, str));
        c21503x6e5a020a.m79037xf579a34a(c21503x6e5a020a.m79028xfb85ada3().length());
        c21503x6e5a020a.b(this.f235593s);
        c21503x6e5a020a.m79031xa58772b(false);
        int f17 = i65.a.f(m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        android.widget.TextView textView = this.f393011f;
        if (textView != null) {
            textView.setPadding(f17, 0, f17, 0);
        }
        return c21503x6e5a020a;
    }

    @Override // kr3.t
    public void c7() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) this.f393013h;
        if (c21503x6e5a020a == null) {
            return;
        }
        java.lang.String digest = m158359x1e885992().getStringExtra("Contact_verify_string");
        if (digest == null || r26.n0.N(digest)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.p7 b17 = r21.w.Ai().b1(m144228x6c03c64c());
            if (b17 == null) {
                return;
            }
            y35.r c17 = y35.r.c(m158354x19263085(), b17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f540766b) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17.f540766b, m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.fbh))) {
                return;
            }
            digest = c17.f540766b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(digest, "digest");
        }
        if (x51.t1.b(digest)) {
            return;
        }
        this.f235594t[0] = 1;
        android.widget.TextView textView = this.f393011f;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = this.f393011f;
        if (textView2 != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            java.lang.String string = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bh9, digest);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (string == null) {
                string = "";
            }
            ((ke0.e) xVar).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m158354x19263085, string));
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.la7));
        f0Var.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.a(m158354x19263085(), digest, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.d(c21503x6e5a020a), new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.e(this, c21503x6e5a020a)), 0, f0Var.length(), 17);
        android.widget.TextView textView3 = this.f393011f;
        if (textView3 != null) {
            textView3.append(" ");
        }
        android.widget.TextView textView4 = this.f393011f;
        if (textView4 != null) {
            textView4.append(f0Var);
        }
        android.widget.TextView textView5 = this.f393011f;
        if (textView5 == null) {
            return;
        }
        textView5.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    @Override // kr3.t
    public void e7() {
        super.e7();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_get_desc_report_data", this.f235594t);
        m158354x19263085().setResult(-1, intent);
    }

    @Override // kr3.t
    public void f7(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6829x19be670f struct) {
        java.lang.CharSequence m79028xfb85ada3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) this.f393013h;
        struct.f141513s = (c21503x6e5a020a == null || (m79028xfb85ada3 = c21503x6e5a020a.m79028xfb85ada3()) == null) ? 0L : m79028xfb85ada3.length();
    }

    @Override // kr3.t
    public int i7() {
        return 41;
    }

    @Override // kr3.t
    public int k7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.gxx;
    }

    public final vg3.c l7(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String obj;
        java.lang.String str4 = null;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null || !(!r26.n0.N(str3))) {
            str3 = null;
        }
        if (str2 != null && (obj = r26.n0.u0(str2).toString()) != null && (!r26.n0.N(obj))) {
            str4 = obj;
        }
        return (str3 == null || str4 != null) ? (str3 != null || str4 == null) ? (str3 == null || str4 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, str4)) ? vg3.c.I : vg3.c.K : vg3.c.f518185J : vg3.c.I;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) this.f393013h;
        if (c21503x6e5a020a != null) {
            c21503x6e5a020a.e(this.f235593s);
        }
    }
}
