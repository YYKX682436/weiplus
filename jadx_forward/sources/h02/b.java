package h02;

/* loaded from: classes8.dex */
public class b extends l75.n0 implements vz.r1 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f359402d = {l75.n0.m145250x3fdc6f77(h02.a.f359401m2, "FileDownloadInfo"), "CREATE INDEX IF NOT EXISTS filedownloadinfo_appId  on FileDownloadInfo  (  appId )", "CREATE INDEX IF NOT EXISTS filedownloadinfo_status  on FileDownloadInfo  (  status )"};

    public b(l75.k0 k0Var) {
        super(k0Var, h02.a.f359401m2, "FileDownloadInfo", null);
    }

    public h02.a D0(long j17) {
        h02.a aVar = null;
        if (j17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloadInfoStorage", "download id is not avaiable");
            return null;
        }
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980("select * from FileDownloadInfo where downloadId=" + j17, new java.lang.String[0]);
        if (m145256x1d3f4980 == null) {
            return null;
        }
        if (m145256x1d3f4980.moveToFirst()) {
            aVar = new h02.a();
            aVar.mo9015xbf5d97fd(m145256x1d3f4980);
        }
        m145256x1d3f4980.close();
        return aVar;
    }

    public boolean y0() {
        return m145253xb158737d("FileDownloadInfo", "delete from FileDownloadInfo");
    }

    public h02.a z0(java.lang.String str) {
        h02.a aVar = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloadInfoStorage", "appId is null");
            return null;
        }
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980("select * from FileDownloadInfo where appId=? or rawAppId=?", str, str);
        if (m145256x1d3f4980 == null) {
            return null;
        }
        if (m145256x1d3f4980.moveToFirst()) {
            aVar = new h02.a();
            aVar.mo9015xbf5d97fd(m145256x1d3f4980);
        }
        m145256x1d3f4980.close();
        return aVar;
    }
}
