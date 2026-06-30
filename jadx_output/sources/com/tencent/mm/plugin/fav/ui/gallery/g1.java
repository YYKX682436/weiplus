package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f100930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.h1 f100931e;

    public g1(com.tencent.mm.plugin.fav.ui.gallery.h1 h1Var, int i17) {
        this.f100931e = h1Var;
        this.f100930d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f100930d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryAdapter", "notifyIndex :%s", java.lang.Integer.valueOf(i17));
        this.f100931e.f100969d.notifyItemChanged(i17);
    }
}
