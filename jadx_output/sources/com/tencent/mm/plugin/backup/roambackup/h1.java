package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes11.dex */
public final /* synthetic */ class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.h1 f92617d = new com.tencent.mm.plugin.backup.roambackup.h1();

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        com.tencent.mm.sdk.platformtools.o4 o4Var = on1.c.f346809d;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMsgLogic", "cleanWild, mmkv.count = %d", java.lang.Long.valueOf(o4Var.g()));
        on1.c.f346806a = true;
        for (java.lang.String str : o4Var.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupMsgLogic", "getRoamBackupMMKV, key = %s, val = %s", str, o4Var.t(str));
            xg3.m0 u17 = c01.d9.b().u();
            final java.lang.String str2 = com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE;
            final long longValue = java.lang.Long.valueOf(str).longValue();
            final com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) u17;
            if (g9Var.Da(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)) {
                z17 = ot0.c3.l().b("hasSvrId", new yz5.a() { // from class: com.tencent.mm.storage.g9$$b6
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        return java.lang.Integer.valueOf(ot0.z2.f348822a.m1(com.tencent.mm.storage.g9.this.f193989r, str2, longValue) ? 1 : 0);
                    }
                }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$c6
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        java.lang.String str3 = str2;
                        android.database.Cursor D = com.tencent.mm.storage.g9.this.f193989r.D(str3, null, "msgSvrId=?", new java.lang.String[]{"" + longValue}, null, null, null, 2);
                        int i17 = D.getCount() > 0 ? 1 : 0;
                        D.close();
                        return java.lang.Integer.valueOf(i17);
                    }
                }) == 1;
            } else if (g9Var.Pb(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)) {
                z17 = ot0.z2.f348822a.m1(g9Var.f193989r, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, longValue);
            } else {
                android.database.Cursor D = g9Var.f193989r.D(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, null, "msgSvrId=?", new java.lang.String[]{"" + longValue}, null, null, null, 2);
                boolean z18 = D.getCount() > 0;
                D.close();
                z17 = z18;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupMsgLogic", "getRoamBackupMMKV, key = %s, hasMsgInfo = %s", str, java.lang.Boolean.valueOf(z17));
            if (!z17) {
                for (java.lang.String str3 : o4Var.t(str).split(";")) {
                    if (!str3.isEmpty()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMsgLogic", "getRoamBackupMMKV wild file = %s, delRet = %s", str3, java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.h(str3)));
                    }
                }
            }
        }
        on1.c.f346806a = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMsgLogic", "cleanWild completed");
        o4Var.d();
        com.tencent.mm.sdk.platformtools.o4.N("BackupMsgLogic", 1, null).d();
    }
}
