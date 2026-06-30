package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

/* loaded from: classes5.dex */
public final class w implements com.tencent.mm.plugin.appbrand.service.l6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f75834a;

    public w(com.tencent.mm.ipcinvoker.r rVar) {
        this.f75834a = rVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.l6
    public final void a(int i17, java.lang.String str) {
        com.tencent.mm.ipcinvoker.r rVar = this.f75834a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgResult(false, null, null, i17, str, 6, null));
        }
    }
}
