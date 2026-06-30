package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class fb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f100857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavoriteIndexUI f100858e;

    public fb(com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI, java.util.ArrayList arrayList) {
        this.f100858e = favoriteIndexUI;
        this.f100857d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f100858e.f100267e = true;
        com.tencent.mm.plugin.fav.ui.d4.b(this.f100857d);
    }
}
