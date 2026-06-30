package com.p314xaae8f345.mm.p1006xc5476f33.fts;

/* loaded from: classes12.dex */
public class o implements o13.t {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 f219310a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f219311b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f219312c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f219313d;

    public o(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSIndexDB", "Create SearchStorage: %s", str + "FTS5IndexMicroMsg_encrypt.db");
        if (this.f219310a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTS.FTSIndexDB", "before initDB, pre DB is not close, why?");
            this.f219310a.close();
        }
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(str, "FTS5IndexMicroMsg_encrypt.db").o();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FTS_MASTER_DB_ENCRYPT_PWD_STRING_SYNC;
        java.lang.String str2 = (java.lang.String) c17.m(u3Var, "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = kk.k.g((gm0.j1.b().j() + wo.w0.g(true) + c01.z1.r()).getBytes()).substring(0, 7);
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var, str2);
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107647xa5e841c4 = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.m107647xa5e841c4(o17, str2.getBytes(), (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory) null, ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).f218921p);
        this.f219310a = m107647xa5e841c4;
        d95.f fVar = new d95.f();
        fVar.f309212b = m107647xa5e841c4;
        ((java.util.concurrent.ConcurrentHashMap) d95.f.f309196i).put(fVar.k(), fVar);
        d95.f.d(fVar);
        java.lang.String g17 = wo.w0.g(true);
        gm0.j1.i();
        byte[] h17 = kk.k.h((g17 + gm0.j1.b().h()).getBytes());
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f219310a;
        long m107657x12386953 = c26948xabb259c7.m107657x12386953("initFTS", false, false);
        com.p314xaae8f345.mm.vfs.r6[] G = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a("/system/usr/icu")).G();
        if (G != null) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var : G) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSIndexDB", "icu file %s", r6Var.m82467xfb82e301());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.jni.C15572x9784e871.m63532x3b18261e(m107657x12386953, h17);
        c26948xabb259c7.m107714x63db387c(m107657x12386953, null);
        this.f219310a.m107710x1d3f4980("PRAGMA journal_mode=WAL;", null).close();
        this.f219310a.m107671xb158737d("PRAGMA synchronous=NORMAL;");
        this.f219310a.m107671xb158737d(java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (type INTEGER PRIMARY KEY, version INTEGER);", "FTS5IndexVersion"));
        this.f219311b = this.f219310a.m107663xac8b87c(java.lang.String.format("SELECT version FROM %s WHERE type=?;", "FTS5IndexVersion"));
        this.f219312c = this.f219310a.m107663xac8b87c(java.lang.String.format("INSERT OR REPLACE INTO %s (type, version) VALUES (?, ?);", "FTS5IndexVersion"));
        this.f219313d = this.f219310a.m107663xac8b87c(java.lang.String.format("DELETE FROM %s WHERE type=?", "FTS5IndexVersion"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSIndexDB", "initDB index params %d %s %s supportICU %b finalStartBuildMessageTimestamp %s finalStartBuildMessageClientVersion %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i0(com.p314xaae8f345.mm.vfs.w6.k(o17), 2.0d), wo.w0.g(true), java.lang.Boolean.FALSE, k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, k(-310L, 0L) / 1000), java.lang.Integer.toHexString((int) k(-310L, 0L)));
    }

    public static final void f() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().h());
        sb6.append("FTS5IndexMicroMsg_encrypt.db");
        java.lang.String sb7 = sb6.toString();
        java.lang.String[] strArr = {"", "-journal", "-wal", "-shm"};
        for (int i17 = 0; i17 < 4; i17++) {
            java.lang.String str = sb7 + strArr[i17];
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSIndexDB", "deleteIndexDB %s %s", str, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.j(str)));
            com.p314xaae8f345.mm.vfs.w6.h(str);
        }
    }

    public synchronized void a() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f219310a;
        if (c26948xabb259c7 != null && !c26948xabb259c7.m107689x51d3479()) {
            this.f219310a.m107659xb2c12e75();
        }
    }

    public boolean b(int i17, int i18) {
        int k17 = (!n("FTS5IndexVersion") || this.f219311b == null) ? 0 : (int) k(i17, 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSIndexDB", "type=%d | dbVersion=%d | targetVersion=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(k17), java.lang.Integer.valueOf(i18));
        return k17 == i18;
    }

    public void c() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f219310a;
        objArr[0] = c26948xabb259c7;
        objArr[1] = java.lang.Boolean.valueOf(c26948xabb259c7 != null ? c26948xabb259c7.m107697xb9a70294() : false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTS.FTSIndexDB", "close db:%s isOpen:%b ", objArr);
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c72 = this.f219310a;
        if (c26948xabb259c72 == null || !c26948xabb259c72.m107697xb9a70294()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTS.FTSIndexDB", "close in trans :%b ", java.lang.Boolean.valueOf(this.f219310a.m107689x51d3479()));
        while (this.f219310a.m107689x51d3479()) {
            this.f219310a.m107670x7d3c6b03();
        }
        this.f219311b.close();
        this.f219312c.close();
        this.f219310a.close();
        this.f219310a = null;
    }

    public synchronized void d() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f219310a;
        if (c26948xabb259c7 != null && c26948xabb259c7.m107689x51d3479()) {
            this.f219310a.m107729x576b60d6();
            this.f219310a.m107670x7d3c6b03();
        }
    }

    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 e(java.lang.String str) {
        return this.f219310a.m107663xac8b87c(str);
    }

    public void g(long j17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f219310a.m107672xb158737d(java.lang.String.format("UPDATE %s SET status=? WHERE entity_id=?;", "FTS5MetaMessage"), new java.lang.String[]{java.lang.String.valueOf(-1), java.lang.String.valueOf(j17)});
        j(java.lang.String.format("DELETE FROM %s WHERE rowid IN (SELECT docid FROM %s WHERE entity_id=?);", "FTS5IndexMessage", "FTS5MetaMessage"), new java.lang.String[]{java.lang.String.valueOf(j17)});
        j(java.lang.String.format("DELETE FROM %s WHERE entity_id=?", "FTS5MetaMessage"), new java.lang.String[]{java.lang.String.valueOf(j17)});
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSIndexDB", "deleteMsgById use time %d msgId %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Long.valueOf(j17));
    }

    public void h(java.lang.String str, long j17) {
        java.lang.String str2;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(str) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(str)) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            j(java.lang.String.format("DELETE FROM %s WHERE rowid IN (SELECT docid FROM %s WHERE aux_index=? AND timestamp <= ?);", "FTS5IndexMessage", "FTS5MetaMessage"), new java.lang.String[]{str, java.lang.String.valueOf(j17)});
            j(java.lang.String.format("DELETE FROM %s WHERE aux_index=? AND timestamp <= ?", "FTS5MetaMessage"), new java.lang.String[]{str, java.lang.String.valueOf(j17)});
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSIndexDB", "deleteTalkerMsgByTimestamp use time %d talker %s timestamp %s", java.lang.Long.valueOf(currentTimeMillis2), str, k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, j17 / 1000));
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.mo68477x336bdfd8(729L, 10L, 1L, false);
            if (currentTimeMillis2 > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                fVar.mo68477x336bdfd8(79L, 13L, 1L, false);
                return;
            } else if (currentTimeMillis2 > 1000) {
                fVar.mo68477x336bdfd8(79L, 12L, 1L, false);
                return;
            } else {
                if (currentTimeMillis2 > 500) {
                    fVar.mo68477x336bdfd8(79L, 11L, 1L, false);
                    return;
                }
                return;
            }
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(str)) {
            str2 = "opencustomerservicemsg";
        } else if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(str)) {
            return;
        } else {
            str2 = "appbrandcustomerservicemsg";
        }
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        j(java.lang.String.format("DELETE FROM %s WHERE rowid IN (SELECT docid FROM %s WHERE aux_index=? AND talker=? AND timestamp <= ?);", "FTS5IndexMessage", "FTS5MetaMessage"), new java.lang.String[]{str2, str, java.lang.String.valueOf(j17)});
        j(java.lang.String.format("DELETE FROM %s WHERE aux_index=? AND talker=? AND timestamp <= ?", "FTS5MetaMessage"), new java.lang.String[]{str2, str, java.lang.String.valueOf(j17)});
        long currentTimeMillis4 = java.lang.System.currentTimeMillis() - currentTimeMillis3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSIndexDB", "deleteKefuTalkerMsgByTimestamp use time %d talker %s timestamp %s", java.lang.Long.valueOf(currentTimeMillis4), str2, k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, j17 / 1000));
        jx3.f fVar2 = jx3.f.INSTANCE;
        fVar2.mo68477x336bdfd8(729L, 10L, 1L, false);
        if (currentTimeMillis4 > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            fVar2.mo68477x336bdfd8(79L, 13L, 1L, false);
        } else if (currentTimeMillis4 > 1000) {
            fVar2.mo68477x336bdfd8(79L, 12L, 1L, false);
        } else if (currentTimeMillis4 > 500) {
            fVar2.mo68477x336bdfd8(79L, 11L, 1L, false);
        }
    }

    public void i(java.lang.String str) {
        this.f219310a.m107671xb158737d(str);
    }

    public void j(java.lang.String str, java.lang.Object[] objArr) {
        this.f219310a.m107672xb158737d(str, objArr);
    }

    public long k(long j17, long j18) {
        this.f219311b.m107799x37fbf859(1, j17);
        try {
            return this.f219311b.m107873x58f653cf();
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26958x769a621 unused) {
            return j18;
        }
    }

    public l75.k0 l() {
        return new w13.l(this.f219310a);
    }

    public boolean m() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f219310a;
        return c26948xabb259c7 != null && c26948xabb259c7.m107689x51d3479();
    }

    public boolean n(java.lang.String str) {
        com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107710x1d3f4980 = this.f219310a.m107710x1d3f4980("SELECT 1 FROM sqlite_master WHERE type='table' AND name=?;", new java.lang.String[]{str});
        boolean moveToNext = m107710x1d3f4980.moveToNext();
        m107710x1d3f4980.close();
        return moveToNext;
    }

    public android.database.Cursor o(java.lang.String str, java.lang.String[] strArr) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.fts.e(this.f219310a.m107712x46d43bc4(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea, str, strArr, null));
    }

    public synchronized void p() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f219310a;
        if (c26948xabb259c7 != null && c26948xabb259c7.m107697xb9a70294() && this.f219310a.m107689x51d3479()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSIndexDB", "rollback");
            try {
                this.f219310a.m107670x7d3c6b03();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSIndexDB", e17, "occur error \n%s", e17);
            }
        }
    }

    public void q(long j17, long j18) {
        this.f219312c.m107799x37fbf859(1, j17);
        this.f219312c.m107799x37fbf859(2, j18);
        this.f219312c.m107867xb158f775();
    }
}
