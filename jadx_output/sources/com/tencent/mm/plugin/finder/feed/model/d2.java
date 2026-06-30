package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader f107788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f107790f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader finderFloatBallDetailLoader, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, yz5.l lVar) {
        super(0);
        this.f107788d = finderFloatBallDetailLoader;
        this.f107789e = iResponse;
        this.f107790f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader finderFloatBallDetailLoader = this.f107788d;
        int size = finderFloatBallDetailLoader.getDataList().size();
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = this.f107789e;
        if (size > 0) {
            java.util.List incrementList = iResponse.getIncrementList();
            if (incrementList != null) {
                if (!(incrementList.size() == 1)) {
                    incrementList = null;
                }
                if (incrementList != null) {
                    finderFloatBallDetailLoader.getDataList().set(0, incrementList.get(0));
                    finderFloatBallDetailLoader.getDispatcher().c(0, 1, 1);
                }
            }
        } else {
            java.util.AbstractCollection dataList = finderFloatBallDetailLoader.getDataList();
            java.util.List incrementList2 = iResponse.getIncrementList();
            kotlin.jvm.internal.o.d(incrementList2);
            dataList.addAll(incrementList2);
            finderFloatBallDetailLoader.getDispatcher().a();
        }
        yz5.l lVar = this.f107790f;
        if (lVar != null) {
            lVar.invoke(iResponse);
        }
        return jz5.f0.f302826a;
    }
}
