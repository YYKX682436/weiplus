package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f211027a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f211028b;

    /* renamed from: c, reason: collision with root package name */
    public r45.zq2 f211029c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f211030d;

    /* renamed from: e, reason: collision with root package name */
    public az2.f f211031e;

    /* renamed from: f, reason: collision with root package name */
    public r45.d1 f211032f;

    /* renamed from: g, reason: collision with root package name */
    public final zy2.gc f211033g;

    /* renamed from: h, reason: collision with root package name */
    public final zy2.gc f211034h;

    /* renamed from: i, reason: collision with root package name */
    public final zy2.gc f211035i;

    /* renamed from: j, reason: collision with root package name */
    public final zy2.gc f211036j;

    public m2(android.app.Activity context, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r preferenceScreen) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preferenceScreen, "preferenceScreen");
        this.f211027a = context;
        this.f211028b = preferenceScreen;
        this.f211030d = "";
        this.f211033g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.k2(this);
        this.f211034h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.l2(this);
        this.f211035i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.j2(this);
        this.f211036j = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.i2(this);
    }

    public final java.lang.String a(java.lang.Integer num) {
        android.app.Activity activity = this.f211027a;
        if (num != null && num.intValue() == 3) {
            java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mhs);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
            java.lang.String string2 = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lth);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            return string2;
        }
        if (hc2.s.b()) {
            java.lang.String string3 = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ltk);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
            return string3;
        }
        java.lang.String string4 = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ltj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string4);
        return string4;
    }

    public final void b() {
        boolean g17 = hc2.s.g();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = this.f211028b;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("checkbox_preference_send_comment_and_bullet");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15508xee803e97 c15508xee803e97 = h17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15508xee803e97 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15508xee803e97) h17 : null;
        if (c15508xee803e97 != null) {
            m92.b j37 = g92.a.j3(g92.b.f351302e, this.f211030d, false, 2, null);
            g(g17, j37 != null ? java.lang.Integer.valueOf(j37.u0().m75939xb282bd08(48)) : null, c15508xee803e97);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h18 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("checkbox_preference_say_hi");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15508xee803e97 c15508xee803e972 = h18 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15508xee803e97 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15508xee803e97) h18 : null;
        if (c15508xee803e972 != null) {
            m92.b j38 = g92.a.j3(g92.b.f351302e, this.f211030d, false, 2, null);
            g(g17, j38 != null ? java.lang.Integer.valueOf(j38.u0().m75939xb282bd08(49)) : null, c15508xee803e972);
        }
    }

    public final void c() {
        android.app.Activity activity = this.f211027a;
        android.content.Intent intent = activity.getIntent();
        java.lang.String stringExtra = intent.getStringExtra("finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f211030d = stringExtra;
        if (stringExtra.length() == 0) {
            this.f211030d = xy2.c.e(activity);
        }
        r45.zq2 zq2Var = new r45.zq2();
        byte[] byteArrayExtra = intent.getByteArrayExtra("privacy_settings");
        if (byteArrayExtra != null) {
            try {
                zq2Var.mo11468x92b714fd(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
            this.f211029c = zq2Var;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = this.f211028b;
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).m("settings_show_my_finder", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).m("checkbox_preference_one", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).m("settings_recommend_info", true);
        }
        zq2Var = null;
        this.f211029c = zq2Var;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar2 = this.f211028b;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).m("settings_show_my_finder", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).m("checkbox_preference_one", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).m("settings_recommend_info", true);
    }

    public final void d(int i17, int i18, android.content.Intent intent) {
        int i19;
        if (intent == null || i18 != -1) {
            return;
        }
        if (i17 != 10) {
            if (i17 != 11) {
                return;
            }
            int intExtra = intent.getIntExtra("key_output_interact", 2);
            int intExtra2 = intent.getIntExtra("key_interact_scene", 0);
            f();
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.s0.f361623e.s(intExtra, intExtra2, this.f211036j, this.f211030d);
            return;
        }
        int intExtra3 = intent.getIntExtra("Ktag_range_index", 0);
        r45.pk2 pk2Var = new r45.pk2();
        if (intExtra3 == 0) {
            pk2Var.set(0, 0);
            i19 = 2;
        } else if (intExtra3 != 1) {
            if (intExtra3 == 3) {
                boolean booleanExtra = intent.getBooleanExtra("Kexclude_all_friends", false);
                java.lang.String stringExtra = intent.getStringExtra("Kother_user_name_list");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                if (booleanExtra) {
                    pk2Var.set(0, 1);
                } else {
                    pk2Var.set(0, 2);
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("label_id");
                if (stringArrayListExtra != null) {
                    linkedList.addAll(stringArrayListExtra);
                }
                pk2Var.set(1, linkedList);
                if (stringExtra.length() > 0) {
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    kz5.h0.w(linkedList2, new r26.t(",").g(stringExtra, 0).toArray(new java.lang.String[0]));
                    pk2Var.set(2, linkedList2);
                }
            } else if (intExtra3 == 6) {
                pk2Var.set(0, 3);
                i19 = 4;
            }
            i19 = 3;
        } else {
            pk2Var.set(0, 0);
            i19 = 1;
        }
        if (pk2Var.m75939xb282bd08(0) == 2 && pk2Var.m75941xfb821914(1).isEmpty() && pk2Var.m75941xfb821914(2).isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSettingPrivacyUI", "setNotRecommendInfo:no label");
            return;
        }
        boolean b17 = hc2.s.b();
        m92.b j37 = g92.a.j3(g92.b.f351302e, this.f211030d, false, 2, null);
        r45.pk2 pk2Var2 = j37 != null ? (r45.pk2) j37.u0().m75936x14adae67(38) : null;
        boolean z17 = (!(i19 == 1 && b17) && (i19 != 2 || b17)) || !(pk2Var2 == null || pk2Var2.m75939xb282bd08(0) == 0);
        if (i19 == 3 && !b17 && pk2Var2 != null && pk2Var2.m75939xb282bd08(0) == pk2Var.m75939xb282bd08(0) && pk2Var2.m75941xfb821914(1).size() == pk2Var.m75941xfb821914(1).size()) {
            java.util.LinkedList m75941xfb821914 = pk2Var2.m75941xfb821914(1);
            java.util.LinkedList m75941xfb8219142 = pk2Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getLabel_id(...)");
            if (m75941xfb821914.containsAll(m75941xfb8219142) && pk2Var2.m75941xfb821914(2).size() == pk2Var.m75941xfb821914(2).size()) {
                java.util.LinkedList m75941xfb8219143 = pk2Var2.m75941xfb821914(2);
                java.util.LinkedList m75941xfb8219144 = pk2Var.m75941xfb821914(2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219144, "getUsername(...)");
                if (m75941xfb8219143.containsAll(m75941xfb8219144)) {
                    z17 = false;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSettingPrivacyUI", "setNotRecommendInfo:type %d labelSize %d nameSize %d switch %d oldPrivate %b", java.lang.Integer.valueOf(pk2Var.m75939xb282bd08(0)), java.lang.Integer.valueOf(pk2Var.m75941xfb821914(1).size()), java.lang.Integer.valueOf(pk2Var.m75941xfb821914(2).size()), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(b17));
        if (z17) {
            f();
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.s0 s0Var = hb2.s0.f361623e;
            zy2.gc gcVar = this.f211035i;
            java.lang.String str = this.f211030d;
            s0Var.getClass();
            r45.ri2 ri2Var = new r45.ri2();
            ri2Var.set(15, java.lang.Integer.valueOf(i19));
            ri2Var.set(25, pk2Var);
            if (str != null) {
                hb2.w0.a(s0Var, str, ri2Var, gcVar, false, false, null, 56, null);
            }
        }
    }

    public final boolean e(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        int i17;
        android.content.Intent intent;
        r45.pk2 pk2Var;
        boolean N;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21560x1fce98fb);
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSettingPrivacyUI", "click " + str);
        if (str == null) {
            return true;
        }
        int hashCode = str.hashCode();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar2 = this.f211028b;
        android.app.Activity context = this.f211027a;
        switch (hashCode) {
            case -2022995907:
                if (!str.equals("checkbox_preference_say_hi")) {
                    return true;
                }
                android.content.Intent intent2 = new android.content.Intent();
                m92.b j37 = g92.a.j3(g92.b.f351302e, this.f211030d, false, 2, null);
                intent2.putExtra("key_input_interact", j37 != null ? java.lang.Integer.valueOf(j37.u0().m75939xb282bd08(49)) : null);
                intent2.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14117xff3e44f.class);
                android.app.Activity activity = this.f211027a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(11);
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderCommonSetting", "handleInteractSayHi", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                return true;
            case -1266260301:
                if (!str.equals("settings_protect")) {
                    return true;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).sk(context, null);
                return true;
            case -954553875:
                if (!str.equals("settings_recommend_info")) {
                    return true;
                }
                android.content.Intent className = new android.content.Intent().setClassName(context, "com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI26");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(className, "setClassName(...)");
                m92.b j38 = g92.a.j3(g92.b.f351302e, this.f211030d, false, 2, null);
                if (j38 == null || (pk2Var = (r45.pk2) j38.u0().m75936x14adae67(38)) == null) {
                    i17 = 0;
                    intent = null;
                } else {
                    java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
                    java.util.LinkedList m75941xfb821914 = pk2Var.m75941xfb821914(1);
                    if (m75941xfb821914 != null) {
                        arrayList2.addAll(m75941xfb821914);
                    }
                    java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(pk2Var.m75941xfb821914(2), ",");
                    int m75939xb282bd08 = pk2Var.m75939xb282bd08(0);
                    if (m75939xb282bd08 == 1) {
                        className.putExtra("Kexclude_all_friends", true);
                    } else if (m75939xb282bd08 != 2) {
                        i17 = m75939xb282bd08 != 3 ? hc2.s.b() ? 1 : 0 : 6;
                        className.putStringArrayListExtra("label_id", arrayList2);
                        intent = className.putExtra("Kother_user_name_list", c17);
                    }
                    i17 = 3;
                    className.putStringArrayListExtra("label_id", arrayList2);
                    intent = className.putExtra("Kother_user_name_list", c17);
                }
                if (intent == null && hc2.s.b()) {
                    i17 = 1;
                }
                className.putExtra("KLabel_range_index", i17);
                className.putExtra("Kis_from_finder", true);
                className.putExtra("k_show_private", true);
                className.putExtra("k_show_include", false);
                className.putExtra("k_sns_label_ui_style", 0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                className.putExtra("key_to_comment_scene", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pe.f34670x366c91de);
                className.putExtra("key_click_tab_context_id", nyVar != null ? nyVar.f216919r : null);
                className.putExtra("key_context_id", nyVar != null ? nyVar.f216915p : null);
                android.app.Activity activity2 = this.f211027a;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(10);
                arrayList3.add(className);
                java.util.Collections.reverse(arrayList3);
                yj0.a.k(activity2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/FinderCommonSetting", "handleSetNotRecommendInfo", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                dy1.r rVar3 = (dy1.r) i95.n0.c(dy1.r.class);
                jz5.l[] lVarArr = new jz5.l[4];
                lVarArr[0] = new jz5.l("view_id", "watch_account_content_setting");
                lVarArr[1] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f216913n) : null);
                lVarArr[2] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f216919r : null);
                lVarArr[3] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f216915p : null);
                ((cy1.a) rVar3).Ej("view_clk", kz5.c1.k(lVarArr), 25496);
                return true;
            case -415165035:
                if (!str.equals("account_management")) {
                    return true;
                }
                android.content.Intent intent3 = new android.content.Intent();
                i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Mj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18, this.f211027a, 10L, 1L, false, 0, 0, null, 120, null);
                r45.d1 d1Var = this.f211032f;
                if (d1Var == null) {
                    return true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13930xdbd6d612.f190731g;
                intent3.putExtra("ACCOUNT_EXTRA_CONFIG", d1Var.mo14344x5f01b1f6());
                intent3.putExtra("ACCOUNT_USERNAME", this.f211030d);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Ai(context, intent3);
                return true;
            case 197211010:
                if (!str.equals("settings_personal_info_export")) {
                    return true;
                }
                android.content.Intent intent4 = new android.content.Intent();
                r45.zq2 zq2Var = this.f211029c;
                intent4.putExtra("rawUrl", zq2Var != null ? zq2Var.m75945x2fec8307(0) : null);
                j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent4, null);
                return true;
            case 541151233:
                if (!str.equals("settings_blacklist")) {
                    return true;
                }
                i95.m c19 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                android.content.Intent intent5 = new android.content.Intent();
                intent5.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15013x60db486b.class);
                xy2.c.c(context, intent5);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(intent5);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(context, arrayList4.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterBlackListUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList4.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterBlackListUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            case 604599027:
                if (!str.equals("settings_show_my_finder")) {
                    return true;
                }
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WXPROFILE_ENTRY_EDU_INT_SYNC, 1);
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WXPROFILE_ENTRY_EDU2_INT_SYNC, 1);
                i95.m c27 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Mj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c27, this.f211027a, 12L, 1L, false, 0, 0, null, 120, null);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).h("settings_show_my_finder");
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = h17 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h17 : null;
                if (c21541x1c1b08fe == null) {
                    return true;
                }
                boolean N2 = c21541x1c1b08fe.N();
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                m92.b j39 = g92.a.j3(g92.b.f351302e, xy2.c.e(context), false, 2, null);
                if (N2 == (((j39 != null ? j39.f68698x26b1b2e8 : 0) & 262144) != 0)) {
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSettingPrivacyUI", "change isShowAtWxProfile, now:" + N2);
                f();
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hb2.s0.f361623e.u(N2, this.f211033g, this.f211030d);
                return true;
            case 622179821:
                if (!str.equals("settings_message_mute")) {
                    return true;
                }
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h18 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).h("settings_message_mute");
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = h18 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h18 : null;
                if (c21541x1c1b08fe2 == null) {
                    return true;
                }
                boolean N3 = c21541x1c1b08fe2.N();
                g92.b bVar = g92.b.f351302e;
                m92.b j310 = g92.a.j3(bVar, this.f211030d, false, 2, null);
                int i18 = j310 != null ? j310.f68698x26b1b2e8 : 0;
                int i19 = N3 ? i18 | 64 : i18 & (-65);
                m92.c cVar = new m92.c(this.f211030d);
                cVar.f68698x26b1b2e8 = i19;
                bVar.C(cVar, m92.j.f406530o);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hb2.k kVar = hb2.k.f361595e;
                kVar.getClass();
                r45.ii2 ii2Var = new r45.ii2();
                ii2Var.set(0, java.lang.Integer.valueOf(N3 ? 1 : 0));
                hb2.w0.m(kVar, ii2Var, null, false, false, null, null, 60, null);
                return true;
            case 938882809:
                if (!str.equals("checkbox_preference_send_comment_and_bullet")) {
                    return true;
                }
                android.content.Intent intent6 = new android.content.Intent();
                m92.b j311 = g92.a.j3(g92.b.f351302e, this.f211030d, false, 2, null);
                intent6.putExtra("key_input_interact", j311 != null ? java.lang.Integer.valueOf(j311.u0().m75939xb282bd08(48)) : null);
                intent6.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14118xff3e450.class);
                android.app.Activity activity3 = this.f211027a;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList5.add(11);
                arrayList5.add(intent6);
                java.util.Collections.reverse(arrayList5);
                yj0.a.k(activity3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/ui/FinderCommonSetting", "handleInteractSendCommentAndBullet", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                return true;
            case 1478826890:
                if (!str.equals("settings_not_recommend_friends")) {
                    return true;
                }
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h19 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).h("settings_not_recommend_friends");
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe3 = h19 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h19 : null;
                if (c21541x1c1b08fe3 == null) {
                    return true;
                }
                boolean N4 = c21541x1c1b08fe3.N();
                g92.b bVar2 = g92.b.f351302e;
                m92.b j312 = g92.a.j3(bVar2, this.f211030d, false, 2, null);
                int i27 = j312 != null ? j312.f68698x26b1b2e8 : 0;
                int i28 = N4 ? i27 | 1073741824 : i27 & (-1073741825);
                m92.c cVar2 = new m92.c(this.f211030d);
                cVar2.f68698x26b1b2e8 = i28;
                bVar2.C(cVar2, m92.j.f406530o);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hb2.t tVar = hb2.t.f361625e;
                tVar.getClass();
                r45.ai2 ai2Var = new r45.ai2();
                ai2Var.set(0, java.lang.Integer.valueOf(N4 ? 1 : 0));
                hb2.w0.m(tVar, ai2Var, null, false, false, null, null, 60, null);
                return true;
            case 1483581694:
                if (!str.equals("checkbox_preference_one")) {
                    return true;
                }
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h27 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).h("checkbox_preference_one");
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe4 = h27 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h27 : null;
                if (c21541x1c1b08fe4 == null || (N = c21541x1c1b08fe4.N()) == hc2.s.b()) {
                    return true;
                }
                f();
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hb2.s0 s0Var = hb2.s0.f361623e;
                int i29 = N ? 1 : 2;
                zy2.gc gcVar = this.f211034h;
                s0Var.getClass();
                r45.ri2 ri2Var = new r45.ri2();
                ri2Var.set(15, java.lang.Integer.valueOf(i29));
                hb2.w0.m(s0Var, ri2Var, gcVar, false, false, null, null, 60, null);
                return true;
            case 1532430696:
                if (!str.equals("settings_data_permission")) {
                    return true;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                android.content.Intent intent7 = new android.content.Intent();
                intent7.addFlags(67108864);
                intent7.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15064xc41164b7.class);
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(intent7);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(context, arrayList6.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderSettingDataPermissionUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList6.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderSettingDataPermissionUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            default:
                return true;
        }
    }

    public final void f() {
        az2.f fVar = this.f211031e;
        if (fVar != null) {
            fVar.b();
        }
        az2.c cVar = az2.f.f97658d;
        android.app.Activity activity = this.f211027a;
        az2.f a17 = az2.c.a(cVar, activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), 0L, null, 8, null);
        this.f211031e = a17;
        a17.a();
    }

    public final void g(boolean z17, java.lang.Integer num, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15508xee803e97 c15508xee803e97) {
        java.lang.String string;
        android.app.Activity activity = this.f211027a;
        if (z17) {
            c15508xee803e97.H(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ltc));
            c15508xee803e97.L = activity.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560428k4);
            c15508xee803e97.f279321y = activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560428k4, null);
            c15508xee803e97.w(false);
            return;
        }
        if (num != null && num.intValue() == 2) {
            string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lta);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else if (num != null && num.intValue() == 3) {
            string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ltb);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else if (num != null && num.intValue() == 1) {
            string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ltc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else {
            string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571919tj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        }
        c15508xee803e97.H(string);
        c15508xee803e97.L = activity.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw);
        c15508xee803e97.f279321y = activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw, null);
        c15508xee803e97.w(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2.h():void");
    }
}
