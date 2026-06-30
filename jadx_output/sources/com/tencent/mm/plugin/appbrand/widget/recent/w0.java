package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.x0 f92083d;

    public w0(com.tencent.mm.plugin.appbrand.widget.recent.x0 x0Var) {
        this.f92083d = x0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer appBrandTaskContainer;
        com.tencent.mm.plugin.appbrand.widget.recent.x0 x0Var;
        com.tencent.mm.plugin.appbrand.widget.recent.x0 x0Var2 = this.f92083d;
        x0Var2.f92089h.f91886f.setData(x0Var2.f92086e);
        ((java.util.ArrayList) this.f92083d.f92086e).clear();
        ((java.util.ArrayList) this.f92083d.f92087f).clear();
        if (this.f92083d.f92089h.getTaskViewListener() != null) {
            com.tencent.mm.plugin.appbrand.widget.recent.x0 x0Var3 = this.f92083d;
            if (x0Var3.f92088g) {
                com.tencent.mm.plugin.appbrand.widget.recent.h1 taskViewListener = x0Var3.f92089h.getTaskViewListener();
                ((java.util.ArrayList) this.f92083d.f92086e).size();
                com.tencent.mm.plugin.appbrand.page.t7 t7Var = (com.tencent.mm.plugin.appbrand.page.t7) taskViewListener;
                com.tencent.mm.plugin.appbrand.page.n7 n7Var = t7Var.f87116c;
                if (!n7Var.T1) {
                    com.tencent.mm.plugin.appbrand.page.n7.F3(n7Var, t7Var.f87114a, false, t7Var.f87115b);
                }
            }
        }
        if (this.f92083d.f92088g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "refresh done dispatch diffResult,");
            com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentTaskView appBrandRecentTaskView = this.f92083d.f92089h.f91886f;
            appBrandRecentTaskView.f91879i.notifyDataSetChanged();
            appBrandRecentTaskView.f91881n.notifyDataSetChanged();
        }
        synchronized (this.f92083d.f92089h.f91893p) {
            appBrandTaskContainer = this.f92083d.f92089h;
            appBrandTaskContainer.f91894q = false;
        }
        appBrandTaskContainer.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "delayRefresh");
        synchronized (appBrandTaskContainer.f91893p) {
            if (!appBrandTaskContainer.f91896s.isEmpty() && (x0Var = (com.tencent.mm.plugin.appbrand.widget.recent.x0) appBrandTaskContainer.f91896s.poll()) != null) {
                appBrandTaskContainer.f91895r.postToWorker(x0Var);
            }
        }
    }
}
