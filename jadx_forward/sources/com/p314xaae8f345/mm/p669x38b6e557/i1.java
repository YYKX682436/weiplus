package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes11.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.io.File f146344d;

    public i1(com.p314xaae8f345.mm.p669x38b6e557.h1 h1Var, java.lang.String str, java.io.File file) {
        this.f146344d = file;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String absolutePath = new java.io.File(new java.io.File(gm0.j1.u().d()).getParentFile().getAbsolutePath(), "Download").getAbsolutePath();
        if (new java.io.File(absolutePath).exists()) {
            java.lang.String absolutePath2 = new java.io.File(this.f146344d.getAbsolutePath(), "Download").getAbsolutePath();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "copy Download from = " + absolutePath + ", to = " + absolutePath2);
            com.p314xaae8f345.mm.vfs.w6.b(absolutePath, absolutePath2);
        }
    }
}
