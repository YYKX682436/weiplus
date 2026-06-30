package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class w7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w7 f287444a = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w7();

    public static final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w7 w7Var, android.app.Activity activity, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ot0.q v17;
        w7Var.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.j()) || (v17 = ot0.q.v(f9Var.j())) == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
        intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
        intent.putExtra("Retr_Msg_Type", 35);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(v17, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderMemberNameCard", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderMemberNameCard", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void b(yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        zy2.h hVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        ot0.q v17 = ot0.q.v(msg.U1());
        if (v17 == null || (hVar = (zy2.h) v17.y(zy2.h.class)) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hVar.f558925c)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_member_inlet_source", 5);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.app.Activity g17 = ui6.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        java.lang.String authorFinderUsername = hVar.f558925c;
        int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(msg.Q0()) ? 3 : 2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Nk(g17, intent, authorFinderUsername, i17, 3);
    }
}
