package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryHistoryLoader f108082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f108083e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryHistoryLoader finderLiveLotteryHistoryLoader, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f108082d = finderLiveLotteryHistoryLoader;
        this.f108083e = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = this.f108082d.f107481h;
        if (lVar != null) {
            lVar.invoke(this.f108083e);
        }
        return jz5.f0.f302826a;
    }
}
