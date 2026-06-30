package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class p extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90136v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList, android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        this.f90136v = appBrandLauncherRecentsList;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90136v;
        try {
            super.onLayoutChildren(z2Var, h3Var);
        } catch (java.lang.IllegalArgumentException | java.lang.IndexOutOfBoundsException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandLauncherRecentsList", "onLayoutChildren exception(%s) retry notifyDataSetChanged", e17);
            try {
                appBrandLauncherRecentsList.f90016y.notifyDataSetChanged();
            } catch (java.lang.IllegalStateException e18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandLauncherRecentsList", "onLayoutChildren retry notifyDataSetChanged e=%s", e18);
                java.lang.String message = e18.getMessage();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (message == null) {
                    message = "";
                }
                if (message.contains("computing a layout or scrolling")) {
                    com.tencent.mm.plugin.appbrand.ui.recents.o oVar = new com.tencent.mm.plugin.appbrand.ui.recents.o(this);
                    com.tencent.mm.plugin.appbrand.ui.recents.r0 r0Var = appBrandLauncherRecentsList.B;
                    r0Var.sendMessage(r0Var.obtainMessage(2, oVar));
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        try {
            return super.scrollVerticallyBy(i17, z2Var, h3Var);
        } catch (java.lang.IndexOutOfBoundsException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandLauncherRecentsList", e17, "scrollVerticallyBy(%d, %s)", java.lang.Integer.valueOf(i17), h3Var);
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90136v;
        com.tencent.mm.plugin.appbrand.ui.recents.b2 b2Var = new com.tencent.mm.plugin.appbrand.ui.recents.b2(appBrandLauncherRecentsList.getActivity(), appBrandLauncherRecentsList.f90014x);
        b2Var.f12049a = i17;
        startSmoothScroll(b2Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }
}
