package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class i implements com.tencent.mm.plugin.appbrand.jsapi.file.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f47441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f47442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f47443f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f47444g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f47445h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f47446i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.f f47447m;

    public i(com.tencent.luggage.sdk.jsapi.component.service.f fVar, int i17, java.lang.String str, java.lang.String str2, boolean z17, long j17, int i18) {
        this.f47447m = fVar;
        this.f47441d = i17;
        this.f47442e = str;
        this.f47443f = str2;
        this.f47444g = z17;
        this.f47445h = j17;
        this.f47446i = i18;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.v0
    public void l(java.lang.String str, com.tencent.luggage.sdk.jsapi.component.n[] nVarArr, boolean[] zArr, java.lang.Object[] objArr, long j17, long j18) {
        com.tencent.luggage.sdk.jsapi.component.service.f fVar = this.f47447m;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadJsFileWithOptions appId[%s] contextId[%d] paths[%s] options[%s] results[%s]", fVar.f47406d.getAppId(), java.lang.Integer.valueOf(this.f47441d), this.f47442e, this.f47443f, java.util.Arrays.toString(zArr));
        if (this.f47444g) {
            long j19 = this.f47445h;
            if (j19 > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadJsFileWithOptions, appId[%s] initialScript[%s] inject done, cost[%d]ms", fVar.f47406d.getAppId(), str, java.lang.Long.valueOf(j18 - j19));
                this.f47447m.c(str, this.f47444g, nVarArr, zArr, objArr, j17, j18);
                sj1.l.h(fVar.f47406d.getComponentId() + "", this.f47446i);
            }
        }
        this.f47447m.c(str, this.f47444g, nVarArr, zArr, objArr, j17, j18);
        sj1.l.h(fVar.f47406d.getComponentId() + "", this.f47446i);
    }
}
