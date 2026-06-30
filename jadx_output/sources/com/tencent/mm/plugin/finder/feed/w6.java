package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class w6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f110953d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f110954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f110955f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f110956g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yw2.a0 f110957h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(com.tencent.mm.plugin.finder.feed.a7 a7Var, long j17, yw2.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f110955f = a7Var;
        this.f110956g = j17;
        this.f110957h = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.feed.w6 w6Var = new com.tencent.mm.plugin.finder.feed.w6(this.f110955f, this.f110956g, this.f110957h, continuation);
        w6Var.f110954e = obj;
        return w6Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.w6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f110953d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f110954e;
            int e17 = this.f110955f.f106210g.e(this.f110956g);
            if (!kotlinx.coroutines.z0.h(y0Var)) {
                com.tencent.mars.xlog.Log.w("Finder.DrawerPresenter", "onJumpToLastViewed scope canceled");
                return f0Var;
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.plugin.finder.feed.v6 v6Var = new com.tencent.mm.plugin.finder.feed.v6(e17, this.f110955f, this.f110956g, this.f110957h, null);
            this.f110953d = 1;
            if (kotlinx.coroutines.l.g(g3Var, v6Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
