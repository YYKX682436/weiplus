package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavCleanUI f101125d;

    public h1(com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI) {
        this.f101125d = favCleanUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI = this.f101125d;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = favCleanUI.f100307e;
        if (cVar != null) {
            cVar.a();
        }
        favCleanUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavCleanUI", "on storage change, try refresh job");
        com.tencent.mm.sdk.platformtools.n3 n3Var = favCleanUI.f100312m;
        java.lang.Runnable runnable = favCleanUI.D;
        n3Var.removeCallbacks(runnable);
        n3Var.post(runnable);
    }
}
