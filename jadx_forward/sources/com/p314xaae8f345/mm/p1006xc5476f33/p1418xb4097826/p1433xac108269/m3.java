package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m3 f183914a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m3();

    public final void a(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 k8Var, int i17, int i18, boolean z17, int i19) {
        java.lang.String m59299x6bf53a6c;
        java.lang.Class cls;
        int i27;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar;
        boolean z18;
        r45.qt2 qt2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        boolean z19;
        java.lang.String str2;
        int i28;
        r45.vx0 vx0Var;
        java.lang.String str3;
        java.lang.Class cls2;
        java.lang.String m76829x97edf6c0;
        java.lang.String str4;
        java.lang.String str5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52;
        java.lang.String X6;
        java.lang.String str6;
        java.lang.String str7;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f204176d;
        android.content.Intent intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        r45.xk m59211x37f6d02b = item.getFeedObject().m59211x37f6d02b();
        boolean z27 = m59211x37f6d02b != null;
        if (!z27) {
            m59299x6bf53a6c = item.getFeedObject().m59299x6bf53a6c();
        } else if (m59211x37f6d02b == null || (m59299x6bf53a6c = m59211x37f6d02b.m75945x2fec8307(0)) == null) {
            m59299x6bf53a6c = "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m59299x6bf53a6c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileUtils", "isBizProfile: " + z27);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        if (z27) {
            if (m59299x6bf53a6c.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderProfileUtils", "jumpBizProfile: biz username is null");
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar2, context, intent2, item.mo2128x1ed62e84(), null, 0, 1, false, 0, item.w(), 192, null);
            intent2.putExtra("Contact_User", m59299x6bf53a6c);
            intent2.putExtra("Contact_Scene", 213);
            intent2.putExtra("biz_profile_enter_from_finder", true);
            intent2.putExtra("force_get_contact", true);
            intent2.putExtra("key_use_new_contact_profile", true);
            intent2.putExtra("finder_feed_id", item.mo2128x1ed62e84());
            intent2.putExtra("biz_profile_tab_type", 1);
            java.lang.String m76829x97edf6c02 = item.getFeedObject().getFeedObject().m76829x97edf6c0();
            boolean z28 = m76829x97edf6c02 == null || m76829x97edf6c02.length() == 0;
            android.content.Context context2 = holder.f374654e;
            if (z28) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                str3 = "context";
                long mo2128x1ed62e84 = item.mo2128x1ed62e84();
                java.lang.String w17 = item.w();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                cls2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4.class;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar2.e(context2);
                m76829x97edf6c0 = o3Var.ek(mo2128x1ed62e84, w17, e17 != null ? e17.f216913n : 0);
            } else {
                str3 = "context";
                cls2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4.class;
                m76829x97edf6c0 = item.getFeedObject().getFeedObject().m76829x97edf6c0();
            }
            intent2.putExtra("Contact_Scene_Note", m76829x97edf6c0);
            intent2.putExtra("finder_from_feed_id", item.getFeedObject().m59251x5db1b11());
            intent2.putExtra("finder_from_feed_dup_flag", item.getFeedObject().m59229xb5af1dd5());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar2.e(context2);
            intent2.putExtra("finder_from_feed_comment_scene", e18 != null ? e18.f216913n : 0);
            intent2.putExtra("finder_from_feed_type", item.getFeedObject().m59311x25315bf4() ? 1 : 2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar2.e(context2);
            r45.qt2 V6 = e19 != null ? e19.V6() : null;
            if ((k8Var == null || (f204176d = k8Var.getF204176d()) == null || (intent = f204176d.getIntent()) == null || !intent.getBooleanExtra("is_from_ad", false)) ? false : true) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e27 = iyVar2.e(context2);
                if (e27 != null && (X6 = e27.X6()) != null) {
                    try {
                        java.lang.String optString = new org.json.JSONObject(X6).optString("sns_ad");
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("adReportInfo", optString);
                            jSONObject.put("commentscene", V6 != null ? V6.m75939xb282bd08(5) : 0);
                            if (V6 == null || (str6 = V6.m75945x2fec8307(2)) == null) {
                                str6 = "";
                            }
                            jSONObject.put("clicktabcontextid", str6);
                            if (V6 == null || (str7 = V6.m75945x2fec8307(1)) == null) {
                                str7 = "";
                            }
                            jSONObject.put("findercontextid", str7);
                            jSONObject.put("feedid", pm0.v.u(item.mo2128x1ed62e84()));
                            java.lang.String jSONObject2 = jSONObject.toString();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                            intent2.putExtra("Contact_Finder_Buffer", r26.i0.t(jSONObject2, ",", ";", false));
                        }
                    } catch (java.lang.Exception unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderProfileUtils", "jumpBizProfile parse ad info");
                    }
                }
            } else {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("commentscene", V6 != null ? V6.m75939xb282bd08(5) : 0);
                if (V6 == null || (str4 = V6.m75945x2fec8307(2)) == null) {
                    str4 = "";
                }
                jSONObject3.put("clicktabcontextid", str4);
                if (V6 == null || (str5 = V6.m75945x2fec8307(1)) == null) {
                    str5 = "";
                }
                jSONObject3.put("findercontextid", str5);
                jSONObject3.put("feedid", pm0.v.u(item.mo2128x1ed62e84()));
                java.lang.String jSONObject4 = jSONObject3.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
                intent2.putExtra("Contact_Finder_Buffer", r26.i0.t(jSONObject4, ",", ";", false));
            }
            if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.F0().r()).intValue() == 1) {
                uh4.c0 c0Var = (uh4.c0) i95.n0.c(uh4.c0.class);
                boolean mo168058x74219ae7 = c0Var != null ? c0Var.mo168058x74219ae7() : false;
                boolean z29 = ((context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6) || (context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15075xf41a1c3c) || (context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15048xbc5a5f5e)) ? false : true;
                if (mo168058x74219ae7 && !z29) {
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context2);
                } else if (context2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4 a4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4) zVar.a(activityC0065xcd7aa112).a(cls2);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = k8Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) k8Var : null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = pzVar != null ? pzVar.f190289h : null;
                    a4Var.getClass();
                    android.app.Activity m80379x76847179 = a4Var.m80379x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m80379x76847179, str3);
                    if (!(m80379x76847179 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) m80379x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                    com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a P6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha.P6((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha) a17, 6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4.Z6(a4Var, abstractC15124x7bae6180, item, holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k2.f216446d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.l2.f216548d, false, 32, null), null, 4, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s4 s4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s4) zVar.a(activityC0065xcd7aa112).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s4.class);
                    if (s4Var != null) {
                        s4Var.Q6((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2, intent2, P6, i18);
                    }
                }
            } else {
                j45.l.j(context2, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent2, null);
            }
            if (context2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                abstractC14490x69736cb52 = item;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.U.c((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2, abstractC14490x69736cb52, i19 == 2);
            } else {
                abstractC14490x69736cb52 = item;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Sk(abstractC14490x69736cb52, V6);
            return;
        }
        android.content.Context context3 = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e28 = iyVar2.e(context3);
        if (e28 != null) {
            i27 = e28.f216913n;
            cls = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha.class;
        } else {
            cls = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha.class;
            i27 = 0;
        }
        android.content.Intent intent3 = new android.content.Intent();
        android.content.Context context4 = holder.f374654e;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context4 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context4 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            intent3.putExtra("key_to_user_name", abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("key_to_user_name"));
            intent3.putExtra("from_user", abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("from_user"));
            intent3.putExtra("key_from_user_name", abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("key_from_user_name"));
            intent3.putExtra("report_scene", abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("report_scene", 0));
        }
        intent3.putExtra("finder_username", item.getFeedObject().m59299x6bf53a6c());
        intent3.putExtra("finder_read_feed_id", item.getFeedObject().m59251x5db1b11());
        intent3.putExtra("finder_read_feed_dup_flag", item.w());
        intent3.putExtra("finder_from_feed_id", item.getFeedObject().m59251x5db1b11());
        intent3.putExtra("finder_from_feed_dup_flag", item.w());
        intent3.putExtra("finder_from_feed_comment_scene", i27);
        intent3.putExtra("finder_from_feed_type", item.getFeedObject().m59311x25315bf4() ? 1 : 2);
        r45.dm2 m76806xdef68064 = item.getFeedObject().getFeedObject().m76806xdef68064();
        intent3.putExtra("key_finder_collection_id", (m76806xdef68064 == null || (vx0Var = (r45.vx0) m76806xdef68064.m75936x14adae67(0)) == null) ? null : java.lang.Long.valueOf(vx0Var.m75942xfb822ef2(0)));
        android.content.Context context5 = holder.f374654e;
        if (!(context5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6) && !(context5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15075xf41a1c3c) && !(context5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15048xbc5a5f5e)) {
            intent3.putExtra("KEY_FROM_TIMELINE", true);
        }
        intent3.putExtra("key_entrance_type", i17);
        intent3.putExtra("key_click_avatar_type", i19);
        intent3.putExtra("key_if_living", z17);
        if (item.getFeedObject().m59311x25315bf4()) {
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            jSONObject5.put("live_feedid", pm0.v.u(item.getFeedObject().getFeedObject().m76784x5db1b11()));
            r45.nw1 m76794xd0557130 = item.getFeedObject().getFeedObject().m76794xd0557130();
            jSONObject5.put("liveid", pm0.v.u(m76794xd0557130 != null ? m76794xd0557130.m75942xfb822ef2(0) : 0L));
            intent3.putExtra("key_aditional_client_udf_kv", jSONObject5.toString());
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            str = "finder_from_feed_type";
            jSONObject6.put("feedid", pm0.v.u(item.getFeedObject().getFeedObject().m76784x5db1b11()));
            r45.nw1 m76794xd05571302 = item.getFeedObject().getFeedObject().m76794xd0557130();
            jSONObject6.put("liveid", pm0.v.u(m76794xd05571302 != null ? m76794xd05571302.m75942xfb822ef2(0) : 0L));
            jSONObject6.put("panel_sence", "5");
            intent3.putExtra("key_aditional_client_udf_kv", jSONObject6.toString());
        } else {
            str = "finder_from_feed_type";
        }
        android.content.Context context6 = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context6, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar2, context6, intent3, item.mo2128x1ed62e84(), null, 0, 1, false, 0, null, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).tj(item, holder.m8183xf806b362(), java.lang.String.valueOf(i27));
        pf5.u uVar = pf5.u.f435469a;
        android.content.Context context7 = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context7, "getContext(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) ((zy2.v9) uVar.b(context7).c(zy2.v9.class))).S6(item.mo2128x1ed62e84(), intent3);
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.F0().r()).intValue() == 1) {
            android.content.Context context8 = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context8, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context8 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context8).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            int i29 = nyVar != null ? nyVar.f216913n : 0;
            boolean z37 = (i29 == 1 && item.getFeedObject().m59211x37f6d02b() == null) || i29 == 8 || i29 == 120;
            uh4.c0 c0Var2 = (uh4.c0) i95.n0.c(uh4.c0.class);
            boolean mo168058x74219ae72 = c0Var2 != null ? c0Var2.mo168058x74219ae7() : false;
            boolean booleanExtra = intent3.getBooleanExtra("KEY_FROM_TIMELINE", false);
            if (!mo168058x74219ae72 || booleanExtra) {
                java.lang.String m59299x6bf53a6c2 = item.getFeedObject().m59299x6bf53a6c();
                android.content.Context context9 = holder.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context9, "getContext(...)");
                if (uVar.b(context9).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b.class) != null) {
                    ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g3(m59299x6bf53a6c2, item));
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    long m59251x5db1b11 = z37 ? 0L : item.getFeedObject().m59251x5db1b11();
                    java.io.Serializable w18 = z37 ? 0L : item.w();
                    intent3.putExtra("finder_read_feed_id", m59251x5db1b11);
                    intent3.putExtra("finder_read_feed_dup_flag", w18);
                    intent3.putExtra("finder_from_feed_id", item.getFeedObject().m59251x5db1b11());
                    intent3.putExtra("finder_from_feed_dup_flag", item.w());
                    intent3.putExtra("finder_from_feed_comment_scene", i29);
                    if (item.getFeedObject().m59311x25315bf4()) {
                        str2 = str;
                        i28 = 1;
                    } else {
                        str2 = str;
                        i28 = 2;
                    }
                    intent3.putExtra(str2, i28);
                    intent3.putExtra("key_profile_from_hard_ad", hc2.o0.E(item.getFeedObject().getFeedObject(), false, 1, null));
                    if (i29 == 212) {
                        intent3.putExtra("key_newlife_comment_scene", i29);
                    }
                    android.content.Context context10 = holder.f374654e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context10, "getContext(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b c15471x9d199e5b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b) uVar.b(context10).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b.class);
                    android.content.Context context11 = holder.f374654e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context11, "getContext(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4 a4Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4) uVar.b(context11).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4.class);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar2 = k8Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) k8Var : null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae61802 = pzVar2 != null ? pzVar2.f190289h : null;
                    a4Var2.getClass();
                    java.lang.Class cls3 = cls;
                    iyVar = iyVar2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4.Z6(a4Var2, abstractC15124x7bae61802, item, holder, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n3(c15471x9d199e5b), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o3(c15471x9d199e5b), false, 32, null);
                    if (c15471x9d199e5b != null) {
                        android.app.Activity context12 = a4Var2.m80379x76847179();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context12, "context");
                        pf5.z zVar2 = pf5.z.f435481a;
                        if (!(context12 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha haVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context12).a(cls3);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p3 p3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p3(c15471x9d199e5b);
                        haVar.getClass();
                        qt2Var = null;
                        c15471x9d199e5b.f215162q.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fa(haVar, 5, p3Var, null));
                    } else {
                        qt2Var = null;
                    }
                    android.content.Context context13 = holder.f374654e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context13, "getContext(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b c15471x9d199e5b2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b) uVar.b(context13).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b.class);
                    z18 = false;
                    if (c15471x9d199e5b2 != null) {
                        c15471x9d199e5b2.Q6(intent3, 0);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileUtils", "profile updateData COST: " + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + "ms");
                }
            } else {
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(holder.f374654e);
            }
            iyVar = iyVar2;
            z18 = false;
            qt2Var = null;
        } else {
            iyVar = iyVar2;
            z18 = false;
            qt2Var = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.content.Context context14 = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context14, "getContext(...)");
            i0Var.mk(context14, intent3);
        }
        if (holder.f374654e instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Ni(holder, item.mo2128x1ed62e84(), item.getFeedObject());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.t8 t8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.U;
            android.content.Context context15 = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context15, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context15;
            if (i19 == 2) {
                abstractC14490x69736cb5 = item;
                z19 = true;
            } else {
                z19 = z18;
                abstractC14490x69736cb5 = item;
            }
            t8Var.c(abstractActivityC21394xb3d2c0cf2, abstractC14490x69736cb5, z19);
        } else {
            abstractC14490x69736cb5 = item;
        }
        android.content.Context context16 = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context16, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e29 = iyVar.e(context16);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Sk(abstractC14490x69736cb5, e29 != null ? e29.V6() : qt2Var);
    }

    public final gx2.q b(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, android.content.Intent intent, android.view.ViewGroup attachRoot, boolean z17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attachRoot, "attachRoot");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(activity);
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(com.p314xaae8f345.mm.R.id.g3v);
        frameLayout.setBackgroundColor(activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 b17 = lk5.q0.b("com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI", intent, false, 4, null);
        float k17 = (i65.a.k(activity) + com.p314xaae8f345.mm.ui.bk.p(activity)) * kx2.a.f394811a.a(activity);
        gx2.a aVar2 = new gx2.a();
        aVar2.f358870c = k17;
        aVar2.f358871d = new hx2.g(activity, 0, 0, 0, false, false, 62, null);
        aVar2.f358872e = new hx2.c(frameLayout);
        aVar2.f358873f = new hx2.b(activity, z17);
        gx2.q b18 = aVar2.b(attachRoot);
        b18.m132485xe3fdb34(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h3(b17, attachRoot, b18));
        intent.putExtra("key_is_auto_report", false);
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = activity.mo7595x9cdc264().m7630xb2c12e75();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
        frameLayout.removeAllViews();
        b17.m7571x41119ed3(false);
        b17.q0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k3(frameLayout, b18, aVar));
        b18.m132474x77f391b9(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l3(b17));
        m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.g3v, b17, null);
        m7630xb2c12e75.f();
        return b18;
    }
}
