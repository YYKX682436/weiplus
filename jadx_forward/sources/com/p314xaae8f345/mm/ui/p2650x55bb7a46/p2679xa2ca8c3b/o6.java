package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class o6 {

    /* renamed from: a, reason: collision with root package name */
    public static final yo0.i f286671a;

    static {
        yo0.f fVar = new yo0.f();
        fVar.f545611b = true;
        fVar.f545610a = true;
        f286671a = fVar.a();
    }

    public static r45.mv2 a(ot0.q qVar) {
        zy2.e eVar = (zy2.e) qVar.y(zy2.e.class);
        if (eVar != null) {
            return eVar.f558905b;
        }
        return null;
    }

    public static void b(android.app.Activity activity, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ot0.q v17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.j()) || (v17 = ot0.q.v(f9Var.j())) == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
        intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
        intent.putExtra("Retr_Msg_Type", 27);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(v17, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        intent.putExtra("scene_from", 17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderActivity", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderActivity", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static void c(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, r45.mv2 mv2Var) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_title", mv2Var.m75945x2fec8307(0));
        intent.putExtra("key_topic_type", mv2Var.m75939xb282bd08(1));
        if (mv2Var.m75939xb282bd08(1) == 4) {
            intent.putExtra("KEY_FOLLOW_ID", mv2Var.m75945x2fec8307(5));
        } else if (mv2Var.m75939xb282bd08(1) == 7 && ((r45.ht0) mv2Var.m75936x14adae67(6)) != null) {
            intent.putExtra("key_activity_name", ((r45.ht0) mv2Var.m75936x14adae67(6)).m75945x2fec8307(1));
            intent.putExtra("key_activity_id", pm0.v.Z(((r45.ht0) mv2Var.m75936x14adae67(6)).m75945x2fec8307(0)));
            intent.putExtra("key_nick_name", ((r45.ht0) mv2Var.m75936x14adae67(6)).m75945x2fec8307(2));
            intent.putExtra("key_display_mask", ((r45.ht0) mv2Var.m75936x14adae67(6)).m75942xfb822ef2(4));
            intent.putExtra("key_cover_url", mv2Var.m75945x2fec8307(2));
        }
        r45.ze2 ze2Var = new r45.ze2();
        if (((r45.hv2) mv2Var.m75936x14adae67(4)) != null) {
            ze2Var.set(5, ((r45.hv2) mv2Var.m75936x14adae67(4)).m75945x2fec8307(0));
            ze2Var.set(0, java.lang.Float.valueOf(((r45.hv2) mv2Var.m75936x14adae67(4)).m75938x746dc8a6(1)));
            ze2Var.set(1, java.lang.Float.valueOf(((r45.hv2) mv2Var.m75936x14adae67(4)).m75938x746dc8a6(2)));
            try {
                intent.putExtra("key_topic_poi_location", ze2Var.mo14344x5f01b1f6());
            } catch (java.io.IOException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ChattingItemAppMsgFinderTopic", "location toByteArray exception");
            }
        }
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_from_user", f9Var.Q0());
        intent.putExtra("key_report_scene", com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()) ? 2 : 1);
        intent.putExtra("KEY_TAB_TYPE", 6);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0())) {
            intent.putExtra("key_finder_teen_mode_scene", 2);
        } else {
            intent.putExtra("key_finder_teen_mode_scene", 1);
        }
        intent.putExtra("key_finder_teen_mode_user_name", "");
        intent.putExtra("key_finder_teen_mode_user_id", "");
        int i17 = mv2Var.m75939xb282bd08(1) != 7 ? 22 : 59;
        intent.putExtra("key_activity_profile_src_type", "3");
        intent.putExtra("key_entrance_type", 0);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()) ? 3 : 2, 2, i17, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f542005a.m(context, intent, 4);
    }
}
