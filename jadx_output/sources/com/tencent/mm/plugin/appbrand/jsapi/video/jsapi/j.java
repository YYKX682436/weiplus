package com.tencent.mm.plugin.appbrand.jsapi.video.jsapi;

/* loaded from: classes12.dex */
public final class j extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "preDownloadVideoResource";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.vfs.x1 m17;
        if (jSONObject == null) {
            if (lVar != null) {
                lVar.a(i17, o("fail:miss params"));
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiPreDownloadVideoResource", "data is null");
            return;
        }
        java.lang.String url = jSONObject.optString("videoUrl");
        int optInt = jSONObject.optInt("downloadRatio", 100);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreDownloadVideoResource", "preDownloadVideoResource videoUrl:%s downloadRatio:%d", url, java.lang.Integer.valueOf(optInt));
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiPreDownloadVideoResource", "videoUrl is null");
            if (lVar != null) {
                lVar.a(i17, o("fail:videoUrl is empty"));
                return;
            }
            return;
        }
        if (optInt <= 0) {
            if (lVar != null) {
                lVar.a(i17, o("fail:downloadRatio is invalid"));
                return;
            }
            return;
        }
        if (((oe1.r1) i95.n0.c(oe1.r1.class)) == null) {
            if (lVar != null) {
                lVar.a(i17, o("fail:service not found"));
                return;
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.i iVar = new com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.i(new java.lang.ref.WeakReference(lVar), i17, this);
        kotlin.jvm.internal.o.g(url, "url");
        pk1.g0 g0Var = pk1.g0.f355447d;
        oe1.y1 y1Var = new oe1.y1(iVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "preDownload, srcUrl: " + url + ", preloadRatio: " + optInt);
        pk1.u uVar = pk1.z.f355530a.b(url).f355526a;
        java.lang.String downloadId = uVar.f355523b;
        pk1.c0 c0Var = pk1.c0.f355423d;
        kotlin.jvm.internal.o.g(downloadId, "downloadId");
        java.util.concurrent.locks.ReentrantLock reentrantLock = pk1.c0.f355424e;
        reentrantLock.lock();
        try {
            int i18 = -21006;
            long j17 = 0;
            if ((((pk1.b0) pk1.c0.f355425f.get(downloadId)) != null ? pk1.m0.f355480e : pk1.m0.f355479d) == pk1.m0.f355480e) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "media is downloading");
                pk1.d0[] d0VarArr = pk1.d0.f355438d;
                y1Var.invoke(-21006, 0L, -1L);
                return;
            }
            boolean z17 = uVar.f355525d;
            java.lang.String str = uVar.f355524c;
            if (z17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "media is cached finished");
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
                java.lang.String str2 = a17.f213279f;
                if (str2 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) {
                    j17 = m17.f213233c;
                }
                pk1.d0[] d0VarArr2 = pk1.d0.f355438d;
                y1Var.invoke(1, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j17));
                return;
            }
            pk1.b bVar = pk1.b.f355416d;
            dn.o oVar = new dn.o();
            oVar.M1 = url;
            oVar.field_mediaId = downloadId;
            oVar.field_fullpath = str;
            oVar.f241815c2 = g0Var;
            oVar.f241785d = "task_AppbrandCdnService_2";
            oVar.Z = 4;
            oVar.field_preloadRatio = optInt;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCdnService", "addPreDownloadTask, mediaId: " + oVar.field_mediaId);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = pk1.b.f355418f;
            if (concurrentHashMap.putIfAbsent(oVar.field_mediaId, oVar) != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandCdnService", "preDownload task has already add");
            } else {
                com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
                c2CDownloadRequest.fileKey = oVar.field_mediaId;
                c2CDownloadRequest.url = oVar.M1;
                c2CDownloadRequest.setSavePath(oVar.field_fullpath);
                c2CDownloadRequest.fileType = 20210;
                c2CDownloadRequest.concurrentCount = 10;
                c2CDownloadRequest.preloadRatio = oVar.field_preloadRatio;
                c2CDownloadRequest.customHeader = pk1.b.f355417e;
                i18 = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startHttpVideoStreamingDownload(c2CDownloadRequest, bVar, bVar, 2);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCdnService", "startHttpVideoStreamingDownload preDownload result: " + i18);
                if (i18 != 0) {
                    concurrentHashMap.remove(oVar.field_mediaId);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "preDownload, addPreDownloadTask result:" + i18);
            if (i18 != 0) {
                y1Var.invoke(java.lang.Integer.valueOf(i18), 0L, -1L);
                return;
            }
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = pk1.g0.f355448e;
            reentrantLock2.lock();
            try {
                pk1.g0.f355449f.put(downloadId, new pk1.e0(url, downloadId, 0L, 0L, optInt, 12, null));
                reentrantLock2.unlock();
                java.util.concurrent.locks.ReentrantLock reentrantLock3 = pk1.g0.f355450g;
                reentrantLock3.lock();
                try {
                    java.util.HashMap hashMap = pk1.g0.f355451h;
                    java.lang.Object obj = hashMap.get(downloadId);
                    if (obj == null) {
                        obj = new java.util.HashSet();
                        hashMap.put(downloadId, obj);
                    }
                    ((java.util.HashSet) obj).add(y1Var);
                } finally {
                    reentrantLock3.unlock();
                }
            } catch (java.lang.Throwable th6) {
                reentrantLock2.unlock();
                throw th6;
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
