package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.q f92025d;

    public p(com.tencent.mm.plugin.appbrand.widget.recent.q qVar) {
        this.f92025d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.recent.q qVar = this.f92025d;
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView appBrandCommonUsedTaskView = qVar.f92036a;
        appBrandCommonUsedTaskView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "stopLoading");
        appBrandCommonUsedTaskView.f91866p.cancel();
        appBrandCommonUsedTaskView.f91863m.setVisibility(8);
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView appBrandCommonUsedTaskView2 = qVar.f92036a;
        if (appBrandCommonUsedTaskView2.f91860g.isEmpty()) {
            appBrandCommonUsedTaskView2.setVisibility(8);
        } else {
            appBrandCommonUsedTaskView2.c();
        }
    }
}
