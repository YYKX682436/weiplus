package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316;

/* loaded from: classes11.dex */
public final class k1 extends kr3.j {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f235475u = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f235476r;

    /* renamed from: s, reason: collision with root package name */
    public final android.text.TextWatcher f235477s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f235478t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f235477s = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.j1(this);
        this.f235478t = new java.util.ArrayList();
    }

    @Override // kr3.j
    public void O6() {
        java.lang.String m144223x6c03c64c;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18;
        if (!Q6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ModRemarkUI", "canUseRecommendRemark(): false");
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) this.f392926h;
        if (c21503x6e5a020a == null || (m144223x6c03c64c = m144223x6c03c64c()) == null || (c21475x81dbaa18 = this.f392923e) == null) {
            return;
        }
        c21475x81dbaa18.setVisibility(0);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(gc0.p2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        gc0.p2 p2Var = (gc0.p2) a17;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 U6 = U6();
        p2Var.W6(new gc0.b0(m144223x6c03c64c, U6 != null ? U6.f2() : null), c21475x81dbaa18, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.g1(c21503x6e5a020a), new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.h1(this), null);
    }

    @Override // kr3.j
    public void P6(xg3.q0 op6, com.p314xaae8f345.mm.p944x882e457a.f cgiBack) {
        r45.du5 du5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(op6, "op");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiBack, "cgiBack");
        super.P6(op6, cgiBack);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = op6.f535964j;
        java.lang.String str = null;
        r45.tn4 tn4Var = fVar instanceof r45.tn4 ? (r45.tn4) fVar : null;
        if (tn4Var != null && (du5Var = tn4Var.f468132p) != null) {
            str = du5Var.f454289d;
        }
        if (str == null) {
            str = "";
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518214g, vg3.b.f518179f, m7(str, this.f235476r), cgiBack.f152149b, kz5.b0.c(m144223x6c03c64c())));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kr3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object R6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.k1.R6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kr3.j
    public java.lang.Object S6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.a1(this, null), interfaceC29045xdcb5ca57);
    }

    @Override // kr3.j
    public void T6(yz5.l onResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onResult, "onResult");
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("contact_set_remark_from_recommend");
        if (stringExtra == null) {
            onResult.mo146xb9724478(0);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ModRemarkUI", "recommend remark: ".concat(stringExtra));
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 U6 = U6();
        java.lang.String w07 = U6 != null ? U6.w0() : null;
        if (w07 == null) {
            w07 = "";
        }
        if (!r26.n0.N(stringExtra)) {
            if (!r26.n0.B(w07, stringExtra, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ModRemarkUI", "current remark does not contains recommend remark, len: " + w07.length());
                if (w07.length() > 0) {
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) this.f392926h;
                    if (c21503x6e5a020a != null) {
                        c21503x6e5a020a.m79040x765074af(w07 + ' ' + stringExtra);
                    }
                } else {
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) this.f392926h;
                    if (c21503x6e5a020a2 != null) {
                        c21503x6e5a020a2.m79040x765074af(stringExtra);
                    }
                }
                ((java.util.ArrayList) this.f235478t).add(stringExtra);
                onResult.mo146xb9724478(1);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ModRemarkUI", "current remark contains recommend remark, len: " + w07.length());
        }
        onResult.mo146xb9724478(0);
    }

    @Override // kr3.j
    public java.lang.String V6() {
        return "ModRemarkUIC";
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r2.r2() == true) goto L14;
     */
    @Override // kr3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xg3.q0 X6() {
        /*
            r12 = this;
            android.view.View r0 = r12.f392926h
            com.tencent.mm.ui.base.MMLimitedClearEditText r0 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) r0
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.CharSequence r0 = r0.m79028xfb85ada3()
            java.lang.String r0 = r0.toString()
            int r2 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.g(r0)
            android.content.res.Resources r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e
            r4 = 2131361815(0x7f0a0017, float:1.8343393E38)
            int r3 = r3.getInteger(r4)
            if (r2 <= r3) goto L20
            return r1
        L20:
            com.tencent.mm.storage.z3 r2 = r12.W6()
            if (r2 == 0) goto L2e
            boolean r3 = r2.r2()
            r4 = 1
            if (r3 != r4) goto L2e
            goto L2f
        L2e:
            r4 = 0
        L2f:
            if (r4 == 0) goto L6f
            java.lang.String r3 = r2.d1()
            boolean r3 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(r3)
            if (r3 != 0) goto L6f
            vg3.m3 r1 = vg3.n3.f518269n1
            vg3.n3 r1 = r1.a()
            vg3.e r11 = new vg3.e
            vg3.d r4 = vg3.d.f518214g
            vg3.b r5 = vg3.b.f518178e
            java.lang.String r3 = r12.f235476r
            vg3.c r6 = r12.m7(r0, r3)
            r7 = 0
            java.lang.String r3 = r2.d1()
            java.util.List r8 = kz5.b0.c(r3)
            r9 = 8
            r10 = 0
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.tencent.mm.plugin.messenger.foundation.g r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) r1
            r1.wi(r11)
            r2.n1(r0)
            xg3.p0 r1 = new xg3.p0
            r45.tn4 r0 = c01.e2.n(r2)
            r2 = 2
            r1.<init>(r2, r0)
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.k1.X6():xg3.q0");
    }

    @Override // kr3.j
    public lr3.a Z6() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.d1(this);
    }

    @Override // kr3.j
    public boolean a7() {
        return n7();
    }

    @Override // kr3.j
    public boolean b7() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) this.f392926h;
        return (c21503x6e5a020a == null || c21503x6e5a020a.c()) ? false : true;
    }

    @Override // kr3.j
    public android.view.View c7(java.lang.String username, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = new com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a(m158354x19263085(), null, 2, null);
        c21503x6e5a020a.m79041xdb583a52(c21503x6e5a020a.getResources().getInteger(com.p314xaae8f345.mm.R.C30862x74b5813e.f569354a0));
        c21503x6e5a020a.getEditText().setInputType(131073);
        c21503x6e5a020a.m79035x25bfb969(i65.a.f(m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.ao9));
        c21503x6e5a020a.m79033x764b0e09(i65.a.r(m158354x19263085(), com.p314xaae8f345.mm.R.C30867xcad56011.f574084gy1));
        c21503x6e5a020a.getEditText().setImeOptions(5);
        c21503x6e5a020a.m79034x5afba1b1(true);
        c21503x6e5a020a.m79038x938e106e(true);
        java.lang.String w07 = contact.w0();
        if (w07 == null) {
            w07 = "";
        }
        if (w07.length() > 0) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            ((ke0.e) xVar).getClass();
            c21503x6e5a020a.m79039x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m158354x19263085, w07));
            this.f235476r = w07;
        }
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20630xe35b63ae()) == 1) {
            c21503x6e5a020a.m79034x5afba1b1(false);
            c21503x6e5a020a.m79033x764b0e09(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f574084gy1));
        } else {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            java.lang.String f27 = contact.f2();
            java.lang.String str = f27 != null ? f27 : "";
            ((ke0.e) xVar2).getClass();
            c21503x6e5a020a.m79033x764b0e09(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m158354x192630852, str));
        }
        c21503x6e5a020a.m79037xf579a34a(c21503x6e5a020a.m79028xfb85ada3().length());
        c21503x6e5a020a.b(this.f235477s);
        c21503x6e5a020a.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.i1(this));
        c21503x6e5a020a.m79031xa58772b(false);
        android.widget.TextView textView = this.f392924f;
        if (textView != null) {
            int h17 = i65.a.h(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.aii);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLayout_marginLeft", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = h17;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLayout_marginLeft", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        }
        return c21503x6e5a020a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // kr3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d7() {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.k1.d7():void");
    }

    @Override // kr3.j
    public void g7(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6829x19be670f struct) {
        java.lang.String str;
        long j17;
        java.lang.CharSequence m79028xfb85ada3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) this.f392926h;
        if (c21503x6e5a020a == null || (m79028xfb85ada3 = c21503x6e5a020a.m79028xfb85ada3()) == null || (str = m79028xfb85ada3.toString()) == null) {
            str = "";
        }
        if (n7()) {
            java.util.List list = this.f235478t;
            boolean z17 = false;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (r26.n0.B(str, (java.lang.String) it.next(), false)) {
                        z17 = true;
                        break;
                    }
                }
            }
            j17 = z17 ? 1L : 2L;
        } else {
            j17 = 3;
        }
        struct.f141511q = j17;
    }

    @Override // kr3.j
    public int k7() {
        return 38;
    }

    @Override // kr3.j
    public int l7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.f574085gy2;
    }

    public final vg3.c m7(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String obj;
        java.lang.String str4 = null;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null || !(!r26.n0.N(str3))) {
            str3 = null;
        }
        if (str2 != null && (obj = r26.n0.u0(str2).toString()) != null && (!r26.n0.N(obj))) {
            str4 = obj;
        }
        return (str3 == null || str4 != null) ? (str3 != null || str4 == null) ? (str3 == null || str4 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, str4)) ? vg3.c.D : vg3.c.E : vg3.c.F : vg3.c.D;
    }

    public final boolean n7() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) this.f392926h;
        if (c21503x6e5a020a == null || !c21503x6e5a020a.isEdited) {
            return false;
        }
        java.lang.String obj = c21503x6e5a020a.m79028xfb85ada3().toString();
        java.lang.String str = this.f235476r;
        if (str == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, obj)) {
            return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235476r) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) ? false : true;
        }
        return false;
    }
}
