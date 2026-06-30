package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class v3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3 f252153d;

    public v3(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3 p3Var) {
        this.f252153d = p3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$5");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/GalleryFooterNew$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3 p3Var = this.f252153d;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$5");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryFooterNew", "footer likeCmd click,%s", ca4.z0.t0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var).f68891x29d1292e));
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var).m70360xbd8ebd19() == 0) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var).m70391x8f904ca3()) {
                gm0.j1.i();
                gm0.j1.n().f354821b.a(213, p3Var);
                gm0.j1.i();
                gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.o1.f34634x366c91de, p3Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
                int i17 = p3Var.f251678n;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6.m(c17, 1, "", 0L, "", false, i17);
            } else {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var).f68896xdde069b;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
                int i18 = p3Var.f251678n;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6.p(str, 5, null, c18, i18);
            }
            android.widget.LinearLayout linearLayout = p3Var.f251671d.f249355e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            android.widget.ImageView imageView = (android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.haj);
            android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(200L);
            scaleAnimation.setStartOffset(100L);
            scaleAnimation.setRepeatCount(0);
            imageView.clearAnimation();
            imageView.startAnimation(scaleAnimation);
            scaleAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q3(p3Var, linearLayout, null));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var).m70448xb8471e25(1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().V2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.Q().f141992s = 2L;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k7.f245900a.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var), 3);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var).m70448xb8471e25(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().V2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6.a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var).m70367x7525eefd());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var).f68891x29d1292e);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$002", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            p3Var.f251673f = W0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$002", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            boolean x17 = xa4.g.x(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$702", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            p3Var.f251674g = x17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$702", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.Q().f141992s = 4L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11989, 1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var).f68891x29d1292e == 0 ? "" : ca4.z0.t0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var).f68891x29d1292e), 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$900", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = p3Var.f251686v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$900", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        java.lang.Runnable runnable = p3Var.f251687w;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        n3Var.mo50300x3fa464aa(runnable);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$900", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$900", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        n3Var.mo50297x7c4d7ca2(runnable, 500L);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$5");
    }
}
