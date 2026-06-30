package com.tencent.mm.modelstat;

/* loaded from: classes12.dex */
public class a0 extends l75.s0 implements com.tencent.mm.sdk.platformtools.o6 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f71487h = {"CREATE TABLE IF NOT EXISTS netstat ( id INTEGER PRIMARY KEY, peroid INT, textCountIn INT, textBytesIn INT, imageCountIn INT, imageBytesIn INT, voiceCountIn INT, voiceBytesIn INT, videoCountIn INT, videoBytesIn INT, mobileBytesIn INT, wifiBytesIn INT, sysMobileBytesIn INT, sysWifiBytesIn INT, textCountOut INT, textBytesOut INT, imageCountOut INT, imageBytesOut INT, voiceCountOut INT, voiceBytesOut INT, videoCountOut INT, videoBytesOut INT, mobileBytesOut INT, wifiBytesOut INT, sysMobileBytesOut INT, sysWifiBytesOut INT, reserved1 INT, reserved2 INT, reserved3 TEXT, realMobileBytesIn INT, realWifiBytesIn INT, realMobileBytesOut INT, realWifiBytesOut INT) ", "CREATE INDEX IF NOT EXISTS  statInfoIndex ON netstat ( peroid ) "};

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f71488i = {"realMobileBytesIn", "realWifiBytesIn", "realMobileBytesOut", "realWifiBytesOut"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f71489d;

    /* renamed from: e, reason: collision with root package name */
    public long f71490e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.p6 f71491f = new com.tencent.mm.sdk.platformtools.p6(this, gm0.j1.e().a(), 30, 2, 300000, 1000);

    /* renamed from: g, reason: collision with root package name */
    public long f71492g;

    public a0(l75.k0 k0Var) {
        this.f71489d = k0Var;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String[] strArr = f71488i;
        for (int i17 = 0; i17 < 4; i17++) {
            hashSet.add(strArr[i17]);
        }
        l75.k0 k0Var2 = this.f71489d;
        android.database.Cursor f17 = k0Var2.f("PRAGMA table_info(netstat);", null, 2);
        int columnIndex = f17.getColumnIndex(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        while (f17.moveToNext()) {
            hashSet.remove(f17.getString(columnIndex));
        }
        f17.close();
        for (int i18 = 0; i18 < 4; i18++) {
            java.lang.String str = strArr[i18];
            if (hashSet.contains(str)) {
                k0Var2.A("netstat", "ALTER TABLE netstat ADD COLUMN " + str + " INT;");
            }
        }
        this.f71492g = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.sdk.platformtools.o6
    public boolean B() {
        l75.k0 k0Var = this.f71489d;
        if (k0Var.G()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetStat", "summer preAppend inTransaction return false");
            return false;
        }
        long F = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        this.f71490e = F;
        if (F > 0) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetStat", "summer preAppend ticket: " + this.f71490e + " return false");
        return false;
    }

    @Override // com.tencent.mm.sdk.platformtools.o6
    public void d0(com.tencent.mm.sdk.platformtools.p6 p6Var, com.tencent.mm.sdk.platformtools.n6 n6Var) {
        int i17 = n6Var.f192872a;
        com.tencent.mm.modelstat.s sVar = (com.tencent.mm.modelstat.s) n6Var.f192874c;
        if (sVar == null || i17 != 1) {
            return;
        }
        int i18 = sVar.f71555c;
        int i19 = sVar.f71554b;
        if (i18 > 0) {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            if ((sVar.f71553a & 2) != 0) {
                contentValues.put("peroid", java.lang.Integer.valueOf(sVar.f71555c));
            }
            if ((sVar.f71553a & 4) != 0) {
                contentValues.put("textCountIn", java.lang.Integer.valueOf(sVar.f71556d));
            }
            if ((sVar.f71553a & 8) != 0) {
                contentValues.put("textBytesIn", java.lang.Long.valueOf(sVar.f71557e));
            }
            if ((sVar.f71553a & 16) != 0) {
                contentValues.put("imageCountIn", java.lang.Integer.valueOf(sVar.f71558f));
            }
            if ((sVar.f71553a & 32) != 0) {
                contentValues.put("imageBytesIn", java.lang.Long.valueOf(sVar.f71559g));
            }
            if ((sVar.f71553a & 64) != 0) {
                contentValues.put("voiceCountIn", java.lang.Integer.valueOf(sVar.f71560h));
            }
            if ((sVar.f71553a & 128) != 0) {
                contentValues.put("voiceBytesIn", java.lang.Long.valueOf(sVar.f71561i));
            }
            if ((sVar.f71553a & 256) != 0) {
                contentValues.put("videoCountIn", java.lang.Integer.valueOf(sVar.f71562j));
            }
            if ((sVar.f71553a & 512) != 0) {
                contentValues.put("videoBytesIn", java.lang.Long.valueOf(sVar.f71563k));
            }
            if ((sVar.f71553a & 1024) != 0) {
                contentValues.put("mobileBytesIn", java.lang.Long.valueOf(sVar.f71564l));
            }
            if ((sVar.f71553a & 2048) != 0) {
                contentValues.put("wifiBytesIn", java.lang.Long.valueOf(sVar.f71565m));
            }
            if ((sVar.f71553a & 4096) != 0) {
                contentValues.put("sysMobileBytesIn", java.lang.Long.valueOf(sVar.f71566n));
            }
            if ((sVar.f71553a & 8192) != 0) {
                contentValues.put("sysWifiBytesIn", java.lang.Long.valueOf(sVar.f71567o));
            }
            if ((sVar.f71553a & 16384) != 0) {
                contentValues.put("textCountOut", java.lang.Integer.valueOf(sVar.f71568p));
            }
            if ((sVar.f71553a & 32768) != 0) {
                contentValues.put("textBytesOut", java.lang.Long.valueOf(sVar.f71569q));
            }
            if ((sVar.f71553a & 65536) != 0) {
                contentValues.put("imageCountOut", java.lang.Integer.valueOf(sVar.f71570r));
            }
            if ((sVar.f71553a & 131072) != 0) {
                contentValues.put("imageBytesOut", java.lang.Long.valueOf(sVar.f71571s));
            }
            if ((sVar.f71553a & 262144) != 0) {
                contentValues.put("voiceCountOut", java.lang.Integer.valueOf(sVar.f71572t));
            }
            if ((sVar.f71553a & 524288) != 0) {
                contentValues.put("voiceBytesOut", java.lang.Long.valueOf(sVar.f71573u));
            }
            if ((sVar.f71553a & 1048576) != 0) {
                contentValues.put("videoCountOut", java.lang.Integer.valueOf(sVar.f71574v));
            }
            if ((sVar.f71553a & 2097152) != 0) {
                contentValues.put("videoBytesOut", java.lang.Long.valueOf(sVar.f71575w));
            }
            if ((sVar.f71553a & 4194304) != 0) {
                contentValues.put("mobileBytesOut", java.lang.Long.valueOf(sVar.f71576x));
            }
            if ((sVar.f71553a & 8388608) != 0) {
                contentValues.put("wifiBytesOut", java.lang.Long.valueOf(sVar.f71577y));
            }
            if ((sVar.f71553a & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0) {
                contentValues.put("sysMobileBytesOut", java.lang.Long.valueOf(sVar.f71578z));
            }
            if ((sVar.f71553a & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0) {
                contentValues.put("sysWifiBytesOut", java.lang.Long.valueOf(sVar.A));
            }
            if ((sVar.f71553a & 67108864) != 0) {
                contentValues.put("realMobileBytesIn", java.lang.Long.valueOf(sVar.B));
            }
            if ((sVar.f71553a & 134217728) != 0) {
                contentValues.put("realWifiBytesIn", java.lang.Long.valueOf(sVar.C));
            }
            if ((sVar.f71553a & 268435456) != 0) {
                contentValues.put("realMobileBytesOut", java.lang.Long.valueOf(sVar.D));
            }
            if ((sVar.f71553a & com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
                contentValues.put("realWifiBytesOut", java.lang.Long.valueOf(sVar.E));
            }
            l75.k0 k0Var = this.f71489d;
            if (i19 < 0) {
                sVar.f71554b = (int) k0Var.l("netstat", dm.i4.COL_ID, contentValues);
                return;
            }
            k0Var.p("netstat", contentValues, "peroid=" + i18, null);
        }
    }

    public void m0(com.tencent.mm.modelstat.s sVar) {
        iz5.a.d(null, sVar);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (sVar.f71555c <= 0) {
            sVar.f71555c = (int) (currentTimeMillis / 86400000);
        }
        int i17 = sVar.f71555c;
        if (i17 <= 0) {
            return;
        }
        com.tencent.mm.modelstat.s n07 = n0(i17);
        if (n07 == null || sVar.f71555c != n07.f71555c) {
            sVar.f71553a |= 2;
            sVar.f71554b = -1;
            if (n07 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetStat", n07.toString());
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetStat", "NetStat started.");
            }
            this.f71492g = currentTimeMillis;
        } else {
            int i18 = n07.f71553a | 1;
            sVar.f71553a = i18;
            long j17 = sVar.f71556d;
            long j18 = n07.f71557e;
            sVar.f71556d = (int) (j17 + j18);
            sVar.f71557e += j18;
            long j19 = sVar.f71558f;
            long j27 = n07.f71559g;
            sVar.f71558f = (int) (j19 + j27);
            sVar.f71559g += j27;
            sVar.f71560h += n07.f71560h;
            sVar.f71561i += n07.f71561i;
            sVar.f71562j += n07.f71562j;
            sVar.f71563k += n07.f71563k;
            long j28 = sVar.f71564l + n07.f71564l;
            sVar.f71564l = j28;
            long j29 = sVar.f71565m + n07.f71565m;
            sVar.f71565m = j29;
            sVar.f71566n += n07.f71566n;
            sVar.f71567o += n07.f71567o;
            long j37 = sVar.f71568p;
            long j38 = n07.f71569q;
            sVar.f71568p = (int) (j37 + j38);
            sVar.f71569q += j38;
            long j39 = sVar.f71570r;
            long j47 = n07.f71571s;
            sVar.f71570r = (int) (j39 + j47);
            sVar.f71571s += j47;
            sVar.f71572t += n07.f71572t;
            sVar.f71573u += n07.f71573u;
            sVar.f71574v += n07.f71574v;
            sVar.f71575w += n07.f71575w;
            long j48 = sVar.f71576x + n07.f71576x;
            sVar.f71576x = j48;
            long j49 = sVar.f71577y + n07.f71577y;
            sVar.f71577y = j49;
            sVar.f71578z += n07.f71578z;
            sVar.A += n07.A;
            sVar.B += n07.B;
            sVar.C += n07.C;
            sVar.D += n07.D;
            sVar.E += n07.E;
            if (j28 <= 4096 && j29 <= 4096 && j48 <= 4096) {
                int i19 = (j49 > 4096L ? 1 : (j49 == 4096L ? 0 : -1));
            }
            sVar.f71554b = n07.f71554b;
            sVar.f71553a = i18 | 2;
            if (currentTimeMillis - this.f71492g > 300000) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetStat", sVar.toString());
                this.f71492g = currentTimeMillis;
            }
        }
        u0(sVar);
    }

    public com.tencent.mm.modelstat.s n0(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.tencent.mm.sdk.platformtools.p6 p6Var = this.f71491f;
        com.tencent.mm.modelstat.s sVar = (com.tencent.mm.modelstat.s) p6Var.b(valueOf);
        if (sVar != null) {
            if (sVar.f71555c != i17) {
                return null;
            }
            return sVar;
        }
        android.database.Cursor D = this.f71489d.D("netstat", null, "peroid = " + i17, null, null, null, null, 2);
        if (D.moveToFirst()) {
            sVar = new com.tencent.mm.modelstat.s();
            sVar.a(D);
        }
        D.close();
        if (sVar != null) {
            p6Var.c(java.lang.Integer.valueOf(i17), sVar);
            return sVar;
        }
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        com.tencent.mm.modelstat.s sVar2 = new com.tencent.mm.modelstat.s();
        sVar2.f71553a = 0;
        sVar2.f71554b = 0;
        sVar2.f71555c = 0;
        sVar2.f71556d = 0;
        sVar2.f71557e = 0L;
        sVar2.f71558f = 0;
        sVar2.f71559g = 0L;
        sVar2.f71560h = 0;
        sVar2.f71561i = 0L;
        sVar2.f71562j = 0;
        sVar2.f71563k = 0L;
        sVar2.f71564l = 0L;
        sVar2.f71565m = 0L;
        sVar2.f71566n = 0L;
        sVar2.f71567o = 0L;
        sVar2.f71568p = 0;
        sVar2.f71569q = 0L;
        sVar2.f71570r = 0;
        sVar2.f71571s = 0L;
        sVar2.f71572t = 0;
        sVar2.f71573u = 0L;
        sVar2.f71574v = 0;
        sVar2.f71575w = 0L;
        sVar2.f71576x = 0L;
        sVar2.f71577y = 0L;
        sVar2.f71578z = 0L;
        sVar2.A = 0L;
        sVar2.B = 0L;
        sVar2.C = 0L;
        sVar2.D = 0L;
        sVar2.E = 0L;
        p6Var.c(valueOf2, sVar2);
        return sVar;
    }

    public long s0() {
        this.f71491f.a(true);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        int currentTimeMillis = (int) ((java.lang.System.currentTimeMillis() - 1296000000) / 86400000);
        int currentTimeMillis2 = (int) (((java.lang.System.currentTimeMillis() / 86400000) * 86400000) / 86400000);
        android.database.Cursor f17 = this.f71489d.f("SELECT peroid FROM netstat  WHERE peroid > " + currentTimeMillis + " order by peroid limit 1", null, 2);
        if (f17.moveToFirst()) {
            currentTimeMillis2 = f17.getInt(f17.getColumnIndex("peroid"));
        }
        f17.close();
        return currentTimeMillis2 * 86400000;
    }

    @Override // com.tencent.mm.sdk.platformtools.o6
    public void u() {
        long j17 = this.f71490e;
        if (j17 > 0) {
            this.f71489d.w(java.lang.Long.valueOf(j17));
        }
    }

    public final boolean u0(com.tencent.mm.modelstat.s sVar) {
        iz5.a.d(null, sVar);
        iz5.a.g(null, sVar.f71555c > 0);
        return this.f71491f.c(java.lang.Integer.valueOf(sVar.f71555c), sVar);
    }
}
