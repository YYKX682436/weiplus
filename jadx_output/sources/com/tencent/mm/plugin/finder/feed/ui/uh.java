package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class uh extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPoiTimelineUI f110610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderPoiTimelineLoader f110611e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f110612f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh(com.tencent.mm.plugin.finder.feed.ui.FinderPoiTimelineUI finderPoiTimelineUI, com.tencent.mm.plugin.finder.feed.model.FinderPoiTimelineLoader finderPoiTimelineLoader, int i17) {
        super(1);
        this.f110610d = finderPoiTimelineUI;
        this.f110611e = finderPoiTimelineLoader;
        this.f110612f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.FinderPoiTimelineUI finderPoiTimelineUI = this.f110610d;
        kotlinx.coroutines.l.d(v65.m.b(finderPoiTimelineUI), null, null, new com.tencent.mm.plugin.finder.feed.ui.th(this.f110611e, finderPoiTimelineUI, this.f110612f, null), 3, null);
        return jz5.f0.f302826a;
    }
}
