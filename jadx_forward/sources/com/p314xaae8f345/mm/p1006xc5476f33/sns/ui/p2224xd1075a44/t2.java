package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public abstract class t2 {
    public static void a(java.util.LinkedList linkedList) {
        boolean i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustAdFirstBossCommentPosition", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsCommentUtil", "adjustAdFirstBossCommentPosition, size=" + linkedList.size());
            int i18 = 0;
            while (true) {
                if (i18 >= linkedList.size()) {
                    break;
                }
                r45.e86 e86Var = (r45.e86) linkedList.get(i18);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdBossFirstComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                if (e86Var == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdBossFirstComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                    i17 = false;
                } else {
                    i17 = i(e86Var.f454672t, 32);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdBossFirstComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                }
                if (!i17) {
                    i18++;
                } else if (i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsCommentUtil", "adjustAdFirstBossCommentPosition, swap pos=" + i18);
                    linkedList.remove(i18);
                    linkedList.add(0, e86Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 157);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsCommentUtil", "adjustAdFirstBossCommentPosition, normal pos=" + i18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 156);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsCommentUtil", "adjustAdFirstBossCommentPosition, exp=" + e17.toString());
            ca4.q.c("adjustAdFirstBossCommentPosition", e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustAdFirstBossCommentPosition", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
    }

    public static java.lang.Boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("commentImageFlowUIEnabled", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_comment_image_flow_ui_enabled, false));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("commentImageFlowUIEnabled", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return valueOf;
    }

    public static java.lang.CharSequence c(android.text.SpannableStringBuilder spannableStringBuilder) {
        android.text.SpannableStringBuilder spannableStringBuilder2;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[] z0VarArr;
        java.lang.String e17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("compressLinkContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        if (spannableStringBuilder instanceof mm0.d) {
            mm0.d dVar = new mm0.d(spannableStringBuilder);
            dVar.f410110d = ((mm0.d) spannableStringBuilder).f410110d;
            spannableStringBuilder2 = dVar;
        } else {
            spannableStringBuilder2 = new android.text.SpannableStringBuilder(spannableStringBuilder);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(spannableStringBuilder) && (z0VarArr = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0.class)) != null && z0VarArr.length > 0) {
            for (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 z0Var : z0VarArr) {
                if (z0Var.m75731xfb85f7b0() == 1 && (e17 = z0Var.m75727xeff487ef().e()) != null && e17.length() > com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j4.f() && spannableStringBuilder2.toString().contains(e17)) {
                    java.lang.String str = e17.substring(0, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j4.f()) + "...";
                    android.text.SpannableString spannableString = new android.text.SpannableString(str);
                    spannableString.setSpan(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0(2, z0Var.m75727xeff487ef()), 0, str.length(), 33);
                    int indexOf = spannableStringBuilder2.toString().indexOf(e17);
                    spannableStringBuilder2.replace(indexOf, e17.length() + indexOf, (java.lang.CharSequence) spannableString);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compressLinkContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return spannableStringBuilder2;
    }

    public static java.lang.String d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdBossCommentNickName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        if (c17903x3b438f4 != null) {
            if (c17903x3b438f4.f38276x78e6b24) {
                str = c17903x3b438f4.f38263xd30c22be;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17903x3b438f4.f38259x436a86e)) {
                str = c17903x3b438f4.f38259x436a86e;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdBossCommentNickName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return str;
    }

    public static java.lang.String e(r45.e86 e86Var) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentNickName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 f07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.pj()).f0(e86Var.f454659d);
        if (f07 != null) {
            str = f07.g2();
        } else {
            java.lang.String str2 = e86Var.f454660e;
            str = str2 != null ? str2 : e86Var.f454659d;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentNickName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return str;
    }

    public static java.lang.CharSequence f(android.content.Context context, r45.e86 e86Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q1 q1Var, int i17, java.lang.String str, int i18, boolean z17, boolean z18, final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        java.lang.String str2;
        boolean z19;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        int i19;
        boolean z27;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String g27;
        int length;
        boolean z28;
        java.lang.String str5;
        java.lang.String str6;
        int i27;
        boolean z29;
        java.lang.String str7;
        int i28;
        java.lang.String str8;
        int i29;
        java.lang.String str9;
        int i37;
        int i38;
        java.lang.String str10;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q1 q1Var2;
        int i39;
        int i47;
        int i48;
        int i49;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1 d1Var;
        int i57;
        int i58;
        byte[] d17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentSpan", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentSpan", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        java.lang.String e17 = e(e86Var);
        if (k(c17933xe8d1b226, e86Var.f454659d)) {
            str2 = d(c17933xe8d1b226.m70354x74235b3e(), java.lang.String.valueOf(e17));
            z19 = true;
        } else {
            str2 = e17;
            z19 = false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 f07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.pj()).f0(e86Var.f454667o);
        int i59 = i17 == 21 ? 3 : 2;
        java.lang.String str11 = e86Var.f454663h;
        java.lang.String str12 = str11 == null ? "" : str11;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            z3Var = null;
        } else {
            gm0.j1.i();
            z3Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(str);
        }
        if (i18 == 1) {
            i19 = i59;
            if (j62.e.g().a("clicfg_text_status_icon_scene_sns_like_and", "1", false, false).equals("1")) {
                if (((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).aj(e86Var.f454659d)) {
                    str3 = ((java.lang.Object) str2) + " ";
                    z27 = true;
                }
            }
            str3 = str2;
            z27 = false;
        } else {
            i19 = i59;
            z27 = false;
            str3 = "";
        }
        java.lang.String str13 = str2;
        if (!i(e86Var.f454672t, 1) || !android.text.TextUtils.isEmpty(e86Var.f454667o)) {
            if (i(e86Var.f454672t, 8)) {
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str14 = e86Var.f454667o;
                ((sg3.a) v0Var).getClass();
                g27 = c01.a2.e(str14);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(str3)) {
                    str3 = ((java.lang.Object) str3) + ": ";
                }
                java.lang.String str15 = ((java.lang.Object) str3) + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j9c);
                length = str15.length();
                str5 = "" + ((java.lang.Object) (((java.lang.Object) str15) + g27)) + " ";
                z28 = false;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e86Var.f454667o)) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(str3)) {
                    str3 = ((java.lang.Object) str3) + ": ";
                }
                str4 = "" + ((java.lang.Object) str3);
                str8 = str4;
                str7 = null;
                str6 = null;
                i28 = 0;
                i27 = 0;
                z29 = false;
            } else {
                g27 = f07 == null ? e86Var.f454667o : f07.g2();
                if (c17933xe8d1b226 != null && c17933xe8d1b226.m70377x3172ed() && e86Var.f454667o.equals(c17933xe8d1b226.m70374x6bf53a6c())) {
                    g27 = d(c17933xe8d1b226.m70354x74235b3e(), g27);
                }
                java.lang.String str16 = ((java.lang.Object) str3) + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574766je0);
                length = str16.length();
                if (bi4.v1.h()) {
                    if (((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).aj(e86Var.f454667o)) {
                        g27 = g27 + " ";
                        z28 = true;
                        str5 = "" + ((java.lang.Object) (((java.lang.Object) str16) + g27)) + ": ";
                    }
                }
                z28 = false;
                str5 = "" + ((java.lang.Object) (((java.lang.Object) str16) + g27)) + ": ";
            }
            str6 = g27;
            i27 = length;
            z29 = z28;
            str7 = null;
            i28 = 0;
            str8 = str5;
        } else if (z3Var != null) {
            java.lang.String g28 = android.text.TextUtils.isEmpty(z3Var.g2()) ? str : z3Var.g2();
            if (c17933xe8d1b226 != null && c17933xe8d1b226.m70377x3172ed()) {
                g28 = d(c17933xe8d1b226.m70354x74235b3e(), g28);
            }
            java.lang.String str17 = ((java.lang.Object) str3) + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j9c);
            int length2 = str17.length();
            str5 = "" + ((java.lang.Object) (((java.lang.Object) str17) + g28)) + ": ";
            str7 = g28;
            i28 = length2;
            str6 = null;
            i27 = 0;
            z29 = false;
            str8 = str5;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsCommentUtil", "feedContact null by feedOwnUserName %s", str);
            str4 = "";
            str8 = str4;
            str7 = null;
            str6 = null;
            i28 = 0;
            i27 = 0;
            z29 = false;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_wxa_short_link_launch_scene", "TIME_LINE");
        bundle.putInt("ShareScene", ca4.z0.n0(e86Var) ? 5 : 4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(c17933xe8d1b226.m70374x6bf53a6c());
        sb6.append("#");
        java.lang.String str18 = str8;
        sb6.append(ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
        sb6.append("#");
        sb6.append(e86Var.f454659d);
        sb6.append("#");
        sb6.append(e86Var.f454665m);
        bundle.putString("ShareSceneId", sb6.toString());
        bundle.putLong("CreateTime", e86Var.f454664i);
        bundle.putInt("TimelineEnterSource", i18 == 2 ? 3 : 1);
        bundle.putInt("SnsContentType", c17933xe8d1b226.f68895x2262335f);
        boolean i66 = i(e86Var.f454672t, 32);
        if (i66) {
            bundle.putBoolean("CheckDialog", false);
            r45.cu5 cu5Var = e86Var.f454675w;
            if (cu5Var != null && (d17 = x51.j1.d(cu5Var)) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsCommentUtil", "put extrainfo , buf length = " + d17.length);
                bundle.putByteArray("adExtInfo", d17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemCommentSpanGenerate", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        r45.ek6 ek6Var = new r45.ek6();
        ek6Var.f455118e = ca4.z0.n0(e86Var) ? 5 : 4;
        ek6Var.f455119f = c17933xe8d1b226.m70374x6bf53a6c() + '#' + ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e) + '#' + e86Var.f454659d + '#' + e86Var.f454665m;
        ek6Var.f455120g = (long) e86Var.f454664i;
        ek6Var.f455121h = i18 == 2 ? 3 : 1;
        ek6Var.f455122i = c17933xe8d1b226.f68895x2262335f;
        ek6Var.f455123m = c17933xe8d1b226.f38324x142bbdc6;
        o04.n Bi = ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Bi(context, 1);
        if (Bi != null) {
            ((o04.g) Bi).b("Comment_" + e86Var.hashCode(), ek6Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTAG$cp", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTAG$cp", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsTagSearchSpanClickReportFlow", "onItemCommentSpanGenerate Comment_" + e86Var.hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemCommentSpanGenerate", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float f17 = 15;
        int b17 = i65.a.b(context, (int) (i65.a.q(context) * f17));
        ((ke0.e) xVar).getClass();
        int i67 = i19;
        java.lang.CharSequence k17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.k(context, true, str18, b17, 2, bundle, null, -1, true);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        java.lang.CharSequence f18 = ga4.m.f(c17933xe8d1b226.f68891x29d1292e, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.k(context, true, str12, i65.a.b(context, (int) (f17 * i65.a.q(context))), 2, bundle, null, 5, !i66), e86Var.f454665m, 2);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append(k17);
        java.lang.String str19 = "" + c17933xe8d1b226.f68891x29d1292e;
        if (c17933xe8d1b226.m70394x2cf577f() && z19) {
            java.lang.String str20 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j9c) + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m29);
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(str20);
            i29 = i67;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1 d1Var2 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1((android.app.Activity) context, str, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.u2(context, c17933xe8d1b226), i29);
            java.lang.Boolean bool = (java.lang.Boolean) k84.e4.f386554d.b(a84.d0.c(c17933xe8d1b226));
            if (bool == null || !bool.booleanValue()) {
                i58 = 1;
            } else {
                int b18 = k84.d4.V.b(c17933xe8d1b226);
                d1Var2.mo63036x52d2f021(b18, 0);
                str19 = str19 + "_" + b18;
                i58 = 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsCommentUtil", "fireworkCheerInfo comment refresh " + c17933xe8d1b226.m70360xbd8ebd19());
            spannableStringBuilder2.setSpan(d1Var2, i58, str20.length(), 33);
            spannableStringBuilder.append((java.lang.CharSequence) spannableStringBuilder2);
            str9 = str19;
            i37 = 1;
        } else {
            i29 = i67;
            str9 = str19;
            i37 = 0;
        }
        spannableStringBuilder.append(f18);
        int i68 = i17 == 21 ? 3 : 2;
        mm0.d dVar = new mm0.d(spannableStringBuilder);
        bi4.c cVar = bi4.c.SNS_COMMENT;
        if (i18 == 1) {
            if (k(c17933xe8d1b226, e86Var.f454659d)) {
                str10 = "";
                q1Var2 = q1Var;
                dVar.setSpan(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1((android.app.Activity) context, new ca4.h(c17933xe8d1b226.m70377x3172ed(), e86Var.f454659d, c17933xe8d1b226.m70363x51f8f990(), 0, i(e86Var.f454672t, 32) ? 27 : 2), q1Var2, i68), 0, str13.length(), 33);
            } else {
                str10 = "";
                q1Var2 = q1Var;
                dVar.setSpan(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1((android.app.Activity) context, e86Var.f454659d, q1Var2, i68), 0, str13.length(), 33);
            }
            if (z27) {
                android.text.style.ReplacementSpan Zi = ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Zi(null, e86Var.f454659d, cVar, i65.a.b(context, (int) (i65.a.q(context) * f17)));
                if (Zi != null) {
                    i38 = 1;
                    dVar.setSpan(Zi, str13.length(), str13.length() + 1, 17);
                }
            }
            i38 = 1;
        } else {
            i38 = 1;
            str10 = "";
            q1Var2 = q1Var;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
            int i69 = i37;
            i39 = i38;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                i47 = i69;
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1 d1Var3 = (c17933xe8d1b226.m70377x3172ed() && e86Var.f454667o.equals(c17933xe8d1b226.m70374x6bf53a6c())) ? new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1((android.app.Activity) context, new ca4.h(c17933xe8d1b226.m70377x3172ed(), e86Var.f454667o, c17933xe8d1b226.m70363x51f8f990(), 0, 2), q1Var2, i29) : new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1((android.app.Activity) context, e86Var.f454667o, q1Var2, i29);
                java.lang.Boolean bool2 = (java.lang.Boolean) k84.e4.f386554d.b(a84.d0.c(c17933xe8d1b226));
                if ((i(e86Var.f454672t, 8) || i(e86Var.f454672t, i39)) && c17933xe8d1b226.m70394x2cf577f() && bool2 != null && bool2.booleanValue()) {
                    int b19 = k84.d4.V.b(c17933xe8d1b226);
                    d1Var3.mo63036x52d2f021(b19, 0);
                    i48 = i27 > 0 ? i27 - 1 : i27;
                    str9 = str9 + "_" + b19;
                    i47 = i39;
                } else {
                    i47 = i69;
                    i48 = i27;
                }
                dVar.setSpan(d1Var3, i48, i27 + str6.length(), 33);
                if (z29) {
                    android.text.style.ReplacementSpan Zi2 = ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Zi(null, e86Var.f454667o, cVar, i65.a.b(context, (int) (i65.a.q(context) * f17)));
                    if (Zi2 != null) {
                        dVar.setSpan(Zi2, (i27 + str6.length()) - i39, i27 + str6.length(), 17);
                    }
                }
            }
        } else {
            if (c17933xe8d1b226.m70377x3172ed() && str.equals(c17933xe8d1b226.m70374x6bf53a6c())) {
                i49 = i37;
                i39 = i38;
                d1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1((android.app.Activity) context, new ca4.h(c17933xe8d1b226.m70377x3172ed(), str, c17933xe8d1b226.m70363x51f8f990(), 0, 2), q1Var2, i29);
            } else {
                i49 = i37;
                i39 = i38;
                d1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1((android.app.Activity) context, str, q1Var2, i29);
            }
            java.lang.Boolean bool3 = (java.lang.Boolean) k84.e4.f386554d.b(a84.d0.c(c17933xe8d1b226));
            if ((i(e86Var.f454672t, 8) || i(e86Var.f454672t, i39)) && c17933xe8d1b226.m70394x2cf577f() && bool3 != null && bool3.booleanValue()) {
                int b27 = k84.d4.V.b(c17933xe8d1b226);
                d1Var.mo63036x52d2f021(b27, 0);
                i57 = i28 > 0 ? i28 - 1 : i28;
                str9 = str9 + "_" + b27;
                i47 = i39;
            } else {
                i47 = i49;
                i57 = i28;
            }
            dVar.setSpan(d1Var, i57, i28 + str7.length(), 33);
        }
        if (i47 != 0) {
            dVar.f410110d = str10 + str9;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.q2.l(context, c17933xe8d1b226, e86Var, dVar, b().booleanValue(), i18, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.m() { // from class: com.tencent.mm.plugin.sns.ui.widget.t2$$a
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.m
            public final void a(r45.e86 e86Var2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$getCommentSpan$0", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.j3 j3Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.j3.f252707a;
                java.lang.String feedId = ca4.z0.t0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.this.f68891x29d1292e);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markCommentContentClk", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
                if (e86Var2 != null) {
                    ot5.g.c("MicroMsg.SnsSessionCmtReportManager", "markCommentEmoClk: " + feedId + ", " + e86Var2.f454665m);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.g1 b28 = j3Var.b(feedId, java.lang.String.valueOf(e86Var2.f454665m), e86Var2.f454677y, e86Var2.f454663h);
                    if (e86Var2.f454677y == 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClkEmoCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
                        int i76 = b28.f252672f;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClkEmoCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClkEmoCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
                        b28.f252672f = i76 + 1;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClkEmoCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClkPicCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
                        int i77 = b28.f252673g;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClkPicCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClkPicCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
                        b28.f252673g = i77 + 1;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClkPicCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markCommentContentClk", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$getCommentSpan$0", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
            }
        });
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.j3 j3Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.j3.f252707a;
        java.lang.String feedId = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markCommentExp", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        ot5.g.c("MicroMsg.SnsSessionCmtReportManager", "markCommentExp: " + feedId + ", " + e86Var.f454665m);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.g1 b28 = j3Var.b(feedId, java.lang.String.valueOf(e86Var.f454665m), e86Var.f454677y, e86Var.f454663h);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExpCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
        int i76 = b28.f252669c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExpCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setExpCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
        b28.f252669c = i76 + i39;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setExpCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markCommentExp", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentSpan", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentSpan", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int g(r45.k76 r8, r45.k76 r9) {
        /*
            java.lang.String r0 = "getMsgRelevanceType"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.lang.String r2 = "isMessageRelatedToMe"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r1)
            r3 = 1
            r4 = 0
            if (r8 == 0) goto L30
            int r5 = r8.f459995h
            java.lang.String r6 = "isMentionedMySelf"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r6, r1)
            r7 = 4
            if (r5 != r7) goto L1e
            r5 = r3
            goto L1f
        L1e:
            r5 = r4
        L1f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r1)
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L30
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
            goto L3d
        L30:
            if (r9 == 0) goto L3f
            java.lang.String r9 = r9.f459991d
            boolean r9 = l(r9)
            if (r9 == 0) goto L3f
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
        L3d:
            r4 = r3
            goto L52
        L3f:
            if (r8 == 0) goto L4f
            int r8 = r8.f460005u
            r9 = 131072(0x20000, float:1.83671E-40)
            boolean r8 = i(r8, r9)
            if (r8 == 0) goto L4f
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
            goto L3d
        L4f:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
        L52:
            if (r4 == 0) goto L58
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        L58:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            r8 = 2
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.g(r45.k76, r45.k76):int");
    }

    public static java.lang.Boolean h(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasAdBossCommentNickName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        if (c17903x3b438f4 != null) {
            if (c17903x3b438f4.f38276x78e6b24) {
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasAdBossCommentNickName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                return bool;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17903x3b438f4.f38259x436a86e)) {
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasAdBossCommentNickName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                return bool2;
            }
        }
        java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasAdBossCommentNickName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return bool3;
    }

    public static boolean i(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasCommentFlag", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        boolean z17 = (i17 & i18) == i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasCommentFlag", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        r8.remove(r4);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 158);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsCommentUtil", "hideAdFirstBossComment, del comment, idx=" + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(java.util.LinkedList r8) {
        /*
            java.lang.String r0 = "SnsCommentUtil"
            java.lang.String r1 = "hideAdFirstBossComment, size="
            java.lang.String r2 = "hideAdFirstBossComment"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6d
            r4.<init>(r1)     // Catch: java.lang.Exception -> L6d
            int r1 = r8.size()     // Catch: java.lang.Exception -> L6d
            r4.append(r1)     // Catch: java.lang.Exception -> L6d
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> L6d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Exception -> L6d
            r1 = 0
            r4 = r1
        L22:
            int r5 = r8.size()     // Catch: java.lang.Exception -> L6d
            if (r4 >= r5) goto L87
            java.lang.Object r5 = r8.get(r4)     // Catch: java.lang.Exception -> L6d
            r45.e86 r5 = (r45.e86) r5     // Catch: java.lang.Exception -> L6d
            java.lang.String r6 = "isAdBossFirstComment"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r6, r3)     // Catch: java.lang.Exception -> L6d
            if (r5 != 0) goto L3b
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r3)     // Catch: java.lang.Exception -> L6d
            r5 = r1
            goto L46
        L3b:
            int r5 = r5.f454672t     // Catch: java.lang.Exception -> L6d
            r7 = 32
            boolean r5 = i(r5, r7)     // Catch: java.lang.Exception -> L6d
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r3)     // Catch: java.lang.Exception -> L6d
        L46:
            if (r5 == 0) goto L6a
            r8.remove(r4)     // Catch: java.lang.Exception -> L6d
            com.tencent.mm.plugin.report.service.g0 r8 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE     // Catch: java.lang.Exception -> L6d
            r1 = 1612(0x64c, float:2.259E-42)
            r5 = 158(0x9e, float:2.21E-43)
            r8.A(r1, r5)     // Catch: java.lang.Exception -> L6d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6d
            r8.<init>()     // Catch: java.lang.Exception -> L6d
            java.lang.String r1 = "hideAdFirstBossComment, del comment, idx="
            r8.append(r1)     // Catch: java.lang.Exception -> L6d
            r8.append(r4)     // Catch: java.lang.Exception -> L6d
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L6d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r8)     // Catch: java.lang.Exception -> L6d
            goto L87
        L6a:
            int r4 = r4 + 1
            goto L22
        L6d:
            r8 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "hideAdFirstBossComment, exp="
            r1.<init>(r4)
            java.lang.String r4 = r8.toString()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
            ca4.q.c(r2, r8)
        L87:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.j(java.util.LinkedList):void");
    }

    public static boolean k(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdBossComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        boolean z17 = c17933xe8d1b226 != null && c17933xe8d1b226.m70377x3172ed() && str != null && str.equals(c17933xe8d1b226.m70374x6bf53a6c());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdBossComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return z17;
    }

    public static boolean l(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCurUserName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        if (str == null || str.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCurUserName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
            return false;
        }
        java.lang.String r17 = c01.z1.r();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsCommentUtil", "isCurUserName currentUserName: " + r17 + " fromUsrName: " + str);
        boolean equals = str.equals(r17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCurUserName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return equals;
    }

    public static boolean m(r45.e86 e86Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDeletedComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        boolean z17 = e86Var != null && e86Var.f454671s > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDeletedComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return z17;
    }

    public static synchronized void n(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883, java.util.LinkedList linkedList) {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preHandleAdComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
            if (linkedList != null && linkedList.size() != 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preHandleAdComment, snsId=");
                sb6.append(c17932x22276883 == null ? "" : ca4.z0.t0(c17932x22276883.f67610x29d1292e));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsCommentUtil", sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isHideAdFirstBossComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExpEnableHideAdFirstComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                boolean z17 = true;
                boolean z18 = ca4.m0.u0(e42.c0.clicfg_ad_enable_hide_first_boss_comment, 1) == 1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExpEnableHideAdFirstComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                boolean z19 = z18 && c17932x22276883 != null && c17932x22276883.m70300x74235b3e().f38236x79188aec.f441491b;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isHideAdFirstBossComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                if (z19) {
                    j(linkedList);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preHandleAdComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExpEnableAdjustPosition", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                if (ca4.m0.u0(e42.c0.clicfg_ad_enable_adjust_first_boss_comment_pos, 1) != 1) {
                    z17 = false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExpEnableAdjustPosition", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                if (z17) {
                    a(linkedList);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preHandleAdComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preHandleAdComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        }
    }

    public static boolean o(android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("trySetAdBossCommentAvater", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        boolean z17 = false;
        if (c17933xe8d1b226 != null && k(c17933xe8d1b226, str) && (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) != null && m70354x74235b3e.f38276x78e6b24 && !android.text.TextUtils.isEmpty(m70354x74235b3e.f38262x1fc29389)) {
            java.lang.String str2 = m70354x74235b3e.f38262x1fc29389;
            imageView.setTag(com.p314xaae8f345.mm.R.id.nae, str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsCommentUtil", "trySetAdBossCommentAvater, isSet=true");
            java.lang.String l17 = za4.t0.l("adId", str2);
            if (com.p314xaae8f345.mm.vfs.w6.j(l17)) {
                if (n74.a2.d()) {
                    n74.a2.c(imageView, l17, 1);
                } else {
                    try {
                        android.graphics.Bitmap b17 = i64.m1.f370771c.b(l17);
                        if (b17 != null) {
                            imageView.setImageBitmap(b17);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsCommentUtil", "trySetAdBossCommentAvater use local cache, url=" + str2);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsCommentUtil", "trySetAdBossCommentAvater decode exp=" + th6.toString());
                    }
                }
            } else if (n74.a2.d()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsCommentUtil", "detail: download use avatar with cdn, but the statement should not reach!");
                n74.a2.a(imageView, str2, 1);
            } else {
                za4.t0.a(str2, false, 41, 0, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.v2(str2, imageView));
            }
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("trySetAdBossCommentAvater", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return z17;
    }
}
