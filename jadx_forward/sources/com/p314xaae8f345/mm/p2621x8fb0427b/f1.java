package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class f1 extends l75.n0 implements com.p314xaae8f345.mm.p2621x8fb0427b.a8 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f275440h = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.s1.W1, "BizPhotoSingleMsgInfo")};

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f275441i = {"CREATE  INDEX IF NOT EXISTS photo_msg_svr_id_index ON BizPhotoSingleMsgInfo ( msgSvrId ) ", "CREATE  INDEX IF NOT EXISTS photo_talker_index ON BizPhotoSingleMsgInfo ( talker ) ", "CREATE  INDEX IF NOT EXISTS  photo_create_time_index ON BizPhotoSingleMsgInfo ( createTime ) ", "CREATE  INDEX IF NOT EXISTS  photo_status_talker_index ON BizPhotoSingleMsgInfo ( status,talker ) ", "CREATE  INDEX IF NOT EXISTS  photo_status_talker_id_index ON BizPhotoSingleMsgInfo ( status,talkerId ) ", "CREATE  INDEX IF NOT EXISTS  photo_status_create_time_index ON BizPhotoSingleMsgInfo ( status,createTime ) ", "CREATE  INDEX IF NOT EXISTS  photo_type_order_flag_index ON BizPhotoSingleMsgInfo ( type,orderFlag ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f275442d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.v0 f275443e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f275444f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f275445g;

    public f1(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.s1.W1, "BizPhotoSingleMsgInfo", f275441i);
        this.f275443e = new com.p314xaae8f345.mm.p2621x8fb0427b.d1(this);
        this.f275444f = false;
        this.f275445g = new java.util.concurrent.atomic.AtomicLong(-60000000L);
        this.f275442d = k0Var;
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
        this.f275442d.A("BizPhotoSingleMsgInfo", "update BizPhotoSingleMsgInfo set silentFoldMsgReadStatus = 2 where msgId IN (" + ((java.lang.Object) sb6) + ")");
        com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.x1();
        x1Var.f277854a = com.p314xaae8f345.mm.p2621x8fb0427b.y1.UPDATE;
        y0(x1Var);
    }

    @Override // l75.n0, l75.g0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var) {
        boolean mo51731x24249762 = super.mo51731x24249762(s1Var, false);
        com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.x1();
        x1Var.f277856c = s1Var.f67306x114ef53e;
        x1Var.f277855b = s1Var;
        x1Var.f277854a = com.p314xaae8f345.mm.p2621x8fb0427b.y1.INSERT;
        y0(x1Var);
        if (!this.f275444f) {
            this.f275444f = true;
            ((ku5.t0) ku5.t0.f394148d).l(new com.p314xaae8f345.mm.p2621x8fb0427b.e1(this), 1000L, "BizTimeLineInfoStorageThread");
        }
        return mo51731x24249762;
    }

    public boolean L0(com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var) {
        boolean mo51732xbf274172 = super.mo51732xbf274172(s1Var, false, "msgSvrId");
        com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.x1();
        x1Var.f277856c = s1Var.f67306x114ef53e;
        x1Var.f277855b = s1Var;
        x1Var.f277854a = com.p314xaae8f345.mm.p2621x8fb0427b.y1.UPDATE;
        y0(x1Var);
        return mo51732xbf274172;
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a8
    public void P(com.p314xaae8f345.mm.p2621x8fb0427b.z1 z1Var) {
        this.f275443e.j(z1Var);
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a8
    public java.util.List U(int i17, long j17) {
        return D0(this.f275442d.E("BizPhotoSingleMsgInfo", null, "createTime<?", new java.lang.String[]{"" + j17}, null, null, "createTime DESC limit " + i17));
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a8
    public java.util.List b() {
        return D0(this.f275442d.E("BizPhotoSingleMsgInfo", null, "status!=? OR silentFoldMsgReadStatus==?", new java.lang.String[]{"4", "1"}, null, null, "createTime DESC "));
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

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a8
    public int f() {
        android.database.Cursor B = this.f275442d.B("SELECT count(*) FROM BizPhotoSingleMsgInfo where status != 4", null);
        int i17 = B.moveToFirst() ? B.getInt(0) : 0;
        B.close();
        return i17;
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a8
    public java.util.List i(int i17) {
        return D0(this.f275442d.E("BizPhotoSingleMsgInfo", null, null, null, null, null, "createTime DESC limit " + i17));
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
        this.f275442d.A("BizPhotoSingleMsgInfo", "update BizPhotoSingleMsgInfo set status = 4 where msgId IN (" + sb6.toString() + ")");
        com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.x1();
        x1Var.f277854a = com.p314xaae8f345.mm.p2621x8fb0427b.y1.UPDATE;
        y0(x1Var);
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a8
    public void j0(com.p314xaae8f345.mm.p2621x8fb0427b.z1 z1Var, android.os.Looper looper) {
        this.f275443e.a(z1Var, looper);
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a8
    public boolean s(java.lang.String str, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizPhotoSingleMsgStorage", "setNotifyMsgBlockStatusFlag mpArticleKey invalid");
            return false;
        }
        return this.f275442d.A("BizPhotoSingleMsgInfo", "update BizPhotoSingleMsgInfo set notifyMsgBlockFlag = " + i17 + " where mpArticleKey = '" + str + "'");
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a8
    public int x() {
        android.database.Cursor B = this.f275442d.B("SELECT count(*) FROM BizPhotoSingleMsgInfo", null);
        int i17 = B.moveToFirst() ? B.getInt(0) : 0;
        B.close();
        return i17;
    }

    public void y0(com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var) {
        l75.v0 v0Var = this.f275443e;
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
