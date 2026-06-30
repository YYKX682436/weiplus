package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class w2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f110682d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f110683e;

    public w2(kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.finder.feed.ui.w2 w2Var = new com.tencent.mm.plugin.finder.feed.ui.w2((kotlin.coroutines.Continuation) obj3);
        w2Var.f110682d = (dv2.n) obj;
        w2Var.f110683e = (dv2.i) obj2;
        return w2Var.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return new jz5.l((dv2.n) this.f110682d, (dv2.i) this.f110683e);
    }
}
