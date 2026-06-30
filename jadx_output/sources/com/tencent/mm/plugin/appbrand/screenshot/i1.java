package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes4.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f88496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.screenshot.n1 f88497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88498f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.tencent.mm.plugin.appbrand.screenshot.n1 n1Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f88497e = n1Var;
        this.f88498f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.screenshot.i1(this.f88497e, this.f88498f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.screenshot.i1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f88496d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f88496d = 1;
            if (kotlinx.coroutines.k1.b(2000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f88497e.f88536a).remove(this.f88498f);
        return jz5.f0.f302826a;
    }
}
