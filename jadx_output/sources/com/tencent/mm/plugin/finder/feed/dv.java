package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class dv extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.hv f106588d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(com.tencent.mm.plugin.finder.feed.hv hvVar) {
        super(0);
        this.f106588d = hvVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.et etVar = this.f106588d.f106955e;
        kotlin.jvm.internal.o.e(etVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTimelineLbsPresenter");
        ((com.tencent.mm.plugin.finder.feed.zu) etVar).f111297i.requestRefresh();
        return jz5.f0.f302826a;
    }
}
