package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public class q6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavTagEditUI f101354d;

    public q6(com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI) {
        this.f101354d = favTagEditUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI = this.f101354d;
        favTagEditUI.f100417g.q();
        favTagEditUI.showVKB();
    }
}
