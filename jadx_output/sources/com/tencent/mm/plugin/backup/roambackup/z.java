package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f92966d;

    public z(long j17) {
        this.f92966d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.backup.roambackup.b bVar = com.tencent.mm.plugin.backup.roambackup.b.f92568a;
        long j17 = this.f92966d;
        bVar.b(j17);
        ((nv.v1) i95.n0.c(nv.v1.class)).Ri(j17);
        com.tencent.mm.plugin.backup.roambackup.r0.f92684a.c();
    }
}
