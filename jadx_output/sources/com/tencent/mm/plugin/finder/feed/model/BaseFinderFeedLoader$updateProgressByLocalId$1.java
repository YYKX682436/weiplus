package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class BaseFinderFeedLoader$updateProgressByLocalId$1 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ long $localId;
    final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFinderFeedLoader$updateProgressByLocalId$1(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader, long j17) {
        super(0);
        this.this$0 = baseFinderFeedLoader;
        this.$localId = j17;
    }

    @Override // yz5.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m110invoke();
        return jz5.f0.f302826a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m110invoke() {
        java.util.AbstractCollection dataList = this.this$0.getDataList();
        long j17 = this.$localId;
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = this.this$0;
        int i17 = 0;
        for (java.lang.Object obj : dataList) {
            int i18 = i17 + 1;
            if (i17 >= 0) {
                so2.j5 j5Var = (so2.j5) obj;
                if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                    if (baseFinderFeed.getFeedObject().getLocalId() == j17 && (!baseFinderFeed.getFeedObject().isMemberFeed() || (baseFinderFeedLoader.supportMemberFeedType() & baseFinderFeed.getFeedObject().getLocalMemberFeedType()) != 0)) {
                        com.tencent.mm.plugin.finder.storage.FinderItem f17 = cu2.u.f222441a.f(j17);
                        if (f17 != null) {
                            java.util.AbstractList dataList2 = baseFinderFeedLoader.getDataList();
                            com.tencent.mm.plugin.finder.model.BaseFinderFeed transformFinderObj = baseFinderFeedLoader.transformFinderObj(f17);
                            baseFinderFeedLoader.b(baseFinderFeed, transformFinderObj);
                            dataList2.set(i17, transformFinderObj);
                        }
                        com.tencent.mars.xlog.Log.i(baseFinderFeedLoader.getF123427d(), "updateProgressByLoalId " + baseFinderFeed.getFeedObject().getLocalId());
                        baseFinderFeedLoader.getDispatcher().c(i17, 1, new jz5.l(2, 1));
                    }
                }
                i17 = i18;
            } else {
                kz5.c0.p();
                throw null;
            }
        }
    }
}
