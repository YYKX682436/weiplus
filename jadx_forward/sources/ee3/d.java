package ee3;

/* loaded from: classes7.dex */
public class d extends android.os.AsyncTask implements jc3.w {

    /* renamed from: d, reason: collision with root package name */
    public final ee3.e f333121d;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f333124g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f333125h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f333126i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f333127m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f333128n;

    /* renamed from: o, reason: collision with root package name */
    public final int f333129o;

    /* renamed from: r, reason: collision with root package name */
    public long f333132r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f333133s;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f333135u;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f333122e = false;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f333123f = false;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f333130p = "unknow";

    /* renamed from: q, reason: collision with root package name */
    public int f333131q = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;

    /* renamed from: t, reason: collision with root package name */
    public final long f333134t = java.lang.System.currentTimeMillis();

    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, ee3.e eVar) {
        this.f333124g = str;
        this.f333125h = str2;
        this.f333127m = str4;
        this.f333126i = str3;
        this.f333128n = str4 + str3;
        this.f333129o = i17;
        this.f333121d = eVar;
    }

    @Override // jc3.w
    public void a() {
        this.f333122e = false;
        cancel(true);
    }

    public final boolean b(java.lang.String str) {
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "delErrFile, file not exists");
            return true;
        }
        if (com.p314xaae8f345.mm.vfs.w6.h(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "delErrFile, succ");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "delErrFile, failed");
        return false;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        if (!android.webkit.URLUtil.isHttpsUrl(this.f333125h) && !android.webkit.URLUtil.isHttpUrl(this.f333125h)) {
            this.f333121d.d(this.f333128n, this.f333125h, "downloadFile protocol must be http or https", 300005);
        } else if (this.f333122e) {
            this.f333132r = java.lang.System.currentTimeMillis();
            this.f333121d.c(this.f333128n, this.f333125h);
            ((je3.i) i95.n0.c(je3.i.class)).Sc(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37542x4de193b6.name(), 1, null, 0.01f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "downloadCronetFile prepare to start download taskid is %s, filePath is %s, uri is %s", this.f333133s, this.f333128n, this.f333125h);
            ee3.a aVar = new ee3.a(this);
            ee3.c cVar = new ee3.c(this, aVar);
            ((ku5.t0) ku5.t0.f394148d).k(aVar, this.f333131q);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "startCDNDownload taskId:%s", this.f333133s);
            try {
                fe0.j3 j3Var = (fe0.j3) i95.n0.c(fe0.j3.class);
                java.lang.String str = this.f333127m;
                java.lang.String str2 = this.f333126i;
                java.lang.String str3 = this.f333125h;
                int i17 = this.f333129o;
                ((ee0.a) j3Var).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadLandingPagesCDNFile", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadService");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69832x928730f4(str, str2, str3, i17, cVar);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadLandingPagesCDNFile", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadService");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MagicBrushCDNDownloadWorker", e17, "doInBackground Exception uri:%s", this.f333125h);
                b(this.f333128n);
                if (!this.f333123f) {
                    this.f333123f = true;
                    this.f333121d.d(this.f333128n, this.f333125h, "call cdndownload error", 300004);
                }
            }
        } else {
            this.f333121d.d(this.f333128n, this.f333125h, "force stop", 300004);
            je3.p.a(this.f333124g, this.f333135u, "GET", this.f333125h, 0L, 0L, 0, 2, (int) (java.lang.System.currentTimeMillis() - this.f333134t), this.f333128n, this.f333130p);
        }
        return null;
    }

    @Override // jc3.w
    /* renamed from: getTaskId */
    public java.lang.String mo127517x30961476() {
        return this.f333133s;
    }
}
