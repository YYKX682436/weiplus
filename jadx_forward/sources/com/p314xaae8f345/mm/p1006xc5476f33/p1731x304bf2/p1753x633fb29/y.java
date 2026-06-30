package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f222055d;

    public y(long j17) {
        this.f222055d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.pm.ApplicationInfo applicationInfo;
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        long j17 = this.f222055d;
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameDownloadEventBus", "fInfo is null");
            return;
        }
        if (c17.f68441x10a0fed7 == 3) {
            if (com.p314xaae8f345.mm.vfs.w6.j(c17.f68419xf1e9b966)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadEventBus", "onInstallFinish, delete file: %s", c17.f68419xf1e9b966);
                com.p314xaae8f345.mm.vfs.w6.h(c17.f68419xf1e9b966);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadEventBus", "removeDownloadInfo, appId=" + c17.f68404x28d45f97);
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.i(j17);
            vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
            java.lang.String str = c17.f68404x28d45f97;
            ((uz.p1) q1Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.j(str);
            vz.q1 q1Var2 = (vz.q1) i95.n0.c(vz.q1.class);
            java.lang.String str2 = c17.f68411x238eb002;
            ((uz.p1) q1Var2).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.k(str2);
            android.content.pm.PackageInfo a17 = ik1.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, c17.f68429xa1e9e82c);
            if (a17 != null && (applicationInfo = a17.applicationInfo) != null) {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(applicationInfo.sourceDir);
                ((uz.a2) ((vz.y1) i95.n0.c(vz.y1.class))).getClass();
                java.lang.String a18 = e02.k.a(r6Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadEventBus", "gamelog.download , onInstallFinish, channelId =" + a18);
                c17.f68407xf1be7c79 = a18;
            }
            g02.c cVar = new g02.c();
            cVar.a(c17);
            ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
            g02.b.c(5, cVar);
            vz.t1 t1Var = (vz.t1) i95.n0.c(vz.t1.class);
            java.lang.String str3 = c17.f68404x28d45f97;
            ((uz.r1) t1Var).getClass();
            g02.b.d(str3, 8L, 1L);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.a0 a0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.a0) com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0.f221759c.get(c17.f68411x238eb002);
            if (a0Var == null) {
                vz.t1 t1Var2 = (vz.t1) i95.n0.c(vz.t1.class);
                java.lang.String str4 = c17.f68404x28d45f97;
                int i17 = c17.f68432x29cbf907;
                java.lang.String str5 = c17.f68426x4b6e68b9;
                java.lang.String str6 = c17.f68411x238eb002;
                java.lang.String str7 = c17.f68417x26b3182a;
                ((uz.r1) t1Var2).getClass();
                g02.b.b(str4, i17, 5, str5, str6, "", str7);
                return;
            }
            vz.t1 t1Var3 = (vz.t1) i95.n0.c(vz.t1.class);
            java.lang.String str8 = a0Var.f221726c;
            int i18 = a0Var.f221725b;
            java.lang.String str9 = a0Var.f221724a;
            java.lang.String str10 = c17.f68411x238eb002;
            java.lang.String str11 = a0Var.f221727d;
            java.lang.String str12 = a0Var.f221728e;
            ((uz.r1) t1Var3).getClass();
            g02.b.b(str8, i18, 5, str9, str10, str11, str12);
            vz.f1 f1Var = (vz.f1) i95.n0.c(vz.f1.class);
            java.lang.String str13 = c17.f68429xa1e9e82c;
            ((uz.a) f1Var).getClass();
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("install_begin_time", 0);
            if (java.lang.System.currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong(str13, 0L) : 0L) <= 600000) {
                ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
                g02.b.c(17, cVar);
            }
        }
    }
}
