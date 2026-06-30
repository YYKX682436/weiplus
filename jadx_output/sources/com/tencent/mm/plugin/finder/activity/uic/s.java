package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f101945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC f101946e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC finderActivityParticipateUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f101946e = finderActivityParticipateUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.activity.uic.s(this.f101946e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.activity.uic.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object x17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f101945d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g92.b bVar = g92.b.f269769e;
            this.f101945d = 1;
            x17 = bVar.x1(13, this);
            if (x17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            x17 = ((kotlin.Result) obj).getValue();
        }
        boolean m528isSuccessimpl = kotlin.Result.m528isSuccessimpl(x17);
        com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC finderActivityParticipateUIC = this.f101946e;
        if (m528isSuccessimpl) {
            r45.lk2 lk2Var = (r45.lk2) x17;
            finderActivityParticipateUIC.getClass();
            sr2.l5 l5Var = finderActivityParticipateUIC.f101822s;
            if (l5Var != null) {
                l5Var.O6(0, 0, null, lk2Var);
            }
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(x17);
        if (m524exceptionOrNullimpl != null) {
            rm0.j jVar = m524exceptionOrNullimpl instanceof rm0.j ? (rm0.j) m524exceptionOrNullimpl : null;
            if (jVar != null) {
                finderActivityParticipateUIC.getClass();
                sr2.l5 l5Var2 = finderActivityParticipateUIC.f101822s;
                if (l5Var2 != null) {
                    l5Var2.onSceneEnd(jVar.f397424e, jVar.f397425f, null, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
