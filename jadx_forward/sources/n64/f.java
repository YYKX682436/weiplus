package n64;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f416752a;

    /* renamed from: b, reason: collision with root package name */
    public final int f416753b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f416754c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f416755d;

    public f(int i17, int i18, java.lang.String str, java.lang.String str2) {
        this.f416752a = i17;
        this.f416753b = i18;
        this.f416754c = str;
        this.f416755d = str2;
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLogInfo", "com.tencent.mm.plugin.sns.ad.preload.detector.PreloadItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLogInfo", "com.tencent.mm.plugin.sns.ad.preload.detector.PreloadItem");
        return this.f416755d;
    }

    public final boolean b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasFlag", "com.tencent.mm.plugin.sns.ad.preload.detector.PreloadItem");
        boolean z17 = (i17 & this.f416753b) != 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasFlag", "com.tencent.mm.plugin.sns.ad.preload.detector.PreloadItem");
        return z17;
    }

    /* renamed from: toString */
    public java.lang.String mo149161x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.preload.detector.PreloadItem");
        java.lang.String str = "resType=" + this.f416752a + ", flag=" + this.f416753b + ", extra=" + this.f416754c + ", logInfo=" + this.f416755d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.preload.detector.PreloadItem");
        return str;
    }
}
