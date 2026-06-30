package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f69852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.c1 f69853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m5 f69854f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var, com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f69853e = c1Var;
        this.f69854f = m5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.mj_template.sns.compose.widget.b1(this.f69853e, this.f69854f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.mj_template.sns.compose.widget.b1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f69852d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yz5.p pVar = this.f69853e.f69876g;
            this.f69852d = 1;
            if (pVar.invoke(this.f69854f, this) == aVar) {
                return aVar;
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
