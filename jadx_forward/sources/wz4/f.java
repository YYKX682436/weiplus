package wz4;

/* loaded from: classes8.dex */
public class f extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f532334f = {l75.n0.m145250x3fdc6f77(wz4.e.C1, "WepkgVersion")};

    /* renamed from: g, reason: collision with root package name */
    public static volatile wz4.f f532335g = null;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f532336d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f532337e;

    public f(l75.k0 k0Var) {
        super(k0Var, wz4.e.C1, "WepkgVersion", dm.pc.G);
        this.f532337e = k0Var;
        boolean z17 = k0Var != null;
        this.f532336d = z17;
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WepkgVersionStorage", "storage can not work!!!");
    }

    public static wz4.f L0() {
        if (!gm0.j1.a()) {
            return new wz4.f(null);
        }
        if (f532335g == null) {
            synchronized (wz4.f.class) {
                if (f532335g == null || !f532335g.f532336d) {
                    f532335g = new wz4.f(gm0.j1.u().f354686f);
                }
            }
        }
        return f532335g;
    }

    public wz4.e D0(java.lang.String str) {
        if (this.f532336d && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980(java.lang.String.format("select * from %s where %s=?", "WepkgVersion", "pkgId"), str);
            if (m145256x1d3f4980.moveToFirst()) {
                wz4.e eVar = new wz4.e();
                eVar.mo9015xbf5d97fd(m145256x1d3f4980);
                m145256x1d3f4980.close();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgid exist record in DB, pkgid:%s, version:%s", eVar.f67980x29a55882, eVar.f67986x8987ca93);
                return eVar;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgid pkgid:%s, no record in DB", str);
            m145256x1d3f4980.close();
        }
        return null;
    }

    public wz4.e J0(java.lang.String str) {
        if (this.f532336d && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980(java.lang.String.format("select * from %s where %s=? and %s=0", "WepkgVersion", "pkgId", "disable"), str);
            if (m145256x1d3f4980.moveToFirst()) {
                wz4.e eVar = new wz4.e();
                eVar.mo9015xbf5d97fd(m145256x1d3f4980);
                m145256x1d3f4980.close();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgidWithAble exist record in DB, pkgid:%s, version:%s, disableWvCache:%s, clearPkgTime:%s, checkIntervalTime:%s, domain:%s, bigPackageReady:%s, preloadFilesReady:%s, preloadFilesAtomic:%s, disable:%s", eVar.f67980x29a55882, eVar.f67986x8987ca93, java.lang.Boolean.valueOf(eVar.f67971x721c7dc0), java.lang.Long.valueOf(eVar.f67968xebe402d1), java.lang.Long.valueOf(eVar.f67967xb432ae55), eVar.f67972xf6c703a9, java.lang.Boolean.valueOf(eVar.f67965xe96d84d8), java.lang.Boolean.valueOf(eVar.f67984xc5b53450), java.lang.Boolean.valueOf(eVar.f67983xd4c8d11e), java.lang.Boolean.valueOf(eVar.f67970xd830d0a3));
                java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270034a;
                eVar.f67962x75155eb6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                super.mo9952xce0038c9(eVar, new java.lang.String[0]);
                return eVar;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgidWithAble pkgid:%s, no record in DB", str);
            m145256x1d3f4980.close();
        }
        return null;
    }

    public boolean P0(java.lang.String str) {
        if (!this.f532336d || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        wz4.e D0 = D0(str);
        if (D0 == null) {
            return true;
        }
        D0.f67970xd830d0a3 = true;
        boolean mo9952xce0038c9 = super.mo9952xce0038c9(D0, new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "setWepkgDisable pkgid:%s, ret:%s", str, java.lang.Boolean.valueOf(mo9952xce0038c9));
        return mo9952xce0038c9;
    }

    public boolean W0(java.lang.String str, java.lang.String str2, boolean z17) {
        wz4.e D0;
        if (!this.f532336d || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (D0 = D0(str)) == null) {
            return false;
        }
        D0.f67965xe96d84d8 = z17;
        D0.f67981x55b471cc = str2;
        boolean mo9952xce0038c9 = super.mo9952xce0038c9(D0, new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "updateBigPackageReady pkgid:%s, pkgPath:%s, bigPackageReady:%b, ret:%s", str, str2, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(mo9952xce0038c9));
        return mo9952xce0038c9;
    }

    public boolean b1(java.lang.String str) {
        wz4.e D0;
        if (!this.f532336d || (D0 = D0(str)) == null) {
            return false;
        }
        java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270034a;
        D0.f67977xa5c53bd = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + D0.f67967xb432ae55;
        boolean mo9952xce0038c9 = super.mo9952xce0038c9(D0, new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "updateCheckTime pkgid:%s, ret:%s", str, java.lang.Boolean.valueOf(mo9952xce0038c9));
        return mo9952xce0038c9;
    }

    public boolean d1(java.lang.String str, boolean z17, long j17, long j18) {
        wz4.e D0;
        if (!this.f532336d || (D0 = D0(str)) == null) {
            return false;
        }
        D0.f67971x721c7dc0 = z17;
        D0.f67968xebe402d1 = j17;
        D0.f67977xa5c53bd = (D0.f67977xa5c53bd - D0.f67967xb432ae55) + j18;
        D0.f67967xb432ae55 = j18;
        D0.f67970xd830d0a3 = false;
        boolean mo9952xce0038c9 = super.mo9952xce0038c9(D0, new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "updateConfigInfo pkgid:%s, disableWvCache:%s, clearPkgTime:%s, checkIntervalTime:%s, ret:%s", str, java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(mo9952xce0038c9));
        return mo9952xce0038c9;
    }

    public boolean f1(java.lang.String str) {
        wz4.e D0;
        if (!this.f532336d || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (D0 = D0(str)) == null) {
            return false;
        }
        D0.f67969xac3be4e = 0L;
        boolean mo9952xce0038c9 = super.mo9952xce0038c9(D0, new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "updateCreateTimeToZero pkgid:%s, ret:%s", str, java.lang.Boolean.valueOf(mo9952xce0038c9));
        return mo9952xce0038c9;
    }

    public boolean i1(java.lang.String str, boolean z17) {
        wz4.e D0;
        if (!this.f532336d || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (D0 = D0(str)) == null) {
            return false;
        }
        D0.f67984xc5b53450 = z17;
        boolean mo9952xce0038c9 = super.mo9952xce0038c9(D0, new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "updatePreloadFilesReady pkgid:%s, preloadFilesReady:%b, ret:%s", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(mo9952xce0038c9));
        return mo9952xce0038c9;
    }

    public final boolean y0(java.lang.String str) {
        if (!this.f532336d || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord addAutoDownloadCount ret:%s", java.lang.Boolean.valueOf(m145253xb158737d("WepkgVersion", java.lang.String.format("update %s set %s=%s+1 where %s='%s'", "WepkgVersion", "autoDownloadCount", "autoDownloadCount", "pkgId", str))));
        return true;
    }

    public boolean z0(java.lang.String str) {
        if (!this.f532336d || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        wz4.e eVar = new wz4.e();
        eVar.f67980x29a55882 = str;
        boolean mo9951xb06685ab = super.mo9951xb06685ab(eVar, new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "deleteRecordByPkgid pkgid:%s, ret:%s", str, java.lang.Boolean.valueOf(mo9951xb06685ab));
        return mo9951xb06685ab;
    }
}
