package com.tencent.mm.plugin.downloader.api;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class e implements com.tencent.mm.ipcinvoker.k0 {
    private e() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        java.lang.String str = null;
        if (iPCString == null) {
            return null;
        }
        java.lang.String str2 = iPCString.f68406d;
        java.lang.String str3 = (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.downloader.api.f.f96905b).get(str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mm.autogen.events.GetAppIdByUrlEvent getAppIdByUrlEvent = new com.tencent.mm.autogen.events.GetAppIdByUrlEvent();
            getAppIdByUrlEvent.f54379g.f6759a = str2;
            getAppIdByUrlEvent.e();
            str3 = getAppIdByUrlEvent.f54380h.f6833a;
        }
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadExtension", "getOpenId invoke in main thread");
            com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(str3, false, false);
            if (j17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(j17.field_openId)) {
                str = j17.field_openId;
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadExtension", "getOpenId invoke in worker thread");
            str = zo3.p.Ui().d(str3);
        }
        return new com.tencent.mm.ipcinvoker.type.IPCString(str);
    }
}
