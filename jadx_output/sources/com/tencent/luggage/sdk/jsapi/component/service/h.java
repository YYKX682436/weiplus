package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class h implements com.tencent.mm.plugin.appbrand.utils.c3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.luggage.sdk.jsapi.component.n[] f47427a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object[] f47428b = new java.lang.Object[1];

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f47429c = new boolean[1];

    /* renamed from: d, reason: collision with root package name */
    public int f47430d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f47431e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f47432f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f47433g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f47434h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f47435i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.f f47436j;

    public h(com.tencent.luggage.sdk.jsapi.component.service.f fVar, java.lang.String str, boolean z17, long j17, long j18, int i17) {
        this.f47436j = fVar;
        this.f47431e = str;
        this.f47432f = z17;
        this.f47433g = j17;
        this.f47434h = j18;
        this.f47435i = i17;
        this.f47427a = r3;
        com.tencent.luggage.sdk.jsapi.component.n nVar = new com.tencent.luggage.sdk.jsapi.component.n();
        com.tencent.luggage.sdk.jsapi.component.n[] nVarArr = {nVar};
        nVar.f47352i = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c3
    public void a(cl.k1 k1Var) {
        this.f47428b[0] = k1Var;
        this.f47427a[0].f47354k = k1Var.sourceLength;
        c();
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void b(java.lang.String str) {
        this.f47429c[0] = false;
        c();
    }

    public final void c() {
        int i17 = this.f47430d - 1;
        this.f47430d = i17;
        if (i17 == 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            boolean z17 = this.f47432f;
            com.tencent.luggage.sdk.jsapi.component.service.f fVar = this.f47436j;
            if (z17) {
                long j17 = this.f47433g;
                if (j17 > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadJsFileWithOptions, appId[%s] initialScript[%s] inject done, cost[%d]ms", fVar.f47406d.getAppId(), this.f47431e, java.lang.Long.valueOf(currentTimeMillis - j17));
                }
            }
            this.f47436j.c(this.f47431e, this.f47432f, this.f47427a, this.f47429c, this.f47428b, this.f47434h, currentTimeMillis);
            sj1.l.h(fVar.f47406d.getComponentId() + "", this.f47435i);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void onSuccess(java.lang.String str) {
        this.f47429c[0] = true;
        c();
    }
}
