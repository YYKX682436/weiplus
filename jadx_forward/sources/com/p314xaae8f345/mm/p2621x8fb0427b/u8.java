package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class u8 extends l75.n0 implements xg3.c0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f277797e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.t8.N, "LBSVerifyMessage")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f277798d;

    public u8(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.t8.N, "LBSVerifyMessage", dm.f7.f318392v);
        this.f277798d = k0Var;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.t8 D0(java.lang.String str, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *, rowid from LBSVerifyMessage  where (sayhiuser = '");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("' or sayhiencryptuser = '");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("') and flag=");
        sb6.append(i17);
        sb6.append(" order by createtime DESC limit 1");
        com.p314xaae8f345.mm.p2621x8fb0427b.t8 t8Var = null;
        android.database.Cursor f17 = this.f277798d.f(sb6.toString(), null, 2);
        if (f17.moveToFirst()) {
            t8Var = new com.p314xaae8f345.mm.p2621x8fb0427b.t8();
            t8Var.mo9015xbf5d97fd(f17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LBSVerifyMessageStorage", "getLBSVerifyMessage, cursor count = 0");
        }
        f17.close();
        return t8Var;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.t8[] J0(java.lang.String str, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *, rowid from LBSVerifyMessage  where sayhiuser = '");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("' or sayhiencryptuser = '");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("' order by createtime DESC limit ");
        sb6.append(i17);
        android.database.Cursor f17 = this.f277798d.f(sb6.toString(), null, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.t8 t8Var = new com.p314xaae8f345.mm.p2621x8fb0427b.t8();
            t8Var.mo9015xbf5d97fd(f17);
            arrayList.add(t8Var);
        }
        f17.close();
        return (com.p314xaae8f345.mm.p2621x8fb0427b.t8[]) arrayList.toArray(new com.p314xaae8f345.mm.p2621x8fb0427b.t8[arrayList.size()]);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.t8[] L0(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LBSVerifyMessageStorage", "getLastRecvLbsMsg fail, talker is null");
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select * from LBSVerifyMessage where isSend = 0 and (sayhiuser = '");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("' or sayhiencryptuser = '");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("') order by createTime DESC limit ");
        sb6.append(i17);
        android.database.Cursor f17 = this.f277798d.f(sb6.toString(), null, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.t8 t8Var = new com.p314xaae8f345.mm.p2621x8fb0427b.t8();
            t8Var.mo9015xbf5d97fd(f17);
            arrayList.add(t8Var);
        }
        f17.close();
        return (com.p314xaae8f345.mm.p2621x8fb0427b.t8[]) arrayList.toArray(new com.p314xaae8f345.mm.p2621x8fb0427b.t8[arrayList.size()]);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.t8 P0() {
        android.database.Cursor f17 = this.f277798d.f("SELECT * FROM " + mo145255x88e404c3() + " where status != 4 ORDER BY createtime DESC LIMIT 1", null, 2);
        if (f17 == null) {
            return null;
        }
        if (!f17.moveToFirst()) {
            f17.close();
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.t8 t8Var = new com.p314xaae8f345.mm.p2621x8fb0427b.t8();
        t8Var.mo9015xbf5d97fd(f17);
        f17.close();
        return t8Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(com.p314xaae8f345.mm.p2621x8fb0427b.t8 t8Var) {
        if (t8Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LBSVerifyMessageStorage", "insert fail, lbsMsg is null");
            return false;
        }
        if (!super.mo880xb970c2b9(t8Var)) {
            return false;
        }
        mo145247xf35bbb4(t8Var.f72763xa3c65b86 + "");
        return true;
    }

    public int f() {
        android.database.Cursor f17 = this.f277798d.f("select count(*) from " + mo145255x88e404c3() + " where status != 4", null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return 0;
        }
        int i17 = f17.getInt(0);
        f17.close();
        return i17;
    }

    @Override // l75.n0
    /* renamed from: getCount */
    public int mo78086x7444f759() {
        android.database.Cursor f17 = this.f277798d.f("select count(*) from " + mo145255x88e404c3(), null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i17;
    }

    public void y0(java.lang.String str) {
        int mo70514xb06685ab = this.f277798d.mo70514xb06685ab(mo145255x88e404c3(), "svrid = '" + str + "'", null);
        if (mo70514xb06685ab > 0) {
            m145262xf35bbb4();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LBSVerifyMessageStorage", "delBySvrId = " + mo70514xb06685ab);
    }

    public void z0(java.lang.String str) {
        int mo70514xb06685ab = this.f277798d.mo70514xb06685ab(mo145255x88e404c3(), "sayhiuser = '" + str + "' or sayhiencryptuser='" + str + "'", null);
        if (mo70514xb06685ab > 0) {
            m145262xf35bbb4();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LBSVerifyMessageStorage", "delByUserName = " + mo70514xb06685ab);
    }
}
