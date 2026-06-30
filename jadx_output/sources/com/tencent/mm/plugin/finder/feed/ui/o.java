package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class o implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI f110356d;

    public o(com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI finderAlbumTimelineUI) {
        this.f110356d = finderAlbumTimelineUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int i18 = com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI.L;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[clickMoreMenu] itemId=");
        sb6.append(menuItem.getItemId());
        sb6.append(" getRelatedScene=");
        com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI finderAlbumTimelineUI = this.f110356d;
        sb6.append(finderAlbumTimelineUI.m7());
        sb6.append(" streamCard=");
        sb6.append(finderAlbumTimelineUI.o7() != null);
        com.tencent.mars.xlog.Log.i("Finder.AlbumTimelineUI", sb6.toString());
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
        if (itemId == finderAlbumTimelineUI.f109204J) {
            if (finderAlbumTimelineUI.m7() == 10 || finderAlbumTimelineUI.m7() == 11) {
                r45.ww2 o76 = finderAlbumTimelineUI.o7();
                if (o76 != null) {
                    r45.qt2 k76 = com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI.k7(finderAlbumTimelineUI);
                    zy2.f fVar = new zy2.f();
                    fVar.f477382b = n7Var.g(o76);
                    n7Var.o(finderAlbumTimelineUI, fVar, k76);
                    return;
                }
                return;
            }
            if (finderAlbumTimelineUI.m7() == 14) {
                zy2.f fVar2 = new zy2.f();
                byte[] byteArrayExtra = finderAlbumTimelineUI.getIntent().getByteArrayExtra("FINDER_SHARE_ALBUM");
                if (byteArrayExtra != null) {
                    fVar2.f477382b.parseFrom(byteArrayExtra);
                }
                n7Var.o(finderAlbumTimelineUI, fVar2, com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI.k7(finderAlbumTimelineUI));
                return;
            }
            return;
        }
        if (menuItem.getItemId() == finderAlbumTimelineUI.K) {
            if (finderAlbumTimelineUI.m7() == 10 || finderAlbumTimelineUI.m7() == 11) {
                ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSnsFinderShareAlbum", "com.tencent.mm.feature.sns.SnsShareObjectService");
                m21.f fVar3 = new m21.f();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsFinderShareAlbum", "com.tencent.mm.feature.sns.SnsShareObjectService");
                r45.ww2 o77 = finderAlbumTimelineUI.o7();
                if (o77 != null) {
                    fVar3.f322986a = n7Var.g(o77);
                }
                n7Var.p(finderAlbumTimelineUI, fVar3, com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI.k7(finderAlbumTimelineUI));
                return;
            }
            if (finderAlbumTimelineUI.m7() == 14) {
                ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSnsFinderShareAlbum", "com.tencent.mm.feature.sns.SnsShareObjectService");
                m21.f fVar4 = new m21.f();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsFinderShareAlbum", "com.tencent.mm.feature.sns.SnsShareObjectService");
                byte[] byteArrayExtra2 = finderAlbumTimelineUI.getIntent().getByteArrayExtra("FINDER_SHARE_ALBUM");
                if (byteArrayExtra2 != null) {
                    fVar4.f322986a.parseFrom(byteArrayExtra2);
                }
                n7Var.p(finderAlbumTimelineUI, fVar4, com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI.k7(finderAlbumTimelineUI));
            }
        }
    }
}
