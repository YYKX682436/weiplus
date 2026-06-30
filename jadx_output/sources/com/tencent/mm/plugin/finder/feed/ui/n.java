package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class n implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI f110319d;

    public n(com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI finderAlbumTimelineUI) {
        this.f110319d = finderAlbumTimelineUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI finderAlbumTimelineUI = this.f110319d;
            g4Var.j(finderAlbumTimelineUI.f109204J, finderAlbumTimelineUI.getContext().getString(com.tencent.mm.R.string.f490559yh), com.tencent.mm.R.raw.finder_icons_filled_share, finderAlbumTimelineUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478502m), false);
            g4Var.j(finderAlbumTimelineUI.K, finderAlbumTimelineUI.getContext().getString(com.tencent.mm.R.string.f492075f54), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, false);
        }
    }
}
