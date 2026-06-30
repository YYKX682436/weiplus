package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class tm extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTingAudioCollectionUI f110582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderAudioCollectionLoader f110583e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(com.tencent.mm.plugin.finder.feed.ui.FinderTingAudioCollectionUI finderTingAudioCollectionUI, com.tencent.mm.plugin.finder.feed.model.FinderAudioCollectionLoader finderAudioCollectionLoader) {
        super(1);
        this.f110582d = finderTingAudioCollectionUI;
        this.f110583e = finderAudioCollectionLoader;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (!it.getHasMore()) {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.sm(this.f110582d, this.f110583e));
        }
        return jz5.f0.f302826a;
    }
}
