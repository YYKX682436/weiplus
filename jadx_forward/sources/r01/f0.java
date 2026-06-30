package r01;

/* loaded from: classes8.dex */
public class f0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f449595e = {l75.n0.m145250x3fdc6f77(r01.a0.f449549x, "BizKF")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f449596d;

    public f0(l75.k0 k0Var) {
        super(k0Var, r01.a0.f449549x, "BizKF", null);
        this.f449596d = k0Var;
        k0Var.A("BizKF", "CREATE INDEX IF NOT EXISTS BizKFAppIdUsernameIndex ON BizKF ( brandUsername )");
        k0Var.A("BizKF", "CREATE INDEX IF NOT EXISTS BizKFOpenIdIndex ON BizKF ( openId )");
    }

    public r01.a0 D0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        android.database.Cursor D = this.f449596d.D("BizKF", null, "brandUsername = ? order by kfType desc ", new java.lang.String[]{str}, null, null, null, 2);
        if (D.moveToFirst()) {
            r01.a0 a0Var = new r01.a0();
            a0Var.mo9015xbf5d97fd(D);
            D.close();
            return a0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizKFStorage", "get null with brandUsername:" + str);
        D.close();
        return null;
    }

    @Override // l75.n0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean mo11260x413cb2b4(r01.a0 a0Var) {
        if (a0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a0Var.f66824x996f3ea) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a0Var.f66820x7583f6f8)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizKFStorage", "wrong argument");
            return false;
        }
        boolean z17 = this.f449596d.m("BizKF", r01.a0.f449549x.f398486b, a0Var.mo9763xeb27878e()) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizKFStorage", "replace: openId=%s, brandUsername=%s, ret=%s ", a0Var.f66824x996f3ea, a0Var.f66820x7583f6f8, java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public int y0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return -1;
        }
        int mo70514xb06685ab = this.f449596d.mo70514xb06685ab("BizKF", "brandUsername = ?", new java.lang.String[]{str});
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizKFStorage", "deleteKFWorker by brand username(u:%s, r:%d).", str, java.lang.Integer.valueOf(mo70514xb06685ab));
        return mo70514xb06685ab;
    }

    public r01.a0 z0(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        android.database.Cursor D = this.f449596d.D("BizKF", null, "openId=?", new java.lang.String[]{str}, null, null, null, 2);
        if (!D.moveToFirst()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizKFStorage", "get null with openId:".concat(str));
            D.close();
            return null;
        }
        r01.a0 a0Var = new r01.a0();
        a0Var.mo9015xbf5d97fd(D);
        D.close();
        return a0Var;
    }
}
