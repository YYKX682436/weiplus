package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class k6 extends com.tencent.mm.plugin.finder.feed.model.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader f108116a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader finderProfileDraftLoader) {
        super(finderProfileDraftLoader, false, 1, null);
        this.f108116a = finderProfileDraftLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.j6(this, new com.tencent.mm.plugin.finder.feed.model.internal.y0(7, response.getIncrementList(), false, null, 12, null), new ym5.s3(0), this.f108116a, lVar, response));
    }
}
