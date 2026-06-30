package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61;

/* loaded from: classes12.dex */
public abstract class w {
    public static void a(boolean z17, boolean z18, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 n0Var, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.z zVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "sendIORequest, fileAppend = %b, fileUpdate = %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        int i17 = n0Var.f68784xeef7a77d;
        if (i17 > 0 && n0Var.f68793x74b591e3 <= 0 && !z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "record_maxRetryTimes = %d, record_retryTimes = %d, retry times out, skip", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(n0Var.f68793x74b591e3));
            return;
        }
        n0Var.f68791x44eeb14 = zVar.f271175p;
        n0Var.f68795x10a0fed7 = 0;
        if (z18) {
            int i18 = zVar.f271190e;
            n0Var.f68784xeef7a77d = i18;
            n0Var.f68793x74b591e3 = i18;
            n0Var.f68779xcef2f7da = true;
            n0Var.f68790xd84b8349 = zVar.f271196k;
            long j17 = zVar.f271185z;
            if (j17 > 0) {
                n0Var.f68778xf1eb3542 = j17;
            }
            n0Var.f68777xf1e9b966 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.b(zVar.f271187b);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a.g(n0Var, true);
        } else {
            n0Var.f68793x74b591e3--;
            n0Var.f68790xd84b8349 = zVar.f271196k;
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a.g(n0Var, true);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(n0Var.f68791x44eeb14, 12L);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
        if (l0Var.c(zVar.f271187b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "urlKey = %s is already downloading", zVar.f271187b);
            if (zVar.A) {
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(zVar.f271175p, 9L);
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(zVar.f271175p, 44L);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "urlKey = %s, post network task", zVar.f271187b);
        if (z18 && !z17) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p c17 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c();
            int i19 = n0Var.f68792xb5ef19b5;
            int i27 = n0Var.f68796x5334f55;
            java.lang.String str = n0Var.f68782x3bf12d1d;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            c17.i(i19, i27, 0, str.equals("NewXml"));
        }
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t d17 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t.d(n0Var);
        d17.f271171o = z17;
        d17.f271170n = zVar.f271184y;
        if (!z17) {
            o35.a.a(d17.b());
            o35.a.a(d17.b() + ".decompressed");
            o35.a.a(d17.b() + ".decrypted");
        }
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.e(n0Var.f68792xb5ef19b5, n0Var.f68796x5334f55, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(n0Var.f68780xf1e133f7, 0), (int) n0Var.f68791x44eeb14, 76);
        l0Var.a(d17);
    }
}
