package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.du4 f259752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.k64 f259753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.l64 f259754f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b f259755g;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b, r45.du4 du4Var, r45.k64 k64Var, r45.l64 l64Var) {
        this.f259755g = activityC19013x23c3e97b;
        this.f259752d = du4Var;
        this.f259753e = k64Var;
        this.f259754f = l64Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        r45.j64 j64Var;
        r45.j64 j64Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$53", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(29559, "14", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_LQT_LCT_SHOW_FIRST_TIPS_BOOLEAN_SYNC;
        boolean booleanValue = ((java.lang.Boolean) c17.m(u3Var, java.lang.Boolean.FALSE)).booleanValue();
        r45.du4 du4Var = this.f259752d;
        int i17 = du4Var.f454285h;
        r45.l64 l64Var = this.f259754f;
        r45.k64 k64Var = this.f259753e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b = this.f259755g;
        if (i17 == 2) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(du4Var.f454283f)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", du4Var.f454283f);
                intent.putExtra("showShare", true);
                intent.putExtra(com.p314xaae8f345.mm.ui.w2.f292738r, true);
                if (!booleanValue && (j64Var2 = k64Var.f459969f.f461695f) != null) {
                    intent.putExtra("key_first_tips", j64Var2.f459140e);
                    intent.putExtra("key_first_tips_title", k64Var.f459969f.f461695f.f459139d);
                }
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(activityC19013x23c3e97b.mo55332x76847179(), intent);
                if (!booleanValue) {
                    gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                }
                g0Var.d(21309, 2, 2, l64Var.f460708i, l64Var.f460709m, l64Var.f460710n, l64Var.f460711o, 1);
            }
        } else if (i17 == 3 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(du4Var.f454286i) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(du4Var.f454283f)) {
            l81.b1 b1Var = new l81.b1();
            b1Var.f398545a = du4Var.f454286i;
            b1Var.f398555f = du4Var.f454283f;
            b1Var.f398565k = 1061;
            if (!booleanValue && (j64Var = k64Var.f459969f.f461695f) != null) {
                java.lang.String str = j64Var.f459139d;
                java.lang.String str2 = j64Var.f459140e;
                java.lang.String string = activityC19013x23c3e97b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11565x2acac113 c11565x2acac113 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11565x2acac113();
                c11565x2acac113.f156521f = str;
                c11565x2acac113.f156522g = str2;
                c11565x2acac113.f156523h = string;
                c11565x2acac113.f156524i = false;
                b1Var.B = c11565x2acac113;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(activityC19013x23c3e97b.mo55332x76847179(), b1Var);
            if (!booleanValue) {
                gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
            }
            g0Var.d(21309, 2, 2, l64Var.f460708i, l64Var.f460709m, l64Var.f460710n, l64Var.f460711o, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$53", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
