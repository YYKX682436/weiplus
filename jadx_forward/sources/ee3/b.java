package ee3;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee3.c f333118d;

    public b(ee3.c cVar) {
        this.f333118d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        ee3.d dVar = this.f333118d.f333120b;
        int i17 = dVar.f333129o;
        if (i17 == 0) {
            dVar.f333130p = "image";
        } else if (i17 == 1) {
            dVar.f333130p = "sight";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "magicbrush_cnddownload_callback_thread run taskid:%s", dVar.f333133s);
        if (this.f333118d.f333120b.f333123f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "cdndownload onDownloaded already callback taskid:%s", this.f333118d.f333120b.f333133s);
            return;
        }
        this.f333118d.f333120b.f333123f = true;
        java.lang.String str = this.f333118d.f333120b.f333128n;
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            j17 = com.p314xaae8f345.mm.vfs.w6.k(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "getFileLength, fileLength :%d", java.lang.Long.valueOf(j17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrushCDNDownloadWorker", "getFileLength, file not exist");
            j17 = 0;
        }
        if (this.f333118d.f333120b.f333122e) {
            ee3.d dVar2 = this.f333118d.f333120b;
            dVar2.f333121d.b(dVar2.f333128n, dVar2.f333130p, dVar2.f333125h, 0, j17, null);
            ee3.d dVar3 = this.f333118d.f333120b;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f333118d.f333120b.f333132r;
            dVar3.getClass();
            if (j17 <= 0 || currentTimeMillis <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "reportCDNSpeed len:%d, time:%d return", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis));
            } else {
                java.lang.String name = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37548x160c717b.name();
                double d17 = (j17 / currentTimeMillis) * 0.9765625d;
                if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                    name = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37545xaafe45c3.name();
                } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                    name = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37546xaafe45e2.name();
                } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                    name = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37547xaafe4601.name();
                } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                    name = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37549xe494c303.name();
                }
                ((je3.i) i95.n0.c(je3.i.class)).Sc(name, 1, null, 0.01f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "reportCDNSpeed len:%d, time:%d, speed:%f, key:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis), java.lang.Double.valueOf(d17), name);
            }
        } else {
            ee3.d dVar4 = this.f333118d.f333120b;
            dVar4.f333121d.d(dVar4.f333128n, dVar4.f333125h, "force stop", 300004);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        ee3.d dVar5 = this.f333118d.f333120b;
        int i18 = (int) (currentTimeMillis2 - dVar5.f333132r);
        java.lang.String str2 = dVar5.f333133s;
        java.lang.String str3 = dVar5.f333130p;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        ee3.d dVar6 = this.f333118d.f333120b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "cdndownload file finished taskid:%s,contentType:%s,cost time:%d,filePath:%s,uri:%s", str2, str3, valueOf, dVar6.f333128n, dVar6.f333125h);
        ee3.d dVar7 = this.f333118d.f333120b;
        dVar7.f333121d.e(dVar7.f333133s);
        ee3.d dVar8 = this.f333118d.f333120b;
        java.lang.String str4 = dVar8.f333124g;
        java.lang.String str5 = dVar8.f333135u;
        java.lang.String str6 = dVar8.f333125h;
        int currentTimeMillis3 = (int) (java.lang.System.currentTimeMillis() - dVar8.f333134t);
        ee3.d dVar9 = this.f333118d.f333120b;
        je3.p.a(str4, str5, "GET", str6, 0L, j17, 0, 1, currentTimeMillis3, dVar9.f333128n, dVar9.f333130p);
        ((je3.i) i95.n0.c(je3.i.class)).Sc(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37550xb36974ea.name(), 1, null, 0.01f);
        ((je3.i) i95.n0.c(je3.i.class)).Sc(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37551x469113d7.name(), i18, null, 0.01f);
    }
}
