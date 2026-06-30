package i03;

/* loaded from: classes11.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f368062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i03.c f368063f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f368064g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368065h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f368066i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, long j17, i03.c cVar, java.lang.String[] strArr, java.lang.String str2, int i17) {
        super(0);
        this.f368061d = str;
        this.f368062e = j17;
        this.f368063f = cVar;
        this.f368064g = strArr;
        this.f368065h = str2;
        this.f368066i = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6618xd2f2370d c6618xd2f2370d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6618xd2f2370d();
        c6618xd2f2370d.f139727i = c6618xd2f2370d.b("Runner", this.f368061d, true);
        long j17 = this.f368062e;
        c6618xd2f2370d.f139722d = j17;
        c6618xd2f2370d.f139728j = c6618xd2f2370d.b("KeyFrame", "", true);
        i03.c cVar = this.f368063f;
        cVar.getClass();
        java.lang.String[] strArr = this.f368064g;
        int length = 5000 / strArr.length;
        c6618xd2f2370d.f139723e = c6618xd2f2370d.b("StackTrace", i03.c.a(cVar, (java.lang.String) kz5.z.L(strArr), length), true);
        if (strArr.length > 1) {
            c6618xd2f2370d.f139729k = c6618xd2f2370d.b("StrackTrace2", i03.c.a(cVar, strArr[1], length), true);
        }
        if (strArr.length > 2) {
            c6618xd2f2370d.f139730l = c6618xd2f2370d.b("StrackTrace3", i03.c.a(cVar, strArr[2], length), true);
        }
        c6618xd2f2370d.f139734p = c6618xd2f2370d.b("Phase", this.f368065h, true);
        c6618xd2f2370d.f139735q = c6618xd2f2370d.b("Revision", a03.h.a(), true);
        c6618xd2f2370d.f139736r = this.f368066i;
        c6618xd2f2370d.f139737s = c6618xd2f2370d.b("rev", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, true);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_flutter_engine_slow_runner_report_duration_limit, 0);
        if (Ni <= 0 || j17 > Ni) {
            c6618xd2f2370d.k();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterSlowRunnerReport", "report slow runner expt:" + Ni + " detail:" + c6618xd2f2370d.n());
        return jz5.f0.f384359a;
    }
}
