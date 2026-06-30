package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class bu extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.fu f106415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu(com.tencent.mm.plugin.finder.feed.fu fuVar) {
        super(0);
        this.f106415d = fuVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.et etVar = this.f106415d.f106777e;
        kotlin.jvm.internal.o.e(etVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTimelineLbsMixPresenter");
        ((com.tencent.mm.plugin.finder.feed.yt) etVar).g().requestRefresh();
        return jz5.f0.f302826a;
    }
}
