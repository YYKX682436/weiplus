package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.backgroundfetch.o0 f76813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f76814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76815g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76816h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76817i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76818m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76819n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f76820o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.backgroundfetch.u1 f76821p;

    public e(java.lang.String str, com.tencent.mm.plugin.appbrand.backgroundfetch.o0 o0Var, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i17, com.tencent.mm.plugin.appbrand.backgroundfetch.u1 u1Var) {
        this.f76812d = str;
        this.f76813e = o0Var;
        this.f76814f = j17;
        this.f76815g = str2;
        this.f76816h = str3;
        this.f76817i = str4;
        this.f76818m = str5;
        this.f76819n = str6;
        this.f76820o = i17;
        this.f76821p = u1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp a17 = com.tencent.mm.plugin.appbrand.backgroundfetch.h.f76837b.a(2, this.f76812d, 5000L);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f76814f;
        com.tencent.mm.plugin.appbrand.backgroundfetch.o0 o0Var = this.f76813e;
        o0Var.f76877m = currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataWithLocation, auth info resp:" + a17 + ", cost:" + o0Var.f76877m);
        if (a17 != null) {
            java.lang.String str = a17.f84336d;
            if (!str.isEmpty()) {
                com.tencent.mm.plugin.appbrand.launching.fb a18 = com.tencent.mm.plugin.appbrand.launching.fb.f84612b.a(str);
                if (a18 != null) {
                    boolean z17 = false;
                    for (com.tencent.mm.plugin.appbrand.launching.cb cbVar : a18.f84613a) {
                        if (cbVar.f84553b.equals("jsapi_location") && cbVar.f84554c == 1) {
                            z17 = true;
                        }
                    }
                    if (z17) {
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                        i11.h e17 = i11.h.e();
                        if (e17 != null) {
                            e17.l(new com.tencent.mm.plugin.appbrand.backgroundfetch.d(this, currentTimeMillis2, e17), true, false, true);
                            return;
                        } else {
                            o0Var.f76875k = 4;
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataWithLocation fail, getLocation is null");
                        }
                    } else {
                        o0Var.f76875k = 3;
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataWithLocation fail, location no auth");
                    }
                } else {
                    o0Var.f76875k = 4;
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataWithLocation fail, parse auth info error");
                }
                com.tencent.mm.plugin.appbrand.backgroundfetch.h.e(this.f76815g, this.f76816h, this.f76817i, this.f76818m, this.f76819n, this.f76820o, null, this.f76813e, this.f76821p);
            }
        }
        o0Var.f76875k = 4;
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataWithLocation fail, get auth info error");
        com.tencent.mm.plugin.appbrand.backgroundfetch.h.e(this.f76815g, this.f76816h, this.f76817i, this.f76818m, this.f76819n, this.f76820o, null, this.f76813e, this.f76821p);
    }
}
