package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61;

/* loaded from: classes12.dex */
public abstract class x {
    public static void a(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 n0Var, boolean z17, boolean z18) {
        if (n0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "get null record, skip");
            return;
        }
        java.lang.String str = n0Var.f68798x13f2e555;
        java.lang.String str2 = n0Var.f68777xf1e9b966;
        java.lang.String str3 = n0Var.f68785x4b6e68b9;
        boolean z19 = n0Var.f68775x9cdeb823;
        boolean z27 = n0Var.f68776x7d1f4984;
        byte[] bArr = n0Var.f68772xd98985d8;
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(n0Var.f68780xf1e133f7, 0);
        int i17 = n0Var.f68783xe47531de;
        java.lang.String str4 = n0Var.f68773x5efdd21f;
        boolean z28 = n0Var.f68771xd0fcddd4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "queried info: deleted = " + z28 + ", filePath = " + str2 + ", md5 = " + str3 + ", originalMd5 = " + n0Var.f68788xd2f45e28 + ", fileCompress = " + z19 + ", fileEncrypt = " + z27 + ", eccSignature = " + bArr + ", fileVersion = " + P + ", (encrypt key == empty) = " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4));
        if (!z27) {
            if (z17) {
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(n0Var.f68791x44eeb14, 53L);
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(n0Var.f68791x44eeb14, 45L);
            }
            if (!z19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "file is not encrypted nor compressed, just return");
                return;
            }
        }
        if (i17 != P && z27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "file version(%d) != key version(%d), skip", java.lang.Integer.valueOf(P), java.lang.Integer.valueOf(i17));
            if (i17 >= 0) {
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(n0Var.f68791x44eeb14, 52L);
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(n0Var.f68791x44eeb14, 45L);
                return;
            }
            return;
        }
        if (z28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "this file should have been deleted, skip this decrypt-op");
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(n0Var.f68791x44eeb14, 51L);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(n0Var.f68791x44eeb14, 45L);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) && z27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "encryptKey invalid, skip");
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(n0Var.f68791x44eeb14, 54L);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(n0Var.f68791x44eeb14, 45L);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "this decrypt-op is invalid, record.md5 = %s, record.filePath = %s", str3, str2);
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
        if (l0Var.c(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "request(%s) is downloading or queueing, hold this decrypt-op", str);
            return;
        }
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str2);
        if (p17 == null) {
            p17 = "";
        }
        if (!p17.equals(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "md5 not match, file spoiled, skip this decrypt-op");
            n0Var.f68795x10a0fed7 = 3;
            l0Var.g(n0Var, true);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(n0Var.f68791x44eeb14, 56L);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(n0Var.f68791x44eeb14, 45L);
            return;
        }
        if (l0Var.c(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "request supposed to complete, send decrypt request %s", n0Var.f68798x13f2e555);
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p c17 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c();
        int i18 = n0Var.f68792xb5ef19b5;
        int i19 = n0Var.f68796x5334f55;
        java.lang.String str5 = n0Var.f68782x3bf12d1d;
        c17.i(i18, i19, 1, (str5 != null ? str5 : "").equals("NewXml"));
        if (!z18) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().a(n0Var);
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p c18 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c();
        c18.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "performDecryptDirectly, urlkey %s", n0Var.f68798x13f2e555);
        c18.f271166b.getClass();
        new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.g0(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.a.b(n0Var)).run();
    }
}
