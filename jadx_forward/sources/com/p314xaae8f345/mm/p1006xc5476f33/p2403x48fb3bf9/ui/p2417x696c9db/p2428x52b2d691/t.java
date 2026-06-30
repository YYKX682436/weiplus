package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class t extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.t f268065d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.t();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        jz5.f0 f0Var;
        java.lang.String obj;
        java.lang.String obj2;
        java.lang.String obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseChatRoomMember", "handleMsg params:" + msg.f422323a);
        android.content.Context context = env.f422393a;
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) {
            java.lang.Object obj4 = msg.f422323a.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            java.lang.String str2 = (obj4 == null || (obj3 = obj4.toString()) == null) ? "" : obj3;
            java.lang.Object obj5 = msg.f422323a.get("chatRoomUserName");
            java.lang.String str3 = (obj5 == null || (obj2 = obj5.toString()) == null) ? "" : obj2;
            java.lang.Object obj6 = msg.f422323a.get("selectedUserNameList");
            java.lang.String str4 = (obj6 == null || (obj = obj6.toString()) == null) ? "" : obj;
            java.lang.Object obj7 = msg.f422323a.get("allUserNameList");
            if (obj7 == null || (str = obj7.toString()) == null) {
                str = "";
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.String str5 : r26.n0.f0(str4, new java.lang.String[]{","}, false, 0, 6, null)) {
                if (!r26.n0.N(str5)) {
                    arrayList.add(str5);
                }
            }
            for (java.lang.String str6 : r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null)) {
                if (!r26.n0.N(str6)) {
                    arrayList2.add(str6);
                }
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            com.p314xaae8f345.mm.ui.vc m78751x5dc77fb5 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context).m78751x5dc77fb5(((qd0.q0) ((rd0.e1) i95.n0.c(rd0.e1.class))).wi((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context, str2, str3, arrayList, arrayList2));
            if (m78751x5dc77fb5 != null) {
                ((com.p314xaae8f345.mm.ui.bd) m78751x5dc77fb5).f279410a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.s(hashMap, env, msg);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                hashMap.put("errCode", -1);
                hashMap.put("action", -1);
                env.f422396d.e(msg.f422546c, msg.f422552i + ":fail", hashMap);
            }
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 457;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "chooseChatRoomMember";
    }
}
