package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class c0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavBaseUI f100534d;

    public c0(com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI) {
        this.f100534d = favBaseUI;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "MicroMsg.FavoriteBaseUI#dataSetChangedJob";
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f100534d.A) {
            this.f100534d.l7();
            this.f100534d.d7().c();
            this.f100534d.n7();
        }
    }
}
