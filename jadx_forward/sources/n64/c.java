package n64;

/* loaded from: classes4.dex */
public final class c extends n64.f {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f416750e;

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickInfo", "com.tencent.mm.plugin.sns.ad.preload.detector.ClickPreloadItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = this.f416750e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickInfo", "com.tencent.mm.plugin.sns.ad.preload.detector.ClickPreloadItem");
        return c17702x544f64e9;
    }

    @Override // n64.f
    /* renamed from: toString */
    public java.lang.String mo149161x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.preload.detector.ClickPreloadItem");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ClickItem[");
        sb6.append(super.mo149161x9616526c());
        sb6.append(", clickType=");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = this.f416750e;
        sb6.append(c17702x544f64e9 != null ? java.lang.Integer.valueOf(c17702x544f64e9.f244104b) : null);
        sb6.append(", scene=");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e92 = this.f416750e;
        sb6.append(c17702x544f64e92 != null ? java.lang.Integer.valueOf(c17702x544f64e92.f244102a) : null);
        sb6.append(']');
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.preload.detector.ClickPreloadItem");
        return sb7;
    }
}
