package q43;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final q43.c f441616d = new q43.c();

    @Override // java.lang.Runnable
    public final void run() {
        q43.j Vi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Vi();
        Vi.getClass();
        java.lang.String str = "select intervalSeconds - abs(" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + " - checkCgiTime) as diffTime from GameResourceDownload order by diffTime asc";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameResourceDownloadStorage", "getMinCheckInterval, sql: " + str);
        android.database.Cursor m145256x1d3f4980 = Vi.m145256x1d3f4980(str, new java.lang.String[0]);
        if (m145256x1d3f4980 != null) {
            r1 = m145256x1d3f4980.moveToNext() ? java.lang.Long.valueOf(m145256x1d3f4980.getLong(0)) : null;
            m145256x1d3f4980.close();
        }
        if (r1 == null) {
            q43.g.f441628b.d();
            return;
        }
        long longValue = r1.longValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameResourceDownloadManager", "resetCheckTimer, interval:" + longValue);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = q43.g.f441628b;
        b4Var.d();
        if (longValue <= 0) {
            q43.g.a(q43.g.f441627a);
        } else {
            long j17 = longValue * 1000;
            b4Var.c(j17, j17);
        }
        r1.longValue();
    }
}
