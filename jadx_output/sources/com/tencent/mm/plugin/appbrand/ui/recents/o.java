package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.p f90131d;

    public o(com.tencent.mm.plugin.appbrand.ui.recents.p pVar) {
        this.f90131d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f90131d.f90136v.f90016y.notifyDataSetChanged();
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandLauncherRecentsList", "onLayoutChildren retry notifyDataSetChanged after scroll e=%s", e17);
        }
    }
}
