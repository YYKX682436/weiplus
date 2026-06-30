package com.tencent.mm.minigame.download.mmdownloader;

/* loaded from: classes7.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.minigame.download.mmdownloader.JsApiAddDownloadTaskForWVA$AddDownloadTask f69042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.minigame.download.mmdownloader.JsApiAddDownloadTaskForWVA$AddDownloadTask jsApiAddDownloadTaskForWVA$AddDownloadTask) {
        super(2);
        this.f69042d = jsApiAddDownloadTaskForWVA$AddDownloadTask;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mars.xlog.Log.e("MicroMsg.WVA.addDownloadTaskForWVA", "fetchWVADownloadInfo failed: errCode=" + ((java.lang.Number) obj).intValue() + ", errMsg=" + str);
        com.tencent.mm.minigame.download.mmdownloader.JsApiAddDownloadTaskForWVA$AddDownloadTask jsApiAddDownloadTaskForWVA$AddDownloadTask = this.f69042d;
        jsApiAddDownloadTaskForWVA$AddDownloadTask.D = true;
        if (str == null) {
            str = "fail_fetch_download_info";
        }
        jsApiAddDownloadTaskForWVA$AddDownloadTask.E = str;
        jsApiAddDownloadTaskForWVA$AddDownloadTask.c();
        return jz5.f0.f302826a;
    }
}
