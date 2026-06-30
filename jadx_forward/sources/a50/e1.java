package a50;

/* loaded from: classes11.dex */
public final class e1 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f83007d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f83008e;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Boolean f83010g;

    /* renamed from: a, reason: collision with root package name */
    public static final a50.e1 f83004a = new a50.e1();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f83005b = jz5.h.b(a50.d1.f83000d);

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f83006c = yw.x0.f548033a.b();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f83009f = true;

    static {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && gm0.j1.h() && gm0.j1.a()) {
            ((ku5.t0) ku5.t0.f394148d).a(a50.w0.f83087d);
        }
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c0 a() {
        if (f83007d) {
            return com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c0.f300868b;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.BoxFlutterBizMsgBridge", "getBizManagerInstance hasInit=" + f83007d);
        return null;
    }

    public final synchronized void b() {
        if (f83007d) {
            return;
        }
        yw.h1 h1Var = yw.h1.f547865a;
        if (!h1Var.n()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init but not use aff ");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.BoxFlutterBizMsgBridge", sb6.toString());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxFlutterBizMsgBridge", "init resetData= " + f83010g);
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.r0.f301295a = a50.x0.f83089a;
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.r0.f301296b = a50.y0.f83092a;
        com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.a.f299360a = a50.z0.f83096a;
        a50.j0.f83031c.mo48813x58998cd();
        if (!h1Var.p()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxBizFlutterDigestHelper", "init finder live dot, switch is off");
        } else if (z40.e.l4()) {
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c0.f300868b.d(a50.i0.f83026a);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxBizFlutterDigestHelper", "Finder exp false, skip finder box initFinderLiveDot");
        }
        ur1.j jVar = ur1.j.f511887a;
        if (ur1.n.f511894a.a()) {
            jVar.a().d(ur1.f.f511883a);
            jVar.a().h("biz_publish_personal_center_event", ur1.i.f511886a);
        }
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("biz_persist"), false);
        java.lang.String j17 = gm0.j1.b().j();
        if (!com.p314xaae8f345.mm.vfs.w6.j(i17)) {
            com.p314xaae8f345.mm.vfs.w6.u(i17);
        }
        cw5.a aVar = new cw5.a();
        aVar.f305844d = false;
        boolean[] zArr = aVar.f305859v;
        zArr[1] = true;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        aVar.f305845e = false;
        zArr[2] = true;
        java.lang.Boolean bool = f83010g;
        aVar.f305846f = bool != null ? bool.booleanValue() : false;
        boolean[] zArr2 = aVar.f305859v;
        zArr2[3] = true;
        aVar.f305847g = f83006c;
        zArr2[4] = true;
        aVar.f305848h = yw.h1.f547872h;
        zArr2[5] = true;
        aVar.f305849i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_time_empty_list_resort, 0) == 1;
        boolean[] zArr3 = aVar.f305859v;
        zArr3[6] = true;
        aVar.f305851n = false;
        zArr3[8] = true;
        aVar.f305850m = true;
        zArr3[7] = true;
        c01.y0 y0Var = c01.a1.f118578a;
        aVar.f305852o = y0Var.a().o("BizTLRecommendFeedsEnterBoxFilter", 0) == 1;
        aVar.f305859v[9] = true;
        aVar.f305853p = y0Var.a().o("BizTLRecommendFeedsOutBoxPullFeedsControlSwitch", 0);
        aVar.f305859v[10] = true;
        java.lang.String b17 = com.p314xaae8f345.mm.vfs.x6.b(gm0.j1.u().h(), true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        aVar.f305855r = b17;
        aVar.f305859v[31] = true;
        i95.m c17 = i95.n0.c(l85.g0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        l85.d0 d0Var = (l85.d0) ((l85.g0) c17);
        aVar.f305854q = d0Var.Di(e42.c0.clicfg_finder_box_use_finder_cgi_android, new l85.b0(d0Var), new l85.c0(d0Var), false);
        aVar.f305859v[30] = true;
        i95.m c18 = i95.n0.c(l85.g0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        l85.d0 d0Var2 = (l85.d0) ((l85.g0) c18);
        aVar.f305856s = d0Var2.Di(e42.c0.clicfg_finder_box_keep_only_one_msg_android, new l85.v(d0Var2), new l85.w(d0Var2), false);
        aVar.f305859v[32] = true;
        i95.m c19 = i95.n0.c(l85.g0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
        byte[] Bi = ((l85.d0) ((l85.g0) c19)).Bi(false);
        if (Bi != null) {
            aVar.f305858u = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(Bi);
            aVar.f305859v[34] = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxFlutterBizMsgBridge", "BoxBizAffInitConfig: useFinderCgi=" + aVar.f305854q + ", boxKeepOnlyOneMsg=" + aVar.f305856s + ", hasBoxConfig=" + aVar.f305859v[34]);
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c0 c0Var = com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c0.f300868b;
        c0Var.m(i17, j17, o45.wf.f424562g, aVar, a50.a1.f82986a);
        cw5.g gVar = new cw5.g();
        gVar.f305890d = h1Var.j();
        gVar.f305898o[1] = true;
        gVar.f305891e = h1Var.m().o("lift_read_area_size", 0);
        gVar.f305898o[2] = true;
        gVar.f305892f = h1Var.k();
        gVar.f305898o[3] = true;
        gVar.f305893g = h1Var.m().q("resort_scene_bit_switch", 0L);
        gVar.f305898o[4] = true;
        gVar.f305894h = h1Var.m().o("resort_blocked_when_client_running_back", 0);
        gVar.f305898o[5] = true;
        gVar.f305895i = y0Var.a().o("BizTLRecommendFeedsBatchWithBizMsgResort", 0);
        gVar.f305898o[6] = true;
        gVar.f305896m = y0Var.a().o("BizTLRecommendFeedsOutBoxPullFeedsNeedUplineCard", 0);
        gVar.f305898o[7] = true;
        gVar.f305897n = h1Var.q();
        gVar.f305898o[8] = true;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("resortV2ControlFlagChangeAsync(ControlFlag=");
        sb7.append(gVar.f305890d);
        sb7.append(", HistoryBoxWording=");
        sb7.append(gVar.f305898o[3] ? gVar.f305892f : "");
        sb7.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxFlutterBizMsgBridge", sb7.toString());
        c0Var.B(1, gVar, a50.b1.f82991a);
        f83007d = true;
    }
}
