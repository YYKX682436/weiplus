package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes11.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.b1 f92575d = new com.tencent.mm.plugin.backup.roambackup.b1();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.mm_foundation.DartServiceCallerApi Bi = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Bi();
        if (Bi != null) {
            Bi.flutterBackupStopAllTask(com.tencent.mm.plugin.backup.roambackup.a1.f92566d);
        }
    }
}
