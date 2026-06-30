package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class wf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f110970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ag f110971e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110972f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f110973g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.feed.ag agVar, java.lang.String str, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f110970d = hVar;
        this.f110971e = agVar;
        this.f110972f = str;
        this.f110973g = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.wf(this.f110970d, continuation, this.f110971e, this.f110972f, this.f110973g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.feed.wf wfVar = (com.tencent.mm.plugin.finder.feed.wf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        wfVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f110970d).f454381b;
        com.tencent.mars.xlog.Log.i(this.f110971e.f106286d, "getSongPlayDetailInfo fail songUniqueId: " + this.f110972f + " error: " + aVar2);
        this.f110973g.f310123d = null;
        return jz5.f0.f302826a;
    }
}
