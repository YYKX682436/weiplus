package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.o f100900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.b1 f100901e;

    public c(com.tencent.mm.plugin.fav.ui.gallery.o oVar, com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var) {
        this.f100900d = oVar;
        this.f100901e = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f100900d.f(this.f100901e);
    }
}
