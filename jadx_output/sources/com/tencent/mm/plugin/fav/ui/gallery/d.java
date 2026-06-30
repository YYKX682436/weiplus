package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.o f100904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.b1 f100905e;

    public d(com.tencent.mm.plugin.fav.ui.gallery.o oVar, com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var) {
        this.f100904d = oVar;
        this.f100905e = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f100904d.e(false, this.f100905e);
    }
}
