package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class q6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f70200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m7 f70201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f70202f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var, e0.f1 f1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f70201e = m7Var;
        this.f70202f = f1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.mj_template.sns.compose.widget.q6(this.f70201e, this.f70202f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.mj_template.sns.compose.widget.q6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f70200d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var = this.f70201e;
            if (m7Var.f70103u) {
                m7Var.f70103u = false;
                e0.f1 f1Var = this.f70202f;
                int size = m7Var.b().size() - 1;
                this.f70200d = 1;
                if (e0.f1.g(f1Var, size, 0, this, 2, null) == aVar) {
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
