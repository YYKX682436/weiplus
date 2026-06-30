package qd0;

@j95.b
/* loaded from: classes.dex */
public final class q0 extends i95.w implements rd0.e1 {
    public android.content.Intent Ai(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, java.lang.String title, java.lang.String chatroomName, java.util.List selectedMemberList, java.util.List allUserNameList, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroomName, "chatroomName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedMemberList, "selectedMemberList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(allUserNameList, "allUserNameList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvvmSelectContactFeatureService", "createChooseLocalChatRoomMemberIntent title:" + title + " chatroomName:" + chatroomName + " selectedMemberList:" + selectedMemberList + " allUserNameList:" + allUserNameList);
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
        intent.putExtra("titile", title);
        intent.putExtra("list_attr", 64);
        intent.putExtra("chatroomName", chatroomName);
        intent.putExtra("chatroommemberlist", kz5.n0.g0(allUserNameList, ",", null, null, 0, null, null, 62, null));
        intent.putExtra("always_select_contact", kz5.n0.g0(selectedMemberList, ",", null, null, 0, null, null, 62, null));
        intent.putExtra("addGroupManager", z17);
        pf5.j0.a(intent, cj5.q4.class);
        pf5.j0.a(intent, dj5.b0.class);
        pf5.j0.a(intent, dj5.m.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, cj5.s.class);
        pf5.j0.a(intent, cj5.h3.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        return intent;
    }

    public android.content.Intent Bi(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, java.lang.String title, boolean z17, java.util.List list) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
        intent.putExtra("titile", title);
        pf5.j0.a(intent, fj5.g.class);
        pf5.j0.a(intent, fj5.i.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        if (list != null) {
            intent.putExtra("already_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(list, ","));
        }
        if (z17) {
            i17 = 64;
        } else {
            com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
            i17 = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288313a;
        }
        intent.putExtra("list_attr", i17);
        intent.putExtra("KEY_NEED_SEAR_HEADER", false);
        return intent;
    }

    public android.content.Intent Di(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, java.lang.String title, boolean z17, java.util.List list) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
        intent.putExtra("titile", title);
        pf5.j0.a(intent, gj5.b.class);
        pf5.j0.a(intent, gj5.c.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        if (list != null) {
            intent.putExtra("already_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(list, ","));
        }
        if (z17) {
            i17 = 64;
        } else {
            com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
            i17 = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288313a;
        }
        intent.putExtra("list_attr", i17);
        intent.putExtra("KEY_NEED_SEAR_HEADER", false);
        return intent;
    }

    public android.content.Intent Ni(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, java.lang.String title) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvvmSelectContactFeatureService", "createQuickSendRedPacketRecentConversationIntent title:".concat(title));
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
        intent.putExtra("titile", title);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.v0.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e0.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.h1.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        return intent;
    }

    public android.content.Intent Ri(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ig7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        intent.putExtra("titile", string);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.g.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.v0.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.h1.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e0.class);
        qg5.z2 z2Var = (qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class));
        boolean mj6 = z2Var.mj(context, true);
        if (mj6) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zp zpVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zp();
            z2Var.f444811t = zpVar;
            ((wj.j0) ((xj.i) ((jz5.n) zpVar.f281937e).mo141623x754a37bb())).Vi(wj.t0.f528040J, 3000L, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.yp(zpVar));
        }
        intent.putExtra("KEY_IS_SUPPORT_FORWARD_TO_YUANBAO", mj6);
        intent.putExtra("KEY_IS_SUPPORT_FORWARD_TO_CLAWBOT", true);
        intent.putExtra("KEY_IS_FORWARD_TO_OTHER_APPS_RENAME", j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2532xd7a392c5.C20194x7c1a905c()) == 1);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.t.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.i.class);
        intent.putExtra("INTENT_KEY_PUSH_DOWN_OUT_ANIMATION", true);
        intent.putExtra("KOrientation", 1);
        return intent;
    }

    public android.content.Intent Ui(android.content.Context context, boolean z17, boolean z18, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ig7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        intent.putExtra("titile", string);
        if (z18) {
            pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.g.class);
        } else {
            pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.k.class);
        }
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.v0.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.h1.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e0.class);
        if (z19) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).getClass();
            intent.putExtra("KEY_IS_SUPPORT_FORWARD_TYPE_WXWORK", com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.k());
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).getClass();
            intent.putExtra("KEY_IS_SUPPORT_FORWARD_TYPE_WXWORK_LOCAL", com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.j());
        }
        qg5.z2 z2Var = (qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class));
        boolean mj6 = z2Var.mj(context, true);
        if (mj6) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zp zpVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zp();
            z2Var.f444811t = zpVar;
            ((wj.j0) ((xj.i) ((jz5.n) zpVar.f281937e).mo141623x754a37bb())).Vi(wj.t0.f528040J, 3000L, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.yp(zpVar));
        }
        intent.putExtra("KEY_IS_SUPPORT_FORWARD_TO_YUANBAO", mj6);
        intent.putExtra("KEY_IS_FORWARD_TO_OTHER_APPS_RENAME", j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2532xd7a392c5.C20194x7c1a905c()) == 1);
        intent.putExtra("KEY_IS_SUPPORT_FORWARD_TO_CLAWBOT", true);
        intent.putExtra("KOrientation", 1);
        if (z17) {
            pf5.j0.a(intent, bj5.f0.class);
            pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.r0.class);
            intent.putExtra("max_limit_num", 9);
            intent.putExtra("too_many_member_tip_string", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ifr, 9));
        }
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.t.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.i.class);
        intent.putExtra("INTENT_KEY_PUSH_DOWN_OUT_ANIMATION", true);
        return intent;
    }

    public android.content.Intent wi(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, java.lang.String title, java.lang.String chatroomName, java.util.List selectedMemberList, java.util.List allUserNameList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroomName, "chatroomName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedMemberList, "selectedMemberList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(allUserNameList, "allUserNameList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvvmSelectContactFeatureService", "createChooseChatRoomMemberIntent title:" + title + " chatroomName:" + chatroomName + " selectedMemberList:" + selectedMemberList + " allUserNameList:" + allUserNameList);
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
        intent.putExtra("titile", title);
        intent.putExtra("list_attr", 64);
        intent.putExtra("chatroomName", chatroomName);
        intent.putExtra("chatroommemberlist", kz5.n0.g0(allUserNameList, ",", null, null, 0, null, null, 62, null));
        intent.putExtra("already_select_contact", kz5.n0.g0(selectedMemberList, ",", null, null, 0, null, null, 62, null));
        pf5.j0.a(intent, cj5.q4.class);
        pf5.j0.a(intent, dj5.r.class);
        pf5.j0.a(intent, dj5.m.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, cj5.s.class);
        pf5.j0.a(intent, cj5.h3.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        return intent;
    }
}
