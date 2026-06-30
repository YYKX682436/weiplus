package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileFeedLoader$createDataMerger$1$mergeRefresh$1 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ yz5.l $next;
    final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 $op;
    final /* synthetic */ ym5.s3 $reason;
    final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse<so2.j5> $response;
    final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$createDataMerger$1 this$0;
    final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderProfileFeedLoader$createDataMerger$1$mergeRefresh$1(com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$createDataMerger$1 finderProfileFeedLoader$createDataMerger$1, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader finderProfileFeedLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse<so2.j5> iResponse) {
        super(0);
        this.this$0 = finderProfileFeedLoader$createDataMerger$1;
        this.$op = y0Var;
        this.$reason = s3Var;
        this.this$1 = finderProfileFeedLoader;
        this.$next = lVar;
        this.$response = iResponse;
    }

    @Override // yz5.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m112invoke();
        return jz5.f0.f302826a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m112invoke() {
        convertOpToReason(this.$op, this.$reason);
        this.this$1.getDispatcher().g(this.$reason);
        yz5.l lVar = this.$next;
        if (lVar != null) {
            lVar.invoke(this.$response);
        }
    }
}
