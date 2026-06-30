package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class aw extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.ew f102904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ys f102905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.vd6 f102906f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(com.tencent.mm.plugin.finder.convert.ew ewVar, com.tencent.mm.plugin.finder.feed.ys ysVar, r45.vd6 vd6Var) {
        super(1);
        this.f102904d = ewVar;
        this.f102905e = ysVar;
        this.f102906f = vd6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList list;
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mm.plugin.finder.convert.ew ewVar = this.f102904d;
        final r45.qt2 qt2Var = ewVar.f103296h;
        if (qt2Var == null) {
            kotlin.jvm.internal.o.o("contextObj");
            throw null;
        }
        final r45.vd6 vd6Var = this.f102906f;
        com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = new com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader(qt2Var) { // from class: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$preloadContent$1$loader$1
            @Override // com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
            public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
                return new com.tencent.mm.plugin.finder.convert.zv(this, r45.vd6.this);
            }

            @Override // com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
            public boolean isObservePostEvent() {
                return false;
            }
        };
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(finderFeedRelTimelineLoader, new ym5.w(), false, 2, null);
        finderFeedRelTimelineLoader.setPreload(ewVar.f103300o);
        com.tencent.mm.plugin.finder.feed.ys ysVar = this.f102905e;
        r45.xw2 xw2Var = (r45.xw2) ysVar.f111192d.getCustom(22);
        r45.z91 z91Var = xw2Var != null ? (r45.z91) xw2Var.getCustom(2) : null;
        finderFeedRelTimelineLoader.f107426q = z91Var;
        if (vd6Var != null && z91Var != null && (list = z91Var.getList(22)) != null) {
            list.add(vd6Var);
        }
        finderFeedRelTimelineLoader.requestPreload(new com.tencent.mm.plugin.finder.convert.yv(ewVar, ysVar, task));
        return jz5.f0.f302826a;
    }
}
