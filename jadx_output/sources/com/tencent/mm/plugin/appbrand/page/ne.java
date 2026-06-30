package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class ne {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f86931a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f86932b;

    /* renamed from: c, reason: collision with root package name */
    public int f86933c;

    public ne(android.content.Context context, com.tencent.mm.plugin.appbrand.page.n7 pageView, com.tencent.mm.plugin.appbrand.page.h3 actionSheetController) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        kotlin.jvm.internal.o.g(actionSheetController, "actionSheetController");
        this.f86931a = "MicroMsg.AppBrand.SupportRecentForwardController.ReportLogic#" + hashCode();
        this.f86932b = "";
        this.f86933c = 1;
        actionSheetController.f86518n = new com.tencent.mm.plugin.appbrand.page.le(this);
        ((java.util.HashSet) actionSheetController.f86517m).add(new com.tencent.mm.plugin.appbrand.page.me(this, context));
    }

    public final void a(boolean z17) {
        int i17;
        if (z17) {
            i17 = this.f86932b.length() > 0 ? 3 : 2;
        } else {
            i17 = 4;
        }
        this.f86933c = i17;
        com.tencent.mars.xlog.Log.i(this.f86931a, "doSomethingOnMenuClick, toUser: " + this.f86932b + ", exitType: " + this.f86933c);
    }
}
