package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes3.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f69974d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f69974d = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.mj_template.sns.compose.widget.h(this.f69974d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.mj_template.sns.compose.widget.h hVar = (com.tencent.mm.mj_template.sns.compose.widget.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        n0.v2 v2Var = this.f69974d;
        ((java.lang.Number) v2Var.getValue()).intValue();
        if (((java.lang.Number) v2Var.getValue()).intValue() == 0) {
            v2Var.setValue(new java.lang.Integer(Integer.MAX_VALUE));
        }
        return jz5.f0.f302826a;
    }
}
