package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes5.dex */
public final class b4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f102024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f102025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zy2.t f102026f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f102027g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(java.lang.StringBuilder sb6, kotlin.jvm.internal.f0 f0Var, zy2.t tVar, java.lang.Integer num, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f102024d = sb6;
        this.f102025e = f0Var;
        this.f102026f = tVar;
        this.f102027g = num;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.assist.b4(this.f102024d, this.f102025e, this.f102026f, this.f102027g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.assist.b4 b4Var = (com.tencent.mm.plugin.finder.assist.b4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f102024d.append("get max words(" + java.lang.Thread.currentThread() + "),");
        com.tencent.mm.plugin.finder.assist.h4 h4Var = com.tencent.mm.plugin.finder.assist.h4.f102221a;
        java.lang.Integer num = this.f102027g;
        zy2.t tVar = this.f102026f;
        int a17 = h4Var.a(tVar, num);
        kotlin.jvm.internal.f0 f0Var = this.f102025e;
        f0Var.f310116d = a17;
        ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) com.tencent.mm.plugin.finder.assist.h4.f102222b).getValue()).put(tVar, new java.lang.Integer(f0Var.f310116d));
        return jz5.f0.f302826a;
    }
}
