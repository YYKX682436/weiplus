package wz1;

/* loaded from: classes12.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final wz1.b f532227d = new wz1.b();

    /* renamed from: e, reason: collision with root package name */
    public static com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f532228e;

    /* renamed from: f, reason: collision with root package name */
    public static java.util.concurrent.Future f532229f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f532230g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile boolean f532231h;

    public static final void b(boolean z17) {
        if (!f532231h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBLeafBackup", "Will update backup soon.");
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            c17.A(94, 0L);
            c17.i(false);
            f532231h = true;
            wz1.g.a(75, 0L, 2, null);
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBLeafBackup", "Drop DB leaf backup.");
            com.p314xaae8f345.mm.vfs.w6.h(gm0.j1.u().f354686f.mo70515xfb83cc9b() + ".li");
            wz1.g.a(76, 0L, 2, null);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab;
        long s17;
        synchronized (this) {
            c26987xeef691ab = f532228e;
        }
        if (c26987xeef691ab == null) {
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("0", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_db_backup_leaf_android", "0"))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBLeafBackup", "Leaf backup disabled.");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            s17 = currentTimeMillis - gm0.j1.u().c().s(94, 0L);
        } catch (com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f unused) {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBLeafBackup", "Leaf backup cancelled, time: " + currentTimeMillis2 + " ms");
            java.lang.String[] strArr = wz1.g.f532236a;
            jx3.f.INSTANCE.k(181, 181, 67, 70, (int) 1, (int) (currentTimeMillis2 / ((long) 1000)), true);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DBLeafBackup", e17, "Leaf backup failed.", new java.lang.Object[0]);
            wz1.g.a(68, 0L, 2, null);
            jx3.f.INSTANCE.d(21388, "@DBLeafBackupFailed", 0, 0, e17.getMessage(), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            c17.A(94, currentTimeMillis);
            c17.i(false);
        }
        if (s17 < 86400000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBLeafBackup", "Backup interval not reached, skip: [" + s17 + " / 86400000]");
            return;
        }
        wz1.g.a(65, 0L, 2, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBLeafBackup", "Start leaf backup, interval: [" + s17 + " / 86400000]");
        l75.k0 k0Var = gm0.j1.u().f354686f;
        com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.LeafInfo i17 = k0Var.i(wz1.g.f532236a, c26987xeef691ab);
        if (i17 != null) {
            i17.m107991x35c17d(k0Var.mo70515xfb83cc9b() + ".li.tmp");
        }
        com.p314xaae8f345.mm.vfs.w6.w(k0Var.mo70515xfb83cc9b() + ".li.tmp", k0Var.mo70515xfb83cc9b() + ".li");
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
        c18.A(94, currentTimeMillis);
        c18.i(false);
        f532231h = false;
        long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBLeafBackup", "Leaf backup done, time: " + currentTimeMillis3 + " ms");
        jx3.f.INSTANCE.k(181, 181, 66, 69, (int) 1, (int) (currentTimeMillis3 / ((long) 1000)), true);
        synchronized (this) {
            f532228e = null;
            f532229f = null;
        }
    }
}
