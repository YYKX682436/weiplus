package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f69143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f69144e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.appbrand.service.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f69144e = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.minigame.t(this.f69144e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.minigame.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f69143d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = hx5.c.f285706a;
            ix5.h hVar = ix5.h.f295631b;
            if (hVar.e()) {
                java.lang.String appId = this.f69144e.getAppId();
                kotlin.jvm.internal.o.f(appId, "getAppId(...)");
                this.f69143d = 1;
                if (hVar.h(appId, null, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
