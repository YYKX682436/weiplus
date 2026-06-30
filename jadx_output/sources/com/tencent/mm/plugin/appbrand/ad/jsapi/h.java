package com.tencent.mm.plugin.appbrand.ad.jsapi;

/* loaded from: classes7.dex */
public class h implements com.tencent.mm.plugin.appbrand.pc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f74907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f74908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ad.jsapi.i f74909c;

    public h(com.tencent.mm.plugin.appbrand.ad.jsapi.i iVar, java.util.HashMap hashMap, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f74909c = iVar;
        this.f74907a = hashMap;
        this.f74908b = c0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.pc
    public void a(com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, jz5.l lVar, java.lang.String str) {
        if (c0Var == null) {
            return;
        }
        java.util.HashMap hashMap = this.f74907a;
        com.tencent.mm.plugin.appbrand.ad.jsapi.i iVar = this.f74909c;
        iVar.t(hashMap);
        iVar.u(this.f74908b);
        iVar.n(c0Var);
    }
}
