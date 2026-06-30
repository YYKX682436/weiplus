package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public class m extends com.tencent.mm.plugin.finder.gallery.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.finder.gallery.a data) {
        super(data);
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // com.tencent.mm.plugin.finder.gallery.d
    public in5.s a(int i17) {
        return new com.tencent.mm.plugin.finder.gallery.FinderGalleryDefaultConfig$buildItemCoverts$1(this);
    }

    @Override // com.tencent.mm.plugin.finder.gallery.d
    public boolean b() {
        return this instanceof com.tencent.mm.plugin.finder.gallery.v;
    }

    @Override // com.tencent.mm.plugin.finder.gallery.d
    public void c(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader feedLoader, int i17, int i18) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(feedLoader, "feedLoader");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.saveCache$default(feedLoader, intent, i17, null, 4, null);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        int g17 = g();
        com.tencent.mm.plugin.finder.gallery.a aVar = this.f111360a;
        i0Var.Dk(activity, intent, g17, aVar.f111343b, aVar.f111344c, i18);
    }

    @Override // com.tencent.mm.plugin.finder.gallery.d
    public boolean d() {
        return this instanceof com.tencent.mm.plugin.finder.gallery.y;
    }

    @Override // com.tencent.mm.plugin.finder.gallery.d
    public androidx.recyclerview.widget.p2 e(int i17) {
        return new com.tencent.mm.plugin.finder.gallery.l();
    }

    @Override // com.tencent.mm.plugin.finder.gallery.d
    public androidx.recyclerview.widget.RecyclerView.LayoutManager f(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager(2, 1);
        finderStaggeredGridLayoutManager.setItemPrefetchEnabled(true);
        return finderStaggeredGridLayoutManager;
    }

    @Override // com.tencent.mm.plugin.finder.gallery.d
    public int g() {
        return -1;
    }

    @Override // com.tencent.mm.plugin.finder.gallery.d
    public void h(com.tencent.mm.ui.MMActivity activity, int i17, int i18, android.content.Intent intent, com.tencent.mm.plugin.finder.gallery.c curActivity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(curActivity, "curActivity");
    }

    @Override // com.tencent.mm.plugin.finder.gallery.d
    public void i(com.tencent.mm.ui.MMActivity activity, int i17, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, java.util.List dataList, com.tencent.mm.protobuf.g gVar, boolean z17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(dataList, "dataList");
    }

    @Override // com.tencent.mm.plugin.finder.gallery.d
    public void j() {
    }

    public final boolean k() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127695f9).getValue()).r()).intValue() == 1;
    }
}
