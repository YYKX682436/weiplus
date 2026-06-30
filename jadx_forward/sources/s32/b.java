package s32;

/* loaded from: classes12.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f483993e = {l75.n0.m145250x3fdc6f77(r32.a.f450492r, "HardDeviceChampionInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f483994d;

    public b(l75.k0 k0Var) {
        super(k0Var, r32.a.f450492r, "HardDeviceChampionInfo", null);
        this.f483994d = k0Var;
        k0Var.A("HardDeviceChampionInfo", "CREATE INDEX IF NOT EXISTS ExdeviceRankChampionInfoRankIdAppNameIndex ON HardDeviceChampionInfo ( username )");
    }

    public r32.a y0(java.lang.String str) {
        java.lang.String format = java.lang.String.format("select *, rowid from %s where %s = ? limit 1", "HardDeviceChampionInfo", dm.i4.f66875xa013b0d5);
        java.lang.String[] strArr = new java.lang.String[1];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        strArr[0] = str;
        android.database.Cursor f17 = this.f483994d.f(format, strArr, 2);
        r32.a aVar = null;
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceRankChampionStg", "Get no rank in DB");
            return null;
        }
        if (f17.moveToFirst()) {
            aVar = new r32.a();
            aVar.mo9015xbf5d97fd(f17);
        }
        f17.close();
        return aVar;
    }

    public boolean z0(r32.a aVar, boolean z17) {
        iz5.a.g(null, aVar != null);
        if (mo9952xce0038c9(aVar, dm.i4.f66875xa013b0d5)) {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.hj().a("HardDeviceChampionInfo", new q32.d(null, null, aVar.f66506xdec927b));
            }
            return true;
        }
        if (!mo880xb970c2b9(aVar)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExdeviceRankChampionStg", "hy: insert or update failed");
            return false;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.hj().a("HardDeviceChampionInfo", new q32.d(null, null, aVar.f66506xdec927b));
        }
        return true;
    }
}
