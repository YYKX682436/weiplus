package qg5;

/* loaded from: classes8.dex */
public final class q4 extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f444677f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f444678g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f444679h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f444680i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f444681m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f444677f = jz5.h.b(qg5.d4.f444480d);
        this.f444678g = jz5.h.b(qg5.p4.f444666d);
        this.f444679h = jz5.h.b(qg5.c4.f444474d);
        this.f444680i = jz5.h.b(qg5.b4.f444465d);
        this.f444681m = jz5.h.b(qg5.j4.f444560d);
    }

    public static final void T6(qg5.q4 q4Var) {
        q4Var.getClass();
        java.util.Map m17 = kz5.c1.m(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290833g, kz5.c1.k(new jz5.l("forward_sid", com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290828b), new jz5.l("share_type", 13)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoForwardChatRecordsFSC", "reportForwardActiveYuanBaoSucc: " + m17);
        ((cy1.a) ((dy1.r) ((jz5.n) q4Var.f444681m).mo141623x754a37bb())).Ej("active_yuanbao_succ", m17, 32337);
    }

    public static final void U6(qg5.q4 q4Var, int i17) {
        q4Var.getClass();
        java.util.Map m17 = kz5.c1.m(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290833g, kz5.c1.k(new jz5.l("forward_sid", com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290828b), new jz5.l("popup_action_type", java.lang.Integer.valueOf(i17)), new jz5.l("share_type", 13)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoForwardChatRecordsFSC", "reportForwardAppJumpPopupClk: popupActionType=" + i17 + ", " + m17);
        ((cy1.a) ((dy1.r) ((jz5.n) q4Var.f444681m).mo141623x754a37bb())).Hj("app_jump_yuanbao_popup", "view_clk", m17, 32337);
    }

    public final ct.q2 V6() {
        return (ct.q2) ((jz5.n) this.f444677f).mo141623x754a37bb();
    }

    public final void W6(android.content.Context uiCtx, java.util.List msgList, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, xj.m mVar, yz5.a onLaunchSuccess) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiCtx, "uiCtx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onLaunchSuccess, "onLaunchSuccess");
        if (!z17) {
            a7(uiCtx, msgList, z3Var, z17, mVar, onLaunchSuccess);
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("yuanbao_forward_chat_records_feature_service");
        if (M != null ? M.getBoolean("yuanbao_forward_agreed", false) : false) {
            a7(uiCtx, msgList, z3Var, z17, mVar, onLaunchSuccess);
        } else {
            new qg5.w4(uiCtx, new qg5.g4(M, this, uiCtx, msgList, z3Var, z17, mVar, onLaunchSuccess), qg5.h4.f444543d).f444781d.C();
        }
    }

    public final void X6(android.content.Context uiCtx, java.util.List records, xj.m mVar, yz5.a onLaunchSuccess) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiCtx, "uiCtx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(records, "records");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onLaunchSuccess, "onLaunchSuccess");
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        qg5.l0 l0Var = (qg5.l0) V6();
        l0Var.getClass();
        if (l0Var.f444591t.get() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsStagingFeatureService", "Already in staging");
            l0Var.ij();
        }
        l0Var.f444591t.set(new qg5.r(null, null, records));
        qg5.r rVar = (qg5.r) l0Var.f444591t.get();
        if (rVar != null) {
        }
        synchronized (l0Var.f444593v) {
            l0Var.f444592u = null;
            l0Var.f444594w = null;
        }
        java.lang.String c17 = com.p314xaae8f345.mm.app.p626xc52405f1.C5090xb499f982.f135244e.c(uuid);
        if (c17 != null) {
            Z6(uiCtx, uuid, new qg5.i4(this, c17, null), mVar, onLaunchSuccess);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.YuanBaoForwardChatRecordsFSC", "getFilePathChatRecords failed");
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(uiCtx);
        e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.ohx);
        e4Var.c();
    }

    public final void Y6() {
        java.util.Map m17 = kz5.c1.m(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290833g, kz5.c1.k(new jz5.l("forward_sid", com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290828b), new jz5.l("share_type", 13)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoForwardChatRecordsFSC", "reportForwardAppJumpPopupExp: " + m17);
        ((cy1.a) ((dy1.r) ((jz5.n) this.f444681m).mo141623x754a37bb())).Hj("app_jump_yuanbao_popup", "view_exp", m17, 32337);
    }

    public final void Z6(android.content.Context context, java.lang.String str, yz5.l lVar, xj.m mVar, yz5.a aVar) {
        gm0.b bVar;
        gm0.m b17 = gm0.j1.b();
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = (b17 == null || (bVar = b17.f354778h) == null) ? null : bVar.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.c(c20976x6ba6452a, null, new qg5.k4(context, str, null), 1, null);
        }
        if (c20976x6ba6452a != null) {
            v65.i.c(c20976x6ba6452a, null, new qg5.n4(c20976x6ba6452a, context, this, mVar, aVar, lVar, null), 1, null);
        }
    }

    public final void a7(android.content.Context context, java.util.List list, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, xj.m mVar, yz5.a aVar) {
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        ((qg5.l0) V6()).oj(context, ac5.f.f84623a.b(context, z3Var == null ? new com.p314xaae8f345.mm.p2621x8fb0427b.z3() : z3Var), z3Var, list, true);
        ct.q2 V6 = V6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(V6, "<get-chatRecordsStagingService>(...)");
        ct.q2.k5(V6, false, 2, z17, z17, false, 16, null);
        ((qg5.l0) V6()).Zi(false);
        java.lang.String c17 = com.p314xaae8f345.mm.app.p626xc52405f1.C5090xb499f982.f135244e.c(uuid);
        if (c17 != null) {
            Z6(context, uuid, new qg5.o4(this, c17, null), mVar, aVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.YuanBaoForwardChatRecordsFSC", "getFilePathChatRecords failed");
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.ohx);
        e4Var.c();
    }
}
