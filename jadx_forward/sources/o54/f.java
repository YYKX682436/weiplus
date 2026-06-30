package o54;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public long f424668a;

    /* renamed from: b, reason: collision with root package name */
    public long f424669b;

    /* renamed from: c, reason: collision with root package name */
    public long f424670c;

    /* renamed from: d, reason: collision with root package name */
    public long f424671d;

    /* renamed from: e, reason: collision with root package name */
    public long f424672e;

    /* renamed from: f, reason: collision with root package name */
    public long f424673f;

    /* renamed from: g, reason: collision with root package name */
    public long f424674g;

    /* renamed from: h, reason: collision with root package name */
    public long f424675h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f424676i;

    /* renamed from: k, reason: collision with root package name */
    public int f424678k;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f424677j = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f424679l = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f424680m = false;

    public o54.f a() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("build", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        long j17 = this.f424670c;
        long j18 = this.f424669b;
        this.f424679l = "onCreateTime=" + (j17 - j18) + "|viewCreate=" + (this.f424674g - j18) + "|firstFrame=" + (this.f424675h - j18);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f424679l);
        sb6.append("|snsId=");
        sb6.append(this.f424677j);
        this.f424679l = sb6.toString();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(this.f424679l);
        sb7.append("|startActCount=");
        int i18 = o54.g.f424681a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
        int i19 = o54.g.f424681a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
        sb7.append(i19);
        this.f424679l = sb7.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
        java.util.HashMap hashMap = o54.g.f424682b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
        if (hashMap.containsKey(this.f424677j)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
            java.lang.Integer num = (java.lang.Integer) hashMap.get(this.f424677j);
            if (num != null) {
                i17 = num.intValue();
                this.f424679l += "|startSnsIdCount=" + i17;
                this.f424679l += "|isMM=" + (this.f424676i ? 1 : 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("build", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
                return this;
            }
        }
        i17 = 0;
        this.f424679l += "|startSnsIdCount=" + i17;
        this.f424679l += "|isMM=" + (this.f424676i ? 1 : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("build", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        return this;
    }

    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        int i17 = (int) (this.f424669b - this.f424668a);
        int i18 = (int) (this.f424673f - this.f424672e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageStaticHelper", "reportTime, ipcConnTime=" + i18 + "|processTime=" + i17 + "|" + this.f424679l + ", clickStart=" + this.f424668a + ", source=" + this.f424678k);
        ca4.e0.a("landing_page_cost", java.lang.String.valueOf(this.f424678k), i17, i18, this.f424679l);
        boolean z17 = this.f424680m;
        int i19 = this.f424678k;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report13387Idkey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report13387Idkey, isRestart=");
        sb6.append(z17);
        sb6.append(", source=");
        sb6.append(i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageStaticHelper", sb6.toString());
        o54.g.a(1673L, 23L);
        if (z17) {
            o54.g.a(1673L, 26L);
            if (i19 == 29) {
                o54.g.a(1673L, 28L);
            }
        }
        if (i19 == 29) {
            o54.g.a(1667L, 12L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report13387Idkey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
    }
}
