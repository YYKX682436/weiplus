package f34;

/* loaded from: classes11.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f340887a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f340888b;

    public i() {
        this.f340888b = "";
        this.f340888b = g34.a.d();
    }

    public boolean a(java.lang.String str) {
        return java.util.regex.Pattern.compile("[0-9]*").matcher(str).matches();
    }

    public void b() {
        f34.e eVar;
        if (this.f340887a == null) {
            return;
        }
        for (int i17 = 0; i17 < ((java.util.ArrayList) this.f340887a).size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f340887a).get(i17);
            if (weakReference != null && (eVar = (f34.e) weakReference.get()) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17671x63665fce activityC17671x63665fce = (com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17671x63665fce) eVar;
                g34.a.a();
                activityC17671x63665fce.q7();
                activityC17671x63665fce.t7();
                activityC17671x63665fce.r7();
            }
        }
    }

    public void c(java.lang.String str, long j17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardMsgMgr", "msg_id is " + j17);
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShakeCardMsgMgr", "onReceive() msgText is empty");
            return;
        }
        f34.h hVar = null;
        f34.f fVar = null;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardMsgMgr", "onReceive() msgText is MSG_TYPE_ENTRANCE");
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "sysmsg", null);
            if (d17 != null) {
                fVar = new f34.f();
                java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.begintime");
                if (android.text.TextUtils.isEmpty(str2) || !a(str2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml begintime is " + str2);
                    fVar.f340877a = 0;
                } else {
                    fVar.f340877a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str2, 0);
                }
                java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.endtime");
                if (android.text.TextUtils.isEmpty(str3) || !a(str3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml endtime is " + str3);
                    fVar.f340878b = 0;
                } else {
                    fVar.f340878b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str3, 0);
                }
                fVar.f340879c = (java.lang.String) d17.get(".sysmsg.entrancename");
                java.lang.String str4 = (java.lang.String) d17.get(".sysmsg.activitytype");
                if (android.text.TextUtils.isEmpty(str4) || !a(str4)) {
                    fVar.f340880d = 1;
                } else {
                    fVar.f340880d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str4, 0);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml activitytype is " + str4);
                java.lang.String str5 = (java.lang.String) d17.get(".sysmsg.flowcontrollevelmin");
                if (android.text.TextUtils.isEmpty(str5) || !a(str5)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml flowcontrollevelmin is " + str5);
                    fVar.f340881e = 0;
                } else {
                    fVar.f340881e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str5, 0);
                }
                fVar.f340883g = (java.lang.String) d17.get(".sysmsg.shakecardentrancetip");
                java.lang.String str6 = (java.lang.String) d17.get(".sysmsg.flowcontrollevelmax");
                if (android.text.TextUtils.isEmpty(str6) || !a(str6)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml flowcontrollevelmax is " + str6);
                    fVar.f340882f = 0;
                } else {
                    fVar.f340882f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str6, 0);
                }
            }
            if (fVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShakeCardMsgMgr", "saveEntranceMsg msg == null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardMsgMgr", "saveEntranceMsg msg");
                if (!g34.a.g()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardMsgMgr", "saveEntranceMsg isShakeCardEntranceOpen is false");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardMsgMgr", "saveEntranceMsg begintime:" + fVar.f340877a + "  endtime:" + fVar.f340878b + "  flowlevelmin:" + fVar.f340881e + "  flowlevelmax:" + fVar.f340882f + " entrancename:" + fVar.f340879c + " activitytype:" + fVar.f340880d);
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_BEGIN_TIME_INT_SYNC, java.lang.Integer.valueOf(fVar.f340877a));
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_END_TIME_INT_SYNC, java.lang.Integer.valueOf(fVar.f340878b));
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_NAME_STRING_SYNC, fVar.f340879c);
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ACTIVITY_TYPE_INT_SYNC, java.lang.Integer.valueOf(fVar.f340880d));
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_FLOW_CONTROL_LEVEL_MIN_INT_SYNC, java.lang.Integer.valueOf(fVar.f340881e));
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_FLOW_CONTROL_LEVEL_MAX_INT_SYNC, java.lang.Integer.valueOf(fVar.f340882f));
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_TIP_STRING_SYNC, fVar.f340883g);
            }
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6011x25991f46().e();
        } else if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardMsgMgr", "onReceive() msgText is MSG_TYPE_RED_DOT");
            java.util.Map d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "sysmsg", null);
            if (d18 != null) {
                hVar = new f34.h();
                hVar.f340884a = (java.lang.String) d18.get(".sysmsg.reddotid");
                hVar.f340885b = (java.lang.String) d18.get(".sysmsg.reddotdesc");
                hVar.f340886c = (java.lang.String) d18.get(".sysmsg.reddottext");
            }
            if (hVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShakeCardMsgMgr", "saveRedDotMsg msg == null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardMsgMgr", "saveRedDotMsg msg reddotid is " + hVar.f340884a);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveRedDotMsg pre reddotid is ");
                java.lang.String str7 = this.f340888b;
                sb6.append(str7);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardMsgMgr", sb6.toString());
                if (android.text.TextUtils.isEmpty(hVar.f340884a)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardMsgMgr", "msg.reddotid is empty");
                } else if (android.text.TextUtils.isEmpty(str7)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardMsgMgr", "redDotId is empty, msg.reddotid is not empty");
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().p(262154, true);
                    c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_ID_STRING_SYNC, hVar.f340884a);
                    c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_DESC_STRING_SYNC, hVar.f340885b);
                    c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_TEXT_STRING_SYNC, hVar.f340886c);
                    b();
                } else if (!str7.equals(hVar.f340884a)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardMsgMgr", "redDotId and msg.reddotid is not empty, but no equals");
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().p(262154, true);
                    c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_ID_STRING_SYNC, hVar.f340884a);
                    c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_DESC_STRING_SYNC, hVar.f340885b);
                    c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_TEXT_STRING_SYNC, hVar.f340886c);
                    b();
                } else if (str7.equals(hVar.f340884a)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardMsgMgr", "redDotId equals msg.reddotid");
                }
            }
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6011x25991f46().e();
        }
        g34.a.a();
    }
}
