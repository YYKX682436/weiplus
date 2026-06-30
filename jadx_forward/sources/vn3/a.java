package vn3;

/* loaded from: classes13.dex */
public class a extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f519958e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.d.L, "NewTipsInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f519959d;

    public a(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.d.L, "NewTipsInfo", null);
        this.f519959d = k0Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean mo9952xce0038c9(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.d dVar, java.lang.String... strArr) {
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTipsCompatInfoStorage", "NewTipsCompatInfo is null!");
            return false;
        }
        boolean mo51732xbf274172 = super.mo51732xbf274172(dVar, false, strArr);
        if (mo51732xbf274172) {
            mo142179xf35bbb4(dVar.f67242x29dcef91 + "", 3, java.lang.Integer.valueOf(dVar.f67242x29dcef91));
        }
        return mo51732xbf274172;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.d y0(int i17) {
        l75.k0 k0Var = this.f519959d;
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTipsCompatInfoStorage", "getByTipsId, but db is null, return");
            return null;
        }
        android.database.Cursor D = k0Var.D("NewTipsInfo", null, "tipId=?", new java.lang.String[]{"" + i17}, null, null, null, 2);
        if (!D.moveToFirst()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NewTipsCompatInfoStorage", "getByTipsId:%d, no data", java.lang.Integer.valueOf(i17));
            D.close();
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.d();
        try {
            dVar.mo9015xbf5d97fd(D);
            D.close();
            return dVar;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTipsCompatInfoStorage", "getByTipsId convertFrom(cu) cause IlleagalStateException, return null");
            D.close();
            return null;
        }
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.d dVar) {
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTipsCompatInfoStorage", "NewTipsCompatInfo is null!");
            return false;
        }
        int i17 = dVar.f67242x29dcef91;
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTipsCompatInfoStorage", "newTipsId is error, tipsId = %s", java.lang.Integer.valueOf(i17));
            return false;
        }
        boolean mo51731x24249762 = mo51731x24249762(dVar, false);
        if (mo51731x24249762) {
            mo142179xf35bbb4(dVar.f67242x29dcef91 + "", 2, java.lang.Integer.valueOf(dVar.f67242x29dcef91));
        }
        return mo51731x24249762;
    }
}
