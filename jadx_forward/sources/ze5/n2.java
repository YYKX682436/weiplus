package ze5;

/* loaded from: classes9.dex */
public final class n2 {
    public n2(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final void a(ze5.n2 n2Var, android.app.Activity activity, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ot0.q v17;
        n2Var.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.j()) || (v17 = ot0.q.v(f9Var.j())) == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
        intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
        intent.putExtra("Retr_Msg_Type", 20);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(v17, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        intent.putExtra("scene_from", 17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgFinderNameCardMvvm$Companion", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgFinderNameCardMvvm$Companion", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void b(z01.d dVar, android.content.Context context, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (i17 > 0) {
            if (i17 == 1) {
                if (!(str == null || str.length() == 0)) {
                    dVar.f550517m = str;
                    return;
                } else {
                    dVar.f550515h = com.p314xaae8f345.mm.R.raw.f79909x77ca9e41;
                    dVar.f550516i = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7);
                    return;
                }
            }
            if (i17 != 2) {
                return;
            }
            if (str == null || str.length() == 0) {
                dVar.f550515h = com.p314xaae8f345.mm.R.raw.f79910x4f27281f;
            } else {
                dVar.f550517m = str;
            }
        }
    }

    public final void c(yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String U1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        if (f9Var == null || (U1 = f9Var.U1()) == null) {
            return;
        }
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(U1);
        v05.b k17 = cVar.k();
        x05.c cVar2 = k17 != null ? (x05.c) k17.m75936x14adae67(k17.f513848e + 57) : null;
        if (cVar2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar2.m174810x6c03c64c())) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0())) {
            intent.putExtra("key_finder_teen_mode_scene", 2);
            intent.putExtra("report_scene", 2);
        } else {
            intent.putExtra("key_finder_teen_mode_scene", 1);
            intent.putExtra("report_scene", 1);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()) ? 3 : 2, 3, 32, intent);
        intent.putExtra("key_enter_profile_type", 4);
        intent.putExtra("key_entrance_type", 0);
        intent.putExtra("key_from_comment_scene", 11);
        intent.putExtra("from_user", f9Var.Q0());
        intent.putExtra("key_from_user_name", ki0.a.a(f9Var));
        intent.putExtra("key_ec_source", cVar2.n());
        intent.putExtra("finder_username", cVar2.m174810x6c03c64c());
        intent.putExtra("key_to_user_name", ki0.a.b(f9Var));
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_finder_teen_mode_user_name", cVar2.m174809x8010e5e4());
        intent.putExtra("key_finder_teen_mode_user_id", cVar2.m174810x6c03c64c());
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Bj(intent, f9Var, new r45.md5());
        android.app.Activity g17 = ui6.g();
        if (g17 != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f542005a.w(g17, intent);
        }
    }
}
