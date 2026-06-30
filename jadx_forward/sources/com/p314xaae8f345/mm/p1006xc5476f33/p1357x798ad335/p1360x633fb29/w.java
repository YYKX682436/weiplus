package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class w implements iv1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0 f178721a;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0 b0Var) {
        this.f178721a = b0Var;
    }

    public void a(java.lang.String str, int i17, int i18, java.lang.String str2) {
        boolean z17;
        h02.a f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.f(str);
        if (f17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(710L, 18L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "onDownloadTaskStateChanged, info is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "onDownloadTaskStateChanged, url = %s, state = %d, errCode = %d, errMsg = %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
        boolean z18 = true;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.m(f17.f68411x238eb002, 1);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0 b0Var = this.f178721a;
        if (i17 == 3) {
            f17.f68422xfdca0665 = java.lang.System.currentTimeMillis();
            long j17 = f17.f68443x78351860;
            f17.f68413xf432b5ad = j17;
            f17.f68441x10a0fed7 = 6;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "download succeed, downloadedSize = %d, startSize = %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(f17.f68438x1bb3427e));
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(f17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.m(f17.f68411x238eb002, 6);
            b0Var.f178745a.b(f17.f68408x32b20428);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178490n, 1);
            intent.setClass(b0Var.f178514c, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.class);
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178489m, f17.f68408x32b20428);
            try {
                j45.l.A(intent);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileCDNDownloader", e17.getMessage());
            }
            b0Var.h(f17.f68411x238eb002);
            b0Var.f178519h.remove(f17.f68411x238eb002);
            b0Var.f178520i.remove(f17.f68411x238eb002);
            return;
        }
        if (i17 != 4) {
            return;
        }
        if ((i18 != 21009 && i18 != 21020) || com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.u0.a(f17.f68443x78351860)) {
            z17 = false;
        } else {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.u0.c(f17.f68443x78351860)) {
                b0Var.e(f17);
                return;
            }
            z17 = true;
        }
        b0Var.getClass();
        if (f17.f68421xf1ebe47b == 5 && (i18 == -21 || (-109 <= i18 && i18 <= -100))) {
            iv1.f.f().g(f17.f68411x238eb002);
            b0Var.h(f17.f68411x238eb002);
            f17.f68422xfdca0665 = java.lang.System.currentTimeMillis();
            f17.f68441x10a0fed7 = 2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(f17);
            java.util.HashMap hashMap = b0Var.f178520i;
            long k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) hashMap.get(f17.f68411x238eb002), f17.f68440x1bb3b54a);
            java.util.HashMap hashMap2 = b0Var.f178519h;
            long k18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) hashMap2.get(f17.f68411x238eb002), f17.f68438x1bb3427e);
            long currentTimeMillis = java.lang.System.currentTimeMillis() - k17;
            if (currentTimeMillis > 0) {
                long j18 = f17.f68413xf432b5ad;
                k02.m.a(f17.f68408x32b20428, ((((float) (j18 - k18)) * 1000.0f) / ((float) currentTimeMillis)) / 1048576.0f, (int) ((((float) j18) / ((float) f17.f68443x78351860)) * 100.0f));
                hashMap2.remove(f17.f68411x238eb002);
                hashMap.remove(f17.f68411x238eb002);
            }
            b0Var.f178745a.e(f17.f68408x32b20428);
        } else {
            z18 = false;
        }
        if (z18) {
            return;
        }
        f17.f68422xfdca0665 = java.lang.System.currentTimeMillis();
        f17.f68416x1c571ead = java.lang.Math.abs(i18);
        f17.f68441x10a0fed7 = 4;
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && f17.f68409xc4f9be67) {
            f17.f68409xc4f9be67 = false;
            f17.f68431x4651c731 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(f17);
        b0Var.f178745a.c(f17.f68408x32b20428, java.lang.Math.abs(i18), false);
        this.f178721a.l(f17.f68411x238eb002, 4, 0, false, z17, false);
        b0Var.f178519h.remove(f17.f68411x238eb002);
        b0Var.f178520i.remove(f17.f68411x238eb002);
    }
}
