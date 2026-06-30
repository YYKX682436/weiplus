package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class b2 extends l75.n0 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f275293i = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.s1.W1, "BizTimeLineInfo")};

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f275294m = {"CREATE  INDEX IF NOT EXISTS msg_id_index ON BizTimeLineInfo ( msgId ) ", "CREATE  INDEX IF NOT EXISTS  has_show_talker_index ON BizTimeLineInfo ( hasShow,talker ) ", "CREATE  INDEX IF NOT EXISTS  order_flag_place_top_index ON BizTimeLineInfo ( orderFlag,placeTop ) ", "CREATE  INDEX IF NOT EXISTS  talker_id_order_flag_index ON BizTimeLineInfo ( talkerId,orderFlag ) "};

    /* renamed from: n, reason: collision with root package name */
    public static final kk.j f275295n = new jt0.j(30);

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f275296d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.v0 f275297e;

    /* renamed from: f, reason: collision with root package name */
    public int f275298f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f275299g;

    /* renamed from: h, reason: collision with root package name */
    public long f275300h;

    public b2(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.s1.W1, "BizTimeLineInfo", f275294m);
        this.f275297e = new com.p314xaae8f345.mm.p2621x8fb0427b.t1(this);
        this.f275298f = 100;
        this.f275299g = new java.util.concurrent.atomic.AtomicLong(10L);
        this.f275300h = 10L;
        this.f275296d = k0Var;
        n1();
    }

    public boolean D0(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineInfoStorage", "deleteByTalker: %s", str);
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.s1();
        s1Var.f67306x114ef53e = str;
        boolean mo49766xb06685ab = super.mo49766xb06685ab((l75.f0) s1Var, false, "talker");
        com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.x1();
        x1Var.f277856c = s1Var.f67306x114ef53e;
        x1Var.f277855b = s1Var;
        x1Var.f277854a = com.p314xaae8f345.mm.p2621x8fb0427b.y1.DELETE;
        y0(x1Var);
        synchronized (this) {
            com.p314xaae8f345.mm.p2621x8fb0427b.s1 b17 = b1();
            if (b17 != null) {
                this.f275300h = java.lang.Math.min((b17.f67296x8340ced5 & (-4294967296L)) >> 32, this.f275300h);
            }
        }
        return mo49766xb06685ab;
    }

    public final java.util.List J0(android.database.Cursor cursor) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (cursor.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.s1();
            s1Var.mo9015xbf5d97fd(cursor);
            linkedList.add(s1Var);
        }
        cursor.close();
        return linkedList;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.s1 L0(long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.s1();
        android.database.Cursor D = this.f275296d.D("BizTimeLineInfo", null, "msgId=?", new java.lang.String[]{"" + j17}, null, null, null, 2);
        if (!D.moveToFirst()) {
            D.close();
            return null;
        }
        s1Var.mo9015xbf5d97fd(D);
        D.close();
        return s1Var;
    }

    public java.util.List P0(int i17, int i18) {
        return J0(this.f275296d.E("BizTimeLineInfo", null, "type=? ", new java.lang.String[]{"" + i18}, null, null, "orderFlag DESC limit " + i17));
    }

    public java.util.List W0(long j17, int i17) {
        return J0(this.f275296d.E("BizTimeLineInfo", null, "type=? and orderFlag>=?", new java.lang.String[]{"" + i17, "" + j17}, null, null, "orderFlag DESC"));
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.s1 b1() {
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = null;
        android.database.Cursor f17 = this.f275296d.f("SELECT * FROM BizTimeLineInfo order by orderFlag DESC limit 1", null, 2);
        if (f17.moveToFirst()) {
            s1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.s1();
            s1Var.mo9015xbf5d97fd(f17);
        }
        f17.close();
        return s1Var;
    }

    public java.util.List d1(int i17, int i18) {
        return J0(this.f275296d.E("BizTimeLineInfo", null, "type=?", new java.lang.String[]{"" + i17}, null, null, "orderFlag DESC limit " + i18));
    }

    public java.util.List f1(int i17, long j17, int i18) {
        return J0(this.f275296d.E("BizTimeLineInfo", null, "type=? and orderFlag<? ", new java.lang.String[]{"" + i18, "" + j17}, null, null, "orderFlag DESC limit " + i17));
    }

    public int i1(long j17) {
        java.lang.System.currentTimeMillis();
        android.database.Cursor B = this.f275296d.B("SELECT count(*) FROM BizTimeLineInfo where orderFlag >= " + (j17 & (-4294967296L)) + " and hasShow < 1 ", null);
        int i17 = B.moveToFirst() ? B.getInt(0) : 0;
        java.lang.System.currentTimeMillis();
        B.close();
        return i17;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: insert */
    public boolean mo880xb970c2b9(l75.f0 f0Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = (com.p314xaae8f345.mm.p2621x8fb0427b.s1) f0Var;
        boolean mo51731x24249762 = super.mo51731x24249762(s1Var, false);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        long j17 = (s1Var.f67296x8340ced5 & (-4294967296L)) >> 32;
        synchronized (this) {
            this.f275300h = java.lang.Math.max(j17, this.f275300h);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.x1();
        x1Var.f277856c = s1Var.f67306x114ef53e;
        x1Var.f277855b = s1Var;
        x1Var.f277854a = com.p314xaae8f345.mm.p2621x8fb0427b.y1.INSERT;
        y0(x1Var);
        return mo51731x24249762;
    }

    public int k1(long j17) {
        kk.j jVar = f275295n;
        java.lang.Boolean bool = (java.lang.Boolean) ((lt0.f) jVar).get(java.lang.Long.valueOf(j17));
        if (bool != null && bool.booleanValue()) {
            return 0;
        }
        java.lang.System.currentTimeMillis();
        l75.k0 k0Var = this.f275296d;
        android.database.Cursor B = k0Var.B("SELECT count(*) FROM BizTimeLineInfo where orderFlag >= " + j17 + " and status > 4", null);
        int i17 = B.moveToFirst() ? B.getInt(0) : 0;
        B.close();
        android.database.Cursor B2 = k0Var.B("SELECT count(*) FROM BizTimeLineInfo where orderFlag >= " + j17 + " and status < 4", null);
        if (B2.moveToFirst()) {
            i17 += B2.getInt(0);
        }
        B2.close();
        if (i17 == 0) {
            ((lt0.f) jVar).j(java.lang.Long.valueOf(j17), java.lang.Boolean.TRUE);
        }
        java.lang.System.currentTimeMillis();
        return i17;
    }

    public synchronized void n1() {
        long j17;
        synchronized (this) {
            android.database.Cursor f17 = this.f275296d.f("select max(orderFlag) from BizTimeLineInfo", null, 2);
            if (f17.moveToFirst()) {
                j17 = f17.getLong(0);
                f17.close();
            } else {
                j17 = 0;
            }
        }
        long j18 = j17 >> 32;
        this.f275300h = j18;
        if (j18 < 10) {
            this.f275300h = 10L;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 b17 = b1();
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizTimeLineInfoStorage", "initGroupId is null, id %d", java.lang.Long.valueOf(this.f275300h));
            return;
        }
        if (b17.f67305x10a0fed7 == 4) {
            this.f275299g.set(this.f275300h + 1);
        } else {
            this.f275299g.set(this.f275300h);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineInfoStorage", "initGroupId id %d/%d, status %d", java.lang.Long.valueOf(this.f275299g.longValue()), java.lang.Long.valueOf(this.f275300h), java.lang.Integer.valueOf(b17.f67305x10a0fed7));
    }

    public boolean o1(com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var, boolean z17) {
        boolean mo51732xbf274172 = super.mo51732xbf274172(s1Var, false, "msgId");
        if (z17) {
            com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.x1();
            x1Var.f277856c = s1Var.f67306x114ef53e;
            x1Var.f277855b = s1Var;
            x1Var.f277854a = com.p314xaae8f345.mm.p2621x8fb0427b.y1.UPDATE;
            y0(x1Var);
        }
        return mo51732xbf274172;
    }

    public void p1(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        boolean w27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).w2();
        java.lang.String str2 = "update BizTimeLineInfo set placeTop = " + (w27 ? 1 : 0) + " where status > 4 and talker = '" + str + "'";
        l75.k0 k0Var = this.f275296d;
        k0Var.A("BizTimeLineInfo", str2);
        k0Var.A("BizTimeLineInfo", "update BizTimeLineInfo set placeTop = " + (w27 ? 1 : 0) + " where status < 4 and talker = '" + str + "'");
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 b17 = b1();
        if (b17 != null && str.equals(b17.f67306x114ef53e)) {
            b17.f67298x8c900873 = w27 ? 1 : 0;
            super.mo51732xbf274172(b17, false, "msgSvrId");
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.x1();
        x1Var.f277854a = com.p314xaae8f345.mm.p2621x8fb0427b.y1.UPDATE;
        y0(x1Var);
    }

    public void y0(com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var) {
        l75.v0 v0Var = this.f275297e;
        if (v0Var.d(x1Var)) {
            v0Var.c();
        }
    }

    public void z0(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineInfoStorage", "deleteById: %d", java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.s1();
        s1Var.f67292x297eb4f7 = j17;
        super.mo49766xb06685ab((l75.f0) s1Var, false, "msgId");
        com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.x1();
        x1Var.f277854a = com.p314xaae8f345.mm.p2621x8fb0427b.y1.DELETE;
        y0(x1Var);
        synchronized (this) {
            com.p314xaae8f345.mm.p2621x8fb0427b.s1 b17 = b1();
            if (b17 != null) {
                this.f275300h = java.lang.Math.min((b17.f67296x8340ced5 & (-4294967296L)) >> 32, this.f275300h);
            }
        }
    }
}
