package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f263040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f263041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f263042f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f263043g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263044h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263045i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263046m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f263047n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0 f263048o;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0 q0Var, int i17, java.util.Map map, int i18, int i19, java.lang.String str, java.lang.String str2, java.lang.String str3, int i27) {
        this.f263048o = q0Var;
        this.f263040d = i17;
        this.f263041e = map;
        this.f263042f = i18;
        this.f263043g = i19;
        this.f263044h = str;
        this.f263045i = str2;
        this.f263046m = str3;
        this.f263047n = i27;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "getTeachSearchData realTime, webviewID = %d", java.lang.Integer.valueOf(this.f263040d));
        gm0.j1.d().a(1048, this.f263048o);
        java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        long optLong = su4.o2.d("discoverSearchEntry").optLong("guideParam");
        this.f263048o.f263128h = new su4.z1(this.f263042f, this.f263043g, (!this.f263041e.containsKey("h5Version") || this.f263041e.get("h5Version") == null) ? com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0) : ((java.lang.Integer) this.f263041e.get("h5Version")).intValue(), this.f263040d, f17, optLong, this.f263044h, this.f263045i, this.f263046m, null, this.f263047n);
        gm0.j1.d().g(this.f263048o.f263128h);
    }
}
