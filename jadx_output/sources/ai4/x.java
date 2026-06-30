package ai4;

/* loaded from: classes11.dex */
public final class x extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f5203d;

    public x(kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new ai4.x(continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return new ai4.x((kotlin.coroutines.Continuation) obj).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f5203d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        ai4.b0 b0Var = ai4.b0.f5123a;
        this.f5203d = 1;
        qi4.p pVar = qi4.p.f363776a;
        java.util.List x17 = ((ti4.d) ((jz5.n) qi4.p.f363780e).getValue()).x();
        int i18 = 0;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.util.Iterator it = x17.iterator();
            while (it.hasNext()) {
                if (b0Var.h((mj4.l) it.next())) {
                    i18++;
                }
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("transferFriendLikeDataToAffDB: oldCount=");
        sb6.append(((java.util.LinkedList) x17).size());
        sb6.append(", successCount=");
        sb6.append(i18);
        sb6.append(", result=");
        sb6.append(kotlin.Result.m528isSuccessimpl(m521constructorimpl));
        sb6.append(", err=");
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        sb6.append(m524exceptionOrNullimpl != null ? jz5.a.b(m524exceptionOrNullimpl) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusAffDBTransfer", sb6.toString());
        ai4.j0 j0Var = new ai4.j0(kotlin.Result.m528isSuccessimpl(m521constructorimpl), r1.size(), i18);
        return j0Var == aVar ? aVar : j0Var;
    }
}
