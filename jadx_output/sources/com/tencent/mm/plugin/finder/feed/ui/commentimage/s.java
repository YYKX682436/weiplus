package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f109891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI f109892e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f109892e = finderCommentImageFlowUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ui.commentimage.s(this.f109892e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.plugin.finder.feed.ui.commentimage.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f109891d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.U;
            com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI = this.f109892e;
            kotlinx.coroutines.flow.n2 n2Var = finderCommentImageFlowUI.d7().f109836w;
            com.tencent.mm.plugin.finder.feed.ui.commentimage.r rVar = new com.tencent.mm.plugin.finder.feed.ui.commentimage.r(finderCommentImageFlowUI);
            this.f109891d = 1;
            if (((kotlinx.coroutines.flow.k2) n2Var).a(rVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
