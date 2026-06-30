package s83;

/* loaded from: classes4.dex */
public class k extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f486416e = {l75.n0.m145250x3fdc6f77(s83.i.f486414r, "IPCallPopularCountry")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f486417d;

    public k(l75.k0 k0Var) {
        super(k0Var, s83.i.f486414r, "IPCallPopularCountry", null);
        new s83.j(this);
        this.f486417d = k0Var;
    }

    @Override // l75.n0
    /* renamed from: getTableName */
    public java.lang.String mo145255x88e404c3() {
        return "IPCallPopularCountry";
    }

    public void y0(int i17, long j17) {
        boolean mo11260x413cb2b4;
        s83.i iVar = new s83.i();
        android.database.Cursor D = this.f486417d.D("IPCallPopularCountry", null, "countryCode=?", new java.lang.String[]{java.lang.Integer.toString(i17)}, null, null, null, 2);
        if (D.moveToFirst()) {
            iVar.mo9015xbf5d97fd(D);
            iVar.f68049xf7d16aff++;
            iVar.f68051x9b559226 = j17;
            mo11260x413cb2b4 = super.mo11260x413cb2b4(iVar);
            D.close();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallPopularCountryStorage", "get null with countryCode:" + i17);
            D.close();
            iVar.f68050x13b516de = i17;
            iVar.f68051x9b559226 = j17;
            iVar.f68049xf7d16aff = 1L;
            mo11260x413cb2b4 = mo880xb970c2b9(iVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallPopularCountryStorage", "updatePopularCountryCode ret:" + mo11260x413cb2b4);
    }
}
