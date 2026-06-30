package com.tencent.mm.plugin.appbrand.ad.jsapi;

/* loaded from: classes7.dex */
public class l implements com.tencent.mm.plugin.appbrand.pc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f74915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f74916b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ad.jsapi.m f74917c;

    public l(com.tencent.mm.plugin.appbrand.ad.jsapi.m mVar, java.util.HashMap hashMap, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f74917c = mVar;
        this.f74915a = hashMap;
        this.f74916b = c0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.pc
    public void a(com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, jz5.l lVar, java.lang.String str) {
        if (c0Var == null) {
            return;
        }
        java.util.HashMap hashMap = this.f74915a;
        com.tencent.mm.plugin.appbrand.ad.jsapi.m mVar = this.f74917c;
        mVar.t(hashMap);
        mVar.u(this.f74916b);
        mVar.n(c0Var);
    }
}
