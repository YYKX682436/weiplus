package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class xf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f111060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ag f111061e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f111062f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f111063g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f111064h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.feed.ag agVar, java.lang.String str, java.lang.String str2, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f111060d = hVar;
        this.f111061e = agVar;
        this.f111062f = str;
        this.f111063g = str2;
        this.f111064h = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.xf(this.f111060d, continuation, this.f111061e, this.f111062f, this.f111063g, this.f111064h);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.feed.xf xfVar = (com.tencent.mm.plugin.finder.feed.xf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        xfVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.ix1 ix1Var = (r45.ix1) ((xg2.i) this.f111060d).f454393b;
        com.tencent.mars.xlog.Log.i(this.f111061e.f106286d, "getSongPlayDetailInfo success sdkUserId: " + this.f111062f + " songUniqueId: " + this.f111063g);
        this.f111064h.f310123d = ix1Var.f377386d;
        return jz5.f0.f302826a;
    }
}
