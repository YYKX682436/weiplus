package iv1;

/* loaded from: classes8.dex */
public class d extends fv1.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iv1.f f376639d;

    public d(iv1.f fVar) {
        this.f376639d = fVar;
    }

    @Override // fv1.f
    public void L2(java.lang.String str, int i17, int i18, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "onDownloadStateChange, mediaId = %s, state = %d, errCode = %d, errMsg = %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
        iv1.f fVar = this.f376639d;
        if (i17 != 1) {
            fVar.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00(str));
        }
        iv1.g gVar = fVar.f376647h;
        if (gVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.w) gVar).a(str, i17, i18, str2);
        }
    }

    @Override // fv1.f
    public void Ue(java.lang.String str, long j17, long j18) {
        iv1.g gVar = this.f376639d.f376647h;
        if (gVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.w) gVar;
            h02.a f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.f(str);
            if (f17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "onDownloadTaskProgressChanged, info is null");
                return;
            }
            boolean z17 = f17.f68409xc4f9be67;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0 b0Var = wVar.f178721a;
            if (z17 && !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                long j19 = f17.f68408x32b20428;
                b0Var.getClass();
                h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j19);
                if (c17 != null) {
                    c17.f68410x4e46f707 = 2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
                }
                g02.b.e(j19, 13);
                b0Var.c(j19);
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) b0Var.f178519h.get(f17.f68411x238eb002)));
            long longValue = valueOf.longValue();
            java.util.HashMap hashMap = b0Var.f178519h;
            if (longValue == 0) {
                valueOf = java.lang.Long.valueOf(j17);
                hashMap.put(f17.f68411x238eb002, java.lang.Long.valueOf(j17));
            }
            long longValue2 = j17 - valueOf.longValue();
            if (j18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "onDownloadTaskProgressChanged, totalDataLen = 0");
            } else {
                int i17 = (int) ((((float) j17) / ((float) j18)) * 100.0f);
                if ((100 * longValue2) / j18 >= 1) {
                    java.util.HashMap hashMap2 = b0Var.f178520i;
                    long k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) hashMap2.get(f17.f68411x238eb002), f17.f68440x1bb3b54a);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    k02.m.a(f17.f68408x32b20428, ((((float) longValue2) * 1000.0f) / ((float) (currentTimeMillis - k17))) / 1048576.0f, i17);
                    hashMap2.put(f17.f68411x238eb002, java.lang.Long.valueOf(currentTimeMillis));
                    hashMap.put(f17.f68411x238eb002, java.lang.Long.valueOf(j17));
                }
            }
            java.util.HashMap hashMap3 = b0Var.f178517f;
            java.lang.Long valueOf2 = java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) hashMap3.get(f17.f68411x238eb002)));
            java.lang.Long valueOf3 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            long longValue3 = valueOf3.longValue() - valueOf2.longValue();
            if (longValue3 <= 0 || longValue3 >= 500) {
                hashMap3.put(f17.f68411x238eb002, valueOf3);
                f17.f68413xf432b5ad = j17;
                f17.f68443x78351860 = j18;
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(f17);
                b0Var.f178745a.f(f17.f68408x32b20428, str, j17, j18);
                int i18 = j18 > 0 ? (int) ((((float) j17) / ((float) j18)) * 100.0f) : 0;
                b0Var.l(f17.f68411x238eb002, 1, i18 < 0 ? 0 : i18 > 100 ? 100 : i18, false, false, false);
            }
        }
    }
}
