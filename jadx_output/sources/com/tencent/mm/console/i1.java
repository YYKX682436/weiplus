package com.tencent.mm.console;

/* loaded from: classes11.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.io.File f64811d;

    public i1(com.tencent.mm.console.h1 h1Var, java.lang.String str, java.io.File file) {
        this.f64811d = file;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String absolutePath = new java.io.File(new java.io.File(gm0.j1.u().d()).getParentFile().getAbsolutePath(), "Download").getAbsolutePath();
        if (new java.io.File(absolutePath).exists()) {
            java.lang.String absolutePath2 = new java.io.File(this.f64811d.getAbsolutePath(), "Download").getAbsolutePath();
            com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "copy Download from = " + absolutePath + ", to = " + absolutePath2);
            com.tencent.mm.vfs.w6.b(absolutePath, absolutePath2);
        }
    }
}
