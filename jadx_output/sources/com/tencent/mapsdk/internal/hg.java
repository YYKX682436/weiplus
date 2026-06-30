package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class hg extends com.tencent.mapsdk.internal.hh {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "tag")
    public java.lang.String f49744a;

    /* renamed from: b, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "create")
    private long f49745b;

    /* renamed from: c, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "destroy")
    private long f49746c;

    /* renamed from: d, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "mapLoad")
    private com.tencent.mapsdk.internal.hb f49747d;

    /* renamed from: e, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "oversea")
    private com.tencent.mapsdk.internal.hd f49748e;

    /* renamed from: f, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "indoorLog")
    private com.tencent.mapsdk.internal.ha f49749f;

    /* renamed from: h, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "darkMode")
    private com.tencent.mapsdk.internal.gv f49750h;

    /* renamed from: i, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "pointEvent")
    private com.tencent.mapsdk.internal.he f49751i;

    /* renamed from: j, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "aoi")
    private com.tencent.mapsdk.internal.gq f49752j;

    /* renamed from: k, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "vectorHeat")
    private com.tencent.mapsdk.internal.hk f49753k;

    /* renamed from: l, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "heatMap")
    private com.tencent.mapsdk.internal.gz f49754l;

    /* renamed from: m, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "arcLine")
    private com.tencent.mapsdk.internal.gr f49755m;

    /* renamed from: n, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "dotScatter")
    private com.tencent.mapsdk.internal.gw f49756n;

    /* renamed from: o, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "bitmapScatter")
    private com.tencent.mapsdk.internal.gt f49757o;

    /* renamed from: p, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "trail")
    private com.tencent.mapsdk.internal.hi f49758p;

    /* renamed from: q, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "model")
    private com.tencent.mapsdk.internal.gx f49759q;

    /* renamed from: r, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "groundOverlay")
    private com.tencent.mapsdk.internal.gy f49760r;

    /* renamed from: s, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "offline")
    private com.tencent.mapsdk.internal.hc f49761s;

    /* renamed from: t, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "customStyle")
    private com.tencent.mapsdk.internal.gu f49762t;

    /* renamed from: u, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "ugc")
    private com.tencent.mapsdk.internal.hj f49763u;

    /* renamed from: v, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "promote")
    private com.tencent.mapsdk.internal.hf f49764v;

    /* renamed from: w, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "auth")
    private com.tencent.mapsdk.internal.gs f49765w;

    public hg() {
    }

    private void a(java.lang.String str) {
        this.f49744a = str;
    }

    private com.tencent.mapsdk.internal.hg u() {
        this.f49746c = java.lang.System.currentTimeMillis() - this.f49745b;
        return this;
    }

    public final com.tencent.mapsdk.internal.hd b() {
        if (this.f49748e == null) {
            this.f49748e = new com.tencent.mapsdk.internal.hd(java.lang.System.currentTimeMillis() - this.f49766g);
        }
        return this.f49748e;
    }

    public final com.tencent.mapsdk.internal.hj c() {
        if (this.f49763u == null) {
            this.f49763u = new com.tencent.mapsdk.internal.hj(java.lang.System.currentTimeMillis() - this.f49766g);
        }
        return this.f49763u;
    }

    public final com.tencent.mapsdk.internal.ha d() {
        if (this.f49749f == null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = this.f49766g;
            this.f49749f = new com.tencent.mapsdk.internal.ha(currentTimeMillis - j17, j17);
        }
        return this.f49749f;
    }

    public final com.tencent.mapsdk.internal.gv e() {
        if (this.f49750h == null) {
            this.f49750h = new com.tencent.mapsdk.internal.gv(java.lang.System.currentTimeMillis() - this.f49766g);
        }
        return this.f49750h;
    }

    public final com.tencent.mapsdk.internal.he f() {
        if (this.f49751i == null) {
            this.f49751i = new com.tencent.mapsdk.internal.he(java.lang.System.currentTimeMillis() - this.f49766g);
        }
        return this.f49751i;
    }

    public final com.tencent.mapsdk.internal.gq g() {
        if (this.f49752j == null) {
            this.f49752j = new com.tencent.mapsdk.internal.gq(java.lang.System.currentTimeMillis() - this.f49766g);
        }
        return this.f49752j;
    }

    public final com.tencent.mapsdk.internal.hk h() {
        if (this.f49753k == null) {
            this.f49753k = new com.tencent.mapsdk.internal.hk(java.lang.System.currentTimeMillis() - this.f49766g);
        }
        return this.f49753k;
    }

    public final com.tencent.mapsdk.internal.gz i() {
        if (this.f49754l == null) {
            this.f49754l = new com.tencent.mapsdk.internal.gz(java.lang.System.currentTimeMillis() - this.f49766g);
        }
        return this.f49754l;
    }

    public final com.tencent.mapsdk.internal.gr j() {
        if (this.f49755m == null) {
            this.f49755m = new com.tencent.mapsdk.internal.gr(java.lang.System.currentTimeMillis() - this.f49766g);
        }
        return this.f49755m;
    }

    public final com.tencent.mapsdk.internal.gw k() {
        if (this.f49756n == null) {
            this.f49756n = new com.tencent.mapsdk.internal.gw(java.lang.System.currentTimeMillis() - this.f49766g);
        }
        return this.f49756n;
    }

    public final com.tencent.mapsdk.internal.gt l() {
        if (this.f49757o == null) {
            this.f49757o = new com.tencent.mapsdk.internal.gt(java.lang.System.currentTimeMillis() - this.f49766g);
        }
        return this.f49757o;
    }

    public final com.tencent.mapsdk.internal.hi m() {
        if (this.f49758p == null) {
            this.f49758p = new com.tencent.mapsdk.internal.hi(java.lang.System.currentTimeMillis() - this.f49766g);
        }
        return this.f49758p;
    }

    public final com.tencent.mapsdk.internal.gx n() {
        if (this.f49759q == null) {
            this.f49759q = new com.tencent.mapsdk.internal.gx(java.lang.System.currentTimeMillis() - this.f49766g);
        }
        return this.f49759q;
    }

    public final com.tencent.mapsdk.internal.gy o() {
        if (this.f49760r == null) {
            this.f49760r = new com.tencent.mapsdk.internal.gy(java.lang.System.currentTimeMillis() - this.f49766g);
        }
        return this.f49760r;
    }

    public final com.tencent.mapsdk.internal.hc p() {
        if (this.f49761s == null) {
            this.f49761s = new com.tencent.mapsdk.internal.hc(java.lang.System.currentTimeMillis() - this.f49766g);
        }
        return this.f49761s;
    }

    public final com.tencent.mapsdk.internal.gu q() {
        if (this.f49762t == null) {
            this.f49762t = new com.tencent.mapsdk.internal.gu(java.lang.System.currentTimeMillis() - this.f49766g);
        }
        return this.f49762t;
    }

    public final com.tencent.mapsdk.internal.hf r() {
        if (this.f49764v == null) {
            this.f49764v = new com.tencent.mapsdk.internal.hf(java.lang.System.currentTimeMillis() - this.f49766g);
        }
        return this.f49764v;
    }

    public final com.tencent.mapsdk.internal.gs s() {
        if (this.f49765w == null) {
            this.f49765w = new com.tencent.mapsdk.internal.gs(java.lang.System.currentTimeMillis() - this.f49766g);
        }
        return this.f49765w;
    }

    public hg(long j17) {
        super(j17);
        this.f49745b = j17;
    }

    public final com.tencent.mapsdk.internal.hb a() {
        if (this.f49747d == null) {
            this.f49747d = new com.tencent.mapsdk.internal.hb(this.f49766g);
        }
        return this.f49747d;
    }
}
