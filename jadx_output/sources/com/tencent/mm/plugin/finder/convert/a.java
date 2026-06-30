package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FeedUpdateEvent f102846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.d f102847e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent, com.tencent.mm.plugin.finder.convert.d dVar) {
        super(0);
        this.f102846d = feedUpdateEvent;
        this.f102847e = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedChangeListener ");
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = this.f102846d;
        sb6.append(pm0.v.u(feedUpdateEvent.f54252g.f6918a));
        sb6.append(", currentItemID:");
        com.tencent.mm.plugin.finder.convert.d dVar = this.f102847e;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = dVar.f103104e;
        sb6.append((baseFinderFeed == null || (feedObject2 = baseFinderFeed.getFeedObject()) == null) ? null : pm0.v.u(feedObject2.getId()));
        sb6.append(", dataType: ");
        am.ia iaVar = feedUpdateEvent.f54252g;
        sb6.append(iaVar.f6919b);
        com.tencent.mars.xlog.Log.i("BaseFinderColumnCardLayoutHelper", sb6.toString());
        if (iaVar.f6919b == 4 && iaVar.f6918a != 0) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = dVar.f103104e;
            if ((baseFinderFeed2 == null || (feedObject = baseFinderFeed2.getFeedObject()) == null || feedObject.getId() != iaVar.f6918a) ? false : true) {
                dVar.b();
            }
        }
        return jz5.f0.f302826a;
    }
}
