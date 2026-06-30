package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2;

/* loaded from: classes11.dex */
public final class d implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.UnreadConversationFmUI f289649d;

    public d(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.UnreadConversationFmUI unreadConversationFmUI) {
        this.f289649d = unreadConversationFmUI;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.g0 m80594x62662257;
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.UnreadConversationFmUI unreadConversationFmUI = this.f289649d;
        unreadConversationFmUI.m80598x6dfa45b0();
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = unreadConversationFmUI.mo7430x19263085();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721 activityC22395xe70a9721 = mo7430x19263085 instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721 ? (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721) mo7430x19263085 : null;
        if (activityC22395xe70a9721 != null) {
            int i17 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.f289640h;
            activityC22395xe70a9721.m80478x8b6d533a();
        }
        m80594x62662257 = unreadConversationFmUI.m80594x62662257();
        if (m80594x62662257 != null) {
            c16718x7059cefe = unreadConversationFmUI.mvvmList;
            if (c16718x7059cefe == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mvvmList");
                throw null;
            }
            java.util.ArrayList unreadList = c16718x7059cefe.f233598o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unreadList, "unreadList");
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            boolean z17 = true;
            java.util.HashMap f17 = c01.h2.f(1);
            java.util.ArrayList arrayList = new java.util.ArrayList(f17.size());
            java.util.Iterator it = f17.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.l4) ((java.util.Map.Entry) it.next()).getValue()).d1()));
            }
            int I0 = kz5.n0.I0(arrayList);
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v3 a17 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w3.f289747g.a(m80594x62662257.f289673b);
            jz5.l[] lVarArr = new jz5.l[10];
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int size = unreadList.size();
            int i18 = 0;
            while (i18 < size) {
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = ((yf5.x) unreadList.get(i18)).f543528d;
                if (l4Var != null && l4Var.d1() > 0) {
                    if (sb6.length() > 0 ? z17 : false) {
                        sb6.append("#");
                    }
                    sb6.append("{username:");
                    sb6.append(l4Var.h1());
                    sb6.append(", unread_num:");
                    sb6.append(l4Var.d1());
                    sb6.append(", LatestMsgTimestamp:");
                    sb6.append(java.lang.Math.max(l4Var.w0(), 0L));
                    sb6.append("}");
                }
                i18++;
                z17 = true;
            }
            java.lang.String sb7 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
            lVarArr[0] = new jz5.l("top100_unread_chat_list", sb7);
            lVarArr[1] = new jz5.l("unread_chat_count", java.lang.Integer.valueOf(f17.size()));
            lVarArr[2] = new jz5.l("unread_num", java.lang.Integer.valueOf(I0));
            lVarArr[3] = new jz5.l("unread_group_event_ms", java.lang.Long.valueOf(m80594x62662257.f289672a));
            lVarArr[4] = new jz5.l("user_grey_type", 3L);
            lVarArr[5] = new jz5.l("log_version", 20260429L);
            lVarArr[6] = new jz5.l("in24h_ingroup_unread_chat_cnt", java.lang.Integer.valueOf(a17.f289716a));
            lVarArr[7] = new jz5.l("out24h_ingroup_unread_chat_cnt", java.lang.Integer.valueOf(a17.f289717b));
            lVarArr[8] = new jz5.l("in24h_ingroup_unread_msg_cnt", java.lang.Integer.valueOf(a17.f289718c));
            lVarArr[9] = new jz5.l("out24h_ingroup_unread_msg_cnt", java.lang.Integer.valueOf(a17.f289719d));
            java.util.Map l17 = kz5.c1.l(lVarArr);
            ((cy1.a) rVar).Cj("unread_group_in", null, l17, 35186);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("reportUnreadGroupIn, unreadChatCount=");
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) l17;
            sb8.append(linkedHashMap.get("unread_chat_count"));
            sb8.append(", unreadNum=");
            sb8.append(linkedHashMap.get("unread_num"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnreadModeReporter", sb8.toString());
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
