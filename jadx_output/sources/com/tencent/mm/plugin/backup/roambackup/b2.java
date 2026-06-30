package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.b2 f92576d = new com.tencent.mm.plugin.backup.roambackup.b2();

    @Override // java.lang.Runnable
    public final void run() {
        if (gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("MM.RoamBackup.RoamServiceInitializer", "Clean backup Download & Upload Dir");
            com.tencent.mm.plugin.backup.roambackup.v1 v1Var = com.tencent.mm.plugin.backup.roambackup.v1.f92914a;
            v1Var.b(com.tencent.mm.plugin.backup.roambackup.v1.f92918e);
            v1Var.b(com.tencent.mm.plugin.backup.roambackup.v1.f92917d);
        }
    }
}
