package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class la extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f103905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f103906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103907f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f103906e = qeVar;
        this.f103907f = s0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.convert.la(this.f103906e, this.f103907f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.convert.la) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f103905d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f103905d = 1;
            if (kotlinx.coroutines.k1.b(200L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f103906e.t(this.f103907f);
        return jz5.f0.f302826a;
    }
}
