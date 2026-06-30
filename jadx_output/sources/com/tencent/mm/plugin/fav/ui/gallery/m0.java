package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.n0 f101004d;

    public m0(com.tencent.mm.plugin.fav.ui.gallery.n0 n0Var) {
        this.f101004d = n0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.gallery.n0 n0Var = this.f101004d;
        n0Var.f101017e.f100944d.startAnimation(android.view.animation.AnimationUtils.loadAnimation(n0Var.f101017e.f100952l, com.tencent.mm.R.anim.f477784bd));
        n0Var.f101017e.f100944d.setVisibility(8);
    }
}
