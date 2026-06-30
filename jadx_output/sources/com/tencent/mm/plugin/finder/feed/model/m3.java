package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes3.dex */
public final class m3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader f108176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f108177e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader finderLiveLotteryListLoader, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f108176d = finderLiveLotteryListLoader;
        this.f108177e = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = this.f108176d.f107488i;
        if (lVar != null) {
            lVar.invoke(this.f108177e);
        }
        return jz5.f0.f302826a;
    }
}
