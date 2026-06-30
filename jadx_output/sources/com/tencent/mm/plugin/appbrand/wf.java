package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class wf extends com.tencent.mm.weapp_core.WeAppDownloader {
    @Override // com.tencent.mm.weapp_core.WeAppDownloader
    public void onCanceled(long j17) {
        java.lang.Object remove;
        synchronized (com.tencent.mm.plugin.appbrand.yf.f92430b) {
            remove = com.tencent.mm.plugin.appbrand.yf.f92431c.remove(java.lang.Long.valueOf(j17));
        }
        com.tencent.mm.plugin.appbrand.xf xfVar = (com.tencent.mm.plugin.appbrand.xf) remove;
        if (xfVar != null) {
            com.tencent.mm.plugin.appbrand.appcache.i7 i7Var = (com.tencent.mm.plugin.appbrand.appcache.i7) xfVar;
            com.tencent.mm.plugin.appbrand.appcache.a9 a9Var = i7Var.f75592a;
            com.tencent.mars.xlog.Log.w("MicroMsg.WeAppCoreDownloadPerformer", "notifyTimeout for urlKey:%s", a9Var.f());
            com.tencent.mm.pluginsdk.res.downloader.model.v vVar = new com.tencent.mm.pluginsdk.res.downloader.model.v(a9Var, (java.lang.Exception) null, 0, 4);
            vVar.f189732j.putBoolean("RESPONSE_KEY_USE_WEAPP_CORE", true);
            i7Var.f75595d[0] = vVar;
            i7Var.f75596e.countDown();
        }
        downloadFinished(j17);
    }

    @Override // com.tencent.mm.weapp_core.WeAppDownloader
    public void onFailed(long j17, long j18, java.lang.String errMsg) {
        java.lang.Object remove;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        synchronized (com.tencent.mm.plugin.appbrand.yf.f92430b) {
            remove = com.tencent.mm.plugin.appbrand.yf.f92431c.remove(java.lang.Long.valueOf(j17));
        }
        com.tencent.mm.plugin.appbrand.xf xfVar = (com.tencent.mm.plugin.appbrand.xf) remove;
        if (xfVar != null) {
            com.tencent.mm.plugin.appbrand.appcache.i7 i7Var = (com.tencent.mm.plugin.appbrand.appcache.i7) xfVar;
            i7Var.a(j18, errMsg);
            i7Var.f75597f.l();
        }
        downloadFinished(j17);
    }

    @Override // com.tencent.mm.weapp_core.WeAppDownloader
    public void onProgress(long j17, long j18, long j19) {
        java.lang.Object obj;
        synchronized (com.tencent.mm.plugin.appbrand.yf.f92430b) {
            obj = com.tencent.mm.plugin.appbrand.yf.f92431c.get(java.lang.Long.valueOf(j17));
        }
        com.tencent.mm.plugin.appbrand.xf xfVar = (com.tencent.mm.plugin.appbrand.xf) obj;
        if (xfVar != null) {
            com.tencent.mm.plugin.appbrand.appcache.i7 i7Var = (com.tencent.mm.plugin.appbrand.appcache.i7) xfVar;
            com.tencent.mm.plugin.appbrand.appcache.c9 c9Var = (com.tencent.mm.plugin.appbrand.appcache.c9) i7Var.f75592a.f189736g;
            if (c9Var != null) {
                long j27 = j19 > j18 ? j18 : j19;
                c9Var.d(i7Var.f75592a.f(), new com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress(j18 <= 0 ? 0 : a06.d.b(e06.p.e((((float) j27) * 100.0f) / ((float) j18), 0.0f, 100.0f)), j27, j18));
            }
        }
    }

    @Override // com.tencent.mm.weapp_core.WeAppDownloader
    public void onSuccess(long j17, long j18, java.lang.String negotiatedProtocol) {
        java.lang.Object remove;
        kotlin.jvm.internal.o.g(negotiatedProtocol, "negotiatedProtocol");
        synchronized (com.tencent.mm.plugin.appbrand.yf.f92430b) {
            remove = com.tencent.mm.plugin.appbrand.yf.f92431c.remove(java.lang.Long.valueOf(j17));
        }
        com.tencent.mm.plugin.appbrand.xf xfVar = (com.tencent.mm.plugin.appbrand.xf) remove;
        if (xfVar != null) {
            com.tencent.mm.plugin.appbrand.appcache.i7 i7Var = (com.tencent.mm.plugin.appbrand.appcache.i7) xfVar;
            boolean z17 = j18 == 200 || j18 == 206;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            java.lang.Long valueOf2 = java.lang.Long.valueOf(j18);
            com.tencent.mm.plugin.appbrand.appcache.a9 a9Var = i7Var.f75592a;
            com.tencent.mars.xlog.Log.i("MicroMsg.WeAppCoreDownloadPerformer", "onSuccess, succeed:%b, statusCode:%d, key:%s, proto:%s", valueOf, valueOf2, a9Var.f(), negotiatedProtocol);
            if (z17) {
                com.tencent.mm.pluginsdk.res.downloader.model.v vVar = new com.tencent.mm.pluginsdk.res.downloader.model.v("AppBrandWxaPkgDownloader", a9Var.f(), a9Var.f75435i, a9Var.e(), -1L, null, 2, null);
                m81.b bVar = i7Var.f75594c;
                java.lang.String str = bVar.f189714c;
                java.lang.String str2 = i7Var.f75593b;
                if (!u46.l.c(str2, str)) {
                    com.tencent.mm.vfs.w6.w(str2, bVar.f189714c);
                }
                i7Var.f75595d[0] = vVar;
                android.os.Bundle bundle = vVar.f189732j;
                bundle.putInt("RESPONSE_KEY_DNS_TYPE", 0);
                bundle.putBoolean("RESPONSE_KEY_USE_WEAPP_CORE", true);
                if (kotlin.jvm.internal.o.b(negotiatedProtocol, "h2")) {
                    bundle.putBoolean("RESPONSE_KEY_USE_HTTP2", true);
                } else if (kotlin.jvm.internal.o.b(negotiatedProtocol, "h3")) {
                    bundle.putBoolean("RESPONSE_KEY_USE_HTTP3", true);
                }
                i7Var.f75596e.countDown();
            } else {
                i7Var.a(j18, "Download failed with status code: " + j18);
            }
        }
        downloadFinished(j17);
    }
}
