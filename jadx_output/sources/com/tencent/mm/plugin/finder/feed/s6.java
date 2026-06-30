package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class s6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f108975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f108976e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(com.tencent.mm.plugin.finder.feed.a7 a7Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f108975d = a7Var;
        this.f108976e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.s6(this.f108975d, this.f108976e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.s6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return new java.lang.Integer(this.f108975d.f106210g.e(this.f108976e));
    }
}
