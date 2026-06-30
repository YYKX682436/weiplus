package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class y4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f79799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79801f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f79802g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(java.lang.String str, com.tencent.mm.plugin.appbrand.y yVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f79800e = str;
        this.f79801f = yVar;
        this.f79802g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.jsapi.auth.y4(this.f79800e, this.f79801f, this.f79802g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.jsapi.auth.y4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f79799d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String str = this.f79800e;
                java.lang.String appId = this.f79801f.getAppId();
                kotlin.jvm.internal.o.f(appId, "getAppId(...)");
                qt1.j jVar = new qt1.j(str, appId, this.f79802g);
                this.f79799d = 1;
                if (jVar.e(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (qt1.f unused) {
        }
        return jz5.f0.f302826a;
    }
}
