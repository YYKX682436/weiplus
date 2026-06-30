package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class bg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f106383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.fg f106384e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.feed.fg fgVar) {
        super(2, continuation);
        this.f106383d = hVar;
        this.f106384e = fgVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.bg(this.f106383d, continuation, this.f106384e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.feed.bg bgVar = (com.tencent.mm.plugin.finder.feed.bg) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        bgVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f106383d).f454381b;
        com.tencent.mars.xlog.Log.i(this.f106384e.f106741d, "tryFetchAutoSwipeInfo " + aVar2.f454379a);
        return jz5.f0.f302826a;
    }
}
