package dt4;

/* loaded from: classes8.dex */
public class y extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f324838e = {l75.n0.m145250x3fdc6f77(at4.s1.f95485y, "WalletRegionGreyAreaList")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f324839d;

    public y(l75.k0 k0Var) {
        super(k0Var, at4.s1.f95485y, "WalletRegionGreyAreaList", null);
        this.f324839d = k0Var;
    }

    public at4.s1 y0(int i17) {
        java.lang.String str = "select * from WalletRegionGreyAreaList where wallet_region = " + i17;
        android.database.Cursor f17 = this.f324839d.f(str, null, 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletRegionGreyItemStg", "getWalletRegionGreyItem " + str);
        if (f17 == null) {
            return new at4.s1();
        }
        at4.s1 s1Var = new at4.s1();
        if (f17.moveToNext()) {
            s1Var = new at4.s1();
            s1Var.mo9015xbf5d97fd(f17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletRegionGreyItemStg", "get grey item ");
        f17.close();
        return s1Var;
    }

    public void z0(int i17, r45.k65 k65Var) {
        at4.s1 s1Var = new at4.s1();
        s1Var.f66807x1cb94b75 = i17;
        try {
            s1Var.f66806xe193d106 = k65Var.mo14344x5f01b1f6();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletRegionGreyItemStg", "setWalletRegionGreyItem error " + e17.getMessage());
        }
        super.mo11260x413cb2b4(s1Var);
    }
}
