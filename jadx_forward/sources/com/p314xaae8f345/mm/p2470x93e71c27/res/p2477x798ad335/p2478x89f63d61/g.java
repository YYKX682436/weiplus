package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.z f271111e;

    public g(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p pVar, java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.z zVar) {
        this.f271110d = str;
        this.f271111e = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 e17 = l0Var.e(this.f271110d);
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.z zVar = this.f271111e;
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "queried record is null, urlKey = %s", zVar.f271187b);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "queried record: urlKey = %s, url = %s, contentLength = %d, deleted = %b, eccSignature = %s, expireTime = %d, fileCompress = %b, fileEncrypt = %b, filePath = %s, fileUpdated = %b, fileVersion = %s, from = %s, keyVersion = %s, (encryptKey == null) = %b, maxRetryTimes = %d, retriedTimes = %d, sampleId = %s, dlStatus = %d", e17.f68798x13f2e555, e17.f68797x4b6e88aa, java.lang.Long.valueOf(e17.f68769x590f923a), java.lang.Boolean.valueOf(e17.f68771xd0fcddd4), e17.f68772xd98985d8, java.lang.Long.valueOf(e17.f68774x876650f1), java.lang.Boolean.valueOf(e17.f68775x9cdeb823), java.lang.Boolean.valueOf(e17.f68776x7d1f4984), e17.f68777xf1e9b966, java.lang.Boolean.valueOf(e17.f68779xcef2f7da), e17.f68780xf1e133f7, e17.f68782x3bf12d1d, java.lang.Integer.valueOf(e17.f68783xe47531de), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17.f68773x5efdd21f)), java.lang.Integer.valueOf(e17.f68784xeef7a77d), java.lang.Integer.valueOf(e17.f68793x74b591e3), e17.f68794x9383c60a, java.lang.Integer.valueOf(e17.f68795x10a0fed7));
        }
        if (e17 != null && e17.f68771xd0fcddd4) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(zVar.f271188c, 0) - com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(e17.f68780xf1e133f7, 0) <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "deletedFile.version = %s, cacheReq.version = %s, this file should have been deleted, skip this cache-op", e17.f68780xf1e133f7, zVar.f271188c);
                return;
            }
        }
        if (e17 == null) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 a17 = zVar.a();
            a17.f68779xcef2f7da = true;
            a17.f68786xda09c2ad = true;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f68773x5efdd21f)) {
                a17.f68783xe47531de = -1;
            }
            a17.m75320x9616526c();
            l0Var.g(a17, true);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().i(zVar.f271173n, zVar.f271174o, 0, zVar.A);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.w.a(true, true, a17, zVar);
            return;
        }
        e17.f68787xf813eec3 = zVar.f271189d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17.f68788xd2f45e28)) {
            e17.f68788xd2f45e28 = zVar.f271178s;
        }
        java.lang.String str = e17.f68780xf1e133f7;
        java.lang.String str2 = zVar.f271188c;
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str2, 0) - com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0);
        java.lang.String str3 = zVar.f271187b;
        boolean z17 = zVar.A;
        int i17 = zVar.f271174o;
        int i18 = zVar.f271173n;
        if (P > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "new version of file, re-download");
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 a18 = zVar.a();
            int i19 = e17.f68783xe47531de;
            if (i19 >= zVar.f271182w) {
                a18.f68783xe47531de = i19;
                a18.f68773x5efdd21f = e17.f68773x5efdd21f;
            }
            a18.f68779xcef2f7da = true;
            a18.f68786xda09c2ad = true;
            a18.f68771xd0fcddd4 = false;
            l0Var.g(a18, true);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().i(i18, i17, 0, z17);
            if (l0Var.f271219e) {
                l0Var.f271216b.a(str3);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.w.a(false, true, a18, zVar);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str2, 0) - com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(e17.f68780xf1e133f7, 0) == 0 && !e17.f68786xda09c2ad) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "no need retry, resType %d, subType %d, version %s", java.lang.Integer.valueOf(e17.f68792xb5ef19b5), java.lang.Integer.valueOf(e17.f68796x5334f55), e17.f68780xf1e133f7);
            return;
        }
        if (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.a0.b(e17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "no need retry, resType %d, subType %d, version %s checksum valid", java.lang.Integer.valueOf(e17.f68792xb5ef19b5), java.lang.Integer.valueOf(e17.f68796x5334f55), e17.f68780xf1e133f7);
            return;
        }
        int i27 = e17.f68795x10a0fed7;
        if (i27 != 2 && i27 != 1 && i27 != 0) {
            if (i27 == 4 || i27 == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "file invalid, re-download %s", e17.f68798x13f2e555);
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.w.a(false, true, e17, zVar);
                return;
            }
            return;
        }
        long g17 = o35.a.g(e17.f68777xf1e9b966);
        long j17 = e17.f68769x590f923a;
        if (j17 > g17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "content-length(%d) > fileSize(%d), resume download", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(g17));
            if (0 != g17) {
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.w.a(true, false, e17, zVar);
                return;
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().i(i18, i17, 0, z17);
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.w.a(false, true, e17, zVar);
                return;
            }
        }
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.b(str3));
        if (p17 == null) {
            p17 = "";
        }
        if (!p17.equals(e17.f68785x4b6e68b9)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "file invalid, re-download");
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.w.a(false, true, e17, zVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "md5 check ok, file download complete, throw event to do decrypt %s", e17.f68798x13f2e555);
        e17.f68795x10a0fed7 = 2;
        e17.f68769x590f923a = o35.a.g(e17.f68777xf1e9b966);
        e17.f68779xcef2f7da = false;
        e17.f68791x44eeb14 = zVar.f271175p;
        l0Var.g(e17, true);
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(e17.f68791x44eeb14, 13L);
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(e17.f68791x44eeb14, 44L);
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.c(e17.f68792xb5ef19b5, e17.f68796x5334f55, e17.f68797x4b6e88aa, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(e17.f68780xf1e133f7, 0), com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.d0.FILE_LATEST, true, "NewXml".equalsIgnoreCase(e17.f68782x3bf12d1d), true, e17.f68794x9383c60a);
        if (!zVar.f271179t && !zVar.f271180u) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().h(zVar.f271173n, zVar.f271174o, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.b(str3), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str2, 0), zVar.f271178s);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "send query and decrypt request %s", str3);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.x.a(e17, false, false);
        }
    }
}
