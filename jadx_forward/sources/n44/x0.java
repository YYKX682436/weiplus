package n44;

/* loaded from: classes8.dex */
public final class x0 extends n44.f1 {
    @Override // n44.f1
    public void a(y54.b contentSizeAttr, android.content.Intent intent) {
        android.content.Context context;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentSizeAttr, "contentSizeAttr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (g() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper");
            return;
        }
        int a17 = contentSizeAttr.a(g().a());
        android.view.View h17 = h();
        int b17 = a17 - i65.a.b(h17 != null ? h17.getContext() : null, 28);
        android.widget.FrameLayout c17 = c();
        android.view.ViewGroup.LayoutParams layoutParams = c17 != null ? c17.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.height = b17;
        }
        if (marginLayoutParams != null) {
            android.view.View h18 = h();
            marginLayoutParams.topMargin = i65.a.b(h18 != null ? h18.getContext() : null, 28);
        }
        android.widget.FrameLayout e17 = e();
        android.view.ViewGroup.LayoutParams layoutParams2 = e17 != null ? e17.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.height = b17;
        }
        android.view.View h19 = h();
        if (h19 != null && (context = h19.getContext()) != null && (f17 = f()) != null) {
            f17.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560138ae2));
        }
        super.a(contentSizeAttr, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper");
    }

    @Override // n44.f1
    public void b(android.content.Intent intent) {
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d mo7595x9cdc264;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createHalfScreen", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.lang.Object clone = intent.clone();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(clone, "null cannot be cast to non-null type android.content.Intent");
        android.content.Intent intent2 = (android.content.Intent) clone;
        pf5.j0.a(intent2, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.uic.C17767xa18e3b3a.class);
        pf5.j0.a(intent2, wm3.l.class);
        boolean z17 = false;
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 b17 = lk5.q0.b("com.tencent.mm.plugin.profile.ui.ContactInfoUI", intent2, false, 4, null);
        b17.q0(n44.w0.f416601d);
        android.view.View h17 = h();
        android.content.Context context = h17 != null ? h17.getContext() : null;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null && (mo7595x9cdc264 = abstractActivityC21394xb3d2c0cf.mo7595x9cdc264()) != null && !mo7595x9cdc264.m7686xbca8d80f()) {
            z17 = true;
        }
        if (z17) {
            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = abstractActivityC21394xb3d2c0cf.mo7595x9cdc264().m7630xb2c12e75();
            m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.cgi, b17, null);
            m7630xb2c12e75.f();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createHalfScreen", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper");
    }

    @Override // n44.f1
    public int i(y54.b contentSizeAttr) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTopContainerMaxHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentSizeAttr, "contentSizeAttr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper");
        if (h() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper");
        } else {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            android.content.Context context = h().getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            ((c61.l7) b6Var).getClass();
            int c17 = com.p314xaae8f345.mm.ui.bl.c(context);
            android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i18 = b17.x;
            int i19 = b17.y;
            java.lang.System.nanoTime();
            boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (z17) {
                i17 = i19 - c17;
            } else {
                if (i19 >= i18) {
                    i18 = i19;
                }
                i17 = i18 - c17;
            }
            int a17 = (int) (i17 * kx2.a.f394811a.a(context));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
            contentSizeAttr.f541059g = a17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper");
        }
        int d17 = (contentSizeAttr.d() - contentSizeAttr.c()) + contentSizeAttr.b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopContainerMaxHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper");
        return d17;
    }
}
