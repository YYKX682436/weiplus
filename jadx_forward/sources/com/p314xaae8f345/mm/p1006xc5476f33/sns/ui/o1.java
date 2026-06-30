package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p1 f251596d;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p1 p1Var) {
        this.f251596d = p1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.BizCardWidget$initView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/BizCardWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$handleClick", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p1 p1Var = this.f251596d;
        p1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleClick", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        c01.l2 c17 = c01.n2.d().c(p1Var.N, true);
        boolean a17 = c17.a("_DATA_CENTER_ITEM_SHOW_TYPE");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = p1Var.J0;
        if (a17) {
            int e17 = c17.e("_DATA_CENTER_ITEM_SHOW_TYPE", -1);
            ((yg0.s4) ((zg0.q3) i95.n0.c(zg0.q3.class))).getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
            android.content.Intent intent = new android.content.Intent();
            str = "com.tencent.mm.plugin.sns.ui.BizCardWidget$initView$1";
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
            zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
            java.lang.String str2 = p1Var.f249378g;
            ((yq1.z) a0Var).getClass();
            if (!((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(p1Var.J0, ot0.g0.a(str2, 2, 10000, currentTimeMillis), e17, true, 2, 10000, intent)) {
                intent.putExtra("rawUrl", p1Var.f249378g);
                j45.l.j(abstractActivityC21394xb3d2c0cf, "webview", ".ui.tools.WebViewUI", intent, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleClick", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        } else {
            str = "com.tencent.mm.plugin.sns.ui.BizCardWidget$initView$1";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LinkWidget", "adlink url " + p1Var.f249378g);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", p1Var.f249378g);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent2, abstractActivityC21394xb3d2c0cf);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleClick", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$handleClick", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/BizCardWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", str);
    }
}
