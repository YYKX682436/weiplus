package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f100970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.i2 f100971e;

    public h2(com.tencent.mm.plugin.fav.ui.gallery.i2 i2Var, int i17) {
        this.f100971e = i2Var;
        this.f100970d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.gallery.i2 i2Var = this.f100971e;
        com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var = i2Var.f100980f;
        l2Var.f100996d.f101106i = false;
        com.tencent.mm.plugin.fav.ui.gallery.z1 z1Var = l2Var.f100993a;
        if (z1Var != null) {
            ((com.tencent.mm.plugin.fav.ui.gallery.h0) z1Var).b(i2Var.f100978d, this.f100970d);
        }
    }
}
