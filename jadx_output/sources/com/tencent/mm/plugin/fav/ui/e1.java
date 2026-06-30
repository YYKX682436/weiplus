package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class e1 implements o72.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavCleanUI f100824a;

    public e1(com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI) {
        this.f100824a = favCleanUI;
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavCleanUI", "FavCleanFirstLoader onRefreshed()");
        int i17 = com.tencent.mm.plugin.fav.ui.FavCleanUI.E;
        com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI = this.f100824a;
        favCleanUI.getClass();
        favCleanUI.f100306d = new com.tencent.mm.plugin.fav.ui.ra(com.tencent.mm.sdk.platformtools.x2.f193071a, 16);
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = new com.tencent.mm.plugin.fav.ui.adapter.c(com.tencent.mm.sdk.platformtools.x2.f193071a, favCleanUI.f100306d, true);
        favCleanUI.f100307e = cVar;
        cVar.f100492y = favCleanUI;
        cVar.f100493z = favCleanUI;
        favCleanUI.f100309g.setAdapter((android.widget.ListAdapter) cVar);
        favCleanUI.f100309g.setOnItemClickListener(new com.tencent.mm.plugin.fav.ui.f1(favCleanUI));
        favCleanUI.f100309g.setOnTouchListener(null);
        favCleanUI.f100309g.setOnItemLongClickListener(null);
        com.tencent.mm.plugin.fav.ui.FavCleanUI.T6(favCleanUI);
    }
}
