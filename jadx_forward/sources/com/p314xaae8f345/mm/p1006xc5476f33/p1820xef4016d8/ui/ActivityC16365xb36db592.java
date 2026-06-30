package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyExclusiveSelectContactUI */
/* loaded from: classes9.dex */
public class ActivityC16365xb36db592 extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 implements np5.f {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f227649J = 0;
    public java.lang.String C;
    public java.lang.String D;
    public int G;
    public final java.util.List E = new java.util.ArrayList();
    public java.util.List F = new java.util.ArrayList();
    public np5.b0 H = null;
    public java.lang.String[] I = null;

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyExclusiveSelectContactUI", "user WalletSelectContactAdapter:%s", java.lang.Boolean.TRUE);
        com.p314xaae8f345.mm.p2802xd031a825.ui.c2 c2Var = new com.p314xaae8f345.mm.p2802xd031a825.ui.c2();
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.F, ",");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "<set-?>");
        c2Var.f295655b = c17;
        java.lang.String str = this.C;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        c2Var.f295656c = str;
        c2Var.f295654a = true;
        return new com.p314xaae8f345.mm.p2802xd031a825.ui.e2(this, this.E, true, false, c2Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        rd0.j1 j1Var = (rd0.j1) i95.n0.c(rd0.j1.class);
        java.lang.String str = this.C;
        java.util.HashSet hashSet = new java.util.HashSet(this.E);
        ((qd0.y0) j1Var).getClass();
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.e5(this, str, 11, false, hashSet);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        java.lang.String stringExtra = getIntent().getStringExtra("key_title");
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) ? stringExtra : getString(com.p314xaae8f345.mm.R.C30867xcad56011.glt);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyExclusiveSelectContactUI", "handleItemClick: %s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = b7().getItem(i17 - this.f287979d.getHeaderViewsCount());
        if (item == null || (str = item.f288383s) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyExclusiveSelectContactUI", "ClickUser=%s", str);
        java.lang.String str2 = item.f288383s;
        boolean z17 = true;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str2)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(n17.Q0(), n17.G0()))) {
                j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
                java.lang.String str3 = this.C;
                ((l41.q2) b0Var).getClass();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
                if (n18.X4() && com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(n18.d1())) {
                    com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
                    if (n18.r2() || str3 == null) {
                        str3 = "";
                    }
                    r1Var.g(new l41.x(str2, str3, ""));
                }
            }
        }
        java.lang.String str4 = item.f288383s;
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str5 = this.C;
        ((sg3.a) v0Var).getClass();
        java.lang.String f17 = c01.a2.f(str4, str5);
        java.util.Iterator it = this.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            java.lang.String str6 = (java.lang.String) it.next();
            if (!str6.equals(str4)) {
                tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str7 = this.C;
                ((sg3.a) v0Var2).getClass();
                if (f17.equals(c01.a2.f(str6, str7))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyExclusiveSelectContactUI", "find same display name: %s", f17);
                    break;
                }
            }
        }
        if (!z17) {
            w7(item.f288383s);
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("key_same_name_tips");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            stringExtra = getString(com.p314xaae8f345.mm.R.C30867xcad56011.gkq);
        }
        db5.e1.H(mo55332x76847179(), stringExtra, "", false, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.h4(this, item), new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i4(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        java.lang.String[] strArr = this.I;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        this.f287980e.m78861xe90b84f5(strArr);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean m7() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        np5.b0 b0Var = new np5.b0(this, this);
        this.H = b0Var;
        b0Var.c(4465);
        this.C = getIntent().getStringExtra("chatroomName");
        this.G = getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        ((java.util.ArrayList) this.E).add(c01.z1.r());
        java.util.List L0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(this.C);
        this.F = L0;
        if (L0 != null) {
            L0.remove(c01.z1.r());
        }
        super.onCreate(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.H.i(4465);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785 c6205xeec13785 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785();
        c6205xeec13785.f136457g.f87952a = 0L;
        c6205xeec13785.e();
    }

    @Override // np5.f
    /* renamed from: onSceneEnd */
    public void mo66167x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        if ((m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.j) && i17 == 0 && i18 == 0) {
            r45.xx xxVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.j) m1Var).f238394r;
            if (xxVar.f472100d == 268492929) {
                java.lang.String str2 = xxVar.f472101e;
                if (android.text.TextUtils.isEmpty(str2)) {
                    str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
                }
                db5.e1.G(this, str2, null, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.j4(this));
                return;
            }
        }
        x7();
    }

    public final void w7(java.lang.String str) {
        this.D = str;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str) || this.G != 31) {
            x7();
        } else {
            this.H.d(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.j(str, this.C), true);
        }
    }

    public final void x7() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.D)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyExclusiveSelectContactUI", "selectedUsername is null");
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Contact", this.D);
        setResult(-1, intent);
        finish();
    }
}
