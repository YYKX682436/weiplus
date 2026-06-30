package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.g f89693d;

    public f(com.tencent.mm.plugin.appbrand.ui.g gVar) {
        this.f89693d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.g gVar = this.f89693d;
        if (gVar.getParent() instanceof android.view.ViewGroup) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdLoadingSplash", "remove AdLoadingSplash");
            gVar.setVisibility(8);
            ((android.view.ViewGroup) gVar.getParent()).removeView(gVar);
            gVar.f89717d.f74811t = null;
        }
    }
}
