package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61;

/* loaded from: classes12.dex */
public final class a0 {
    public static boolean b(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 n0Var) {
        if (n0Var.f68775x9cdeb823) {
            if (java.util.Objects.equals(com.p314xaae8f345.mm.vfs.w6.p(n0Var.f68777xf1e9b966 + ".decompressed"), n0Var.f68788xd2f45e28)) {
                return true;
            }
        } else if (n0Var.f68776x7d1f4984) {
            if (java.util.Objects.equals(com.p314xaae8f345.mm.vfs.w6.p(n0Var.f68777xf1e9b966 + ".decrypted"), n0Var.f68788xd2f45e28)) {
                return true;
            }
        }
        return java.util.Objects.equals(com.p314xaae8f345.mm.vfs.w6.p(n0Var.f68777xf1e9b966), n0Var.f68785x4b6e68b9);
    }

    public final void a(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 n0Var, boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
        java.lang.String str = n0Var.f68798x13f2e555;
        if (l0Var.f271219e) {
            l0Var.f271216b.a(str);
        }
        o35.a.a(n0Var.f68777xf1e9b966);
        o35.a.a(n0Var.f68777xf1e9b966 + ".decompressed");
        o35.a.a(n0Var.f68777xf1e9b966 + ".decrypted");
        if (2 == n0Var.f68795x10a0fed7 && !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "delete completed but invalid file, but forceDL = false, skip this downloading");
            return;
        }
        int i17 = n0Var.f68784xeef7a77d;
        if (i17 > 0 && n0Var.f68793x74b591e3 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "record_maxRetryTimes = %d, record_retryTimes = %d, retry times out, skip ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(n0Var.f68793x74b591e3));
            return;
        }
        n0Var.f68793x74b591e3--;
        n0Var.f68779xcef2f7da = true;
        l0Var.g(n0Var, true);
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(n0Var.f68791x44eeb14, 12L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "post network task");
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t d17 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t.d(n0Var);
        d17.f271171o = false;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.e(n0Var.f68792xb5ef19b5, n0Var.f68796x5334f55, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(n0Var.f68780xf1e133f7, 0), (int) n0Var.f68791x44eeb14, 76);
        l0Var.a(d17);
    }

    public final void c(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 n0Var) {
        if (!n0Var.f68775x9cdeb823 && !n0Var.f68776x7d1f4984) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().h(n0Var.f68792xb5ef19b5, n0Var.f68796x5334f55, n0Var.f68777xf1e9b966, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(n0Var.f68780xf1e133f7, 0), n0Var.f68788xd2f45e28);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "send query and decrypt request");
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().a(n0Var);
        }
    }
}
