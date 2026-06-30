package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class i7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f69996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m5 f69997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m7 f69998f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var, com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f69997e = m5Var;
        this.f69998f = m7Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.mj_template.sns.compose.widget.i7(this.f69997e, this.f69998f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.mj_template.sns.compose.widget.i7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f69996d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTemplateSelected: ");
            com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = this.f69997e;
            sb6.append(m5Var.f70077a);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", sb6.toString());
            com.tencent.mm.mj_template.sns.compose.widget.h7 h7Var = new com.tencent.mm.mj_template.sns.compose.widget.h7(this.f69998f, m5Var, null);
            this.f69996d = 1;
            if (kotlinx.coroutines.a4.c(60000L, h7Var, this) == aVar) {
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
