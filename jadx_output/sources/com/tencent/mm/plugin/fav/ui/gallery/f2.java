package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f100921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.g2 f100922e;

    public f2(com.tencent.mm.plugin.fav.ui.gallery.g2 g2Var, int i17) {
        this.f100922e = g2Var;
        this.f100921d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.gallery.g2 g2Var = this.f100922e;
        com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var = g2Var.f100937i;
        l2Var.f100996d.f101106i = false;
        com.tencent.mm.plugin.fav.ui.gallery.z1 z1Var = l2Var.f100993a;
        if (z1Var != null) {
            ((com.tencent.mm.plugin.fav.ui.gallery.h0) z1Var).b(g2Var.f100932d, this.f100921d);
        }
    }
}
