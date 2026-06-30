package yw;

/* loaded from: classes11.dex */
public final class a3 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f547802d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f547803e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f547804f;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.Boolean f547806h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f547807i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f547808j;

    /* renamed from: a, reason: collision with root package name */
    public static final yw.a3 f547799a = new yw.a3();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f547800b = jz5.h.b(yw.w2.f548029d);

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f547801c = yw.x0.f548033a.b();

    /* renamed from: g, reason: collision with root package name */
    public static boolean f547805g = true;

    static {
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.z.f300790a = yw.y2.f548048a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ui() && gm0.j1.h() && gm0.j1.a()) {
            ((ku5.t0) ku5.t0.f394148d).a(yw.t2.f548004d);
        }
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.i a() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.b bVar;
        if (f547803e && f547807i) {
            bVar = com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.b.f300383b;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterBrandServiceBridge", "getAffBrandServiceRedDotManagerInstance hasInit=" + f547803e + " zidl2IvokeReady:" + f547807i);
            f547808j = true;
            bVar = null;
        }
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.v b() {
        if (f547803e) {
            return com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.v.f297582c;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterBrandServiceBridge", "getBizManagerInstance hasInit=" + f547803e);
        return null;
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.g0 c() {
        if (f547803e && f547807i) {
            return com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.g0.f300446c;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterBrandServiceBridge", "getBrandServiceNotiManagerInstance hasInit=" + f547803e + " zidl2IvokeReady:" + f547807i);
        f547808j = true;
        return null;
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a d() {
        if (f547803e && f547807i) {
            return com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a.f297578b;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterBrandServiceBridge", "getReportMgr hasInit=" + f547803e + " zidl2IvokeReady:" + f547807i);
        f547808j = true;
        return null;
    }

    public final synchronized void e() {
        if (f547802d) {
            return;
        }
        f547802d = true;
        if (f547803e) {
            return;
        }
        if (gm0.j1.h() && gm0.j1.a()) {
            zv.q qVar = zv.q.f557612a;
            if (!qVar.g()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init but not use aff ");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBrandServiceBridge", sb6.toString());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBrandServiceBridge", "init resetData= " + f547806h);
            ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
            ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).getClass();
            zv.l.f557549a.b(qVar.f());
            dw.f.f325603a.c();
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("brand_service_persist"), false);
            java.lang.String j17 = gm0.j1.b().j();
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.jni.C27657x1851221c.f60570x4fbc8495.m118920x6c4032e7(new aw.a());
            if (!com.p314xaae8f345.mm.vfs.w6.j(i17)) {
                com.p314xaae8f345.mm.vfs.w6.u(i17);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.f fVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.f();
            fVar.f300417d = false;
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            fVar.f300418e = false;
            java.lang.Boolean bool = f547806h;
            fVar.f300419f = bool != null ? bool.booleanValue() : false;
            fVar.f300420g = f547801c;
            fVar.f300421h = yw.h1.f547872h;
            fVar.f300422i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_time_empty_list_resort, 0) == 1;
            x20.a aVar = x20.a.f533017a;
            aVar.getClass();
            fVar.f300423m = ((java.lang.Number) x20.a.f533019c.b(aVar, x20.a.f533018b[0])).intValue() == 1 ? com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.g.kBizAffInitConfigAbstractTypeUnreadNotiDigestAlwaysShowInBox : com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.g.kBizAffInitConfigAbstractTypeNone;
            fVar.f300434x = aVar.d();
            fVar.A = aVar.c();
            fVar.B = ((lr1.t) ((ww.e) i95.n0.c(ww.e.class))).wi().o("ReSortBizMsgKeepPosEndResortSwitch", 0) == 1;
            fVar.C = ((lr1.t) ((ww.e) i95.n0.c(ww.e.class))).wi().o("ReSortBizMsgSerialResortReqSwitch", 0) == 1;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.v.f297582c.g(i17, j17, o45.wf.f424562g, fVar, yw.u2.f548011a);
            ow.i iVar = ow.i.f430784d;
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.g0 g0Var = com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.g0.f300446c;
            g0Var.i("notimsg-edit", new ow.e(iVar));
            g0Var.j("notimsg-insert", new ow.f(iVar));
            g0Var.h("notimsg-del", new ow.g(iVar));
            g0Var.k("notimsg-readed", new ow.h(iVar));
            f547803e = true;
            f547802d = false;
            f();
            ((ku5.t0) ku5.t0.f394148d).B(yw.v2.f548016d);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBrandServiceBridge", "hy: account not ready yet!");
    }

    public final void f() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.f fVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.f();
        x20.a aVar = x20.a.f533017a;
        fVar.f300424n = aVar.b();
        f06.v[] vVarArr = x20.a.f533018b;
        fVar.f300427q = ((java.lang.Number) x20.a.f533028l.b(aVar, vVarArr[8])).intValue();
        fVar.f300429s = ((java.lang.Number) x20.a.f533031o.b(aVar, vVarArr[11])).intValue();
        fVar.f300430t = ((java.lang.Number) x20.a.f533032p.b(aVar, vVarArr[12])).intValue();
        fVar.f300431u = ((java.lang.Number) x20.a.f533033q.b(aVar, vVarArr[13])).intValue();
        fVar.f300432v = ((java.lang.Number) x20.a.f533034r.b(aVar, vVarArr[14])).intValue();
        fVar.f300434x = aVar.d();
        fVar.f300435y = ((java.lang.Number) x20.a.f533041y.b(aVar, vVarArr[21])).intValue();
        fVar.f300433w = (java.lang.String) x20.a.f533039w.b(aVar, vVarArr[19]);
        fVar.A = aVar.c();
        fVar.B = ((lr1.t) ((ww.e) i95.n0.c(ww.e.class))).wi().o("ReSortBizMsgKeepPosEndResortSwitch", 0) == 1;
        fVar.C = ((lr1.t) ((ww.e) i95.n0.c(ww.e.class))).wi().o("ReSortBizMsgSerialResortReqSwitch", 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBrandServiceBridge", "[BRS]updateBSConfig subscribeCountLowerLimit: " + fVar.f300424n + ", requestFrequencyTime: " + fVar.f300427q + ", requestNotifyFrequencyTime: " + fVar.f300429s + "requestMassMsgCount: " + fVar.f300430t + "requestNotifyMsgFrequencyTime: " + fVar.f300431u + "requestMainTabFrequencyTime: " + fVar.f300432v + "notifyExpireSpecifiedTime: " + fVar.f300434x + "requestReliableNotifyFrequencyTime: " + fVar.f300435y + "requestCgiBufferMaxSize: " + fVar.A + "strategyBuffer: " + fVar.f300433w);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.v.f297582c.w(fVar, yw.z2.f548053a);
    }
}
