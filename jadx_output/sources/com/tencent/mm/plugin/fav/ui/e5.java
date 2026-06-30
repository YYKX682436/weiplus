package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public class e5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavSearchUI f100830d;

    public e5(com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI) {
        this.f100830d = favSearchUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI = this.f100830d;
        com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel = favSearchUI.f100402p.f101550e;
        if (favTagPanel != null) {
            favTagPanel.q();
        }
        favSearchUI.showVKB();
    }
}
