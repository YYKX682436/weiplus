package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileFeedLoader$onFetchDone$2 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderProfileFeedLoader$onFetchDone$2(com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader finderProfileFeedLoader) {
        super(0);
        this.this$0 = finderProfileFeedLoader;
    }

    @Override // yz5.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m114invoke();
        return jz5.f0.f302826a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m114invoke() {
        this.this$0.setLoadingMore(true);
        this.this$0.doJumpRefresh();
    }
}
