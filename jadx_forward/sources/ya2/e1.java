package ya2;

/* loaded from: classes10.dex */
public final class e1 implements zy2.ta {

    /* renamed from: a, reason: collision with root package name */
    public static final ya2.e1 f542005a = new ya2.e1();

    /* renamed from: b, reason: collision with root package name */
    public static android.util.Pair f542006b;

    public static void P(ya2.e1 e1Var, cl0.g gVar, android.content.Context context, zy2.i5 i5Var, zy2.i5 i5Var2, int i17, java.lang.Object obj) {
        e1Var.getClass();
        java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4(dm.i4.f66875xa013b0d5);
        java.lang.String mo15082x48bce8a42 = gVar.mo15082x48bce8a4("fromUsername");
        java.lang.String mo15082x48bce8a43 = gVar.mo15082x48bce8a4("nickname");
        java.lang.String mo15082x48bce8a44 = gVar.mo15082x48bce8a4("headUrl");
        java.lang.String mo15082x48bce8a45 = gVar.mo15082x48bce8a4("signature");
        java.lang.String mo15082x48bce8a46 = gVar.mo15082x48bce8a4("liveContactExtInfo");
        cl0.e f17 = gVar.f("badgeInfo");
        boolean optBoolean = gVar.optBoolean("isDarkMode");
        int mo15080xc3ca103c = gVar.mo15080xc3ca103c("liveIdentity", 0);
        java.lang.String mo15083x48bce8a4 = gVar.mo15083x48bce8a4("liveId", "");
        java.lang.String mo15083x48bce8a42 = gVar.mo15083x48bce8a4("objectId", "");
        r45.xn1 xn1Var = new r45.xn1();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
        c19782x23db1cfa.m76240x66bc2758(mo15082x48bce8a4);
        c19782x23db1cfa.m76218xe0a5bcad(mo15082x48bce8a44);
        c19782x23db1cfa.m76235x9bbeca76(mo15082x48bce8a45);
        c19782x23db1cfa.m76227x7ac946f0(mo15082x48bce8a43);
        xn1Var.set(0, c19782x23db1cfa);
        xn1Var.set(7, java.lang.Integer.valueOf(mo15080xc3ca103c));
        if ((f17 != null ? f17.mo15056xbe0e3ae6() : 0) > 0) {
            cl0.g jSONObject = f17 != null ? f17.getJSONObject(0) : null;
            if (jSONObject != null) {
                java.util.LinkedList m75941xfb821914 = xn1Var.m75941xfb821914(11);
                r45.yl1 yl1Var = new r45.yl1();
                yl1Var.set(0, java.lang.Integer.valueOf(jSONObject.optInt("badgeType")));
                yl1Var.set(2, java.lang.Integer.valueOf(jSONObject.optInt("badgeLevel")));
                yl1Var.set(4, jSONObject.mo15082x48bce8a4("badgeName"));
                m75941xfb821914.add(yl1Var);
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a46);
        byte[] bytes = mo15082x48bce8a46.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        xn1Var.set(9, pm0.b0.h(bytes));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15083x48bce8a4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15083x48bce8a42);
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a42);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        android.app.Activity activity = k17 != null ? (android.app.Activity) k17.get() : null;
        if (activity != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13970xb1effd3a.class);
            intent.putExtra("isDarkMode", optBoolean);
            intent.putExtra("liveContact", xn1Var.mo14344x5f01b1f6());
            intent.putExtra("fromUsername", mo15082x48bce8a42);
            intent.putExtra("liveId", mo15083x48bce8a4);
            intent.putExtra("objectId", mo15083x48bce8a42);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            android.app.Activity activity2 = activity;
            yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "openFinderLiveMemberProfileWidget", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;ZLjava/lang/String;Lcom/tencent/mm/feature/finder/live/api/IFinderLiveFeatureService$LiveParam;Lcom/tencent/mm/plugin/findersdk/api/ICallback;Lcom/tencent/mm/plugin/findersdk/api/ICallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity2, "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "openFinderLiveMemberProfileWidget", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;ZLjava/lang/String;Lcom/tencent/mm/feature/finder/live/api/IFinderLiveFeatureService$LiveParam;Lcom/tencent/mm/plugin/findersdk/api/ICallback;Lcom/tencent/mm/plugin/findersdk/api/ICallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public static void Q(ya2.e1 e1Var, cl0.g gVar, android.content.Context context, zy2.i5 i5Var, java.lang.String str, int i17, java.lang.Object obj) {
        e1Var.getClass();
        int optInt = gVar.optInt("requestScene");
        boolean optBoolean = gVar.optBoolean("useDarkStyle");
        int optInt2 = gVar.optInt("selectTabId");
        int optInt3 = gVar.optInt("selectSecondTabId");
        java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("byPass");
        int optInt4 = gVar.optInt("entryScene");
        java.lang.String mo15082x48bce8a42 = gVar.mo15082x48bce8a4("feedID");
        java.lang.String mo15082x48bce8a43 = gVar.mo15082x48bce8a4("nonceID");
        java.lang.String mo15082x48bce8a44 = gVar.mo15082x48bce8a4("pageTitle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a42);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a43);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a44);
        e1Var.R(context, optInt, optBoolean, optInt2, optInt3, mo15082x48bce8a4, optInt4, mo15082x48bce8a42, mo15082x48bce8a43, mo15082x48bce8a44);
        if (i5Var != null) {
            i5Var.a(java.lang.Boolean.TRUE);
        }
    }

