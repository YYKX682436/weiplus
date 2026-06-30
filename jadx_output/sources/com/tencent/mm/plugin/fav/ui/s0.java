package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavCleanUI f101423d;

    public s0(com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI) {
        this.f101423d = favCleanUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI = this.f101423d;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = favCleanUI.f100307e;
        if (cVar == null) {
            return;
        }
        if (!cVar.isEmpty() && android.os.SystemClock.elapsedRealtime() - favCleanUI.C < 1000) {
            android.os.SystemClock.elapsedRealtime();
            favCleanUI.f100312m.postDelayed(this, 500L);
        } else {
            favCleanUI.f100308f = false;
            favCleanUI.C = android.os.SystemClock.elapsedRealtime();
            com.tencent.mm.plugin.fav.ui.FavCleanUI.T6(favCleanUI);
        }
    }
}
