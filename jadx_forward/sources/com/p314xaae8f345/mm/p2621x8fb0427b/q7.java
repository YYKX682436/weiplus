package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class q7 extends l75.n0 implements xg3.z {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f276776f = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.p7.H, "fmessage_msginfo")};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f276777g = {"CREATE INDEX IF NOT EXISTS  fmessageTalkerIndex ON fmessage_msginfo ( talker )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f276778d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.r7 f276779e;

    public q7(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.p7.H, "fmessage_msginfo", f276777g);
        this.f276778d = k0Var;
        this.f276779e = new com.p314xaae8f345.mm.p2621x8fb0427b.r7(this, k0Var);
    }

    public boolean D0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageMsgInfoStorage", "deleteByTalker fail, talker is null");
            return false;
        }
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FMessageMsgInfoStorage", "deleteByTalker() called with: talker = [" + str + "]");
        }
        return this.f276778d.mo70514xb06685ab("fmessage_msginfo", "talker = ?", new java.lang.String[]{str}) > 0;
    }

    public java.util.List J0(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f276778d.f("select *, rowid from fmessage_msginfo where type = " + i17, null, 2);
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.p7 p7Var = new com.p314xaae8f345.mm.p2621x8fb0427b.p7();
            p7Var.mo9015xbf5d97fd(f17);
            arrayList.add(p7Var);
        }
        f17.close();
        arrayList.size();
        return arrayList;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.p7[] L0(java.lang.String str, int i17) {
        android.database.Cursor f17 = this.f276778d.f("select *, rowid from fmessage_msginfo  where talker = ? order by createTime DESC limit " + i17, new java.lang.String[]{str}, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.p7 p7Var = new com.p314xaae8f345.mm.p2621x8fb0427b.p7();
            p7Var.mo9015xbf5d97fd(f17);
            arrayList.add(p7Var);
        }
        f17.close();
        return (com.p314xaae8f345.mm.p2621x8fb0427b.p7[]) arrayList.toArray(new com.p314xaae8f345.mm.p2621x8fb0427b.p7[arrayList.size()]);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.p7[] P0(java.lang.String str, java.lang.String str2, int i17) {
        android.database.Cursor f17;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
        l75.k0 k0Var = this.f276778d;
        if (K0) {
            f17 = k0Var.f("select *, rowid from fmessage_msginfo  where talker = ? order by createTime DESC limit " + i17, new java.lang.String[]{str}, 2);
        } else {
            f17 = k0Var.f("select *, rowid from fmessage_msginfo  where talker = ? or talker = ? order by createTime DESC limit " + i17, new java.lang.String[]{str, str2}, 2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.p7 p7Var = new com.p314xaae8f345.mm.p2621x8fb0427b.p7();
            p7Var.mo9015xbf5d97fd(f17);
            arrayList.add(p7Var);
        }
        f17.close();
        return (com.p314xaae8f345.mm.p2621x8fb0427b.p7[]) arrayList.toArray(new com.p314xaae8f345.mm.p2621x8fb0427b.p7[arrayList.size()]);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.p7 W0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageMsgInfoStorage", "getLastFMsg fail, talker is null");
            return null;
        }
        android.database.Cursor f17 = this.f276778d.f("select * from fmessage_msginfo where talker = ? order by createTime DESC limit 1", new java.lang.String[]{str}, 2);
        com.p314xaae8f345.mm.p2621x8fb0427b.p7 p7Var = new com.p314xaae8f345.mm.p2621x8fb0427b.p7();
        if (f17.moveToFirst()) {
            p7Var.mo9015xbf5d97fd(f17);
        }
        f17.close();
        return p7Var;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.p7 b1(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.p7[] d17 = d1(str, 1);
        if (d17 == null || d17.length <= 0) {
            return null;
        }
        return d17[0];
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.p7[] d1(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageMsgInfoStorage", "getLastRecvFMsg fail, talker is null");
            return null;
        }
        android.database.Cursor f17 = this.f276778d.f("select * from fmessage_msginfo where isSend != 1 and talker = ? order by createTime DESC limit " + i17, new java.lang.String[]{str}, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.p7 p7Var = new com.p314xaae8f345.mm.p2621x8fb0427b.p7();
            p7Var.mo9015xbf5d97fd(f17);
            arrayList.add(p7Var);
        }
        f17.close();
        return (com.p314xaae8f345.mm.p2621x8fb0427b.p7[]) arrayList.toArray(new com.p314xaae8f345.mm.p2621x8fb0427b.p7[arrayList.size()]);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.p7[] f1(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageMsgInfoStorage", "getLastRecvFMsg fail, talker is null");
            return null;
        }
        android.database.Cursor f17 = this.f276778d.f("select * from fmessage_msginfo where isSend != 1 and encryptTalker = ? order by createTime DESC limit " + i17, new java.lang.String[]{str}, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.p7 p7Var = new com.p314xaae8f345.mm.p2621x8fb0427b.p7();
            p7Var.mo9015xbf5d97fd(f17);
            arrayList.add(p7Var);
        }
        f17.close();
        return (com.p314xaae8f345.mm.p2621x8fb0427b.p7[]) arrayList.toArray(new com.p314xaae8f345.mm.p2621x8fb0427b.p7[arrayList.size()]);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.p7 i1(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.r7 r7Var = this.f276779e;
        r7Var.getClass();
        if (z3Var == null) {
            return null;
        }
        java.lang.String d17 = z3Var.d1();
        java.lang.String J0 = z3Var.J0();
        com.p314xaae8f345.mm.p2621x8fb0427b.p7 b17 = r7Var.b(d17);
        return b17 == null ? r7Var.b(J0) : b17;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(com.p314xaae8f345.mm.p2621x8fb0427b.p7 p7Var) {
        if (p7Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageMsgInfoStorage", "insert fail, fmsgInfo is null");
            return false;
        }
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            p7Var.mo124851xcc313de3().toString();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        }
        if (!super.mo880xb970c2b9(p7Var)) {
            return false;
        }
        mo145247xf35bbb4(p7Var.f72763xa3c65b86 + "");
        return true;
    }

    public void y0(com.p314xaae8f345.mm.p2621x8fb0427b.p7 insertMsgInfo) {
        com.p314xaae8f345.mm.p2621x8fb0427b.r7 r7Var = this.f276779e;
        r7Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insertMsgInfo, "insertMsgInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FMessageMsgInfoStorage", "beforeInsertVerify insertMsgInfo type:" + insertMsgInfo.f66494x2262335f + " isSender:" + insertMsgInfo.f66490xff7bdab7);
        boolean z17 = true;
        if (insertMsgInfo.f66494x2262335f != 1) {
            return;
        }
        java.lang.String str = insertMsgInfo.f66493x114ef53e;
        java.lang.String str2 = insertMsgInfo.f66488x5285fa99;
        com.p314xaae8f345.mm.p2621x8fb0427b.p7 b17 = r7Var.b(str);
        if (b17 != null && b17.f66489x8af1dc48 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FMessageMsgInfoStorage", "beforeInsertVerify need delete old fMsgInfos talker:" + str + " enTalker:" + str2);
            if (str != null && !r26.n0.N(str)) {
                z17 = false;
            }
            if (z17) {
                return;
            }
            r7Var.f276810a.D0(str);
        }
    }

    public boolean z0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageMsgInfoStorage", "deleteByEncryptTalker fail, encryptTalker is null");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FMessageMsgInfoStorage", "deleteByEncryptTalker() called with: encryptTalker = [" + str + "]");
        return this.f276778d.mo70514xb06685ab("fmessage_msginfo", "encryptTalker = ?", new java.lang.String[]{str}) > 0;
    }
}
