package af1;

/* loaded from: classes7.dex */
public class i0 extends af1.x {

    /* renamed from: d0, reason: collision with root package name */
    public static final bm5.x0 f4479d0 = new bm5.x0(new af1.i0$$a());
    public final int Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f4480a0;

    /* renamed from: b0, reason: collision with root package name */
    public volatile af1.l0 f4481b0;

    /* renamed from: c0, reason: collision with root package name */
    public volatile af1.m0 f4482c0;

    public i0(android.os.Handler handler) {
        super(handler);
        this.Z = ((af1.n0) f4479d0.b()).zh();
        this.f4480a0 = 0;
        this.f4481b0 = null;
        this.f4482c0 = null;
    }

    @Override // af1.x, ye1.a
    public boolean G(int i17, int i18) {
        boolean G = super.G(i17, i18);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyErrorWorkaroundOnErrorIfNeed, channel: ");
        int i19 = this.Z;
        sb6.append(i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", sb6.toString());
        if (i19 == 1) {
            this.f4480a0 = 0;
        } else if (i19 == 2) {
            this.f4480a0 = 0;
        }
        return G;
    }

    @Override // af1.x
    public int N(android.net.Uri uri) {
        return af1.i.f4478a.a(bf1.a.f19574e, uri);
    }

    @Override // af1.x
    public r9.j O(java.util.Map map) {
        r9.j jVar;
        s9.i iVar;
        jz5.g gVar = af1.g.f4470a;
        android.content.Context context = this.f4502q;
        bf1.a aVar = bf1.a.f19574e;
        kotlin.jvm.internal.o.g(context, "context");
        if (map == null && !oe1.v1.h().f344748e) {
            if (aVar == null) {
                jVar = null;
            } else if (((java.lang.Boolean) ((jz5.n) af1.g.f4470a).getValue()).booleanValue()) {
                bf1.h hVar = (bf1.h) aVar.f19575d;
                synchronized (hVar) {
                    if (!hVar.f19592g) {
                        s9.c cVar = hVar.f19589d;
                        if (cVar != null && (iVar = hVar.f19590e) != null) {
                            hVar.f19591f = new bf1.f(cVar, iVar);
                        }
                        hVar.f19592g = true;
                    }
                }
                bf1.f fVar = hVar.f19591f;
                jVar = fVar != null ? fVar.f19587d : hVar.f19590e;
            } else {
                jVar = aVar.G4();
            }
            if (jVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.DataSourceFactoryCreator", "getDataSourceFactory, return customized data source factory");
                return jVar;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.DataSourceFactoryCreator", "getDataSourceFactory, return default data source factory");
        return af1.z.a(context, map);
    }

    @Override // af1.x
    public oe1.q1 Q() {
        return bf1.a.f19574e;
    }

    @Override // af1.x
    public void S() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "notifyErrorWorkaroundOnLoadError1IfNeed, channel: " + this.Z);
        int i17 = this.Z;
        if (i17 == 1) {
            int i18 = this.f4480a0 + 1;
            this.f4480a0 = i18;
            if (3 <= i18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "notifyErrorWorkaround1OnLoadError1");
                G(com.tencent.liteav.TXLiteAVCode.ERR_BGM_INVALID_URL, -2);
                return;
            }
            return;
        }
        if (i17 != 2) {
            return;
        }
        m8.i iVar = this.f4503r;
        if (iVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "notifyErrorWorkaround2OnLoadError, send DUMMY message to do some work");
            ((m8.k) iVar).f(af1.k0.f4485d);
        }
        int i19 = this.f4480a0 + 1;
        this.f4480a0 = i19;
        if (4 <= i19) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.ExoMediaPlayer", "notifyErrorWorkaround2OnLoadError1, loadErrorCount: " + this.f4480a0);
            af1.m0 m0Var = this.f4482c0;
            if (m0Var != null) {
                ((ig1.a$$a) m0Var).f291342a.f291341a.f291361s++;
            }
        }
    }

    @Override // af1.x
    public void T() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyErrorWorkaroundOnLoadError2IfNeed, channel: ");
        int i17 = this.Z;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", sb6.toString());
        if (i17 != 2) {
            return;
        }
        this.f4480a0 = 0;
    }

    public i0(android.os.Handler handler, int i17, int i18, int i19) {
        super(handler, 0, 0.75f, 10000, 25000, i17, i18, i19, 5000);
        this.Z = ((af1.n0) f4479d0.b()).zh();
        this.f4480a0 = 0;
        this.f4481b0 = null;
        this.f4482c0 = null;
    }
}
