package vh1;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HostIPHint F;

    /* renamed from: d, reason: collision with root package name */
    public int f518551d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f518552e;

    /* renamed from: f, reason: collision with root package name */
    public final vh1.a f518553f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f518554g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f518555h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f518556i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f518557m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f518558n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f518559o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.Map f518560p;

    /* renamed from: q, reason: collision with root package name */
    public int f518561q;

    /* renamed from: r, reason: collision with root package name */
    public javax.net.ssl.SSLContext f518562r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.ArrayList f518563s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f518564t;

    /* renamed from: u, reason: collision with root package name */
    public long f518565u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f518566v;

    /* renamed from: w, reason: collision with root package name */
    public java.net.HttpURLConnection f518567w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f518568x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f518569y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f518570z;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, vh1.a aVar) {
        this.f518551d = 15;
        this.f518554g = false;
        this.f518555h = false;
        this.f518559o = "unknow";
        this.f518561q = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = true;
        this.F = null;
        this.f518552e = lVar;
        this.f518556i = str;
        this.f518557m = str2;
        this.f518558n = str3;
        this.f518553f = aVar;
        this.f518570z = str4;
        this.A = z17;
        this.B = z18;
        this.C = z19;
        this.D = z27;
        this.E = z28;
    }

    public void a() {
        this.f518554g = false;
        java.net.HttpURLConnection httpURLConnection = this.f518567w;
        if (httpURLConnection != null) {
            try {
                try {
                    httpURLConnection.getInputStream().close();
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandDownloadWorker", e17.getMessage());
                }
                this.f518567w.disconnect();
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandDownloadWorker", e18, "abortTask Exception", new java.lang.Object[0]);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f518568x)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(this.f518568x);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void b() {
        /*
            Method dump skipped, instructions count: 8645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vh1.f.b():void");
    }

    public int c() {
        return (int) (java.lang.System.currentTimeMillis() - this.f518565u);
    }

    public java.lang.String d() {
        return this.f518569y;
    }

    public final java.lang.String e(java.lang.String str, java.lang.String str2) {
        q75.e a17 = q75.e.a(str);
        if (a17 == null) {
            return q75.g.c(str2);
        }
        boolean contains = a17.f442140a.contains("application/octet-stream");
        java.lang.String str3 = a17.f442140a;
        if (!contains) {
            return str3;
        }
        java.lang.String c17 = q75.g.c(str2);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17) ? str3 : c17;
    }

    public java.lang.String f() {
        return this.f518566v;
    }

    public java.lang.String g() {
        return this.f518556i;
    }

    public final void h(long j17, long j18) {
        if (j17 <= 0 || j18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDownloadWorker", "reportSpeed len:%d, time:%d return", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        } else {
            ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(437L, com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 30 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 31 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 32 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 33 : 34, (long) ((j17 / j18) * 0.9765625d), false);
        }
    }

    public final void i(int i17) {
        ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(437L, (i17 < 100 || i17 >= 200) ? 200 == i17 ? 21 : (i17 <= 200 || i17 >= 300) ? 302 == i17 ? 23 : (i17 < 300 || i17 >= 400) ? 404 == i17 ? 25 : (i17 < 400 || i17 >= 500) ? i17 >= 500 ? 27 : 28 : 26 : 24 : 22 : 20, 1L, false);
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        if (!android.webkit.URLUtil.isHttpsUrl(this.f518556i) && !android.webkit.URLUtil.isHttpUrl(this.f518556i)) {
            this.f518553f.d(this.f518557m, this.f518556i, "downloadFile protocol must be http or https", 600005);
            return;
        }
        java.util.ArrayList arrayList = this.f518563s;
        if (arrayList != null && !uh1.j0.A(arrayList, this.f518556i, false)) {
            try {
                str = new java.net.URL(this.f518556i).getHost();
            } catch (java.net.MalformedURLException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandDownloadWorker", e17, "get redirect url host fail Exception", new java.lang.Object[0]);
                str = null;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                this.f518553f.d(this.f518557m, this.f518556i, "redirect url not in domain list", 600002);
            } else {
                this.f518553f.d(this.f518557m, this.f518556i, "redirect url not in domain list:" + str, 600002);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDownloadWorker", "not in domain url %s", this.f518556i);
            return;
        }
        if (!this.A) {
            b();
            return;
        }
        this.f518565u = java.lang.System.currentTimeMillis();
        vh1.e eVar = new vh1.e(this);
        if (!this.f518554g) {
            this.f518553f.d(this.f518557m, this.f518556i, "force stop", 600004);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f518558n)) {
                ((ch1.e) ((uh1.h1) nd.f.d(uh1.h1.class, true))).b(this.f518552e.mo48798x74292566(), this.f518569y, "GET", this.f518556i, 0L, 0L, 0, 2, c(), java.lang.System.currentTimeMillis(), this.f518557m, this.f518559o);
                return;
            } else {
                ((ch1.e) ((uh1.h1) nd.f.d(uh1.h1.class, true))).b(this.f518552e.mo48798x74292566(), this.f518569y, "GET", this.f518556i, 0L, 0L, 0, 2, c(), java.lang.System.currentTimeMillis(), this.f518558n, this.f518559o);
                return;
            }
        }
        this.f518553f.c(this.f518557m, this.f518556i);
        uh1.j0.E(1197L, 0L, 1L);
        vh1.b bVar = new vh1.b(this);
        vh1.d dVar = new vh1.d(this, bVar, eVar);
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams();
        cronetRequestParams.url = this.f518556i;
        cronetRequestParams.f18180xcb7ef180 = this.f518566v;
        cronetRequestParams.f18166x25da56ad = false;
        cronetRequestParams.f18179x84749342 = this.f518557m;
        cronetRequestParams.f18174xbfc5d0e1 = "GET";
        cronetRequestParams.f18177xa943cc02 = true;
        cronetRequestParams.f18183xeddcaf63 = this.B;
        cronetRequestParams.f18185xf72c4065 = this.C;
        cronetRequestParams.f18184x1eb6f2fa = this.D;
        java.util.Map<java.lang.String, java.lang.String> map = this.f518560p;
        cronetRequestParams.f18175xe83ff3e6 = true;
        cronetRequestParams.f18173x74c0bbcb = 0;
        cronetRequestParams.f18171xab1787f6 = this.F;
        if (map.containsKey("Accept-Encoding")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDownloadWorker", "startCronetHttpsRequest Accept-Encoding:%s", map.get("Accept-Encoding"));
        } else {
            map.put("Accept-Encoding", "gzip,compress,br,deflate");
        }
        map.put("User-Agent", this.f518570z);
        cronetRequestParams.m37968xeb7416ae(map);
        this.f518553f.a(uh1.j0.e(uh1.j0.H(map), 1));
        cronetRequestParams.f18181xe78dee5f = 2;
        ((ku5.t0) ku5.t0.f394148d).k(bVar, this.f518561q);
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetHttpsCreateResult m37961xaa3ad68c = com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37961xaa3ad68c(cronetRequestParams, dVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDownloadWorker", "startCronetHttpsRequest createRet is %d, taskId %s,CronetRequestId:%s,url:%s,filename:%s", java.lang.Integer.valueOf(m37961xaa3ad68c.f18157x23aa2e05), this.f518566v, m37961xaa3ad68c.f18158xcb7ef180, this.f518556i, this.f518557m);
        if (m37961xaa3ad68c.f18157x23aa2e05 == 0) {
            this.f518568x = m37961xaa3ad68c.f18158xcb7ef180;
            return;
        }
        if (this.f518555h) {
            return;
        }
        this.f518555h = true;
        this.f518553f.d(this.f518557m, this.f518556i, "call request error:" + m37961xaa3ad68c.f18157x23aa2e05, 600004);
    }

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HostIPHint hostIPHint, vh1.a aVar) {
        this(lVar, str, str2, str3, str4, z17, z18, z19, z27, z28, aVar);
        this.F = hostIPHint;
    }
}
