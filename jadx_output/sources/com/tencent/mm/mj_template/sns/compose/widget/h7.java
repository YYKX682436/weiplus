package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class h7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f69985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m7 f69986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m5 f69987f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var, com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f69986e = m7Var;
        this.f69987f = m5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.mj_template.sns.compose.widget.h7(this.f69986e, this.f69987f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.mj_template.sns.compose.widget.h7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f69985d;
        com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = this.f69987f;
        com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var = this.f69986e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yz5.p pVar = m7Var.f70093k;
            this.f69985d = 1;
            obj = pVar.invoke(m5Var, this);
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
            m7Var.e(m5Var.f70077a);
        }
        return jz5.f0.f302826a;
    }
}
