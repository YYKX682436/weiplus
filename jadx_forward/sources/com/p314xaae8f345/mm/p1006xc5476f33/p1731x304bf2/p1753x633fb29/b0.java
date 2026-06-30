package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0 f221757a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f221758b = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f221759c = new java.util.HashMap();

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0 b() {
        if (f221757a == null) {
            f221757a = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0();
        }
        return f221757a;
    }

    public static void g(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        f221759c.put(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.a0(str2, i17, str3, str4, str5));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x004f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r19, int r21) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0.a(long, int):void");
    }

    public void c(long j17, int i17, boolean z17) {
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 != null && c17.f68409xc4f9be67 && !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadEventBus", "wifi pause, return");
            c17.f68441x10a0fed7 = 2;
            c17.f68416x1c571ead = 0;
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
            g02.c cVar = new g02.c();
            cVar.a(c17);
            ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
            g02.b.c(13, cVar);
            return;
        }
        a(j17, 5);
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c18 != null) {
            java.lang.String str = null;
            if (i17 == 802) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("ChannelId", c18.f68407xf1be7c79);
                    jSONObject.put("DownloadSize", c18.f68413xf432b5ad);
                    str = n53.a.e(jSONObject.toString());
                    jSONObject.toString();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameDownloadEventBus", "reportDownloadFailed, e = " + e17.getMessage());
                }
            }
            e(c18.f68404x28d45f97, i17, z17, str);
        }
        d(j17);
        f(j17);
        ((uz.g) ((vz.m1) i95.n0.c(vz.m1.class))).getClass();
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.q.f178649a;
        int j18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) hashMap.get(java.lang.Long.valueOf(j17)), 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadRetry", "gamelog.download, checkRetryFailTask ,retry downloadId =  %d, retryCount = %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(j18));
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            if (java.lang.System.currentTimeMillis() - j17 <= 259200000) {
                if (!hashMap.containsKey(java.lang.Long.valueOf(j17)) || ((java.lang.Integer) hashMap.get(java.lang.Long.valueOf(j17))).intValue() < 2) {
                    ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.p(j17, j18), j18 * 60000);
                }
            }
        }
    }

    public final void d(long j17) {
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportDownloadAppState", "report, info is null");
            return;
        }
        if (!c17.f68424x9ef535e4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportDownloadAppState", "report,not from weApp, return");
            return;
        }
        if (c17.f68441x10a0fed7 == 3 && !com.p314xaae8f345.mm.vfs.w6.j(c17.f68419xf1e9b966)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportDownloadAppState", "download success, but file not exist");
            return;
        }
        n33.h hVar = new n33.h();
        hVar.f416052d = c17.f68404x28d45f97;
        int i17 = c17.f68441x10a0fed7;
        if (i17 == 3) {
            hVar.f416053e = 1;
        } else if (i17 == 4) {
            hVar.f416053e = 2;
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 2683;
        lVar.f152199c = "/cgi-bin/mmgame-bin/reportappdownloadstatus";
        lVar.f152197a = hVar;
        lVar.f152198b = new n33.i();
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new q43.k(), false);
    }

    public void e(java.lang.String str, int i17, boolean z17, java.lang.String str2) {
        if (i17 == 710 || i17 == 711) {
            i17 = 804;
        }
        int i18 = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadEventBus", "appid = %s, errCode = %d", str, java.lang.Integer.valueOf(i18));
        if (z17) {
            jj0.a.a().c(str, 4, i18, null, str2);
        } else {
            jj0.a.a().c(str, 2, i18, null, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(long r18) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0.f(long):void");
    }
}
