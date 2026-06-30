package ee3;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable, jc3.w {
    public final boolean A;
    public final boolean B;

    /* renamed from: e, reason: collision with root package name */
    public final lc3.h0 f333145e;

    /* renamed from: f, reason: collision with root package name */
    public final ee3.e f333146f;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f333149i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f333150m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f333151n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f333152o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.Map f333153p;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f333155r;

    /* renamed from: s, reason: collision with root package name */
    public long f333156s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f333157t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f333158u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f333160w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f333161x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f333162y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f333163z;

    /* renamed from: d, reason: collision with root package name */
    public int f333144d = 15;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f333147g = false;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f333148h = false;

    /* renamed from: q, reason: collision with root package name */
    public int f333154q = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;

    /* renamed from: v, reason: collision with root package name */
    public final long f333159v = java.lang.System.currentTimeMillis();

    public j(lc3.h0 h0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z17, boolean z18, boolean z19, boolean z27, ee3.e eVar) {
        this.f333162y = false;
        this.f333163z = false;
        this.A = false;
        this.B = true;
        this.f333145e = h0Var;
        this.f333149i = str;
        this.f333150m = str2;
        this.f333151n = str3;
        this.f333152o = str4;
        this.f333146f = eVar;
        this.f333161x = str5;
        this.f333162y = z17;
        this.f333163z = z18;
        this.A = z19;
        this.B = z27;
    }

    @Override // jc3.w
    public void a() {
        this.f333147g = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f333158u)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(this.f333158u);
    }

    @Override // jc3.w
    /* renamed from: getTaskId */
    public java.lang.String mo127517x30961476() {
        return this.f333157t;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!android.webkit.URLUtil.isHttpsUrl(this.f333150m) && !android.webkit.URLUtil.isHttpUrl(this.f333150m)) {
            this.f333146f.d(this.f333151n, this.f333150m, "downloadFile protocol must be http or https", 300005);
            return;
        }
        ee3.i iVar = new ee3.i(this);
        if (!this.f333147g) {
            this.f333146f.d(this.f333151n, this.f333150m, "force stop", 300004);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f333152o)) {
                je3.p.a(this.f333149i, this.f333160w, "GET", this.f333150m, 0L, 0L, 0, 2, (int) (java.lang.System.currentTimeMillis() - this.f333159v), this.f333151n, "unknow");
                return;
            } else {
                je3.p.a(this.f333149i, this.f333160w, "GET", this.f333150m, 0L, 0L, 0, 2, (int) (java.lang.System.currentTimeMillis() - this.f333159v), this.f333152o, "unknow");
                return;
            }
        }
        this.f333156s = java.lang.System.currentTimeMillis();
        this.f333146f.c(this.f333151n, this.f333150m);
        ((je3.i) i95.n0.c(je3.i.class)).Sc(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37553x3695501.name(), 1, null, 0.01f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "downloadCronetFile prepare to start download taskid is %s, usehttp2 is %b, usequic is %b, usecache is %b, url is %s, filename is %s", this.f333157t, java.lang.Boolean.valueOf(this.f333162y), java.lang.Boolean.valueOf(this.f333163z), java.lang.Boolean.valueOf(this.A), this.f333150m, this.f333151n);
        ee3.f fVar = new ee3.f(this);
        ee3.h hVar = new ee3.h(this, fVar, iVar);
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams();
        cronetRequestParams.url = this.f333150m;
        cronetRequestParams.f18180xcb7ef180 = this.f333157t;
        cronetRequestParams.f18166x25da56ad = false;
        cronetRequestParams.f18179x84749342 = this.f333151n;
        cronetRequestParams.f18174xbfc5d0e1 = "GET";
        cronetRequestParams.f18177xa943cc02 = true;
        cronetRequestParams.f18183xeddcaf63 = this.f333162y;
        cronetRequestParams.f18185xf72c4065 = this.f333163z;
        cronetRequestParams.f18184x1eb6f2fa = this.A;
        cronetRequestParams.f18173x74c0bbcb = 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.f333153p;
        if (map.containsKey("Accept-Encoding")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "startCronetHttpsRequest Accept-Encoding:%s", map.get("Accept-Encoding"));
        } else {
            map.put("Accept-Encoding", "gzip,compress,br,deflate");
        }
        map.put("User-Agent", this.f333161x);
        cronetRequestParams.m37968xeb7416ae(map);
        cronetRequestParams.f18181xe78dee5f = 2;
        ((ku5.t0) ku5.t0.f394148d).k(fVar, this.f333154q);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "startCronetHttpsRequest taskId:%s", cronetRequestParams.f18180xcb7ef180);
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetHttpsCreateResult m37961xaa3ad68c = com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37961xaa3ad68c(cronetRequestParams, hVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "startCronetHttpsRequest createRet is %d, taskId %s,CronetRequestId:%s", java.lang.Integer.valueOf(m37961xaa3ad68c.f18157x23aa2e05), this.f333157t, m37961xaa3ad68c.f18158xcb7ef180);
        if (m37961xaa3ad68c.f18157x23aa2e05 == 0) {
            this.f333158u = m37961xaa3ad68c.f18158xcb7ef180;
            return;
        }
        if (this.f333148h) {
            return;
        }
        this.f333148h = true;
        this.f333146f.d(this.f333151n, this.f333150m, "call request error:" + m37961xaa3ad68c.f18157x23aa2e05, 300004);
    }
}
