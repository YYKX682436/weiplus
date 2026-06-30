package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class sb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.tb f101440d;

    public sb(com.tencent.mm.plugin.fav.ui.tb tbVar) {
        this.f101440d = tbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.tb tbVar = this.f101440d;
        tbVar.f101460d.f100279t.f();
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.p7(tbVar.f101460d);
        tbVar.f101460d.w7();
    }
}
