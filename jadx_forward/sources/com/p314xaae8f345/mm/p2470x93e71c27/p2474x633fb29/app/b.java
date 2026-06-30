package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f270335a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f270336b;

    /* renamed from: c, reason: collision with root package name */
    public final int f270337c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f270338d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f270339e;

    /* renamed from: f, reason: collision with root package name */
    public final long f270340f;

    /* renamed from: g, reason: collision with root package name */
    public final long f270341g;

    public b(java.lang.String str) {
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msg", null);
        java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.des");
        this.f270339e = str2;
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.alphainfo.clientVersion"), 0);
        this.f270335a = P;
        java.lang.String str3 = (java.lang.String) d17.get(".msg.alphainfo.url");
        this.f270336b = str3;
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.alphainfo.size"), 0);
        this.f270337c = P2;
        java.lang.String str4 = (java.lang.String) d17.get(".msg.alphainfo.md5");
        this.f270338d = str4;
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".msg.alphainfo.maxAge"), 0L);
        this.f270340f = V;
        long V2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".msg.alphainfo.expireTime"), 0L);
        this.f270341g = V2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlphaUpdateInfo", "updateInfo, content:%s, clientVersion:%d, url:%s, size:%d, md5:%s, desc:%s, maxAge:%d, expireTime:%d", str, java.lang.Integer.valueOf(P), str3, java.lang.Integer.valueOf(P2), str4, str2, java.lang.Long.valueOf(V), java.lang.Long.valueOf(V2));
    }

    public static void a() {
        gm0.j1.u().c().w(352273, null);
        gm0.j1.u().c().w(352274, null);
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.b c() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(352273, "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.b bVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.b(str);
            if (bVar.f() && !bVar.e()) {
                return bVar;
            }
            a();
        }
        return null;
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlphaUpdateInfo", "downloadInSilence.");
        if (!f() || e()) {
            return;
        }
        boolean z17 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SilentDownloadApkAtWiFi"), 0) == 0) {
            boolean z18 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && ((((java.lang.Integer) gm0.j1.u().c().l(7, 0)).intValue() & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) == 0);
            if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273971a & 1) == 0) {
                z17 = z18;
            }
        }
        if (!z17) {
            d();
            return;
        }
        int i17 = this.f270337c;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String str = this.f270338d;
        java.lang.String str2 = this.f270339e;
        java.lang.String str3 = this.f270336b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlphaUpdateInfo", "go to download, %s, %d, %s, %s", str, valueOf, str2, str3);
        mi3.f fVar = (mi3.f) i95.n0.c(mi3.f.class);
        java.lang.String replaceFirst = str2.replaceFirst("(\n)*<a.*</a>(\n)*", "\n");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2038x6f2fbec7.C17257xe7367bc8) fVar).getClass();
        int i18 = com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20973x553f78a9.f273855o;
        android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20974x100c85cc.class);
        intent.putExtra("intent_client_version", o45.wf.f424562g);
        intent.putExtra("intent_update_type", 4);
        intent.putExtra("intent_extra_desc", replaceFirst);
        intent.putExtra("intent_extra_md5", str);
        intent.putExtra("intent_extra_size", i17);
        intent.putExtra("intent_extra_download_url", new java.lang.String[]{str3});
        intent.putExtra("intent_extra_updateMode", com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273971a);
        intent.putExtra("intent_extra_marketUrl", com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273977g);
        intent.putExtra("intent_extra_run_in_foreground", true);
        intent.putExtra("intent_extra_download_mode", 2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 45L, 1L, true);
        l85.h1.e(intent, "sandbox", true, j45.l.e("sandbox"));
    }

    public void d() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.e1(c01.w9.m("weixin", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
        f9Var.m124850x7650bebc(1);
        f9Var.d1(this.f270339e);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(f9Var.j());
        f9Var.j1(0);
        f9Var.u1("weixin");
        f9Var.r1(3);
        c01.w9.x(f9Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlphaUpdateInfo", "insertUpdateTextMsg");
        a();
    }

    public boolean e() {
        boolean z17 = java.lang.System.currentTimeMillis() - ((java.lang.Long) gm0.j1.u().c().l(352274, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))).longValue() > this.f270340f || java.lang.System.currentTimeMillis() > this.f270341g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlphaUpdateInfo", "isExpired: %b", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public boolean f() {
        boolean z17 = (this.f270335a <= o45.wf.f424562g || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f270336b) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f270338d) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f270339e)) ? false : true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlphaUpdateInfo", "isValid %b", java.lang.Boolean.valueOf(z17));
        return z17;
    }
}
