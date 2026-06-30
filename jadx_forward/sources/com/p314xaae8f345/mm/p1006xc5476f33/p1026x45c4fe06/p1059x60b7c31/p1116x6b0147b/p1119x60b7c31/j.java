package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31;

/* loaded from: classes12.dex */
public final class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34930x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f34931x24728b = "preDownloadVideoResource";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.vfs.x1 m17;
        if (jSONObject == null) {
            if (lVar != null) {
                lVar.a(i17, o("fail:miss params"));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiPreDownloadVideoResource", "data is null");
            return;
        }
        java.lang.String url = jSONObject.optString("videoUrl");
        int optInt = jSONObject.optInt("downloadRatio", 100);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreDownloadVideoResource", "preDownloadVideoResource videoUrl:%s downloadRatio:%d", url, java.lang.Integer.valueOf(optInt));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(url)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiPreDownloadVideoResource", "videoUrl is null");
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.i(new java.lang.ref.WeakReference(lVar), i17, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        pk1.g0 g0Var = pk1.g0.f436980d;
        oe1.y1 y1Var = new oe1.y1(iVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "preDownload, srcUrl: " + url + ", preloadRatio: " + optInt);
        pk1.u uVar = pk1.z.f437063a.b(url).f437059a;
        java.lang.String downloadId = uVar.f437056b;
        pk1.c0 c0Var = pk1.c0.f436956d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadId, "downloadId");
        java.util.concurrent.locks.ReentrantLock reentrantLock = pk1.c0.f436957e;
        reentrantLock.lock();
        try {
            int i18 = -21006;
            long j17 = 0;
            if ((((pk1.b0) pk1.c0.f436958f.get(downloadId)) != null ? pk1.m0.f437013e : pk1.m0.f437012d) == pk1.m0.f437013e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "media is downloading");
                pk1.d0[] d0VarArr = pk1.d0.f436971d;
                y1Var.mo147xb9724478(-21006, 0L, -1L);
                return;
            }
            boolean z17 = uVar.f437058d;
            java.lang.String str = uVar.f437057c;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "media is cached finished");
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
                java.lang.String str2 = a17.f294812f;
                if (str2 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) {
                    j17 = m17.f294766c;
                }
                pk1.d0[] d0VarArr2 = pk1.d0.f436971d;
                y1Var.mo147xb9724478(1, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j17));
                return;
            }
            pk1.b bVar = pk1.b.f436949d;
            dn.o oVar = new dn.o();
            oVar.M1 = url;
            oVar.f69601xaca5bdda = downloadId;
            oVar.f69595x6d25b0d9 = str;
            oVar.f323348c2 = g0Var;
            oVar.f323318d = "task_AppbrandCdnService_2";
            oVar.Z = 4;
            oVar.f69608x6ac8fea7 = optInt;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCdnService", "addPreDownloadTask, mediaId: " + oVar.f69601xaca5bdda);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = pk1.b.f436951f;
            if (concurrentHashMap.putIfAbsent(oVar.f69601xaca5bdda, oVar) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandCdnService", "preDownload task has already add");
            } else {
                com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest();
                c2CDownloadRequest.f17792xcd096f43 = oVar.f69601xaca5bdda;
                c2CDownloadRequest.url = oVar.M1;
                c2CDownloadRequest.m37861xfb0731c4(oVar.f69595x6d25b0d9);
                c2CDownloadRequest.f17793xd428dad6 = 20210;
                c2CDownloadRequest.f17780x81527598 = 10;
                c2CDownloadRequest.f17820x5e9d4f82 = oVar.f69608x6ac8fea7;
                c2CDownloadRequest.f17782x37c415e = pk1.b.f436950e;
                i18 = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37787x52efc79(c2CDownloadRequest, bVar, bVar, 2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCdnService", "startHttpVideoStreamingDownload preDownload result: " + i18);
                if (i18 != 0) {
                    concurrentHashMap.remove(oVar.f69601xaca5bdda);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "preDownload, addPreDownloadTask result:" + i18);
            if (i18 != 0) {
                y1Var.mo147xb9724478(java.lang.Integer.valueOf(i18), 0L, -1L);
                return;
            }
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = pk1.g0.f436981e;
            reentrantLock2.lock();
            try {
                pk1.g0.f436982f.put(downloadId, new pk1.e0(url, downloadId, 0L, 0L, optInt, 12, null));
                reentrantLock2.unlock();
                java.util.concurrent.locks.ReentrantLock reentrantLock3 = pk1.g0.f436983g;
                reentrantLock3.lock();
                try {
                    java.util.HashMap hashMap = pk1.g0.f436984h;
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
