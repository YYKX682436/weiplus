package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

/* loaded from: classes7.dex */
public final class v implements com.tencent.mm.plugin.appbrand.service.m6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f75832a;

    public v(com.tencent.mm.ipcinvoker.r rVar) {
        this.f75832a = rVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.m6
    public final void a(com.tencent.mm.plugin.appbrand.appcache.n9 record, java.lang.String filePath) {
        kotlin.jvm.internal.o.g(record, "record");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        com.tencent.mm.ipcinvoker.r rVar = this.f75832a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgResult(true, record.convertTo(), filePath, 0, null, 24, null));
        }
    }
}
