package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class q5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavSelectUI f101353d;

    public q5(com.tencent.mm.plugin.fav.ui.FavSelectUI favSelectUI) {
        this.f101353d = favSelectUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.FavSelectUI favSelectUI = this.f101353d;
        favSelectUI.U.c();
        favSelectUI.n7();
    }
}
