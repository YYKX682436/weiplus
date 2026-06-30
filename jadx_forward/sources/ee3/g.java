package ee3;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult f333137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee3.h f333138e;

    public g(ee3.h hVar, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult) {
        this.f333138e = hVar;
        this.f333137d = cronetTaskResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.lang.String c17;
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult = this.f333137d;
        int i18 = (int) cronetTaskResult.f18209x953f8a7;
        int i19 = cronetTaskResult.f18207xec0a8ff;
        java.lang.String str = "";
        ee3.j jVar = this.f333138e.f333141c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "magicbrush_cronetdownload_callback_thread run taskid:%s,CronetRequestId:%s", jVar.f333157t, jVar.f333158u);
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult2 = this.f333137d;
        if (cronetTaskResult2.f18200x139cb015 != 0) {
            if (this.f333138e.f333141c.f333148h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrushDownloadWorker", "cronet onCronetTaskCompleted downloadFile fail already callback");
                return;
            }
            this.f333138e.f333141c.f333148h = true;
            ee3.j jVar2 = this.f333138e.f333141c;
            jVar2.f333146f.d(jVar2.f333151n, jVar2.f333150m, "download fail:" + this.f333137d.f18200x139cb015 + ":" + this.f333137d.f18201x5336c059, 300002);
            ee3.j jVar3 = this.f333138e.f333141c;
            je3.p.a(jVar3.f333149i, jVar3.f333160w, "GET", jVar3.f333150m, 0L, (long) i18, i19, 2, (int) (java.lang.System.currentTimeMillis() - jVar3.f333159v), this.f333138e.f333141c.f333151n, "");
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - this.f333138e.f333141c.f333156s);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "fail request time is " + currentTimeMillis);
            ((je3.i) i95.n0.c(je3.i.class)).Sc(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37554x9d048cec.name(), 1, null, 0.01f);
            ((je3.i) i95.n0.c(je3.i.class)).Sc(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37555x3cfc5ad9.name(), currentTimeMillis, null, 0.01f);
            return;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : cronetTaskResult2.m37975xf2b694d9().entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            if (key.equalsIgnoreCase("Content-Type") || key.equalsIgnoreCase("content-type")) {
                java.lang.String str2 = this.f333138e.f333141c.f333150m;
                q75.e a17 = q75.e.a(value);
                if (a17 == null) {
                    c17 = q75.g.c(str2);
                } else {
                    c17 = a17.f442140a;
                    if (c17.contains("application/octet-stream")) {
                        str = q75.g.c(str2);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        }
                    }
                }
                str = c17;
            }
        }
        if (i19 != 200) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i19);
            ee3.j jVar4 = this.f333138e.f333141c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrushDownloadWorker", "failed code: %d,url is %s,filename is %s ", valueOf, jVar4.f333150m, jVar4.f333151n);
            if (i19 == 301 || i19 == 302 || i19 == 307) {
                java.lang.String str3 = this.f333137d.f18203xbc380d75;
                if (!android.text.TextUtils.isEmpty(str3)) {
                    ee3.j jVar5 = this.f333138e.f333141c;
                    int i27 = jVar5.f333144d;
                    int i28 = i27 - 1;
                    jVar5.f333144d = i28;
                    if (i27 > 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "redirect(%d) URL(%s) to URL(%s)", java.lang.Integer.valueOf(i28), this.f333138e.f333141c.f333150m, str3);
                        ee3.j jVar6 = this.f333138e.f333141c;
                        jVar6.f333150m = str3;
                        jVar6.run();
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicBrushDownloadWorker", "reach the max redirect count(%d)", 15);
                    if (this.f333138e.f333141c.f333148h) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrushDownloadWorker", "cronet onCronetTaskCompleted max redirect already callback");
                        return;
                    }
                    this.f333138e.f333141c.f333148h = true;
                    ee3.j jVar7 = this.f333138e.f333141c;
                    if (jVar7.B) {
                        jVar7.f333146f.b(jVar7.f333151n, str, jVar7.f333150m, i19, 0L, de3.b.a(this.f333137d.f18214x153dd026));
                    } else {
                        jVar7.f333146f.b(jVar7.f333151n, str, jVar7.f333150m, i19, 0L, null);
                    }
                    ee3.j jVar8 = this.f333138e.f333141c;
                    je3.p.a(jVar8.f333149i, jVar8.f333160w, "GET", jVar8.f333150m, 0L, i18, i19, 1, (int) (java.lang.System.currentTimeMillis() - jVar8.f333159v), this.f333138e.f333141c.f333151n, str);
                    ((je3.i) i95.n0.c(je3.i.class)).Sc(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37561x26060f75.name(), 1, null, 0.01f);
                    ((je3.i) i95.n0.c(je3.i.class)).Sc(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37562x8cf770e2.name(), (int) (java.lang.System.currentTimeMillis() - this.f333138e.f333141c.f333156s), null, 0.01f);
                    return;
                }
            }
        }
        if (this.f333138e.f333141c.f333148h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrushDownloadWorker", "cronet onCronetTaskCompleted already callback");
            return;
        }
        this.f333138e.f333141c.f333148h = true;
        if (this.f333138e.f333141c.f333147g) {
            ee3.j jVar9 = this.f333138e.f333141c;
            if (jVar9.B) {
                jVar9.f333146f.b(jVar9.f333151n, str, jVar9.f333150m, i19, i18, de3.b.a(this.f333137d.f18214x153dd026));
            } else {
                jVar9.f333146f.b(jVar9.f333151n, str, jVar9.f333150m, i19, i18, null);
            }
            ee3.j jVar10 = this.f333138e.f333141c;
            long j17 = this.f333137d.f18209x953f8a7;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - this.f333138e.f333141c.f333156s;
            jVar10.getClass();
            if (j17 <= 0 || currentTimeMillis2 <= 0) {
                i17 = i18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "reportCronetSpeed len:%d, time:%d return", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis2));
            } else {
                java.lang.String name = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37559x5c4fb7c6.name();
                i17 = i18;
                double d17 = (j17 / currentTimeMillis2) * 0.9765625d;
                if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                    name = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37556x1d9ae04e.name();
                } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                    name = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37557x1d9ae06d.name();
                } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                    name = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37558x1d9ae08c.name();
                } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                    name = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37560x2274e6ce.name();
                }
                ((je3.i) i95.n0.c(je3.i.class)).Sc(name, (int) d17, null, 0.01f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "reportCronetSpeed len:%d, time:%d, speed:%f, key:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis2), java.lang.Double.valueOf(d17), name);
            }
            this.f333138e.f333140b.getClass();
        } else {
            i17 = i18;
            ee3.j jVar11 = this.f333138e.f333141c;
            jVar11.f333146f.d(jVar11.f333151n, jVar11.f333150m, "force stop", 300004);
        }
        ee3.j jVar12 = this.f333138e.f333141c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "cronet download file finished taskid:%s,CronetRequestId:%s,contentType:%s,filename: %s, url:%s ", jVar12.f333157t, jVar12.f333158u, str, jVar12.f333151n, jVar12.f333150m);
        ee3.j jVar13 = this.f333138e.f333141c;
        jVar13.f333146f.e(jVar13.f333157t);
        ee3.j jVar14 = this.f333138e.f333141c;
        je3.p.a(jVar14.f333149i, jVar14.f333160w, "GET", jVar14.f333150m, 0L, i17, i19, 1, (int) (java.lang.System.currentTimeMillis() - jVar14.f333159v), this.f333138e.f333141c.f333151n, str);
        int currentTimeMillis3 = (int) (java.lang.System.currentTimeMillis() - this.f333138e.f333141c.f333156s);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "success request time is " + currentTimeMillis3);
        ((je3.i) i95.n0.c(je3.i.class)).Sc(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37561x26060f75.name(), 1, null, 0.01f);
        ((je3.i) i95.n0.c(je3.i.class)).Sc(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37562x8cf770e2.name(), currentTimeMillis3, null, 0.01f);
    }
}
