package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.o f100910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.b1 f100911e;

    public e(com.tencent.mm.plugin.fav.ui.gallery.o oVar, com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var) {
        this.f100910d = oVar;
        this.f100911e = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f100910d.e(false, this.f100911e);
    }
}
