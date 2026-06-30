package dk2;

/* loaded from: classes3.dex */
public final class q4 {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.q4 f315471a = new dk2.q4();

    public static /* synthetic */ void d(dk2.q4 q4Var, android.content.Context context, gk2.e eVar, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            i17 = 2;
        }
        q4Var.c(context, eVar, i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.Object i(dk2.q4 q4Var, android.content.Context context, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        q4Var.getClass();
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (z17) {
            h0Var.f391656d = az2.c.a(az2.f.f97658d, context, null, 0L, null, 14, null);
        }
        az2.f fVar = (az2.f) h0Var.f391656d;
        if (fVar != null) {
            fVar.a();
        }
        pq5.g l17 = new r45.qr1().d().l();
        l17.K(new dk2.j4(h0Var, rVar));
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            l17.f((im5.b) context);
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public static void j(dk2.q4 q4Var, android.content.Context context, gk2.e buContext, boolean z17, java.lang.String finderUsername, r45.qt2 qt2Var, boolean z18, android.content.Intent intent, int i17, java.lang.Object obj) {
        r45.qt2 qt2Var2 = (i17 & 16) != 0 ? null : qt2Var;
        boolean z19 = (i17 & 32) != 0 ? false : z18;
        android.content.Intent intent2 = (i17 & 64) == 0 ? intent : null;
        q4Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        if (intent2 == null) {
            intent2 = new android.content.Intent();
        }
        android.content.Intent intent3 = intent2;
        intent3.putExtra("report_scene", 0);
        if (z17) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((mm2.c1) buContext.a(mm2.c1.class)).f410385o)) {
                intent3.putExtra("finder_username", "");
                intent3.putExtra("key_finder_object_Id", java.lang.String.valueOf(((mm2.e1) buContext.a(mm2.e1.class)).f410516m));
                intent3.putExtra("key_finder_object_nonce_id_key", ((mm2.e1) buContext.a(mm2.e1.class)).f410525v);
            } else {
                intent3.putExtra("finder_username", ((mm2.c1) buContext.a(mm2.c1.class)).f410385o);
            }
            intent3.putExtra("finder_read_feed_id", ((mm2.e1) buContext.a(mm2.e1.class)).f410516m);
            intent3.putExtra("finder_from_session_buffer", ((mm2.e1) buContext.a(mm2.e1.class)).f410526w);
            intent3.putExtra("finder_from_feed_id", ((mm2.e1) buContext.a(mm2.e1.class)).f410516m);
            if (((mm2.c1) buContext.a(mm2.c1.class)).I7().m75939xb282bd08(2) == 3) {
                android.content.Context context2 = context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
                intent3.putExtra("follow_participant_finder_username", xy2.c.e(context2));
            }
        } else {
            if (z19) {
                intent3.putExtra("finder_read_feed_id", ((mm2.e1) buContext.a(mm2.e1.class)).f410516m);
                intent3.putExtra("finder_from_session_buffer", ((mm2.e1) buContext.a(mm2.e1.class)).f410526w);
                intent3.putExtra("finder_from_feed_id", ((mm2.e1) buContext.a(mm2.e1.class)).f410516m);
                if (((mm2.c1) buContext.a(mm2.c1.class)).I7().m75939xb282bd08(2) == 3) {
                    android.content.Context context3 = context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context3);
                    intent3.putExtra("follow_participant_finder_username", xy2.c.e(context3));
                }
            }
            intent3.putExtra("finder_username", finderUsername);
        }
        intent3.putExtra("key_enter_profile_type", 11);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("live_feedid", pm0.v.u(((mm2.e1) buContext.a(mm2.e1.class)).f410516m));
        jSONObject.put("liveid", pm0.v.u(((mm2.e1) buContext.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        jSONObject.put("live_entersessionid", ((ml2.r0) i95.n0.c(ml2.r0.class)).Ri(((mm2.e1) buContext.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        intent3.putExtra("key_aditional_client_udf_kv", jSONObject.toString());
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("feedid", pm0.v.u(((mm2.e1) buContext.a(mm2.e1.class)).f410516m));
        jSONObject2.put("liveid", pm0.v.u(((mm2.e1) buContext.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        jSONObject2.put("panel_sence", "5");
        jSONObject2.put("entersessionid", pm0.v.u(((ml2.r0) i95.n0.c(ml2.r0.class)).Ri(((mm2.e1) buContext.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0))));
        intent3.putExtra("key_aditional_client_udf_kv", jSONObject2.toString());
        if (qt2Var2 != null) {
            java.lang.String m75945x2fec8307 = qt2Var2.m75945x2fec8307(1);
            java.lang.String m75945x2fec83072 = qt2Var2.m75945x2fec8307(2);
            if (!android.text.TextUtils.isEmpty(m75945x2fec8307)) {
                intent3.putExtra("key_context_id", m75945x2fec8307);
            }
            if (!android.text.TextUtils.isEmpty(m75945x2fec83072)) {
                intent3.putExtra("key_click_tab_context_id", m75945x2fec83072);
            }
        }
        if (context != null) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.yb.H7((c61.yb) c17, context, intent3, 0L, null, 0, 0, false, 124, null);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f542005a.w(context, intent3);
        }
    }

    public static /* synthetic */ void m(dk2.q4 q4Var, android.content.Context context, gk2.e eVar, l81.b1 b1Var, boolean z17, android.webkit.ValueCallback valueCallback, int i17, java.lang.Object obj) {
        if ((i17 & 16) != 0) {
            valueCallback = null;
        }
        q4Var.l(context, eVar, b1Var, z17, valueCallback);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0192, code lost:
    
        if (r0.m75933x41a8a7f2(0) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r30, java.lang.String r32, long r33, java.lang.String r35, int r36, int r37, int r38, java.lang.String r39, java.lang.String r40, android.content.Context r41, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r42) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.q4.a(long, java.lang.String, long, java.lang.String, int, int, int, java.lang.String, java.lang.String, android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(android.content.Context context, gk2.e buContext, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        boolean contains = ((mm2.f6) buContext.a(mm2.f6.class)).f410586y.contains(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAssistant2", "announceGotoShopping productId:" + j17 + ", haveBug:" + contains);
        if (j17 == 0 || contains) {
            return;
        }
        ((mm2.f6) buContext.a(mm2.f6.class)).f410586y.add(java.lang.Long.valueOf(j17));
        e(context, buContext, ek2.r0.f335052y.a("", 10012, 0), zl2.q4.f555466a.m(), null);
    }

    public final void c(android.content.Context context, gk2.e buContext, int i17) {
        java.lang.Class<?> cls;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAssistant2", "closeMiniProgram,purpose:" + i17 + ", shoppingInMiniProgram:" + ((mm2.f6) buContext.a(mm2.f6.class)).B);
        if (((mm2.f6) buContext.a(mm2.f6.class)).B) {
            km2.n.f390680p.clear();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("ACTIVITY_PURPOSE", i17);
            intent.addFlags(335544320);
            if (context instanceof android.app.Activity) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Di((android.app.Activity) context)) {
                    jz2.x0 x0Var = jz2.x0.f384287a;
                    cls = (java.lang.Class) ((jz5.n) jz2.x0.f384302p).mo141623x754a37bb();
                    intent.setClass(context, cls);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/FinderLiveAssistant2", "closeMiniProgram", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/finder/live/model/FinderLiveAssistant2", "closeMiniProgram", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
            jz2.x0 x0Var2 = jz2.x0.f384287a;
            cls = (java.lang.Class) ((jz5.n) jz2.x0.f384301o).mo141623x754a37bb();
            intent.setClass(context, cls);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/model/FinderLiveAssistant2", "closeMiniProgram", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/live/model/FinderLiveAssistant2", "closeMiniProgram", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(android.content.Context context, gk2.e buContext, r45.t12 liveMsg, java.lang.String clientMsgId, ek2.p0 p0Var) {
        java.lang.String str;
        r45.qt2 qt2Var;
        r45.o72 o72Var;
        java.lang.String str2;
        java.lang.String str3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveMsg, "liveMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientMsgId, "clientMsgId");
        pf5.z zVar = pf5.z.f435481a;
        boolean z17 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
        if (!z17) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a(activityC0065xcd7aa112).c(zy2.ra.class))).V6();
        zl2.r4.f555483a.a(clientMsgId, buContext);
        long m75942xfb822ef2 = ((mm2.e1) buContext.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        byte[] bArr = ((mm2.e1) buContext.a(mm2.e1.class)).f410518o;
        long j17 = ((mm2.e1) buContext.a(mm2.e1.class)).f410516m;
        java.lang.String str4 = ((mm2.e1) buContext.a(mm2.e1.class)).f410525v;
        java.lang.String str5 = ((mm2.e1) buContext.a(mm2.e1.class)).f410517n;
        java.lang.String e17 = xy2.c.e(context);
        kn0.e a17 = hn0.v.f363973a.a();
        java.lang.String str6 = a17 != null ? a17.B : null;
        r45.o72 o72Var2 = new r45.o72();
        if (z17) {
            o72Var2.set(0, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a(activityC0065xcd7aa112).c(zy2.ra.class))).f216920s);
            o72Var = o72Var2;
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            o72Var.set(1, Ri);
            qt2Var = V6;
            o72Var.set(2, java.lang.Long.valueOf(((ml2.r0) i95.n0.c(ml2.r0.class)).f409411q));
            java.lang.String str7 = ((ml2.r0) i95.n0.c(ml2.r0.class)).H1;
            if (str7 != null) {
                str = str5;
                str2 = r26.i0.t(str7, ",", ";", false);
            } else {
                str = str5;
                str2 = "";
            }
            o72Var.set(4, str2);
            o72Var.set(3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            java.lang.String str8 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a(activityC0065xcd7aa112).c(zy2.ra.class))).f216921t;
            boolean z18 = str8 == null || str8.length() == 0;
            dk2.q4 q4Var = f315471a;
            o72Var.set(5, z18 ? q4Var.f(((ml2.r0) i95.n0.c(ml2.r0.class)).M, "exposeType") : q4Var.f(str8, "exposeType"));
            java.lang.String str9 = ((ml2.r0) i95.n0.c(ml2.r0.class)).f409405m;
            ml2.q1 q1Var = ml2.q1.f409345e;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str9, "temp_6") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((m30.o) ((n30.s) i95.n0.c(n30.s.class))).wi(), "111")) {
                str3 = "temp_7";
            } else {
                ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
                str3 = a52.a.f83117l;
                if (str3 == null) {
                    str3 = "";
                }
            }
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f409116i;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            o72Var.set(8, java.lang.Long.valueOf(y4Var.e(str3, y4Var.I.f409102d)));
            o72Var.set(7, q4Var.f(((ml2.r0) i95.n0.c(ml2.r0.class)).M, "enter_immerse_type"));
            o72Var.set(19, str3);
            gk2.e eVar = gk2.e.f354004n;
            long j18 = 0;
            o72Var.set(9, java.lang.Long.valueOf(eVar != null ? ((mm2.e1) eVar.a(mm2.e1.class)).f410514h : 0L));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAssistant2", "FinderLiveCommentScene get " + o72Var.m75945x2fec8307(19) + " when genLiveReportObj2");
            try {
                if (r26.n0.L(str3, "temp_", 0, false, 6, null) != -1) {
                    j18 = java.lang.Long.parseLong(r26.i0.t(str3, "temp_", "", false));
                }
                o72Var.set(6, java.lang.Long.valueOf(j18));
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAssistant2", "genLiveReportObj err:" + e18.getMessage());
            }
            ((im2.t6) pf5.z.f435481a.a(activityC0065xcd7aa112).a(im2.t6.class)).R6(o72Var);
        } else {
            str = str5;
            qt2Var = V6;
            o72Var = o72Var2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAssistant2", "enter_icon_type :" + o72Var.m75942xfb822ef2(8) + " chnl_enter_immerse_type: " + o72Var.m75945x2fec8307(7) + " chnl_expose_type: " + o72Var.m75945x2fec8307(5));
        pq5.g l17 = new ek2.r0(m75942xfb822ef2, bArr, j17, str4, str, e17, qt2Var, liveMsg, clientMsgId, str6, o72Var).l();
        l17.K(new dk2.g4(p0Var, context, buContext));
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            l17.f((im5.b) context);
        }
    }

    public final java.lang.String f(java.lang.String jsonVal, java.lang.String field) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonVal, "jsonVal");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(field, "field");
        if (jsonVal.length() == 0) {
            return "";
        }
        if (field.length() == 0) {
            return "";
        }
        try {
            java.lang.String optString = new org.json.JSONObject(r26.i0.t(jsonVal, ";", ",", false)).optString(field);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
            return optString;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAssistant2", java.lang.String.valueOf(e17.getMessage()));
            return "";
        }
    }

    public final java.lang.Object g(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, gk2.e eVar, boolean z17, boolean z18, long j17, long j18, java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5, java.lang.Boolean bool, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        int i18 = z17 ? z18 ? 1 : 2 : 0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ek2.j1 j1Var = new ek2.j1(j17, j18, str, str2, bArr, i18, xy2.c.e(activity), str3, str4, null, i17, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) pf5.z.f435481a.a(activity).c(zy2.ra.class))).V6(), str5, null, 8704, null);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            az2.j.u(j1Var, activity, null, 0L, 6, null);
        }
        pq5.g l17 = j1Var.l();
        l17.K(new dk2.h4(str4, eVar, nVar));
        l17.f(activity);
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(android.content.Context r20, r45.eq1 r21, r45.qo r22, boolean r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            r19 = this;
            r0 = r21
            r1 = r24
            boolean r2 = r1 instanceof dk2.k4
            if (r2 == 0) goto L19
            r2 = r1
            dk2.k4 r2 = (dk2.k4) r2
            int r3 = r2.f315215f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f315215f = r3
            r3 = r19
            goto L20
        L19:
            dk2.k4 r2 = new dk2.k4
            r3 = r19
            r2.<init>(r3, r1)
        L20:
            r8 = r2
            java.lang.Object r1 = r8.f315213d
            pz5.a r2 = pz5.a.f440719d
            int r4 = r8.f315215f
            r11 = 0
            r5 = 1
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r1)     // Catch: rm0.j -> L31
            goto L68
        L31:
            r0 = move-exception
            goto L70
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r1)
            r1 = 7
            r4 = r22
            r0.set(r1, r4)     // Catch: rm0.j -> L31
            ke2.e r4 = new ke2.e     // Catch: rm0.j -> L31
            r1 = 4
            r4.<init>(r1, r0, r11)     // Catch: rm0.j -> L31
            if (r23 == 0) goto L59
            r14 = 0
            r15 = 0
            r17 = 2
            r18 = 0
            r12 = r4
            r13 = r20
            az2.j.u(r12, r13, r14, r15, r17, r18)     // Catch: rm0.j -> L31
        L59:
            r0 = 0
            r7 = 0
            r9 = 3
            r10 = 0
            r8.f315215f = r5     // Catch: rm0.j -> L31
            r5 = r0
            java.lang.Object r0 = rm0.h.a(r4, r5, r7, r8, r9, r10)     // Catch: rm0.j -> L31
            if (r0 != r2) goto L68
            return r2
        L68:
            jz5.l r0 = new jz5.l     // Catch: rm0.j -> L31
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: rm0.j -> L31
            r0.<init>(r1, r11)     // Catch: rm0.j -> L31
            return r0
        L70:
            jz5.l r1 = new jz5.l
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.<init>(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.q4.k(android.content.Context, r45.eq1, r45.qo, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void l(android.content.Context context, gk2.e buContext, l81.b1 bundle, boolean z17, android.webkit.ValueCallback valueCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAssistant2", "open fullscreen miniPro appId:" + bundle.f398547b + ",patch:" + bundle.f398555f + ",luanchFromApp:" + z17 + ",is test:" + zl2.q4.f555466a.x());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bundle.f398547b)) {
            return;
        }
        mm2.f6 f6Var = (mm2.f6) buContext.a(mm2.f6.class);
        java.lang.String appId = bundle.f398547b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
        f6Var.A = appId;
        bundle.H = k91.z3.OPAQUE;
        dk2.ef efVar = dk2.ef.f314905a;
        bundle.L = new st2.m2(buContext, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.C14968x4a39aafe(dk2.ef.f314913e));
        o(context, buContext, bundle, z17, valueCallback);
    }

    public final void n(android.content.Context context, gk2.e buContext, l81.b1 bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.ShareActionConfig shareActionConfig;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("open halfscreen miniPro appId:");
        sb6.append(bundle.f398547b);
        sb6.append(",patch:");
        sb6.append(bundle.f398555f);
        sb6.append(",is test:");
        sb6.append(zl2.q4.f555466a.x());
        sb6.append(",halfScreenConfig is null:");
        sb6.append(bundle.G == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAssistant2", sb6.toString());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bundle.f398547b) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bundle.f398555f)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.BackgroundShapeConfig backgroundShapeConfig = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.BackgroundShapeConfig(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.z_), true, true, false, false, 24, null);
        java.lang.String name = context.getClass().getName();
        k91.s2 s2Var = k91.s2.f387293d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CloseWhenClickEmptyAreaConfig closeWhenClickEmptyAreaConfig = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CloseWhenClickEmptyAreaConfig(name, s2Var);
        float f17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getConfiguration().orientation == 2) {
            f17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        }
        int h07 = (int) ((ae2.in.f85221a.h0() / 100.0f) * f17);
        l81.p0 p0Var = bundle.f398561i;
        st2.h2 h2Var = null;
        dk2.ah ahVar = p0Var instanceof dk2.ah ? (dk2.ah) p0Var : null;
        boolean z17 = ahVar != null ? ahVar.f314756s : false;
        dk2.ah ahVar2 = p0Var instanceof dk2.ah ? (dk2.ah) p0Var : null;
        boolean z18 = ahVar2 != null ? ahVar2.f314757t : false;
        dk2.ah ahVar3 = p0Var instanceof dk2.ah ? (dk2.ah) p0Var : null;
        boolean z19 = ahVar3 != null ? ahVar3.f314751n : false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368 c11820x84c5f368 = bundle.G.f158899p;
        if (!(c11820x84c5f368 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.C14967xb77206cb)) {
            c11820x84c5f368 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.C14969xb96ec3a2(k0Var, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368 c11820x84c5f3682 = c11820x84c5f368;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c12 = bundle.G;
        if (c11816x5915d2c12 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c11816x5915d2c12, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.Y)) {
            c11816x5915d2c1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1(true, h07, s2Var, true, backgroundShapeConfig, true, closeWhenClickEmptyAreaConfig, k91.t2.f387300e, z17, true, c11820x84c5f3682, null, false, false, null, true, 0, null, 0, 0, 0, false, false, false, null, false, null, (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1), false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -134256640, 2047, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c13 = bundle.G;
            if (c11816x5915d2c13 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l e17 = c11816x5915d2c13.e();
                e17.f159054a = true;
                e17.f159060g = true;
                e17.f159062i = backgroundShapeConfig;
                e17.f159063j = true;
                e17.f159061h = closeWhenClickEmptyAreaConfig;
                e17.f159065l = z17;
                e17.f159066m = z18;
                e17.f159068o = c11820x84c5f3682;
                e17.B = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
                e17.C = z19 && z17 && !z18;
                e17.f159072s = true;
                c11816x5915d2c1 = e17.a();
            } else {
                c11816x5915d2c1 = null;
            }
        }
        bundle.G = c11816x5915d2c1;
        zl2.b0 b0Var = zl2.b0.f555196a;
        java.lang.String str2 = ((mm2.c1) buContext.a(mm2.c1.class)).f410385o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c14 = bundle.G;
        if (c11816x5915d2c14 == null || (shareActionConfig = c11816x5915d2c14.f158906w) == null || (str = shareActionConfig.f158924e) == null) {
            str = "";
        }
        b0Var.a(str2, str, bundle);
        mm2.f6 f6Var = (mm2.f6) buContext.a(mm2.f6.class);
        java.lang.String appId = bundle.f398547b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
        f6Var.A = appId;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5) ((s40.a1) i95.n0.c(s40.a1.class))).Ai(bundle);
        if (k0Var != null) {
            java.lang.String appId2 = bundle.f398547b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId2, "appId");
            h2Var = new st2.h2(k0Var, appId2);
        }
        o(context, buContext, bundle, true, h2Var);
    }

    public final void o(android.content.Context context, gk2.e liveData, l81.b1 bundle, boolean z17, android.webkit.ValueCallback valueCallback) {
        java.lang.Class<?> cls;
        km2.t c17;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e b17;
        km2.t c18;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e b18;
        km2.t c19;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e b19;
        gk2.e eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.C14969xb96ec3a2 c14969xb96ec3a2;
        java.lang.String str;
        java.lang.Object obj;
        r45.dv1 dv1Var;
        r45.ve2 ve2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        if (z17) {
            int i17 = (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((mm2.f6) liveData.a(mm2.f6.class)).A) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bundle.f398547b)) ? 0 : 1;
            l81.p0 p0Var = bundle.f398561i;
            dk2.ah ahVar = p0Var instanceof dk2.ah ? (dk2.ah) p0Var : null;
            if (!st2.f2.f493823d || (dv1Var = ((mm2.f6) liveData.a(mm2.f6.class)).f410571n) == null || (ve2Var = (r45.ve2) dv1Var.m75936x14adae67(5)) == null || (str = ve2Var.m75945x2fec8307(0)) == null) {
                str = "";
            }
            if (((zy2.qa) i95.n0.c(zy2.qa.class)) != null) {
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                int i18 = ahVar != null ? ahVar.f314753p : 0;
                if (ahVar == null || (obj = ahVar.f314754q) == null) {
                    obj = "";
                }
                java.lang.String valueOf = java.lang.String.valueOf(obj);
                java.lang.String str2 = bundle.f398547b;
                if (str2 == null) {
                    str2 = "";
                }
                int i19 = bundle.f398565k;
                boolean z18 = st2.f2.f493821b;
                boolean z19 = st2.f2.f493822c;
                java.lang.String liveid = java.lang.String.valueOf(((mm2.e1) liveData.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
                java.lang.String finderid = xy2.c.e(context);
                java.lang.String sessionid = java.lang.String.valueOf(((mm2.c1) liveData.a(mm2.c1.class)).f410394p2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveid, "liveid");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderid, "finderid");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionid, "sessionid");
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6523x21f714a3 c6523x21f714a3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6523x21f714a3();
                c6523x21f714a3.f138745i = i19;
                c6523x21f714a3.f138740d = i17;
                c6523x21f714a3.f138741e = i18;
                c6523x21f714a3.f138755s = c6523x21f714a3.b("clickId", valueOf, true);
                c6523x21f714a3.f138742f = c6523x21f714a3.b("appId", str2, true);
                c6523x21f714a3.f138743g = 0L;
                c6523x21f714a3.f138747k = c6523x21f714a3.b("preWarmPath", str, true);
                c6523x21f714a3.f138748l = z18 ? 1 : 0;
                c6523x21f714a3.f138749m = z19 ? 1 : 0;
                c6523x21f714a3.f138750n = c6523x21f714a3.b("liveId", liveid, true);
                c6523x21f714a3.f138751o = c6523x21f714a3.b("finderId", finderid, true);
                c6523x21f714a3.f138752p = c6523x21f714a3.b("shopwindowId", "", true);
                c6523x21f714a3.f138753q = c6523x21f714a3.b(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, sessionid, true);
                c6523x21f714a3.f138744h = 10;
                c6523x21f714a3.f138746j = c6523x21f714a3.b("networkType", java.lang.String.valueOf(by5.y.a(context2)), true);
                c6523x21f714a3.f138754r = c01.id.c();
                c6523x21f714a3.k();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramReportHelper", "luanch from mini program!");
        }
        bundle.f398549c = zl2.q4.f555466a.x();
        if (bundle.f398570o == null) {
            bundle.f398570o = valueCallback;
        }
        bundle.f398572q = 1000;
        int hashCode = bundle.hashCode();
        bundle.M = true;
        l81.e1 e1Var = bundle.L;
        if (e1Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368 c11820x84c5f368 = bundle.G.f158899p;
            if (c11820x84c5f368 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.C14969xb96ec3a2) {
                c14969xb96ec3a2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.C14969xb96ec3a2) c11820x84c5f368;
                eVar = liveData;
            } else {
                eVar = liveData;
                c14969xb96ec3a2 = null;
            }
            e1Var = new st2.m2(eVar, c14969xb96ec3a2);
        }
        bundle.L = e1Var;
        km2.n.f390680p.put(java.lang.Integer.valueOf(hashCode), bundle);
        km2.n nVar = dk2.ef.H;
        java.lang.String str3 = (nVar == null || (c19 = nVar.c()) == null || (b19 = c19.b()) == null) ? null : b19.I;
        km2.n nVar2 = dk2.ef.H;
        java.lang.String str4 = (nVar2 == null || (c18 = nVar2.c()) == null || (b18 = c18.b()) == null) ? null : b18.L;
        km2.n nVar3 = dk2.ef.H;
        java.lang.Integer valueOf2 = (nVar3 == null || (c17 = nVar3.c()) == null || (b17 = c17.b()) == null) ? null : java.lang.Integer.valueOf(b17.K);
        if (valueOf2 != null && valueOf2.intValue() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.v0.f262526a.a(bundle.f398547b, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19156xb6112c3(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, gm0.j1.b().k()) ? str3 : str4, str3, 0, "", "", "", 0L));
        } else if (valueOf2 != null && valueOf2.intValue() == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.v0.f262526a.a(bundle.f398547b, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19156xb6112c3(str3, ""));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAssistant2", "launchMiniProgram,key:" + hashCode + ",fromUsername:" + str3 + ",toUsername:" + str4 + ",fromShareSceneNew:" + valueOf2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("ACTIVITY_PURPOSE", 1);
        intent.putExtra("LUANCH_KEY", hashCode);
        intent.putExtra("MMActivity.OverrideEnterAnimation", -1);
        intent.putExtra("MMActivity.OverrideExitAnimation", -1);
        intent.addFlags(67108864);
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Zi(context)) {
            jz2.x0 x0Var = jz2.x0.f384287a;
            cls = (java.lang.Class) ((jz5.n) jz2.x0.f384302p).mo141623x754a37bb();
        } else {
            jz2.x0 x0Var2 = jz2.x0.f384287a;
            cls = (java.lang.Class) ((jz5.n) jz2.x0.f384301o).mo141623x754a37bb();
        }
        intent.setClass(context, cls);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/FinderLiveAssistant2", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.l.f34522x24728b, "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Lcom/tencent/mm/plugin/appbrand/api/WeAppOpenBundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/live/model/FinderLiveAssistant2", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.l.f34522x24728b, "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Lcom/tencent/mm/plugin/appbrand/api/WeAppOpenBundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(r45.hc1 r14, gk2.e r15) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.q4.p(r45.hc1, gk2.e):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(android.content.Context r18, ce2.i r19, r45.yi6 r20, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.q4.q(android.content.Context, ce2.i, r45.yi6, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
