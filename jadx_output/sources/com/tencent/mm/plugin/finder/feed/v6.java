package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class v6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f110874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f110875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f110876f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yw2.a0 f110877g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(int i17, com.tencent.mm.plugin.finder.feed.a7 a7Var, long j17, yw2.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f110874d = i17;
        this.f110875e = a7Var;
        this.f110876f = j17;
        this.f110877g = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.v6(this.f110874d, this.f110875e, this.f110876f, this.f110877g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.feed.v6 v6Var = (com.tencent.mm.plugin.finder.feed.v6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f110875e;
        int i17 = this.f110874d;
        if (i17 == -1) {
            a7Var.w0(this.f110876f);
        } else {
            a7Var.A0(i17);
        }
        yw2.a0 a0Var = this.f110877g;
        com.tencent.mm.plugin.finder.view.FinderJumpAnchorView finderJumpAnchorView = a0Var.D;
        if (finderJumpAnchorView != null) {
            finderJumpAnchorView.setLoading(false);
        }
        a0Var.t();
        return jz5.f0.f302826a;
    }
}
