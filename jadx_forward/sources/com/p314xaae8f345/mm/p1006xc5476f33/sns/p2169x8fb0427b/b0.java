package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a0 f247463i = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a0(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f247464a;

    /* renamed from: b, reason: collision with root package name */
    public final int f247465b;

    /* renamed from: c, reason: collision with root package name */
    public final int f247466c;

    /* renamed from: clickActionInfo */
    @za4.k1(m178630x415c6bfa = 5)
    private final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f38328xf7a0a3ac;

    /* renamed from: d, reason: collision with root package name */
    public final int f247467d;

    /* renamed from: e, reason: collision with root package name */
    public final float f247468e;

    /* renamed from: f, reason: collision with root package name */
    public final float f247469f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f247470g;

    /* renamed from: h, reason: collision with root package name */
    public final int f247471h;

    public b0(int i17, int i18, int i19, int i27, float f17, float f18, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, int i28) {
        this.f247464a = i17;
        this.f247465b = i18;
        this.f247466c = i19;
        this.f247467d = i27;
        this.f247468e = f17;
        this.f247469f = f18;
        this.f247470g = z17;
        this.f38328xf7a0a3ac = c17702x544f64e9;
        this.f247471h = i28;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickActionInfo", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = this.f38328xf7a0a3ac;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickActionInfo", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
        return c17702x544f64e9;
    }

    /* renamed from: toString */
    public java.lang.String m70482x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[l=");
        sb6.append(this.f247464a);
        sb6.append(", t=");
        sb6.append(this.f247465b);
        sb6.append(", w=");
        sb6.append(this.f247466c);
        sb6.append(", h=");
        sb6.append(this.f247467d);
        sb6.append(", time=[");
        sb6.append(this.f247468e);
        sb6.append(", ");
        sb6.append(this.f247469f);
        sb6.append("], forbidClick=");
        sb6.append(this.f247470g);
        sb6.append(", clickType=");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = this.f38328xf7a0a3ac;
        sb6.append(c17702x544f64e9 != null ? java.lang.Integer.valueOf(c17702x544f64e9.f244104b) : null);
        sb6.append(", clickReportIndex=");
        sb6.append(this.f247471h);
        sb6.append(']');
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
        return sb7;
    }
}
