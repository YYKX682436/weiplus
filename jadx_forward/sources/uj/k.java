package uj;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final uj.k f509694a = new uj.k();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f509695b = jz5.h.b(uj.j.f509693d);

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f509695b).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPlayablePkgRecordMgr", "getPkgRecord");
        java.lang.String str = "";
        java.lang.String u17 = a().u("AppID", "");
        java.lang.String u18 = a().u("ModuleName", "");
        int o17 = a().o("VersionType", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPlayablePkgRecordMgr", "getWxaPkg appId:" + u17 + " moduleName:" + u18 + " versionType:" + o17);
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(u18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.da daVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.da.f157025a;
        java.lang.String str2 = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(u17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                str = "$" + a17;
            }
            sb6.append(str);
            str2 = sb6.toString();
        }
        return daVar.b(str2, o17, new java.lang.String[0]);
    }
}
