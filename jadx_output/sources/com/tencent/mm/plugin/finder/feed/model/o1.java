package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f108219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(1);
        this.f108219d = baseFinderFeed;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.storage.FinderItem item = (com.tencent.mm.plugin.finder.storage.FinderItem) obj;
        kotlin.jvm.internal.o.g(item, "item");
        long id6 = item.getFeedObject().getId();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f108219d;
        boolean z17 = id6 == baseFinderFeed.getItemId();
        if (z17) {
            baseFinderFeed.getFeedObject().getFeedObject().setPermissionFlag(item.getFeedObject().getPermissionFlag());
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
