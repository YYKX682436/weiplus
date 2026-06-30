package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f92934d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f92935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.p1 f92936f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.plugin.backup.roambackup.p1 p1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f92936f = p1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.backup.roambackup.y0 y0Var = new com.tencent.mm.plugin.backup.roambackup.y0(this.f92936f, continuation);
        y0Var.f92935e = obj;
        return y0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.backup.roambackup.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f92934d;
        com.tencent.mm.plugin.backup.roambackup.p1 p1Var = this.f92936f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f92935e;
            com.tencent.mars.xlog.Log.i(p1Var.f92673d, "[detachFlutterInstance] instance=" + p1Var.f92677h + ", isAttached=" + p1Var.f92676g);
            pi0.l1 l1Var = p1Var.f92677h;
            if (l1Var != null) {
                if (p1Var.f92676g) {
                    if (l1Var != null) {
                        this.f92934d = 1;
                        if (l1Var.h(y0Var, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                p1Var.f92677h = null;
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        p1Var.f92676g = false;
        p1Var.f92677h = null;
        return jz5.f0.f302826a;
    }
}
