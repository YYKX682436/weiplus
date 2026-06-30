package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f70003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c1.d0 f70004e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(c1.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f70004e = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.mj_template.sns.compose.widget.j2 j2Var = new com.tencent.mm.mj_template.sns.compose.widget.j2(this.f70004e, continuation);
        j2Var.f70003d = obj;
        return j2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.mj_template.sns.compose.widget.j2 j2Var = (com.tencent.mm.mj_template.sns.compose.widget.j2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.v2.g(((kotlinx.coroutines.y0) this.f70003d).getF11582e()).p(new com.tencent.mm.mj_template.sns.compose.widget.i2(this.f70004e));
        return jz5.f0.f302826a;
    }
}
