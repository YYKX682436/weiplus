package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.p1 f92627d;

    public j1(com.tencent.mm.plugin.backup.roambackup.p1 p1Var) {
        this.f92627d = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.backup.roambackup.p1 p1Var = this.f92627d;
        com.tencent.mars.xlog.Log.i(p1Var.f92673d, "downgrade");
        p1Var.Bi();
    }
}
