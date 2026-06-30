package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class a5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b5 f249257d;

    public a5(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b5 b5Var) {
        this.f249257d = b5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.LinkWidget$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/LinkWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.LinkWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b5 b5Var = this.f249257d;
        java.lang.String str = b5Var.f249387k0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.LinkWidget");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.LinkWidget");
            boolean z17 = b5Var.A;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.LinkWidget");
            if (!z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.LinkWidget");
                boolean z18 = b5Var.B;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.LinkWidget");
                if (!z18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.LinkWidget");
                    boolean z19 = b5Var.C;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.LinkWidget");
                    if (!z19 && !b5Var.f251490c.getIntent().getBooleanExtra("KSnsUploadDisableLinkClick", false)) {
                        c01.l2 c17 = c01.n2.d().c(b5Var.N, true);
                        if (!c17.a("_DATA_CENTER_ITEM_SHOW_TYPE")) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LinkWidget", "adlink url " + b5Var.f249378g);
                            android.content.Intent intent = new android.content.Intent();
                            intent.putExtra("rawUrl", b5Var.f249378g);
                            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent, b5Var.f251490c);
                            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/LinkWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.LinkWidget$1");
                            return;
                        }
                        int e17 = c17.e("_DATA_CENTER_ITEM_SHOW_TYPE", -1);
                        int e18 = c17.e("_DATA_SHOW_NATIVE_PAGE", -1);
                        if (e17 == 5 && e17 == 16 && e18 == 1 && b5Var.f251490c.getIntent().getBundleExtra("BizVideoDetailUIExtras") != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LinkWidget", "goto native video");
                            android.content.Intent intent2 = new android.content.Intent();
                            intent2.putExtras(b5Var.f251490c.getIntent().getBundleExtra("BizVideoDetailUIExtras"));
                            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.h9t);
                            if (findViewById != null) {
                                int width = findViewById.getWidth();
                                int height = findViewById.getHeight();
                                int[] iArr = new int[2];
                                findViewById.getLocationInWindow(iArr);
                                intent2.putExtra("img_gallery_width", width).putExtra("img_gallery_height", height).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]);
                            }
                            intent2.addFlags(268435456);
                            j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "brandservice", ".ui.timeline.video.BizVideoDetailUI", intent2, null);
                            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/LinkWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.LinkWidget$1");
                            return;
                        }
                        ((yg0.s4) ((zg0.q3) i95.n0.c(zg0.q3.class))).getClass();
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
                        android.content.Intent intent3 = new android.content.Intent();
                        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
                        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
                        java.lang.String str2 = b5Var.f249378g;
                        ((yq1.z) a0Var).getClass();
                        if (!((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(b5Var.f251490c, ot0.g0.a(str2, 2, 10000, currentTimeMillis), e17, true, 2, 10000, intent3)) {
                            intent3.putExtra("rawUrl", b5Var.f249378g);
                            j45.l.j(b5Var.f251490c, "webview", ".ui.tools.WebViewUI", intent3, null);
                        }
                        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/LinkWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.LinkWidget$1");
                        return;
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/LinkWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.LinkWidget$1");
    }
}
