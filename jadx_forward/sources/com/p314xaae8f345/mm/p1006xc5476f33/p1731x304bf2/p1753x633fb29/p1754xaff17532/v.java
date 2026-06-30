package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532;

/* loaded from: classes8.dex */
public class v extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f221999d = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n.f221989p0, "GameSilentDownload")};

    public v(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n.f221989p0, "GameSilentDownload", null);
    }

    public boolean D0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "updateDelayState: appid is null");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n y07 = y0(str);
        if (y07 == null) {
            return false;
        }
        y07.f68738x7dba297 = false;
        boolean mo9952xce0038c9 = super.mo9952xce0038c9(y07, new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "updateDelayState, ret:%b", java.lang.Boolean.valueOf(mo9952xce0038c9));
        return mo9952xce0038c9;
    }

    public boolean J0(java.lang.String str, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "updateForceUpdateFlag: appid is null");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n y07 = y0(str);
        if (y07 == null) {
            return false;
        }
        y07.f68743x5f97dfdb = i17;
        boolean mo9952xce0038c9 = super.mo9952xce0038c9(y07, new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "updateForceUpdateFlag, ret:%b", java.lang.Boolean.valueOf(mo9952xce0038c9));
        return mo9952xce0038c9;
    }

    public boolean L0(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "updateRunningState: appid is null");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n y07 = y0(str);
        if (y07 == null) {
            return false;
        }
        y07.f68745xd47e8830 = z17;
        boolean mo9952xce0038c9 = super.mo9952xce0038c9(y07, new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "updateRunningState, ret:%b", java.lang.Boolean.valueOf(mo9952xce0038c9));
        return mo9952xce0038c9;
    }

    public boolean P0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "updateSdcardAvailableState: appid is null");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n y07 = y0(str);
        if (y07 == null) {
            return false;
        }
        y07.f68750x43a9e7a7 = false;
        boolean mo9952xce0038c9 = super.mo9952xce0038c9(y07, new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "updateSdcardAvailableState, ret:%b", java.lang.Boolean.valueOf(mo9952xce0038c9));
        return mo9952xce0038c9;
    }

    public boolean W0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "updateSdcardSpaceState: appid is null");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n y07 = y0(str);
        if (y07 == null) {
            return false;
        }
        y07.f68749x2745fa70 = false;
        boolean mo9952xce0038c9 = super.mo9952xce0038c9(y07, new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "updateSdcardSpaceState, ret:%b", java.lang.Boolean.valueOf(mo9952xce0038c9));
        return mo9952xce0038c9;
    }

    public boolean b1(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "updateWifiState: appid is null");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n y07 = y0(str);
        if (y07 == null) {
            return false;
        }
        y07.f68751x7cd975b = false;
        boolean mo9952xce0038c9 = super.mo9952xce0038c9(y07, new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "updateWifiState, ret:%b", java.lang.Boolean.valueOf(mo9952xce0038c9));
        return mo9952xce0038c9;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n y0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "getDownloadInfo: appid is null");
            return null;
        }
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980(java.lang.String.format("select * from %s where %s=?", "GameSilentDownload", "appId"), str);
        if (m145256x1d3f4980 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "cursor is null");
            return null;
        }
        if (!m145256x1d3f4980.moveToFirst()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "getDownloadInfo appid:%s, no record in DB", str);
            m145256x1d3f4980.close();
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n();
        nVar.mo9015xbf5d97fd(m145256x1d3f4980);
        m145256x1d3f4980.close();
        return nVar;
    }

    public boolean z0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "updateBatteryState: appid is null");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n y07 = y0(str);
        if (y07 == null) {
            return false;
        }
        y07.f68746xaaf5307e = false;
        boolean mo9952xce0038c9 = super.mo9952xce0038c9(y07, new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "updateBatteryState, ret:%b", java.lang.Boolean.valueOf(mo9952xce0038c9));
        return mo9952xce0038c9;
    }
}
