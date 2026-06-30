package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b;

/* loaded from: classes.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e0 f290817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f290818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f290819f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e0 e0Var, boolean z17, wi5.n0 n0Var) {
        super(0);
        this.f290817d = e0Var;
        this.f290818e = z17;
        this.f290819f = n0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e0 e0Var;
        wi5.n0 n0Var;
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e0 e0Var2 = this.f290817d;
        int intExtra = e0Var2.m158354x19263085().getIntent().getIntExtra("ForwardParams_ReportFromScene", 0);
        int intExtra2 = e0Var2.m158354x19263085().getIntent().getIntExtra("ForwardParams_ForwardMsgType", 0);
        j75.f Q6 = e0Var2.Q6();
        java.util.Map a17 = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a.a((Q6 == null || (n0Var = (wi5.n0) Q6.mo140437x75286adb()) == null) ? null : n0Var.f527857t, intExtra, intExtra2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardReportHelper", "reportForwardCreateChatBtn: " + a17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_create_chat_btn", "view_clk", a17, 32337);
        boolean z17 = this.f290818e;
        wi5.n0 state = this.f290819f;
        if (z17) {
            rd0.i1 i1Var = (rd0.i1) i95.n0.c(rd0.i1.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = e0Var2.m158354x19263085();
            java.util.LinkedList userNameList = state.f527852o;
            ((com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.f) i1Var).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userNameList, "userNameList");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
            intent.putExtra("list_type", 14);
            intent.putExtra("titile", activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571467fx));
            com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
            intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288321i);
            intent.putExtra("already_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(userNameList, ","));
            intent.putExtra("max_limit_num", 9);
            intent.putExtra("block_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J1(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.c(), ","));
            pf5.j0.a(intent, gk5.k1.class);
            pf5.j0.a(intent, cj5.q4.class);
            pf5.j0.a(intent, aj5.g1.class);
            pf5.j0.a(intent, aj5.i.class);
            pf5.j0.a(intent, cj5.u3.class);
            pf5.j0.a(intent, cj5.k4.class);
            pf5.j0.a(intent, cj5.s.class);
            pf5.j0.a(intent, cj5.h3.class);
            pf5.j0.a(intent, cj5.n3.class);
            pf5.j0.a(intent, cj5.w2.class);
            pf5.j0.a(intent, cj5.l2.class);
            e0Var2.m158354x19263085().startActivityForResult(intent, 74518);
            e0Var = e0Var2;
        } else {
            rd0.i1 i1Var2 = (rd0.i1) i95.n0.c(rd0.i1.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = e0Var2.m158354x19263085();
            ((com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.f) i1Var2).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
            android.content.Intent intent2 = new android.content.Intent();
            e0Var = e0Var2;
            intent2.putExtra("list_type", 5);
            intent2.setClass(activity2, com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
            if ((state.H & 4) > 0) {
                com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
                intent2.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288320h & (-65));
                intent2.putExtra("Select_Conv_Type", state.H);
            } else {
                pf5.j0.a(intent2, cj5.q4.class);
                com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
                intent2.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288320h);
            }
            intent2.putExtra("block_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J1(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.c(), ","));
            if ((state.H & 4) > 0) {
                intent2.putExtra("titile", activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571467fx));
                pf5.j0.a(intent2, kk5.o0.class);
                pf5.j0.a(intent2, aj5.g1.class);
                pf5.j0.a(intent2, gk5.k1.class);
            } else {
                intent2.putExtra("titile", activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mxl));
                intent2.putExtra("recommend_chatroom", true);
                intent2.putExtra("group_select_need_result", true);
                intent2.putExtra("from_create_group_scene", 5);
                pf5.j0.a(intent2, aj5.l1.class);
                intent2.putExtra("KShowSelectExistChatroom", true);
                pf5.j0.a(intent2, kk5.q.class);
                pf5.j0.a(intent2, aj5.r.class);
                pf5.j0.a(intent2, kk5.c0.class);
                pf5.j0.a(intent2, kk5.h0.class);
                pf5.j0.a(intent2, aj5.r0.class);
                pf5.j0.a(intent2, aj5.i1.class);
            }
            pf5.j0.a(intent2, aj5.i.class);
            pf5.j0.a(intent2, cj5.u3.class);
            pf5.j0.a(intent2, cj5.k4.class);
            pf5.j0.a(intent2, cj5.s.class);
            pf5.j0.a(intent2, cj5.h3.class);
            pf5.j0.a(intent2, cj5.n3.class);
            pf5.j0.a(intent2, cj5.w2.class);
            pf5.j0.a(intent2, cj5.l2.class);
            e0Var.m158354x19263085().startActivityForResult(intent2, 74517);
        }
        j75.f Q62 = e0Var.Q6();
        if (Q62 == null) {
            return null;
        }
        Q62.B3(new wi5.k());
        return jz5.f0.f384359a;
    }
}
