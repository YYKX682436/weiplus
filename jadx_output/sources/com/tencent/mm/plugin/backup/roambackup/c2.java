package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.c2 f92579d = new com.tencent.mm.plugin.backup.roambackup.c2();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.backup.roambackup.l2 l2Var = com.tencent.mm.plugin.backup.roambackup.l2.f92644a;
        if (((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui()) {
            long c17 = c01.id.c() / com.tencent.tmassistantsdk.downloadservice.Downloads.MAX_RETYR_AFTER;
            oo1.o oVar = oo1.o.f347151a;
            if (c17 == oVar.c().q("last_package_report_time", 0L)) {
                return;
            }
            com.tencent.mm.plugin.backup.roambackup.r0.f92684a.g(true, com.tencent.mm.plugin.backup.roambackup.g2.f92613d);
            oVar.c().B("last_package_report_time", c17);
        }
    }
}
