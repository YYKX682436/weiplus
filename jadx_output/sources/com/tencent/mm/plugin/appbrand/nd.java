package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class nd implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ReportStorageSizeTask f86064d;

    public nd(com.tencent.mm.plugin.appbrand.ReportStorageSizeTask reportStorageSizeTask) {
        this.f86064d = reportStorageSizeTask;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "MicroMsg.AppBrand.ReportStorageSizeTask#" + this.f86064d.f74877f;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ReportStorageSizeTask reportStorageSizeTask = this.f86064d;
        try {
            com.tencent.mm.plugin.appbrand.ReportStorageSizeTask.B(reportStorageSizeTask);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ReportStorageSizeTask", "doReport appId:%s, e:%s", reportStorageSizeTask.f74877f, th6);
        }
    }
}
