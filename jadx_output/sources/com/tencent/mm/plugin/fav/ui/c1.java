package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class c1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavCleanUI f100535d;

    public c1(com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI) {
        this.f100535d = favCleanUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI = this.f100535d;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = favCleanUI.f100307e;
        if (cVar != null) {
            if (!cVar.B || cVar.l() <= 0) {
                com.tencent.mm.plugin.fav.ui.adapter.c cVar2 = favCleanUI.f100307e;
                if (true != cVar2.B) {
                    cVar2.B = true;
                    ((java.util.TreeMap) cVar2.f100485r).clear();
                    if (cVar2.A) {
                        cVar2.notifyDataSetChanged();
                    }
                }
                favCleanUI.W6();
                favCleanUI.f100318s++;
            } else {
                db5.e1.A(favCleanUI.getContext(), favCleanUI.getString(com.tencent.mm.R.string.c9j), "", favCleanUI.getString(com.tencent.mm.R.string.c9d), favCleanUI.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.fav.ui.v0(favCleanUI), null);
            }
        }
        return true;
    }
}
