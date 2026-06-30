package xe5;

/* loaded from: classes10.dex */
public final class r implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe5.g0 f535617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f535619f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f535620g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f535621h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535622i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f535623m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535624n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f535625o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f535626p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f535627q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ xe5.i f535628r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535629s;

    public r(xe5.g0 g0Var, java.lang.String str, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.Map map, java.lang.String str2, long j17, java.lang.String str3, long j18, boolean z17, int i17, xe5.i iVar, java.lang.String str4) {
        this.f535617d = g0Var;
        this.f535618e = str;
        this.f535619f = dVar;
        this.f535620g = f9Var;
        this.f535621h = map;
        this.f535622i = str2;
        this.f535623m = j17;
        this.f535624n = str3;
        this.f535625o = j18;
        this.f535626p = z17;
        this.f535627q = i17;
        this.f535628r = iVar;
        this.f535629s = str4;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.Class cls;
        java.util.Map map;
        java.lang.String str;
        java.util.Map map2;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        int itemId = menuItem.getItemId();
        xe5.g0 g0Var = this.f535617d;
        g0Var.getClass();
        le2.c cVar = le2.c.f399676a;
        java.lang.String str2 = this.f535629s;
        xe5.i iVar = this.f535628r;
        boolean z17 = this.f535626p;
        java.lang.String str3 = this.f535624n;
        java.util.Map map3 = this.f535621h;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = this.f535620g;
        java.lang.String str4 = this.f535622i;
        java.lang.String str5 = this.f535618e;
        yb5.d dVar = this.f535619f;
        if (itemId == 2) {
            if (str5 != null) {
                f9Var = f9Var2;
                long j17 = this.f535623m;
                long j18 = this.f535625o;
                map2 = map3;
                int i18 = this.f535627q;
                if (str3.equals("6")) {
                    r45.hx0 Bi = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.a) ((s40.o0) i95.n0.c(s40.o0.class))).Bi(false, str5);
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.a) ((s40.o0) i95.n0.c(s40.o0.class))).wi(j17, j18, Bi.m75939xb282bd08(0), Bi).l().K(new xe5.l(iVar, str5));
                } else if (z17) {
                    g0Var.f535563d = new xe5.m(g0Var, iVar, str2, dVar);
                    ((s40.w0) i95.n0.c(s40.w0.class)).getClass();
                    cVar.a(str5, true, i18, j18, g0Var.f535563d);
                } else {
                    g0Var.f535562c = new xe5.n(g0Var, iVar, str5, dVar);
                    ((s40.w0) i95.n0.c(s40.w0.class)).getClass();
                    zy2.gc gcVar = g0Var.f535562c;
                    le2.b bVar = le2.b.f399674e;
                    bVar.getClass();
                    r45.zh2 zh2Var = new r45.zh2();
                    zh2Var.set(0, str5);
                    zh2Var.set(1, 1);
                    hb2.w0.m(bVar, zh2Var, gcVar, false, false, null, null, 60, null);
                }
            } else {
                map2 = map3;
                f9Var = f9Var2;
            }
            ((ml2.r0) ((c50.c1) i95.n0.c(c50.c1.class))).wk(true, true);
            tb5.o0.c(dVar, f9Var, map2, 8);
            j31.e.b(8, g0Var.f535564e, g0Var.f535565f, str4);
            return;
        }
        g0Var.getClass();
        if (itemId != 3) {
            g0Var.getClass();
            if (itemId == 1) {
                g0Var.getClass();
                java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=62&liveid=%s&liveidentityid=%s&wechat_real_lang=%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(this.f535623m), str5, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()}, 3));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g0Var.d(), "go to complain page");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", format);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.h(intent, dVar.x());
                j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "webview", ".ui.tools.WebViewUI", intent, null);
                j31.e.b(5, g0Var.f535564e, g0Var.f535565f, str4);
                tb5.o0.c(dVar, f9Var2, map3, 5);
                return;
            }
            return;
        }
        if (str5 != null) {
            str = str4;
            long j19 = this.f535623m;
            cls = c50.c1.class;
            map = map3;
            long j27 = this.f535625o;
            int i19 = this.f535627q;
            if (str3.equals("6")) {
                r45.hx0 Bi2 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.a) ((s40.o0) i95.n0.c(s40.o0.class))).Bi(true, str5);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.a) ((s40.o0) i95.n0.c(s40.o0.class))).wi(j19, j27, Bi2.m75939xb282bd08(0), Bi2).l().K(new xe5.o(iVar, str5));
            } else if (z17) {
                g0Var.f535563d = new xe5.p(g0Var, iVar, str2, dVar);
                ((s40.w0) i95.n0.c(s40.w0.class)).getClass();
                cVar.a(str5, false, i19, j27, g0Var.f535563d);
            } else {
                g0Var.f535562c = new xe5.q(g0Var, iVar, str5, dVar);
                ((s40.w0) i95.n0.c(s40.w0.class)).getClass();
                zy2.gc gcVar2 = g0Var.f535562c;
                le2.b bVar2 = le2.b.f399674e;
                bVar2.getClass();
                r45.zh2 zh2Var2 = new r45.zh2();
                zh2Var2.set(0, str5);
                zh2Var2.set(1, 0);
                hb2.w0.m(bVar2, zh2Var2, gcVar2, false, false, null, null, 60, null);
            }
        } else {
            cls = c50.c1.class;
            map = map3;
            str = str4;
        }
        tb5.o0.c(dVar, f9Var2, map, 9);
        j31.e.b(9, g0Var.f535564e, g0Var.f535565f, str);
        ((ml2.r0) ((c50.c1) i95.n0.c(cls))).wk(true, false);
    }
}
