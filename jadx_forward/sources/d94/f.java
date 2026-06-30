package d94;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public int f309071a;

    /* renamed from: b, reason: collision with root package name */
    public int f309072b;

    /* renamed from: c, reason: collision with root package name */
    public int f309073c;

    /* renamed from: d, reason: collision with root package name */
    public int f309074d;

    /* renamed from: e, reason: collision with root package name */
    public float f309075e;

    /* renamed from: f, reason: collision with root package name */
    public float f309076f;

    /* renamed from: g, reason: collision with root package name */
    public float f309077g;

    /* renamed from: h, reason: collision with root package name */
    public int f309078h;

    /* renamed from: i, reason: collision with root package name */
    public float f309079i;

    /* renamed from: imgUrl */
    @za4.k1(m178630x415c6bfa = 2)
    public java.lang.String f65816xb95cfaac;

    /* renamed from: j, reason: collision with root package name */
    public float f309080j;

    /* renamed from: k, reason: collision with root package name */
    public int f309081k;

    /* renamed from: l, reason: collision with root package name */
    public int f309082l;

    /* renamed from: m, reason: collision with root package name */
    public float f309083m;

    /* renamed from: n, reason: collision with root package name */
    public float f309084n;

    /* renamed from: o, reason: collision with root package name */
    public float f309085o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Bitmap f309086p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f309087q = false;

    public static d94.f b(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromXml", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        java.lang.String str2 = (java.lang.String) map.get(str + ".imgUrl");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".imgW"), 0);
        int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".imgH"), 0);
        if (android.text.TextUtils.isEmpty(str2) || D1 == 0 || D12 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ParticleAnimConfig", "parseFromXml err, w=" + D1 + ", h=" + D12 + ", url=" + str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
            return null;
        }
        d94.f fVar = new d94.f();
        fVar.f65816xb95cfaac = str2;
        fVar.f309072b = D1;
        fVar.f309071a = D12;
        fVar.f309073c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".animCountMax"), 0);
        fVar.f309074d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".animPerSecond"), 0);
        fVar.f309075e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str + ".scaleInitMin"));
        fVar.f309076f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str + ".scaleInitMax"));
        fVar.f309077g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str + ".scaleTarget"));
        fVar.f309078h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".scaleDuration"), 0);
        fVar.f309079i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str + ".alphaInitMin"));
        fVar.f309080j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str + ".alphaInitMax"));
        fVar.f309081k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".fadeOutDuration"), 0);
        fVar.f309082l = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".fadeOutDelay"), 0);
        fVar.f309083m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str + ".speedMin"));
        fVar.f309084n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str + ".speedMax"));
        fVar.f309085o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str + ".fillFactor"));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parseCfg=");
        sb6.append(fVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ParticleAnimConfig", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        return fVar;
    }

    public android.graphics.Bitmap a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBitmap", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        if (android.text.TextUtils.isEmpty(this.f65816xb95cfaac)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBitmap", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
            return null;
        }
        android.graphics.Bitmap bitmap = this.f309086p;
        if (bitmap != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBitmap", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
            return bitmap;
        }
        java.lang.String e17 = a84.m.e(this.f65816xb95cfaac);
        if (android.text.TextUtils.isEmpty(e17) || !com.p314xaae8f345.mm.vfs.w6.j(e17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ParticleAnimConfig", "no cache, try download, hash=" + hashCode() + ", isDownloading=" + this.f309087q + ", url=" + this.f65816xb95cfaac);
            if (!this.f309087q) {
                this.f309087q = true;
                a84.m.d(this.f65816xb95cfaac, new d94.e(this));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ParticleAnimConfig", "hit local cache, hash=" + hashCode());
            ((ku5.t0) ku5.t0.f394148d).g(new d94.c(this, e17));
        }
        android.graphics.Bitmap bitmap2 = this.f309086p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBitmap", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        return bitmap2;
    }

    /* renamed from: toString */
    public java.lang.String m123779x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        java.lang.String str = "{imgUrl=" + this.f65816xb95cfaac + ", imgH=" + this.f309071a + ", imgW=" + this.f309072b + ", animCountMax=" + this.f309073c + ", animPerSecond=" + this.f309074d + ", scaleInitMin=" + this.f309075e + ", scaleInitMax=" + this.f309076f + ", scaleTarget=" + this.f309077g + ", scaleDuration=" + this.f309078h + ", alphaInitMin=" + this.f309079i + ", alphaInitMax=" + this.f309080j + ", fadoutDuration=" + this.f309081k + ", fadoutDelay=" + this.f309082l + ", speedMin=" + this.f309083m + ", speedMax=" + this.f309084n + ", fillFactor=" + this.f309085o + '}';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        return str;
    }
}
