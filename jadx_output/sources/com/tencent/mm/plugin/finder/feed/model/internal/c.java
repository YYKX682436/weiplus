package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f107960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f107962f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, yz5.l lVar) {
        super(0);
        this.f107960d = baseFeedLoader;
        this.f107961e = iResponse;
        this.f107962f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.internal.a0 merger = this.f107960d.getMerger();
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = this.f107961e;
        com.tencent.mm.plugin.finder.feed.model.internal.a0.mergeDataAndNotify$default(merger, 3, iResponse.getIncrementList(), true, null, 8, null);
        yz5.l lVar = this.f107962f;
        if (lVar != null) {
            lVar.invoke(iResponse);
        }
        return jz5.f0.f302826a;
    }
}
