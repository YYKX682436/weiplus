package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class p implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI f110390d;

    public p(com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI finderAlbumTimelineUI) {
        this.f110390d = finderAlbumTimelineUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI.L;
        com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI finderAlbumTimelineUI = this.f110390d;
        o3Var.Oj(finderAlbumTimelineUI.l7(), 0, 3L, "", 0L, com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI.k7(finderAlbumTimelineUI));
    }
}
