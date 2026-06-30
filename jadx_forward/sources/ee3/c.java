package ee3;

/* loaded from: classes7.dex */
public class c implements fe0.o3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wu5.b f333119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ee3.d f333120b;

    public c(ee3.d dVar, wu5.b bVar) {
        this.f333120b = dVar;
        this.f333119a = bVar;
    }

    @Override // fe0.o3
    public void a() {
        wu5.b bVar = this.f333119a;
        if (bVar != null) {
            bVar.b();
        }
        if (this.f333120b.f333123f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "cdndownload onDownloadError already callback taskid:%s", this.f333120b.f333133s);
        } else {
            this.f333120b.f333123f = true;
            ee3.d dVar = this.f333120b;
            dVar.f333121d.d(dVar.f333128n, dVar.f333125h, "fail:cdn download fail", 303306);
            ee3.d dVar2 = this.f333120b;
            java.lang.String str = dVar2.f333124g;
            java.lang.String str2 = dVar2.f333135u;
            java.lang.String str3 = dVar2.f333125h;
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - dVar2.f333134t);
            ee3.d dVar3 = this.f333120b;
            je3.p.a(str, str2, "GET", str3, 0L, 0L, 0, 2, currentTimeMillis, dVar3.f333128n, dVar3.f333130p);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            ee3.d dVar4 = this.f333120b;
            int i17 = (int) (currentTimeMillis2 - dVar4.f333132r);
            java.lang.String str4 = dVar4.f333133s;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            ee3.d dVar5 = this.f333120b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "cdndownload file error taskid:%s,cost time:%d,filePath:%s,uri:%s", str4, valueOf, dVar5.f333128n, dVar5.f333125h);
            ((je3.i) i95.n0.c(je3.i.class)).Sc(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37543x6ddf2397.name(), 1, null, 0.01f);
            ((je3.i) i95.n0.c(je3.i.class)).Sc(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37544x5c05a404.name(), i17, null, 0.01f);
        }
        ee3.d dVar6 = this.f333120b;
        dVar6.b(dVar6.f333128n);
    }

    @Override // fe0.o3
    public void b() {
        wu5.b bVar = this.f333119a;
        if (bVar != null) {
            bVar.b();
        }
        ((ku5.t0) ku5.t0.f394148d).g(new ee3.b(this));
    }
}
