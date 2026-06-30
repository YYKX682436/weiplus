package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes12.dex */
public class g9 extends l75.s0 implements xg3.m0 {

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String[] f275510z = {"CREATE TABLE IF NOT EXISTS message ( msgId INTEGER PRIMARY KEY, msgSvrId INTEGER , type INT, status INT, isSend INT, isShowTimer INTEGER, createTime INTEGER, talker TEXT, content TEXT, imgPath TEXT, reserved TEXT, lvbuffer BLOB, transContent TEXT,transBrandWording TEXT ,talkerId INTEGER, bizClientMsgId TEXT, bizChatId INTEGER DEFAULT -1, bizChatUserId TEXT, msgSeq INTEGER, flag INT, solitaireFoldInfo BLOB, historyId TEXT) "};

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.l8 f275511d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.e8 f275512e;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f275514g;

    /* renamed from: h, reason: collision with root package name */
    public xg3.k0 f275515h;

    /* renamed from: p, reason: collision with root package name */
    public final kk.j f275520p;

    /* renamed from: q, reason: collision with root package name */
    public final kk.j f275521q;

    /* renamed from: r, reason: collision with root package name */
    public final l75.k0 f275522r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.w4 f275523s;

    /* renamed from: t, reason: collision with root package name */
    public int f275524t;

    /* renamed from: u, reason: collision with root package name */
    public final l75.v0 f275525u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Map f275526v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f275527w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f275528x;

    /* renamed from: y, reason: collision with root package name */
    public long f275529y;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f275513f = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final kk.j f275516i = new jt0.j(100);

    /* renamed from: m, reason: collision with root package name */
    public final kk.j f275517m = new jt0.j(100);

    /* renamed from: n, reason: collision with root package name */
    public final kk.j f275518n = new jt0.j(100);

    /* renamed from: o, reason: collision with root package name */
    public final kk.j f275519o = new jt0.j(100);

    public g9(l75.k0 k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.e8 e8Var, com.p314xaae8f345.mm.p2621x8fb0427b.l8 l8Var) {
        new jt0.j(100);
        this.f275520p = new jt0.j(100);
        this.f275521q = new jt0.j(500);
        this.f275523s = new com.p314xaae8f345.mm.p2621x8fb0427b.w4();
        this.f275524t = 0;
        this.f275525u = new com.p314xaae8f345.mm.p2621x8fb0427b.h9(this);
        this.f275526v = new java.util.HashMap();
        this.f275527w = false;
        this.f275528x = "";
        this.f275529y = 0L;
        this.f275522r = k0Var;
        this.f275512e = e8Var;
        this.f275511d = l8Var;
        gm0.j1.i();
        if (((java.lang.Integer) gm0.j1.u().c().l(348169, 0)).intValue() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "deleted dirty msg ,count is %d", java.lang.Integer.valueOf(k0Var.mo70514xb06685ab(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "msgId> ? ", new java.lang.String[]{"80000000"})));
            gm0.j1.i();
            gm0.j1.u().c().w(348169, 1);
        }
        Na(k0Var, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long F = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] strArr = {"CREATE INDEX IF NOT EXISTS messageIdIndex ON message ( msgId )", "CREATE INDEX IF NOT EXISTS messageSvrIdIndex ON message ( msgSvrId )", "CREATE INDEX IF NOT EXISTS messageSendCreateTimeIndex ON message ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS messageCreateTimeIndex ON message ( createTime )", "CREATE INDEX IF NOT EXISTS messageTaklerIdTypeCreateTimeIndex ON message ( talkerId,type,createTime )", "CREATE INDEX IF NOT EXISTS messageTalkerIdStatusIndex ON message ( talkerId,status )", "CREATE INDEX IF NOT EXISTS messageTalkerIdCreateTimeIsSendIndex ON message ( talkerId,isSend,createTime )", "CREATE INDEX IF NOT EXISTS messageTalkerIdCreateTimeIndex ON message ( talkerId,createTime )", "CREATE INDEX IF NOT EXISTS messageTalkerIdSvrIdIndex ON message ( talkerId,msgSvrId )", "CREATE INDEX IF NOT EXISTS messageTalkerIdTypeIndex ON message ( talkerId,type )", "CREATE INDEX IF NOT EXISTS messageTalkerTypeIndex ON message ( talker,type )", "CREATE INDEX IF NOT EXISTS messagemessageTalkerMsgSeqIndex ON message ( talker,msgSeq )", "CREATE INDEX IF NOT EXISTS messagemessageTalkerFlagMsgSeqIndex ON message ( talker,flag,msgSeq )"};
        strArr[4] = "CREATE INDEX IF NOT EXISTS  messageCreateTaklerTypeTimeIndex ON message ( talker,type,createTime )";
        strArr[5] = "CREATE INDEX IF NOT EXISTS  messageTalkerStatusIndex ON message ( talker,status )";
        strArr[6] = "CREATE INDEX IF NOT EXISTS  messageTalkerCreateTimeIsSendIndex ON message ( talker,isSend,createTime )";
        strArr[7] = "CREATE INDEX IF NOT EXISTS  messageCreateTaklerTimeIndex ON message ( talker,createTime )";
        strArr[8] = "CREATE INDEX IF NOT EXISTS  messageTalkerSvrIdIndex ON message ( talker,msgSvrId )";
        arrayList.addAll(java.util.Arrays.asList(strArr));
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            k0Var.A(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, (java.lang.String) arrayList.get(i17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "build new index last %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
        k0Var.w(java.lang.Long.valueOf(F));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "executeMsgInitSQL last %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        if (this.f275514g == null) {
            this.f275514g = new java.util.LinkedList();
        }
        ((java.util.LinkedList) this.f275514g).clear();
        xg3.k0 k0Var2 = new xg3.k0(1, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, xg3.k0.a(1L, 1000000L, 10000000L, 90000000L, 500000001L, 1500000001L));
        synchronized (this.f275514g) {
            ((java.util.LinkedList) this.f275514g).add(k0Var2);
        }
        Jb(k0Var2);
    }

    public final java.util.List A4() {
        return java.util.Arrays.asList(3, 39, 13, 43, 62, 44, 49, 268435505);
    }

