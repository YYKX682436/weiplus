package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class k implements com.tencent.mm.plugin.appbrand.utils.c3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f47460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f47461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PInt f47462c;

    public k(com.tencent.luggage.sdk.jsapi.component.service.f fVar, com.tencent.mm.pointers.PBool pBool, ik1.b0 b0Var, com.tencent.mm.pointers.PInt pInt) {
        this.f47460a = pBool;
        this.f47461b = b0Var;
        this.f47462c = pInt;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c3
    public void a(cl.k1 k1Var) {
        this.f47461b.f291824a = k1Var;
        this.f47462c.value = k1Var.sourceLength;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void b(java.lang.String str) {
        this.f47460a.value = false;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void onSuccess(java.lang.String str) {
        this.f47460a.value = true;
    }
}
