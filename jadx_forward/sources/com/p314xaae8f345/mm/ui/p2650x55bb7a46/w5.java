package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public abstract class w5 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f287745a = new java.util.HashMap();

    public static void A(android.view.View view, boolean z17, boolean z18) {
        if (view == null) {
            return;
        }
        if (!z17) {
            view.setTag(com.p314xaae8f345.mm.R.id.bpk, java.lang.Boolean.FALSE);
            java.util.Map map = f287745a;
            if (((java.util.HashMap) map).get(java.lang.Integer.valueOf(view.hashCode())) != null) {
                if (((java.lang.ref.WeakReference) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(view.hashCode()))).get() != null) {
                    ((java.util.concurrent.Future) ((java.lang.ref.WeakReference) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(view.hashCode()))).get()).cancel(false);
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingItemHelper", "showUploadingPB", "(Landroid/view/View;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/ChattingItemHelper", "showUploadingPB", "(Landroid/view/View;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (!z18) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/ChattingItemHelper", "showUploadingPB", "(Landroid/view/View;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/ChattingItemHelper", "showUploadingPB", "(Landroid/view/View;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setTag(com.p314xaae8f345.mm.R.id.bpk, java.lang.Boolean.TRUE);
            return;
        }
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.bpi);
        if (tag != null && ((java.lang.Long) tag).longValue() < c01.id.c() - 1000) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/ui/chatting/ChattingItemHelper", "showUploadingPB", "(Landroid/view/View;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/ChattingItemHelper", "showUploadingPB", "(Landroid/view/View;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setTag(com.p314xaae8f345.mm.R.id.bpk, java.lang.Boolean.TRUE);
            return;
        }
        java.lang.Object tag2 = view.getTag(com.p314xaae8f345.mm.R.id.bpk);
        if (tag2 != null && ((java.lang.Boolean) tag2).booleanValue()) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/ui/chatting/ChattingItemHelper", "showUploadingPB", "(Landroid/view/View;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/ChattingItemHelper", "showUploadingPB", "(Landroid/view/View;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.v5 v5Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.v5(view);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        wu5.c z19 = t0Var.z(v5Var, 1000L, false);
        ((java.util.HashMap) f287745a).put(java.lang.Integer.valueOf(view.hashCode()), new java.lang.ref.WeakReference(z19));
    }

    public static void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Intent intent) {
        if (f9Var == null || intent == null) {
            return;
        }
        java.lang.String Q0 = f9Var.Q0();
        java.lang.String Q02 = f9Var.Q0();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("stat_scene", c01.e2.G(Q0) ? 7 : 1);
        bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(f9Var.I0()));
        bundle.putString("stat_chat_talker_username", Q0);
        bundle.putString("stat_send_msg_user", Q02);
        intent.putExtra("_stat_obj", bundle);
    }

    public static void b(long j17, int i17, android.content.Context context, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, android.app.Activity activity, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String str;
        java.lang.String Q0 = f9Var.Q0();
        java.lang.String str2 = "";
        java.lang.String a17 = c01.n2.a("" + f9Var.I0());
        c01.l2 c17 = c01.n2.d().c(a17, true);
        c17.i("prePublishId", "msg_" + f9Var.I0());
        c17.i("preUsername", Q0);
        c17.i("preChatName", Q0);
        c17.i("preMsgIndex", java.lang.Integer.valueOf(i17));
        c17.i("sendAppMsgScene", 1);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87854g = i17;
        c4Var.f87855h = a17;
        c4Var.f87857j = componentCallbacksC1101xa17d4670;
        c4Var.f87856i = activity;
        c4Var.f87860m = 40;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.j(c5303xc75d2f73, f9Var, false);
        c5303xc75d2f73.e();
        if (c5303xc75d2f73.f135624h.f87966a == 0) {
            ot0.q v17 = ot0.q.v(ot0.g0.i(context, i17, f9Var.j(), f9Var.Q0(), f9Var.m124847x74d37ac6()));
            if (f9Var.k2()) {
                ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
                com.p314xaae8f345.mm.p959x883644fd.e.f153038a.getClass();
            } else {
                ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
                com.p314xaae8f345.mm.p959x883644fd.e.f153038a.getClass();
            }
            if (v17 == null || v17.f430199i != 5 || (str = v17.f430207k) == null) {
                return;
            }
            try {
                str2 = java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            } catch (java.io.UnsupportedEncodingException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingItemHelper", e17, "", new java.lang.Object[0]);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13378, str2, java.lang.Long.valueOf(j17), 1, 2, 1);
        }
    }

    public static void c(android.content.Intent intent, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String x17 = dVar.x();
        java.lang.String f17 = g95.e0.f(f9Var);
        android.os.Bundle bundle = new android.os.Bundle();
        if (dVar.D()) {
            bundle.putInt("stat_scene", 2);
        } else {
            bundle.putInt("stat_scene", c01.e2.G(x17) ? 7 : 1);
        }
        bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(f9Var.I0()));
        bundle.putString("stat_chat_talker_username", x17);
        bundle.putString("stat_send_msg_user", f17);
        intent.putExtra("_stat_obj", bundle);
    }

    public static void d(yb5.d dVar, ot0.q qVar, java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, long j17, int i17, java.lang.String str2) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.k0 k0Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.k0) qVar.y(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.k0.class);
        g(dVar, qVar.f430199i, qVar.f430179d, qVar.X, k0Var != null ? java.lang.Integer.valueOf(k0Var.f273274b) : null, str, mVar, j17, i17, str2);
    }

    public static void e(yb5.d dVar, ot0.q qVar, java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, long j17, java.lang.String str2) {
        d(dVar, qVar, str, mVar, j17, -1, str2);
    }

    public static void f(yb5.d dVar, v05.b bVar, java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, long j17, java.lang.String str2) {
        int m75939xb282bd08 = bVar.m75939xb282bd08(bVar.f449898d + 6);
        java.lang.String m75945x2fec8307 = bVar.m75945x2fec8307(bVar.f449898d + 0);
        int i17 = bVar.f513848e;
        g(dVar, m75939xb282bd08, m75945x2fec8307, bVar.m75945x2fec8307(i17 + 15), java.lang.Integer.valueOf(bVar.m75939xb282bd08(i17 + 53)), str, mVar, j17, -1, str2);
    }

    public static void g(yb5.d dVar, int i17, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, long j17, int i18, java.lang.String str4) {
        int i19 = 1;
        int i27 = dVar.D() ? 2 : 1;
        if (i18 == -1) {
            i18 = i17 == 7 ? (mVar == null || !com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(dVar.g(), mVar.f67386xa1e9e82c)) ? 6 : 0 : 3;
        }
        if (i17 == 2) {
            i19 = 4;
        } else if (i17 != 5) {
            i19 = i18;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5917x44367f5f c5917x44367f5f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5917x44367f5f();
        android.app.Activity g17 = dVar.g();
        am.cr crVar = c5917x44367f5f.f136220g;
        crVar.f87915a = g17;
        crVar.f87921g = i27;
        crVar.f87916b = str;
        crVar.f87917c = mVar == null ? null : mVar.f67386xa1e9e82c;
        crVar.f87919e = i17;
        crVar.f87918d = str3;
        crVar.f87922h = i19;
        crVar.f87920f = str2;
        crVar.f87923i = j17;
        crVar.f87924j = "";
        crVar.f87925k = str4;
        if (num != null) {
            crVar.f87926l = num.intValue();
        }
        c5917x44367f5f.e();
    }

    public static int h(android.content.Context context) {
        float q17 = i65.a.q(context);
        return q17 == i65.a.y(context) ? i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561777sd) : q17 == i65.a.w(context) ? i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561768s6) : q17 == i65.a.z(context) ? i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561778se) : q17 == i65.a.s(context) ? i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561754rs) : (q17 == i65.a.t(context) || q17 == i65.a.u(context) || q17 == i65.a.v(context)) ? context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561755rt) : context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561774sa);
    }

    public static int i(android.content.Context context) {
        float q17 = i65.a.q(context);
        if (q17 != i65.a.y(context) && q17 != i65.a.w(context)) {
            return q17 == i65.a.z(context) ? i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561753rr) : q17 == i65.a.s(context) ? i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561751rp) : (q17 == i65.a.t(context) || q17 == i65.a.u(context) || q17 == i65.a.v(context)) ? i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561755rt) : i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561752rq);
        }
        return i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561752rq);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.pm.PackageInfo j(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L21
            int r1 = r4.length()
            if (r1 != 0) goto La
            goto L21
        La:
            java.lang.Class<lt.i0> r1 = lt.i0.class
            i95.m r1 = i95.n0.c(r1)
            lt.i0 r1 = (lt.i0) r1
            kt.c r1 = (kt.c) r1
            r1.getClass()
            com.tencent.mm.pluginsdk.model.app.m r4 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(r4)
            if (r4 != 0) goto L1e
            goto L21
        L1e:
            java.lang.String r4 = r4.f67386xa1e9e82c
            goto L22
        L21:
            r4 = r0
        L22:
            if (r4 != 0) goto L25
            return r0
        L25:
            r1 = 0
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            return r3
        L2f:
            r3 = move-exception
            java.lang.String r4 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "MicroMsg.ChattingItemHelper"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r3, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.j(android.content.Context, java.lang.String):android.content.pm.PackageInfo");
    }

    public static java.lang.String k(long j17, java.lang.String str, java.lang.String str2) {
        java.lang.String a17 = c01.n2.a("" + j17);
        boolean z17 = true;
        c01.l2 c17 = c01.n2.d().c(a17, true);
        c17.i("preUsername", str);
        c17.i("preChatName", str2);
        qk.o b17 = r01.z.b(str2);
        if (b17 == null || (!b17.Q0() && !b17.T0())) {
            z17 = false;
        }
        c17.i("Contact_Sub_Scene", java.lang.Integer.valueOf((z17 || com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(str2)) ? 5 : 3));
        c17.i("Contact_Scene_Note", str2);
        return a17;
    }

    public static boolean l(yb5.d dVar, ot0.q qVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430170a2)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.e.a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.a.EnterCompleteVideo, f9Var, qVar.f430198h2, qVar.f430194g2);
        java.lang.String z07 = f9Var.z0();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KFromTimeLine", false);
        intent.putExtra("KStremVideoUrl", qVar.f430170a2);
        intent.putExtra("KThumUrl", qVar.f430190f2);
        intent.putExtra("KThumbPath", z07);
        intent.putExtra("KSta_StremVideoAduxInfo", qVar.f430194g2);
        intent.putExtra("KSta_StremVideoPublishId", qVar.f430198h2);
        intent.putExtra("KSta_SourceType", 2);
        intent.putExtra("KSta_Scene", (dVar.D() ? com.p314xaae8f345.mm.ui.p2650x55bb7a46.b.TalkChat : com.p314xaae8f345.mm.ui.p2650x55bb7a46.b.Chat).f280015d);
        intent.putExtra("KSta_FromUserName", str);
        intent.putExtra("KSta_ChatName", dVar.x());
        intent.putExtra("KSta_MsgId", f9Var.I0());
        intent.putExtra("KSta_SnsStatExtStr", qVar.Y1);
        if (dVar.D()) {
            intent.putExtra("KSta_ChatroomMembercount", ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(dVar.x()));
        }
        intent.putExtra("KMediaId", "fakeid_" + f9Var.m124847x74d37ac6());
        intent.putExtra("KMediaVideoTime", qVar.f430174b2);
        intent.putExtra("StremWebUrl", qVar.f430186e2);
        intent.putExtra("StreamWording", qVar.f430182d2);
        intent.putExtra("KMediaTitle", qVar.n());
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_landing_page_new_stream_video, 1) > 0) {
            j45.l.j(dVar.g(), "sns", ".ui.SnsAdStreamVideoPlayUI", intent, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemHelper", "use new stream video play UI");
        } else {
            j45.l.j(dVar.g(), "sns", ".ui.VideoAdPlayerUI", intent, null);
        }
        return true;
    }

    public static void m(yb5.d dVar, java.lang.String str, long j17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemHelper", "gotoEditUI() msgId:%s scene:%s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, j17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_Msg_Id", j17);
        intent.putExtra("key_group_solitatire_create", false);
        intent.putExtra("key_group_solitatire_key", Li.W1());
        intent.putExtra("key_group_solitatire_chatroom_username", Li.Q0());
        intent.putExtra("key_group_solitatire_scene", i17);
        j45.l.r(dVar.f542242d, "groupsolitaire", ".ui.GroupSolitatireEditUI", intent, 3001, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.u5(dVar));
    }

    public static void n(yb5.d dVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, boolean z17, long j17, long j18, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ot0.q qVar, java.lang.String str5) {
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemHelper", "url, lowUrl both are empty");
            return;
        }
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40085xe877826c(dVar.g()) ? str == null || str.length() <= 0 : str2 != null && str2.length() > 0) {
            str = str2;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("msg_id", j17);
        intent.putExtra("msg_talker", dVar.x());
        intent.putExtra("rawUrl", str);
        intent.putExtra("version_name", str3);
        intent.putExtra("version_code", i17);
        intent.putExtra("usePlugin", z17);
        intent.putExtra("geta8key_username", dVar.x());
        intent.putExtra("KPublisherId", "msg_" + java.lang.Long.toString(j18));
        intent.putExtra("KAppId", str4);
        intent.putExtra("pre_username", str5);
        intent.putExtra("msgUsername", str5);
        intent.putExtra("serverMsgID", java.lang.Long.toString(j18));
        intent.putExtra("geta8key_scene", 1);
        intent.putExtra("KMsgType", f9Var.mo78013xfb85f7b0());
        if (qVar != null) {
            intent.putExtra("KAppMsgType", qVar.f430199i);
        }
        intent.putExtra("prePublishId", "msg_" + java.lang.Long.toString(j18));
        intent.putExtra("preUsername", str5);
        intent.putExtra("preChatName", dVar.x());
        intent.putExtra("preChatTYPE", c01.h2.a(str5, dVar.x()));
        intent.putExtra("preMsgIndex", 0);
        intent.putExtra("key_enable_teen_mode_check", true);
        intent.putExtra("key_enable_fts_quick", true);
        j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public static void o(yb5.d dVar, android.view.View view, java.lang.Object obj) {
        view.setTag(obj);
        view.setOnClickListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).J1);
    }

    public static void p(yb5.d dVar, android.view.View view, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ot0.q qVar, java.lang.String str, long j17) {
        s(dVar, view, f9Var, str, j17, qVar.f430179d, qVar.f430199i, qVar.X);
    }

    public static void q(yb5.d dVar, android.view.View view, java.lang.Object obj) {
        view.setTag(obj);
        view.setOnClickListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).F1);
    }

    public static void r(yb5.d dVar, android.view.View view, java.lang.String str) {
        if (!((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).wi(str)) {
            view.setTag(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ea());
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ea eaVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ea();
        eaVar.f271833a = str;
        eaVar.f271834b = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7;
        q(dVar, view, eaVar);
    }

    public static void s(yb5.d dVar, android.view.View view, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, long j17, java.lang.String str2, int i17, java.lang.String str3) {
        if (!((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).wi(str2)) {
            view.setTag(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ea());
            return;
        }
        int i18 = dVar.D() ? 2 : 1;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.da daVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.da();
        daVar.f271805a = str2;
        daVar.f271806b = str;
        java.lang.String Q0 = f9Var.Q0();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Q0)) {
            Q0 = c01.w9.s(f9Var.j());
        }
        daVar.f271807c = Q0;
        daVar.f271808d = i17;
        daVar.f271809e = i18;
        daVar.f271810f = str3;
        daVar.f271811g = j17;
        daVar.f271812h = dVar.x();
        q(dVar, view, daVar);
    }

    public static void t(yb5.d dVar, android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(bitmap);
        int dimension = (int) dVar.s().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
        bitmapDrawable.setBounds(0, 0, dimension, dimension);
        imageView.setImageDrawable(bitmapDrawable);
        if (imageView instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) imageView).setImageBitmap(bitmap);
        }
    }

    public static void u(yb5.d dVar, android.widget.ImageView imageView, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("wx485a97c844086dc9", str)) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80305x64915b54);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("wxaf060266bfa9a35c", str) && (imageView instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352)) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) imageView).m82040x7541828(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            return;
        }
        if (imageView instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) imageView).m82040x7541828(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        }
        android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(str, 2, i65.a.g(dVar.g()));
        if (Di != null && !Di.isRecycled()) {
            t(dVar, imageView, Di);
            return;
        }
        android.content.res.Resources s17 = dVar.s();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bku));
        arrayList.add(s17);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingItemHelper", "initWatermarkIcon", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Landroid/widget/ImageView;Ljava/lang/String;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/ui/chatting/ChattingItemHelper", "initWatermarkIcon", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Landroid/widget/ImageView;Ljava/lang/String;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        t(dVar, imageView, decodeResource);
    }

    public static void v(yb5.d dVar, android.widget.ImageView imageView, java.lang.String str, android.graphics.Bitmap bitmap) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("wx485a97c844086dc9", str)) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80305x64915b54);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("wxaf060266bfa9a35c", str) && (imageView instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352)) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) imageView).m82040x7541828(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        } else {
            if (imageView instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) {
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) imageView).m82040x7541828(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            }
            t(dVar, imageView, bitmap);
        }
    }

    public static void w(yb5.d dVar, android.widget.TextView textView, java.lang.String str) {
        android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(str, 2, i65.a.g(dVar.g()));
        if (Di != null && !Di.isRecycled()) {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(Di);
            int dimension = (int) dVar.s().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
            bitmapDrawable.setBounds(0, 0, dimension, dimension);
            textView.setCompoundDrawables(bitmapDrawable, null, null, null);
            return;
        }
        android.content.res.Resources s17 = dVar.s();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bku));
        arrayList.add(s17);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingItemHelper", "initWatermarkIcon", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Landroid/widget/TextView;Ljava/lang/String;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/ui/chatting/ChattingItemHelper", "initWatermarkIcon", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Landroid/widget/TextView;Ljava/lang/String;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.drawable.BitmapDrawable bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(decodeResource);
        int dimension2 = (int) dVar.s().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
        bitmapDrawable2.setBounds(0, 0, dimension2, dimension2);
        textView.setCompoundDrawables(bitmapDrawable2, null, null, null);
    }

    public static boolean x(java.lang.String str) {
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.equals("wx6618f1cfc6c132f8");
    }

    public static boolean y(java.lang.String str) {
        return ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).ij(str);
    }

    public static void z(yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, java.lang.String str, int[] iArr, int i17, int i18, boolean z17, int i19, boolean z18, boolean z19, com.p314xaae8f345.mm.ui.p2650x55bb7a46.m5 m5Var) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.m5 m5Var2 = m5Var == null ? new com.p314xaae8f345.mm.ui.p2650x55bb7a46.m5() : m5Var;
        m5Var2.b(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.k5(iArr[0], iArr[1], i17, i18));
        m5Var2.b(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.i5(z17));
        m5Var2.b(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.j5(i19));
        m5Var2.b(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.g5(z18));
        m5Var2.b(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.h5(z19));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        long m124847x74d37ac6 = msgInfo.m124847x74d37ac6();
        long I0 = msgInfo.I0();
        java.lang.String Q0 = msgInfo.Q0();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.k5 k5Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.k5) m5Var2.a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.k5.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.i5 i5Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.i5) m5Var2.a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.i5.class);
        boolean z27 = i5Var != null ? i5Var.f283368a : false;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.j5 j5Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.j5) m5Var2.a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.j5.class);
        int i27 = j5Var != null ? j5Var.f283404a : 0;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.g5 g5Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.g5) m5Var2.a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.g5.class);
        boolean z28 = g5Var != null ? g5Var.f282056a : false;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h5 h5Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.h5) m5Var2.a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.h5.class);
        boolean z29 = h5Var != null ? h5Var.f283194a : false;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.f5 f5Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.f5) m5Var2.a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.f5.class);
        boolean z37 = f5Var != null ? f5Var.f282019a : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingImageGalleryHelper", "showImageGallery: msgId=" + m124847x74d37ac6 + ", msgSvrId=" + I0 + ", talker=" + Q0 + ", thumbParams=" + k5Var + ", isSoonEnterPhotoEdit=" + z27 + ", scene=" + i27 + ", isOnlyPreview=" + z28 + ", isQuoteMsgWaitSend=" + z29 + ", isFromNewsJump=" + z37);
        android.content.Intent intent = new android.content.Intent(ui6.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.class);
        intent.putExtra("img_gallery_msg_id", m124847x74d37ac6);
        intent.putExtra("img_gallery_msg_svr_id", I0);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = ui6.f542241c;
        intent.putExtra("show_search_chat_content_result", ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk) ((sb5.u1) cVar.a(sb5.u1.class))).f280828f);
        intent.putExtra("key_is_biz_chat", ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) cVar.a(sb5.f.class))).f280286r);
        intent.putExtra("key_biz_chat_id", ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) cVar.a(sb5.f.class))).w0());
        intent.putExtra("img_gallery_talker", Q0);
        intent.putExtra("img_gallery_chatroom_name", str);
        intent.putExtra("img_gallery_left", k5Var != null ? k5Var.f283425a : 0);
        intent.putExtra("img_gallery_top", k5Var != null ? k5Var.f283426b : 0);
        intent.putExtra("img_gallery_width", k5Var != null ? k5Var.f283427c : 0);
        intent.putExtra("img_gallery_height", k5Var != null ? k5Var.f283428d : 0);
        intent.putExtra("img_gallery_enter_from_chatting_ui", true);
        intent.putExtra("img_gallery_enter_PhotoEditUI", z27);
        intent.putExtra("msg_type", i27);
        if (z28) {
            intent.putExtra("img_preview_only", true);
        }
        if (z29) {
            intent.putExtra("key_quote_msg_wait_send", 1);
        }
        if (i27 == 0) {
            intent.putExtra("key_enter_scene", 1);
        } else if (i27 == 4) {
            intent.putExtra("key_enter_scene", 5);
        }
        intent.putExtra("key_is_from_news_jump", z37);
        intent.putExtra("img_gallery_enter_from_appbrand_service_chatting_ui", com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(Q0));
        java.lang.String x17 = ui6.x();
        if (msgInfo.A0() == 1) {
            Q0 = ui6.t();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (ui6.C()) {
            bundle.putInt("stat_scene", 2);
        } else {
            bundle.putInt("stat_scene", c01.e2.G(x17) ? 7 : 1);
        }
        bundle.putString("stat_msg_id", "msg_" + I0);
        bundle.putString("stat_chat_talker_username", x17);
        bundle.putString("stat_send_msg_user", Q0);
        intent.putExtra("_stat_obj", bundle);
        intent.putExtra("img_gallery_session_id", k(I0, Q0, x17));
        android.app.Activity g17 = ui6.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bm.a(intent, g17);
        com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f c17 = com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f.c(ui6.g());
        c17.f291149h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r0(I0);
        c17.f291150i = com.p314xaae8f345.mm.ui.p2731xc84c5534.h0.Image;
        int i28 = bundle.getInt("stat_scene", 0);
        if (i28 == 1) {
            c17.f291146e = com.p314xaae8f345.mm.ui.p2731xc84c5534.j0.SingleChat;
            c17.b(com.p314xaae8f345.mm.ui.p2731xc84c5534.i0.EnterSingleChat);
        } else if (i28 == 2) {
            c17.f291146e = com.p314xaae8f345.mm.ui.p2731xc84c5534.j0.GroupChat;
            c17.b(com.p314xaae8f345.mm.ui.p2731xc84c5534.i0.EnterGroupChat);
        }
        c17.a(intent);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = ui6.f542250l;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(abstractC21611x7536149b, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingImageGalleryHelper", "showImageGallery", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/ChattingImageGalleryHelper$ExtrasBundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        abstractC21611x7536149b.mo7585xa4df9991((android.content.Intent) arrayList.get(0));
        yj0.a.f(abstractC21611x7536149b, "com/tencent/mm/ui/chatting/ChattingImageGalleryHelper", "showImageGallery", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/ChattingImageGalleryHelper$ExtrasBundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ui6.f542250l.m78401x4d12b7e0(0, 0);
    }
}
