package com.tencent.mm.feature.finder.live;

/* loaded from: classes.dex */
public final class g6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f66736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.t6 f66737e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.feature.finder.live.t6 t6Var) {
        super(2, continuation);
        this.f66736d = hVar;
        this.f66737e = t6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.feature.finder.live.g6(this.f66736d, continuation, this.f66737e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.feature.finder.live.g6 g6Var = (com.tencent.mm.feature.finder.live.g6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f66736d).f454381b;
        com.tencent.mars.xlog.Log.i(this.f66737e.f66944d, "getEcSource failed: " + aVar2);
        return jz5.f0.f302826a;
    }
}
