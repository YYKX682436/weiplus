package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.p1 f92620d;

    public i1(com.tencent.mm.plugin.backup.roambackup.p1 p1Var) {
        this.f92620d = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.backup.roambackup.p1 p1Var = this.f92620d;
        com.tencent.mars.xlog.Log.i(p1Var.f92673d, "cancelDowngrade");
        p1Var.Ai();
    }
}
