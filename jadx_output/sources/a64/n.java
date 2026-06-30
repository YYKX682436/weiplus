package a64;

/* loaded from: classes4.dex */
public final class n implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a64.o f1792d;

    public n(a64.o oVar) {
        this.f1792d = oVar;
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
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$onCreateAfter$1");
        a64.o oVar = this.f1792d;
        android.view.ViewTreeObserver viewTreeObserver = oVar.h().getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$configUIData", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("configUIData", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC");
        int i18 = com.tencent.mm.ui.bl.b(oVar.getActivity()).x;
        a64.m contentSizeAttr = oVar.f1793n;
        contentSizeAttr.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScreenWidth", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        contentSizeAttr.f1783a = i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScreenWidth", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        int i19 = com.tencent.mm.ui.bl.b(oVar.getActivity()).y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        contentSizeAttr.f1784b = i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        int h17 = com.tencent.mm.ui.bl.h(oVar.getActivity());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStatusBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        contentSizeAttr.f1785c = h17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStatusBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        int a17 = com.tencent.mm.ui.bl.a(oVar.getContext());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        contentSizeAttr.f1786d = a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        int[] iArr = new int[2];
        boolean y17 = com.tencent.mm.ui.bk.y();
        jz5.g gVar2 = oVar.f1764m;
        if (y17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionBarContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
            java.lang.Object value = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionBarContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
            ((android.view.View) value).getLocationOnScreen(iArr);
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionBarContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
            java.lang.Object value2 = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionBarContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
            ((android.view.View) value2).getLocationInWindow(iArr);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        int i27 = contentSizeAttr.f1786d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        int i28 = i27 + iArr[1];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStatusBarAndActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        contentSizeAttr.f1787e = i28;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStatusBarAndActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configUIData", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$configUIData", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickActionType", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        int i29 = oVar.f1758d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickActionType", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        if (i29 == 18) {
            android.app.Activity context = oVar.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            a64.l lVar = (a64.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(a64.l.class);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentSizeAttr", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentSizeAttr", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC");
            lVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
            kotlin.jvm.internal.o.g(contentSizeAttr, "contentSizeAttr");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
            if (lVar.P6()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                int i37 = contentSizeAttr.f1784b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                contentSizeAttr.f1789g = (i37 * 3) / 4;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                str3 = "getScreenHeight";
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                int i38 = contentSizeAttr.f1784b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStatusBarAndActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                str3 = "getScreenHeight";
                int i39 = contentSizeAttr.f1787e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStatusBarAndActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                contentSizeAttr.f1789g = i38 - i39;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
            android.app.Activity context2 = oVar.getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            a64.l lVar2 = (a64.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(a64.l.class);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentSizeAttr", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentSizeAttr", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC");
            lVar2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
            kotlin.jvm.internal.o.g(contentSizeAttr, "contentSizeAttr");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout R6 = lVar2.R6();
            if (R6 != null) {
                R6.setCanScrollToTop(lVar2.O6());
            }
            boolean P6 = lVar2.P6();
            boolean O6 = lVar2.O6();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentViewHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            int i47 = (!P6 || O6) ? contentSizeAttr.f1784b - contentSizeAttr.f1787e : contentSizeAttr.f1789g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentViewHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout R62 = lVar2.R6();
            int i48 = contentSizeAttr.f1790h;
            int i49 = contentSizeAttr.f1788f;
            if (R62 != null) {
                boolean P62 = lVar2.P6();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSpaceHolderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                int i57 = P62 ? (i49 - i48) - contentSizeAttr.f1787e : 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSpaceHolderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                R62.setSpaceHolderHeight(i57);
            }
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout R63 = lVar2.R6();
            android.view.ViewGroup.LayoutParams layoutParams2 = R63 != null ? R63.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                if (lVar2.P6()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopContainerHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopContainerHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHalfScreenHeaderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfScreenHeaderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                    i17 = i49 - i48;
                } else {
                    i17 = 0;
                }
                marginLayoutParams.topMargin = i17;
                marginLayoutParams.height = i47;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomRoundCornerContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
            jz5.g gVar3 = lVar2.f1770o;
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) ((jz5.n) gVar3).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomRoundCornerContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
            if (roundedCornerFrameLayout != null) {
                str4 = "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC";
                layoutParams = roundedCornerFrameLayout.getLayoutParams();
            } else {
                str4 = "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC";
                layoutParams = null;
            }
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.height = i47;
            }
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout R64 = lVar2.R6();
            if (R64 == null) {
                gVar = gVar3;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                gVar = gVar3;
                int i58 = contentSizeAttr.f1789g;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                R64.setContentViewHeight(i58);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("screenWidth is ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScreenWidth", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            int i59 = contentSizeAttr.f1783a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScreenWidth", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            sb6.append(i59);
            sb6.append(", screenHeight is ");
            java.lang.String str5 = str3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(str5, "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            int i66 = contentSizeAttr.f1784b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            sb6.append(i66);
            sb6.append(", statusBarHeight is ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStatusBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            int i67 = contentSizeAttr.f1785c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStatusBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            sb6.append(i67);
            sb6.append(", actionBarHeight is ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            int i68 = contentSizeAttr.f1786d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            sb6.append(i68);
            sb6.append(", statusBarAndActionBarHeight is ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStatusBarAndActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            int i69 = contentSizeAttr.f1787e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStatusBarAndActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            sb6.append(i69);
            sb6.append(", spaceHolderHeight is ");
            boolean P63 = lVar2.P6();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSpaceHolderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            int i76 = P63 ? (i49 - i48) - contentSizeAttr.f1787e : 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSpaceHolderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            sb6.append(i76);
            sb6.append(", halfScreenHeaderHeight is ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHalfScreenHeaderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfScreenHeaderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            sb6.append(i48);
            sb6.append(", topContainerHeight is ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopContainerHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopContainerHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            sb6.append(i49);
            sb6.append(", initVisibleHalfScreenHeight is ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            int i77 = contentSizeAttr.f1789g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            sb6.append(i77);
            sb6.append(", contentViewHeight is ");
            sb6.append(i47);
            sb6.append(", isHalfScreen is ");
            sb6.append(lVar2.P6());
            sb6.append(", canScrollToTop is ");
            sb6.append(lVar2.O6());
            com.tencent.mars.xlog.Log.i("AdBottomComponentUIC", sb6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
            boolean P64 = lVar2.P6();
            boolean O62 = lVar2.O6();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentViewHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            int i78 = (!P64 || O62) ? contentSizeAttr.f1784b - contentSizeAttr.f1787e : contentSizeAttr.f1789g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentViewHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            if (lVar2.P6()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHalfScreenDragHeaderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfScreenDragHeaderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                i78 -= contentSizeAttr.f1791i;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomContainerContent", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) lVar2.f1771p).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomContainerContent", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
            android.view.ViewGroup.LayoutParams layoutParams3 = frameLayout != null ? frameLayout.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.height = i78;
            }
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.topMargin = 0;
            }
            if (lVar2.P6() && marginLayoutParams3 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHalfScreenDragHeaderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfScreenDragHeaderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
                marginLayoutParams3.topMargin = contentSizeAttr.f1791i;
            }
            android.widget.FrameLayout Q6 = lVar2.Q6();
            android.view.ViewGroup.LayoutParams layoutParams4 = Q6 != null ? Q6.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
            if (marginLayoutParams4 != null) {
                marginLayoutParams4.height = i78;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomRoundCornerContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout2 = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) ((jz5.n) gVar).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomRoundCornerContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
            if (roundedCornerFrameLayout2 != null) {
                roundedCornerFrameLayout2.setBackgroundColor(lVar2.getActivity().getResources().getColor(com.tencent.mm.R.color.f478605ae2));
            }
            java.lang.String str6 = str4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustKefuHalfScreenLayout", str6);
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
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(0);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/ui/uic/AdKefuBottomComponentUIC", "adjustKefuHalfScreenLayout", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/landingpage/ui/uic/AdKefuBottomComponentUIC", "adjustKefuHalfScreenLayout", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else {
                        b18 = b19;
                    }
                    android.widget.TextView textView = lVar2.f1777u;
                    android.view.ViewGroup.LayoutParams layoutParams7 = textView != null ? textView.getLayoutParams() : null;
                    android.widget.LinearLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams7 : null;
                    if (layoutParams8 != null) {
                        layoutParams8.topMargin = b18;
                    }
                    com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = lVar2.f1779w;
                    android.view.ViewGroup.LayoutParams layoutParams9 = mMRoundCornerImageView != null ? mMRoundCornerImageView.getLayoutParams() : null;
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
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
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
                    android.widget.TextView textView2 = lVar2.f1777u;
                    android.view.ViewGroup.LayoutParams layoutParams11 = textView2 != null ? textView2.getLayoutParams() : null;
                    android.widget.LinearLayout.LayoutParams layoutParams12 = layoutParams11 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams11 : null;
                    if (layoutParams12 != null) {
                        layoutParams12.topMargin = b27;
                    }
                    com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView2 = lVar2.f1779w;
                    android.view.ViewGroup.LayoutParams layoutParams13 = mMRoundCornerImageView2 != null ? mMRoundCornerImageView2.getLayoutParams() : null;
                    android.widget.LinearLayout.LayoutParams layoutParams14 = layoutParams13 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams13 : null;
                    if (layoutParams14 != null) {
                        layoutParams14.topMargin = b28;
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustKefuHalfScreenLayout", str6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configHalfScreenContainer", str6);
            str = "onGlobalLayout";
            str2 = "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$onCreateAfter$1";
        } else {
            str = "onGlobalLayout";
            str2 = "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$onCreateAfter$1";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }
}
