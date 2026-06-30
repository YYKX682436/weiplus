package com.tencent.mm.plugin.appbrand.task.preload;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController.TaskParamsCallPredownload f89126d;

    public e(com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController.b bVar, com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController.TaskParamsCallPredownload taskParamsCallPredownload) {
        this.f89126d = taskParamsCallPredownload;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController.TaskParamsCallPredownload taskParamsCallPredownload = this.f89126d;
        java.lang.String str = taskParamsCallPredownload.f89117e;
        int i17 = taskParamsCallPredownload.f89118f;
        java.lang.String str2 = taskParamsCallPredownload.f89116d;
        int i18 = taskParamsCallPredownload.f89120h;
        boolean z17 = taskParamsCallPredownload.f89119g;
        com.tencent.mm.plugin.appbrand.appcache.predownload.o oVar = new com.tencent.mm.plugin.appbrand.appcache.predownload.o(null, taskParamsCallPredownload.f89116d, taskParamsCallPredownload.f89117e, taskParamsCallPredownload.f89118f, taskParamsCallPredownload.f89121i);
        oVar.f75879u = taskParamsCallPredownload.f89120h;
        oVar.s(taskParamsCallPredownload.f89119g);
    }
}
