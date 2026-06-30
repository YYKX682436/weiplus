package a50;

/* loaded from: classes11.dex */
public final class e1 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f1474d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f1475e;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Boolean f1477g;

    /* renamed from: a, reason: collision with root package name */
    public static final a50.e1 f1471a = new a50.e1();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f1472b = jz5.h.b(a50.d1.f1467d);

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f1473c = yw.x0.f466500a.b();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f1476f = true;

    static {
        if (com.tencent.mm.sdk.platformtools.x2.n() && gm0.j1.h() && gm0.j1.a()) {
            ((ku5.t0) ku5.t0.f312615d).a(a50.w0.f1554d);
        }
    }

    public final com.tencent.wechat.mm.finder_box.c0 a() {
        if (f1474d) {
            return com.tencent.wechat.mm.finder_box.c0.f219335b;
        }
        com.tencent.mars.xlog.Log.w("Finder.BoxFlutterBizMsgBridge", "getBizManagerInstance hasInit=" + f1474d);
        return null;
    }

    public final synchronized void b() {
        if (f1474d) {
            return;
        }
        yw.h1 h1Var = yw.h1.f466332a;
        if (!h1Var.n()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init but not use aff ");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(new com.tencent.mm.sdk.platformtools.z3());
            com.tencent.mars.xlog.Log.e("Finder.BoxFlutterBizMsgBridge", sb6.toString());
        }
        com.tencent.mars.xlog.Log.i("Finder.BoxFlutterBizMsgBridge", "init resetData= " + f1477g);
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
        com.tencent.wechat.mm.finder_box.r0.f219762a = a50.x0.f1556a;
        com.tencent.wechat.mm.finder_box.r0.f219763b = a50.y0.f1559a;
        com.tencent.wechat.iam.finder_box.a.f217827a = a50.z0.f1563a;
        a50.j0.f1498c.alive();
        if (!h1Var.p()) {
            com.tencent.mars.xlog.Log.i("Finder.BoxBizFlutterDigestHelper", "init finder live dot, switch is off");
        } else if (z40.e.l4()) {
            com.tencent.wechat.mm.finder_box.c0.f219335b.d(a50.i0.f1493a);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.BoxBizFlutterDigestHelper", "Finder exp false, skip finder box initFinderLiveDot");
        }
        ur1.j jVar = ur1.j.f430354a;
        if (ur1.n.f430361a.a()) {
            jVar.a().d(ur1.f.f430350a);
            jVar.a().h("biz_publish_personal_center_event", ur1.i.f430353a);
        }
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("biz_persist"), false);
        java.lang.String j17 = gm0.j1.b().j();
        if (!com.tencent.mm.vfs.w6.j(i17)) {
            com.tencent.mm.vfs.w6.u(i17);
        }
        cw5.a aVar = new cw5.a();
        aVar.f224311d = false;
        boolean[] zArr = aVar.f224326v;
        zArr[1] = true;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        aVar.f224312e = false;
        zArr[2] = true;
        java.lang.Boolean bool = f1477g;
        aVar.f224313f = bool != null ? bool.booleanValue() : false;
        boolean[] zArr2 = aVar.f224326v;
        zArr2[3] = true;
        aVar.f224314g = f1473c;
        zArr2[4] = true;
        aVar.f224315h = yw.h1.f466339h;
        zArr2[5] = true;
        aVar.f224316i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_time_empty_list_resort, 0) == 1;
        boolean[] zArr3 = aVar.f224326v;
        zArr3[6] = true;
        aVar.f224318n = false;
        zArr3[8] = true;
        aVar.f224317m = true;
        zArr3[7] = true;
        c01.y0 y0Var = c01.a1.f37045a;
        aVar.f224319o = y0Var.a().o("BizTLRecommendFeedsEnterBoxFilter", 0) == 1;
        aVar.f224326v[9] = true;
        aVar.f224320p = y0Var.a().o("BizTLRecommendFeedsOutBoxPullFeedsControlSwitch", 0);
        aVar.f224326v[10] = true;
        java.lang.String b17 = com.tencent.mm.vfs.x6.b(gm0.j1.u().h(), true);
        kotlin.jvm.internal.o.d(b17);
        aVar.f224322r = b17;
        aVar.f224326v[31] = true;
        i95.m c17 = i95.n0.c(l85.g0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        l85.d0 d0Var = (l85.d0) ((l85.g0) c17);
        aVar.f224321q = d0Var.Di(e42.c0.clicfg_finder_box_use_finder_cgi_android, new l85.b0(d0Var), new l85.c0(d0Var), false);
        aVar.f224326v[30] = true;
        i95.m c18 = i95.n0.c(l85.g0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        l85.d0 d0Var2 = (l85.d0) ((l85.g0) c18);
        aVar.f224323s = d0Var2.Di(e42.c0.clicfg_finder_box_keep_only_one_msg_android, new l85.v(d0Var2), new l85.w(d0Var2), false);
        aVar.f224326v[32] = true;
        i95.m c19 = i95.n0.c(l85.g0.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        byte[] Bi = ((l85.d0) ((l85.g0) c19)).Bi(false);
        if (Bi != null) {
            aVar.f224325u = com.tencent.mm.protobuf.g.b(Bi);
            aVar.f224326v[34] = true;
        }
        com.tencent.mars.xlog.Log.i("Finder.BoxFlutterBizMsgBridge", "BoxBizAffInitConfig: useFinderCgi=" + aVar.f224321q + ", boxKeepOnlyOneMsg=" + aVar.f224323s + ", hasBoxConfig=" + aVar.f224326v[34]);
        com.tencent.wechat.mm.finder_box.c0 c0Var = com.tencent.wechat.mm.finder_box.c0.f219335b;
        c0Var.m(i17, j17, o45.wf.f343029g, aVar, a50.a1.f1453a);
        cw5.g gVar = new cw5.g();
        gVar.f224357d = h1Var.j();
        gVar.f224365o[1] = true;
        gVar.f224358e = h1Var.m().o("lift_read_area_size", 0);
        gVar.f224365o[2] = true;
        gVar.f224359f = h1Var.k();
        gVar.f224365o[3] = true;
        gVar.f224360g = h1Var.m().q("resort_scene_bit_switch", 0L);
        gVar.f224365o[4] = true;
        gVar.f224361h = h1Var.m().o("resort_blocked_when_client_running_back", 0);
        gVar.f224365o[5] = true;
        gVar.f224362i = y0Var.a().o("BizTLRecommendFeedsBatchWithBizMsgResort", 0);
        gVar.f224365o[6] = true;
        gVar.f224363m = y0Var.a().o("BizTLRecommendFeedsOutBoxPullFeedsNeedUplineCard", 0);
        gVar.f224365o[7] = true;
        gVar.f224364n = h1Var.q();
        gVar.f224365o[8] = true;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("resortV2ControlFlagChangeAsync(ControlFlag=");
        sb7.append(gVar.f224357d);
        sb7.append(", HistoryBoxWording=");
        sb7.append(gVar.f224365o[3] ? gVar.f224359f : "");
        sb7.append(')');
        com.tencent.mars.xlog.Log.i("Finder.BoxFlutterBizMsgBridge", sb7.toString());
        c0Var.B(1, gVar, a50.b1.f1458a);
        f1474d = true;
    }
}
