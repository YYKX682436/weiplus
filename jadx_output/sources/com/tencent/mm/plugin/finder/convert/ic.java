package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ic extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(0);
        this.f103658d = baseFinderFeed;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f103658d;
        baseFinderFeed.getFeedObject().setLiveNoticeHide();
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "#refreshFinderLiveNoticeView id=" + baseFinderFeed.getFeedObject().getFeedObject().getId() + " setLiveNoticeHide");
        return jz5.f0.f302826a;
    }
}
