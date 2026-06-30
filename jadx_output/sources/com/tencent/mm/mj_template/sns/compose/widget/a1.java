package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f69837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.c1 f69838e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.e5 f69839f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var, com.tencent.mm.mj_template.sns.compose.widget.e5 e5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f69838e = c1Var;
        this.f69839f = e5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.mj_template.sns.compose.widget.a1(this.f69838e, this.f69839f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.mj_template.sns.compose.widget.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f69837d;
        com.tencent.mm.mj_template.sns.compose.widget.e5 e5Var = this.f69839f;
        com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var = this.f69838e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yz5.p pVar = c1Var.f69876g;
            this.f69837d = 1;
            obj = pVar.invoke(e5Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            c1Var.f69884o = e5Var;
            ((n0.q4) c1Var.f69882m).setValue(java.lang.Boolean.TRUE);
        } else {
            com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = c1Var.f69884o;
            com.tencent.mm.mj_template.sns.compose.widget.r rVar = m5Var != null ? m5Var.f70078b : null;
            if (rVar != null) {
                rVar.b(true);
            }
            e5Var.f70078b.b(false);
            ((n0.q4) c1Var.f69882m).setValue(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f302826a;
    }
}
