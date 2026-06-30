package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class v2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f108410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader f108411e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader finderLbsLoader) {
        super(0);
        this.f108410d = iResponse;
        this.f108411e = finderLbsLoader;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = this.f108410d;
        if (!iResponse.getHasMore() && (lVar = this.f108411e.f107467d) != null) {
            lVar.invoke(iResponse);
        }
        return jz5.f0.f302826a;
    }
}
