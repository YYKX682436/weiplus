package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f92626d;

    public j0(qo1.j0 j0Var) {
        this.f92626d = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Try remove invalid auto backup task by pkgId=");
        qo1.j0 j0Var = this.f92626d;
        sb6.append(j0Var.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", sb6.toString());
        qo1.j1.f365523a.e(j0Var.a(), true);
    }
}
