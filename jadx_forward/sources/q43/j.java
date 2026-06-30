package q43;

/* loaded from: classes8.dex */
public final class j extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f441632e = {l75.n0.m145250x3fdc6f77(q43.a.F, "GameResourceDownload")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f441633d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l75.k0 db6) {
        super(db6, q43.a.F, "GameResourceDownload", dm.u5.f321835r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = q43.a.F;
        this.f441633d = db6;
    }

    public final void D0(java.lang.String packageName, java.lang.String appId, int i17, int i18, long j17, int i19, n33.d gameResDownloadList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageName, "packageName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gameResDownloadList, "gameResDownloadList");
        q43.a aVar = new q43.a();
        aVar.f68564xa1e9e82c = packageName;
        aVar.f68557x28d45f97 = appId;
        aVar.f68563x1597c8b5 = i17;
        aVar.f68561xbdbd517f = i18;
        aVar.f68566x5f6e4be4 = j17;
        aVar.f68565x29cbf907 = i19;
        aVar.f68559xac3be4e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        aVar.f68558x3349a5ef = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        aVar.f68562xdeeda70d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        aVar.f68560xc2f9979e = gameResDownloadList.mo14344x5f01b1f6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameResourceDownloadStorage", "insert db ret:" + ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Vi().mo880xb970c2b9(aVar) + ", packageName:" + packageName + ", interval:" + i17 + ", expiredTime:" + i18);
        q43.g.f441627a.g();
    }

    public final void J0(java.lang.String packageName, int i17, int i18, n33.d gameResDownloadList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageName, "packageName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gameResDownloadList, "gameResDownloadList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameResourceDownloadStorage", "updateItemTime, packageName:".concat(packageName));
        q43.a z07 = z0(packageName);
        if (z07 != null) {
            z07.f68558x3349a5ef = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            z07.f68563x1597c8b5 = i17;
            z07.f68560xc2f9979e = gameResDownloadList.mo14344x5f01b1f6();
            z07.f68561xbdbd517f = i18;
            mo9952xce0038c9(z07, new java.lang.String[0]);
        }
        q43.g.f441627a.g();
    }

    public final void L0(java.lang.String packageName, int i17, long j17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageName, "packageName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameResourceDownloadStorage", "updateItemTime, packageName:".concat(packageName));
        q43.a z07 = z0(packageName);
        if (z07 != null) {
            z07.f68558x3349a5ef = j17;
            z07.f68563x1597c8b5 = i17;
            z07.f68561xbdbd517f = i18;
            mo9952xce0038c9(z07, new java.lang.String[0]);
        }
        q43.g.f441627a.g();
    }

    public final boolean y0(java.lang.String packageName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageName, "packageName");
        java.lang.String str = "delete from GameResourceDownload where packageName=\"" + packageName + '\"';
        boolean m145253xb158737d = m145253xb158737d("GameResourceDownload", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameResourceDownloadStorage", "delDownloadInfo, sql:" + str + ", ret:" + m145253xb158737d);
        q43.g.f441627a.g();
        return m145253xb158737d;
    }

    public final q43.a z0(java.lang.String packageName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageName, "packageName");
        q43.a aVar = null;
        if (packageName.length() == 0) {
            return null;
        }
        java.lang.String str = "select * from GameResourceDownload where packageName=\"" + packageName + '\"';
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameResourceDownloadStorage", "getDownloadStage, sql : %s", str);
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980(str, new java.lang.String[0]);
        if (m145256x1d3f4980 == null) {
            return null;
        }
        if (m145256x1d3f4980.moveToNext()) {
            aVar = new q43.a();
            aVar.mo9015xbf5d97fd(m145256x1d3f4980);
        }
        m145256x1d3f4980.close();
        return aVar;
    }
}
