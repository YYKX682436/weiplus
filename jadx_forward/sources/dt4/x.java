package dt4;

/* loaded from: classes9.dex */
public class x extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f324836e = {l75.n0.m145250x3fdc6f77(at4.m1.D, "WalletPrefInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f324837d;

    public x(l75.k0 k0Var) {
        super(k0Var, at4.m1.D, "WalletPrefInfo", null);
        this.f324837d = k0Var;
    }

    public boolean y0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        return this.f324837d.A("WalletPrefInfo", "delete from WalletPrefInfo where pref_key='" + str + "'");
    }

    public at4.m1 z0(java.lang.String str) {
        at4.m1 m1Var = null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            android.database.Cursor f17 = this.f324837d.f("select * from WalletPrefInfo where pref_key=?", new java.lang.String[]{str}, 2);
            if (f17 == null) {
                return null;
            }
            if (f17.moveToFirst()) {
                m1Var = new at4.m1();
                m1Var.mo9015xbf5d97fd(f17);
            }
            f17.close();
        }
        return m1Var;
    }
}
