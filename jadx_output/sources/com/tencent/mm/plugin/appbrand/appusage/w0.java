package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f76604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f76605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f76606f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f76607g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f76608h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f76609i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f76610m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f76611n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.b1 f76612o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ft.i f76613p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.c1 f76614q;

    public w0(com.tencent.mm.plugin.appbrand.appusage.c1 c1Var, int i17, int i18, int i19, long j17, boolean z17, android.os.Bundle bundle, int i27, long j18, com.tencent.mm.plugin.appbrand.appusage.b1 b1Var, ft.i iVar) {
        this.f76614q = c1Var;
        this.f76604d = i17;
        this.f76605e = i18;
        this.f76606f = i19;
        this.f76607g = j17;
        this.f76608h = z17;
        this.f76609i = bundle;
        this.f76610m = i27;
        this.f76611n = j18;
        this.f76612o = b1Var;
        this.f76613p = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHistoryLogic[collection]", "do fetchNextPageFromServerImpl");
        this.f76614q.y0(this.f76604d, this.f76605e, this.f76606f, this.f76607g, this.f76608h, this.f76609i, this.f76610m, this.f76611n, this.f76612o, this.f76613p);
    }
}
