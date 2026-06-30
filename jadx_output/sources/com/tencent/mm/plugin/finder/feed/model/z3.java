package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class z3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLiveReservedNoticeListLoader f108505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f108506e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(com.tencent.mm.plugin.finder.feed.model.FinderLiveReservedNoticeListLoader finderLiveReservedNoticeListLoader, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f108505d = finderLiveReservedNoticeListLoader;
        this.f108506e = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = this.f108505d.f107493e;
        if (lVar != null) {
            lVar.invoke(this.f108506e);
        }
        return jz5.f0.f302826a;
    }
}
