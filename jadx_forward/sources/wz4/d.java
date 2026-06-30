package wz4;

/* loaded from: classes8.dex */
public class d extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f532330f = {l75.n0.m145250x3fdc6f77(wz4.c.N, "WepkgPreloadFiles")};

    /* renamed from: g, reason: collision with root package name */
    public static volatile wz4.d f532331g = null;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f532332d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f532333e;

    public d(l75.k0 k0Var) {
        super(k0Var, wz4.c.N, "WepkgPreloadFiles", dm.oc.f320568v);
        this.f532333e = k0Var;
        boolean z17 = k0Var != null;
        this.f532332d = z17;
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "storage can not work!!!");
    }

    public static wz4.d J0() {
        if (!gm0.j1.a()) {
            return new wz4.d(null);
        }
        if (f532331g == null) {
            synchronized (wz4.d.class) {
                if (f532331g == null || !f532331g.f532332d) {
                    f532331g = new wz4.d(gm0.j1.u().f354686f);
                }
            }
        }
        return f532331g;
    }

    public wz4.c D0(java.lang.String str, java.lang.String str2) {
        if (this.f532332d && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980(java.lang.String.format("select * from %s where %s=?", "WepkgPreloadFiles", "key"), com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.c(str, str2));
            if (m145256x1d3f4980.moveToFirst()) {
                wz4.c cVar = new wz4.c();
                cVar.mo9015xbf5d97fd(m145256x1d3f4980);
                m145256x1d3f4980.close();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getRecordByRid exist record in DB, pkgid:%s, rid:%s, version:%s", cVar.f67864x29a55882, cVar.f67865x4b6e7c48, cVar.f67867x8987ca93);
                return cVar;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getRecordByRid pkgid:%s, rid:%s, no record in DB", str, str2);
            m145256x1d3f4980.close();
        }
        return null;
    }

    public boolean L0(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        wz4.c D0;
        if (!this.f532332d || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || (D0 = D0(str, str2)) == null) {
            return false;
        }
        D0.f67855xdf7ba986 = z17;
        D0.f67860xf1e9b966 = str3;
        boolean mo9952xce0038c9 = super.mo9952xce0038c9(D0, new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "updateDownloadCompleteState pkgid:%s, rid:%s, completeDownload:%s, filePath:%s, ret:%s", str, str2, java.lang.Boolean.valueOf(z17), str3, java.lang.Boolean.valueOf(mo9952xce0038c9));
        return mo9952xce0038c9;
    }

    public boolean y0(java.lang.String str) {
        if (!this.f532332d || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        wz4.c cVar = new wz4.c();
        cVar.f67864x29a55882 = str;
        boolean mo9951xb06685ab = super.mo9951xb06685ab(cVar, "pkgId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "deleteRecordByPkgid pkgid:%s, ret:%s", str, java.lang.Boolean.valueOf(mo9951xb06685ab));
        return mo9951xb06685ab;
    }

    public java.util.List z0(java.lang.String str) {
        if (!this.f532332d && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.lang.String format = java.lang.String.format("select * from %s where %s=? and %s=0", "WepkgPreloadFiles", "pkgId", "completeDownload");
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980(format, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getNeedDownloadPreLoadFileList queryStr:%s", format);
        if (m145256x1d3f4980 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "cursor is null");
            return null;
        }
        if (!m145256x1d3f4980.moveToFirst()) {
            m145256x1d3f4980.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "no record");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        do {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27 c19542xf3901c27 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27();
            wz4.c cVar = new wz4.c();
            cVar.mo9015xbf5d97fd(m145256x1d3f4980);
            c19542xf3901c27.b(cVar);
            arrayList.add(c19542xf3901c27);
        } while (m145256x1d3f4980.moveToNext());
        m145256x1d3f4980.close();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "record list size:%s", java.lang.Integer.valueOf(arrayList.size()));
        return arrayList;
    }
}
