package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class f2 extends l75.n0 implements p94.l0 {
    public static final java.lang.String A;
    public static final java.lang.String B;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f247514n;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f247519s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String f247520t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String f247521u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String f247522v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String f247523w;

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String f247524x;

    /* renamed from: y, reason: collision with root package name */
    public static final java.lang.String f247525y;

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String f247526z;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2 f247527d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f247528e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f247529f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79 f247530g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f247511h = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.f38319x3164ae, dm.va.f68838xc4fe047c)};

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f247512i = {"snsId", "userName", "localFlag", "createTime", "head", "localPrivate", "type", "sourceType", "likeFlag", "pravited", "stringSeq", "content", "attrBuf", "postBuf", "rowid"};

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f247513m = {"CREATE INDEX IF NOT EXISTS serverSnsNameIndex ON SnsInfo ( snsId )", "CREATE INDEX IF NOT EXISTS serverSnsTimeHeadIndex ON SnsInfo ( head )", "DROP INDEX IF EXISTS serverSnsTimeIndex", "DROP INDEX IF EXISTS serverSnsTimeSourceTypeIndex", "CREATE INDEX IF NOT EXISTS snsMultiIndex1 ON SnsInfo ( createTime,snsId,sourceType,type)", "CREATE INDEX IF NOT EXISTS snsMultiIndex2 ON SnsInfo ( sourceType,type,userName)", "CREATE INDEX IF NOT EXISTS snsMultiIndex3 ON SnsInfo ( userName,sourceType)", "CREATE INDEX IF NOT EXISTS snsLocalflagIndex ON SnsInfo ( localFlag )"};

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.String f247515o = " order by SnsInfo.createTime desc ,snsId desc";

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.String f247516p = " order by SnsInfo.createTime asc ,snsId asc";

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.String f247517q = " order by SnsInfo.head desc ,SnsInfo.createTime desc ";

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f247518r = " order by SnsInfo.head desc ,snsId desc";
    public static final java.lang.String C = " (type = 7 ) ";
    public static final int D = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_sql_trace_report_threshold, 10);
    public static final boolean E = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_sql_trace_report_enable, false);
    public static final java.util.ArrayList F = X1(java.util.Arrays.asList(16, 32, 2, 8, 64, 128, 256, 512, 2048));
    public static final java.util.ArrayList G = X1(java.util.Arrays.asList(2, 4, 8, 16, 64, 128, 256));

    static {
        f247514n = "";
        f247524x = null;
        int i17 = 0;
        f247514n = "select ";
        while (true) {
            java.lang.String[] strArr = f247512i;
            if (i17 >= strArr.length) {
                break;
            }
            if (i17 < strArr.length - 1) {
                f247514n += " " + strArr[i17] + ",";
            } else {
                f247514n += " " + strArr[i17] + " ";
            }
            i17++;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorage", "TIMELINE_SELECT_BEGIN " + f247514n);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = F.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if ((intValue & 16) != 0 && (intValue & 32) == 0 && (intValue & 512) == 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue));
            }
        }
        java.lang.String y07 = y0(arrayList, "localFlag");
        f247519s = y07;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", y07);
        arrayList.clear();
        java.util.Iterator it6 = F.iterator();
        while (it6.hasNext()) {
            int intValue2 = ((java.lang.Integer) it6.next()).intValue();
            if ((intValue2 & 32) != 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue2));
            }
        }
        java.lang.String y08 = y0(arrayList, "localFlag");
        f247521u = y08;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", y08);
        arrayList.clear();
        java.util.Iterator it7 = F.iterator();
        while (it7.hasNext()) {
            int intValue3 = ((java.lang.Integer) it7.next()).intValue();
            if ((intValue3 & 64) == 0 && (intValue3 & 32) != 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue3));
            }
        }
        f247525y = y0(arrayList, "localFlag");
        arrayList.clear();
        java.util.Iterator it8 = F.iterator();
        while (it8.hasNext()) {
            int intValue4 = ((java.lang.Integer) it8.next()).intValue();
            if ((intValue4 & 2048) != 0 && (intValue4 & 32) != 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue4));
            }
        }
        B = y0(arrayList, "localFlag");
        arrayList.clear();
        java.util.Iterator it9 = G.iterator();
        while (it9.hasNext()) {
            int intValue5 = ((java.lang.Integer) it9.next()).intValue();
            if ((intValue5 & 8) != 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue5));
            }
        }
        java.lang.String y09 = y0(arrayList, "sourceType");
        f247523w = y09;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", y09);
        arrayList.clear();
        java.util.Iterator it10 = G.iterator();
        while (it10.hasNext()) {
            int intValue6 = ((java.lang.Integer) it10.next()).intValue();
            if ((intValue6 & 2) != 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue6));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", y0(arrayList, "sourceType"));
        arrayList.clear();
        java.util.Iterator it11 = G.iterator();
        while (it11.hasNext()) {
            int intValue7 = ((java.lang.Integer) it11.next()).intValue();
            if ((intValue7 & 4) != 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue7));
            }
        }
        java.lang.String y010 = y0(arrayList, "sourceType");
        f247522v = y010;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", y010);
        arrayList.clear();
        java.util.Iterator it12 = F.iterator();
        while (it12.hasNext()) {
            int intValue8 = ((java.lang.Integer) it12.next()).intValue();
            if ((intValue8 & 256) != 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue8));
            }
        }
        f247526z = z0(arrayList, "localFlag", true);
        arrayList.clear();
        java.util.Iterator it13 = G.iterator();
        while (it13.hasNext()) {
            int intValue9 = ((java.lang.Integer) it13.next()).intValue();
            if ((intValue9 & 16) != 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue9));
            }
        }
        A = y0(arrayList, "sourceType");
        arrayList.clear();
        java.util.Iterator it14 = G.iterator();
        while (it14.hasNext()) {
            int intValue10 = ((java.lang.Integer) it14.next()).intValue();
            if ((intValue10 & 64) != 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue10));
            }
        }
        f247524x = y0(arrayList, "sourceType");
        arrayList.clear();
        java.util.Iterator it15 = F.iterator();
        while (it15.hasNext()) {
            int intValue11 = ((java.lang.Integer) it15.next()).intValue();
            if ((intValue11 & 512) != 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue11));
            }
        }
        f247520t = y0(arrayList, "localFlag");
    }

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2 p2Var) {
        super(p2Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.f38319x3164ae, dm.va.f68838xc4fe047c, f247513m);
        boolean z17;
        int i17;
        this.f247529f = " from SnsInfo".toLowerCase();
        this.f247530g = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h2(this);
        this.f247527d = p2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryAddDBCol", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        android.database.Cursor f17 = p2Var.f("PRAGMA table_info( SnsInfo )", null, 2);
        int columnIndex = f17.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        boolean z18 = false;
        while (f17.moveToNext()) {
            if (columnIndex >= 0 && dm.va.f68811x79bf47ab.equalsIgnoreCase(f17.getString(columnIndex))) {
                z18 = true;
            }
        }
        f17.close();
        long F2 = p2Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (!z18) {
            p2Var.A(dm.va.f68838xc4fe047c, "Alter table SnsInfo add serverExtFlag INT DEFAULT 0");
        }
        p2Var.w(java.lang.Long.valueOf(F2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryAddDBCol", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_init_delete_invalid_snsid, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2 p2Var2 = this.f247527d;
        if (fj6) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteInvalidSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorage", "deleteInvalidSnsId result:%d", java.lang.Integer.valueOf(p2Var2.mo70514xb06685ab(dm.va.f68838xc4fe047c, "snsId=?", new java.lang.String[]{"9223372036854775807"})));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteInvalidSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        }
        android.database.Cursor f18 = p2Var2.f("select count(*) from SnsInfo where snsId > 0;", null, 2);
        if (!f18.moveToFirst() || (i17 = f18.getInt(0)) <= 0) {
            f18.close();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorage", "exsits snsId > 0  ,count is %d", java.lang.Integer.valueOf(i17));
            f18.close();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            z17 = true;
        }
        boolean z19 = !z17;
        this.f247528e = z19;
        if (z19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorage", "all sndId < 0 ,so optimalizeForSnsId");
        } else {
            f247515o = " order by SnsInfo.createTime desc ,case when snsId < 0 then 0 else 1 end ,  snsId desc";
            f247516p = " order by SnsInfo.createTime asc ,case when snsId < 0 then 0 else 1 end ,  snsId asc";
            f247517q = " order by SnsInfo.head desc ,SnsInfo.createTime desc ";
            f247518r = " order by SnsInfo.head desc ,case when snsId < 0 then 0 else 1 end ,  snsId desc";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_sns_sql_trace_switch, "0", true), 0) > 0) {
            d95.f.f309205r = this.f247530g;
        }
    }

    public static java.lang.String C1() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCON_TIMELINE", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFilterLucky", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6074xb818506a c6074xb818506a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6074xb818506a();
        c6074xb818506a.e();
        c6074xb818506a.f136356g.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFilterLucky", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCON_TIMELINE", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return " (sourceType & 2 != 0 ) ";
    }

    public static java.util.ArrayList X1(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getORIntRange", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it6 = hashSet.iterator();
            while (it6.hasNext()) {
                arrayList3.add(java.lang.Integer.valueOf(((java.lang.Integer) it6.next()).intValue() | num.intValue()));
            }
            hashSet.addAll(new java.util.HashSet(arrayList3));
            hashSet.add(num);
        }
        hashSet.add(0);
        arrayList2.addAll(hashSet);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getORIntRange", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return arrayList2;
    }

    public static java.lang.String y0(java.util.List list, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildLimitString", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String z07 = z0(list, str, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildLimitString", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return z07;
    }

    public static java.lang.String z0(java.util.List list, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildLimitString", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
        if (z17) {
            sb6.append(str + " not in (");
        } else {
            sb6.append(str + " in (");
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            sb6.append(it.next());
            if (it.hasNext()) {
                sb6.append(",");
            }
        }
        sb6.append("))");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildLimitString", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return sb7;
    }

    public void D0(long j17, long j18, java.lang.String str, android.os.CancellationSignal cancellationSignal) {
        java.lang.String str2;
        int m106535x91d1f3e9;
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab;
        int m107872x91d1f3e9;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanDbExpireExcludeSelf", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (str != null) {
            str2 = "DELETE FROM SnsInfo WHERE rowid IN (SELECT rowid FROM SnsInfo WHERE createTime < " + j17 + " AND userName != '" + str + "' LIMIT " + j18 + " OFFSET 20)";
        } else {
            str2 = "DELETE FROM SnsInfo WHERE rowid IN (SELECT rowid FROM SnsInfo WHERE createTime < " + j17 + " LIMIT " + j18 + ")";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2 p2Var = this.f247527d;
        p2Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInnerDB", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInnerDB", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        l75.k0 k0Var = p2Var.f247633a;
        if (k0Var instanceof d95.b0) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 m107663xac8b87c = ((d95.b0) k0Var).P().m107663xac8b87c(str2);
            if (cancellationSignal != null) {
                try {
                    c26987xeef691ab = new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab();
                    cancellationSignal.setOnCancelListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17934x5b4a3d5(c26987xeef691ab));
                    cancellationSignal.throwIfCanceled();
                } catch (java.lang.Throwable th6) {
                    if (m107663xac8b87c != null) {
                        try {
                            m107663xac8b87c.close();
                        } catch (java.lang.Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanDbExpireExcludeSelf", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    throw th6;
                }
            } else {
                c26987xeef691ab = null;
            }
            int i17 = 0;
            do {
                i17++;
                m107872x91d1f3e9 = m107663xac8b87c.m107872x91d1f3e9(c26987xeef691ab);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorage", "cleanSnsTablesByTimeLimit cleanDbExpire, %s, count:%s, limitCount:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(m107872x91d1f3e9), java.lang.Long.valueOf(j18));
            } while (m107872x91d1f3e9 > 0);
            m107663xac8b87c.close();
        } else if (k0Var instanceof d95.z) {
            com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26915x63d6eaa3 m106487xac8b87c = ((d95.z) k0Var).f309251a.m106487xac8b87c(str2);
            int i18 = 0;
            do {
                i18++;
                try {
                    m106535x91d1f3e9 = m106487xac8b87c.m106535x91d1f3e9(cancellationSignal);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorage", "cleanSnsTablesByTimeLimit cleanDbExpire, %s, count:%s, limitCount:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(m106535x91d1f3e9), java.lang.Long.valueOf(j18));
                } catch (java.lang.Throwable th8) {
                    if (m106487xac8b87c != null) {
                        try {
                            m106487xac8b87c.close();
                        } catch (java.lang.Throwable th9) {
                            th8.addSuppressed(th9);
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanDbExpireExcludeSelf", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    throw th8;
                }
            } while (m106535x91d1f3e9 > 0);
            m106487xac8b87c.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorage", "cleanSnsTablesByTimeLimit cleanDbExpire vacuumResult:" + p2Var.A(dm.va.f68838xc4fe047c, "VACUUM"));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanDbExpireExcludeSelf", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public final java.lang.String D2(boolean z17, java.lang.String str, boolean z18, boolean z19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserMediaSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *,rowid from SnsInfo ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("conAlbumWhere", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String str2 = " WHERE " + f247524x;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("conAlbumWhere", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        sb6.append(str2);
        java.lang.String str3 = sb6.toString() + " AND type in ( 1 , 54 , 15)";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserMediaSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return str3;
    }

    public void D3(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFilterTimeLineAbove", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (!b3(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFilterTimeLineAbove", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return;
        }
        C1();
        z3(" where " + o1(str) + " and  (sourceType & 2 != 0 )  and  (snsId != 0  ) ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFilterTimeLineAbove", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public long F2(long j17, int i17, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        long T1 = T1(G2(false, str, z17, false), j17, i17, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return T1;
    }

    public final java.lang.String G2(boolean z17, java.lang.String str, boolean z18, boolean z19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String str2 = ((z19 ? "select count(*) from SnsInfo " : "select *,rowid from SnsInfo ") + J0(str, z18)) + " AND type in ( 1,2 , 3 , 4 , 18 , 5 , 12 , 9 , 14 , 15 , 13 , 21 , 25 , 26,28,29,30 , 34,45,43,38,53,33,37,36,39,41,42,47,48,44,46,51,52,101,50,54,55,56,59,58)";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return str2;
    }

    public final java.lang.String J0(java.lang.String str, boolean z17) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("conUserWhere", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (z17) {
            str2 = " WHERE " + f247522v;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" WHERE SnsInfo.userName=\"");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
            sb6.append(str);
            sb6.append("\"");
            str2 = sb6.toString() + " AND " + f247523w;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("conUserWhere", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return str2;
    }

    public void J3() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFilterTimeLineAll", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        C1();
        z3(" where  (sourceType & 2 != 0 )  AND  (snsId != 0  ) ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFilterTimeLineAll", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public final android.database.Cursor K1(boolean z17, java.lang.String str, int i17, boolean z18, java.lang.String str2, int i18, int i19) {
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String G2 = G2(z17, str, z18, false);
        if (b3(str2)) {
            G2 = G2 + " AND " + p1(str2);
        }
        if (i18 != i19) {
            G2 = (G2 + " AND createTime <=  " + i19) + " AND createTime >=  " + i18;
        }
        if (z18) {
            str3 = G2 + f247517q;
        } else {
            str3 = G2 + f247518r;
        }
        if (i17 > 0) {
            str3 = str3 + " LIMIT " + i17;
        }
        android.database.Cursor B2 = this.f247527d.B(str3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return B2;
    }

    public void K3(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFilterTimeLineBelow", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (!b3(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFilterTimeLineBelow", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return;
        }
        C1();
        z3(" where " + u1(str) + " and  (sourceType & 2 != 0 )  and  (snsId != 0  ) ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFilterTimeLineBelow", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public boolean L0(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.SnsInfoStorage", "deleteByLocalId localId:%s", java.lang.Integer.valueOf(i17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(i17);
        boolean z17 = this.f247527d.mo70514xb06685ab(dm.va.f68838xc4fe047c, "rowid=?", new java.lang.String[]{sb6.toString()}) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return z17;
    }

    public final void N3(java.lang.String str, boolean z17, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFilterUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        this.f247527d.A(dm.va.f68838xc4fe047c, "UPDATE SnsInfo SET sourceType = sourceType & " + (~(z17 ? 4 : 8)) + str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFilterUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public boolean O2(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSnsIdExist", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        android.database.Cursor B2 = this.f247527d.B("select *,rowid from SnsInfo  where SnsInfo.snsId=" + j17, null);
        int count = B2.getCount();
        B2.close();
        boolean z17 = count > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsIdExist", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return z17;
    }

    public void O3(java.lang.String str, boolean z17, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFilterUserNameAbove", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String str3 = J0(str, z17) + " AND  (snsId != 0  ) ";
        if (b3(str2)) {
            str3 = str3 + " AND " + o1(str2);
        }
        N3(str, z17, str3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFilterUserNameAbove", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public java.lang.Boolean P0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.SnsInfoStorage", "deleteByUserName userName:%s", str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DELETE FROM SnsInfo where SnsInfo.userName=\"");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("\"");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f247527d.A(dm.va.f68838xc4fe047c, sb6.toString()));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return valueOf;
    }

    public android.database.Cursor P1(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCursorByUserSearch", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String str3 = "select *,rowid from SnsInfo  WHERE " + A;
        if (b3(str)) {
            str3 = str3 + " AND " + z1(str);
        }
        if (b3(str2)) {
            str3 = str3 + " AND " + p1(str2);
        }
        android.database.Cursor B2 = this.f247527d.B(str3 + f247517q, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCursorByUserSearch", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return B2;
    }

    public android.database.Cursor S1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCursorByWsFoldDetailSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFullWsFoldSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFullWsFoldSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str4 = "select *,rowid from SnsInfo  where  (sourceType & 128 != 0 ) ";
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *,rowid from SnsInfo  where  (sourceType & 128 != 0 )  AND SnsInfo.userName=\"");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
            sb6.append(str);
            sb6.append("\"");
            str4 = sb6.toString();
        }
        if (str2 == null || !str2.equals("")) {
            str4 = str4 + " AND " + z1(str2);
        }
        if (b3(str3)) {
            str4 = str4 + " AND " + p1(str3);
        }
        android.database.Cursor B2 = this.f247527d.B(str4 + " " + f247515o, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCursorByWsFoldDetailSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return B2;
    }

    public void S3(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFilterUserNameAll", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        N3(str, z17, J0(str, z17) + " AND  (snsId != 0  ) ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFilterUserNameAll", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public final long T1(java.lang.String str, long j17, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (j17 != 0) {
            str = str + " AND SnsInfo.stringSeq < '" + ca4.z0.A(ca4.z0.t0(j17)) + "'";
        }
        if (z17) {
            str = str + " AND  (snsId != 0 ) ";
        }
        android.database.Cursor B2 = this.f247527d.B((str + f247515o) + " limit " + i17, null);
        if (!B2.moveToLast()) {
            B2.close();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return 0L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        c17933xe8d1b226.mo9015xbf5d97fd(B2);
        B2.close();
        long j18 = c17933xe8d1b226.f68891x29d1292e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return j18;
    }

    public boolean V2(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replace", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (c17933xe8d1b226.m70377x3172ed()) {
            boolean mo11260x413cb2b4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().mo11260x413cb2b4(c17933xe8d1b226.m70351xaa22b9ed());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return mo11260x413cb2b4;
        }
        boolean z17 = this.f247527d.m(dm.va.f68838xc4fe047c, "", c17933xe8d1b226.mo9763xeb27878e()) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return z17;
    }

    public void V3(java.lang.String str, boolean z17, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFilterUserNameBelow", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String str3 = J0(str, z17) + " AND  (snsId != 0  ) ";
        if (b3(str2)) {
            str3 = str3 + " AND " + u1(str2);
        }
        N3(str, z17, str3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFilterUserNameBelow", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        android.database.Cursor f17 = this.f247527d.f("select *,rowid from SnsInfo  where SnsInfo.snsId=" + j17 + " limit 1", null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return null;
        }
        c17933xe8d1b226.mo9015xbf5d97fd(f17);
        f17.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return c17933xe8d1b226;
    }

    public boolean Y2(long j17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replaceUserBySnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (O2(j17)) {
            boolean v37 = v3(j17, c17933xe8d1b226);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceUserBySnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return v37;
        }
        boolean z17 = t3(c17933xe8d1b226) != -1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceUserBySnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return z17;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b1(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.g(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = W0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(str));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return W0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(str));
        if (y07 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 m70298xd15b2ed8 = y07.m70298xd15b2ed8();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return m70298xd15b2ed8;
    }

    public long b2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsTableCount", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.database.Cursor f17 = this.f247527d.f("select count(*) from SnsInfo", null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorage", "sns table count %d passed %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        long j17 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsTableCount", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return j17;
    }

    public final boolean b3(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("seqAvailable", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (str == null || str.equals("")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("seqAvailable", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("seqAvailable", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return true;
    }

    public android.database.Cursor d1(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdCursorForTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = f247514n;
        sb6.append(str2);
        sb6.append(" from SnsInfo where ");
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(sb7);
        C1();
        sb8.append(" (sourceType & 2 != 0 ) ");
        java.lang.String sb9 = sb8.toString();
        if (b3(str)) {
            sb9 = sb9 + " AND " + p1(str);
        }
        android.database.Cursor B2 = this.f247527d.B(((((sb9 + " AND createTime >= " + i17) + " UNION ") + str2 + " from AdSnsInfo where createTime > " + i17 + " and " + f247526z) + f247515o) + " limit " + i18, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdCursorForTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return B2;
    }

    @Override // l75.n0
    /* renamed from: delete */
    public boolean mo70496xb06685ab(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("delete", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.SnsInfoStorage", "delete snsId:%s", java.lang.Long.valueOf(j17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(j17);
        boolean z17 = this.f247527d.mo70514xb06685ab(dm.va.f68838xc4fe047c, "snsId=?", new java.lang.String[]{sb6.toString()}) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delete", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008c A[Catch: all -> 0x00bc, TryCatch #0 {all -> 0x00bc, blocks: (B:3:0x0046, B:5:0x004c, B:8:0x0059, B:11:0x0067, B:13:0x0074, B:15:0x0078, B:18:0x0080, B:23:0x008c, B:26:0x009a, B:29:0x00a4, B:34:0x009f), top: B:2:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[Catch: all -> 0x00bc, TryCatch #0 {all -> 0x00bc, blocks: (B:3:0x0046, B:5:0x004c, B:8:0x0059, B:11:0x0067, B:13:0x0074, B:15:0x0078, B:18:0x0080, B:23:0x008c, B:26:0x009a, B:29:0x00a4, B:34:0x009f), top: B:2:0x0046 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList f1() {
        /*
            r12 = this;
            java.lang.String r0 = "getAllNeedResendSns"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.SnsInfoStorage"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.tencent.mm.plugin.sns.storage.p2 r3 = r12.f247527d
            java.lang.String r4 = "SnsInfo"
            java.lang.String r5 = "*"
            java.lang.String r6 = "rowid"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "createTime >=? AND "
            r6.<init>(r7)
            java.lang.String r7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2.f247525y
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            int r7 = (int) r7
            r8 = 172800(0x2a300, float:2.42144E-40)
            int r7 = r7 - r8
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String[] r7 = new java.lang.String[]{r7}
            r8 = 0
            r9 = 0
            java.lang.String r10 = "createTime ASC"
            r11 = 2
            android.database.Cursor r3 = r3.D(r4, r5, r6, r7, r8, r9, r10, r11)
        L46:
            boolean r4 = r3.moveToNext()     // Catch: java.lang.Throwable -> Lbc
            if (r4 == 0) goto Lb2
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = new com.tencent.mm.plugin.sns.storage.SnsInfo     // Catch: java.lang.Throwable -> Lbc
            r4.<init>()     // Catch: java.lang.Throwable -> Lbc
            r4.mo9015xbf5d97fd(r3)     // Catch: java.lang.Throwable -> Lbc
            int r5 = r4.f38324x142bbdc6     // Catch: java.lang.Throwable -> Lbc
            r6 = -1
            if (r5 == r6) goto L46
            java.lang.String r5 = r4.m70374x6bf53a6c()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r6 = c01.z1.r()     // Catch: java.lang.Throwable -> Lbc
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> Lbc
            if (r5 == 0) goto L46
            java.lang.String r5 = "checkSnsInfoIsFakeVideo"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r5, r6)     // Catch: java.lang.Throwable -> Lbc
            com.tencent.mm.protocal.protobuf.TimeLineObject r7 = r4.m70371x485d7()     // Catch: java.lang.Throwable -> Lbc
            if (r7 == 0) goto L7b
            r45.a90 r7 = r7.f39014x86965dde     // Catch: java.lang.Throwable -> Lbc
            if (r7 == 0) goto L7b
            java.util.LinkedList r7 = r7.f451373h     // Catch: java.lang.Throwable -> Lbc
            goto L7c
        L7b:
            r7 = 0
        L7c:
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L89
            boolean r10 = r7.isEmpty()     // Catch: java.lang.Throwable -> Lbc
            if (r10 == 0) goto L87
            goto L89
        L87:
            r10 = r9
            goto L8a
        L89:
            r10 = r8
        L8a:
            if (r10 != 0) goto L9f
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.Throwable -> Lbc
            r45.jj4 r7 = (r45.jj4) r7     // Catch: java.lang.Throwable -> Lbc
            int r7 = r7.f459389e     // Catch: java.lang.Throwable -> Lbc
            r10 = 8
            if (r7 != r10) goto L99
            goto L9a
        L99:
            r8 = r9
        L9a:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r6)     // Catch: java.lang.Throwable -> Lbc
            r9 = r8
            goto La2
        L9f:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r6)     // Catch: java.lang.Throwable -> Lbc
        La2:
            if (r9 != 0) goto L46
            int r5 = r4.f38324x142bbdc6     // Catch: java.lang.Throwable -> Lbc
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lbc
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lbc
            r2.add(r5)     // Catch: java.lang.Throwable -> Lbc
            r4.m70363x51f8f990()     // Catch: java.lang.Throwable -> Lbc
            goto L46
        Lb2:
            r3.close()
            r2.size()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        Lbc:
            r2 = move-exception
            r3.close()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2.f1():java.util.ArrayList");
    }

    public long f3(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("seqToSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        long longValue = new java.math.BigInteger(str).longValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorage", "seq %s to snsId %d ", str, java.lang.Long.valueOf(longValue));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("seqToSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return longValue;
    }

    public long h2(long j17, int i17, boolean z17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimeLineMaxSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        o2();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMaxSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        long j18 = 0;
        if (j17 != 0) {
            str = "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 )  AND SnsInfo.stringSeq > '" + ca4.z0.A(ca4.z0.t0(j17)) + "'";
        } else {
            str = "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 ) ";
        }
        if (z17) {
            str = str + " AND  (snsId != 0 ) ";
        }
        android.database.Cursor B2 = this.f247527d.B((str + f247515o) + " limit " + i17, null);
        if (B2.moveToFirst()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
            c17933xe8d1b226.mo9015xbf5d97fd(B2);
            B2.close();
            j18 = c17933xe8d1b226.f68891x29d1292e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMaxSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        } else {
            B2.close();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMaxSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeLineMaxSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return j18;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i1(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        android.database.Cursor f17 = this.f247527d.f("select *,rowid from SnsInfo  where SnsInfo.rowid=" + i17, null, 2);
        if (f17.moveToFirst()) {
            c17933xe8d1b226.mo9015xbf5d97fd(f17);
            f17.close();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return c17933xe8d1b226;
        }
        f17.close();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsInfoStorage", "getByLocalId localId:%d find SnsInfo: null ", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return null;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k1(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.g(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i17 = i1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.m(str));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return i17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 L0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().L0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.m(str));
        if (L0 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 m70298xd15b2ed8 = L0.m70298xd15b2ed8();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return m70298xd15b2ed8;
    }

    public long k2(long j17, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimeLineMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        o2();
        long T1 = T1("select *,rowid from SnsInfo  where  (sourceType & 2 != 0 ) ", j17, i17, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeLineMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return T1;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 n1(java.lang.String str) {
        android.database.Cursor D2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getByServerStrId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        if (this.f247528e) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2 p2Var = this.f247527d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(f3("" + str));
            sb6.append("");
            D2 = p2Var.D(dm.va.f68838xc4fe047c, null, "snsId=?", new java.lang.String[]{sb6.toString()}, null, null, null, 2);
        } else {
            D2 = this.f247527d.D(dm.va.f68838xc4fe047c, null, "stringSeq=?", new java.lang.String[]{"" + str}, null, null, null, 2);
        }
        if (!D2.moveToFirst()) {
            D2.close();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getByServerStrId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return null;
        }
        c17933xe8d1b226.mo9015xbf5d97fd(D2);
        D2.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getByServerStrId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return c17933xe8d1b226;
    }

    public final java.lang.String o1(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCDAboveExcudeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (str == null || str.equals("")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCDAboveExcudeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return " ";
        }
        if (this.f247528e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" (snsId > ");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
            sb6.append(f3(str));
            sb6.append(" ) ");
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCDAboveExcudeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return sb7;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(" (stringSeq >\"");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb8.append(str);
        sb8.append("\"  ) ");
        java.lang.String sb9 = sb8.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCDAboveExcudeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return sb9;
    }

    public final java.lang.String o2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimeLineSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        C1();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeLineSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 ) ";
    }

    public final java.lang.String p1(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCDAboveIncludeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (str == null || str.equals("")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCDAboveIncludeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return " ";
        }
        if (this.f247528e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" (snsId >= ");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
            sb6.append(f3(str));
            sb6.append(" ) ");
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCDAboveIncludeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return sb7;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(" (stringSeq >=\"");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb8.append(str);
        sb8.append("\"  ) ");
        java.lang.String sb9 = sb8.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCDAboveIncludeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return sb9;
    }

    @Override // l75.n0
    /* renamed from: replace */
    public /* bridge */ /* synthetic */ boolean mo11260x413cb2b4(l75.f0 f0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replace", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        boolean V2 = V2((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) f0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return V2;
    }

    public int t3(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("set", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("set", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return -1;
        }
        int l17 = (int) this.f247527d.l(dm.va.f68838xc4fe047c, "", c17933xe8d1b226.mo9763xeb27878e());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("set", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return l17;
    }

    public final java.lang.String u1(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCDBelowExculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (str == null || str.equals("")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCDBelowExculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return " ";
        }
        if (this.f247528e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" (snsId < ");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
            sb6.append(f3(str));
            sb6.append(" ) ");
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCDBelowExculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return sb7;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(" (stringSeq <\"");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb8.append(str);
        sb8.append("\"  ) ");
        java.lang.String sb9 = sb8.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCDBelowExculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return sb9;
    }

    @Override // l75.n0
    /* renamed from: update */
    public /* bridge */ /* synthetic */ boolean mo11261xce0038c9(long j17, l75.f0 f0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("update", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        boolean v37 = v3(j17, (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) f0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("update", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return v37;
    }

    public boolean v3(long j17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("update", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        android.content.ContentValues mo9763xeb27878e = c17933xe8d1b226.mo9763xeb27878e();
        mo9763xeb27878e.remove("rowid");
        int p17 = this.f247527d.p(dm.va.f68838xc4fe047c, mo9763xeb27878e, "snsId=?", new java.lang.String[]{"" + j17});
        pb4.e.f434729a.k(c17933xe8d1b226, true);
        boolean z17 = p17 > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("update", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return z17;
    }

    public int w3(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateByLocal", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        android.content.ContentValues mo9763xeb27878e = c17933xe8d1b226.mo9763xeb27878e();
        mo9763xeb27878e.remove("rowid");
        int p17 = this.f247527d.p(dm.va.f68838xc4fe047c, mo9763xeb27878e, "rowid=?", new java.lang.String[]{"" + i17});
        pb4.e.f434729a.k(c17933xe8d1b226, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateByLocal", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return p17;
    }

    public int y2(int i17, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserCountWithLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCheckUserDataCountSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String str2 = "select snsId from SnsInfo " + J0(str, z17) + " AND type in ( 1,2 , 3 , 4 , 18 , 5 , 12 , 9 , 14 , 15 , 13 , 21 , 25 , 26,28,29,30 , 34,45,43,38,53,33,37,36,39,41,42,47,48,44,46,51,52,101,50,54,55,56,59,58) and  (snsId != 0  )  limit " + i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCheckUserDataCountSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        android.database.Cursor B2 = this.f247527d.B(str2, null);
        int count = B2.getCount();
        B2.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserCountWithLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return count;
    }

    public final java.lang.String z1(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCDBelowInculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (str == null || str.equals("")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCDBelowInculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return " ";
        }
        if (this.f247528e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" (snsId <= ");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
            sb6.append(f3(str));
            sb6.append(" ) ");
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCDBelowInculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return sb7;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(" (stringSeq <=\"");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb8.append(str);
        sb8.append("\"  ) ");
        java.lang.String sb9 = sb8.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCDBelowInculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return sb9;
    }

    public final void z3(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFilterTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        this.f247527d.A(dm.va.f68838xc4fe047c, "UPDATE SnsInfo SET sourceType = sourceType & -3" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFilterTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }
}
