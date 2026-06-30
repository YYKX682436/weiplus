package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes11.dex */
public final /* synthetic */ class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.h1 f174150d = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.h1();

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = on1.c.f428342d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMsgLogic", "cleanWild, mmkv.count = %d", java.lang.Long.valueOf(o4Var.g()));
        on1.c.f428339a = true;
        for (java.lang.String str : o4Var.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMsgLogic", "getRoamBackupMMKV, key = %s, val = %s", str, o4Var.t(str));
            xg3.m0 u17 = c01.d9.b().u();
            final java.lang.String str2 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7;
            final long longValue = java.lang.Long.valueOf(str).longValue();
            final com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) u17;
            if (g9Var.Da(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
                z17 = ot0.c3.l().b("hasSvrId", new yz5.a() { // from class: com.tencent.mm.storage.g9$$b6
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        return java.lang.Integer.valueOf(ot0.z2.f430355a.m1(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, str2, longValue) ? 1 : 0);
                    }
                }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$c6
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        java.lang.String str3 = str2;
                        android.database.Cursor D = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r.D(str3, null, "msgSvrId=?", new java.lang.String[]{"" + longValue}, null, null, null, 2);
                        int i17 = D.getCount() > 0 ? 1 : 0;
                        D.close();
                        return java.lang.Integer.valueOf(i17);
                    }
                }) == 1;
            } else if (g9Var.Pb(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
                z17 = ot0.z2.f430355a.m1(g9Var.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, longValue);
            } else {
                android.database.Cursor D = g9Var.f275522r.D(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, null, "msgSvrId=?", new java.lang.String[]{"" + longValue}, null, null, null, 2);
                boolean z18 = D.getCount() > 0;
                D.close();
                z17 = z18;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMsgLogic", "getRoamBackupMMKV, key = %s, hasMsgInfo = %s", str, java.lang.Boolean.valueOf(z17));
            if (!z17) {
                for (java.lang.String str3 : o4Var.t(str).split(";")) {
                    if (!str3.isEmpty()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMsgLogic", "getRoamBackupMMKV wild file = %s, delRet = %s", str3, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.h(str3)));
                    }
                }
            }
        }
        on1.c.f428339a = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMsgLogic", "cleanWild completed");
        o4Var.d();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("BackupMsgLogic", 1, null).d();
    }
}
