package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class bc extends qw4.a implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.bc f267513d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.bc();

    /* renamed from: e, reason: collision with root package name */
    public static nw4.k f267514e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f267515f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f267516g;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f267517h;

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (msg.f422323a.isEmpty()) {
            env.f422396d.e(msg.f422546c, "sendRedCoverAppMsg:fail missing arguments", null);
            return false;
        }
        f267514e = env;
        f267515f = msg;
        java.lang.String str = (java.lang.String) msg.f422323a.get("receiveuri");
        f267516g = (java.lang.String) msg.f422323a.get("session_id");
        f267517h = (java.lang.String) msg.f422323a.get("cover_id");
        android.content.Context context = env.f422393a;
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
            abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(this);
            rd0.e1 e1Var = (rd0.e1) i95.n0.c(rd0.e1.class);
            java.lang.String string = env.f422393a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gkc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            ((qd0.q0) e1Var).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvvmSelectContactFeatureService", "createSendRedCoverAppMsgRecentConversationIntent title:".concat(string));
            android.content.Intent intent = new android.content.Intent(abstractActivityC21394xb3d2c0cf, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
            intent.putExtra("titile", string);
            pf5.j0.a(intent, cj5.k4.class);
            pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.v0.class);
            pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e0.class);
            pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.h1.class);
            pf5.j0.a(intent, cj5.n3.class);
            pf5.j0.a(intent, cj5.w2.class);
            pf5.j0.a(intent, cj5.l2.class);
            intent.putExtra("KEY_IS_HIDE_FORWARD_TO_WEWORK", true);
            intent.putExtra("KSendRedCoverAppMsgRequestUrl", str);
            intent.putExtra("KSendRedCoverAppMsgSessionId", f267516g);
            intent.putExtra("KSendRedCoverAppMsgCoverId", f267517h);
            intent.putExtra("QSRPRecentConversationDataSourceIsBlockOpenIM", true);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27.j) ((mh0.n) i95.n0.c(mh0.n.class))).getClass();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).getClass();
            pf5.j0.a(intent, fb3.j.class);
            pf5.j0.a(intent, fb3.b.class);
            abstractActivityC21394xb3d2c0cf.startActivityForResult(intent, 217);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.z.f34775x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.yc.f35027x24728b;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i18 != -1 || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("KEY_FINISH_ACTIVITY_REASON");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_SEND_APPMSG_SUCCESS")) {
            nw4.k kVar = f267514e;
            if (kVar != null) {
                android.content.Context context = kVar.f422393a;
                db5.t7.h(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iid));
                nw4.y2 y2Var = f267515f;
                kVar.f422396d.e(y2Var != null ? y2Var.f422546c : null, "sendRedCoverAppMsg:ok ", null);
                return;
            }
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_BACK_PRESSED")) {
            nw4.k kVar2 = f267514e;
            if (kVar2 != null) {
                nw4.y2 y2Var2 = f267515f;
                kVar2.f422396d.e(y2Var2 != null ? y2Var2.f422546c : null, "sendRedCoverAppMsg:cancel ", null);
                return;
            }
            return;
        }
        nw4.k kVar3 = f267514e;
        if (kVar3 != null) {
            nw4.y2 y2Var3 = f267515f;
            kVar3.f422396d.e(y2Var3 != null ? y2Var3.f422546c : null, "sendRedCoverAppMsg:fail ", null);
        }
    }
}
