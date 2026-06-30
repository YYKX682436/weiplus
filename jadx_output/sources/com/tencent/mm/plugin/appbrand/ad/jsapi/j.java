package com.tencent.mm.plugin.appbrand.ad.jsapi;

/* loaded from: classes7.dex */
public class j implements com.tencent.mm.plugin.appbrand.pc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f74911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f74912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ad.jsapi.k f74913c;

    public j(com.tencent.mm.plugin.appbrand.ad.jsapi.k kVar, java.util.HashMap hashMap, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f74913c = kVar;
        this.f74911a = hashMap;
        this.f74912b = c0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.pc
    public void a(com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, jz5.l lVar, java.lang.String str) {
        if (c0Var == null) {
            return;
        }
        java.util.HashMap hashMap = this.f74911a;
        com.tencent.mm.plugin.appbrand.ad.jsapi.k kVar = this.f74913c;
        kVar.t(hashMap);
        kVar.u(this.f74912b);
        kVar.n(c0Var);
    }
}
