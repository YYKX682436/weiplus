package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class z3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f70343d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f70344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.e5 f70345f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f70346g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f70347h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(com.tencent.mm.mj_template.sns.compose.widget.e5 e5Var, android.content.Context context, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f70345f = e5Var;
        this.f70346g = context;
        this.f70347h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.mj_template.sns.compose.widget.z3 z3Var = new com.tencent.mm.mj_template.sns.compose.widget.z3(this.f70345f, this.f70346g, this.f70347h, continuation);
        z3Var.f70344e = obj;
        return z3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.mj_template.sns.compose.widget.z3) create((p1.a0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f70343d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            p1.a0 a0Var = (p1.a0) this.f70344e;
            com.tencent.mm.mj_template.sns.compose.widget.y3 y3Var = new com.tencent.mm.mj_template.sns.compose.widget.y3(this.f70345f, this.f70346g, this.f70347h);
            this.f70343d = 1;
            if (b0.d4.e(a0Var, null, null, null, y3Var, this, 7, null) == aVar) {
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
