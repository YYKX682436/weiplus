package iv1;

/* loaded from: classes8.dex */
public class f implements vk0.a {

    /* renamed from: o, reason: collision with root package name */
    public static iv1.f f376641o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.Object f376642p = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public fv1.c f376644e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f376645f;

    /* renamed from: h, reason: collision with root package name */
    public iv1.g f376647h;

    /* renamed from: d, reason: collision with root package name */
    public long f376643d = 0;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f376646g = new kv1.a(new iv1.a(this));

    /* renamed from: i, reason: collision with root package name */
    public final android.content.ServiceConnection f376648i = new iv1.b(this);

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f376649m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(((android.os.HandlerThread) com.p314xaae8f345.mm.p794xb0fa9b5e.w0.a().f149943a.getLooper().getThread()).getLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new iv1.c(this), true);

    /* renamed from: n, reason: collision with root package name */
    public final fv1.f f376650n = new iv1.d(this);

    public f() {
        iv1.e eVar = new iv1.e(this);
        this.f376645f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        gm0.j1.i();
        gm0.j1.n().a(eVar);
        d();
    }

    public static void a(iv1.f fVar) {
        fv1.c cVar = fVar.f376644e;
        if (cVar != null) {
            try {
                cVar.m5();
            } catch (android.os.RemoteException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadClient", "removeIPCTaskMarker: " + e17);
            }
        }
        fVar.f376643d = 0L;
    }

    public static synchronized iv1.f f() {
        iv1.f fVar;
        synchronized (iv1.f.class) {
            if (f376641o == null) {
                f376641o = new iv1.f();
            }
            fVar = f376641o;
        }
        return fVar;
    }

    public final void b() {
        fv1.c cVar = this.f376644e;
        if (cVar != null) {
            try {
                cVar.Wb();
            } catch (android.os.RemoteException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadClient", "addIPCTaskMarker: " + e17);
            }
        }
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00 c13091xf399cf00) {
        ((kv1.a) this.f376646g).add(c13091xf399cf00);
        mv1.a aVar = new mv1.a();
        aVar.f68538xaca5bdda = c13091xf399cf00.f177033f;
        aVar.f68534xf70f9e3d = c13091xf399cf00.f177032e.hashCode();
        aVar.f68533x238eb002 = c13091xf399cf00.f177032e;
        aVar.f68537x15e22229 = c13091xf399cf00.f177035h;
        aVar.f68535xf1e9b966 = c13091xf399cf00.f177034g;
        aVar.f68539xb20eea48 = c13091xf399cf00.f177036i;
        aVar.f68532x861ee3df = java.lang.Boolean.valueOf(c13091xf399cf00.f177039o);
        aVar.f68540x7f378bb1 = java.lang.Boolean.valueOf(c13091xf399cf00.f177040p);
        aVar.f68536x2e70f789 = java.lang.Boolean.valueOf(c13091xf399cf00.f177031d);
        mv1.c a17 = mv1.b.a();
        if (a17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnDownloadInfoDBHelp", "insert: " + a17.mo880xb970c2b9(aVar));
        }
    }

    public final synchronized void d() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "bindService: " + this.f376645f.bindService(new android.content.Intent(this.f376645f, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.class), this.f376648i, 1));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadClient", "bindService: " + e17.getMessage());
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00 e(java.lang.String str) {
        mv1.a aVar;
        android.database.Cursor m145256x1d3f4980;
        mv1.c a17 = mv1.b.a();
        if (a17 == null || (m145256x1d3f4980 = a17.m145256x1d3f4980(java.lang.String.format("select * from %s where %s=%s", "CdnDownloadInfo", "downloadUrlHashCode", java.lang.Integer.valueOf(str.hashCode())), new java.lang.String[0])) == null) {
            aVar = null;
        } else {
            aVar = null;
            while (m145256x1d3f4980.moveToNext()) {
                aVar = new mv1.a();
                aVar.mo9015xbf5d97fd(m145256x1d3f4980);
            }
            m145256x1d3f4980.close();
        }
        if (aVar == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00 c13091xf399cf00 = new com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00(str);
        c13091xf399cf00.f177035h = aVar.f68537x15e22229;
        c13091xf399cf00.f177033f = aVar.f68538xaca5bdda;
        c13091xf399cf00.f177034g = aVar.f68535xf1e9b966;
        c13091xf399cf00.f177036i = aVar.f68539xb20eea48;
        c13091xf399cf00.f177039o = aVar.f68532x861ee3df.booleanValue();
        c13091xf399cf00.f177040p = aVar.f68540x7f378bb1.booleanValue();
        c13091xf399cf00.f177031d = aVar.f68536x2e70f789.booleanValue();
        c13091xf399cf00.f177037m = 15;
        c13091xf399cf00.f177038n = 3600;
        return c13091xf399cf00;
    }

    public synchronized boolean g(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "pauseDownloadTask: " + str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CDNDownloadClient", "pauseDownloadTask, url invalid");
            return false;
        }
        i(new com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00(str));
        fv1.c cVar = this.f376644e;
        if (cVar != null) {
            try {
                return cVar.Je(str);
            } catch (android.os.RemoteException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadClient", "pauseDownloadTask, " + e17.getMessage());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "pauseDownloadTask false, service interface is null");
        return false;
    }

    public synchronized com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13092x802fa47f h(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00 e17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "queryDownloadTask: " + str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CDNDownloadClient", "queryDownloadTask, url invalid");
            return null;
        }
        fv1.c cVar = this.f376644e;
        if (cVar != null) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13092x802fa47f p66 = cVar.p6(str);
                int i17 = p66.f177044d;
                if (i17 != 100 && i17 != 101) {
                    if (((java.util.HashSet) this.f376646g).contains(new com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00(str))) {
                        p66.f177044d = 101;
                    }
                    return p66;
                }
                if (!((java.util.HashSet) this.f376646g).contains(new com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00(str)) && (e17 = e(str)) != null) {
                    ((kv1.a) this.f376646g).add(e17);
                }
                return p66;
            } catch (android.os.RemoteException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadClient", "queryDownloadTask, " + e18.getMessage());
            }
        }
        if (!((java.util.HashSet) this.f376646g).contains(new com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00(str))) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13092x802fa47f c13092x802fa47f = new com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13092x802fa47f();
        c13092x802fa47f.f177044d = 101;
        return c13092x802fa47f;
    }

    public final void i(com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00 c13091xf399cf00) {
        ((kv1.a) this.f376646g).remove(c13091xf399cf00);
        java.lang.String str = c13091xf399cf00.f177032e;
        mv1.c a17 = mv1.b.a();
        if (a17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnDownloadInfoDBHelp", "removeDownloadInfoByDownloadUrl: " + a17.m145253xb158737d("CdnDownloadInfo", java.lang.String.format("delete from %s where %s=%s", "CdnDownloadInfo", "downloadUrlHashCode", java.lang.Integer.valueOf(str.hashCode()))));
        }
    }
}
