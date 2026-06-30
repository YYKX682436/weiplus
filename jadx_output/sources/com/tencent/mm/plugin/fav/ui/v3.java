package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes5.dex */
public class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.w3 f101485e;

    public v3(com.tencent.mm.plugin.fav.ui.w3 w3Var, java.lang.String str) {
        this.f101485e = w3Var;
        this.f101484d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(this.f101484d);
        zb0.d0 d0Var = (zb0.d0) i95.n0.c(zb0.d0.class);
        java.lang.String str = this.f101485e.f101510b;
        ((yb0.g) d0Var).getClass();
        x51.x0.f452109a.a(p17, str);
    }
}
