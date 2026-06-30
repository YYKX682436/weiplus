package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f70255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f70256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.c1 f70257f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(int i17, com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f70256e = i17;
        this.f70257f = c1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.mj_template.sns.compose.widget.u0(this.f70256e, this.f70257f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.mj_template.sns.compose.widget.u0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f70255d;
        com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var = this.f70257f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "JumpTemplateOnShownSheet " + this.f70256e);
            f0.r1 r1Var = c1Var.f69885p;
            int i18 = this.f70256e;
            this.f70255d = 1;
            if (f0.r1.g(r1Var, i18, 0, this, 2, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        c1Var.f69881l = "";
        return jz5.f0.f302826a;
    }
}
