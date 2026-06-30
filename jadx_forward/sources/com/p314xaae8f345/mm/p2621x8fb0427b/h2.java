package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class h2 extends l75.n0 implements com.p314xaae8f345.mm.p2621x8fb0427b.a8 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f276524i = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.s1.W1, "BizTimeLineSingleMsgInfo")};

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f276525m = {"CREATE  INDEX IF NOT EXISTS msg_svr_id_index ON BizTimeLineSingleMsgInfo ( msgSvrId ) ", "CREATE  INDEX IF NOT EXISTS talker_index ON BizTimeLineSingleMsgInfo ( talker ) ", "CREATE  INDEX IF NOT EXISTS  create_time_index ON BizTimeLineSingleMsgInfo ( createTime ) ", "CREATE  INDEX IF NOT EXISTS  status_talker_index ON BizTimeLineSingleMsgInfo ( status,talker ) ", "CREATE  INDEX IF NOT EXISTS  status_talker_id_index ON BizTimeLineSingleMsgInfo ( status,talkerId ) ", "CREATE  INDEX IF NOT EXISTS  status_create_time_index ON BizTimeLineSingleMsgInfo ( status,createTime ) ", "CREATE  INDEX IF NOT EXISTS  type_order_flag_index ON BizTimeLineSingleMsgInfo ( type,orderFlag ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f276526d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.v0 f276527e;

    /* renamed from: f, reason: collision with root package name */
    public int f276528f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f276529g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f276530h;

    public h2(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.s1.W1, "BizTimeLineSingleMsgInfo", f276525m);
        this.f276527e = new com.p314xaae8f345.mm.p2621x8fb0427b.i2(this);
        this.f276528f = 100;
        this.f276529g = false;
        this.f276530h = new java.util.concurrent.atomic.AtomicLong(-50000000L);
        this.f276526d = k0Var;
    }

    public static void a(com.p314xaae8f345.mm.p2621x8fb0427b.h2 h2Var, com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var, java.lang.String str) {
        h2Var.getClass();
        long j17 = s1Var.f67293xd09be28e;
        if (j17 > 0 && h2Var.J0(j17, "msgSvrId") != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineSingleMsgStorage", "mergeAndInsert skip duplicate msgSvrId=" + s1Var.f67293xd09be28e);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 L0 = h2Var.L0(str);
        if (L0 == null) {
            h2Var.mo880xb970c2b9(s1Var);
            return;
        }
        s1Var.f67289x7691d41c += L0.f67289x7691d41c;
        s1Var.f67290x1636613d = L0.f67290x1636613d;
        s1Var.f67292x297eb4f7 = L0.f67292x297eb4f7;
        super.mo51732xbf274172(s1Var, false, "msgId");
        com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.x1();
        x1Var.f277856c = s1Var.f67306x114ef53e;
        x1Var.f277855b = s1Var;
        x1Var.f277854a = com.p314xaae8f345.mm.p2621x8fb0427b.y1.MERGE_UPDATE;
        h2Var.y0(x1Var);
    }

    public final java.util.List D0(android.database.Cursor cursor) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (cursor.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.s1();
            s1Var.mo9015xbf5d97fd(cursor);
            linkedList.add(s1Var);
        }
        cursor.close();
        return linkedList;
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a8
    public void H(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < list.size(); i17++) {
            if (i17 > 0) {
                sb6.append(",");
            }
            sb6.append(list.get(i17));
        }
        this.f276526d.A("BizTimeLineSingleMsgInfo", "update BizTimeLineSingleMsgInfo set silentFoldMsgReadStatus = 2 where msgId IN (" + ((java.lang.Object) sb6) + ")");
        com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.x1();
        x1Var.f277854a = com.p314xaae8f345.mm.p2621x8fb0427b.y1.UPDATE;
        y0(x1Var);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.s1 J0(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.s1();
        android.database.Cursor D = this.f276526d.D("BizTimeLineSingleMsgInfo", null, str + "=?", new java.lang.String[]{"" + j17}, null, null, null, 2);
        if (!D.moveToFirst()) {
            D.close();
            return null;
        }
        s1Var.mo9015xbf5d97fd(D);
        D.close();
        return s1Var;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.s1 L0(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = null;
        if (str != null && !str.isEmpty()) {
            android.database.Cursor B = this.f276526d.B("SELECT * FROM BizTimeLineSingleMsgInfo WHERE status != 4 AND notifyMsgId = ? ORDER BY createTime DESC LIMIT 1", new java.lang.String[]{str});
            if (B.moveToFirst()) {
                s1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.s1();
                s1Var.mo9015xbf5d97fd(B);
            }
            B.close();
        }
        return s1Var;
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a8
    public void P(com.p314xaae8f345.mm.p2621x8fb0427b.z1 z1Var) {
        this.f276527e.j(z1Var);
    }

    public int P0(long j17) {
        android.database.Cursor B = this.f276526d.B("SELECT count(*) FROM BizTimeLineSingleMsgInfo where status != 4 and talkerId = " + j17 + " ", null);
        int i17 = B.moveToFirst() ? B.getInt(0) : 0;
        B.close();
        return i17;
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a8
    public java.util.List U(int i17, long j17) {
        return D0(this.f276526d.E("BizTimeLineSingleMsgInfo", null, "createTime<?", new java.lang.String[]{"" + j17}, null, null, "createTime DESC limit " + i17));
    }

    public synchronized long W0() {
        if (this.f276530h.longValue() == -50000000) {
            com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = null;
            android.database.Cursor B = this.f276526d.B("SELECT * FROM BizTimeLineSingleMsgInfo where type=10100 or type=318767153 order by createTime DESC limit 1", null);
            if (B.moveToFirst()) {
                s1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.s1();
                s1Var.mo9015xbf5d97fd(B);
            }
            B.close();
            if (s1Var != null) {
                this.f276530h.set(s1Var.f67292x297eb4f7);
            }
        }
        return this.f276530h.incrementAndGet();
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a8
    public java.util.List b() {
        return D0(this.f276526d.E("BizTimeLineSingleMsgInfo", null, "status!=? OR silentFoldMsgReadStatus==?", new java.lang.String[]{"4", "1"}, null, null, "createTime DESC "));
    }

    @Override // l75.n0, l75.g0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var) {
        boolean mo51731x24249762 = super.mo51731x24249762(s1Var, false);
        com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.x1();
        x1Var.f277856c = s1Var.f67306x114ef53e;
        x1Var.f277855b = s1Var;
        x1Var.f277854a = com.p314xaae8f345.mm.p2621x8fb0427b.y1.INSERT;
        y0(x1Var);
        if (!this.f276529g) {
            this.f276529g = true;
            ((ku5.t0) ku5.t0.f394148d).l(new com.p314xaae8f345.mm.p2621x8fb0427b.k2(this), 1000L, "BizTimeLineInfoStorageThread");
        }
        return mo51731x24249762;
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a8
    public boolean c(long j17, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.s1();
        s1Var.f67292x297eb4f7 = j17;
        boolean mo49766xb06685ab = super.mo49766xb06685ab(s1Var, z17, "msgId");
        if (z18) {
            com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.x1();
            x1Var.f277854a = com.p314xaae8f345.mm.p2621x8fb0427b.y1.DELETE;
            y0(x1Var);
        }
        return mo49766xb06685ab;
    }

    public void d1(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            this.f276526d.A("BizTimeLineSingleMsgInfo", "update BizTimeLineSingleMsgInfo set status = 4 where talker = '" + str + "'  and status != 4");
            com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.x1();
            x1Var.f277854a = com.p314xaae8f345.mm.p2621x8fb0427b.y1.UPDATE;
            y0(x1Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineSingleMsgStorage", "bobkw resetUnreadByTalker success, talker: ".concat(str));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizTimeLineSingleMsgStorage", "bobkw resetUnreadByTalker failed, talker: ".concat(str), e17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a8
    public int f() {
        android.database.Cursor B = this.f276526d.B("SELECT count(*) FROM BizTimeLineSingleMsgInfo where status != 4", null);
        int i17 = B.moveToFirst() ? B.getInt(0) : 0;
        B.close();
        return i17;
    }

    public boolean f1(com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var) {
        boolean mo51732xbf274172 = super.mo51732xbf274172(s1Var, false, "msgSvrId");
        com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.x1();
        x1Var.f277856c = s1Var.f67306x114ef53e;
        x1Var.f277855b = s1Var;
        x1Var.f277854a = com.p314xaae8f345.mm.p2621x8fb0427b.y1.UPDATE;
        y0(x1Var);
        return mo51732xbf274172;
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a8
    public java.util.List i(int i17) {
        return D0(this.f276526d.E("BizTimeLineSingleMsgInfo", null, null, null, null, null, "createTime DESC limit " + i17));
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a8
    public void i0(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < list.size(); i17++) {
            if (i17 > 0) {
                sb6.append(",");
            }
            sb6.append(list.get(i17));
        }
        this.f276526d.A("BizTimeLineSingleMsgInfo", "update BizTimeLineSingleMsgInfo set status = 4 where msgId IN (" + sb6.toString() + ")");
        com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.x1();
        x1Var.f277854a = com.p314xaae8f345.mm.p2621x8fb0427b.y1.UPDATE;
        y0(x1Var);
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a8
    public void j0(com.p314xaae8f345.mm.p2621x8fb0427b.z1 z1Var, android.os.Looper looper) {
        this.f276527e.a(z1Var, looper);
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a8
    public boolean s(java.lang.String str, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizTimeLineSingleMsgStorage", "setNotifyMsgBlockStatusFlag mpArticleKey invalid");
            return false;
        }
        return this.f276526d.A("BizTimeLineSingleMsgInfo", "update BizTimeLineSingleMsgInfo set notifyMsgBlockFlag = " + i17 + " where mpArticleKey = '" + str + "'");
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a8
    public int x() {
        android.database.Cursor B = this.f276526d.B("SELECT count(*) FROM BizTimeLineSingleMsgInfo", null);
        int i17 = B.moveToFirst() ? B.getInt(0) : 0;
        B.close();
        return i17;
    }

    public void y0(com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var) {
        l75.v0 v0Var = this.f276527e;
        if (v0Var.d(x1Var)) {
            v0Var.c();
        }
    }

    public boolean z0(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.s1();
        s1Var.f67306x114ef53e = str;
        boolean mo49766xb06685ab = super.mo49766xb06685ab((l75.f0) s1Var, false, "talker");
        com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.x1();
        x1Var.f277856c = s1Var.f67306x114ef53e;
        x1Var.f277855b = s1Var;
        x1Var.f277854a = com.p314xaae8f345.mm.p2621x8fb0427b.y1.DELETE;
        y0(x1Var);
        return mo49766xb06685ab;
    }
}
