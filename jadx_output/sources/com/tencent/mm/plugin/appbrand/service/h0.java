package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public class h0 extends com.tencent.luggage.sdk.jsapi.component.service.p1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.i f88675b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.appbrand.service.c0 c0Var, com.tencent.luggage.sdk.jsapi.component.service.n nVar, com.tencent.mm.plugin.appbrand.jsapi.i iVar) {
        super(nVar);
        this.f88675b = iVar;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.p1, com.tencent.mm.plugin.appbrand.jsapi.i
    public boolean c(java.lang.String str, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        return super.c(str, c0Var) || this.f88675b.c(str, c0Var);
    }
}
