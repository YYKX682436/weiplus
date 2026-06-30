package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI f110471d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI finderAlbumTimelineUI) {
        super(0);
        this.f110471d = finderAlbumTimelineUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.z91 z91Var;
        r45.z91 z91Var2;
        r45.z91 z91Var3;
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI.L;
        com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI finderAlbumTimelineUI = this.f110471d;
        com.tencent.mm.plugin.finder.feed.ui.l n76 = finderAlbumTimelineUI.n7();
        int integer = (n76 == null || (z91Var3 = n76.f110250b) == null) ? 11 : z91Var3.getInteger(9);
        com.tencent.mm.plugin.finder.feed.ui.l n77 = finderAlbumTimelineUI.n7();
        r45.kd3 kd3Var = (n77 == null || (z91Var2 = n77.f110250b) == null) ? null : (r45.kd3) z91Var2.getCustom(21);
        com.tencent.mm.plugin.finder.feed.ui.l n78 = finderAlbumTimelineUI.n7();
        com.tencent.mm.protobuf.g byteString = (n78 == null || (z91Var = n78.f110250b) == null) ? null : z91Var.getByteString(2);
        long l76 = finderAlbumTimelineUI.l7();
        r45.vd6 vd6Var = new r45.vd6();
        vd6Var.set(2, new r45.yw6());
        vd6Var.set(1, new r45.oi());
        vd6Var.set(3, new r45.q25());
        vd6Var.set(0, java.lang.Long.valueOf(l76));
        vd6Var.set(10, 51);
        r45.ww2 o76 = finderAlbumTimelineUI.o7();
        vd6Var.set(8, o76 != null ? o76.getString(15) : null);
        androidx.appcompat.app.AppCompatActivity context = finderAlbumTimelineUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        vd6Var.set(5, xy2.c.e(context));
        vd6Var.set(6, java.lang.Long.valueOf(c01.id.c()));
        vd6Var.set(13, 11);
        com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = new com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader(integer, kd3Var, byteString, vd6Var, com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI.k7(finderAlbumTimelineUI)) { // from class: com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$feedLoader$2$1
            @Override // com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
            public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
                return new com.tencent.mm.plugin.finder.feed.model.n1(this);
            }
        };
        r45.ww2 o77 = finderAlbumTimelineUI.o7();
        finderFeedRelTimelineLoader.f107421i = o77 != null ? o77.getBoolean(10) : true;
        return finderFeedRelTimelineLoader;
    }
}
