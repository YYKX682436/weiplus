package qj4;

/* loaded from: classes11.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f445480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f445481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445482f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mj4.h f445483g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f445484h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f445485i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f445486m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f445487n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f445488o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445489p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f445490q;

    public r(android.content.Context context, long j17, java.lang.String str, mj4.h hVar, long j18, long j19, long j27, long j28, java.lang.Integer num, java.lang.String str2, long j29) {
        this.f445480d = context;
        this.f445481e = j17;
        this.f445482f = str;
        this.f445483g = hVar;
        this.f445484h = j18;
        this.f445485i = j19;
        this.f445486m = j27;
        this.f445487n = j28;
        this.f445488o = num;
        this.f445489p = str2;
        this.f445490q = j29;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        android.content.Context context = this.f445480d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String actionResult = this.f445482f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionResult, "actionResult");
        java.lang.String statusOwnerUserName = this.f445489p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusOwnerUserName, "statusOwnerUserName");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f Ui = ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 9, pj4.p0.class);
        if (Ui == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.tsReport", "report null err :".concat(context.getClass().getSimpleName()));
            Ui = new pj4.p0();
            z17 = false;
        } else {
            z17 = true;
        }
        mj4.h hVar = this.f445483g;
        if (hVar == null) {
            hVar = ai4.m0.f86706a.M(((pj4.p0) Ui).f436770e);
        }
        if (hVar == null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(statusOwnerUserName)) {
            hVar = ai4.m0.f86706a.M(statusOwnerUserName);
        }
        if (hVar == null) {
            return;
        }
        long j17 = this.f445481e;
        if (31 <= j17 && j17 < 39) {
            di4.i.f314315a.c();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("has_multi_status_reddot", 0);
            actionResult = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(actionResult, "toString(...)");
        }
        java.lang.String str = (j17 == 28 && ai4.m0.f86706a.M(en1.a.a()) == null) ? "" : actionResult;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6957x60467f4d c6957x60467f4d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6957x60467f4d();
        pj4.p0 p0Var = (pj4.p0) Ui;
        c6957x60467f4d.f142627d = c6957x60467f4d.b("SessionID", p0Var.f436769d, true);
        c6957x60467f4d.D = c6957x60467f4d.b("SceneSessionID", ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ai(), true);
        c6957x60467f4d.E = c6957x60467f4d.b("PageID", ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).wi(), true);
        pj4.o0 a17 = xe0.j0.a(hVar, false, 1, null);
        c6957x60467f4d.f142628e = c6957x60467f4d.b("TopicID", a17.f436746d, true);
        c6957x60467f4d.f142626J = a17.f436758s;
        c6957x60467f4d.K = c6957x60467f4d.b("ClusterID", mj4.d.b(a17), true);
        mj4.k kVar = (mj4.k) hVar;
        c6957x60467f4d.f142629f = c6957x60467f4d.b("TextStatusID", kVar.l(), true);
        c6957x60467f4d.f142631h = c6957x60467f4d.b("IconID", kVar.h(), true);
        java.lang.String d17 = wi4.a.d(a17);
        if (d17 == null) {
            d17 = "";
        }
        c6957x60467f4d.f142632i = c6957x60467f4d.b("SourceID", d17, true);
        c6957x60467f4d.f142633j = c6957x60467f4d.b("SourceActivityID", wi4.a.a(a17), true);
        java.lang.String e17 = wi4.a.e(a17);
        c6957x60467f4d.f142634k = c6957x60467f4d.b("SourceName", e17 != null ? r26.i0.u(e17, ',', ';', false, 4, null) : null, true);
        c6957x60467f4d.f142635l = c6957x60467f4d.b("SourceExtraInfo", p0Var.f436771f, true);
        c6957x60467f4d.f142636m = c6957x60467f4d.b("CurrLikeIcon", p0Var.f436772g, true);
        c6957x60467f4d.f142637n = p0Var.f436773h;
        c6957x60467f4d.f142638o = p0Var.f436774i;
        c6957x60467f4d.f142639p = c6957x60467f4d.b("AuthorUsername", p0Var.f436770e, true);
        c6957x60467f4d.f142640q = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(en1.a.a(), p0Var.f436770e) ? 1L : 2L;
        c6957x60467f4d.f142641r = p0Var.f436775m;
        c6957x60467f4d.I = this.f445488o != null ? r3.intValue() : 0L;
        c6957x60467f4d.f142642s = p0Var.f436776n > 0 ? 1L : 0L;
        long j18 = this.f445486m;
        if (j18 == -1) {
            j18 = p0Var.f436777o;
        }
        c6957x60467f4d.f142643t = j18;
        c6957x60467f4d.f142644u = j17;
        c6957x60467f4d.f142645v = c6957x60467f4d.b("ActionResult", r26.i0.u(str, ',', ';', false, 4, null), true);
        if (!z17) {
            c6957x60467f4d.f142645v = c6957x60467f4d.b("ActionResult", c6957x60467f4d.f142645v + "_error", true);
        }
        c6957x60467f4d.f142646w = c01.id.c();
        c6957x60467f4d.f142647x = p0Var.f436778p;
        c6957x60467f4d.f142648y = c6957x60467f4d.b("SourceFeedID", p0Var.f436779q, true);
        c6957x60467f4d.f142649z = p0Var.f436780r;
        c6957x60467f4d.A = p0Var.f436781s;
        c6957x60467f4d.B = p0Var.f436782t;
        c6957x60467f4d.C = ((kVar.s() & 4) > 0L ? 1 : ((kVar.s() & 4) == 0L ? 0 : -1)) != 0 ? 1L : 2L;
        c6957x60467f4d.F = this.f445484h;
        c6957x60467f4d.G = this.f445485i;
        c6957x60467f4d.H = this.f445487n;
        qj4.s sVar = qj4.s.f445491a;
        c6957x60467f4d.L = sVar.b();
        c6957x60467f4d.M = c6957x60467f4d.b("CustomTitle", bk4.i.a().a(kVar.h()) ? bk4.i.a().m(a17) : "", true);
        c6957x60467f4d.O = kVar.x() ? 1L : 2L;
        c6957x60467f4d.N = kVar.f408600b.f76525x91a52c19;
        long j19 = this.f445490q;
        if (j19 > 0) {
            c6957x60467f4d.f142641r = j19;
        }
        jz5.l i17 = sVar.i(kVar.o(), true);
        c6957x60467f4d.P = ((java.lang.Number) i17.f384366d).longValue();
        c6957x60467f4d.Q = c6957x60467f4d.b("CoExistStatusList", (java.lang.String) i17.f384367e, true);
        c6957x60467f4d.k();
        sVar.y(c6957x60467f4d);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.TextStatus.tsReport", "report22216: action=" + c6957x60467f4d.f142644u + ", scene=" + c6957x60467f4d.f142641r, new java.lang.Object[0]);
    }
}
