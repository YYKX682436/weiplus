package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes8.dex */
public final class me implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.ne f86889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f86890e;

    public me(com.tencent.mm.plugin.appbrand.page.ne neVar, android.content.Context context) {
        this.f86889d = neVar;
        this.f86890e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.page.ne neVar = this.f86889d;
        com.tencent.mars.xlog.Log.i(neVar.f86931a, "onDismiss#reportOnActionSheetHideIfNeed");
        neVar.getClass();
        android.content.Context context = this.f86890e;
        boolean z17 = context instanceof com.tencent.mm.ui.component.UIComponentActivity;
        java.lang.String str = neVar.f86931a;
        if (!z17) {
            com.tencent.mars.xlog.Log.w(str, "getRecentForwardReportInfo, context: " + context);
        }
        r45.pk5 pk5Var = (r45.pk5) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(context, 14, r45.pk5.class);
        if (pk5Var == null) {
            com.tencent.mars.xlog.Log.w(str, "tryReport, recentForwardReportInfo is null");
        } else {
            pk5Var.f383137i = 9;
            int i17 = neVar.f86933c;
            if (2 == i17 || 3 == i17) {
                pk5Var.f383138m = java.lang.String.valueOf(49);
                pk5Var.f383139n = "33";
            }
            pk5Var.f383142q = neVar.f86932b;
            pk5Var.f383132d = neVar.f86933c;
            pk5Var.f383140o = (int) (android.os.SystemClock.elapsedRealtime() - pk5Var.f383143r);
            l35.a.f315443a.a(context);
        }
        neVar.f86932b = "";
        neVar.f86933c = 1;
    }
}
