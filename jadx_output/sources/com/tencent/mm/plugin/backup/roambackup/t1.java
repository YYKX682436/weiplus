package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.t1 f92736d = new com.tencent.mm.plugin.backup.roambackup.t1();

    public t1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("roam_backup");
        if (!com.tencent.mm.vfs.w6.j(c17)) {
            com.tencent.mm.vfs.w6.u(c17);
        }
        return new com.tencent.mm.vfs.r6(c17);
    }
}
