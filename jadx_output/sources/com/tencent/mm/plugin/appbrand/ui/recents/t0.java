package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f90153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.u0 f90154e;

    public t0(com.tencent.mm.plugin.appbrand.ui.recents.u0 u0Var, boolean z17) {
        this.f90154e = u0Var;
        this.f90153d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.recents.e2 e2Var;
        com.tencent.mm.plugin.appbrand.ui.recents.u0 u0Var = this.f90154e;
        if (!u0Var.f90158a.f90016y.y() && (e2Var = u0Var.f90158a.f90016y) != null) {
            try {
                e2Var.notifyItemChanged(e2Var.getItemCount() - 1);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandLauncherRecentsList", "adjustListBottomDivider notifyItemChanged e=%s", e17);
            }
        }
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = u0Var.f90158a;
        com.tencent.mm.plugin.appbrand.ui.recents.f1 f1Var = appBrandLauncherRecentsList.H;
        if (f1Var != null) {
            boolean z17 = (this.f90153d || appBrandLauncherRecentsList.f90016y.y()) ? false : true;
            android.view.View view = f1Var.f90077c;
            int i17 = z17 ? 0 : 4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter", "setShowDivider", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter", "setShowDivider", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
