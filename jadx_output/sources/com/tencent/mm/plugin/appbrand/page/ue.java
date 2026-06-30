package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class ue {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f87151b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f87152a;

    public ue(android.content.Context context, com.tencent.mm.plugin.appbrand.page.n7 pageView, com.tencent.mm.ui.widget.dialog.k0 actionSheet, com.tencent.mm.plugin.appbrand.page.h3 actionSheetController) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        kotlin.jvm.internal.o.g(actionSheet, "actionSheet");
        kotlin.jvm.internal.o.g(actionSheetController, "actionSheetController");
        java.lang.String str = "MicroMsg.AppBrand.SupportRecentForwardController#" + hashCode();
        this.f87152a = str;
        com.tencent.mm.plugin.appbrand.o6 runtime = pageView.getRuntime();
        if (runtime != null && 1158 == runtime.g2()) {
            com.tencent.mars.xlog.Log.i(str, "trySupportIfNeed, not need 1");
            return;
        }
        if (!(com.tencent.mm.plugin.appbrand.menu.v0.SHOW_CLICKABLE == com.tencent.mm.plugin.appbrand.menu.l0.d(context, pageView))) {
            com.tencent.mars.xlog.Log.i(str, "trySupportIfNeed, not need 2");
            return;
        }
        if (actionSheet.R1 != 0) {
            com.tencent.mars.xlog.Log.i(str, "trySupportIfNeed, not need 3");
            return;
        }
        com.tencent.mm.pluginsdk.forward.m mVar = ((o25.y1) i95.n0.c(o25.y1.class)) != null ? new com.tencent.mm.pluginsdk.forward.m() : null;
        if (mVar == null) {
            com.tencent.mars.xlog.Log.w(str, "trySupportIfNeed, recentForwardMenuHelper is null");
            return;
        }
        com.tencent.mm.plugin.appbrand.page.ne neVar = new com.tencent.mm.plugin.appbrand.page.ne(context, pageView, actionSheetController);
        actionSheet.f211876p = new com.tencent.mm.plugin.appbrand.page.qe(mVar, context, actionSheet, actionSheetController);
        actionSheet.f211885w = new com.tencent.mm.plugin.appbrand.page.se(mVar, this, context, pageView, neVar);
        actionSheet.f211886x = new com.tencent.mm.plugin.appbrand.page.te(mVar, actionSheet);
    }
}