    public android.database.Cursor A6(final java.lang.String str, final int i17) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
            return null;
        }
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().c("getLimitImage", new yz5.a() { // from class: com.tencent.mm.storage.g9$$u4
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str2 = X8;
                    java.lang.String str3 = str;
                    int i18 = i17;
                    ot0.z2 z2Var = ot0.z2.f430355a;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    return z2Var.F0(g9Var.f275522r, str2, str3, i18, java.util.Arrays.asList(g9Var.O3()));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$v4
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    return g9Var.f275522r.f("select * from " + X8 + " where" + g9Var.Z8(str) + "AND type IN (3,39,13) order by createTime DESC limit " + i17, null, 2);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.F0(this.f275522r, X8, str, i17, java.util.Arrays.asList(O3()));
        }
        return this.f275522r.f("select * from " + X8 + " where" + Z8(str) + "AND type IN (3,39,13) order by createTime DESC limit " + i17, null, 2);
    }

    public java.util.List B5(final java.lang.String str, boolean z17, final int i17) {
        iz5.a.g(null, this.f275514g != null);
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            ot0.c3 l17 = ot0.c3.l();
            final int i18 = z17 ? 1 : 0;
            yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.storage.g9$$z1
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.util.List u07 = ot0.z2.f430355a.u0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, i18, i17);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = ((java.util.ArrayList) u07).iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                        if (f9Var.b3() || f9Var.H2() || f9Var.T2()) {
                            arrayList.add(f9Var);
                        }
                    }
                    return arrayList;
                }
            };
            final int i19 = z17 ? 1 : 0;
            return l17.e("getLastMsg_isSend", aVar, new yz5.a() { // from class: com.tencent.mm.storage.g9$$k2
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    android.database.Cursor f17 = g9Var.f275522r.f("SELECT * FROM " + X8 + " WHERE" + g9Var.Z8(str) + "AND isSend = " + i19 + " ORDER BY createTime DESC LIMIT " + i17, null, 2);
                    while (f17.moveToNext()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                        f9Var.mo9015xbf5d97fd(f17);
                        if (f9Var.b3() || f9Var.H2() || f9Var.T2()) {
                            arrayList.add(f9Var);
                        }
                    }
                    f17.close();
                    return new java.util.ArrayList(arrayList);
                }
            });
        }
        if (Pb(X8)) {
            java.util.List u07 = ot0.z2.f430355a.u0(this.f275522r, X8, str, z17 ? 1 : 0, i17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) u07).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                if (f9Var.b3() || f9Var.H2() || f9Var.T2()) {
                    arrayList.add(f9Var);
                }
            }
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.database.Cursor f17 = this.f275522r.f("SELECT * FROM " + X8 + " WHERE" + Z8(str) + "AND isSend = " + (z17 ? 1 : 0) + " ORDER BY createTime DESC LIMIT " + i17, null, 2);
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var2.mo9015xbf5d97fd(f17);
            if (f9Var2.b3() || f9Var2.H2() || f9Var2.T2()) {
                arrayList2.add(f9Var2);
            }
        }
        f17.close();
        return arrayList2;
    }

    public long B8(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (this.f275515h == null) {
            this.f275515h = J8(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
        }
        this.f275515h.b(f9Var);
        return f9Var.m124847x74d37ac6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Ba(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        int i17;
        if (f9Var == null || f9Var.P0() == 4) {
            return;
        }
        f9Var.r1(4);
        java.lang.String P8 = P8(f9Var.m124847x74d37ac6(), f9Var.Q0());
        if (P8 == null || P8.isEmpty()) {
            return;
        }
        if (Pb(P8)) {
            up5.w wVar = new up5.w();
            i17 = ot0.z2.f430355a.u1(this.f275522r, P8, wVar, g95.e0.l(wVar, f9Var.mo9763xeb27878e()), f9Var.m124847x74d37ac6());
        } else {
            i17 = this.f275522r.p(P8, f9Var.mo9763xeb27878e(), "msgId=?", new java.lang.String[]{"" + f9Var.m124847x74d37ac6()});
        }
        if (i17 != 0) {
            m145262xf35bbb4();
            m0(new xg3.l0(f9Var.Q0(), "update", f9Var, -1));
        }
    }

    public android.database.Cursor C1(final java.lang.String str, final java.lang.String[] strArr, final int[] iArr, final long j17, final long j18) {
        if (Da(str)) {
            return ot0.c3.l().c("getAllMessageBetweenCreateTimeIgnoreTalker", new yz5.a() { // from class: com.tencent.mm.storage.g9$$w0
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.p(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, str, strArr, iArr, j17, j18);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$x0
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str2 = str;
                    java.lang.String[] strArr2 = strArr;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
                    for (int i17 : iArr) {
                        sb6.append(i17);
                        sb6.append(",");
                    }
                    sb6.deleteCharAt(sb6.length() - 1);
                    sb6.append(") ");
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("getAllMessageBetweenCreateTimeIgnoreTalker, sql = type in ");
                    sb7.append((java.lang.Object) sb6);
                    sb7.append(" AND createTime>");
                    long j19 = j17;
                    sb7.append(j19);
                    sb7.append(" AND createTime<");
                    long j27 = j18;
                    sb7.append(j27);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", sb7.toString());
                    return g9Var.f275522r.E(str2, strArr2, "type in " + ((java.lang.Object) sb6) + " AND createTime>" + j19 + " AND createTime<" + j27, null, null, null, null);
                }
            });
        }
        if (Pb(str)) {
            return ot0.z2.f430355a.p(this.f275522r, str, strArr, iArr, j17, j18);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
        for (int i17 : iArr) {
            sb6.append(i17);
            sb6.append(",");
        }
        sb6.deleteCharAt(sb6.length() - 1);
        sb6.append(") ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "getAllMessageBetweenCreateTimeIgnoreTalker, sql = type in " + ((java.lang.Object) sb6) + " AND createTime>" + j17 + " AND createTime<" + j18);
        return this.f275522r.E(str, strArr, "type in " + ((java.lang.Object) sb6) + " AND createTime>" + j17 + " AND createTime<" + j18, null, null, null, null);
    }

    public android.database.Cursor C8(java.lang.String talker, long j17, long j18, boolean z17, int i17) {
        if (j18 < j17) {
            j17 = j18;
            j18 = j17;
        }
        boolean Pb = Pb(X8(talker));
        l75.k0 db6 = this.f275522r;
        if (Pb) {
            java.lang.String TableNameByTalker = X8(talker);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae m106824x752de218 = ot0.d3.a(db6).m106824x752de218(TableNameByTalker, up5.i.f511503b);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106824x752de218, "getTable(...)");
            com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = m106824x752de218.m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
            com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106429x6234bbb = m106435xc9ff34fc.m106436x6bdbce7(c26981x40bb0da.ge(j17).and(c26981x40bb0da.le(j18)).and(up5.i.f511508g.eq(z17 ? 1 : 0)).and(up5.i.f511511j.eq(talker))).m106429x6234bbb(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106429x6234bbb, "limit(...)");
            return tp5.a.f(ot0.d3.a(db6), m106429x6234bbb.m106402x83249ab9(), null, null);
        }
        return db6.B("SELECT * FROM " + X8(talker) + " WHERE" + Z8(talker) + "AND createTime >= " + j17 + " AND createTime <= " + j18 + " AND isSend=" + (z17 ? 1 : 0) + " LIMIT " + i17, null);
    }

    public int D0(java.lang.String str, long j17) {
        int mo70514xb06685ab;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = o2(str, j17);
        this.f275523s.a((int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() / 86400), o27.I0(), o27.mo78012x3fdd41df() / 1000, true);
        boolean Pb = Pb(X8(str));
        l75.k0 db6 = this.f275522r;
        if (Pb) {
            java.lang.String TableNameByTalker = X8(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
            try {
                com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae m106824x752de218 = ot0.d3.a(db6).m106824x752de218(TableNameByTalker, up5.i.f511503b);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106824x752de218, "getTable(...)");
                m106824x752de218.m107088x90df30e9(up5.i.f511505d.eq(j17));
                mo70514xb06685ab = 1;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "deleteBySvrID failed: " + th6.getMessage());
                mo70514xb06685ab = -1;
            }
        } else {
            mo70514xb06685ab = db6.mo70514xb06685ab(X8(str), "msgSvrId=?", new java.lang.String[]{"" + j17});
        }
        if (mo70514xb06685ab != 0) {
            m145262xf35bbb4();
            m0(new xg3.l0(str, "delete", null, 0, 1));
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(111L, 246L, 1L, false);
        }
        return mo70514xb06685ab;
    }

    public long D2(final java.lang.String str) {
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().f("getCanEditMsgCount", new yz5.a() { // from class: com.tencent.mm.storage.g9$$n
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    ot0.z2 z2Var = ot0.z2.f430355a;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    return java.lang.Long.valueOf(z2Var.E(g9Var.f275522r, X8, str, java.util.Arrays.asList(g9Var.D8())));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$o
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    android.database.Cursor f17 = g9Var.f275522r.f("SELECT COUNT(*) FROM " + X8 + " WHERE " + g9Var.Z8(str) + " AND type NOT IN (10000,10002,570425393,64,855638065,889192497,922746929,268445456,1077936177,603979825)", null, 2);
                    int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
                    f17.close();
                    return java.lang.Long.valueOf(i17);
                }
            });
        }
        boolean Pb = Pb(X8);
        l75.k0 k0Var = this.f275522r;
        if (Pb) {
            return ot0.z2.f430355a.E(k0Var, X8, str, java.util.Arrays.asList(D8()));
        }
        android.database.Cursor f17 = k0Var.f("SELECT COUNT(*) FROM " + X8 + " WHERE " + Z8(str) + " AND type NOT IN (10000,10002,570425393,64,855638065,889192497,922746929,268445456,1077936177,603979825)", null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i17;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.y8 D3(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.y8 y8Var;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        kk.j jVar = this.f275518n;
        if (K0 || jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "input text null ???? %B", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "[arthurdan.FriendContentCrash] Fatal error!!! cachesForFriend is null!");
            y8Var = null;
        } else {
            y8Var = (com.p314xaae8f345.mm.p2621x8fb0427b.y8) ((lt0.f) jVar).get(java.lang.Integer.valueOf(str.hashCode()));
        }
        if (y8Var == null) {
            y8Var = com.p314xaae8f345.mm.p2621x8fb0427b.y8.i(str);
            if (jVar != null) {
                if (str == null) {
                    str = "";
                }
                ((lt0.f) jVar).j(java.lang.Integer.valueOf(str.hashCode()), y8Var);
            }
        }
        return y8Var;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 D5(final java.lang.String str, final long j17) {
        java.lang.String str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        final java.lang.String X8 = X8(str);
        final long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
        if (Da(X8)) {
            return ot0.c3.l().g("getLastMsgBeforeTime", new yz5.a() { // from class: com.tencent.mm.storage.g9$$r
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.v0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, m07, j17);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$s
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str3;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    long j18 = j17;
                    if (j18 == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                        str3 = "";
                    } else {
                        str3 = " createTime < " + j18 + " AND ";
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    android.database.Cursor f17 = g9Var.f275522r.f("select * from " + X8 + " where" + g9Var.P0(m07) + str3 + g9Var.Z8(str) + "order by createTime DESC limit 1", null, 2);
                    if (f17.moveToFirst()) {
                        f9Var.mo9015xbf5d97fd(f17);
                    }
                    f17.close();
                    return f9Var;
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.v0(this.f275522r, X8, str, m07, j17);
        }
        if (j17 == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
            str2 = "";
        } else {
            str2 = " createTime < " + j17 + " AND ";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        android.database.Cursor f17 = this.f275522r.f("select * from " + X8 + " where" + P0(m07) + str2 + Z8(str) + "order by createTime DESC limit 1", null, 2);
        if (f17.moveToFirst()) {
            f9Var.mo9015xbf5d97fd(f17);
        }
        f17.close();
        return f9Var;
    }

    public java.lang.Integer[] D8() {
        return new java.lang.Integer[]{10000, 10002, 570425393, 64, 855638065, 889192497, 922746929, 268445456, 1077936177, 603979825};
    }

    public final boolean Da(java.lang.String str) {
        return Pb(str) && ot0.l3.a();
    }

    public int F2(final java.lang.String str, long j17, long j18) {
        long j19;
        long j27;
        if (j18 < j17) {
            j27 = j17;
            j19 = j18;
        } else {
            j19 = j17;
            j27 = j18;
        }
        final java.lang.String X8 = X8(str);
        final long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
        if (Da(X8)) {
            ot0.c3 l17 = ot0.c3.l();
            final long j28 = j19;
            final long j29 = j27;
            yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.storage.g9$$p3
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.Integer.valueOf(ot0.z2.f430355a.F(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, m07, j28, j29));
                }
            };
            final long j37 = j27;
            return l17.b("getCount", aVar, new yz5.a() { // from class: com.tencent.mm.storage.g9$$q3
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    android.database.Cursor f17 = g9Var.f275522r.f("SELECT COUNT(msgId) FROM " + X8 + " WHERE" + g9Var.P0(m07) + g9Var.Z8(str) + "AND createTime >= " + j28 + " AND createTime <= " + j37, null, 2);
                    if (f17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "get count error, cursor is null");
                        return 0;
                    }
                    if (!f17.moveToFirst()) {
                        f17.close();
                        return 0;
                    }
                    int i17 = f17.getInt(0);
                    f17.close();
                    return java.lang.Integer.valueOf(i17);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.F(this.f275522r, X8, str, m07, j19, j27);
        }
        android.database.Cursor f17 = this.f275522r.f("SELECT COUNT(msgId) FROM " + X8 + " WHERE" + P0(m07) + Z8(str) + "AND createTime >= " + j19 + " AND createTime <= " + j27, null, 2);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "get count error, cursor is null");
            return 0;
        }
        if (!f17.moveToFirst()) {
            f17.close();
            return 0;
        }
        int i17 = f17.getInt(0);
        f17.close();
        return i17;
    }

    public final java.util.List F4() {
        return java.util.Arrays.asList(3, 39, 13, 43, 62, 44, 268435505, 486539313);
    }

    public long G2(java.lang.String str, final long j17) {
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().f("getCreateTimeByLocalId", new yz5.a() { // from class: com.tencent.mm.storage.g9$$h1
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.Long.valueOf(ot0.z2.f430355a.J(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, j17));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$i1
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    android.database.Cursor f17 = g9Var.f275522r.f("select createTime from " + X8 + " where msgId = " + j17, null, 2);
                    long j18 = f17.moveToFirst() ? f17.getLong(0) : 0L;
                    f17.close();
                    return java.lang.Long.valueOf(j18);
                }
            });
        }
        boolean Pb = Pb(X8);
        l75.k0 k0Var = this.f275522r;
        if (Pb) {
            return ot0.z2.f430355a.J(k0Var, X8, j17);
        }
        android.database.Cursor f17 = k0Var.f("select createTime from " + X8 + " where msgId = " + j17, null, 2);
        long j18 = f17.moveToFirst() ? f17.getLong(0) : 0L;
        f17.close();
        return j18;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.b9 H6(java.lang.String str) {
        kk.j jVar = this.f275519o;
        com.p314xaae8f345.mm.p2621x8fb0427b.b9 b9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.b9) ((lt0.f) jVar).get(java.lang.Integer.valueOf(str.hashCode()));
        if (b9Var != null) {
            return b9Var;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.b9 d17 = com.p314xaae8f345.mm.p2621x8fb0427b.b9.d(str);
        ((lt0.f) jVar).j(java.lang.Integer.valueOf(str.hashCode()), d17);
        return d17;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.e9 H9(java.lang.String str) {
        kk.j jVar = this.f275517m;
        com.p314xaae8f345.mm.p2621x8fb0427b.e9 e9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.e9) ((lt0.f) jVar).get(java.lang.Integer.valueOf(str.hashCode()));
        if (e9Var != null) {
            return e9Var;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.e9 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.e9.f(str);
        ((lt0.f) jVar).j(java.lang.Integer.valueOf(str.hashCode()), f17);
        return f17;
    }

    public int J0(java.lang.String talker) {
        int i17 = 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "deleteByTalker :%s  stack:%s", talker, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        u0(X8(talker), Z8(talker), null);
        boolean Pb = Pb(X8(talker));
        l75.k0 db6 = this.f275522r;
        if (Pb) {
            java.lang.String TableNameByTalker = X8(talker);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
            try {
                com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae m106824x752de218 = ot0.d3.a(db6).m106824x752de218(TableNameByTalker, up5.i.f511503b);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106824x752de218, "getTable(...)");
                m106824x752de218.m107088x90df30e9(up5.i.f511511j.eq(talker));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "deleteByTalker failed: " + th6.getMessage());
                i17 = -1;
            }
        } else {
            i17 = db6.mo70514xb06685ab(X8(talker), Z8(talker), null);
        }
        if (i17 != 0) {
            mo145247xf35bbb4("delete_talker " + talker);
            xg3.l0 l0Var = new xg3.l0(talker, "delete", null, 0, i17);
            l0Var.f535949g = -1L;
            m0(l0Var);
        }
        return i17;
    }

    public android.database.Cursor J3(final java.lang.String str, final long j17) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
            return null;
        }
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().c("getImageLargeThanTime", new yz5.a() { // from class: com.tencent.mm.storage.g9$$l3
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str2 = X8;
                    java.lang.String str3 = str;
                    long j18 = j17;
                    ot0.z2 z2Var = ot0.z2.f430355a;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    return z2Var.b0(g9Var.f275522r, str2, str3, j18, java.util.Arrays.asList(g9Var.O3()));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$m3
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    return g9Var.f275522r.f("select * from " + X8 + " where" + g9Var.Z8(str) + " AND type IN (3,39,13) AND createTime > " + j17 + " order by createTime DESC", null, 2);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.b0(this.f275522r, X8, str, j17, java.util.Arrays.asList(O3()));
        }
        return this.f275522r.f("select * from " + X8 + " where" + Z8(str) + " AND type IN (3,39,13) AND createTime > " + j17 + " order by createTime DESC", null, 2);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.c9 J6(java.lang.String str) {
        kk.j jVar = this.f275516i;
        com.p314xaae8f345.mm.p2621x8fb0427b.c9 c9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.c9) ((lt0.f) jVar).get(java.lang.Integer.valueOf(str.hashCode()));
        if (c9Var == null) {
            c9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.c9();
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msg", null);
            if (d17 != null) {
                try {
                    c9Var.f275349a = (java.lang.String) d17.get(".msg.pushmail.content.subject");
                    c9Var.f275350b = (java.lang.String) d17.get(".msg.pushmail.content.digest");
                    c9Var.f275351c = (java.lang.String) d17.get(".msg.pushmail.content.sender");
                    c9Var.f275352d = (java.lang.String) d17.get(".msg.pushmail.waplink");
                    java.lang.String str2 = (java.lang.String) d17.get(".msg.pushmail.content.attach");
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    c9Var.f275353e = str2.equalsIgnoreCase("true");
                    c9Var.f275354f = (java.lang.String) d17.get(".msg.pushmail.mailid");
                } catch (java.lang.Exception e17) {
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
            }
            ((lt0.f) jVar).j(java.lang.Integer.valueOf(str.hashCode()), c9Var);
        }
        return c9Var;
    }

    public final xg3.k0 J8(java.lang.String str) {
        iz5.a.g("tableName == null", str != null && str.length() > 0);
        int i17 = 0;
        while (true) {
            java.util.List list = this.f275514g;
            if (i17 >= ((java.util.LinkedList) list).size()) {
                iz5.a.g("no table match", false);
                return null;
            }
            if (str.equals(((xg3.k0) ((java.util.LinkedList) list).get(i17)).f535941d)) {
                return (xg3.k0) ((java.util.LinkedList) list).get(i17);
            }
            i17++;
        }
    }

    public void Jb(xg3.k0 k0Var) {
        long j17;
        char c17;
        final java.lang.String str = k0Var.f535941d;
        if (Da(str)) {
            j17 = ot0.c3.l().f("updateLstTableMsgIdRangeForEach", new yz5.a() { // from class: com.tencent.mm.storage.g9$$w3
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.Long.valueOf(ot0.z2.f430355a.K0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, str));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$x3
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    java.lang.String sql = "select max(msgid) from " + str;
                    l75.k0 db6 = g9Var.f275522r;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
                    tp5.b bVar = (tp5.b) tp5.a.g(ot0.d3.a(db6), sql, null, null);
                    long j18 = bVar.moveToPosition(0) ? bVar.getLong(0) : 0L;
                    bVar.close();
                    return java.lang.Long.valueOf(j18);
                }
            });
        } else {
            boolean Pb = Pb(str);
            l75.k0 k0Var2 = this.f275522r;
            if (Pb) {
                j17 = ot0.z2.f430355a.K0(k0Var2, str);
            } else {
                android.database.Cursor f17 = k0Var2.f("select max(msgid) from " + str, null, 2);
                j17 = f17.moveToFirst() ? f17.getLong(0) : 0L;
                f17.close();
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("msg.");
        java.lang.String str2 = k0Var.f535941d;
        sb6.append(str2);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = xg3.k0.f535937e;
        long max = java.lang.Math.max(o4Var.getLong(sb7, -1L), j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "id count is %d, now id:%d tableName: %s", java.lang.Long.valueOf(max), java.lang.Long.valueOf(k0Var.f535938a), str);
        long j18 = k0Var.f535938a;
        if (max >= j18) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j18);
            java.lang.Long valueOf2 = java.lang.Long.valueOf(max);
            xg3.j0[] j0VarArr = k0Var.f535939b;
            java.lang.Long valueOf3 = java.lang.Long.valueOf(j0VarArr[0].f535936b);
            java.lang.Long valueOf4 = java.lang.Long.valueOf(j0VarArr[1].f535935a);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgTable", "summermsg setMsgLocalId [%d, %d]  regions[%d, %d] stack[%s]", valueOf, valueOf2, valueOf3, valueOf4, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            if (max > j0VarArr[0].f535936b) {
                c17 = 1;
                long j19 = j0VarArr[1].f535935a;
                if (max < j19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgTable", "summermsg setMsgLocalId1 revised msgLocalId to %d", java.lang.Long.valueOf(j19));
                    k0Var.f535938a = j0VarArr[1].f535935a;
                    jx3.f.INSTANCE.mo68477x336bdfd8(111L, 169L, 1L, false);
                    o4Var.putLong("msg." + str2, max);
                }
            } else {
                c17 = 1;
            }
            if (max > j0VarArr[c17].f535936b) {
                long j27 = j0VarArr[2].f535935a;
                if (max < j27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgTable", "summermsg setMsgLocalId2 revised msgLocalId to %d", java.lang.Long.valueOf(j27));
                    k0Var.f535938a = j0VarArr[2].f535935a;
                    o4Var.putLong("msg." + str2, max);
                }
            }
            k0Var.f535938a = max;
            o4Var.putLong("msg." + str2, max);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "loading new msg id:" + k0Var.f535938a);
    }

    public android.database.Cursor K1(final java.lang.String str, final long j17) {
        if (Da(str)) {
            return ot0.c3.l().c("getAllMessageCursor", new yz5.a() { // from class: com.tencent.mm.storage.g9$$u6
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.q(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, str, j17);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$w6
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str2 = str;
                    return com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r.o(null, "SELECT * FROM " + str2 + " WHERE createTime < " + j17, null, str2, null);
                }
            });
        }
        if (Pb(str)) {
            return ot0.z2.f430355a.q(this.f275522r, str, j17);
        }
        return this.f275522r.o(null, "SELECT * FROM " + str + " WHERE createTime < " + j17, null, str, null);
    }

    public android.database.Cursor K3(final java.lang.String str, final long j17, final int i17) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
            return null;
        }
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().c("getImageSmallThanTime", new yz5.a() { // from class: com.tencent.mm.storage.g9$$q2
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str2 = X8;
                    java.lang.String str3 = str;
                    long j18 = j17;
                    int i18 = i17;
                    ot0.z2 z2Var = ot0.z2.f430355a;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    return z2Var.c0(g9Var.f275522r, str2, str3, j18, i18, java.util.Arrays.asList(g9Var.O3()));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$r2
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    return g9Var.f275522r.f("select * from " + X8 + " where" + g9Var.Z8(str) + " AND type IN (3,39,13) AND createTime < " + j17 + " order by createTime DESC limit " + i17, null, 2);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.c0(this.f275522r, X8, str, j17, i17, java.util.Arrays.asList(O3()));
        }
        return this.f275522r.f("select * from " + X8 + " where" + Z8(str) + " AND type IN (3,39,13) AND createTime < " + j17 + " order by createTime DESC limit " + i17, null, 2);
    }

    public android.database.Cursor K6(final java.lang.String str, final int i17, final long j17, final long j18) {
        java.lang.String str2;
        final java.lang.String X8 = X8(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "getMsgAfterTimeCursor talk:%s limitCount:%d ", str, java.lang.Integer.valueOf(i17));
        if (Da(X8)) {
            return ot0.c3.l().c("getMsgAfterTimeCursor", new yz5.a() { // from class: com.tencent.mm.storage.g9$$u2
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.P0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, i17, j17, j18);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$w2
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str3;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT * FROM ( SELECT * FROM ");
                    sb6.append(X8);
                    sb6.append(" WHERE");
                    sb6.append(g9Var.Z8(str));
                    long j19 = j17;
                    java.lang.String str4 = "";
                    if (j19 > 0) {
                        str3 = " AND createTime > " + j19;
                    } else {
                        str3 = "";
                    }
                    sb6.append(str3);
                    long j27 = j18;
                    if (j27 > 0) {
                        str4 = " AND createTime >= " + j27;
                    }
                    sb6.append(str4);
                    sb6.append(" ORDER BY createTime ASC LIMIT ");
                    sb6.append(i17);
                    sb6.append(") ORDER BY createTime ASC");
                    return g9Var.f275522r.B(sb6.toString(), null);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.P0(this.f275522r, X8, str, i17, j17, j18);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT * FROM ( SELECT * FROM ");
        sb6.append(X8);
        sb6.append(" WHERE");
        sb6.append(Z8(str));
        java.lang.String str3 = "";
        if (j17 > 0) {
            str2 = " AND createTime > " + j17;
        } else {
            str2 = "";
        }
        sb6.append(str2);
        if (j18 > 0) {
            str3 = " AND createTime >= " + j18;
        }
        sb6.append(str3);
        sb6.append(" ORDER BY createTime ASC LIMIT ");
        sb6.append(i17);
        sb6.append(") ORDER BY createTime ASC");
        return this.f275522r.B(sb6.toString(), null);
    }

    public void Ka(java.lang.String str) {
        xg3.l0 l0Var;
        int i17;
        if (this.f275527w) {
            synchronized (this.f275526v) {
                l0Var = ((java.util.HashMap) this.f275526v).containsKey(str) ? (xg3.l0) ((java.util.HashMap) this.f275526v).get(str) : null;
            }
            if (l0Var == null) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "statusNotify, No one Locking info Now , why this talker:%s call it ! [%s]", str, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                return;
            }
            java.lang.String str2 = l0Var.f535944b;
            if (str2 == null || !str2.equals("insert") || (i17 = l0Var.f535946d) <= 0) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "statusNotify talker[%s] insertCount[%d]", str, java.lang.Integer.valueOf(i17));
            l0Var.f535946d = 0;
        }
    }

    public int L0(java.lang.String talker, long j17) {
        int mo70514xb06685ab;
        java.lang.String str = Z8(talker) + " and createTime <= " + j17;
        u0(X8(talker), str, null);
        boolean Pb = Pb(X8(talker));
        l75.k0 db6 = this.f275522r;
        if (Pb) {
            java.lang.String TableNameByTalker = X8(talker);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
            try {
                com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae m106824x752de218 = ot0.d3.a(db6).m106824x752de218(TableNameByTalker, up5.i.f511503b);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106824x752de218, "getTable(...)");
                m106824x752de218.m107088x90df30e9(up5.i.f511510i.le(j17).and(up5.i.f511511j.eq(talker)));
                mo70514xb06685ab = 1;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "deleteByTalkerTimeEarlier failed: " + th6.getMessage());
                mo70514xb06685ab = -1;
            }
        } else {
            mo70514xb06685ab = db6.mo70514xb06685ab(X8(talker), str, null);
        }
        if (mo70514xb06685ab != 0) {
            mo145247xf35bbb4("delete_talker " + talker);
            xg3.l0 l0Var = new xg3.l0(talker, "delete", null, 0, mo70514xb06685ab);
            l0Var.f535949g = -1L;
            m0(l0Var);
        }
        return mo70514xb06685ab;
    }

    public final xg3.k0 L8(java.lang.String str) {
        java.lang.String str2;
        iz5.a.g("username == null", str != null && str.length() > 0);
        iz5.a.g(null, str != null && str.length() > 0);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f275513f).iterator();
        while (true) {
            if (!it.hasNext()) {
                str2 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7;
                break;
            }
            str2 = ((com.p314xaae8f345.mm.p2621x8fb0427b.f) it.next()).f(str);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                break;
            }
        }
        return J8(str2);
    }

    public android.database.Cursor M4(final java.lang.String str, final int i17, final long j17) {
        java.lang.String str2;
        final java.lang.String X8 = X8(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "getInitCursor1 talk:%s limitCount:%d", str, java.lang.Integer.valueOf(i17));
        if (Da(X8)) {
            return ot0.c3.l().c("getInitCursor", new yz5.a() { // from class: com.tencent.mm.storage.g9$$r0
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.k0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, i17, j17);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$t0
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str3;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT * FROM ( SELECT * FROM ");
                    sb6.append(X8);
                    sb6.append(" WHERE");
                    sb6.append(g9Var.Z8(str));
                    long j18 = j17;
                    if (j18 > 0) {
                        str3 = " AND createTime > " + j18;
                    } else {
                        str3 = "";
                    }
                    sb6.append(str3);
                    sb6.append(" ORDER BY createTime DESC LIMIT ");
                    sb6.append(i17);
                    sb6.append(") ORDER BY createTime ASC");
                    return g9Var.f275522r.B(sb6.toString(), null);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.k0(this.f275522r, X8, str, i17, j17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT * FROM ( SELECT * FROM ");
        sb6.append(X8);
        sb6.append(" WHERE");
        sb6.append(Z8(str));
        if (j17 > 0) {
            str2 = " AND createTime > " + j17;
        } else {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(" ORDER BY createTime DESC LIMIT ");
        sb6.append(i17);
        sb6.append(") ORDER BY createTime ASC");
        return this.f275522r.B(sb6.toString(), null);
    }

    public android.database.Cursor M7(java.lang.String str, long j17, long j18, int i17) {
        try {
            java.lang.String str2 = "SELECT * FROM " + str + " LEFT JOIN DeletedConversationInfo ON " + str + ".talker = DeletedConversationInfo.userName WHERE msgId > ? AND createTime > ? AND (DeletedConversationInfo.reserved2 IS NULL OR createTime > DeletedConversationInfo.reserved2) ORDER BY msgId ASC";
            if (i17 >= 0) {
                str2 = str2 + " LIMIT ?";
            }
            return this.f275522r.o(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea, str2, i17 >= 0 ? new java.lang.String[]{java.lang.String.valueOf(j17), java.lang.String.valueOf(j18), java.lang.String.valueOf(i17)} : new java.lang.String[]{java.lang.String.valueOf(j17), java.lang.String.valueOf(j18)}, str, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgInfoStorage", e17, "Cannot get message cursor.", new java.lang.Object[0]);
            return null;
        }
    }

    public long M9(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        long N9 = N9(f9Var, false);
        if (N9 < 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6377x3369aa22 c6377x3369aa22 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6377x3369aa22();
            c6377x3369aa22.f137235e = f9Var.I0();
            c6377x3369aa22.f137234d = f9Var.mo78013xfb85f7b0();
            c6377x3369aa22.f137237g = 1000 - this.f275524t;
            c6377x3369aa22.f137236f = c6377x3369aa22.b(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.f7335x31ce7ede, "MsgInfo processAddMsg insert db error", true);
            c6377x3369aa22.k();
        }
        return N9;
    }

    public int Mb(java.lang.String str) {
        int p17;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("status", (java.lang.Integer) 4);
        boolean Pb = Pb(X8(str));
        l75.k0 db6 = this.f275522r;
        if (Pb) {
            up5.w wVar = new up5.w();
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] l17 = g95.e0.l(wVar, contentValues);
            java.lang.String tableName = X8(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
            try {
                com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae m106824x752de218 = ot0.d3.a(db6).m106824x752de218(tableName, up5.i.f511503b);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106824x752de218, "getTable(...)");
                if (l17 == null) {
                    l17 = up5.i.a();
                }
                m106824x752de218.m107179xc0204d68((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) wVar, (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae>[]) l17, up5.i.f511511j.eq(str).and(up5.i.f511508g.eq(0).and(up5.i.f511507f.eq(4))));
                p17 = 1;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "updateUnreadByTalker failed: " + th6.getMessage());
                p17 = 0;
            }
        } else {
            p17 = db6.p(X8(str), contentValues, Z8(str) + "AND isSend=? AND status!=? ", new java.lang.String[]{"0", "4"});
        }
        if (p17 != 0) {
            m145262xf35bbb4();
            m0(new xg3.l0(str, "update", null, 0));
        }
        return p17;
    }

    public int N3(final java.lang.String str) {
        final java.lang.String X8 = X8(str);
        final java.lang.String str2 = "3,39,13";
        if (Da(X8)) {
            return ot0.c3.l().d("getImgMsgCount", new yz5.a(X8, str, str2) { // from class: com.tencent.mm.storage.g9$$i8

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f275879e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f275880f;

                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.Integer.valueOf(ot0.z2.f430355a.d0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, this.f275879e, this.f275880f, "3,39,13"));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$j8
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT COUNT(*) FROM ");
                    sb6.append(X8);
                    sb6.append(" WHERE talker= '");
                    java.lang.String str3 = str;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str3);
                    sb6.append(str3);
                    sb6.append("' AND type IN (3,39,13)");
                    android.database.Cursor f17 = g9Var.f275522r.f(sb6.toString(), null, 2);
                    int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
                    f17.close();
                    return java.lang.Integer.valueOf(i17);
                }
            });
        }
        boolean Pb = Pb(X8);
        l75.k0 k0Var = this.f275522r;
        if (Pb) {
            return ot0.z2.f430355a.d0(k0Var, X8, str, "3,39,13");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT COUNT(*) FROM ");
        sb6.append(X8);
        sb6.append(" WHERE talker= '");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("' AND type IN (3,39,13)");
        android.database.Cursor f17 = k0Var.f(sb6.toString(), null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i17;
    }

    public android.database.Cursor N6(final java.lang.String str, final int i17, final long j17, final long j18) {
        java.lang.String str2;
        final java.lang.String X8 = X8(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "getMsgBeforeTimeCursor talk:%s limitCount:%d", str, java.lang.Integer.valueOf(i17));
        if (Da(X8)) {
            return ot0.c3.l().c("getMsgBeforeTimeCursor", new yz5.a() { // from class: com.tencent.mm.storage.g9$$c1
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.Q0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, i17, j17, j18);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$e1
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str3;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT * FROM ( SELECT * FROM ");
                    sb6.append(X8);
                    sb6.append(" WHERE");
                    sb6.append(g9Var.Z8(str));
                    long j19 = j17;
                    java.lang.String str4 = "";
                    if (j19 > 0) {
                        str3 = " AND createTime > " + j19;
                    } else {
                        str3 = "";
                    }
                    sb6.append(str3);
                    long j27 = j18;
                    if (j27 > 0) {
                        str4 = " AND createTime <= " + j27;
                    }
                    sb6.append(str4);
                    sb6.append(" ORDER BY createTime DESC LIMIT ");
                    sb6.append(i17);
                    sb6.append(") ORDER BY createTime ASC");
                    return g9Var.f275522r.B(sb6.toString(), null);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.Q0(this.f275522r, X8, str, i17, j17, j18);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT * FROM ( SELECT * FROM ");
        sb6.append(X8);
        sb6.append(" WHERE");
        sb6.append(Z8(str));
        java.lang.String str3 = "";
        if (j17 > 0) {
            str2 = " AND createTime > " + j17;
        } else {
            str2 = "";
        }
        sb6.append(str2);
        if (j18 > 0) {
            str3 = " AND createTime <= " + j18;
        }
        sb6.append(str3);
        sb6.append(" ORDER BY createTime DESC LIMIT ");
        sb6.append(i17);
        sb6.append(") ORDER BY createTime ASC");
        return this.f275522r.B(sb6.toString(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long N9(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.g9.N9(com.tencent.mm.storage.f9, boolean):long");
    }

    public void Na(l75.k0 k0Var, java.lang.String str) {
        long j17;
        android.database.Cursor f17 = k0Var.f("PRAGMA table_info( " + str + " )", null, 2);
        int columnIndex = f17.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z27 = false;
        boolean z28 = false;
        boolean z29 = false;
        boolean z37 = false;
        boolean z38 = false;
        boolean z39 = false;
        boolean z47 = false;
        boolean z48 = false;
        while (f17.moveToNext()) {
            if (columnIndex >= 0) {
                java.lang.String string = f17.getString(columnIndex);
                int i17 = columnIndex;
                if ("lvbuffer".equalsIgnoreCase(string)) {
                    z17 = true;
                } else if ("transContent".equalsIgnoreCase(string)) {
                    z18 = true;
                } else if ("transBrandWording".equalsIgnoreCase(string)) {
                    z19 = true;
                } else if ("talkerId".equalsIgnoreCase(string)) {
                    z27 = true;
                } else if ("bizClientMsgId".equalsIgnoreCase(string)) {
                    z28 = true;
                } else if ("bizChatId".equalsIgnoreCase(string)) {
                    z29 = true;
                } else if ("bizChatUserId".equalsIgnoreCase(string)) {
                    z37 = true;
                } else if ("msgSeq".equalsIgnoreCase(string)) {
                    z38 = true;
                } else if ("flag".equalsIgnoreCase(string)) {
                    z39 = true;
                } else if ("solitaireFoldInfo".equalsIgnoreCase(string)) {
                    z47 = true;
                } else if ("historyId".equalsIgnoreCase(string)) {
                    z48 = true;
                }
                columnIndex = i17;
            }
        }
        f17.close();
        long F = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (z17) {
            j17 = F;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Alter table ");
            sb6.append(str);
            j17 = F;
            sb6.append(" add lvbuffer BLOB ");
            k0Var.A(str, sb6.toString());
        }
        if (!z18) {
            k0Var.A(str, "Alter table " + str + " add transContent TEXT ");
        }
        if (!z19) {
            k0Var.A(str, "Alter table " + str + " add transBrandWording TEXT ");
        }
        if (!z27) {
            k0Var.A(str, "Alter table " + str + " add talkerId INTEGER ");
        }
        if (!z28) {
            k0Var.A(str, "Alter table " + str + " add bizClientMsgId TEXT ");
        }
        if (!z29) {
            k0Var.A(str, "Alter table " + str + " add bizChatId INTEGER DEFAULT -1");
        }
        if (!z37) {
            k0Var.A(str, "Alter table " + str + " add bizChatUserId TEXT ");
        }
        if (!z38) {
            k0Var.A(str, "Alter table " + str + " add msgSeq INTEGER ");
        }
        if (!z39) {
            k0Var.A(str, "Alter table " + str + " add flag INT DEFAULT 0 ");
        }
        if (!z47) {
            k0Var.A(str, "Alter table " + str + " add solitaireFoldInfo BLOB ");
        }
        if (!z48) {
            k0Var.A(str, "Alter table " + str + " add historyId TEXT ");
        }
        k0Var.w(java.lang.Long.valueOf(j17));
    }

    public long O2(java.lang.String str) {
        xg3.k0 J8;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (J8 = J8(str)) == null) {
            return 0L;
        }
        return J8.f535938a;
    }

    public final java.lang.Integer[] O3() {
        return new java.lang.Integer[]{3, 39, 13};
    }

    public final java.lang.String P0(long j17) {
        if (j17 <= 0) {
            return "";
        }
        return " createTime > " + j17 + " AND ";
    }

    public int P1() {
        if (Da(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
            return ot0.c3.l().b("getAllMsgCount", new yz5.a() { // from class: com.tencent.mm.storage.g9$$d2
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.Integer.valueOf(ot0.z2.f430355a.r(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$e2
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    android.database.Cursor f17 = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r.f("SELECT COUNT(msgId) FROM message", null, 2);
                    if (f17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "get count error, cursor is null");
                        return 0;
                    }
                    if (!f17.moveToFirst()) {
                        f17.close();
                        return 0;
                    }
                    int i17 = f17.getInt(0);
                    f17.close();
                    return java.lang.Integer.valueOf(i17);
                }
            });
        }
        boolean Pb = Pb(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
        l75.k0 k0Var = this.f275522r;
        if (Pb) {
            return ot0.z2.f430355a.r(k0Var, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
        }
        android.database.Cursor f17 = k0Var.f("SELECT COUNT(msgId) FROM message", null, 2);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "get count error, cursor is null");
            return 0;
        }
        if (!f17.moveToFirst()) {
            f17.close();
            return 0;
        }
        int i17 = f17.getInt(0);
        f17.close();
        return i17;
    }

    public java.lang.String P8(long j17, java.lang.String str) {
        if (j17 != 0 && j17 != -1) {
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.J4(str)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9.L1(j17);
                int i17 = 0;
                while (true) {
                    java.util.List list = this.f275514g;
                    if (i17 >= ((java.util.LinkedList) list).size()) {
                        iz5.a.g(java.lang.String.format("getTableNameByLocalId failed:%d", java.lang.Long.valueOf(j17)), false);
                        break;
                    }
                    if (((xg3.k0) ((java.util.LinkedList) list).get(i17)).c(j17)) {
                        return ((xg3.k0) ((java.util.LinkedList) list).get(i17)).f535941d;
                    }
                    i17++;
                }
            } else {
                return X8(str);
            }
        }
        return null;
    }

    public void Pa(java.lang.String str) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f275527w);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(super.m145263xc7051ea4());
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(this.f275525u.f398503a);
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(((java.util.HashMap) this.f275526v).size());
        java.lang.String str2 = this.f275528x;
        long j17 = this.f275529y;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "unlockForSync tag:%s islock:%b lockCnt[%d,%d] notifyCnt:%d last:[%s,%d]", str, valueOf, valueOf2, valueOf3, valueOf4, str2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            iz5.a.g("lockForSync, do not call me by null tag.", false);
        }
        if (!this.f275527w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "unlockForSync, No one Locking Now , why this tag:%s call it ! [%s]", str, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            return;
        }
        if (!str.equals(this.f275528x)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "unlockForSync locking[%s] diff:%d, but unlock[%s] , Ignore this call.", this.f275528x, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f275529y), str);
            return;
        }
        this.f275527w = false;
        this.f275529y = 0L;
        this.f275528x = "";
        synchronized (this.f275526v) {
            java.util.Iterator it = ((java.util.HashMap) this.f275526v).keySet().iterator();
            while (it.hasNext()) {
                m0((xg3.l0) ((java.util.HashMap) this.f275526v).get((java.lang.String) it.next()));
            }
            ((java.util.HashMap) this.f275526v).clear();
        }
        super.mo78028xcde7df44();
        l75.v0 v0Var = this.f275525u;
        int i17 = v0Var.f398503a - 1;
        v0Var.f398503a = i17;
        if (i17 <= 0) {
            v0Var.f398503a = 0;
            v0Var.e();
        }
        m145262xf35bbb4();
    }

    public final boolean Pb(java.lang.String str) {
        l75.k0 k0Var = this.f275522r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(k0Var, "<this>");
        return k0Var.a() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [ot0.j3] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList] */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9[] Q5(final java.lang.String str, final int i17) {
        java.util.ArrayList arrayList;
        if (str == null || str.isEmpty() || i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getLastMsgList, invalid argument, talker = " + str + ", limit = " + i17);
            return null;
        }
        final java.lang.String X8 = X8(str);
        boolean Da = Da(X8);
        ot0.z2 z2Var = ot0.z2.f430355a;
        l75.k0 k0Var = this.f275522r;
        if (!Da) {
            if (Pb(X8)) {
                return z2Var.x0(k0Var, X8, str, i17);
            }
            android.database.Cursor f17 = k0Var.f("select * from " + X8 + " where" + Z8(str) + "order by createTime DESC limit " + i17, null, 2);
            if (!f17.moveToFirst()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "getLastMsgList, cursor is empty");
                f17.close();
                return null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            do {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var.mo9015xbf5d97fd(f17);
                arrayList2.add(f9Var);
            } while (f17.moveToNext());
            f17.close();
            arrayList2.size();
            java.util.Collections.reverse(arrayList2);
            return (com.p314xaae8f345.mm.p2621x8fb0427b.f9[]) arrayList2.toArray(new com.p314xaae8f345.mm.p2621x8fb0427b.f9[0]);
        }
        ot0.c3 l17 = ot0.c3.l();
        yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.storage.g9$$w4
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                g9Var.getClass();
                android.database.Cursor f18 = g9Var.f275522r.f("select * from " + X8 + " where" + g9Var.Z8(str) + "order by createTime DESC limit " + i17, null, 2);
                if (!f18.moveToFirst()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "getLastMsgList, cursor is empty");
                    f18.close();
                    return null;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                do {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    f9Var2.mo9015xbf5d97fd(f18);
                    arrayList3.add(f9Var2);
                } while (f18.moveToNext());
                f18.close();
                arrayList3.size();
                java.util.Collections.reverse(arrayList3);
                return (com.p314xaae8f345.mm.p2621x8fb0427b.f9[]) arrayList3.toArray(new com.p314xaae8f345.mm.p2621x8fb0427b.f9[0]);
            }
        };
        l17.getClass();
        if (!ot0.l3.a()) {
            return z2Var.x0(k0Var, X8, str, i17);
        }
        try {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9[] f9VarArr = (com.p314xaae8f345.mm.p2621x8fb0427b.f9[]) aVar.mo152xb9724478();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9[] x07 = z2Var.x0(k0Var, X8, str, i17);
            if (l17.j(x07, f9VarArr)) {
                return x07;
            }
            ?? r122 = ot0.k3.f430099d;
            ?? r132 = kz5.p0.f395529d;
            if (x07 != null) {
                arrayList = new java.util.ArrayList(x07.length);
                int length = x07.length;
                int i18 = 0;
                while (i18 < length) {
                    arrayList.add(java.lang.Long.valueOf(x07[i18].m124847x74d37ac6()));
                    i18++;
                    x07 = x07;
                }
            } else {
                arrayList = r132;
            }
            if (f9VarArr != null) {
                r132 = new java.util.ArrayList(f9VarArr.length);
                for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 : f9VarArr) {
                    r132.add(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()));
                }
            }
            throw r122.d("getLastMsgList", arrayList, r132);
        } catch (ot0.k3 e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OrmCorrectnessChecker", "getLastMsgList".concat(": Correctness check failed"), e17);
            l17.m("getLastMsgList", e17);
            return z2Var.x0(k0Var, X8, str, i17);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OrmCorrectnessChecker", "getLastMsgList".concat(": Unexpected error during correctness check"), e18);
            return z2Var.x0(k0Var, X8, str, i17);
        }
    }

    public long Q9(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.Q0())) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = f9Var;
            objArr[1] = f9Var == null ? "-1" : f9Var.Q0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "Error insert message msg:%s talker:%s", objArr);
            return -1L;
        }
        if (this.f275515h == null) {
            this.f275515h = J8(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
        }
        this.f275515h.b(f9Var);
        kk.j jVar = this.f275521q;
        java.lang.Integer num = (java.lang.Integer) ((lt0.f) jVar).get(f9Var.Q0());
        if (num == null) {
            int c96 = (int) c9(f9Var.Q0());
            ((lt0.f) jVar).j(f9Var.Q0(), java.lang.Integer.valueOf(c96));
            f9Var.z1(c96);
        } else {
            f9Var.z1(num.intValue());
        }
        boolean Pb = Pb(this.f275515h.f535941d);
        l75.k0 k0Var = this.f275522r;
        long o17 = Pb ? ot0.z2.f430355a.o1(k0Var, this.f275515h.f535941d, f9Var) : k0Var.l(this.f275515h.f535941d, "msgId", f9Var.mo9763xeb27878e());
        if (o17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "insertForBackupRecover error, id = " + f9Var.m124847x74d37ac6() + ", result = " + o17);
        }
        return f9Var.m124847x74d37ac6();
    }

    public long R9(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.Q0())) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = f9Var;
            objArr[1] = f9Var == null ? "-1" : f9Var.Q0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "Error insert message msg:%s talker:%s", objArr);
            return -1L;
        }
        kk.j jVar = this.f275521q;
        java.lang.Integer num = (java.lang.Integer) ((lt0.f) jVar).get(f9Var.Q0());
        if (num == null) {
            int c96 = (int) c9(f9Var.Q0());
            ((lt0.f) jVar).j(f9Var.Q0(), java.lang.Integer.valueOf(c96));
            f9Var.z1(c96);
        } else {
            f9Var.z1(num.intValue());
        }
        boolean Pb = Pb(this.f275515h.f535941d);
        l75.k0 k0Var = this.f275522r;
        long o17 = Pb ? ot0.z2.f430355a.o1(k0Var, this.f275515h.f535941d, f9Var) : k0Var.l(this.f275515h.f535941d, "msgId", f9Var.mo9763xeb27878e());
        if (o17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "insertForBackupRecover error, id = " + f9Var.m124847x74d37ac6() + ", result = " + o17);
        }
        return f9Var.m124847x74d37ac6();
    }

    public android.database.Cursor S1(long j17, long j18, int[] iArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        long max = java.lang.Math.max(((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(""), j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 : iArr) {
            sb6.append(", count(CASE type WHEN ");
            sb6.append(i17);
            sb6.append(" THEN 1 ELSE NULL END)");
        }
        if (max > 0 || j18 != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
            return this.f275522r.o(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea, "SELECT talker, count(msgId), max(createTime)" + ((java.lang.Object) sb6) + " FROM message INDEXED BY messageCreateTaklerTimeIndex LEFT JOIN DeletedConversationInfo ON message.talker = DeletedConversationInfo.userName WHERE message.createTime > ifnull(DeletedConversationInfo.reserved2, 0) AND message.createTime > ? AND message.createTime < ? GROUP BY talker", new java.lang.String[]{java.lang.String.valueOf(max), java.lang.String.valueOf(j18)}, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, c26987xeef691ab);
        }
        return this.f275522r.o(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea, "SELECT talker, count(msgId), max(createTime)" + ((java.lang.Object) sb6) + " FROM message LEFT JOIN DeletedConversationInfo ON message.talker = DeletedConversationInfo.userName WHERE message.createTime > ifnull(DeletedConversationInfo.reserved2, 0) GROUP BY talker", null, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, c26987xeef691ab);
    }

    public int S3(final java.lang.String str) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "getImgVideoAlbumMsgCount talker is null!");
            return 0;
        }
        final java.lang.String X8 = X8(str);
        final java.util.List y47 = y4();
        final long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
        if (Da(X8)) {
            return ot0.c3.l().d("getImgVideoAlbumMsgCount", new yz5.a() { // from class: com.tencent.mm.storage.g9$$a1
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.Integer.valueOf(ot0.z2.f430355a.g0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, y47, m07));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$b1
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT COUNT(*) FROM ");
                    java.lang.String str2 = X8;
                    sb6.append(str2);
                    sb6.append(" ");
                    sb6.append(g9Var.V3(str2));
                    sb6.append(" WHERE ");
                    sb6.append(g9Var.P0(m07));
                    sb6.append(g9Var.Z8(str));
                    sb6.append("AND type IN (3,39,13,43,62,44,268435505,486539313)");
                    android.database.Cursor f17 = g9Var.f275522r.f(sb6.toString(), null, 2);
                    int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
                    f17.close();
                    return java.lang.Integer.valueOf(i17);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.g0(this.f275522r, X8, str, y47, m07);
        }
        android.database.Cursor f17 = this.f275522r.f("SELECT COUNT(*) FROM " + X8 + " " + V3(X8) + " WHERE " + P0(m07) + Z8(str) + "AND type IN (3,39,13,43,62,44,268435505,486539313)", null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i17;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 S6(final java.lang.String str, final int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        final java.lang.String X8 = X8(str);
        final long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
        if (Da(X8)) {
            return ot0.c3.l().g("getMsgByOffset", new yz5.a() { // from class: com.tencent.mm.storage.g9$$v7
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.R0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, m07, i17);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$w7
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    android.database.Cursor f17 = g9Var.f275522r.f("select * from " + X8 + " where" + g9Var.P0(m07) + g9Var.Z8(str) + "order by createTime DESC limit " + i17 + ",1", null, 2);
                    if (f17.moveToFirst()) {
                        f9Var.mo9015xbf5d97fd(f17);
                    }
                    f17.close();
                    return f9Var;
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.R0(this.f275522r, X8, str, m07, i17);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        android.database.Cursor f17 = this.f275522r.f("select * from " + X8 + " where" + P0(m07) + Z8(str) + "order by createTime DESC limit " + i17 + ",1", null, 2);
        if (f17.moveToFirst()) {
            f9Var.mo9015xbf5d97fd(f17);
        }
        f17.close();
        return f9Var;
    }

    public int T1(java.lang.String str, int[] iArr) {
        if (str == null || str.length() == 0 || iArr == null || iArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getAppMsgCountByTypes fail, argument is invalid");
            return 0;
        }
        java.lang.String X8 = X8(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 : iArr) {
            if (sb6.length() > 0) {
                sb6.append(",");
            }
            sb6.append(i17);
        }
        android.database.Cursor B = this.f275522r.B("select count(*) from " + X8 + " where" + W0(str) + Z8(str) + " AND type IN (" + ((java.lang.Object) sb6) + ")", null);
        if (B != null) {
            try {
                r0 = B.moveToFirst() ? B.getInt(0) : 0;
            } finally {
                B.close();
            }
        }
        return r0;
    }

    public android.database.Cursor T7(final java.lang.String str, final int i17, final int i18) {
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().c("getMsgIsNotReadedByTalkerAndTypeWithLimit", new yz5.a() { // from class: com.tencent.mm.storage.g9$$k6
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.c1(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, i17, i18);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$v6
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str2 = X8;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    return g9Var.f275522r.E(str2, null, "isSend=? AND" + g9Var.Z8(str) + "AND status!=? AND type=? order by msgId DESC limit " + i18, new java.lang.String[]{"0", "6", "" + i17}, null, null, null);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.c1(this.f275522r, X8, str, i17, i18);
        }
        return this.f275522r.E(X8, null, "isSend=? AND" + Z8(str) + "AND status!=? AND type=? order by msgId DESC limit " + i18, new java.lang.String[]{"0", "6", "" + i17}, null, null, null);
    }

    public android.database.Cursor V2(java.lang.String talker, long j17, long j18) {
        if (j18 < j17) {
            j17 = j18;
            j18 = j17;
        }
        boolean Pb = Pb(X8(talker));
        l75.k0 db6 = this.f275522r;
        if (!Pb) {
            return db6.B("SELECT * FROM " + X8(talker) + " WHERE" + Z8(talker) + "AND createTime >= " + j17 + " AND createTime <= " + j18 + " ORDER BY createTime ASC ", null);
        }
        java.lang.String TableNameByTalker = X8(talker);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TableNameByTalker, "TableNameByTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae m106824x752de218 = ot0.d3.a(db6).m106824x752de218(TableNameByTalker, up5.i.f511503b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106824x752de218, "getTable(...)");
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106435xc9ff34fc = m106824x752de218.m107164x47380ce3().m106435xc9ff34fc((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = up5.i.f511511j.eq(talker);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c m106433xb80cf445 = m106435xc9ff34fc.m106436x6bdbce7(eq6.and(c26981x40bb0da.ge(j17)).and(c26981x40bb0da.le(j18))).m106433xb80cf445(c26981x40bb0da.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106433xb80cf445, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), m106433xb80cf445.m106402x83249ab9(), null, null);
    }

    public java.lang.String V3(java.lang.String str) {
        return (str == null || !str.equals(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) ? "" : "INDEXED BY messageCreateTaklerTypeTimeIndex";
    }

    public long V5(final java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0L;
        }
        if (Da(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
            return ot0.c3.l().f("getLastMsgSeq", new yz5.a() { // from class: com.tencent.mm.storage.g9$$n4
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.Long.valueOf(ot0.z2.f430355a.y0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, str));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$p4
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select msgSeq from message where");
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    java.lang.String str2 = str;
                    sb6.append(g9Var.Z8(str2));
                    sb6.append("order by msgSeq DESC LIMIT 1 ");
                    java.lang.String sb7 = sb6.toString();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "get last message msgseq: " + sb7);
                    android.database.Cursor f17 = g9Var.f275522r.f(sb7, null, 2);
                    if (f17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "get last message msgseq failed " + str2);
                        return 0L;
                    }
                    if (!f17.moveToFirst()) {
                        f17.close();
                        return 0L;
                    }
                    long j17 = f17.getLong(0);
                    f17.close();
                    return java.lang.Long.valueOf(j17);
                }
            });
        }
        boolean Pb = Pb(X8(str));
        l75.k0 k0Var = this.f275522r;
        if (Pb) {
            return ot0.z2.f430355a.y0(k0Var, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, str);
        }
        java.lang.String str2 = "select msgSeq from message where" + Z8(str) + "order by msgSeq DESC LIMIT 1 ";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "get last message msgseq: " + str2);
        android.database.Cursor f17 = k0Var.f(str2, null, 2);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "get last message msgseq failed " + str);
            return 0L;
        }
        if (!f17.moveToFirst()) {
            f17.close();
            return 0L;
        }
        long j17 = f17.getLong(0);
        f17.close();
        return j17;
    }

    public java.lang.String W0(java.lang.String str) {
        long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
        if (m07 <= 0) {
            return "";
        }
        return " createTime > " + m07 + " AND ";
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 W5(final java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().g("getLastRecivedMsg", new yz5.a() { // from class: com.tencent.mm.storage.g9$$e8
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.C0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$f8
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    android.database.Cursor f17 = g9Var.f275522r.f("select * from " + X8 + " where" + g9Var.Z8(str) + "and isSend = 0  order by createTime DESC limit 1", null, 2);
                    if (f17.moveToFirst()) {
                        f9Var.mo9015xbf5d97fd(f17);
                    }
                    f17.close();
                    return f9Var;
                }
            });
        }
        boolean Pb = Pb(X8);
        l75.k0 k0Var = this.f275522r;
        if (Pb) {
            return ot0.z2.f430355a.C0(k0Var, X8, str);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        android.database.Cursor f17 = k0Var.f("select * from " + X8 + " where" + Z8(str) + "and isSend = 0  order by createTime DESC limit 1", null, 2);
        if (f17.moveToFirst()) {
            f9Var.mo9015xbf5d97fd(f17);
        }
        f17.close();
        return f9Var;
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00ae: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:28:0x00ae */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List X1(final java.lang.String r20, final long r21, final long r23) {
        /*
            r19 = this;
            r9 = r19
            java.lang.String r0 = " AND createTime>? AND createTime<=? "
            java.lang.String r11 = r19.X8(r20)
            boolean r1 = r9.Da(r11)
            if (r1 == 0) goto L2e
            ot0.c3 r0 = ot0.c3.l()
            com.tencent.mm.storage.g9$$s1 r10 = new com.tencent.mm.storage.g9$$s1
            r1 = r10
            r2 = r19
            r3 = r11
            r4 = r20
            r5 = r21
            r7 = r23
            r1.<init>()
            com.tencent.mm.storage.g9$$t1 r12 = new com.tencent.mm.storage.g9$$t1
            r1 = r12
            r1.<init>()
            java.lang.String r1 = "getAppMsgList"
            java.util.List r0 = r0.e(r1, r10, r12)
            return r0
        L2e:
            boolean r1 = r9.Pb(r11)
            if (r1 == 0) goto L44
            ot0.z2 r1 = ot0.z2.f430355a
            l75.k0 r2 = r9.f275522r
            r3 = r11
            r4 = r20
            r5 = r21
            r7 = r23
            java.util.List r0 = r1.u(r2, r3, r4, r5, r7)
            return r0
        L44:
            r1 = 0
            r2 = 1
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            r4.<init>()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            l75.k0 r10 = r9.f275522r     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            r12 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            r5.<init>()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.String r6 = r19.Z8(r20)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            r5.append(r6)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            r5.append(r0)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.String r13 = r5.toString()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.String r0 = java.lang.String.valueOf(r21)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            r14[r1] = r0     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.String r0 = java.lang.String.valueOf(r23)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            r14[r2] = r0     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            r15 = 0
            r16 = 0
            java.lang.String r17 = "createTime DESC"
            r18 = 2
            android.database.Cursor r5 = r10.D(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
        L7c:
            boolean r0 = r5.moveToNext()     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lad
            if (r0 == 0) goto L8e
            com.tencent.mm.storage.f9 r0 = new com.tencent.mm.storage.f9     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lad
            r0.<init>()     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lad
            r0.mo9015xbf5d97fd(r5)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lad
            r4.add(r0)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lad
            goto L7c
        L8e:
            r5.close()
            return r4
        L92:
            r0 = move-exception
            goto L98
        L94:
            r0 = move-exception
            goto Laf
        L96:
            r0 = move-exception
            r5 = r3
        L98:
            java.lang.String r4 = "MicroMsg.MsgInfoStorage"
            java.lang.String r6 = "getAppMsgList error: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lad
            java.lang.String r7 = r0.getMessage()     // Catch: java.lang.Throwable -> Lad
            r2[r1] = r7     // Catch: java.lang.Throwable -> Lad
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r0, r6, r2)     // Catch: java.lang.Throwable -> Lad
            if (r5 == 0) goto Lac
            r5.close()
        Lac:
            return r3
        Lad:
            r0 = move-exception
            r3 = r5
        Laf:
            if (r3 == 0) goto Lb4
            r3.close()
        Lb4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.g9.X1(java.lang.String, long, long):java.util.List");
    }

    public java.lang.String X8(java.lang.String str) {
        iz5.a.g("username == null", str != null && str.length() > 0);
        return L8(str).f535941d;
    }

    public boolean X9(long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.w4 w4Var = this.f275523s;
        if (w4Var.b()) {
            w4Var.c();
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.v4 v4Var = w4Var.f277840a;
        return v4Var.f277814h.contains(java.lang.Long.valueOf(j17)) || v4Var.f277815i.contains(java.lang.Long.valueOf(j17)) || v4Var.f277816m.contains(java.lang.Long.valueOf(j17));
    }

    public android.database.Cursor Y2(final java.lang.String str, final int i17, final long j17) {
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().c("getCursorLimit", new yz5.a() { // from class: com.tencent.mm.storage.g9$$q6
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.T(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, i17, j17);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$r6
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    return g9Var.f275522r.B("SELECT * FROM " + X8 + " WHERE" + g9Var.Z8(str) + " AND createTime <= " + j17 + " order by createTime ASC limit " + i17, null);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.T(this.f275522r, X8, str, i17, j17);
        }
        return this.f275522r.B("SELECT * FROM " + X8 + " WHERE" + Z8(str) + " AND createTime <= " + j17 + " order by createTime ASC limit " + i17, null);
    }

    public long Y7(final java.lang.String str, final long j17) {
        if (Da(str)) {
            return ot0.c3.l().f("getMsgLocalIdByMsgSvrId", new yz5.a() { // from class: com.tencent.mm.storage.g9$$k8
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.Long.valueOf(ot0.z2.f430355a.d1(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, str, j17));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$l8
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    android.database.Cursor E = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r.E(str, new java.lang.String[]{"msgId"}, "msgSvrId=" + j17, null, null, null, null);
                    E.moveToFirst();
                    long j18 = E.getLong(0);
                    E.close();
                    return java.lang.Long.valueOf(j18);
                }
            });
        }
        if (Pb(str)) {
            return ot0.z2.f430355a.d1(this.f275522r, str, j17);
        }
        android.database.Cursor E = this.f275522r.E(str, new java.lang.String[]{"msgId"}, "msgSvrId=" + j17, null, null, null, null);
        E.moveToFirst();
        long j18 = E.getLong(0);
        E.close();
        return j18;
    }

    public java.util.List Z5(final java.lang.String str, final int i17) {
        iz5.a.g(null, this.f275514g != null);
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().e("getLastRecvMsg", new yz5.a() { // from class: com.tencent.mm.storage.g9$$o5
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.util.List u07 = ot0.z2.f430355a.u0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, 0, i17);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = ((java.util.ArrayList) u07).iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                        if (f9Var.b3() || f9Var.H2() || f9Var.T2()) {
                            arrayList.add(f9Var);
                        }
                    }
                    return arrayList;
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$z5
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    android.database.Cursor f17 = g9Var.f275522r.f("SELECT * FROM " + X8 + " WHERE" + g9Var.Z8(str) + "AND isSend = 0 ORDER BY createTime DESC LIMIT " + i17, null, 2);
                    while (f17.moveToNext()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                        f9Var.mo9015xbf5d97fd(f17);
                        if (f9Var.b3() || f9Var.H2() || f9Var.T2()) {
                            arrayList.add(f9Var);
                        }
                    }
                    f17.close();
                    return new java.util.ArrayList(arrayList);
                }
            });
        }
        if (Pb(X8)) {
            java.util.List u07 = ot0.z2.f430355a.u0(this.f275522r, X8, str, 0, i17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) u07).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                if (f9Var.b3() || f9Var.H2() || f9Var.T2()) {
                    arrayList.add(f9Var);
                }
            }
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.database.Cursor f17 = this.f275522r.f("SELECT * FROM " + X8 + " WHERE" + Z8(str) + "AND isSend = 0 ORDER BY createTime DESC LIMIT " + i17, null, 2);
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var2.mo9015xbf5d97fd(f17);
            if (f9Var2.b3() || f9Var2.H2() || f9Var2.T2()) {
                arrayList2.add(f9Var2);
            }
        }
        f17.close();
        return arrayList2;
    }

    public java.lang.String Z8(java.lang.String str) {
        X8(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" talker= '");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("' ");
        return sb6.toString();
    }

    public void aa(java.lang.String str) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f275527w);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(super.m145263xc7051ea4());
        l75.v0 v0Var = this.f275525u;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(v0Var.f398503a);
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(((java.util.HashMap) this.f275526v).size());
        java.lang.String str2 = this.f275528x;
        long j17 = this.f275529y;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "lockForSync tag:%s islock:%b lockCnt[%d,%d] notifyCnt:%d last:[%s,%d]", str, valueOf, valueOf2, valueOf3, valueOf4, str2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            iz5.a.g("lockForSync, do not call me by null tag.", false);
        }
        if (this.f275527w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "lockForSync, has been locked by :%s  time:%d", this.f275528x, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f275529y));
        } else {
            this.f275528x = str;
            this.f275529y = java.lang.System.currentTimeMillis();
            this.f275527w = true;
            super.mo78027x32c52b();
            v0Var.f398503a++;
        }
    }

    public android.database.Cursor b1(final java.lang.String str, final int i17, final int i18) {
        if (str == null || str.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
            return null;
        }
        final java.lang.String X8 = X8(str);
        final long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
        if (Da(X8)) {
            return ot0.c3.l().c("getAllAppMsg", new yz5.a() { // from class: com.tencent.mm.storage.g9$$c0
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.e(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, java.util.Arrays.asList(49), m07, i17, i18);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$d0
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    java.lang.String sql = "select * from " + X8 + " where" + g9Var.P0(m07) + g9Var.Z8(str) + " AND type & 65535 = 49  order by createTime DESC limit " + i18 + " OFFSET " + i17;
                    l75.k0 db6 = g9Var.f275522r;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
                    return tp5.a.g(ot0.d3.a(db6), sql, null, null);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.e(this.f275522r, X8, str, java.util.Arrays.asList(49), m07, i17, i18);
        }
        return this.f275522r.B("select * from " + X8 + " where" + P0(m07) + Z8(str) + " AND type & 65535 = 49  order by createTime DESC limit " + i18 + " OFFSET " + i17, null);
    }

    public java.util.LinkedList b2(final java.lang.String str, final java.lang.String str2) {
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            java.util.List e17 = ot0.c3.l().e("getByBizClientMsgId", new yz5.a() { // from class: com.tencent.mm.storage.g9$$m8
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return new java.util.ArrayList(ot0.z2.f430355a.y(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, str2));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$b
                /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
                
                    if (r0 == null) goto L21;
                 */
                @Override // yz5.a
                /* renamed from: invoke */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object mo152xb9724478() {
                    /*
                        r9 = this;
                        java.lang.String r1 = r2
                        com.tencent.mm.storage.g9 r0 = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this
                        l75.k0 r0 = r0.f275522r
                        r2 = 0
                        java.lang.String r3 = "talker=? AND bizClientMsgId=?"
                        java.lang.String r4 = r3
                        java.lang.String r5 = r4
                        java.lang.String[] r4 = new java.lang.String[]{r4, r5}
                        r5 = 0
                        r6 = 0
                        r7 = 0
                        r8 = 2
                        android.database.Cursor r0 = r0.D(r1, r2, r3, r4, r5, r6, r7, r8)
                        java.lang.String r1 = "MicroMsg.MsgInfoStorage"
                        if (r0 == 0) goto L3f
                        boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
                        if (r2 != 0) goto L25
                        goto L3f
                    L25:
                        java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
                        r2.<init>()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
                    L2a:
                        com.tencent.mm.storage.f9 r3 = new com.tencent.mm.storage.f9     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
                        r3.<init>()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
                        r3.mo9015xbf5d97fd(r0)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
                        r2.add(r3)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
                        boolean r3 = r0.moveToNext()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
                        if (r3 != 0) goto L2a
                        r0.close()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
                        goto L64
                    L3f:
                        java.lang.String r2 = "getByBizClientMsgId fail"
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r2)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
                        if (r0 == 0) goto L49
                        r0.close()
                    L49:
                        r0 = 0
                        goto L68
                    L4b:
                        r1 = move-exception
                        goto L69
                    L4d:
                        r2 = move-exception
                        java.lang.String r3 = "getLastDayC2CMsgByTalker error: %s"
                        r4 = 1
                        java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L4b
                        java.lang.String r5 = r2.getMessage()     // Catch: java.lang.Throwable -> L4b
                        r6 = 0
                        r4[r6] = r5     // Catch: java.lang.Throwable -> L4b
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L4b
                        java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4b
                        r2.<init>()     // Catch: java.lang.Throwable -> L4b
                        if (r0 == 0) goto L67
                    L64:
                        r0.close()
                    L67:
                        r0 = r2
                    L68:
                        return r0
                    L69:
                        if (r0 == 0) goto L6e
                        r0.close()
                    L6e:
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.C21066x5c5e9f0.mo152xb9724478():java.lang.Object");
                }
            });
            if (e17 != null) {
                return new java.util.LinkedList(e17);
            }
            return null;
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.y(this.f275522r, X8, str, str2);
        }
        android.database.Cursor D = this.f275522r.D(X8, null, "talker=? AND bizClientMsgId=?", new java.lang.String[]{str, str2}, null, null, null, 2);
        try {
            if (D != null) {
                try {
                    if (D.moveToFirst()) {
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        do {
                            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                            f9Var.mo9015xbf5d97fd(D);
                            linkedList.add(f9Var);
                        } while (D.moveToNext());
                        D.close();
                        D.close();
                        return linkedList;
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgInfoStorage", e18, "getLastDayC2CMsgByTalker error: %s", e18.getMessage());
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    if (D != null) {
                        D.close();
                    }
                    return linkedList2;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getByBizClientMsgId fail");
            if (D != null) {
                D.close();
            }
            return null;
        } catch (java.lang.Throwable th6) {
            if (D != null) {
                D.close();
            }
            throw th6;
        }
    }

    public android.database.Cursor b3(final java.lang.String str) {
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().c("getCursorUnread", new yz5.a() { // from class: com.tencent.mm.storage.g9$$c8
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.U(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$n8
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str2 = X8;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    return g9Var.f275522r.E(str2, null, "isSend=? AND" + g9Var.Z8(str) + "AND status!=?", new java.lang.String[]{"0", "4"}, null, null, null);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.U(this.f275522r, X8, str);
        }
        return this.f275522r.E(X8, null, "isSend=? AND" + Z8(str) + "AND status!=?", new java.lang.String[]{"0", "4"}, null, null, null);
    }

    public android.database.Cursor b5(final java.lang.String str, final java.lang.String str2, final int i17) {
        final java.lang.String X8 = X8(str);
        final long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
        if (Da(X8)) {
            return ot0.c3.l().c("getInitCursorByMember", new yz5.a() { // from class: com.tencent.mm.storage.g9$$u3
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.l0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, m07, str2, i17);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$v3
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    return g9Var.f275522r.B(" SELECT * FROM " + X8 + " WHERE" + g9Var.P0(m07) + g9Var.Z8(str) + "AND content LIKE '" + str2 + "%' ORDER BY createTime DESC LIMIT " + i17, null);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.l0(this.f275522r, X8, str, m07, str2, i17);
        }
        return this.f275522r.B(" SELECT * FROM " + X8 + " WHERE" + P0(m07) + Z8(str) + "AND content LIKE '" + str2 + "%' ORDER BY createTime DESC LIMIT " + i17, null);
    }

    public android.database.Cursor b7(final java.lang.String str, final java.lang.String[] strArr, final int i17) {
        if (Da(str)) {
            return ot0.c3.l().c("getMsgByTypeForSomeCols", new yz5.a() { // from class: com.tencent.mm.storage.g9$$d7
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.T0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, str, strArr, i17);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$e7
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str2 = str;
                    java.lang.String[] strArr2 = strArr;
                    return com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r.E(str2, strArr2, "type=" + i17, null, null, null, null);
                }
            });
        }
        if (Pb(str)) {
            return ot0.z2.f430355a.T0(this.f275522r, str, strArr, i17);
        }
        return this.f275522r.E(str, strArr, "type=" + i17, null, null, null, null);
    }

    public int bb(long j17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return lb(j17, f9Var, true);
    }

    public android.database.Cursor c5(final java.lang.String str, final int i17) {
        final java.lang.String X8 = X8(str);
        final long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
        if (Da(X8)) {
            return ot0.c3.l().c("getInitCursorBySelf", new yz5.a() { // from class: com.tencent.mm.storage.g9$$d3
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.m0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, m07, i17);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$e3
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    return g9Var.f275522r.B(" SELECT * FROM " + X8 + " WHERE" + g9Var.P0(m07) + g9Var.Z8(str) + "AND isSend=1 ORDER BY createTime DESC LIMIT " + i17, null);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.m0(this.f275522r, X8, str, m07, i17);
        }
        return this.f275522r.B(" SELECT * FROM " + X8 + " WHERE" + P0(m07) + Z8(str) + "AND isSend=1 ORDER BY createTime DESC LIMIT " + i17, null);
    }

    public java.util.List c6(int i17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i18 = 0;
        while (true) {
            java.util.List list = this.f275514g;
            if (i18 >= ((java.util.LinkedList) list).size()) {
                return d6(i17, linkedList);
            }
            java.lang.String str = ((xg3.k0) ((java.util.LinkedList) list).get(i18)).f535941d;
            if (!str.startsWith("findermessage") && !str.equalsIgnoreCase("gamelifemessage")) {
                linkedList.add((xg3.k0) ((java.util.LinkedList) list).get(i18));
            }
            i18++;
        }
    }

    public long c9(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.e8 e8Var = this.f275512e;
        long u17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) e8Var).u(str);
        boolean z17 = u17 < 0;
        if (z17 && !c01.e2.L(str) && !c01.e2.O(str)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(str);
            z3Var.mo43621x7650bebc(2);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) e8Var).h0(z3Var);
            u17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) e8Var).u(str);
        }
        if (!z65.c.f551991d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "getTalkerIdByTalkerName:%s id:%s needinsert:%s [%s]", str, java.lang.Long.valueOf(u17), java.lang.Boolean.valueOf(z17), "");
        }
        return u17;
    }

    public void ca(java.lang.String str, long j17) {
        xg3.k0 L8 = L8(str);
        long j18 = L8.f535938a;
        java.util.Random random = new java.util.Random();
        l75.k0 k0Var = this.f275522r;
        k0Var.A(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "BEGIN;");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9(str);
        int i17 = 0;
        while (i17 < j17) {
            int i18 = i17;
            f9Var.e1(java.lang.System.currentTimeMillis());
            f9Var.m124850x7650bebc(1);
            f9Var.d1("纵观目前国内手游市场，大量同质类手游充斥玩家的视野，而在主机和PC平台上经久不衰的体育类游戏，却鲜有佳作。在获得了NBA官方认可以后。" + new java.util.Random().nextInt());
            f9Var.m124849x5361953a(j18);
            f9Var.r1(random.nextInt(4));
            f9Var.j1(random.nextInt(1));
            j18++;
            L8.f535938a++;
            f9Var.o1(java.lang.System.currentTimeMillis() + new java.util.Random().nextInt());
            k0Var.A(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "INSERT INTO " + X8(f9Var.Q0()) + " (msgid,msgSvrid,type,status,createTime,talker,content,talkerid)  VALUES(" + f9Var.m124847x74d37ac6() + "," + f9Var.I0() + "," + f9Var.mo78013xfb85f7b0() + "," + f9Var.P0() + "," + f9Var.mo78012x3fdd41df() + ",'" + f9Var.Q0() + "','" + f9Var.j() + "'," + c9(str) + ");");
            if (i18 % 10000 == 0) {
                k0Var.A(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "COMMIT;");
                k0Var.A(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "BEGIN;");
            }
            i17 = i18 + 1;
        }
        k0Var.A(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "COMMIT;");
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 m4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.m4) this.f275511d;
        m4Var.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("msgCount", (java.lang.Integer) 0);
        m4Var.f276650d.p("rconversation", contentValues, "username=?", new java.lang.String[]{str});
        f9Var.m124849x5361953a(j18 + 1);
        M9(f9Var);
    }

    public android.database.Cursor d1(java.lang.String str, java.lang.String str2) {
        return this.f275522r.B(str2, null);
    }

    public final java.util.List d6(int i17, java.util.List list) {
        l75.k0 k0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i18 = 0;
        while (true) {
            int size = list.size();
            k0Var = this.f275522r;
            if (i18 >= size) {
                break;
            }
            final java.lang.String str = ((xg3.k0) list.get(i18)).f535941d;
            if (Da(str)) {
                final java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.addAll(java.util.Arrays.asList(p9()));
                arrayList3.addAll(java.util.Arrays.asList(z3()));
                arrayList3.addAll(java.util.Arrays.asList(48));
                arrayList3.addAll(java.util.Arrays.asList(55, 57));
                for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : ot0.c3.l().e("getLastSendingMsgList[" + str + "]", new yz5.a() { // from class: com.tencent.mm.storage.g9$$f7
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        return ot0.z2.f430355a.D0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, str, arrayList3);
                    }
                }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$h7
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        java.lang.String str2 = str;
                        com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                        g9Var.getClass();
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        android.database.Cursor D = g9Var.f275522r.D(str2, null, "status=1 and isSend=1 and type IN (1,11,21,31,36,42,66,67,48,55,57)", null, null, null, "createTime", 100);
                        while (D.moveToNext()) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                            f9Var2.mo9015xbf5d97fd(D);
                            arrayList4.add(f9Var2);
                        }
                        D.close();
                        return arrayList4;
                    }
                })) {
                    if (c01.w9.p() - f9Var.mo78012x3fdd41df() > 86400000) {
                        arrayList2.add(f9Var);
                    } else {
                        arrayList.add(f9Var);
                    }
                }
            } else if (Pb(str)) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.addAll(java.util.Arrays.asList(p9()));
                arrayList4.addAll(java.util.Arrays.asList(z3()));
                arrayList4.addAll(java.util.Arrays.asList(48));
                arrayList4.addAll(java.util.Arrays.asList(55, 57));
                java.util.Iterator it = ((java.util.ArrayList) ot0.z2.f430355a.D0(k0Var, str, arrayList4)).iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                    if (c01.w9.p() - f9Var2.mo78012x3fdd41df() > 86400000) {
                        arrayList2.add(f9Var2);
                    } else {
                        arrayList.add(f9Var2);
                    }
                }
            } else {
                android.database.Cursor D = this.f275522r.D(str, null, "status=1 and isSend=1 and type IN (1,11,21,31,36,42,66,67,48,55,57)", null, null, null, "createTime", 100);
                while (D.moveToNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var3 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    f9Var3.mo9015xbf5d97fd(D);
                    if (c01.w9.p() - f9Var3.mo78012x3fdd41df() > 86400000) {
                        arrayList2.add(f9Var3);
                    } else {
                        arrayList.add(f9Var3);
                    }
                }
                D.close();
            }
            i18++;
        }
        java.util.List subList = arrayList.size() > i17 ? arrayList.subList(0, i17) : arrayList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "getLastSendingMsgList limit:%s listMsg:%s lstTimeoutMsg:%s limitListMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(arrayList2.size()), java.lang.Integer.valueOf(subList.size()));
        if (arrayList2.size() > 0) {
            long b17 = k0Var.b();
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var4 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it6.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "Set msg timtout : id:%d time:%d time:%s talker:%s content:%s", java.lang.Long.valueOf(f9Var4.m124847x74d37ac6()), java.lang.Long.valueOf(f9Var4.mo78012x3fdd41df()), java.lang.Integer.valueOf(f9Var4.mo78013xfb85f7b0()), f9Var4.Q0(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(f9Var4.j()));
                f9Var4.r1(5);
                lb(f9Var4.m124847x74d37ac6(), f9Var4, true);
            }
            k0Var.w(java.lang.Long.valueOf(b17));
        }
        return subList;
    }

    public android.database.Cursor f1(java.lang.String str, java.lang.String[] strArr, int[] iArr) {
        if (str == null || str.length() == 0 || iArr == null || iArr.length == 0 || strArr == null || strArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getAllAppMsgByTypesForSomeColsUnordered fail, argument is invalid");
            return null;
        }
        java.lang.String X8 = X8(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.String str2 : strArr) {
            if (sb6.length() > 0) {
                sb6.append(",");
            }
            sb6.append(str2);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        for (int i17 : iArr) {
            if (sb7.length() > 0) {
                sb7.append(",");
            }
            sb7.append(i17);
        }
        return this.f275522r.B("select " + ((java.lang.Object) sb6) + " from " + X8 + " where" + W0(str) + Z8(str) + " AND type IN (" + ((java.lang.Object) sb7) + ")", null);
    }

    public android.database.Cursor f3(final java.lang.String str, final int i17) {
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().c("getCursorUnreadDesc", new yz5.a() { // from class: com.tencent.mm.storage.g9$$l5
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.W(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, i17);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$m5
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str2 = X8;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    return g9Var.f275522r.E(str2, null, "isSend=? AND" + g9Var.Z8(str) + "AND status!=?  order by msgId DESC limit " + i17, new java.lang.String[]{"0", "4"}, null, null, null);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.W(this.f275522r, X8, str, i17);
        }
        return this.f275522r.E(X8, null, "isSend=? AND" + Z8(str) + "AND status!=?  order by msgId DESC limit " + i17, new java.lang.String[]{"0", "4"}, null, null, null);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 h2(final java.lang.String str, final long j17) {
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().g("getByCreateTime", new yz5.a() { // from class: com.tencent.mm.storage.g9$$g7
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.z(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, j17);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$r7
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str2 = X8;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    android.database.Cursor D = g9Var.f275522r.D(str2, null, "createTime=? AND" + g9Var.Z8(str), new java.lang.String[]{"" + j17}, null, null, null, 2);
                    if (D.moveToFirst()) {
                        f9Var.mo9015xbf5d97fd(D);
                    }
                    D.close();
                    return f9Var;
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.z(this.f275522r, X8, str, j17);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        android.database.Cursor D = this.f275522r.D(X8, null, "createTime=? AND" + Z8(str), new java.lang.String[]{"" + j17}, null, null, null, 2);
        if (D.moveToFirst()) {
            f9Var.mo9015xbf5d97fd(D);
        }
        D.close();
        return f9Var;
    }

    public android.database.Cursor h5(final java.lang.String str) {
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().c("getLastDayC2CMsgCursorByTalker", new yz5.a() { // from class: com.tencent.mm.storage.g9$$z7
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    return ot0.z2.f430355a.o0(g9Var.f275522r, X8, str, java.util.Arrays.asList(436207665, 419430449));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$a8
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str2 = X8;
                    java.lang.String str3 = str;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    try {
                        return g9Var.f275522r.D(str2, null, g9Var.Z8(str3) + " AND createTime>=? AND type IN (436207665,419430449)", new java.lang.String[]{java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 86400000)}, null, null, "createTime ASC", 2);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgInfoStorage", e17, "getLastDayC2CMsgByTalker error: %s", e17.getMessage());
                        return null;
                    }
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.o0(this.f275522r, X8, str, java.util.Arrays.asList(436207665, 419430449));
        }
        try {
            return this.f275522r.D(X8, null, Z8(str) + " AND createTime>=? AND type IN (436207665,419430449)", new java.lang.String[]{java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 86400000)}, null, null, "createTime ASC", 2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgInfoStorage", e17, "getLastDayC2CMsgByTalker error: %s", e17.getMessage());
            return null;
        }
    }

    public android.database.Cursor i1(java.lang.String str, java.lang.String[] strArr, int i17, int i18) {
        if (str == null || str.length() == 0 || strArr == null || strArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getAllAppMsgForSomeCols fail, argument is invalid");
            return null;
        }
        java.lang.String X8 = X8(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.String str2 : strArr) {
            if (sb6.length() > 0) {
                sb6.append(",");
            }
            sb6.append(str2);
        }
        return this.f275522r.B("select " + ((java.lang.Object) sb6) + " from " + X8 + " where" + W0(str) + Z8(str) + " AND type & 65535 = 49  order by createTime DESC limit " + i18 + " OFFSET " + i17, null);
    }

    public int j4(final java.lang.String str) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "getImgVideoMsgCount talker is null!");
            return 0;
        }
        final java.lang.String X8 = X8(str);
        final long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
        if (Da(X8)) {
            return ot0.c3.l().d("getImgVideoMsgCount", new yz5.a() { // from class: com.tencent.mm.storage.g9$$m2
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str2 = X8;
                    java.lang.String str3 = str;
                    long j17 = m07;
                    ot0.z2 z2Var = ot0.z2.f430355a;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    return java.lang.Integer.valueOf(z2Var.j0(g9Var.f275522r, str2, str3, g9Var.F4(), j17));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$n2
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT COUNT(*) FROM ");
                    sb6.append(X8);
                    sb6.append(" WHERE ");
                    sb6.append(g9Var.P0(m07));
                    sb6.append("talker= '");
                    java.lang.String str2 = str;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str2);
                    sb6.append(str2);
                    sb6.append("' AND type IN (3,39,13,43,62,44,268435505,486539313)");
                    android.database.Cursor f17 = g9Var.f275522r.f(sb6.toString(), null, 2);
                    int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
                    f17.close();
                    return java.lang.Integer.valueOf(i17);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.j0(this.f275522r, X8, str, F4(), m07);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT COUNT(*) FROM ");
        sb6.append(X8);
        sb6.append(" WHERE ");
        sb6.append(P0(m07));
        sb6.append("talker= '");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("' AND type IN (3,39,13,43,62,44,268435505,486539313)");
        android.database.Cursor f17 = this.f275522r.f(sb6.toString(), null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i17;
    }

    public int j7(final java.lang.String str) {
        int i17;
        if (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7.equals(X8(str))) {
            com.p314xaae8f345.mm.p2621x8fb0427b.m4 m4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.m4) this.f275511d;
            m4Var.getClass();
            if (str != null && str.length() > 0) {
                android.database.Cursor f17 = m4Var.f276650d.f("select msgCount from rconversation where username=" + d95.b0.O(str), null, 2);
                r4 = f17.moveToFirst() ? f17.getInt(0) : -1;
                f17.close();
            }
            if (r4 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "getMsgCount conversationStorage.getMsgCountByUsername count:%d", java.lang.Integer.valueOf(r4));
                return r4;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "getMsgCount contactMsgCount is 0 ,go normal %s", str);
        } else {
            boolean equals = "appbrandmessage".equals(X8(str));
            ot0.z2 z2Var = ot0.z2.f430355a;
            l75.k0 k0Var = this.f275522r;
            if (equals || "appbrandnotifymessage".equals(X8(str))) {
                final java.lang.String X8 = X8(str);
                if (Da(X8)) {
                    return ot0.c3.l().b("getMsgCountFromTable", new yz5.a() { // from class: com.tencent.mm.storage.g9$$n5
                        @Override // yz5.a
                        /* renamed from: invoke */
                        public final java.lang.Object mo152xb9724478() {
                            return java.lang.Integer.valueOf(ot0.z2.f430355a.Z0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str));
                        }
                    }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$p5
                        @Override // yz5.a
                        /* renamed from: invoke */
                        public final java.lang.Object mo152xb9724478() {
                            com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                            g9Var.getClass();
                            android.database.Cursor B = g9Var.f275522r.B("SELECT COUNT(*) FROM " + X8 + " WHERE" + g9Var.Z8(str), null);
                            int i18 = B.moveToLast() ? B.getInt(0) : 0;
                            B.close();
                            return java.lang.Integer.valueOf(i18);
                        }
                    });
                }
                if (Pb(X8)) {
                    return z2Var.Z0(k0Var, X8, str);
                }
                android.database.Cursor B = k0Var.B("SELECT COUNT(*) FROM " + X8 + " WHERE" + Z8(str), null);
                i17 = B.moveToLast() ? B.getInt(0) : 0;
                B.close();
                return i17;
            }
            if ("bottlemessage".equals(X8(str))) {
                final java.lang.String X82 = X8(str);
                if (Da(X82)) {
                    return ot0.c3.l().d("getMsgCountFromBottle", new yz5.a() { // from class: com.tencent.mm.storage.g9$$t
                        @Override // yz5.a
                        /* renamed from: invoke */
                        public final java.lang.Object mo152xb9724478() {
                            return java.lang.Integer.valueOf(ot0.z2.f430355a.Z0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X82, str));
                        }
                    }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$u
                        @Override // yz5.a
                        /* renamed from: invoke */
                        public final java.lang.Object mo152xb9724478() {
                            com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                            g9Var.getClass();
                            android.database.Cursor f18 = g9Var.f275522r.f("SELECT COUNT(*) FROM " + X82 + " WHERE" + g9Var.Z8(str), null, 2);
                            int i18 = f18.moveToFirst() ? f18.getInt(0) : 0;
                            f18.close();
                            return java.lang.Integer.valueOf(i18);
                        }
                    });
                }
                if (Pb(X82)) {
                    return z2Var.Z0(k0Var, X82, str);
                }
                android.database.Cursor f18 = k0Var.f("SELECT COUNT(*) FROM " + X82 + " WHERE" + Z8(str), null, 2);
                i17 = f18.moveToFirst() ? f18.getInt(0) : 0;
                f18.close();
                return i17;
            }
        }
        return x7(str);
    }

    public java.lang.String j8(final long j17) {
        final java.lang.String P8 = P8(j17, null);
        boolean Da = Da(P8);
        l75.k0 k0Var = this.f275522r;
        ot0.z2 z2Var = ot0.z2.f430355a;
        if (!Da) {
            if (Pb(P8)) {
                return z2Var.e1(k0Var, P8, j17);
            }
            android.database.Cursor D = this.f275522r.D(P8, new java.lang.String[]{"msgId", "lvbuffer"}, "msgId=?", new java.lang.String[]{"" + j17}, null, null, null, 2);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            if (D.moveToFirst()) {
                f9Var.mo9015xbf5d97fd(D);
            }
            D.close();
            if (f9Var.m124847x74d37ac6() != j17) {
                return null;
            }
            return f9Var.G;
        }
        ot0.c3 l17 = ot0.c3.l();
        yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.storage.g9$$v2
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                java.lang.String str = P8;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
                long j18 = j17;
                sb6.append(j18);
                android.database.Cursor D2 = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r.D(str, new java.lang.String[]{"msgId", "lvbuffer"}, "msgId=?", new java.lang.String[]{sb6.toString()}, null, null, null, 2);
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                if (D2.moveToFirst()) {
                    f9Var2.mo9015xbf5d97fd(D2);
                }
                D2.close();
                if (f9Var2.m124847x74d37ac6() != j18) {
                    return null;
                }
                return f9Var2.G;
            }
        };
        l17.getClass();
        if (!ot0.l3.a()) {
            return z2Var.e1(k0Var, P8, j17);
        }
        try {
            java.lang.String str = (java.lang.String) aVar.mo152xb9724478();
            java.lang.String e17 = z2Var.e1(k0Var, P8, j17);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e17, str)) {
                return e17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OrmCorrectnessChecker", "getMsgSourceById: String mismatch - ORM='" + e17 + "', SQL='" + str + '\'');
            throw ot0.k3.f430099d.f("getMsgSourceById", e17, str);
        } catch (ot0.k3 e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OrmCorrectnessChecker", "getMsgSourceById".concat(": Correctness check failed"), e18);
            l17.m("getMsgSourceById", e18);
            return z2Var.e1(k0Var, P8, j17);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OrmCorrectnessChecker", "getMsgSourceById".concat(": Unexpected error during correctness check"), e19);
            return z2Var.e1(k0Var, P8, j17);
        }
    }

    public android.database.Cursor k1(final java.lang.String str, final int i17, final int i18) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getAllEmojiMessage fail, argument is invalid");
            return null;
        }
        final java.lang.String X8 = X8(str);
        final long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
        if (Da(X8)) {
            return ot0.c3.l().c("getAllEmojiMessage", new yz5.a() { // from class: com.tencent.mm.storage.g9$$c4
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.f(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, i17, i18, m07, 47);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$e4
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    return g9Var.f275522r.f("select * from " + X8 + " where" + g9Var.P0(m07) + g9Var.Z8(str) + " AND type = 47  order by createTime DESC limit " + i18 + " OFFSET " + i17, null, 2);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.f(this.f275522r, X8, str, i17, i18, m07, 47);
        }
        return this.f275522r.f("select * from " + X8 + " where" + P0(m07) + Z8(str) + " AND type = 47  order by createTime DESC limit " + i18 + " OFFSET " + i17, null, 2);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 k2(final java.lang.String str, final long j17) {
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().g("getByMsgSeq", new yz5.a() { // from class: com.tencent.mm.storage.g9$$t7
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.A(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, j17);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$u7
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str2 = X8;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    android.database.Cursor D = g9Var.f275522r.D(str2, null, g9Var.Z8(str) + " AND msgSeq=?", new java.lang.String[]{"" + j17}, null, null, null, 2);
                    if (D.moveToFirst()) {
                        f9Var.mo9015xbf5d97fd(D);
                    }
                    D.close();
                    return f9Var;
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.A(this.f275522r, X8, str, j17);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        android.database.Cursor D = this.f275522r.D(X8, null, Z8(str) + " AND msgSeq=?", new java.lang.String[]{"" + j17}, null, null, null, 2);
        if (D.moveToFirst()) {
            f9Var.mo9015xbf5d97fd(D);
        }
        D.close();
        return f9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int lb(long j17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        int i17;
        if (f9Var.a3()) {
            java.lang.String n86 = n8(f9Var.G);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.g4(n86)) {
                f9Var.u1("notifymessage");
            } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.h4(n86)) {
                f9Var.u1("schedule_message");
            }
        }
        if (f9Var.mo78013xfb85f7b0() == 1075839025 || f9Var.mo78013xfb85f7b0() == 1081081905) {
            f9Var.u1("notifymessage");
        }
        if (Pb(P8(j17, f9Var.Q0()))) {
            up5.w wVar = new up5.w();
            i17 = ot0.z2.f430355a.u1(this.f275522r, P8(j17, f9Var.Q0()), wVar, g95.e0.l(wVar, f9Var.mo9763xeb27878e()), j17);
        } else {
            i17 = this.f275522r.p(P8(j17, f9Var.Q0()), f9Var.mo9763xeb27878e(), "msgId=?", new java.lang.String[]{"" + j17});
        }
        if (i17 == 0 || !z17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(111L, 244L, 1L, false);
        } else {
            m145262xf35bbb4();
            m0(new xg3.l0(f9Var.Q0(), "update", f9Var, 0));
        }
        return i17;
    }

    @Override // l75.s0
    /* renamed from: lock */
    public void mo78027x32c52b() {
        iz5.a.g("lock deprecated, use lockForSync instead.", false);
    }

    public void m0(xg3.l0 l0Var) {
        l75.v0 v0Var = this.f275525u;
        if (v0Var.d(l0Var)) {
            v0Var.c();
        }
    }

    public long m5(final java.lang.String str) {
        final long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
        if (Da(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
            return ot0.c3.l().f("getLastMessageCreateTime", new yz5.a() { // from class: com.tencent.mm.storage.g9$$f3
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.Long.valueOf(ot0.z2.f430355a.r0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, str, m07));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$i3
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select createTime from message where");
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    sb6.append(g9Var.P0(m07));
                    java.lang.String str2 = str;
                    sb6.append(g9Var.Z8(str2));
                    sb6.append("order by createTime DESC LIMIT 1 ");
                    android.database.Cursor f17 = g9Var.f275522r.f(sb6.toString(), null, 2);
                    if (f17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "get last message create time failed " + str2);
                        return -1L;
                    }
                    if (!f17.moveToFirst()) {
                        f17.close();
                        return -1L;
                    }
                    long j17 = f17.getLong(0);
                    f17.close();
                    return java.lang.Long.valueOf(j17);
                }
            });
        }
        if (Pb(X8(str))) {
            return ot0.z2.f430355a.r0(this.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, str, m07);
        }
        android.database.Cursor f17 = this.f275522r.f("select createTime from message where" + P0(m07) + Z8(str) + "order by createTime DESC LIMIT 1 ", null, 2);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "get last message create time failed " + str);
            return -1L;
        }
        if (!f17.moveToFirst()) {
            f17.close();
            return -1L;
        }
        long j17 = f17.getLong(0);
        f17.close();
        return j17;
    }

    public void n0(xg3.h0 h0Var, android.os.Looper looper) {
        this.f275525u.a(h0Var, looper);
    }

    public java.util.List n1() {
        return java.util.Arrays.asList(3, 39, 13, 43, 62, 44, 49, 1090519089, 268435505);
    }

    public int n7(final java.lang.String str, final int i17) {
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().d("getMsgCount", new yz5.a() { // from class: com.tencent.mm.storage.g9$$x7
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.Integer.valueOf(ot0.z2.f430355a.U0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, i17));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$y7
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    android.database.Cursor f17 = g9Var.f275522r.f("SELECT COUNT(*) FROM " + X8 + " WHERE" + g9Var.Z8(str) + "AND type = " + i17, null, 2);
                    int i18 = f17.moveToFirst() ? f17.getInt(0) : 0;
                    f17.close();
                    return java.lang.Integer.valueOf(i18);
                }
            });
        }
        boolean Pb = Pb(X8);
        l75.k0 k0Var = this.f275522r;
        if (Pb) {
            return ot0.z2.f430355a.U0(k0Var, X8, str, i17);
        }
        android.database.Cursor f17 = k0Var.f("SELECT COUNT(*) FROM " + X8 + " WHERE" + Z8(str) + "AND type = " + i17, null, 2);
        int i18 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i18;
    }

    public final java.lang.String n8(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        try {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msgsource", null);
            if (d17 != null && !d17.isEmpty()) {
                return (java.lang.String) d17.get(".msgsource.bizmsg.msgcluster");
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "Exception in getMsgcluster, %s", e17.getMessage());
            return null;
        }
    }

    public void nb(long j17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String Q0 = f9Var.Q0();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (Q0 == null) {
            Q0 = "";
        }
        int i17 = 1;
        iz5.a.g("no talker set when update by svrid", Q0.length() > 0);
        if (f9Var.a3()) {
            java.lang.String n86 = n8(f9Var.G);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.g4(n86)) {
                f9Var.u1("notifymessage");
            } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.h4(n86)) {
                f9Var.u1("schedule_message");
            }
        }
        if (f9Var.mo78013xfb85f7b0() == 1075839025 || f9Var.mo78013xfb85f7b0() == 1081081905) {
            f9Var.u1("notifymessage");
        }
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "invalid svr id %d", java.lang.Long.valueOf(j17));
            return;
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f275513f).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.f) it.next()).c(f9Var);
        }
        boolean Pb = Pb(X8(f9Var.Q0()));
        l75.k0 db6 = this.f275522r;
        if (Pb) {
            up5.w wVar = new up5.w();
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] l17 = g95.e0.l(wVar, f9Var.mo9763xeb27878e());
            java.lang.String tableName = X8(f9Var.Q0());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
            try {
                com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae m106824x752de218 = ot0.d3.a(db6).m106824x752de218(tableName, up5.i.f511503b);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106824x752de218, "getTable(...)");
                if (l17 == null) {
                    l17 = up5.i.a();
                }
                m106824x752de218.m107179xc0204d68((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) wVar, (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae>[]) l17, up5.i.f511505d.eq(j17));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "updateWithSvrId failed: " + th6.getMessage());
                i17 = 0;
            }
        } else {
            i17 = db6.p(X8(f9Var.Q0()), f9Var.mo9763xeb27878e(), "msgSvrId=?", new java.lang.String[]{"" + j17});
        }
        if (i17 == 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(111L, 243L, 1L, false);
        } else {
            m145262xf35bbb4();
            m0(new xg3.l0(f9Var.Q0(), "update", f9Var, 0));
        }
    }

    public android.database.Cursor o1(final java.lang.String str) {
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (str == null || str.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
            return null;
        }
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().c("getAllImgVideoAppMessage", new yz5.a() { // from class: com.tencent.mm.storage.g9$$g3
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    ot0.z2 z2Var = ot0.z2.f430355a;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    return z2Var.h(g9Var.f275522r, X8, str, g9Var.A4());
                }
            }, new yz5.a(X8, str, currentTimeMillis) { // from class: com.tencent.mm.storage.g9$$s3

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f276256e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f276257f;

                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select * from ");
                    java.lang.String str2 = this.f276256e;
                    sb6.append(str2);
                    sb6.append(" ");
                    sb6.append(g9Var.V3(str2));
                    sb6.append(" where");
                    sb6.append(g9Var.Z8(this.f276257f));
                    sb6.append("AND type IN (3,39,13,43,62,44,49,268435505)  order by createTime");
                    android.database.Cursor B = g9Var.f275522r.B(sb6.toString(), null);
                    java.lang.System.currentTimeMillis();
                    return B;
                }
            });
        }
        boolean Pb = Pb(X8);
        l75.k0 k0Var = this.f275522r;
        if (Pb) {
            return ot0.z2.f430355a.h(k0Var, X8, str, A4());
        }
        android.database.Cursor B = k0Var.B("select * from " + X8 + " " + V3(X8) + " where" + Z8(str) + "AND type IN (3,39,13,43,62,44,49,268435505)  order by createTime", null);
        java.lang.System.currentTimeMillis();
        return B;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 o2(java.lang.String str, final long j17) {
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().g("getBySvrId", new yz5.a() { // from class: com.tencent.mm.storage.g9$$q1
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.B(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, null, j17);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$r1
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str2 = X8;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    android.database.Cursor D = g9Var.f275522r.D(str2, null, "msgSvrId=?", new java.lang.String[]{"" + j17}, null, null, null, 2);
                    if (D.moveToFirst()) {
                        f9Var.mo9015xbf5d97fd(D);
                    }
                    D.close();
                    return f9Var;
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.B(this.f275522r, X8, null, j17);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        android.database.Cursor D = this.f275522r.D(X8, null, "msgSvrId=?", new java.lang.String[]{"" + j17}, null, null, null, 2);
        if (D.moveToFirst()) {
            f9Var.mo9015xbf5d97fd(D);
        }
        D.close();
        return f9Var;
    }

    public android.database.Cursor p1(final java.lang.String str, final int i17, final int i18) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
            return null;
        }
        final java.lang.String X8 = X8(str);
        final long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
        if (Da(X8)) {
            return ot0.c3.l().c("getAllImgVideoMessage", new yz5.a() { // from class: com.tencent.mm.storage.g9$$h6
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str2 = X8;
                    java.lang.String str3 = str;
                    long j17 = m07;
                    int i19 = i17;
                    int i27 = i18;
                    ot0.z2 z2Var = ot0.z2.f430355a;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    return z2Var.i(g9Var.f275522r, str2, str3, g9Var.y4(), j17, i19, i27);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$i6
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    return g9Var.f275522r.f("select * from ( select * from " + X8 + " where" + g9Var.P0(m07) + g9Var.Z8(str) + " AND type IN (3,39,13,43,62,44,268435505,486539313)  order by createTime DESC limit " + i18 + " OFFSET " + i17 + ") order by createTime ASC ", null, 2);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.i(this.f275522r, X8, str, y4(), m07, i17, i18);
        }
        return this.f275522r.f("select * from ( select * from " + X8 + " where" + P0(m07) + Z8(str) + " AND type IN (3,39,13,43,62,44,268435505,486539313)  order by createTime DESC limit " + i18 + " OFFSET " + i17 + ") order by createTime ASC ", null, 2);
    }

    public long p5(final java.lang.String str) {
        final java.lang.String X8 = X8(str);
        final long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
        if (Da(X8)) {
            return ot0.c3.l().f("getLastMessageCreateTimeFixTableName", new yz5.a() { // from class: com.tencent.mm.storage.g9$$b8
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.Long.valueOf(ot0.z2.f430355a.s0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, m07));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$d8
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select createTime from ");
                    sb6.append(X8);
                    sb6.append(" where");
                    sb6.append(g9Var.P0(m07));
                    java.lang.String str2 = str;
                    sb6.append(g9Var.Z8(str2));
                    sb6.append("order by createTime DESC LIMIT 1 ");
                    android.database.Cursor f17 = g9Var.f275522r.f(sb6.toString(), null, 2);
                    if (f17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "get last message create time failed " + str2);
                        return -1L;
                    }
                    if (!f17.moveToFirst()) {
                        f17.close();
                        return -1L;
                    }
                    long j17 = f17.getLong(0);
                    f17.close();
                    return java.lang.Long.valueOf(j17);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.s0(this.f275522r, X8, str, m07);
        }
        android.database.Cursor f17 = this.f275522r.f("select createTime from " + X8 + " where" + P0(m07) + Z8(str) + "order by createTime DESC LIMIT 1 ", null, 2);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "get last message create time failed " + str);
            return -1L;
        }
        if (!f17.moveToFirst()) {
            f17.close();
            return -1L;
        }
        long j17 = f17.getLong(0);
        f17.close();
        return j17;
    }

    public java.util.List p6(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i17 = 0;
        while (true) {
            java.util.List list2 = this.f275514g;
            if (i17 >= ((java.util.LinkedList) list2).size()) {
                return d6(Integer.MAX_VALUE, linkedList);
            }
            if (list.contains(((xg3.k0) ((java.util.LinkedList) list2).get(i17)).f535941d)) {
                linkedList.add((xg3.k0) ((java.util.LinkedList) list2).get(i17));
            }
            i17++;
        }
    }

    public final java.lang.Integer[] p9() {
        return new java.lang.Integer[]{1, 11, 21, 31, 36};
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 q5(java.lang.String str) {
        return D5(str, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 r6(final java.lang.String str) {
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().g("getLastSvrMsg", new yz5.a() { // from class: com.tencent.mm.storage.g9$$k7
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.E0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$l7
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str2 = X8;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    android.database.Cursor D = g9Var.f275522r.D(str2, null, g9Var.Z8(str), null, null, null, "msgSvrId  DESC limit 1 ", 2);
                    if (D.moveToFirst()) {
                        f9Var.mo9015xbf5d97fd(D);
                    }
                    D.close();
                    return f9Var;
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.E0(this.f275522r, X8, str);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        android.database.Cursor D = this.f275522r.D(X8, null, Z8(str), null, null, null, "msgSvrId  DESC limit 1 ", 2);
        if (D.moveToFirst()) {
            f9Var.mo9015xbf5d97fd(D);
        }
        D.close();
        return f9Var;
    }

    public int r7(final java.lang.String str) {
        final java.lang.String X8 = X8(str);
        final long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
        if (Da(X8)) {
            return ot0.c3.l().d("getMsgCountBySelf", new yz5.a() { // from class: com.tencent.mm.storage.g9$$s2
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.Integer.valueOf(ot0.z2.f430355a.W0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, m07));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$t2
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v2, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r0v3, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Integer] */
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    ?? f17 = g9Var.f275522r.f(" SELECT COUNT(*) FROM " + X8 + " WHERE" + g9Var.P0(m07) + g9Var.Z8(str) + "AND isSend=1", null, 2);
                    int i17 = 0;
                    try {
                        try {
                            if (f17.moveToFirst()) {
                                i17 = f17.getInt(0);
                            }
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgInfoStorage", e17, "", new java.lang.Object[0]);
                        }
                        f17.close();
                        f17 = java.lang.Integer.valueOf(i17);
                        return f17;
                    } catch (java.lang.Throwable th6) {
                        f17.close();
                        throw th6;
                    }
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.W0(this.f275522r, X8, str, m07);
        }
        android.database.Cursor f17 = this.f275522r.f(" SELECT COUNT(*) FROM " + X8 + " WHERE" + P0(m07) + Z8(str) + "AND isSend=1", null, 2);
        int i17 = 0;
        try {
            try {
                if (f17.moveToFirst()) {
                    i17 = f17.getInt(0);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgInfoStorage", e17, "", new java.lang.Object[0]);
            }
            return i17;
        } finally {
            f17.close();
        }
    }

    public boolean s0(final java.lang.String str, final int i17) {
        if (i17 <= 0) {
            return false;
        }
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().a("checkMessageCountAtLeast", new yz5.a() { // from class: com.tencent.mm.storage.g9$$k
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.Boolean.valueOf(ot0.z2.f430355a.b(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, i17));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$m
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    android.database.Cursor B = g9Var.f275522r.B("select msgId from " + X8 + "  order by createTime ASC limit 1 OFFSET " + i17, null);
                    boolean moveToFirst = B.moveToFirst();
                    B.close();
                    return java.lang.Boolean.valueOf(moveToFirst);
                }
            });
        }
        boolean Pb = Pb(X8);
        l75.k0 k0Var = this.f275522r;
        if (Pb) {
            return ot0.z2.f430355a.b(k0Var, X8, str, i17);
        }
        android.database.Cursor B = k0Var.B("select msgId from " + X8 + "  order by createTime ASC limit 1 OFFSET " + i17, null);
        boolean moveToFirst = B.moveToFirst();
        B.close();
        return moveToFirst;
    }

    public int s9(java.lang.String str, long j17) {
        android.database.Cursor f17 = this.f275522r.f("select count(*) from " + X8(str) + " where " + Z8(str) + " AND isSend=? AND status!=?  AND createTime>?", new java.lang.String[]{"0", "4", "" + j17}, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return 0;
        }
        int i17 = f17.getInt(0);
        f17.close();
        return i17;
    }

    public android.database.Cursor t3() {
        return Da(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7) ? ot0.c3.l().c("getCursorUnreadMMSGGroupByUser", new yz5.a() { // from class: com.tencent.mm.storage.g9$$g0
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                return ot0.z2.f430355a.X(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "unReadCount");
            }
        }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$i0
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                return com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r.E(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, new java.lang.String[]{"talker", "count(*) as unReadCount"}, "isSend=? AND status!=?", new java.lang.String[]{"0", "4"}, "talker", null, null);
            }
        }) : Pb(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7) ? ot0.z2.f430355a.X(this.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "unReadCount") : this.f275522r.E(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, new java.lang.String[]{"talker", "count(*) as unReadCount"}, "isSend=? AND status!=?", new java.lang.String[]{"0", "4"}, "talker", null, null);
    }

    public void tb() {
        int i17 = 0;
        while (true) {
            java.util.List list = this.f275514g;
            if (i17 >= ((java.util.LinkedList) list).size()) {
                return;
            }
            Jb((xg3.k0) ((java.util.LinkedList) list).get(i17));
            i17++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d3, code lost:
    
        if (r1 >= r8.size()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d5, code lost:
    
        r2.a(r3, ((java.lang.Integer) r8.get(r1)).intValue(), ((java.lang.Long) r9.get(r1)).longValue(), false);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f4, code lost:
    
        r2.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f7, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x008a, code lost:
    
        if (r0.moveToFirst() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x008c, code lost:
    
        r1 = 0;
        r2 = r0.getInt(0);
        r3 = r0.getLong(1) / 1000;
        r8.add(java.lang.Integer.valueOf(r2));
        r9.add(java.lang.Long.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00a9, code lost:
    
        if (r0.moveToNext() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00ab, code lost:
    
        r2 = r19.f275523s;
        r2.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelSvrIdMgr", "add size:%d", java.lang.Integer.valueOf(r8.size()));
        r2.b();
        r3 = (int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() / 86400);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u0(final java.lang.String r20, final java.lang.String r21, final java.lang.String[] r22) {
        /*
            r19 = this;
            r7 = r19
            r2 = r20
            r5 = r21
            r6 = r22
            long r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()
            r3 = 172800(0x2a300, double:8.53745E-319)
            long r3 = r0 - r3
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            boolean r0 = r19.Da(r20)
            r10 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L41
            ot0.c3 r12 = ot0.c3.l()
            com.tencent.mm.storage.g9$$q5 r13 = new com.tencent.mm.storage.g9$$q5
            r13.<init>()
            com.tencent.mm.storage.g9$$r5 r14 = new com.tencent.mm.storage.g9$$r5
            r0 = r14
            r1 = r19
            r2 = r20
            r5 = r21
            r6 = r22
            r0.<init>()
            java.lang.String r0 = "dealWithAddToDelMsg"
            android.database.Cursor r0 = r12.c(r0, r13, r14)
            goto L86
        L41:
            boolean r0 = r19.Pb(r20)
            l75.k0 r1 = r7.f275522r
            if (r0 == 0) goto L50
            ot0.z2 r0 = ot0.z2.f430355a
            android.database.Cursor r0 = r0.d(r1, r2, r5, r6)
            goto L86
        L50:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r12 = "SELECT msgSvrId,createTime FROM "
            r0.<init>(r12)
            r0.append(r2)
            java.lang.String r2 = " WHERE createTime > "
            r0.append(r2)
            long r3 = r3 * r10
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r21)
            if (r2 != 0) goto L81
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " AND "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r2.toString()
        L81:
            r2 = 2
            android.database.Cursor r0 = r1.f(r0, r6, r2)
        L86:
            boolean r1 = r0.moveToFirst()
            if (r1 == 0) goto Lf7
        L8c:
            r1 = 0
            int r2 = r0.getInt(r1)
            r3 = 1
            long r3 = r0.getLong(r3)
            long r3 = r3 / r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.add(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            r9.add(r2)
            boolean r2 = r0.moveToNext()
            if (r2 != 0) goto L8c
            com.tencent.mm.storage.w4 r2 = r7.f275523s
            r2.getClass()
            int r3 = r8.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "MicroMsg.DelSvrIdMgr"
            java.lang.String r5 = "add size:%d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5, r3)
            r2.b()
            long r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()
            r5 = 86400(0x15180, double:4.26873E-319)
            long r3 = r3 / r5
            int r3 = (int) r3
        Lcf:
            int r4 = r8.size()
            if (r1 >= r4) goto Lf4
            java.lang.Object r4 = r8.get(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            long r14 = (long) r4
            java.lang.Object r4 = r9.get(r1)
            java.lang.Long r4 = (java.lang.Long) r4
            long r16 = r4.longValue()
            r18 = 0
            r12 = r2
            r13 = r3
            r12.a(r13, r14, r16, r18)
            int r1 = r1 + 1
            goto Lcf
        Lf4:
            r2.c()
        Lf7:
            r0.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.g9.u0(java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public java.util.List u1(final java.lang.String str) {
        if (Da(str)) {
            return ot0.c3.l().e("getAllMessage", new yz5.a() { // from class: com.tencent.mm.storage.g9$$p
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return new java.util.ArrayList(ot0.z2.f430355a.l(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, str));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$q
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.util.ArrayList arrayList;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    android.database.Cursor f17 = g9Var.f275522r.f("select * from " + str, null, 2);
                    if (f17 == null) {
                        return null;
                    }
                    if (f17.moveToFirst()) {
                        arrayList = new java.util.ArrayList();
                        do {
                            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                            f9Var.mo9015xbf5d97fd(f17);
                            arrayList.add(f9Var);
                        } while (f17.moveToNext());
                    } else {
                        arrayList = null;
                    }
                    f17.close();
                    if (arrayList == null) {
                        return null;
                    }
                    return new java.util.ArrayList(arrayList);
                }
            });
        }
        boolean Pb = Pb(str);
        l75.k0 k0Var = this.f275522r;
        if (Pb) {
            return ot0.z2.f430355a.l(k0Var, str);
        }
        java.util.ArrayList arrayList = null;
        android.database.Cursor f17 = k0Var.f("select * from " + str, null, 2);
        if (f17 == null) {
            return null;
        }
        if (f17.moveToFirst()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            do {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var.mo9015xbf5d97fd(f17);
                arrayList2.add(f9Var);
            } while (f17.moveToNext());
            arrayList = arrayList2;
        }
        f17.close();
        return arrayList;
    }

    @Override // l75.s0
    /* renamed from: unlock */
    public void mo78028xcde7df44() {
        iz5.a.g("unlock deprecated, use lockForSync instead.", false);
    }

    public long v3(final java.lang.String str, final long j17, final int i17) {
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "error target inc count");
            return j17;
        }
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().f("getDownIncMsgCreateTime", new yz5.a() { // from class: com.tencent.mm.storage.g9$$g8
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.Long.valueOf(ot0.z2.f430355a.Y(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, j17, i17));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$h8
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT createTime FROM ");
                    sb6.append(X8);
                    sb6.append(" WHERE");
                    sb6.append(g9Var.Z8(str));
                    sb6.append("AND createTime > ");
                    long j18 = j17;
                    sb6.append(j18);
                    sb6.append(" ORDER BY createTime ASC  LIMIT ");
                    sb6.append(i17);
                    android.database.Cursor B = g9Var.f275522r.B(sb6.toString(), null);
                    if (B == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "get down inc msg create time error, cursor is null");
                        return java.lang.Long.valueOf(j18);
                    }
                    if (B.moveToLast()) {
                        long j19 = B.getLong(0);
                        B.close();
                        return java.lang.Long.valueOf(j19);
                    }
                    B.close();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "get result fail");
                    return java.lang.Long.valueOf(j18);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.Y(this.f275522r, X8, str, j17, i17);
        }
        android.database.Cursor B = this.f275522r.B("SELECT createTime FROM " + X8 + " WHERE" + Z8(str) + "AND createTime > " + j17 + " ORDER BY createTime ASC  LIMIT " + i17, null);
        if (B == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "get down inc msg create time error, cursor is null");
            return j17;
        }
        if (B.moveToLast()) {
            long j18 = B.getLong(0);
            B.close();
            return j18;
        }
        B.close();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "get result fail");
        return j17;
    }

    public java.util.List v4() {
        return java.util.Arrays.asList(3, 39, 13, 43, 62, 44, 268435505, 486539313);
    }

    public long v9(final java.lang.String str, final long j17, final int i17) {
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "error target inc count");
            return j17;
        }
        final java.lang.String X8 = X8(str);
        final long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
        if (Da(X8)) {
            return ot0.c3.l().f("getUpIncMsgCreateTime", new yz5.a() { // from class: com.tencent.mm.storage.g9$$b2
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.Long.valueOf(ot0.z2.f430355a.k1(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, m07, j17, i17));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$c2
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT createTime FROM ");
                    sb6.append(X8);
                    sb6.append(" WHERE");
                    sb6.append(g9Var.P0(m07));
                    sb6.append(g9Var.Z8(str));
                    sb6.append("AND createTime < ");
                    long j18 = j17;
                    sb6.append(j18);
                    sb6.append(" ORDER BY createTime DESC  LIMIT ");
                    sb6.append(i17);
                    android.database.Cursor B = g9Var.f275522r.B(sb6.toString(), null);
                    if (B.moveToLast()) {
                        long j19 = B.getLong(0);
                        B.close();
                        return java.lang.Long.valueOf(j19);
                    }
                    B.close();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "get result fail");
                    return java.lang.Long.valueOf(j18);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.k1(this.f275522r, X8, str, m07, j17, i17);
        }
        android.database.Cursor B = this.f275522r.B("SELECT createTime FROM " + X8 + " WHERE" + P0(m07) + Z8(str) + "AND createTime < " + j17 + " ORDER BY createTime DESC  LIMIT " + i17, null);
        if (B == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "get inc msg create time error, cursor is null");
            return j17;
        }
        if (B.moveToLast()) {
            long j18 = B.getLong(0);
            B.close();
            return j18;
        }
        B.close();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfoStorage", "get result fail");
        return j17;
    }

    public long w3(final java.lang.String str) {
        if (Da(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
            return ot0.c3.l().f("getFirstMessageCreateTime", new yz5.a() { // from class: com.tencent.mm.storage.g9$$y
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.Long.valueOf(ot0.z2.f430355a.Z(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, str));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$z
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select createTime from message where");
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    java.lang.String str2 = str;
                    sb6.append(g9Var.Z8(str2));
                    sb6.append("order by createTime LIMIT 1 OFFSET 0");
                    android.database.Cursor f17 = g9Var.f275522r.f(sb6.toString(), null, 2);
                    if (f17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "get first message create time failed: " + str2);
                        return -1L;
                    }
                    if (!f17.moveToFirst()) {
                        f17.close();
                        return -1L;
                    }
                    long j17 = f17.getLong(0);
                    f17.close();
                    return java.lang.Long.valueOf(j17);
                }
            });
        }
        boolean Pb = Pb(X8(str));
        l75.k0 k0Var = this.f275522r;
        if (Pb) {
            return ot0.z2.f430355a.Z(k0Var, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, str);
        }
        android.database.Cursor f17 = k0Var.f("select createTime from message where" + Z8(str) + "order by createTime LIMIT 1 OFFSET 0", null, 2);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "get first message create time failed: " + str);
            return -1L;
        }
        if (!f17.moveToFirst()) {
            f17.close();
            return -1L;
        }
        long j17 = f17.getLong(0);
        f17.close();
        return j17;
    }

    public int w8(final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.Q0())) {
            final java.lang.String X8 = X8(f9Var.Q0());
            if (Da(X8)) {
                return ot0.c3.l().b("getNewerMsgCount", new yz5.a() { // from class: com.tencent.mm.storage.g9$$j5
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        return java.lang.Integer.valueOf(ot0.z2.f430355a.f1(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, f9Var));
                    }
                }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$k5
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                        g9Var.getClass();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT count(msgId) FROM ");
                        sb6.append(X8);
                        sb6.append(" WHERE");
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = f9Var;
                        sb6.append(g9Var.Z8(f9Var2.Q0()));
                        sb6.append("AND isSend = 0 AND msgId >= ");
                        sb6.append(f9Var2.m124847x74d37ac6());
                        sb6.append(" ORDER BY createTime DESC");
                        android.database.Cursor f17 = g9Var.f275522r.f(sb6.toString(), null, 2);
                        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
                        f17.close();
                        return java.lang.Integer.valueOf(i17);
                    }
                });
            }
            boolean Pb = Pb(X8);
            l75.k0 k0Var = this.f275522r;
            if (Pb) {
                return ot0.z2.f430355a.f1(k0Var, X8, f9Var);
            }
            android.database.Cursor f17 = k0Var.f("SELECT count(msgId) FROM " + X8 + " WHERE" + Z8(f9Var.Q0()) + "AND isSend = 0 AND msgId >= " + f9Var.m124847x74d37ac6() + " ORDER BY createTime DESC", null, 2);
            r0 = f17.moveToFirst() ? f17.getInt(0) : 0;
            f17.close();
        }
        return r0;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 x5(final java.lang.String str, final java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getLastMsg failed : talker:%s", str);
            return null;
        }
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().g("getLastMsg", new yz5.a() { // from class: com.tencent.mm.storage.g9$$l1
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.A0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, str2);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$m1
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select * from ");
                    sb6.append(X8);
                    sb6.append(" where");
                    java.lang.String str3 = str;
                    sb6.append(g9Var.Z8(str3));
                    sb6.append(str2);
                    sb6.append(" order by createTime DESC limit 1");
                    android.database.Cursor f17 = g9Var.f275522r.f(sb6.toString(), null, 2);
                    if (f17.moveToFirst()) {
                        f9Var.mo9015xbf5d97fd(f17);
                    }
                    f17.close();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "getLastMsg talker:%s msgid:%d", str3, java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                    return f9Var;
                }
            });
        }
        boolean Pb = Pb(X8);
        l75.k0 k0Var = this.f275522r;
        if (Pb) {
            return ot0.z2.f430355a.A0(k0Var, X8, str, str2);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        android.database.Cursor f17 = k0Var.f("select * from " + X8 + " where" + Z8(str) + str2 + " order by createTime DESC limit 1", null, 2);
        if (f17.moveToFirst()) {
            f9Var.mo9015xbf5d97fd(f17);
        }
        f17.close();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "getLastMsg talker:%s msgid:%d", str, java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        return f9Var;
    }

    public int x7(final java.lang.String str) {
        final java.lang.String X8 = X8(str);
        final long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
        if (Da(X8)) {
            return ot0.c3.l().d("getMsgCountFromMsgTable", new yz5.a() { // from class: com.tencent.mm.storage.g9$$f1
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.Integer.valueOf(ot0.z2.f430355a.Y0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, m07));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$g1
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    android.database.Cursor f17 = g9Var.f275522r.f("SELECT COUNT(*) FROM " + X8 + " WHERE" + g9Var.P0(m07) + g9Var.Z8(str), null, 2);
                    int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
                    f17.close();
                    return java.lang.Integer.valueOf(i17);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.Y0(this.f275522r, X8, str, m07);
        }
        android.database.Cursor f17 = this.f275522r.f("SELECT COUNT(*) FROM " + X8 + " WHERE" + P0(m07) + Z8(str), null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i17;
    }

    public android.database.Cursor x8(final java.lang.String str) {
        final java.lang.String X8 = X8(str);
        final java.util.List asList = java.util.Arrays.asList(436207665, 419430449, -2130706383);
        if (Da(X8)) {
            return ot0.c3.l().c("getPayMsgContentByTalker", new yz5.a() { // from class: com.tencent.mm.storage.g9$$f4
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.h1(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, str, X8, asList);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$g4
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    return g9Var.f275522r.B("SELECT content FROM " + X8 + " WHERE" + g9Var.Z8(str) + "AND type in (436207665,419430449,-2130706383)", null);
                }
            });
        }
        boolean Pb = Pb(X8);
        l75.k0 k0Var = this.f275522r;
        if (Pb) {
            return ot0.z2.f430355a.h1(k0Var, str, X8, asList);
        }
        return k0Var.B("SELECT content FROM " + X8 + " WHERE" + Z8(str) + "AND type in (436207665,419430449,-2130706383)", null);
    }

    public int y0(java.lang.String table, long j17) {
        u0(table, "", null);
        try {
            boolean Pb = Pb(table);
            int i17 = 1;
            l75.k0 db6 = this.f275522r;
            if (Pb) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
                try {
                    com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae m106824x752de218 = ot0.d3.a(db6).m106824x752de218(table, up5.i.f511503b);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106824x752de218, "getTable(...)");
                    m106824x752de218.m107088x90df30e9(up5.i.f511510i.le(j17));
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "deleteAllMessage with time failed: " + th6.getMessage());
                    i17 = -1;
                }
            } else {
                p75.e0 e0Var = (p75.e0) db6.z("DELETE FROM " + table + " WHERE createTime < ?");
                e0Var.m157940x37fbf859(1, j17);
                i17 = e0Var.b(null);
            }
            if (i17 > 0) {
                mo145247xf35bbb4("delete_all " + table);
            }
            return i17;
        } catch (java.lang.RuntimeException unused) {
            jx3.f.INSTANCE.mo68477x336bdfd8(111L, 247L, 1L, false);
            return -1;
        }
    }

    public android.database.Cursor y2(final java.lang.String str) {
        final java.lang.String X8 = X8(str);
        final long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
        if (Da(X8)) {
            return ot0.c3.l().c("getByTalkerWithGroupBy", new yz5.a() { // from class: com.tencent.mm.storage.g9$$w1
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.D(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, m07);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$x1
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str2 = X8;
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    return g9Var.f275522r.E(str2, new java.lang.String[]{"createTime", "msgId"}, g9Var.P0(m07) + g9Var.Z8(str), null, "createTime", null, "createTime ASC");
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.D(this.f275522r, X8, str, m07);
        }
        return this.f275522r.E(X8, new java.lang.String[]{"createTime", "msgId"}, P0(m07) + Z8(str), null, "createTime", null, "createTime ASC");
    }

    public final java.util.List y4() {
        return java.util.Arrays.asList(3, 39, 13, 43, 62, 44, 268435505, 486539313);
    }

    public java.util.List y5(final java.lang.String str, final int i17) {
        iz5.a.g(null, this.f275514g != null);
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().e("getLastMsg", new yz5.a() { // from class: com.tencent.mm.storage.g9$$h2
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return new java.util.ArrayList(ot0.z2.f430355a.t0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, i17));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$i2
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    android.database.Cursor f17 = g9Var.f275522r.f("SELECT * FROM " + X8 + " WHERE" + g9Var.Z8(str) + " ORDER BY createTime DESC LIMIT " + i17, null, 2);
                    while (f17.moveToNext()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                        f9Var.mo9015xbf5d97fd(f17);
                        arrayList.add(f9Var);
                    }
                    f17.close();
                    return new java.util.ArrayList(arrayList);
                }
            });
        }
        boolean Pb = Pb(X8);
        l75.k0 k0Var = this.f275522r;
        if (Pb) {
            return ot0.z2.f430355a.t0(k0Var, X8, str, i17);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = k0Var.f("SELECT * FROM " + X8 + " WHERE" + Z8(str) + " ORDER BY createTime DESC LIMIT " + i17, null, 2);
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.mo9015xbf5d97fd(f17);
            arrayList.add(f9Var);
        }
        f17.close();
        return arrayList;
    }

    public void z0(java.lang.String table) {
        boolean A;
        u0(table, "", null);
        boolean Pb = Pb(table);
        l75.k0 db6 = this.f275522r;
        if (Pb) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
            try {
                com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae m106824x752de218 = ot0.d3.a(db6).m106824x752de218(table, up5.i.f511503b);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106824x752de218, "getTable(...)");
                m106824x752de218.m107087x90df30e9();
                A = true;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "deleteAllMessage failed: " + th6.getMessage());
                A = false;
            }
        } else {
            A = db6.A(table, "delete from " + table);
        }
        if (!A) {
            jx3.f.INSTANCE.mo68477x336bdfd8(111L, 247L, 1L, false);
            return;
        }
        mo145247xf35bbb4("delete_all " + table);
    }

    public java.util.List z1(final java.lang.String str, final long j17, final int i17) {
        final java.lang.String X8 = X8(str);
        if (Da(X8)) {
            return ot0.c3.l().e("getAllMessageBeforeCreateTime", new yz5.a() { // from class: com.tencent.mm.storage.g9$$s6
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return new java.util.ArrayList(ot0.z2.f430355a.o(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, j17, i17));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$t6
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    android.database.Cursor f17 = g9Var.f275522r.f("Select * From " + X8 + " Where " + g9Var.Z8(str) + " AND createTime < ? and not ( type = 10000 and isSend != 2 )  Order By createTime Desc Limit " + i17, new java.lang.String[]{"" + j17}, 2);
                    while (f17.moveToNext()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                        f9Var.mo9015xbf5d97fd(f17);
                        arrayList.add(f9Var);
                    }
                    f17.close();
                    return new java.util.ArrayList(arrayList);
                }
            });
        }
        if (Pb(X8)) {
            return ot0.z2.f430355a.o(this.f275522r, X8, str, j17, i17);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f275522r.f("Select * From " + X8 + " Where " + Z8(str) + " AND createTime < ? and not ( type = 10000 and isSend != 2 )  Order By createTime Desc Limit " + i17, new java.lang.String[]{"" + j17}, 2);
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.mo9015xbf5d97fd(f17);
            arrayList.add(f9Var);
        }
        f17.close();
        return arrayList;
    }

    public final java.lang.Integer[] z3() {
        return new java.lang.Integer[]{42, 66, 67};
    }

    public void za(xg3.h0 h0Var) {
        this.f275525u.j(h0Var);
    }
}
