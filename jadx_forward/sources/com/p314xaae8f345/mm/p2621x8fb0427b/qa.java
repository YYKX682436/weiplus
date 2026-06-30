package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class qa extends l75.n0 implements xg3.s0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f276782e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.pa.H, "shakeverifymessage")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f276783f = {"CREATE INDEX IF NOT EXISTS  shakeverifymessage_unread_index ON shakeverifymessage ( status )", "CREATE INDEX IF NOT EXISTS shakeverifymessage_statusIndex ON shakeverifymessage ( status )", "CREATE INDEX IF NOT EXISTS shakeverifymessage_createtimeIndex ON shakeverifymessage ( createtime )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f276784d;

    public qa(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.pa.H, "shakeverifymessage", f276783f);
        this.f276784d = k0Var;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.pa[] D0(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShakeVerifyMessageStorage", "getLastRecvShakeMsg fail, talker is null");
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select * from ShakeVerifyMessage where isSend = 0 and sayhiuser = '");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("' order by createTime DESC limit ");
        sb6.append(i17);
        android.database.Cursor f17 = this.f276784d.f(sb6.toString(), null, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.pa paVar = new com.p314xaae8f345.mm.p2621x8fb0427b.pa();
            paVar.mo9015xbf5d97fd(f17);
            arrayList.add(paVar);
        }
        f17.close();
        if (arrayList.size() == 0) {
            return null;
        }
        return (com.p314xaae8f345.mm.p2621x8fb0427b.pa[]) arrayList.toArray(new com.p314xaae8f345.mm.p2621x8fb0427b.pa[arrayList.size()]);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.pa[] J0(java.lang.String str, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *, rowid from ShakeVerifyMessage  where sayhiuser = '");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("' order by createtime DESC limit ");
        sb6.append(i17);
        android.database.Cursor f17 = this.f276784d.f(sb6.toString(), null, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.pa paVar = new com.p314xaae8f345.mm.p2621x8fb0427b.pa();
            paVar.mo9015xbf5d97fd(f17);
            arrayList.add(paVar);
        }
        f17.close();
        if (arrayList.size() == 0) {
            return null;
        }
        return (com.p314xaae8f345.mm.p2621x8fb0427b.pa[]) arrayList.toArray(new com.p314xaae8f345.mm.p2621x8fb0427b.pa[arrayList.size()]);
    }

    @Override // l75.n0, l75.g0
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(com.p314xaae8f345.mm.p2621x8fb0427b.pa paVar) {
        if (paVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShakeVerifyMessageStorage", "insert fail, shakeMsg is null");
            return false;
        }
        if (!super.mo880xb970c2b9(paVar)) {
            return false;
        }
        mo145247xf35bbb4(paVar.f72763xa3c65b86 + "");
        return true;
    }

    public int f() {
        android.database.Cursor f17 = this.f276784d.f("select count(*) from " + mo145255x88e404c3() + " where status != 4", null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return 0;
        }
        int i17 = f17.getInt(0);
        f17.close();
        if (i17 > 0) {
            return i17;
        }
        return 0;
    }

    @Override // l75.n0
    /* renamed from: getCount */
    public int mo78086x7444f759() {
        android.database.Cursor f17 = this.f276784d.f("select count(*) from " + mo145255x88e404c3(), null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return 0;
        }
        int i17 = f17.getInt(0);
        f17.close();
        if (i17 > 0) {
            return i17;
        }
        return 0;
    }

    public void y0(java.lang.String str) {
        int mo70514xb06685ab = this.f276784d.mo70514xb06685ab(mo145255x88e404c3(), "svrid = '" + str + "'", null);
        if (mo70514xb06685ab > 0) {
            m145262xf35bbb4();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeVerifyMessageStorage", "delBySvrId = " + mo70514xb06685ab);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.pa z0() {
        android.database.Cursor f17 = this.f276784d.f("SELECT * FROM " + mo145255x88e404c3() + " ORDER BY createtime DESC LIMIT 1", null, 2);
        if (f17 == null) {
            return null;
        }
        if (!f17.moveToFirst()) {
            f17.close();
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.pa paVar = new com.p314xaae8f345.mm.p2621x8fb0427b.pa();
        paVar.mo9015xbf5d97fd(f17);
        f17.close();
        return paVar;
    }
}
