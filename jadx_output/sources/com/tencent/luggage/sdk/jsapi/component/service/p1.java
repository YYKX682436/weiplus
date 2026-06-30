package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class p1 implements com.tencent.mm.plugin.appbrand.jsapi.i {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.luggage.sdk.jsapi.component.service.n f47515a;

    public p1(com.tencent.luggage.sdk.jsapi.component.service.n logic) {
        kotlin.jvm.internal.o.g(logic, "logic");
        this.f47515a = logic;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.i
    public boolean c(java.lang.String str, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        if (!this.f47515a.f47482u.f47470b || !kotlin.jvm.internal.o.b("onSubPackageReady", str)) {
            return false;
        }
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) this.f47515a.F();
        return (yVar != null ? yVar.t3() : null) != null;
    }
}
