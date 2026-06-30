package com.tencent.mm.plugin.appbrand.trade;

/* loaded from: classes7.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f89248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f89249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f89250f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f89251g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j17, com.tencent.mm.plugin.appbrand.o6 o6Var, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f89249e = j17;
        this.f89250f = o6Var;
        this.f89251g = map;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.trade.k(this.f89249e, this.f89250f, this.f89251g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.trade.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f89248d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f89248d = 1;
            if (kotlinx.coroutines.k1.b(this.f89249e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        mi1.f a17 = mi1.c.a(this.f89250f);
        if (a17 != null) {
            a17.k(this.f89251g, mi1.e.TAIL, "trade_custom_blink_handler");
        }
        return jz5.f0.f302826a;
    }
}
