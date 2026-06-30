package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes5.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.h2 f100726e;

    public g2(com.tencent.mm.plugin.fav.ui.detail.h2 h2Var, java.lang.String str) {
        this.f100726e = h2Var;
        this.f100725d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(this.f100725d);
        zb0.d0 d0Var = (zb0.d0) i95.n0.c(zb0.d0.class);
        java.lang.String str = this.f100726e.f100734c.E;
        ((yb0.g) d0Var).getClass();
        x51.x0.f452109a.a(p17, str);
    }
}
