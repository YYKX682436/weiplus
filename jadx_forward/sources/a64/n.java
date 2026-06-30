package a64;

/* loaded from: classes4.dex */
public final class n implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a64.o f83325d;

    public n(a64.o oVar) {
        this.f83325d = oVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        android.view.ViewGroup.LayoutParams layoutParams;
        jz5.g gVar;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGlobalLayout", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$onCreateAfter$1");
        a64.o oVar = this.f83325d;
        android.view.ViewTreeObserver viewTreeObserver = oVar.h().getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$configUIData", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("configUIData", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC");
        int i18 = com.p314xaae8f345.mm.ui.bl.b(oVar.m158354x19263085()).x;
        a64.m contentSizeAttr = oVar.f83326n;
        contentSizeAttr.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScreenWidth", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        contentSizeAttr.f83316a = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScreenWidth", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        int i19 = com.p314xaae8f345.mm.ui.bl.b(oVar.m158354x19263085()).y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        contentSizeAttr.f83317b = i19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        int h17 = com.p314xaae8f345.mm.ui.bl.h(oVar.m158354x19263085());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStatusBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        contentSizeAttr.f83318c = h17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStatusBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        int a17 = com.p314xaae8f345.mm.ui.bl.a(oVar.m80379x76847179());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        contentSizeAttr.f83319d = a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        int[] iArr = new int[2];
        boolean y17 = com.p314xaae8f345.mm.ui.bk.y();
        jz5.g gVar2 = oVar.f83297m;
        if (y17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActionBarContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
            java.lang.Object mo141623x754a37bb = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionBarContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
            ((android.view.View) mo141623x754a37bb).getLocationOnScreen(iArr);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActionBarContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionBarContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
            ((android.view.View) mo141623x754a37bb2).getLocationInWindow(iArr);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        int i27 = contentSizeAttr.f83319d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        int i28 = i27 + iArr[1];
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStatusBarAndActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        contentSizeAttr.f83320e = i28;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStatusBarAndActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("configUIData", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$configUIData", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickActionType", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        int i29 = oVar.f83291d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickActionType", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        if (i29 == 18) {
            android.app.Activity context = oVar.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            a64.l lVar = (a64.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(a64.l.class);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContentSizeAttr", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContentSizeAttr", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC");
            lVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentSizeAttr, "contentSizeAttr");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
            if (lVar.P6()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                int i37 = contentSizeAttr.f83317b;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                contentSizeAttr.f83322g = (i37 * 3) / 4;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                str3 = "getScreenHeight";
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                int i38 = contentSizeAttr.f83317b;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStatusBarAndActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                str3 = "getScreenHeight";
                int i39 = contentSizeAttr.f83320e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStatusBarAndActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                contentSizeAttr.f83322g = i38 - i39;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
            android.app.Activity context2 = oVar.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            a64.l lVar2 = (a64.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(a64.l.class);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContentSizeAttr", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContentSizeAttr", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC");
            lVar2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentSizeAttr, "contentSizeAttr");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17741x52670971 R6 = lVar2.R6();
            if (R6 != null) {
                R6.m69461x9b36211f(lVar2.O6());
            }
            boolean P6 = lVar2.P6();
            boolean O6 = lVar2.O6();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContentViewHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            int i47 = (!P6 || O6) ? contentSizeAttr.f83317b - contentSizeAttr.f83320e : contentSizeAttr.f83322g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContentViewHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17741x52670971 R62 = lVar2.R6();
            int i48 = contentSizeAttr.f83323h;
            int i49 = contentSizeAttr.f83321f;
            if (R62 != null) {
                boolean P62 = lVar2.P6();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSpaceHolderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                int i57 = P62 ? (i49 - i48) - contentSizeAttr.f83320e : 0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSpaceHolderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                R62.m69469x5755d9d7(i57);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17741x52670971 R63 = lVar2.R6();
            android.view.ViewGroup.LayoutParams layoutParams2 = R63 != null ? R63.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                if (lVar2.P6()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTopContainerHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopContainerHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHalfScreenHeaderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfScreenHeaderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                    i17 = i49 - i48;
                } else {
                    i17 = 0;
                }
                marginLayoutParams.topMargin = i17;
                marginLayoutParams.height = i47;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBottomRoundCornerContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
            jz5.g gVar3 = lVar2.f83303o;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) ((jz5.n) gVar3).mo141623x754a37bb();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBottomRoundCornerContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
            if (c22646x1e9ca55 != null) {
                str4 = "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC";
                layoutParams = c22646x1e9ca55.getLayoutParams();
            } else {
                str4 = "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC";
                layoutParams = null;
            }
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.height = i47;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17741x52670971 R64 = lVar2.R6();
            if (R64 == null) {
                gVar = gVar3;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                gVar = gVar3;
                int i58 = contentSizeAttr.f83322g;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                R64.m69447xf7608943(i58);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("screenWidth is ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScreenWidth", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            int i59 = contentSizeAttr.f83316a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScreenWidth", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            sb6.append(i59);
            sb6.append(", screenHeight is ");
            java.lang.String str5 = str3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(str5, "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            int i66 = contentSizeAttr.f83317b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            sb6.append(i66);
            sb6.append(", statusBarHeight is ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStatusBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            int i67 = contentSizeAttr.f83318c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStatusBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            sb6.append(i67);
            sb6.append(", actionBarHeight is ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            int i68 = contentSizeAttr.f83319d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            sb6.append(i68);
            sb6.append(", statusBarAndActionBarHeight is ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStatusBarAndActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            int i69 = contentSizeAttr.f83320e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStatusBarAndActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            sb6.append(i69);
            sb6.append(", spaceHolderHeight is ");
            boolean P63 = lVar2.P6();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSpaceHolderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            int i76 = P63 ? (i49 - i48) - contentSizeAttr.f83320e : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSpaceHolderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            sb6.append(i76);
            sb6.append(", halfScreenHeaderHeight is ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHalfScreenHeaderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfScreenHeaderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            sb6.append(i48);
            sb6.append(", topContainerHeight is ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTopContainerHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopContainerHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            sb6.append(i49);
            sb6.append(", initVisibleHalfScreenHeight is ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            int i77 = contentSizeAttr.f83322g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            sb6.append(i77);
            sb6.append(", contentViewHeight is ");
            sb6.append(i47);
            sb6.append(", isHalfScreen is ");
            sb6.append(lVar2.P6());
            sb6.append(", canScrollToTop is ");
            sb6.append(lVar2.O6());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdBottomComponentUIC", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
            boolean P64 = lVar2.P6();
            boolean O62 = lVar2.O6();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContentViewHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            int i78 = (!P64 || O62) ? contentSizeAttr.f83317b - contentSizeAttr.f83320e : contentSizeAttr.f83322g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContentViewHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            if (lVar2.P6()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHalfScreenDragHeaderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfScreenDragHeaderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                i78 -= contentSizeAttr.f83324i;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBottomContainerContent", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) lVar2.f83304p).mo141623x754a37bb();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBottomContainerContent", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
            android.view.ViewGroup.LayoutParams layoutParams3 = frameLayout != null ? frameLayout.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.height = i78;
            }
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.topMargin = 0;
            }
            if (lVar2.P6() && marginLayoutParams3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHalfScreenDragHeaderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfScreenDragHeaderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                marginLayoutParams3.topMargin = contentSizeAttr.f83324i;
            }
            android.widget.FrameLayout Q6 = lVar2.Q6();
            android.view.ViewGroup.LayoutParams layoutParams4 = Q6 != null ? Q6.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
            if (marginLayoutParams4 != null) {
                marginLayoutParams4.height = i78;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBottomRoundCornerContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca552 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) ((jz5.n) gVar).mo141623x754a37bb();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBottomRoundCornerContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
            if (c22646x1e9ca552 != null) {
                c22646x1e9ca552.setBackgroundColor(lVar2.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560138ae2));
            }
            java.lang.String str6 = str4;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustKefuHalfScreenLayout", str6);
            android.widget.LinearLayout linearLayout = lVar2.A;
            int height = linearLayout != null ? linearLayout.getHeight() : 0;
            android.widget.LinearLayout linearLayout2 = lVar2.B;
            int height2 = i78 - (linearLayout2 != null ? linearLayout2.getHeight() : 0);
            int b17 = i65.a.b(lVar2.h().getContext(), 20) + height2;
            android.widget.LinearLayout linearLayout3 = lVar2.B;
            android.view.ViewGroup.LayoutParams layoutParams5 = linearLayout3 != null ? linearLayout3.getLayoutParams() : null;
            android.widget.FrameLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams5 : null;
            if (layoutParams6 != null) {
                layoutParams6.topMargin = height2;
            }
            if (b17 < height) {
                int i79 = height - b17;
                if (lVar2.P6()) {
                    int b18 = i65.a.b(lVar2.h().getContext(), 24);
                    int b19 = i65.a.b(lVar2.h().getContext(), 48) - (i79 / 2);
                    if (i79 > b18 * 2) {
                        android.view.View view = lVar2.C;
                        if (view != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(0);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/ui/uic/AdKefuBottomComponentUIC", "adjustKefuHalfScreenLayout", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/landingpage/ui/uic/AdKefuBottomComponentUIC", "adjustKefuHalfScreenLayout", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else {
                        b18 = b19;
                    }
                    android.widget.TextView textView = lVar2.f83310u;
                    android.view.ViewGroup.LayoutParams layoutParams7 = textView != null ? textView.getLayoutParams() : null;
                    android.widget.LinearLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams7 : null;
                    if (layoutParams8 != null) {
                        layoutParams8.topMargin = b18;
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = lVar2.f83312w;
                    android.view.ViewGroup.LayoutParams layoutParams9 = c22628xfde5d61d != null ? c22628xfde5d61d.getLayoutParams() : null;
                    android.widget.LinearLayout.LayoutParams layoutParams10 = layoutParams9 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams9 : null;
                    if (layoutParams10 != null) {
                        layoutParams10.topMargin = b18;
                    }
                } else {
                    int b27 = i65.a.b(lVar2.h().getContext(), 24);
                    int b28 = i65.a.b(lVar2.h().getContext(), 40);
                    int b29 = i65.a.b(lVar2.h().getContext(), 48) - ((i79 * 48) / 128);
                    int b37 = i65.a.b(lVar2.h().getContext(), 80) - ((i79 * 80) / 128);
                    if (i79 > b27 + b28) {
                        android.view.View view2 = lVar2.C;
                        if (view2 != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                            arrayList2.add(0);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/ui/uic/AdKefuBottomComponentUIC", "adjustKefuHalfScreenLayout", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/landingpage/ui/uic/AdKefuBottomComponentUIC", "adjustKefuHalfScreenLayout", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else {
                        b27 = b29;
                        b28 = b37;
                    }
                    android.widget.TextView textView2 = lVar2.f83310u;
                    android.view.ViewGroup.LayoutParams layoutParams11 = textView2 != null ? textView2.getLayoutParams() : null;
                    android.widget.LinearLayout.LayoutParams layoutParams12 = layoutParams11 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams11 : null;
                    if (layoutParams12 != null) {
                        layoutParams12.topMargin = b27;
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d2 = lVar2.f83312w;
                    android.view.ViewGroup.LayoutParams layoutParams13 = c22628xfde5d61d2 != null ? c22628xfde5d61d2.getLayoutParams() : null;
                    android.widget.LinearLayout.LayoutParams layoutParams14 = layoutParams13 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams13 : null;
                    if (layoutParams14 != null) {
                        layoutParams14.topMargin = b28;
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustKefuHalfScreenLayout", str6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("configHalfScreenContainer", str6);
            str = "onGlobalLayout";
            str2 = "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$onCreateAfter$1";
        } else {
            str = "onGlobalLayout";
            str2 = "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$onCreateAfter$1";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }
}
