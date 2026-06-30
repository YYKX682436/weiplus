package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavFinderFilterUI f101465d;

    public u2(com.tencent.mm.plugin.fav.ui.FavFinderFilterUI favFinderFilterUI) {
        this.f101465d = favFinderFilterUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f101465d.finish();
    }
}
