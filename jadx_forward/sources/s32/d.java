package s32;

/* loaded from: classes12.dex */
public class d extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f483996e = {l75.n0.m145250x3fdc6f77(r32.d.B, "HardDeviceRankInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f483997d;

    public d(l75.k0 k0Var) {
        super(k0Var, r32.d.B, "HardDeviceRankInfo", null);
        this.f483997d = k0Var;
        k0Var.A("HardDeviceRankInfo", "CREATE INDEX IF NOT EXISTS ExdeviceRankInfoRankIdAppNameIndex ON HardDeviceRankInfo ( rankID, appusername )");
    }

    public boolean D0(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(kk.k.g(str.getBytes()).toString() + "FileSelectorUI_LastSelectedTab");
        boolean i17 = M.i("MMKV_KEY_NEED_DELETE_DB", false);
        M.G("MMKV_KEY_NEED_DELETE_DB", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceRankInfoStg", "isNeedDeleteAllData() called result:%s", java.lang.Boolean.valueOf(i17));
        return i17;
    }

    public void J0(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceRankInfoStg", "markNeedDeleteAllData() called");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(kk.k.g(str.getBytes()).toString() + "FileSelectorUI_LastSelectedTab").G("MMKV_KEY_NEED_DELETE_DB", true);
    }

    public boolean L0(r32.d dVar, boolean z17) {
        iz5.a.g(null, dVar != null);
        r32.d y07 = y0(new q32.d(dVar.f67219xde6292c, dVar.f67217x84a2aa32, dVar.f67224xdec927b));
        if (y07 == null) {
            return false;
        }
        y07.f67218x9113f2d3 = dVar.f67218x9113f2d3;
        y07.f67222x3a0346c9 = dVar.f67222x3a0346c9;
        mo9952xce0038c9(y07, "rankID", dm.i4.f66875xa013b0d5);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.hj().a("HardDeviceRankInfo", new q32.d(dVar.f67219xde6292c, dVar.f67217x84a2aa32, dVar.f67224xdec927b));
        }
        return true;
    }

    public r32.d y0(q32.d dVar) {
        r32.d dVar2 = null;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceRankInfoStg", "hy: param error");
            return null;
        }
        java.lang.String format = java.lang.String.format("select *, rowid from %s where %s = ? and %s = ? limit 1", "HardDeviceRankInfo", "rankID", dm.i4.f66875xa013b0d5);
        java.lang.String[] strArr = new java.lang.String[2];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str = dVar.f441463a;
        if (str == null) {
            str = "";
        }
        strArr[0] = str;
        java.lang.String str2 = dVar.f441464b;
        strArr[1] = str2 != null ? str2 : "";
        android.database.Cursor f17 = this.f483997d.f(format, strArr, 2);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
            return null;
        }
        if (f17.moveToFirst()) {
            dVar2 = new r32.d();
            dVar2.mo9015xbf5d97fd(f17);
        }
        f17.close();
        return dVar2;
    }

    public boolean z0(r32.d dVar, boolean z17) {
        if (L0(dVar, z17)) {
            return true;
        }
        mo880xb970c2b9(dVar);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.hj().a("HardDeviceRankInfo", new q32.d(dVar.f67219xde6292c, dVar.f67217x84a2aa32, dVar.f67224xdec927b));
        }
        return true;
    }
}