    public static void T(ya2.e1 e1Var, cl0.g gVar, android.content.Context context, zy2.i5 i5Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.Object obj) {
        java.lang.String str5 = (i17 & 8) != 0 ? "" : str;
        java.lang.String str6 = (i17 & 16) != 0 ? "" : str2;
        java.lang.String str7 = (i17 & 32) != 0 ? "" : str3;
        java.lang.String str8 = (i17 & 64) != 0 ? "" : str4;
        e1Var.getClass();
        java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("feedID");
        int optInt = gVar.optInt("commentScene");
        java.lang.String mo15083x48bce8a4 = gVar.mo15083x48bce8a4("reportExtraInfo", "");
        java.lang.String mo15083x48bce8a42 = gVar.mo15083x48bce8a4(zy2.v.f559125c, "");
        int optInt2 = gVar.optInt("enterTabType");
        int optInt3 = gVar.optInt("isSelfFlag");
        int optInt4 = gVar.optInt("followScene");
        int optInt5 = gVar.optInt("KEY_JSAPI_SOURCE_TYPE");
        java.lang.String mo15082x48bce8a42 = gVar.mo15082x48bce8a4("sourceBuffer");
        boolean optBoolean = gVar.optBoolean("halfPage");
        java.lang.String str9 = str5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "openFinderProfile, lastGMsgId is " + mo15083x48bce8a42 + ", sourceBuffer is " + mo15082x48bce8a42);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", str6);
        intent.putExtra("finder_read_feed_id", mo15082x48bce8a4);
        intent.putExtra("key_extra_info", mo15083x48bce8a4);
        intent.putExtra("report_scene", 18);
        intent.putExtra("key_from_comment_scene", 39);
        intent.putExtra("key_from_follow_scene", optInt4);
        intent.putExtra("KEY_JSAPI_SOURCE_TYPE", optInt5);
        intent.putExtra("KEY_JSAPI_SOURCE_BUFFER", mo15082x48bce8a42);
        intent.putExtra("key_interaction_action_type", gVar.optInt("profileEnterActionType"));
        if (optInt2 > 0) {
            intent.putExtra("key_enter_profile_tab", optInt2 != 5 ? optInt2 != 6 ? optInt2 != 7 ? 0 : 8 : 7 : 6);
        }
        boolean z17 = true;
        if (optInt3 == 1 && hc2.l.g(str6)) {
            intent.putExtra("KEY_FINDER_SELF_FLAG", true);
        }
        if (str7.length() > 0) {
            intent.putExtra("key_export_username_buffer", str7);
        }
        if (str8.length() > 0) {
            intent.putExtra("key_export_username", str8);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Cj(intent, mo15083x48bce8a42, new r45.md5());
        c50.c1 c1Var = (c50.c1) i95.n0.c(c50.c1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15083x48bce8a4);
        ml2.r0 r0Var = (ml2.r0) c1Var;
        r0Var.getClass();
        r0Var.H1 = mo15083x48bce8a4;
        p52.h.f433549a.f(mo15083x48bce8a4, str6);
        if (optInt > 0) {
            java.lang.String str10 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s0.f206872a;
            if (36 == optInt) {
                if (str10 != null && str10.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    intent.putExtra("key_context_id", str10);
                }
            }
            java.lang.String J2 = e1Var.J(optInt, hc2.l.h(mo15083x48bce8a4) ? 4 : 2, 32, intent);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str9)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21140, J2, str9, mo15082x48bce8a4, str6);
            }
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(J2);
        }
        if (optBoolean) {
            pm0.v.X(new ya2.y0(context, intent));
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(context, intent);
        }
        if (i5Var != null) {
            i5Var.a(0);
        }
    }

    public static final void h(ya2.e1 e1Var, android.content.Context context, android.content.Intent intent, java.lang.String str) {
        e1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderRouterApi", "open half profile failed: " + str);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(context, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(ya2.e1 r1, android.content.Context r2, int r3, java.lang.String r4) {
        /*
            r1.getClass()
            r1 = -4036(0xfffffffffffff03c, float:NaN)
            java.lang.String r0 = "getString(...)"
            if (r3 == r1) goto L36
            r1 = -4033(0xfffffffffffff03f, float:NaN)
            if (r3 == r1) goto L25
            r1 = -4011(0xfffffffffffff055, float:NaN)
            if (r3 == r1) goto L14
            java.lang.String r1 = ""
            goto L47
        L14:
            if (r4 != 0) goto L46
            android.content.res.Resources r1 = r2.getResources()
            r3 = 2131762355(0x7f101cb3, float:1.9155785E38)
            java.lang.String r4 = r1.getString(r3)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r0)
            goto L46
        L25:
            if (r4 != 0) goto L46
            android.content.res.Resources r1 = r2.getResources()
            r3 = 2131762486(0x7f101d36, float:1.915605E38)
            java.lang.String r4 = r1.getString(r3)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r0)
            goto L46
        L36:
            if (r4 != 0) goto L46
            android.content.res.Resources r1 = r2.getResources()
            r3 = 2131767810(0x7f103202, float:1.9166849E38)
            java.lang.String r4 = r1.getString(r3)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r0)
        L46:
            r1 = r4
        L47:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L5b
            android.content.res.Resources r1 = r2.getResources()
            r3 = 2131762086(0x7f101ba6, float:1.915524E38)
            java.lang.String r1 = r1.getString(r3)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r0)
        L5b:
            r3 = 0
            android.widget.Toast r1 = db5.t7.m123883x26a183b(r2, r1, r3)
            r1.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.e1.i(ya2.e1, android.content.Context, int, java.lang.String):void");
    }

    public void A(android.content.Context context, android.content.Intent intent, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        z(context, intent, -1, z17);
    }

    public void B(android.content.Context context, java.lang.String json, android.content.Intent intent) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        try {
            cl0.g gVar = new cl0.g(json);
            long Z = pm0.v.Z(gVar.mo15083x48bce8a4("feedId", "0"));
            cl0.g a17 = gVar.a("extInfo");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "json = ".concat(json));
            java.lang.String mo15074x2fec8307 = a17.mo15074x2fec8307("feedNonceId");
            int mo15080xc3ca103c = a17.mo15080xc3ca103c("reportScene", 11);
            java.lang.String mo15083x48bce8a4 = a17.mo15083x48bce8a4("encryptedObjectId", "");
            boolean mo15078x42e4f5f5 = a17.mo15078x42e4f5f5("getRelatedList", false);
            java.lang.String mo15083x48bce8a42 = a17.mo15083x48bce8a4(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "");
            java.lang.String mo15083x48bce8a43 = a17.mo15083x48bce8a4("reportExtraInfo", "");
            java.lang.String mo15083x48bce8a44 = a17.mo15083x48bce8a4("commonExtraInfo", "");
            int mo15080xc3ca103c2 = a17.mo15080xc3ca103c("requestScene", 3);
            str = "FinderRouterApi";
            try {
                double mo15079x2edf0464 = a17.mo15079x2edf0464("currentTime", 0.0d);
                android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
                intent2.putExtra("report_scene", mo15080xc3ca103c);
                intent2.putExtra("from_user", c01.z1.r());
                intent2.putExtra("feed_object_id", Z);
                intent2.putExtra("feed_encrypted_object_id", mo15083x48bce8a4);
                intent2.putExtra("feed_object_nonceId", mo15074x2fec8307);
                intent2.putExtra("key_need_related_list", mo15078x42e4f5f5);
                intent2.putExtra("key_session_id", mo15083x48bce8a42);
                intent2.putExtra("key_comment_scene", 39);
                intent2.putExtra("key_reuqest_scene", mo15080xc3ca103c2);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo15083x48bce8a44)) {
                    intent2.putExtra("key_common_extra_info", mo15083x48bce8a44);
                }
                long j17 = (long) (mo15079x2edf0464 * 1000);
                if (j17 > 0) {
                    intent2.putExtra("KEY_VIDEO_START_PLAY_TIME_MS", j17);
                }
                java.lang.String mo15083x48bce8a45 = gVar.mo15083x48bce8a4(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, "");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15083x48bce8a45, "optString(...)");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo15083x48bce8a43)) {
                    intent2.putExtra("key_extra_info", mo15083x48bce8a43);
                } else if (!android.text.TextUtils.isEmpty(mo15083x48bce8a45)) {
                    intent2.putExtra("key_extra_info", mo15083x48bce8a45);
                }
                if (hz2.d.f367846a.b("entrance") != 0) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).kl(context);
                    return;
                }
                try {
                    J(zy2.v.a(mo15080xc3ca103c), 2, 39, intent2);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).uk(context, intent2, false);
                    w04.l.INSTANCE.b(540999685);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, th, "enterFinderProfileUI exception", new java.lang.Object[0]);
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            str = "FinderRouterApi";
        }
    }

    public void C(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        D(context, intent, false);
    }

    public void D(android.content.Context context, android.content.Intent intent, boolean z17) {
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206791d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206789b = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206790c = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206792e = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206794g = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1 p1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1();
        p1Var.f206763a = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206791d = p1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206789b = 2L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206790c = 1L;
        p1Var.f206764b = 0L;
        p1Var.f206765c = 0L;
        p1Var.f206766d = 0L;
        p1Var.f206767e = 0L;
        p1Var.f206768f = 0L;
        if (intent != null) {
            if (intent.getBooleanExtra("key_form_sns", false)) {
                java.lang.String stringExtra = intent.getStringExtra("key_context_id");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                z18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ga.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a, stringExtra, 1, 0, null, 12, null));
            } else {
                z18 = false;
            }
            if (z18 | (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(intent.getStringExtra("key_red_dot_id")))) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206928c = true;
            }
        }
        pf5.u uVar = pf5.u.f435469a;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209352m4).mo141623x754a37bb()).r()).intValue() == 1) {
                if (intent != null && intent.getBooleanExtra("KEY_ROUTE_TO_TOPIC", false)) {
                    xc2.y2.f534876a.f(intent, ya2.e0.f542004d);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379 c14614xb913e379 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) uVar.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class);
                for (bs2.n1 n1Var : c14614xb913e379.f204076e) {
                    int T6 = c14614xb913e379.T6();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379 c14614xb913e3792 = n1Var.f105441b;
                    ey2.t0 t0Var = (ey2.t0) ((jz5.n) c14614xb913e3792.f204078g).mo141623x754a37bb();
                    int i17 = n1Var.f105440a;
                    boolean R6 = t0Var.R6(i17);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[performEnterFinderLoad] targetTab=");
                    sb6.append(T6);
                    sb6.append(", cache.resp is null = ");
                    bs2.b0 b0Var = n1Var.f105458s;
                    sb6.append(b0Var.f105339b == null);
                    sb6.append(", isAutoRefresh = ");
                    sb6.append(R6);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(n1Var.f105442c, sb6.toString());
                    if (i17 == T6 && b0Var.f105339b == null && R6) {
                        ((ey2.t0) ((jz5.n) c14614xb913e3792.f204078g).mo141623x754a37bb()).X6(0, i17);
                        n1Var.q(bs2.h0.f105384n, intent, new bs2.t0(n1Var));
                    }
                }
            }
        }
        int intExtra = intent != null ? intent.getIntExtra("FROM_SCENE_KEY", 2) : 2;
        if (intExtra == 6) {
            ey2.o0 N6 = ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).N6(4);
            N6.a(ey2.q0.f339005e);
            N6.f338982i = java.lang.System.currentTimeMillis();
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.ub.L7((c61.ub) c17, context, intent, intExtra, false, 8, null);
        } else {
            i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            c61.ub.L7((c61.ub) c18, context, intent, 0, false, 12, null);
        }
        w04.l.INSTANCE.b(540999684);
    }

    public void E(android.content.Context context, java.lang.String str, zy2.i5 i5Var) {
        java.lang.String str2;
        android.content.Context context2 = context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        cl0.g a17 = new cl0.g(str).a("extInfo");
        java.lang.String mo15082x48bce8a4 = a17.mo15082x48bce8a4(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        int optInt = a17.optInt("topicType");
        java.lang.String mo15082x48bce8a42 = a17.mo15082x48bce8a4("poiClassifyId");
        double optDouble = a17.optDouble("longitude");
        double optDouble2 = a17.optDouble("latitude");
        java.lang.String mo15082x48bce8a43 = a17.mo15082x48bce8a4("eventEncryptedTopicId");
        int optInt2 = a17.optInt("entryScene");
        java.lang.String mo15082x48bce8a44 = a17.mo15082x48bce8a4(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96);
        java.lang.String mo15082x48bce8a45 = a17.mo15082x48bce8a4("clientKVReportInfo");
        int mo15080xc3ca103c = a17.mo15080xc3ca103c("KEY_JSAPI_SOURCE_TYPE", 0);
        java.lang.String mo15083x48bce8a4 = a17.mo15083x48bce8a4("sourceBuffer", "");
        if (optInt == 7) {
            if (android.text.TextUtils.isEmpty(mo15082x48bce8a43) || i5Var == null) {
                str2 = "";
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l0 l0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l0.f183872b;
                l0Var.getClass();
                java.lang.String uuid = java.util.UUID.randomUUID().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
                l0Var.f183836a.put(uuid, i5Var);
                str2 = uuid;
            }
            if (!(context2 instanceof android.app.Activity)) {
                context2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184144a.b();
            }
            android.content.Context context3 = context2;
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17).Di(context3, mo15082x48bce8a43, mo15082x48bce8a4, "", optInt2, mo15082x48bce8a44, str2, mo15082x48bce8a45, mo15080xc3ca103c, mo15083x48bce8a4);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_title", mo15082x48bce8a4);
        intent.putExtra("key_topic_type", optInt);
        intent.putExtra("KEY_JSAPI_SOURCE_TYPE", mo15080xc3ca103c);
        intent.putExtra("KEY_JSAPI_SOURCE_BUFFER", mo15083x48bce8a4);
        r45.ze2 ze2Var = new r45.ze2();
        ze2Var.set(5, mo15082x48bce8a42);
        ze2Var.set(0, java.lang.Float.valueOf((float) optDouble));
        ze2Var.set(1, java.lang.Float.valueOf((float) optDouble2));
        try {
            intent.putExtra("key_topic_poi_location", ze2Var.mo14344x5f01b1f6());
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderRouterApi", "location toByteArray exception");
        }
        if (36 == optInt2) {
            java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s0.f206872a;
            if (!(str3 == null || str3.length() == 0)) {
                intent.putExtra("key_context_id", str3);
                intent.putExtra("KEY_IGNORE_REPORT_INIT", true);
            }
        }
        if (Y()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).hl(context2, intent);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).kl(context2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x005f. Please report as an issue. */
    public void F(android.content.Context context, java.lang.String str, zy2.i5 i5Var, yz5.l lVar) {
        int i17;
        java.lang.String str2;
        java.lang.String str3 = "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            cl0.g gVar = new cl0.g(str);
            cl0.g a17 = gVar.a("extInfo");
            java.lang.String mo15083x48bce8a4 = gVar.mo15083x48bce8a4("KShareTraceLastGMsgId", "");
            a17.optInt("KEY_JSAPI_SOURCE_TYPE");
            a17.h(zy2.v.f559125c, mo15083x48bce8a4);
            java.lang.String mo15074x2fec8307 = a17.mo15074x2fec8307("action");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "json = " + str);
            java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("webUrl");
            java.lang.String str4 = mo15082x48bce8a4 == null ? "" : mo15082x48bce8a4;
            try {
                if (mo15074x2fec8307 != null) {
                    switch (mo15074x2fec8307.hashCode()) {
                        case -1852273586:
                            i17 = 0;
                            str2 = "FinderRouterApi";
                            if (!mo15074x2fec8307.equals("createFinderLive")) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "unKnow action:" + mo15074x2fec8307);
                            } else {
                                i95.m c17 = i95.n0.c(s40.w0.class);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                                java.lang.String gVar2 = a17.toString();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                                s40.w0.J9((s40.w0) c17, context, gVar2, 0, 4, null);
                            }
                        case -1160307446:
                            i17 = 0;
                            str2 = "FinderRouterApi";
                            if (mo15074x2fec8307.equals("openFinderMultiMoreLive")) {
                                Q(this, a17, context, null, null, 8, null);
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "unKnow action:" + mo15074x2fec8307);
                        case -891053138:
                            i17 = 0;
                            str2 = "FinderRouterApi";
                            if (!mo15074x2fec8307.equals("openFinderFansList")) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "unKnow action:" + mo15074x2fec8307);
                            }
                            android.content.Intent intent = new android.content.Intent();
                            a17.mo15082x48bce8a4("finderUserName");
                            int optInt = a17.optInt("commentScene");
                            int optInt2 = a17.optInt("finderFansCount");
                            intent.putExtra("comment_scene", optInt);
                            intent.putExtra("fans_count", optInt2);
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).uj(context, intent);
                        case -505354664:
                            i17 = 0;
                            str2 = "FinderRouterApi";
                            if (!mo15074x2fec8307.equals("createLuckyLive")) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "unKnow action:" + mo15074x2fec8307);
                            } else {
                                java.lang.String mo15082x48bce8a42 = a17.mo15082x48bce8a4("groupId");
                                if (mo15082x48bce8a42 != null) {
                                    str3 = mo15082x48bce8a42;
                                }
                                ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ij(context, str3);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22385, 4, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                            }
                        case -412058418:
                            if (!mo15074x2fec8307.equals("openFinderFeed")) {
                                break;
                            } else {
                                android.content.Context b17 = context instanceof android.app.Activity ? context : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184144a.b();
                                if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Jk()) {
                                    i17 = 0;
                                    str2 = "FinderRouterApi";
                                    zy2.ta.a(this, a17, b17, i5Var, null, false, null, lVar, 56, null);
                                } else {
                                    wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
                                    ya2.f0 f0Var = new ya2.f0(a17, b17, i5Var, lVar);
                                    ((vd0.j2) q1Var).getClass();
                                    v24.o0.h(context, 34359738368L, null, f0Var, 3);
                                    return;
                                }
                            }
                        case 50881657:
                            if (!mo15074x2fec8307.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.h0.f34297x24728b)) {
                                break;
                            } else {
                                S(a17, context, null, "");
                                return;
                            }
                        case 218586158:
                            if (!mo15074x2fec8307.equals("openFinderNotifyCenter")) {
                                break;
                            } else {
                                java.lang.String mo15082x48bce8a43 = a17.mo15082x48bce8a4("finderUserName");
                                android.content.Intent intent2 = new android.content.Intent();
                                ya2.b2 b18 = ya2.h.f542017a.b(mo15082x48bce8a43);
                                if (!(b18 != null ? b18.G0() : false)) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, context, intent2, 0L, null, 0, 0, false, 0, null, 508, null);
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).ck(context, intent2);
                                    return;
                                }
                                intent2.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15028x68e5fbe.class);
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                arrayList.add(intent2);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/api/FinderRouterApi", "enterFinderUI", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/findersdk/api/ICallback;Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                context.startActivity((android.content.Intent) arrayList.get(0));
                                yj0.a.f(context, "com/tencent/mm/plugin/finder/api/FinderRouterApi", "enterFinderUI", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/findersdk/api/ICallback;Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                return;
                            }
                        case 519087087:
                            if (!mo15074x2fec8307.equals("openFinderLiveAliasRoleView")) {
                                break;
                            } else {
                                pm0.v.X(ya2.h0.f542019d);
                                return;
                            }
                        case 685848668:
                            if (!mo15074x2fec8307.equals("openFinderLiveHalfOnlineUserProfile")) {
                                break;
                            } else {
                                P(this, a17, context, null, null, 12, null);
                                return;
                            }
                        case 781733111:
                            if (!mo15074x2fec8307.equals("openTingAlbum")) {
                                break;
                            } else {
                                java.lang.String mo15074x2fec83072 = a17.mo15074x2fec8307("categoryId");
                                i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                                bw5.o50 o50Var = new bw5.o50();
                                o50Var.i(mo15074x2fec83072);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.gl((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c18, context, o50Var, bw5.ar0.TingScene_FinderProfileMusic, false, false, 24, null);
                                return;
                            }
                        case 819909547:
                            if (!mo15074x2fec8307.equals("autoOpenFinderLive")) {
                                break;
                            } else {
                                ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Di(a17, str4, context, null, null);
                                return;
                            }
                        case 1337525401:
                            if (!mo15074x2fec8307.equals("openFinderFansProfile")) {
                                break;
                            } else {
                                pm0.v.X(new ya2.g0(a17));
                                return;
                            }
                        case 1456424243:
                            if (!mo15074x2fec8307.equals("openFinderLiveGiftPacksView")) {
                                break;
                            } else {
                                android.content.Intent intent3 = new android.content.Intent();
                                int mo15080xc3ca103c = a17.mo15080xc3ca103c("selfRewardLevel", -1);
                                if (mo15080xc3ca103c >= 0) {
                                    intent3.putExtra("KEY_CUR_LEVEL", mo15080xc3ca103c);
                                }
                                ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).pj(context, intent3);
                                return;
                            }
                        case 1620495011:
                            if (!mo15074x2fec8307.equals("openFinderReplayInLiveRoom")) {
                                break;
                            } else {
                                W(a17, context);
                                return;
                            }
                    }
                }
                i17 = 0;
                str2 = "FinderRouterApi";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "unKnow action:" + mo15074x2fec8307);
            } catch (java.lang.Throwable th6) {
                th = th6;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, th, "enterFinderUI exception", new java.lang.Object[i17]);
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            i17 = 0;
            str2 = "FinderRouterApi";
        }
    }

    public void G(android.content.Context context, boolean z17, java.lang.String str, zy2.i5 i5Var, zy2.i5 i5Var2, zy2.i5 i5Var3) {
        s40.r0 r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            cl0.g a17 = new cl0.g(str).a("extInfo");
            java.lang.String mo15074x2fec8307 = a17.mo15074x2fec8307("action");
            java.lang.String mo15083x48bce8a4 = a17.mo15083x48bce8a4("sourceId", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "enterFinderUIFromMiniApp json = " + str + ", appid:" + mo15083x48bce8a4);
            a17.o("KEY_JSAPI_SOURCE_TYPE", 1);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo15074x2fec8307, "openFinderLive") && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo15074x2fec8307, "autoOpenFinderLive") && context.getResources().getConfiguration().orientation != 1 && (r0Var = (s40.r0) i95.n0.c(s40.r0.class)) != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.m1) r0Var).wi();
            }
            if (mo15074x2fec8307 != null) {
                switch (mo15074x2fec8307.hashCode()) {
                    case -1167465866:
                        if (!mo15074x2fec8307.equals("openChannelsRewardedVideoAd")) {
                            break;
                        } else {
                            M(context, a17, i5Var, i5Var2);
                            return;
                        }
                    case -1160307446:
                        if (!mo15074x2fec8307.equals("openFinderMultiMoreLive")) {
                            break;
                        } else {
                            Q(this, a17, context, i5Var, null, 8, null);
                            return;
                        }
                    case -412058418:
                        if (!mo15074x2fec8307.equals("openFinderFeed")) {
                            break;
                        } else if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Jk()) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15083x48bce8a4);
                            zy2.ta.a(this, a17, context, i5Var, mo15083x48bce8a4, true, i5Var3, null, 64, null);
                            return;
                        } else {
                            wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
                            ya2.i0 i0Var = new ya2.i0(a17, context, i5Var, mo15083x48bce8a4, i5Var3);
                            ((vd0.j2) q1Var).getClass();
                            v24.o0.h(context, 34359738368L, null, i0Var, 3);
                            return;
                        }
                    case -411875300:
                        if (!mo15074x2fec8307.equals("openFinderLive")) {
                            break;
                        } else {
                            ya2.j0 j0Var = new ya2.j0(i5Var2);
                            ya2.k0 k0Var = new ya2.k0(i5Var);
                            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15083x48bce8a4);
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).xk(a17, z17, j0Var, k0Var, mo15083x48bce8a4);
                            return;
                        }
                    case 50881657:
                        if (!mo15074x2fec8307.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.h0.f34297x24728b)) {
                            break;
                        } else {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15083x48bce8a4);
                            S(a17, context, i5Var, mo15083x48bce8a4);
                            return;
                        }
                    case 819909547:
                        if (!mo15074x2fec8307.equals("autoOpenFinderLive")) {
                            break;
                        } else {
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Di(a17, "", context, i5Var, i5Var2);
                            return;
                        }
                    case 1303658160:
                        if (!mo15074x2fec8307.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.z.f34024x24728b)) {
                            break;
                        } else {
                            V(a17, context, i5Var, i5Var2);
                            return;
                        }
                    case 1950532136:
                        if (!mo15074x2fec8307.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.g0.f33999x24728b)) {
                            break;
                        } else {
                            U(a17, context, i5Var, i5Var2);
                            return;
                        }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "unKnow action:" + mo15074x2fec8307);
            if (i5Var2 != null) {
                i5Var2.a(-1000);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderRouterApi", th6, "enterFinderUI exception", new java.lang.Object[0]);
            if (i5Var2 != null) {
                i5Var2.a(java.lang.Integer.valueOf(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15117xb77c61b3));
            }
        }
    }

    public void H(android.app.Activity context, java.lang.String myFinderUsername, r45.lk2 prepareResp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(myFinderUsername, "myFinderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prepareResp, "prepareResp");
        if (hz2.d.f367846a.a("post")) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.D(context, false, 110);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w5.f184185d.d(context, prepareResp, new ya2.l0(context, myFinderUsername, prepareResp))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "preCheck interrupt");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        intent.putExtra("KEY_POST_ENTERSCENE", 110);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Cj(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(13, 53, 386), intent);
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).Ri(context, new qs2.e(3, 110, 0), intent);
    }

    public void I(android.content.Context context, int i17, long j17, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!(context instanceof android.app.Activity)) {
            context = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184144a.b();
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "OpenFinderTemplateViewTask context:" + context);
        intent.putExtra("key_activity_id", j17);
        intent.putExtra("key_entrance_source_type", i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "JsEnterTemplateCollectionUI :" + j17 + " sourceType:" + i17);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).fl(context, intent);
    }

    public final java.lang.String J(int i17, int i18, int i19, android.content.Intent intent) {
        return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(i17, i18, i19, intent);
    }

    public void K(android.content.Context context, java.lang.String appId, java.lang.String page, java.lang.String query, java.lang.String defaultUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultUrl, "defaultUrl");
        xc2.y2 y2Var = xc2.y2.f534876a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
        r45.k74 k74Var = new r45.k74();
        k74Var.set(0, appId);
        k74Var.set(2, query);
        k74Var.set(1, page);
        k74Var.set(3, defaultUrl);
        c19786x6a1e2862.m76551x3af0573b(k74Var);
        xc2.y2.L(y2Var, context, new xc2.p0(c19786x6a1e2862), null, null, null, 28, null);
    }

    public boolean L(android.content.Context context, android.os.Bundle bundle, boolean z17, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        java.lang.String string = bundle.getString("appId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "lite_app appId: " + string);
        boolean z18 = true;
        if ((string == null || string.length() == 0) || (z17 && !((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Jj(string))) {
            z18 = false;
        }
        if (z18) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(context, bundle, true, false, new ya2.o0(lVar));
        }
        return z18;
    }

    public void M(android.content.Context context, org.json.JSONObject extInfo, zy2.i5 i5Var, zy2.i5 i5Var2) {
        java.lang.String jSONObject;
        java.lang.String jSONObject2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        java.lang.String optString = extInfo.optString("feedId");
        java.lang.String optString2 = extInfo.optString("nonceId");
        int optInt = extInfo.optInt("shareScene", 0);
        java.lang.String optString3 = extInfo.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "");
        java.lang.String optString4 = extInfo.optString("reportExtraInfo", "");
        int optInt2 = extInfo.optInt("entryScene", 0);
        int optInt3 = extInfo.optInt("adJSAPIType", 0);
        java.lang.String optString5 = extInfo.optString("userName", "");
        zu2.p.f557263a = i5Var;
        int b17 = hz2.d.f367846a.b("entrance");
        if (b17 != 0) {
            if (i5Var2 != null) {
                i5Var2.a(java.lang.Integer.valueOf(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15118x25060539));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "[openChannelsRewardedVideoAd] spamAction:" + b17 + ' ');
            return;
        }
        int a17 = zy2.v.a(optInt);
        if (a17 != -1) {
            optInt2 = a17;
        } else if (optInt2 == 0) {
            optInt2 = 15;
        }
        int i17 = hc2.l.h(optString4) ? 4 : 2;
        if (optInt3 == 1) {
            p52.h.f433549a.f(optString4, optString5);
            android.content.Intent intent = new android.content.Intent();
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(optInt2, i17, 104, intent);
            i95.m c17 = i95.n0.c(fe0.l4.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doJumpFinderFeedsDetailUI", "com.tencent.mm.feature.sns.SnsFinderService");
            l44.s4.g(intent, context, optString5, optString2, optString, optString4, -1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpFinderFeedsDetailUI", "com.tencent.mm.feature.sns.SnsFinderService");
            return;
        }
        r45.i33 i33Var = new r45.i33();
        i33Var.set(0, optString);
        i33Var.set(1, optString2);
        i33Var.set(2, extInfo.optString("finderUserName"));
        i33Var.set(3, extInfo.optString("expReportLink"));
        i33Var.set(4, extInfo.optString("clkReportLink"));
        org.json.JSONObject optJSONObject = extInfo.optJSONObject("reportInfo");
        if (optJSONObject == null || (jSONObject = optJSONObject.toString()) == null) {
            jSONObject = new org.json.JSONObject().toString();
        }
        i33Var.set(5, jSONObject);
        org.json.JSONObject optJSONObject2 = extInfo.optJSONObject("clickPosMap");
        if (optJSONObject2 == null || (jSONObject2 = optJSONObject2.toString()) == null) {
            jSONObject2 = new org.json.JSONObject().toString();
        }
        i33Var.set(6, jSONObject2);
        i33Var.set(7, extInfo.optString("feedbackUrl"));
        i33Var.set(9, extInfo.optString("marketingWord", ""));
        i33Var.set(10, java.lang.Integer.valueOf(extInfo.optInt("rewardTime", 15)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "adFlowInfo feedId:" + optString + ", nonceId:" + i33Var.m75945x2fec8307(1) + ", finderUserName:" + i33Var.m75945x2fec8307(2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "adFlowInfo expReportLink:" + i33Var.m75945x2fec8307(3) + ", clkReportLink:" + i33Var.m75945x2fec8307(4) + ", reportInfo:" + i33Var.m75945x2fec8307(5));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "adFlowInfo clickPosMap:" + i33Var.m75945x2fec8307(6) + ", feedbackUrl:" + i33Var.m75945x2fec8307(7) + " marketingWord:" + i33Var.m75945x2fec8307(9));
        p52.h.f433549a.f(optString4, i33Var.m75945x2fec8307(2));
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("KEY_MINI_APP_AD_FLOW_INFO", i33Var.mo14344x5f01b1f6());
        intent2.putExtra("from_user", c01.z1.r());
        intent2.putExtra("feed_encrypted_object_id", optString);
        intent2.putExtra("feed_object_nonceId", optString2);
        intent2.putExtra("key_need_related_list", true);
        intent2.putExtra("key_comment_scene", 104);
        intent2.putExtra("key_reuqest_scene", 23);
        intent2.putExtra("key_session_id", optString3);
        intent2.putExtra("key_extra_info", optString4);
        intent2.putExtra("is_from_ad", true);
        intent2.putExtra("key_disable_personal_center_and_search", true);
        java.lang.String Bj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(optInt2, i17, 104, intent2);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21140, Bj, "", optString, "");
        }
        intent2.putExtra("report_scene", optInt);
        intent2.putExtra("tab_type", 9);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).uk(context, intent2, false);
        w04.l.INSTANCE.b(540999685);
    }

    public void N(android.content.Context context, android.content.Intent intent, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        long longExtra = intent.getLongExtra("feed_object_id", 0L);
        long longExtra2 = intent.getLongExtra("feed_object_nonceId", 0L);
        int intExtra = intent.getIntExtra("key_reuqest_scene", 35);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "openFinderFeedFromTing: objectId=" + longExtra + ", nonceId=" + longExtra2 + ", requestScene=" + intExtra);
        intent.putExtra("feed_object_id", longExtra);
        intent.putExtra("feed_object_nonceId", longExtra2);
        intent.putExtra("report_scene", 19);
        intent.putExtra("tab_type", 302);
        intent.putExtra("key_reuqest_scene", intExtra);
        if (!z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).uk(context, intent, false);
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).getClass();
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13971x624f6336.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderHalfScreenUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderHalfScreenUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void O(int i17, int i18, int i19, android.content.Context context, android.content.Intent intent, android.view.View view, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Jk()) {
            X(i17, i18, i19, context, intent, view, z17);
            return;
        }
        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
        ya2.v0 v0Var = new ya2.v0(i17, i18, i19, context, intent, view, z17);
        ((vd0.j2) q1Var).getClass();
        v24.o0.h(context, 34359738368L, null, v0Var, 3);
    }

    public final void R(android.content.Context context, int i17, boolean z17, int i18, int i19, java.lang.String str, int i27, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int i28;
        java.lang.String str5;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_request_scene", i17);
        intent.putExtra("key_use_dark_style", z17 ? 1 : 0);
        intent.putExtra("key_select_tab_id", i18);
        intent.putExtra("key_select_second_tab_id", i19);
        intent.putExtra("key_by_pass", str);
        intent.putExtra("key_feed_export_id", str2);
        intent.putExtra("key_feed_nonce_id", str3);
        intent.putExtra("key_page_title", str4);
        intent.putExtra("nearby_live_target_auto_refresh_params_key", true);
        intent.putExtra("nearby_live_all_auto_refresh_params_key", true);
        if (i17 != 1) {
            i28 = 9500002;
            if (i17 != 2 && i17 != 3) {
                if (i17 == 4) {
                    i28 = 9500004;
                } else if (i17 == 5) {
                    i28 = 9500003;
                }
            }
        } else {
            i28 = 9500001;
        }
        if (i17 != 1) {
            str5 = "9002";
            if (i17 != 2 && i17 != 3) {
                if (i17 == 4) {
                    str5 = "9004";
                } else if (i17 == 5) {
                    str5 = "9003";
                }
            }
        } else {
            str5 = "9001";
        }
        intent.putExtra("key_from_comment_scene", i28);
        intent.putExtra("key_click_tab_id", str5);
        J(i27, 2, i28, intent);
        ((v40.s) ((uc.n) i95.n0.c(uc.n.class))).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14018x971b0c89.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterFinderLiveOperationUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterFinderLiveOperationUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void S(cl0.g gVar, android.content.Context context, zy2.i5 i5Var, java.lang.String str) {
        java.lang.String mo15083x48bce8a4 = gVar.mo15083x48bce8a4("finderUserName", "");
        java.lang.String mo15083x48bce8a42 = gVar.mo15083x48bce8a4("exportUsername", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15083x48bce8a4);
        if (mo15083x48bce8a4.length() > 0) {
            T(this, gVar, context, i5Var, str, mo15083x48bce8a4, null, null, 96, null);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15083x48bce8a42);
        if (mo15083x48bce8a42.length() > 0) {
            boolean z17 = gVar.optInt("profileEnterActionType") == 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Wf).mo141623x754a37bb()).r()).booleanValue() || z17) {
                new db2.u1(kz5.p0.f395529d, mo15083x48bce8a42).l().K(new ya2.w0(gVar, context, i5Var, str));
            } else {
                T(this, gVar, context, i5Var, str, null, null, mo15083x48bce8a42, 48, null);
            }
        }
    }

    public final void U(cl0.g extInfo, android.content.Context context, zy2.i5 i5Var, zy2.i5 i5Var2) {
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "[openRedPacketEditPage] exit in teen mode");
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int optInt = extInfo.optInt("durationMinLimit");
        int optInt2 = extInfo.optInt("durationMaxLimit");
        java.lang.String mo15082x48bce8a4 = extInfo.mo15082x48bce8a4("encryptedID");
        java.lang.String mo15082x48bce8a42 = extInfo.mo15082x48bce8a4("nonceID");
        qd2.d0.f443250d = i5Var;
        qd2.d0.f443251e = i5Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a42);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a4);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = qd2.d0.f443249c;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context, "", string, true, true, new qd2.c0(context));
        qd2.d0.f443249c = Q;
        if (Q != null) {
            Q.show();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        new db2.g4(0L, mo15082x48bce8a42, 0, 0, "", true, null, null, 0L, null, false, false, mo15082x48bce8a4, nyVar != null ? nyVar.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536858560, null).l().K(new qd2.b0(context, optInt, optInt2));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(cl0.g r17, android.content.Context r18, zy2.i5 r19, zy2.i5 r20) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.e1.V(cl0.g, android.content.Context, zy2.i5, zy2.i5):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(cl0.g r21, android.content.Context r22) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.e1.W(cl0.g, android.content.Context):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0189, code lost:
    
        if (r6.l().G(new ya2.a1(r56, r55)) == null) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X(int r52, int r53, int r54, android.content.Context r55, android.content.Intent r56, android.view.View r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.e1.X(int, int, int, android.content.Context, android.content.Intent, android.view.View, boolean):void");
    }

    public final boolean Y() {
        return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
    }

    public final void j(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, db5.g4 g4Var, int i17, java.lang.CharSequence charSequence, java.lang.String str) {
        g4Var.q(i17, charSequence, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nig), 0, 0);
        k0Var.F = new ya2.s(context, str);
        k0Var.G = new ya2.t(charSequence, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0104 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k(android.content.Context r16, java.lang.String r17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 r18, db5.g4 r19, int r20) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.e1.k(android.content.Context, java.lang.String, com.tencent.mm.ui.widget.dialog.k0, db5.g4, int):boolean");
    }

    public void l(android.content.Context context, java.lang.String username, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "enterChatting anchorUsername=" + username + ", sourceType = " + i17);
        i95.m c17 = i95.n0.c(c61.ub.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.ub.c7((c61.ub) c17, context, username, 1, null, java.lang.Integer.valueOf(i17), null, null, null, 224, null);
    }

    public void m(android.content.Context context, android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (!Y()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).kl(context);
            return;
        }
        s92.g.f486539a.a(context, intent, c01.id.c(), i17);
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17).Bi(context, intent, false);
    }

    public void n(android.content.Context context, r45.ev2 collection, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collection, "collection");
        android.content.Intent intent = new android.content.Intent();
        r45.vx0 vx0Var = new r45.vx0();
        vx0Var.set(0, java.lang.Long.valueOf(collection.m75942xfb822ef2(0)));
        vx0Var.set(1, collection.m75945x2fec8307(1));
        vx0Var.set(2, collection.m75945x2fec8307(2));
        vx0Var.set(3, collection.m75945x2fec8307(3));
        vx0Var.set(4, java.lang.Integer.valueOf(collection.m75939xb282bd08(4)));
        vx0Var.set(21, java.lang.Integer.valueOf(collection.m75939xb282bd08(5)));
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "enterFinderCollectionUI %s", pm0.v.u(collection.m75942xfb822ef2(0)));
        intent.putExtra("collection_info", vx0Var.mo14344x5f01b1f6());
        intent.putExtra("collection_author_username", collection.m75945x2fec8307(8));
        intent.putExtra("collection_nickname", collection.m75945x2fec8307(9));
        intent.putExtra("collection_avatar_url", collection.m75945x2fec8307(10));
        intent.putExtra("collection_authicon_url", collection.m75945x2fec8307(11));
        intent.putExtra("collection_authicon_type", collection.m75939xb282bd08(12));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        intent.putExtra("collection_ref_comment_scene", collection.m75939xb282bd08(13) != 0 ? collection.m75939xb282bd08(13) : V6 != null ? V6.m75939xb282bd08(5) : 0);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13940x9a1c0918.class);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(i17, 2, yc1.a0.f77515x366c91de, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/api/FinderRouterApi", "enterFinderCollectionUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderShareCollection;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/api/FinderRouterApi", "enterFinderCollectionUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderShareCollection;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void o(android.content.Context context, r45.lu2 hotWord, int i17, java.util.List list, int i18, java.lang.String reportInfo) {
        android.app.Activity Ui;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hotWord, "hotWord");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfo, "reportInfo");
        if (!(context instanceof android.app.Activity) && (Ui = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Ui()) != null) {
            context = Ui;
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String m75945x2fec8307 = hotWord.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        intent.putExtra("key_search_query", m75945x2fec8307);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = hotWord.m75934xbce7f2f(4);
        intent.putExtra("key_search_session_buffer", m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
        intent.putExtra("key_search_hot_word_info", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14955x327ee410.f36128x681a0c0c.a(hotWord, i17, list));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).wj(context, null, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(android.content.Context r22, java.lang.String r23, boolean r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.e1.p(android.content.Context, java.lang.String, boolean, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[Catch: Exception -> 0x0202, TRY_LEAVE, TryCatch #0 {Exception -> 0x0202, blocks: (B:3:0x0013, B:5:0x002c, B:7:0x003a, B:10:0x004a, B:12:0x0053, B:18:0x0062, B:22:0x0075, B:23:0x0079, B:25:0x008b, B:28:0x0095, B:30:0x00d4, B:31:0x00da, B:34:0x00fb, B:38:0x012e, B:41:0x0153, B:44:0x015d, B:48:0x01c9, B:51:0x01e9, B:54:0x01fc), top: B:2:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(android.content.Context r17, java.lang.String r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.e1.q(android.content.Context, java.lang.String, boolean):void");
    }

    public void r(android.content.Context context, java.lang.String str) {
        android.content.Context context2 = context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        r45.f03 I0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("FinderLiveIncomeEntrance");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("FinderLiveIncomeEntrance");
        if (I0 != null && L0 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.i(x2Var, "4", L0, I0, 2, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("FinderLiveIncomeEntrance");
        if (!(context2 instanceof android.app.Activity)) {
            context2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184144a.b();
        }
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Kj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, context2, 0L, false, 2L, 9L, false, 0L, null, null, 384, null);
        db2.x0 x0Var = new db2.x0(xy2.c.e(context2));
        az2.j.u(x0Var, context2, null, 0L, 6, null);
        pm0.v.T(x0Var.l(), new ya2.m0(context2));
    }

    public void s(android.content.Context context, java.lang.String noticeId, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) h0Var2.f391656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h0Var2.f391656d = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, 3, new ya2.x(h0Var));
        db2.b1 b1Var = new db2.b1(noticeId, null, username, 0, null, null, null, null, 0, null, null, 2042, null);
        b1Var.l().K(new ya2.w(noticeId, username, context, h0Var2));
        h0Var.f391656d = b1Var;
    }

    public void t(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).getClass();
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.H7).mo141623x754a37bb()).r()).intValue() != 1) {
            boolean z17 = context instanceof android.app.Activity;
            android.content.Intent intent3 = !z17 ? intent2 : null;
            if (intent3 != null) {
                intent3.addFlags(268435456);
            }
            intent2.setClass(context, ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.V2).mo141623x754a37bb()).r()).intValue() == 1 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13972x46a29987.class : ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.W2).mo141623x754a37bb()).r()).intValue() == 1 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13971x624f6336.class : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14060x9edd984c.class);
            if (intent2.getBooleanExtra("key_enter_content_by_red_dot", false) && z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(16);
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.k((android.app.Activity) context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLongVideoShareUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLongVideoShareUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLongVideoShareUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        java.lang.String stringExtra = intent2.getStringExtra("key_context_id");
        java.lang.String stringExtra2 = intent2.getStringExtra("from_user");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        java.lang.String stringExtra3 = intent2.getStringExtra("key_session_id");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        long longExtra = intent2.getLongExtra("feed_object_id", 0L);
        java.lang.String stringExtra4 = intent2.getStringExtra("feed_encrypted_object_id");
        java.lang.String str = stringExtra4 != null ? stringExtra4 : "";
        java.lang.String stringExtra5 = intent2.getStringExtra("feed_object_nonceId");
        int intExtra = intent2.getIntExtra("key_comment_scene", 162);
        int intExtra2 = intent2.getIntExtra("key_reuqest_scene", 31);
        java.lang.String stringExtra6 = intent2.getStringExtra("key_firstFeedSessionBuffer");
        long longExtra2 = intent2.getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", 0L);
        int i17 = qg3.g1.f444353d;
        java.lang.String m169879x21b8cb32 = p3380x6a61f93.p3383xf5152754.C30552x21b30f7a.m169879x21b8cb32();
        java.lang.String u17 = pm0.v.u(longExtra);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoJumpRouter", "jumpPlayerDetailUI contextId=" + stringExtra + ", feedId=" + u17 + ", encryptedObjectId=" + str + ", nonceId=" + stringExtra5 + ", commentScene=" + intExtra + ", fromUserName=" + stringExtra2 + "，requestScene=" + intExtra2);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        android.os.Bundle extras = intent2.getExtras();
        if (extras == null) {
            extras = new android.os.Bundle();
        }
        h0Var.f391656d = extras;
        bw5.id0 id0Var = new bw5.id0();
        id0Var.f(m169879x21b8cb32);
        id0Var.g((int) longExtra2);
        id0Var.d(intExtra);
        id0Var.f110076h = intExtra2;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        android.util.ArrayMap arrayMap = id0Var.f110091z;
        arrayMap.put(50, bool);
        id0Var.f110077i = stringExtra3;
        arrayMap.put(51, bool);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(longExtra);
        if (h17 != null && h17.m59347x965c8f17()) {
            bw5.zc0 zc0Var = new bw5.zc0();
            zc0Var.d(new bw5.yr().mo11468x92b714fd(h17.getFeedObject().mo14344x5f01b1f6()));
            id0Var.e(zc0Var);
        } else {
            bw5.ad0 ad0Var = new bw5.ad0();
            ad0Var.f106671d = u17;
            boolean[] zArr = ad0Var.f106675h;
            zArr[1] = true;
            ad0Var.f106672e = stringExtra5;
            zArr[2] = true;
            ad0Var.f106674g = str;
            zArr[4] = true;
            ad0Var.f106673f = stringExtra6;
            zArr[3] = true;
            id0Var.f110081p = ad0Var;
            arrayMap.put(102, bool);
        }
        byte[] mo14344x5f01b1f6 = id0Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        linkedHashMap.put("open_params", mo14344x5f01b1f6);
        d75.b.g(new c03.j(context, linkedHashMap, h0Var, h17, stringExtra));
    }

    public void u(android.content.Context context, r45.ev2 collection, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collection, "collection");
        r45.do2 do2Var = new r45.do2();
        do2Var.set(2, java.lang.Integer.valueOf(collection.m75939xb282bd08(6)));
        if (collection.m75939xb282bd08(6) == 1) {
            r45.uz0 uz0Var = new r45.uz0();
            uz0Var.set(0, java.lang.Long.valueOf(collection.m75942xfb822ef2(0)));
            uz0Var.set(1, collection.m75945x2fec8307(1));
            uz0Var.set(2, collection.m75945x2fec8307(2));
            uz0Var.set(3, collection.m75945x2fec8307(3));
            uz0Var.set(4, java.lang.Integer.valueOf(collection.m75939xb282bd08(4)));
            uz0Var.set(10, java.lang.Integer.valueOf(collection.m75939xb282bd08(7)));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
            c19782x23db1cfa.m76240x66bc2758(collection.m75945x2fec8307(8));
            uz0Var.set(11, c19782x23db1cfa);
            do2Var.set(0, uz0Var);
        } else {
            r45.n11 n11Var = new r45.n11();
            n11Var.set(0, java.lang.Long.valueOf(collection.m75942xfb822ef2(0)));
            n11Var.set(1, collection.m75945x2fec8307(1));
            n11Var.set(2, collection.m75945x2fec8307(2));
            n11Var.set(3, collection.m75945x2fec8307(3));
            n11Var.set(4, java.lang.Integer.valueOf(collection.m75939xb282bd08(4)));
            n11Var.set(10, java.lang.Integer.valueOf(collection.m75939xb282bd08(7)));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
            c19782x23db1cfa2.m76240x66bc2758(collection.m75945x2fec8307(8));
            n11Var.set(11, c19782x23db1cfa2);
            do2Var.set(1, n11Var);
        }
        nr2.m mVar = new nr2.m(do2Var);
        android.content.Intent intent = new android.content.Intent();
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "enterFinderPayCourseUI %s", pm0.v.u(mVar.l()));
        intent.putExtra("paid_collection_topic_id", mVar.l());
        intent.putExtra("paid_collection_info", mVar.f420801d.mo14344x5f01b1f6());
        intent.putExtra("paid_collection_username", collection.m75945x2fec8307(8));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        intent.putExtra("collection_ref_comment_scene", collection.m75939xb282bd08(13) != 0 ? collection.m75939xb282bd08(13) : V6 != null ? V6.m75939xb282bd08(5) : 0);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14061xec7cb04.class);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(i17, 2, 344, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/api/FinderRouterApi", "enterFinderPaidCollectionUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderShareCollection;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/api/FinderRouterApi", "enterFinderPaidCollectionUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderShareCollection;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01c9 A[Catch: all -> 0x02a4, TRY_ENTER, TryCatch #0 {all -> 0x02a4, blocks: (B:13:0x01c9, B:16:0x01d5, B:18:0x0286, B:19:0x028c, B:69:0x029d), top: B:11:0x01c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02cc A[Catch: all -> 0x036e, TryCatch #3 {all -> 0x036e, blocks: (B:24:0x02b0, B:26:0x02cc, B:27:0x02fe, B:29:0x030b, B:30:0x0311, B:32:0x0332, B:34:0x034b, B:35:0x0353, B:37:0x0358, B:38:0x035e), top: B:23:0x02b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x030b A[Catch: all -> 0x036e, TryCatch #3 {all -> 0x036e, blocks: (B:24:0x02b0, B:26:0x02cc, B:27:0x02fe, B:29:0x030b, B:30:0x0311, B:32:0x0332, B:34:0x034b, B:35:0x0353, B:37:0x0358, B:38:0x035e), top: B:23:0x02b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0332 A[Catch: all -> 0x036e, TryCatch #3 {all -> 0x036e, blocks: (B:24:0x02b0, B:26:0x02cc, B:27:0x02fe, B:29:0x030b, B:30:0x0311, B:32:0x0332, B:34:0x034b, B:35:0x0353, B:37:0x0358, B:38:0x035e), top: B:23:0x02b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x029d A[Catch: all -> 0x02a4, TRY_LEAVE, TryCatch #0 {all -> 0x02a4, blocks: (B:13:0x01c9, B:16:0x01d5, B:18:0x0286, B:19:0x028c, B:69:0x029d), top: B:11:0x01c7 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(android.content.Context r22, java.lang.String r23, int r24, zy2.s9 r25) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.e1.v(android.content.Context, java.lang.String, int, zy2.s9):void");
    }

    public void w(android.content.Context context, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String stringExtra;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("key_extra_info") : null;
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("key_is_in_finder", false) : false;
        int intExtra = intent != null ? intent.getIntExtra("key_entry_type", 0) : 0;
        if (booleanExtra && intExtra == 6) {
            java.lang.String Yj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Yj();
            if (!(Yj == null || Yj.length() == 0) && intent != null) {
                intent.putExtra("key_context_id", Yj);
            }
        }
        c50.c1 c1Var = (c50.c1) i95.n0.c(c50.c1.class);
        java.lang.String str3 = "";
        java.lang.String str4 = stringExtra2 == null ? "" : stringExtra2;
        ml2.r0 r0Var = (ml2.r0) c1Var;
        r0Var.getClass();
        r0Var.H1 = str4;
        java.lang.String stringExtra3 = intent != null ? intent.getStringExtra("key_biz_username") : null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("null", stringExtra3)) {
            android.content.Intent intent2 = new android.content.Intent();
            if (!(context instanceof android.app.Activity)) {
                intent2.addFlags(268435456);
            }
            intent2.putExtra("Contact_User", stringExtra3);
            intent2.putExtra("Contact_Scene", 213);
            intent2.putExtra("biz_profile_enter_from_finder", true);
            intent2.putExtra("force_get_contact", true);
            intent2.putExtra("key_use_new_contact_profile", true);
            intent2.putExtra("biz_profile_tab_type", 1);
            j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent2, null);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.X0;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).booleanValue()) {
            if (intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileUtils", "initRefCommentScene: intent is null, skip");
            } else {
                int intExtra2 = intent.getIntExtra("key_from_comment_scene", 0);
                if (intExtra2 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileUtils", "initRefCommentScene: already set=" + intExtra2 + ", skip");
                } else {
                    int intExtra3 = intent.getIntExtra("key_enter_profile_type", -1);
                    int i18 = 23;
                    if (intExtra3 != 1) {
                        if (intExtra3 == 4) {
                            i18 = 11;
                        } else if (intExtra3 == 8) {
                            i18 = 37;
                        } else if (intExtra3 != 63) {
                            if (intExtra3 != 12) {
                                if (intExtra3 == 13) {
                                    i18 = 33;
                                } else if (intExtra3 != 23 && intExtra3 != 24) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileUtils", "initRefCommentScene: unhandled enterProfileType=" + intExtra3 + ", skip");
                                }
                            }
                            i18 = 120;
                        } else {
                            i18 = 386;
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileUtils", "initRefCommentScene: enterProfileType=" + intExtra3 + " -> refCommentScene=" + i18);
                    intent.putExtra("key_from_comment_scene", i18);
                }
            }
        }
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).booleanValue()) {
            if (intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileUtils", "initEnterScene: intent is null, skip");
            } else {
                int intExtra4 = intent.getIntExtra("key_enter_scene", 0);
                if (intExtra4 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileUtils", "initEnterScene: already set=" + intExtra4 + ", skip");
                } else {
                    int intExtra5 = intent.getIntExtra("key_enter_profile_type", -1);
                    if (intExtra5 == 1) {
                        i17 = 6;
                    } else if (intExtra5 != 4) {
                        int i19 = 52;
                        if (intExtra5 != 52) {
                            if (intExtra5 != 63) {
                                if (intExtra5 != 12) {
                                    i19 = 13;
                                    if (intExtra5 != 13) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileUtils", "initEnterScene: unhandled enterProfileType=" + intExtra5 + ", skip");
                                    }
                                } else {
                                    i17 = 5;
                                }
                            }
                            i17 = i19;
                        } else {
                            i17 = 10;
                        }
                    } else {
                        i17 = 45;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileUtils", "initEnterScene: enterProfileType=" + intExtra5 + " -> enterScene=" + i17);
                    intent.putExtra("key_enter_scene", i17);
                }
            }
        }
        if (intent == null || (str = intent.getStringExtra("finder_username")) == null) {
            str = "";
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(context, intent);
            w04.l.INSTANCE.b(540999686);
            return;
        }
        p52.h.f433549a.f(stringExtra2, str);
        if (intent == null || (str2 = intent.getStringExtra("key_finder_object_Id")) == null) {
            str2 = "0";
        }
        long Z = pm0.v.Z(str2);
        if (intent != null && (stringExtra = intent.getStringExtra("key_finder_object_nonce_id_key")) != null) {
            str3 = stringExtra;
        }
        int intExtra6 = intent != null ? intent.getIntExtra("share_enter_scene", 25) : 25;
        if (Z == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderRouterApi", "enterFinderProfileUI username & objectId invalid");
        } else {
            pm0.v.K(null, new ya2.a0(Z, str3, intExtra6, intent, context));
        }
    }

    public void x(android.content.Context context, android.content.Intent intent, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.lang.String stringExtra = intent.getStringExtra("key_biz_username");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("null", stringExtra)) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_User", stringExtra);
            intent2.putExtra("Contact_Scene", 213);
            intent2.putExtra("biz_profile_enter_from_finder", true);
            intent2.putExtra("force_get_contact", true);
            intent2.putExtra("key_use_new_contact_profile", true);
            intent2.putExtra("biz_profile_tab_type", 1);
            j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent2, null);
            return;
        }
        java.lang.String e17 = xy2.c.e(context);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
            intent.putExtra("finder_username", e17);
            intent.putExtra("KEY_FINDER_SELF_FLAG", true);
            J(i17, i18, 33, intent);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).mk(context, intent);
            return;
        }
        if (context instanceof android.app.Activity) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("key_create_scene", 6);
            intent3.putExtra("key_router_to_profile", false);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).qj(context, intent3);
        }
    }

    public void y() {
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        if (b6Var != null) {
            android.content.Context ll6 = ((c61.l7) b6Var).ll();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13930xdbd6d612.f190731g;
            java.lang.String e17 = xy2.c.e(ll6);
            m92.b j37 = g92.a.j3(g92.b.f351302e, e17, false, 2, null);
            r45.d1 d1Var = j37 != null ? (r45.d1) j37.u0().m75936x14adae67(9) : null;
            boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13930xdbd6d612.f190732h;
            if (!z17 && d1Var != null) {
                fVar.a(ll6, e17, d1Var);
                return;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountManagementUI", "openFromJsApi invalidate data");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13930xdbd6d612.f190732h = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountManagementUI", "openFromJsApi config" + d1Var + ", flag" + z17 + ", wait for prepare");
            p3325xe03a0797.p3326xc267989b.l.d(((c61.l7) i95.n0.c(c61.l7.class)).U, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.e(e17, null), 3, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c1, code lost:
    
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) r4).Di((android.app.Activity) r10) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(android.content.Context r10, android.content.Intent r11, int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.e1.z(android.content.Context, android.content.Intent, int, boolean):void");
    }
}
