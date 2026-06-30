package dt4;

/* loaded from: classes9.dex */
public class w extends l75.n0 implements qg0.d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f324833e = {l75.n0.m145250x3fdc6f77(at4.k1.f95420J, "WalletLuckyMoney")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f324834f = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f324835d;

    public w(l75.k0 k0Var) {
        super(k0Var, at4.k1.f95420J, "WalletLuckyMoney", null);
        this.f324835d = k0Var;
    }

    public at4.k1 D0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.util.Map map = f324834f;
        if (((java.util.HashMap) map).containsKey(str)) {
            return (at4.k1) ((java.util.HashMap) map).get(str);
        }
        at4.k1 z07 = z0(str);
        if (z07 == null) {
            return null;
        }
        ((java.util.HashMap) map).put(str, z07);
        return z07;
    }

    @Override // l75.n0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean mo11260x413cb2b4(at4.k1 k1Var) {
        if (k1Var != null) {
            java.util.Map map = f324834f;
            if (((java.util.HashMap) map).containsKey(k1Var.f66558xf7c5f050)) {
                ((java.util.HashMap) map).put(k1Var.f66558xf7c5f050, k1Var);
            }
        }
        return super.mo11260x413cb2b4(k1Var);
    }

    public at4.k1 y0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        try {
            android.database.Cursor D = this.f324835d.D("WalletLuckyMoney", new java.lang.String[]{"*"}, "sendId=?", new java.lang.String[]{str}, null, null, null, 2);
            try {
                if (!D.moveToFirst()) {
                    D.close();
                    D.close();
                    return null;
                }
                at4.k1 k1Var = new at4.k1();
                k1Var.mo9015xbf5d97fd(D);
                D.close();
                D.close();
                return k1Var;
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletLuckyMoneyStg", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public at4.k1 z0(java.lang.String str) {
        android.database.Cursor B = this.f324835d.B("select * from WalletLuckyMoney where mNativeUrl=?", new java.lang.String[]{str});
        if (B == null) {
            return null;
        }
        if (B.getCount() == 0) {
            B.close();
            return null;
        }
        B.moveToFirst();
        at4.k1 k1Var = new at4.k1();
        k1Var.mo9015xbf5d97fd(B);
        B.close();
        return k1Var;
    }
}
