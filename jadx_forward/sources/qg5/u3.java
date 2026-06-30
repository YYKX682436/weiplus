package qg5;

/* loaded from: classes8.dex */
public final class u3 extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f444743f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f444744g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f444745h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f444746i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f444747m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f444748n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f444743f = jz5.h.b(qg5.l3.f444595d);
        this.f444744g = jz5.h.b(qg5.i3.f444551d);
        this.f444745h = jz5.h.b(qg5.g3.f444524d);
        this.f444746i = jz5.h.b(qg5.t3.f444724d);
        this.f444747m = jz5.h.b(qg5.s3.f444709d);
        this.f444748n = jz5.h.b(qg5.h3.f444542d);
    }

    public static final ct.k3 T6(qg5.u3 u3Var) {
        return (ct.k3) ((jz5.n) u3Var.f444746i).mo141623x754a37bb();
    }

    public final ct.q2 U6() {
        return (ct.q2) ((jz5.n) this.f444744g).mo141623x754a37bb();
    }

    public final void V6(android.content.Context uiCtx, java.util.List msgList, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, xj.m mVar, boolean z17, boolean z18, yz5.a onDone) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiCtx, "uiCtx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDone, "onDone");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) this.f444743f).mo141623x754a37bb();
        boolean z19 = o4Var != null ? o4Var.getBoolean("yuanbao_copy_agreed", false) : false;
        qg5.n3 n3Var = new qg5.n3(this);
        if (z19) {
            W6(msgList, z3Var, uiCtx, mVar, z17, z18, onDone);
            return;
        }
        qg5.a4 a4Var = new qg5.a4(uiCtx, new qg5.m3(this, msgList, z3Var, uiCtx, mVar, z17, z18, onDone), n3Var);
        a4Var.f444443d.C();
        qg5.e3 e3Var = (qg5.e3) a4Var.a();
        ((cy1.a) e3Var.ij()).Hj("yuanbao_legal_popup", "view_exp", e3Var.nj("journey_copy"), 35480);
    }

    public final void W6(java.util.List list, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, android.content.Context context, xj.m mVar, boolean z17, boolean z18, yz5.a aVar) {
        gm0.b bVar;
        gm0.m b17 = gm0.j1.b();
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = (b17 == null || (bVar = b17.f354778h) == null) ? null : bVar.f354678e;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        ((qg5.l0) U6()).oj(context, ac5.f.f84623a.b(context, z3Var == null ? new com.p314xaae8f345.mm.p2621x8fb0427b.z3() : z3Var), z3Var, list, true);
        ct.q2 U6 = U6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(U6, "<get-chatRecordsStagingService>(...)");
        ct.q2.k5(U6, false, 2, z17, z18, false, 16, null);
        ((qg5.l0) U6()).Zi(false);
        java.lang.String c17 = com.p314xaae8f345.mm.app.p626xc52405f1.C5090xb499f982.f135244e.c(uuid);
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.YuanBaoCopyChatRecordsFSC", "getFilePathChatRecords failed");
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.ohx);
            e4Var.c();
            return;
        }
        if (c20976x6ba6452a != null) {
            v65.i.c(c20976x6ba6452a, null, new qg5.o3(context, uuid, null), 1, null);
        }
        if (c20976x6ba6452a != null) {
            v65.i.c(c20976x6ba6452a, null, new qg5.r3(c20976x6ba6452a, context, this, mVar, aVar, c17, null), 1, null);
        }
    }
}
