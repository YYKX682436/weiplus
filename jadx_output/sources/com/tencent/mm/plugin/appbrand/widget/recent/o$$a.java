package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public final /* synthetic */ class o$$a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.o f92021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.rs3 f92022e;

    public /* synthetic */ o$$a(com.tencent.mm.plugin.appbrand.widget.recent.o oVar, r45.rs3 rs3Var) {
        this.f92021d = oVar;
        this.f92022e = rs3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.z50 z50Var;
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.appbrand.widget.recent.o oVar = this.f92021d;
        oVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "onResponse");
        l01.r rVar = com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView.f91859v;
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView appBrandCommonUsedTaskView = oVar.f92020a;
        appBrandCommonUsedTaskView.getClass();
        r45.rs3 rs3Var = this.f92022e;
        if ((rs3Var == null || (z50Var = rs3Var.f385173e) == null || (linkedList = z50Var.f391721d) == null || linkedList.isEmpty()) ? false : true) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "parseCommonUsedData");
            com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView.b(appBrandCommonUsedTaskView, rs3Var, false);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "fetchCommonUsedDataFromServer");
            appBrandCommonUsedTaskView.f91860g.clear();
            appBrandCommonUsedTaskView.f91861h.setVisibility(8);
            appBrandCommonUsedTaskView.f91862i.notifyDataSetChanged();
            if (appBrandCommonUsedTaskView.f91863m.getVisibility() != 0) {
                appBrandCommonUsedTaskView.f();
            }
        }
        appBrandCommonUsedTaskView.d();
    }
}
