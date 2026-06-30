package com.p314xaae8f345.mm.p959x883644fd;

/* loaded from: classes12.dex */
public class a0 extends l75.s0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.o6 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f153020h = {"CREATE TABLE IF NOT EXISTS netstat ( id INTEGER PRIMARY KEY, peroid INT, textCountIn INT, textBytesIn INT, imageCountIn INT, imageBytesIn INT, voiceCountIn INT, voiceBytesIn INT, videoCountIn INT, videoBytesIn INT, mobileBytesIn INT, wifiBytesIn INT, sysMobileBytesIn INT, sysWifiBytesIn INT, textCountOut INT, textBytesOut INT, imageCountOut INT, imageBytesOut INT, voiceCountOut INT, voiceBytesOut INT, videoCountOut INT, videoBytesOut INT, mobileBytesOut INT, wifiBytesOut INT, sysMobileBytesOut INT, sysWifiBytesOut INT, reserved1 INT, reserved2 INT, reserved3 TEXT, realMobileBytesIn INT, realWifiBytesIn INT, realMobileBytesOut INT, realWifiBytesOut INT) ", "CREATE INDEX IF NOT EXISTS  statInfoIndex ON netstat ( peroid ) "};

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f153021i = {"realMobileBytesIn", "realWifiBytesIn", "realMobileBytesOut", "realWifiBytesOut"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f153022d;

    /* renamed from: e, reason: collision with root package name */
    public long f153023e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.p6 f153024f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.p6(this, gm0.j1.e().a(), 30, 2, 300000, 1000);

    /* renamed from: g, reason: collision with root package name */
    public long f153025g;

    public a0(l75.k0 k0Var) {
        this.f153022d = k0Var;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String[] strArr = f153021i;
        for (int i17 = 0; i17 < 4; i17++) {
            hashSet.add(strArr[i17]);
        }
        l75.k0 k0Var2 = this.f153022d;
        android.database.Cursor f17 = k0Var2.f("PRAGMA table_info(netstat);", null, 2);
        int columnIndex = f17.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
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
        this.f153025g = java.lang.System.currentTimeMillis();
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.o6
    public boolean B() {
        l75.k0 k0Var = this.f153022d;
        if (k0Var.G()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetStat", "summer preAppend inTransaction return false");
            return false;
        }
        long F = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        this.f153023e = F;
        if (F > 0) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetStat", "summer preAppend ticket: " + this.f153023e + " return false");
        return false;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.o6
    public void d0(com.p314xaae8f345.mm.sdk.p2603x2137b148.p6 p6Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.n6 n6Var) {
        int i17 = n6Var.f274405a;
        com.p314xaae8f345.mm.p959x883644fd.s sVar = (com.p314xaae8f345.mm.p959x883644fd.s) n6Var.f274407c;
        if (sVar == null || i17 != 1) {
            return;
        }
        int i18 = sVar.f153088c;
        int i19 = sVar.f153087b;
        if (i18 > 0) {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            if ((sVar.f153086a & 2) != 0) {
                contentValues.put("peroid", java.lang.Integer.valueOf(sVar.f153088c));
            }
            if ((sVar.f153086a & 4) != 0) {
                contentValues.put("textCountIn", java.lang.Integer.valueOf(sVar.f153089d));
            }
            if ((sVar.f153086a & 8) != 0) {
                contentValues.put("textBytesIn", java.lang.Long.valueOf(sVar.f153090e));
            }
            if ((sVar.f153086a & 16) != 0) {
                contentValues.put("imageCountIn", java.lang.Integer.valueOf(sVar.f153091f));
            }
            if ((sVar.f153086a & 32) != 0) {
                contentValues.put("imageBytesIn", java.lang.Long.valueOf(sVar.f153092g));
            }
            if ((sVar.f153086a & 64) != 0) {
                contentValues.put("voiceCountIn", java.lang.Integer.valueOf(sVar.f153093h));
            }
            if ((sVar.f153086a & 128) != 0) {
                contentValues.put("voiceBytesIn", java.lang.Long.valueOf(sVar.f153094i));
            }
            if ((sVar.f153086a & 256) != 0) {
                contentValues.put("videoCountIn", java.lang.Integer.valueOf(sVar.f153095j));
            }
            if ((sVar.f153086a & 512) != 0) {
                contentValues.put("videoBytesIn", java.lang.Long.valueOf(sVar.f153096k));
            }
            if ((sVar.f153086a & 1024) != 0) {
                contentValues.put("mobileBytesIn", java.lang.Long.valueOf(sVar.f153097l));
            }
            if ((sVar.f153086a & 2048) != 0) {
                contentValues.put("wifiBytesIn", java.lang.Long.valueOf(sVar.f153098m));
            }
            if ((sVar.f153086a & 4096) != 0) {
                contentValues.put("sysMobileBytesIn", java.lang.Long.valueOf(sVar.f153099n));
            }
            if ((sVar.f153086a & 8192) != 0) {
                contentValues.put("sysWifiBytesIn", java.lang.Long.valueOf(sVar.f153100o));
            }
            if ((sVar.f153086a & 16384) != 0) {
                contentValues.put("textCountOut", java.lang.Integer.valueOf(sVar.f153101p));
            }
            if ((sVar.f153086a & 32768) != 0) {
                contentValues.put("textBytesOut", java.lang.Long.valueOf(sVar.f153102q));
            }
            if ((sVar.f153086a & 65536) != 0) {
                contentValues.put("imageCountOut", java.lang.Integer.valueOf(sVar.f153103r));
            }
            if ((sVar.f153086a & 131072) != 0) {
                contentValues.put("imageBytesOut", java.lang.Long.valueOf(sVar.f153104s));
            }
            if ((sVar.f153086a & 262144) != 0) {
                contentValues.put("voiceCountOut", java.lang.Integer.valueOf(sVar.f153105t));
            }
            if ((sVar.f153086a & 524288) != 0) {
                contentValues.put("voiceBytesOut", java.lang.Long.valueOf(sVar.f153106u));
            }
            if ((sVar.f153086a & 1048576) != 0) {
                contentValues.put("videoCountOut", java.lang.Integer.valueOf(sVar.f153107v));
            }
            if ((sVar.f153086a & 2097152) != 0) {
                contentValues.put("videoBytesOut", java.lang.Long.valueOf(sVar.f153108w));
            }
            if ((sVar.f153086a & 4194304) != 0) {
                contentValues.put("mobileBytesOut", java.lang.Long.valueOf(sVar.f153109x));
            }
            if ((sVar.f153086a & 8388608) != 0) {
                contentValues.put("wifiBytesOut", java.lang.Long.valueOf(sVar.f153110y));
            }
            if ((sVar.f153086a & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) != 0) {
                contentValues.put("sysMobileBytesOut", java.lang.Long.valueOf(sVar.f153111z));
            }
            if ((sVar.f153086a & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432) != 0) {
                contentValues.put("sysWifiBytesOut", java.lang.Long.valueOf(sVar.A));
            }
            if ((sVar.f153086a & 67108864) != 0) {
                contentValues.put("realMobileBytesIn", java.lang.Long.valueOf(sVar.B));
            }
            if ((sVar.f153086a & 134217728) != 0) {
                contentValues.put("realWifiBytesIn", java.lang.Long.valueOf(sVar.C));
            }
            if ((sVar.f153086a & 268435456) != 0) {
                contentValues.put("realMobileBytesOut", java.lang.Long.valueOf(sVar.D));
            }
            if ((sVar.f153086a & com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965) != 0) {
                contentValues.put("realWifiBytesOut", java.lang.Long.valueOf(sVar.E));
            }
            l75.k0 k0Var = this.f153022d;
            if (i19 < 0) {
                sVar.f153087b = (int) k0Var.l("netstat", dm.i4.f66865x76d1ec5a, contentValues);
                return;
            }
            k0Var.p("netstat", contentValues, "peroid=" + i18, null);
        }
    }

    public void m0(com.p314xaae8f345.mm.p959x883644fd.s sVar) {
        iz5.a.d(null, sVar);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (sVar.f153088c <= 0) {
            sVar.f153088c = (int) (currentTimeMillis / 86400000);
        }
        int i17 = sVar.f153088c;
        if (i17 <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p959x883644fd.s n07 = n0(i17);
        if (n07 == null || sVar.f153088c != n07.f153088c) {
            sVar.f153086a |= 2;
            sVar.f153087b = -1;
            if (n07 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetStat", n07.m48195x9616526c());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetStat", "NetStat started.");
            }
            this.f153025g = currentTimeMillis;
        } else {
            int i18 = n07.f153086a | 1;
            sVar.f153086a = i18;
            long j17 = sVar.f153089d;
            long j18 = n07.f153090e;
            sVar.f153089d = (int) (j17 + j18);
            sVar.f153090e += j18;
            long j19 = sVar.f153091f;
            long j27 = n07.f153092g;
            sVar.f153091f = (int) (j19 + j27);
            sVar.f153092g += j27;
            sVar.f153093h += n07.f153093h;
            sVar.f153094i += n07.f153094i;
            sVar.f153095j += n07.f153095j;
            sVar.f153096k += n07.f153096k;
            long j28 = sVar.f153097l + n07.f153097l;
            sVar.f153097l = j28;
            long j29 = sVar.f153098m + n07.f153098m;
            sVar.f153098m = j29;
            sVar.f153099n += n07.f153099n;
            sVar.f153100o += n07.f153100o;
            long j37 = sVar.f153101p;
            long j38 = n07.f153102q;
            sVar.f153101p = (int) (j37 + j38);
            sVar.f153102q += j38;
            long j39 = sVar.f153103r;
            long j47 = n07.f153104s;
            sVar.f153103r = (int) (j39 + j47);
            sVar.f153104s += j47;
            sVar.f153105t += n07.f153105t;
            sVar.f153106u += n07.f153106u;
            sVar.f153107v += n07.f153107v;
            sVar.f153108w += n07.f153108w;
            long j48 = sVar.f153109x + n07.f153109x;
            sVar.f153109x = j48;
            long j49 = sVar.f153110y + n07.f153110y;
            sVar.f153110y = j49;
            sVar.f153111z += n07.f153111z;
            sVar.A += n07.A;
            sVar.B += n07.B;
            sVar.C += n07.C;
            sVar.D += n07.D;
            sVar.E += n07.E;
            if (j28 <= 4096 && j29 <= 4096 && j48 <= 4096) {
                int i19 = (j49 > 4096L ? 1 : (j49 == 4096L ? 0 : -1));
            }
            sVar.f153087b = n07.f153087b;
            sVar.f153086a = i18 | 2;
            if (currentTimeMillis - this.f153025g > 300000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetStat", sVar.m48195x9616526c());
                this.f153025g = currentTimeMillis;
            }
        }
        u0(sVar);
    }

    public com.p314xaae8f345.mm.p959x883644fd.s n0(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.p6 p6Var = this.f153024f;
        com.p314xaae8f345.mm.p959x883644fd.s sVar = (com.p314xaae8f345.mm.p959x883644fd.s) p6Var.b(valueOf);
        if (sVar != null) {
            if (sVar.f153088c != i17) {
                return null;
            }
            return sVar;
        }
        android.database.Cursor D = this.f153022d.D("netstat", null, "peroid = " + i17, null, null, null, null, 2);
        if (D.moveToFirst()) {
            sVar = new com.p314xaae8f345.mm.p959x883644fd.s();
            sVar.a(D);
        }
        D.close();
        if (sVar != null) {
            p6Var.c(java.lang.Integer.valueOf(i17), sVar);
            return sVar;
        }
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.p959x883644fd.s sVar2 = new com.p314xaae8f345.mm.p959x883644fd.s();
        sVar2.f153086a = 0;
        sVar2.f153087b = 0;
        sVar2.f153088c = 0;
        sVar2.f153089d = 0;
        sVar2.f153090e = 0L;
        sVar2.f153091f = 0;
        sVar2.f153092g = 0L;
        sVar2.f153093h = 0;
        sVar2.f153094i = 0L;
        sVar2.f153095j = 0;
        sVar2.f153096k = 0L;
        sVar2.f153097l = 0L;
        sVar2.f153098m = 0L;
        sVar2.f153099n = 0L;
        sVar2.f153100o = 0L;
        sVar2.f153101p = 0;
        sVar2.f153102q = 0L;
        sVar2.f153103r = 0;
        sVar2.f153104s = 0L;
        sVar2.f153105t = 0;
        sVar2.f153106u = 0L;
        sVar2.f153107v = 0;
        sVar2.f153108w = 0L;
        sVar2.f153109x = 0L;
        sVar2.f153110y = 0L;
        sVar2.f153111z = 0L;
        sVar2.A = 0L;
        sVar2.B = 0L;
        sVar2.C = 0L;
        sVar2.D = 0L;
        sVar2.E = 0L;
        p6Var.c(valueOf2, sVar2);
        return sVar;
    }

    public long s0() {
        this.f153024f.a(true);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        int currentTimeMillis = (int) ((java.lang.System.currentTimeMillis() - 1296000000) / 86400000);
        int currentTimeMillis2 = (int) (((java.lang.System.currentTimeMillis() / 86400000) * 86400000) / 86400000);
        android.database.Cursor f17 = this.f153022d.f("SELECT peroid FROM netstat  WHERE peroid > " + currentTimeMillis + " order by peroid limit 1", null, 2);
        if (f17.moveToFirst()) {
            currentTimeMillis2 = f17.getInt(f17.getColumnIndex("peroid"));
        }
        f17.close();
        return currentTimeMillis2 * 86400000;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.o6
    public void u() {
        long j17 = this.f153023e;
        if (j17 > 0) {
            this.f153022d.w(java.lang.Long.valueOf(j17));
        }
    }

    public final boolean u0(com.p314xaae8f345.mm.p959x883644fd.s sVar) {
        iz5.a.d(null, sVar);
        iz5.a.g(null, sVar.f153088c > 0);
        return this.f153024f.c(java.lang.Integer.valueOf(sVar.f153088c), sVar);
    }
}
