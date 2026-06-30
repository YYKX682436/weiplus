package wo;

/* loaded from: classes14.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final wo.u f529354a = new wo.u();

    /* renamed from: b, reason: collision with root package name */
    public static final wo.e f529355b = new wo.e();

    /* renamed from: c, reason: collision with root package name */
    public static final wo.c f529356c = new wo.c();

    /* renamed from: d, reason: collision with root package name */
    public static final wo.o1 f529357d = new wo.o1();

    /* renamed from: e, reason: collision with root package name */
    public static final wo.x1 f529358e = new wo.x1();

    /* renamed from: f, reason: collision with root package name */
    public static final wo.z0 f529359f = new wo.z0();

    /* renamed from: g, reason: collision with root package name */
    public static final wo.h1 f529360g = new wo.h1();

    /* renamed from: h, reason: collision with root package name */
    public static final wo.u1 f529361h = new wo.u1();

    /* renamed from: i, reason: collision with root package name */
    public static final wo.g1 f529362i = new wo.g1();

    /* renamed from: j, reason: collision with root package name */
    public static final wo.g1 f529363j = new wo.g1();

    /* renamed from: k, reason: collision with root package name */
    public static final wo.b f529364k = new wo.b();

    /* renamed from: l, reason: collision with root package name */
    public static int f529365l = -1;

    /* renamed from: m, reason: collision with root package name */
    public static final wo.o f529366m = new wo.o();

    public static void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SrvDeviceInfo", "update deviceInfo %s", str);
        if (str == null || str.length() <= 0 || str.hashCode() == f529365l) {
            return;
        }
        f529365l = str.hashCode();
        wo.u uVar = f529354a;
        uVar.f529336a = false;
        uVar.f529337b = 0;
        uVar.f529338c = 0;
        wo.e eVar = f529355b;
        eVar.a();
        wo.c cVar = f529356c;
        cVar.f();
        wo.o oVar = f529366m;
        oVar.b();
        wo.o1 o1Var = f529357d;
        o1Var.f529303a = 0;
        wo.x1 x1Var = f529358e;
        x1Var.f529399a = false;
        wo.z0 z0Var = f529359f;
        z0Var.f529400a = 0;
        z0Var.f529401b = 0;
        wo.h1 h1Var = f529360g;
        h1Var.f529250a = null;
        wo.u1 u1Var = f529361h;
        u1Var.f529343a = false;
        u1Var.f529344b = 0;
        wo.g1 g1Var = f529362i;
        g1Var.a();
        wo.g1 g1Var2 = f529363j;
        g1Var2.a();
        wo.b bVar = f529364k;
        bVar.f529119a = false;
        bVar.f529120b = "";
        if (new wo.y0().a(str, uVar, eVar, cVar, oVar, o1Var, x1Var, z0Var, h1Var, u1Var, g1Var, bVar, g1Var2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SrvDeviceInfo", "steve: mCameraInfo.mSupportVoipBeauty = " + eVar.I + ", mVoipBeautyWhiteCfg=" + eVar.f529188J);
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5301xa2fe3c6d().e();
        }
    }
}
