package com.tencent.mm.plugin.appbrand.ad.jsapi;

/* loaded from: classes7.dex */
public class f implements com.tencent.mm.plugin.appbrand.pc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f74902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f74903b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ad.jsapi.g f74904c;

    public f(com.tencent.mm.plugin.appbrand.ad.jsapi.g gVar, java.util.HashMap hashMap, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f74904c = gVar;
        this.f74902a = hashMap;
        this.f74903b = c0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.pc
    public void a(com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, jz5.l lVar, java.lang.String str) {
        if (c0Var == null) {
            return;
        }
        java.util.HashMap hashMap = this.f74902a;
        com.tencent.mm.plugin.appbrand.ad.jsapi.g gVar = this.f74904c;
        gVar.t(hashMap);
        gVar.u(this.f74903b);
        gVar.n(c0Var);
    }
}
