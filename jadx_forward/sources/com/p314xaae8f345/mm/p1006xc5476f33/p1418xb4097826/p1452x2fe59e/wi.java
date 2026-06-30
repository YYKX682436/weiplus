package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class wi {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wi f192511a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wi();

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wi wiVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, yz5.l lVar) {
        wiVar.getClass();
        if (!hc2.o0.d(c14994x9b99c079.getFeedObject())) {
            java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.exu);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            hc2.f1.B(activity, string);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("share live  ");
        sb6.append(c14994x9b99c079.m59251x5db1b11());
        sb6.append(' ');
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = c14994x9b99c079.getFeedObject();
        sb6.append(feedObject != null ? java.lang.Integer.valueOf(feedObject.m76777xba60e801()) : null);
        sb6.append(" to conversation,liveId:");
        r45.nw1 m59258xd0557130 = c14994x9b99c079.m59258xd0557130();
        sb6.append(m59258xd0557130 != null ? java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)) : null);
        sb6.append(",desc:");
        sb6.append(c14994x9b99c079.m59226x730bcac6());
        sb6.append(",liveStatus ");
        r45.nw1 m59258xd05571302 = c14994x9b99c079.m59258xd0557130();
        sb6.append(m59258xd05571302 != null ? java.lang.Integer.valueOf(m59258xd05571302.m75939xb282bd08(2)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", sb6.toString());
        ot0.q qVar = new ot0.q();
        zy2.c cVar = new zy2.c();
        r45.g92 m59239x1309d228 = c14994x9b99c079.m59239x1309d228();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m59239x1309d228, "<set-?>");
        cVar.f558892b = m59239x1309d228;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) ((zy2.v9) zVar.a(activity).c(zy2.v9.class))).Q6(cVar.f558892b);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) ((zy2.v9) zVar.a(activity).c(zy2.v9.class))).P6(cVar.f558892b);
        qVar.f(cVar);
        jz5.l c17 = wiVar.c(c14994x9b99c079);
        qVar.f430199i = ((java.lang.Number) c17.f384366d).intValue();
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_Type", ((java.lang.Number) c17.f384367e).intValue());
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(qVar, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        intent.putExtra("Retr_MsgQuickShare", true);
        intent.putExtra("custom_send_text", str);
        intent.putExtra("Select_Conv_User", str2);
        intent.putExtra("Retr_finder_in_stream", true);
        intent.setClassName(activity, "com.tencent.mm.ui.transmit.MsgRetransmitUI");
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity : null;
        com.p314xaae8f345.mm.ui.vc m78751x5dc77fb5 = activityC21401x6ce6f73f != null ? activityC21401x6ce6f73f.m78751x5dc77fb5(intent) : null;
        if (m78751x5dc77fb5 != null) {
            ((com.p314xaae8f345.mm.ui.bd) m78751x5dc77fb5).f279410a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui(c14994x9b99c079, lVar);
        }
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wi wiVar) {
        wiVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", "3");
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f409895m, jSONObject.toString(), null, 4, null);
    }

    public final jz5.l c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        if (!((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(c14994x9b99c079.m59258xd0557130())) {
            if (!((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ui(c14994x9b99c079.m59258xd0557130())) {
                return new jz5.l(63, 23);
            }
        }
        return new jz5.l(88, 31);
    }
}
