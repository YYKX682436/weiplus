package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes3.dex */
public final class m3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f105701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f105702e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.p3 f105703f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(java.lang.StringBuilder sb6, kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.extension.reddot.p3 p3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f105701d = sb6;
        this.f105702e = c0Var;
        this.f105703f = p3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.extension.reddot.m3(this.f105701d, this.f105702e, this.f105703f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.extension.reddot.m3 m3Var = (com.tencent.mm.plugin.finder.extension.reddot.m3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        m3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f105701d.append("impl run on " + java.lang.Thread.currentThread() + ';');
        this.f105702e.f310112d = this.f105703f.a();
        return jz5.f0.f302826a;
    }
}
