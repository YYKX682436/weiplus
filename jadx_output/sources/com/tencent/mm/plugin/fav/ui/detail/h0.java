package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes5.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.i0 f100729e;

    public h0(com.tencent.mm.plugin.fav.ui.detail.i0 i0Var, java.lang.String str) {
        this.f100729e = i0Var;
        this.f100728d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(this.f100728d);
        zb0.d0 d0Var = (zb0.d0) i95.n0.c(zb0.d0.class);
        java.lang.String str = this.f100729e.f100737b;
        ((yb0.g) d0Var).getClass();
        x51.x0.f452109a.a(p17, str);
    }
}
