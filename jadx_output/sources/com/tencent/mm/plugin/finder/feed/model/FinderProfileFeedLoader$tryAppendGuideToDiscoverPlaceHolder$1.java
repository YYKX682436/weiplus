package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/tencent/mm/protocal/protobuf/FinderObject;", "jumpFeed", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileFeedLoader$tryAppendGuideToDiscoverPlaceHolder$1 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse<so2.j5> $response;
    final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader this$0;

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$tryAppendGuideToDiscoverPlaceHolder$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.q implements yz5.a {
        final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject $jumpFeed;
        final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse<so2.j5> $response;
        final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.tencent.mm.protocal.protobuf.FinderObject finderObject, com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader finderProfileFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.IResponse<so2.j5> iResponse) {
            super(0);
            this.$jumpFeed = finderObject;
            this.this$0 = finderProfileFeedLoader;
            this.$response = iResponse;
        }

        @Override // yz5.a
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m115invoke();
            return jz5.f0.f302826a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m115invoke() {
            so2.n1 buildGuideToDiscoverPlaceHolder;
            if (this.$jumpFeed == null) {
                com.tencent.mars.xlog.Log.i(this.this$0.getF123427d(), "tryAppendGuideToDiscoverPlaceHolder: no available hot feed, skip");
                this.this$0.finishGuideToDiscoverAppendFailed(this.$response);
                return;
            }
            if (this.this$0.getHasMore()) {
                com.tencent.mars.xlog.Log.i(this.this$0.getF123427d(), "tryAppendGuideToDiscoverPlaceHolder: hasMore became true, skip");
                return;
            }
            buildGuideToDiscoverPlaceHolder = this.this$0.buildGuideToDiscoverPlaceHolder(this.$jumpFeed);
            int size = this.this$0.getDataList().size();
            this.this$0.getDataList().add(buildGuideToDiscoverPlaceHolder);
            this.this$0.getDispatcher().d(size, 1);
            this.this$0.finishGuideToDiscoverAppend(size, 1);
            yz5.a guideToDiscoverAppendedCallback = this.this$0.getGuideToDiscoverAppendedCallback();
            if (guideToDiscoverAppendedCallback != null) {
                guideToDiscoverAppendedCallback.invoke();
            }
            com.tencent.mars.xlog.Log.i(this.this$0.getF123427d(), "tryAppendGuideToDiscoverPlaceHolder: insert at " + size + " jumpId=" + this.$jumpFeed.getId());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderProfileFeedLoader$tryAppendGuideToDiscoverPlaceHolder$1(com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader finderProfileFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.IResponse<so2.j5> iResponse) {
        super(1);
        this.this$0 = finderProfileFeedLoader;
        this.$response = iResponse;
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((com.tencent.mm.protocal.protobuf.FinderObject) obj);
        return jz5.f0.f302826a;
    }

    public final void invoke(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$tryAppendGuideToDiscoverPlaceHolder$1.AnonymousClass1(finderObject, this.this$0, this.$response));
    }
}
