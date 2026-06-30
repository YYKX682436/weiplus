package o72;

/* loaded from: classes12.dex */
public class i2 {

    /* renamed from: h, reason: collision with root package name */
    public static o72.i2 f424885h;

    /* renamed from: a, reason: collision with root package name */
    public boolean f424886a = false;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f424887b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public long f424888c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f424889d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f424890e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f424891f = new o72.f2(this);

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f424892g = new o72.g2(this, android.os.Looper.getMainLooper());

    public static synchronized o72.i2 b() {
        o72.i2 i2Var;
        synchronized (o72.i2.class) {
            if (f424885h == null) {
                f424885h = new o72.i2();
            }
            i2Var = f424885h;
        }
        return i2Var;
    }

    public void a(o72.h2 h2Var) {
        synchronized (this.f424890e) {
            if (((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_FAV_HAS_DB_DATATOTALLENGTH_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue()) {
                if (h2Var != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.e1) h2Var).a();
                }
                return;
            }
            if (h2Var != null) {
                this.f424887b.add(h2Var);
            }
            if (this.f424886a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavCleanFirstLoader", "isLoading is true, ignore");
                return;
            }
            this.f424886a = true;
            this.f424888c = java.lang.System.currentTimeMillis();
            s75.d.b(this.f424891f, "FavCleanFirstLoader_CalFavDataLength");
        }
    }
}
