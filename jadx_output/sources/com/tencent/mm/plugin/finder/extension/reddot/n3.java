package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes3.dex */
public final class n3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f105719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f105720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f105721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.p3 f105722g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(java.lang.StringBuilder sb6, kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.extension.reddot.p3 p3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f105720e = sb6;
        this.f105721f = c0Var;
        this.f105722g = p3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.extension.reddot.n3(this.f105720e, this.f105721f, this.f105722g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.extension.reddot.n3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f105719d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.plugin.finder.extension.reddot.m3 m3Var = new com.tencent.mm.plugin.finder.extension.reddot.m3(this.f105720e, this.f105721f, this.f105722g, null);
            this.f105719d = 1;
            if (kotlinx.coroutines.l.g(g3Var, m3Var, this) == aVar) {
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
