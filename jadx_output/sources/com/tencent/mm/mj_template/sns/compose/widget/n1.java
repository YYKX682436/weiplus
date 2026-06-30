package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.e f70107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f70108e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(androidx.paging.compose.e eVar, n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f70107d = eVar;
        this.f70108e = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.mj_template.sns.compose.widget.n1(this.f70107d, this.f70108e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.mj_template.sns.compose.widget.n1 n1Var = (com.tencent.mm.mj_template.sns.compose.widget.n1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.paging.compose.e eVar = this.f70107d;
        boolean z17 = eVar.d().f268193a instanceof g4.v0;
        n0.v2 v2Var = this.f70108e;
        if (z17) {
            v2Var.setValue(new com.tencent.mm.mj_template.sns.compose.widget.m1(eVar));
        } else {
            v2Var.setValue(null);
        }
        return jz5.f0.f302826a;
    }
}
