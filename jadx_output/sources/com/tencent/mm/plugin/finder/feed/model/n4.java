package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class n4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader f108209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f108210e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader finderMemberFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f108209d = finderMemberFeedLoader;
        this.f108210e = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = this.f108209d.f107509g;
        if (lVar != null) {
            lVar.invoke(this.f108210e);
        }
        return jz5.f0.f302826a;
    }
}
