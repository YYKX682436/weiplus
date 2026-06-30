package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class l implements com.tencent.mm.plugin.appbrand.utils.c3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f47467a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f47468b;

    public l(com.tencent.luggage.sdk.jsapi.component.service.f fVar, ik1.b0 b0Var, com.tencent.mm.pointers.PBool pBool) {
        this.f47467a = b0Var;
        this.f47468b = pBool;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c3
    public void a(cl.k1 k1Var) {
        this.f47467a.f291824a = k1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void b(java.lang.String str) {
        this.f47468b.value = false;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void onSuccess(java.lang.String str) {
        this.f47468b.value = true;
    }
}
