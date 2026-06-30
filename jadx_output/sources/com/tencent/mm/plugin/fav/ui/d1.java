package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavCleanUI f100563d;

    public d1(com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI) {
        this.f100563d = favCleanUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI = this.f100563d;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = favCleanUI.f100307e;
        if (cVar == null) {
            favCleanUI.finish();
            return;
        }
        boolean z17 = cVar.B;
        if (!z17) {
            favCleanUI.finish();
            return;
        }
        if (z17) {
            cVar.B = false;
            ((java.util.TreeMap) cVar.f100485r).clear();
            if (cVar.A) {
                cVar.notifyDataSetChanged();
            }
        }
        favCleanUI.U6(favCleanUI.f100321v);
        favCleanUI.updateOptionMenuText(0, favCleanUI.getContext().getString(com.tencent.mm.R.string.cbi));
    }
}
