package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f88203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle f88204e;

    public i(com.tencent.mm.plugin.appbrand.report.quality.j jVar, com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle appStartupPerformanceReportBundle) {
        this.f88203d = o6Var;
        this.f88204e = appStartupPerformanceReportBundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime a17 = com.tencent.mm.plugin.appbrand.report.quality.e.a(this.f88203d);
        if (a17 == null) {
            return;
        }
        for (com.tencent.mm.plugin.appbrand.report.model.kv_14609 kv_14609Var : this.f88204e.f84408f) {
            od1.c cVar = new od1.c();
            cVar.f344602a = "loadPackage";
            long j17 = kv_14609Var.f88041v;
            cVar.f344603b = j17;
            cVar.f344604c = j17 + kv_14609Var.f88034o;
            java.lang.String str = kv_14609Var.f88031i;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            cVar.b(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME, str);
            int i17 = kv_14609Var.f88039t;
            if (i17 > 0) {
                cVar.b("size", java.lang.Integer.valueOf(i17));
            } else {
                cVar.b("size", java.lang.Integer.valueOf(kv_14609Var.f88038s));
            }
            try {
                cVar.a(a17.f88144p.C0());
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
