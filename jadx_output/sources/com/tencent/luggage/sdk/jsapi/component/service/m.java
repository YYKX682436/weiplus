package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class m implements com.tencent.mm.plugin.appbrand.utils.c3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f47476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f47477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.r f47478c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f47479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PString f47480e;

    public m(com.tencent.luggage.sdk.jsapi.component.service.f fVar, ik1.b0 b0Var, com.tencent.mm.pointers.PBool pBool, com.tencent.mm.plugin.appbrand.jsruntime.r rVar, java.lang.String str, com.tencent.mm.pointers.PString pString) {
        this.f47476a = b0Var;
        this.f47477b = pBool;
        this.f47478c = rVar;
        this.f47479d = str;
        this.f47480e = pString;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c3
    public void a(cl.k1 k1Var) {
        this.f47476a.f291824a = k1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "injectSdkScript-injectWithFd, contextId:%d, path:%s, onFailure:%s", java.lang.Integer.valueOf(this.f47478c.o()), this.f47479d, str);
        this.f47480e.value = str;
        this.f47477b.value = false;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void onSuccess(java.lang.String str) {
        this.f47477b.value = true;
    }
}
