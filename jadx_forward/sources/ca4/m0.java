package ca4;

/* loaded from: classes4.dex */
public abstract class m0 {
    public static java.lang.String A(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdExtraInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isChatRoom=");
        if (str2 == null || !(str2.endsWith("@chatroom") || str2.endsWith("@im.chatroom"))) {
            sb6.append("0");
        } else {
            sb6.append("1");
        }
        sb6.append("&fromUsername=");
        sb6.append(str);
        sb6.append("&chatName=");
        sb6.append(str2);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdExtraInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return sb7;
    }

    public static void A0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startToolsProcess", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (a54.g.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdUtil", "startToolsProcess, break");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startToolsProcess", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "startToolsProcess");
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(com.p314xaae8f345.mm.ui.u2.f292595a, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
        intent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startToolsProcess", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static java.lang.String B(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "uxInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        java.lang.String str2 = "<ADInfo><uxInfo>" + str + "</uxInfo></ADInfo>";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return str2;
    }

    public static void B0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("timelineReport19790", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        arrayMap.put("outSns", 1);
        da4.a.h(str, str2, str3, i17, str4, arrayMap);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("timelineReport19790", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static int C(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdUserFollowStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        int i17 = 1;
        try {
            java.lang.String str = "";
            java.lang.String m70374x6bf53a6c = c17933xe8d1b226.m70374x6bf53a6c();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (c17933xe8d1b226.m70377x3172ed() && !android.text.TextUtils.isEmpty(m70374x6bf53a6c)) {
                gm0.j1.i();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(m70374x6bf53a6c, true);
                if (n17 != null) {
                    if (((int) n17.E2) > 0 && n17.r2()) {
                        i17 = 2;
                    }
                    str = n17.f2();
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "getAdUserFollowStatus, userName=" + m70374x6bf53a6c + ", followStatus=" + i17 + ", displayName=" + str + ", timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "isContact exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdUserFollowStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return i17;
    }

    public static boolean C0(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771, int i17, int i18) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (context == null || c17933xe8d1b226 == null || c17902x72cc1771 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "tryProcessAdAppMarket input param is wrong");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a aVar = c17902x72cc1771.f38051x52710f64;
        java.lang.String str8 = "";
        if (aVar != null) {
            str2 = aVar.f247447d;
            str3 = aVar.f247444a;
            str4 = aVar.f247446c;
            str = aVar.f247445b;
        } else {
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
        if (m70354x74235b3e == null || m70354x74235b3e.f38274x8e006dda != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.A(1958, 8);
        java.lang.String str9 = m70354x74235b3e.f38172xd73c98cc;
        android.content.Intent intent = m70354x74235b3e.f38225x29e33eb9;
        if (android.text.TextUtils.isEmpty(str) && intent != null) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(m70354x74235b3e.f38225x29e33eb9, "target_app_id");
        }
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "the target package is empty!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        int i19 = i18 == 1 ? 2 : 0;
        if (ik1.b.b(context, str)) {
            if (android.text.TextUtils.isEmpty(str2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getApplicationName", "com.tencent.mm.plugin.sns.adutils.AdUtils$System");
                if (android.text.TextUtils.isEmpty(str)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getApplicationName", "com.tencent.mm.plugin.sns.adutils.AdUtils$System");
                } else {
                    try {
                        android.content.pm.PackageManager packageManager = context.getPackageManager();
                        java.lang.CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128));
                        if (applicationLabel != null) {
                            str8 = applicationLabel.toString();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getApplicationName", "com.tencent.mm.plugin.sns.adutils.AdUtils$System");
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getApplicationName", "com.tencent.mm.plugin.sns.adutils.AdUtils$System");
                }
                str7 = str8;
            } else {
                str7 = str2;
            }
            l44.z.q(true, c17933xe8d1b226, i17);
            o0(context, str3, str, str7, str4, i19, new i64.p0(java.lang.String.valueOf(c17933xe8d1b226.f68891x29d1292e), c17902x72cc1771.f38104xce64ddf1, str9, i18, c17902x72cc1771.aid, c17902x72cc1771.f38103xc060c120, c17902x72cc1771.pId));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1958, 10);
            str6 = "tryProcessAdAppMarket";
        } else {
            if (da4.a.f(intent)) {
                str5 = "tryProcessAdAppMarket";
                B0(java.lang.String.valueOf(c17933xe8d1b226.f68891x29d1292e), c17902x72cc1771.f38104xce64ddf1, str9, 4, "0");
            } else {
                str5 = "tryProcessAdAppMarket";
                B0(java.lang.String.valueOf(c17933xe8d1b226.f68891x29d1292e), c17902x72cc1771.f38104xce64ddf1, str9, 4, "1");
            }
            if (!da4.a.e(intent)) {
                B0(java.lang.String.valueOf(c17933xe8d1b226.f68891x29d1292e), c17902x72cc1771.f38104xce64ddf1, str9, 1, "1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return false;
            }
            B0(java.lang.String.valueOf(c17933xe8d1b226.f68891x29d1292e), c17902x72cc1771.f38104xce64ddf1, str9, 1, "0");
            l44.z.q(false, c17933xe8d1b226, i17);
            l44.z.g(new ca4.d(c17902x72cc1771.f38104xce64ddf1, str9, c17902x72cc1771.aid, c17902x72cc1771.f38103xc060c120, c17902x72cc1771.pId), 1);
            z0(context, intent, str, java.lang.String.valueOf(c17933xe8d1b226.f68891x29d1292e), c17902x72cc1771.f38104xce64ddf1, str9, i19, c17933xe8d1b226, i17, new i64.p0());
            g0Var.A(1958, 9);
            str6 = str5;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return true;
    }

    public static java.lang.String D(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        try {
            java.lang.String[] split = str.split("\\|");
            if (split.length >= 1) {
                java.lang.String str2 = split[0];
                java.lang.String str3 = str2 != null ? str2 : "";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return str3;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return "";
    }

    public static long D0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unPackSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unPackSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return 0L;
            }
            if (str.startsWith("ad_table_")) {
                long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str.substring(9));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unPackSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return E1;
            }
            if (str.startsWith("sns_table_")) {
                long E12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str.substring(10));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unPackSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return E12;
            }
            long F0 = ca4.z0.F0(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unPackSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return F0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unPackSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0L;
        }
    }

    public static java.lang.String E(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAidFromUxInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAidFromUxInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        java.lang.String[] split = str.split("\\|");
        if (split == null || split.length <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAidFromUxInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        java.lang.String str2 = split[0];
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAidFromUxInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return str2;
    }

    public static java.util.HashSet F(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentUsers", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        java.util.HashSet hashSet = new java.util.HashSet();
        if (c19806x4c372b7 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentUsers", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return hashSet;
        }
        java.util.Iterator<r45.e86> it = c19806x4c372b7.f38963x20c46e68.iterator();
        if (it != null) {
            while (it.hasNext()) {
                java.lang.String str = it.next().f454659d;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str == null) {
                    str = "";
                }
                hashSet.add(str);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentUsers", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return hashSet;
    }

    public static java.util.HashSet G(java.util.HashSet hashSet, java.util.HashSet hashSet2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLikeCommentUsersUnion", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        java.util.HashSet hashSet3 = new java.util.HashSet();
        if (!a84.b0.b(hashSet)) {
            hashSet3.addAll(hashSet);
        }
        if (!a84.b0.b(hashSet2)) {
            hashSet3.addAll(hashSet2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLikeCommentUsersUnion", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return hashSet3;
    }

    public static java.util.HashSet H(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLikeUsers", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        java.util.HashSet hashSet = new java.util.HashSet();
        if (c19806x4c372b7 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLikeUsers", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return hashSet;
        }
        java.util.Iterator<r45.e86> it = c19806x4c372b7.f38984xe83113e0.iterator();
        if (it != null) {
            while (it.hasNext()) {
                java.lang.String str = it.next().f454659d;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str == null) {
                    str = "";
                }
                hashSet.add(str);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLikeUsers", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return hashSet;
    }

    public static float I(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLimitedScaleFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        float f17 = i65.a.f(context, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLimitedScaleSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        float f18 = i65.a.E(context) ? i65.a.l(context) ? 1.12f : 1.1f : 1.0f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLimitedScaleSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        float f19 = f17 * f18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLimitedScaleFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return f19;
    }

    public static int J(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLogoType", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (c17702x544f64e9 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLogoType", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0;
        }
        int i17 = c17702x544f64e9.f244104b;
        if (i17 == 4 || i17 == 28) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLogoType", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 1;
        }
        if (n74.i0.a(c17702x544f64e9)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLogoType", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 2;
        }
        int i18 = c17702x544f64e9.f244104b;
        if (i18 == 10 || i18 == 24 || i18 == 12) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLogoType", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 3;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLogoType", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return 0;
    }

    public static java.lang.String K(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPaddingStr", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        java.lang.String str = "[" + view.getPaddingLeft() + "," + view.getPaddingTop() + "," + view.getPaddingRight() + "," + view.getPaddingBottom() + "]";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPaddingStr", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return str;
    }

    public static java.lang.String L(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        try {
            java.lang.String[] split = str.split("\\|");
            if (split.length >= 8) {
                java.lang.String str2 = split[7];
                java.lang.String str3 = str2 != null ? str2 : "";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return str3;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return "";
    }

    public static float M(android.widget.TextView textView, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRealTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRealTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0.0f;
        }
        float measureText = textView.getPaint().measureText(str.trim());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRealTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return measureText;
    }

    public static double N(android.widget.TextView textView) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTextViewHeight", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (textView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextViewHeight", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0.0d;
        }
        android.graphics.Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
        double ceil = java.lang.Math.ceil(fontMetrics.bottom - fontMetrics.top);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextViewHeight", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return ceil;
    }

    public static java.lang.String O() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimelineSessionId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.lang.String Ni = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "getTimelineSessionId=" + Ni + ", timeCost=" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimelineSessionId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return Ni;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "getTimelineSessionId exp=" + th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimelineSessionId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
    }

    public static java.lang.String P(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTraceId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTraceId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        try {
            java.lang.String[] split = str.split("\\|");
            if (split.length >= 2) {
                java.lang.String str2 = split[1];
                java.lang.String str3 = str2 != null ? str2 : "";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTraceId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return str3;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTraceId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return "";
    }

    public static java.lang.String Q(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUxInfoFromAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUxInfoFromAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "getUxinfoFromAdInfoXml, xml=" + str);
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "ADInfo", null);
            if (d17 != null) {
                java.lang.String str2 = (java.lang.String) d17.get(".ADInfo.uxInfo");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                java.lang.String str3 = str2 != null ? str2 : "";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUxInfoFromAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return str3;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "getUxinfoFromAdInfoXml, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUxInfoFromAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return "";
    }

    public static boolean R(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771, int i17, i64.b1 b1Var, int i18, int i19) {
        com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleAdClickDownloadAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (c17933xe8d1b226 == null || c17902x72cc1771 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleAdClickDownloadAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        try {
            c11137xb05b06ad = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(i17, i17 == 0 ? 1 : 2, c17933xe8d1b226.f68891x29d1292e, i18, 0);
            g(c11137xb05b06ad, b1Var, c17933xe8d1b226, i18, i19);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "handleAdClickDownloadAction, exp=" + th6.toString());
        }
        if (h(context, c17933xe8d1b226, c17902x72cc1771, i17, b1Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "handleAdClickDownloadAction, checkOpenApp success");
            c11137xb05b06ad.f153003h = 34;
            ca4.z0.x0(c11137xb05b06ad);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleAdClickDownloadAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        }
        if (!C0(context, c17933xe8d1b226, c17902x72cc1771, i17, 2)) {
            l44.z.q(false, c17933xe8d1b226, i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleAdClickDownloadAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "handleAdClickDownloadAction, tryProcessAdAppMarket success");
        c11137xb05b06ad.f153003h = 36;
        ca4.z0.x0(c11137xb05b06ad);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleAdClickDownloadAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return true;
    }

    public static boolean S(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771, int i17, i64.b1 b1Var) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h hVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (c17933xe8d1b226 == null || c17902x72cc1771 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "handleAdClickAction, exp=" + th6.toString());
        }
        if (h(context, c17933xe8d1b226, c17902x72cc1771, i17, b1Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "handleAdClickAction, checkOpenApp succ");
            com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(i17, i17 == 0 ? 1 : 2, c17933xe8d1b226.f68891x29d1292e, 22, 34);
            f(c11137xb05b06ad, b1Var, c17933xe8d1b226, 22);
            ca4.z0.x0(c11137xb05b06ad);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        }
        if (C0(context, c17933xe8d1b226, c17902x72cc1771, i17, 2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "handleAdClickAction, tryProcessAdAppMarket succ");
            com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad2 = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(i17, i17 == 0 ? 1 : 2, c17933xe8d1b226.f68891x29d1292e, 22, 36);
            f(c11137xb05b06ad2, b1Var, c17933xe8d1b226, 22);
            ca4.z0.x0(c11137xb05b06ad2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        }
        l44.z.q(false, c17933xe8d1b226, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkJumpScan", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
        if (m70354x74235b3e == null || (hVar = m70354x74235b3e.f38205xd1aa75c) == null || c17902x72cc1771.f38067xf8d8cf13 != 8) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkJumpScan", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
            z17 = false;
        } else {
            l44.o5.a(context, hVar, c17902x72cc1771.f38104xce64ddf1, 7);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkJumpScan", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "handleAdClickAction, checkJumpScan succ");
            com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad3 = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(i17, i17 == 0 ? 1 : 2, c17933xe8d1b226.f68891x29d1292e, 22, 35);
            f(c11137xb05b06ad3, b1Var, c17933xe8d1b226, 22);
            ca4.z0.x0(c11137xb05b06ad3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        }
        if (l44.s4.a(context, c17933xe8d1b226.m70354x74235b3e(), c17902x72cc1771, c17933xe8d1b226.f68891x29d1292e, 3)) {
            com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad4 = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(i17, i17 == 0 ? 1 : 2, c17933xe8d1b226.f68891x29d1292e, 22, 37);
            f(c11137xb05b06ad4, b1Var, c17933xe8d1b226, 22);
            ca4.z0.x0(c11137xb05b06ad4);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return false;
    }

    public static boolean T(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, r45.e86 e86Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdBossFirstLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z17 = false;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdBossFirstLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        if (e86Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdBossFirstLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e86Var.f454659d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdBossFirstLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        if (c17933xe8d1b226.m70377x3172ed() && com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.i(e86Var.f454672t, 128) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(e86Var.f454659d, c17933xe8d1b226.m70374x6bf53a6c())) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdBossFirstLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z17;
    }

    public static boolean U(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7, java.lang.String str) {
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdCommentOrLikedBySelf", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            java.util.Iterator<r45.e86> it = c19806x4c372b7.f38963x20c46e68.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                r45.e86 next = it.next();
                if (next != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(next.f454659d) && next.f454659d.equals(str)) {
                    z17 = true;
                    break;
                }
            }
            java.util.Iterator<r45.e86> it6 = c19806x4c372b7.f38984xe83113e0.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    z18 = false;
                    break;
                }
                r45.e86 next2 = it6.next();
                if (next2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(next2.f454659d) && next2.f454659d.equals(str)) {
                    z18 = true;
                    break;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "isAdCommentOrLikedBySelf, snsId=" + ca4.z0.t0(c19806x4c372b7.Id) + ", hasComment=" + z17 + ", hasLiked=" + z18);
            boolean z19 = z17 || z18;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdCommentOrLikedBySelf", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return z19;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "isAdCommentOrLikedBySelf, exp=" + e17.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdCommentOrLikedBySelf", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
    }

    public static boolean V(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdEquals", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (c17933xe8d1b226 == c17933xe8d1b2262) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdEquals", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        }
        boolean z17 = (c17933xe8d1b226 != null ? c17933xe8d1b226.f68891x29d1292e : 0L) == (c17933xe8d1b2262 != null ? c17933xe8d1b2262.f68891x29d1292e : 0L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdEquals", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z17;
    }

    public static boolean W(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdUsePreferedInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z17 = !android.text.TextUtils.isEmpty(str) && str.contains("<usePreferedInfo>1</usePreferedInfo>");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdUsePreferedInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z17;
    }

    public static boolean X(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z17 = i17 == 5 || i17 == 15;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z17;
    }

    public static boolean Y(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        r45.a90 a90Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
        if (m70371x485d7 == null || (a90Var = m70371x485d7.f39014x86965dde) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        boolean X = X(a90Var.f451370e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return X;
    }

    public static boolean Z(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdapterElder", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (context != null) {
            boolean z17 = i65.a.q(context) > 1.1f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdapterElder", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return z17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdUtil", "isAdapterElder() called with: context = [" + context + "]");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdapterElder", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return false;
    }

    public static void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adChannelCgiReport", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                ib4.i iVar = new ib4.i(str, str2);
                gm0.j1.i();
                gm0.j1.n().f354821b.g(iVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "adChannelCgiReport, main, channel=" + str + ", content=" + str2);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69931x8bf45e64(str, str2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "adChannelCgiReport, tools, channel=" + str + ", content=" + str2);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69931x8bf45e64(str, str2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "adChannelCgiReport, other process, channel=" + str + ", content=" + str2);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "adChannelCgiReport, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adChannelCgiReport", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static boolean a0(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdapterElderSuper", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (context != null) {
            boolean z17 = i65.a.q(context) > 1.12f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdapterElderSuper", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return z17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdUtil", "isAdapterElderSuper() called with: context = [" + context + "]");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdapterElderSuper", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return false;
    }

    public static float b(android.content.Context context, android.widget.TextView textView, float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustAutoTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (context == null || textView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "adjustAutoTextSize, but context or textView is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustAutoTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0.0f;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "adjustAutoTextSize, tryMaxSizePx is " + f17 + ", availableWidth is " + f18);
        if (f17 <= 0.0f || f18 <= 0.0f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustAutoTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0.0f;
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.set(textView.getPaint());
        paint.setTextSize(f17);
        int b17 = i65.a.b(context, 1);
        java.lang.String charSequence = textView.getText().toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdUtil", "adjustAutoTextSize, text is null or empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustAutoTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0.0f;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        while (true) {
            float f19 = b17;
            if (f17 <= f19 || paint.measureText(charSequence) <= f18) {
                break;
            }
            f17 -= 1.0f;
            if (f17 <= f19) {
                paint.setTextSize(f19);
                f17 = f19;
                break;
            }
            paint.setTextSize(f17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "adjustAutoTextSize, costTime is " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", trySize is " + f17);
        textView.setTextSize(0, f17);
        float measureText = paint.measureText(charSequence);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustAutoTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return measureText;
    }

    public static boolean b0(android.app.Activity activity) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDarkStatusBar", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            if (activity == null) {
                boolean C = com.p314xaae8f345.mm.ui.bk.C();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDarkStatusBar", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return C;
            }
            if ((activity.getWindow().getDecorView().getSystemUiVisibility() & 8192) != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDarkStatusBar", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDarkStatusBar", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "isDarkStatusBar, exp=" + e17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDarkStatusBar", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
    }

    public static float c(android.content.Context context, android.widget.TextView textView, float f17, float f18, float f19) {
        java.lang.String str;
        java.lang.String str2;
        float f27 = f17;
        java.lang.String str3 = "adjustAutoTextSize";
        java.lang.String str4 = "com.tencent.mm.plugin.sns.data.SnsAdUtil";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustAutoTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (context == null || textView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "adjustAutoTextSize, but context or textView is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustAutoTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0.0f;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "adjustAutoTextSize, tryMaxSizePx is " + f27 + ", availableWidth is " + f18 + ", availableHeight is " + f19);
        if (f27 <= 0.0f || f18 <= 0.0f || f19 <= 0.0f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustAutoTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0.0f;
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.set(textView.getPaint());
        paint.setTextSize(f27);
        int b17 = i65.a.b(context, 1);
        java.lang.String charSequence = textView.getText().toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdUtil", "adjustAutoTextSize, text is null or empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustAutoTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0.0f;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        while (true) {
            float f28 = b17;
            if (f27 <= f28) {
                str = str3;
                str2 = str4;
                break;
            }
            if (paint.measureText(charSequence) <= f18) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTextViewHeight", str4);
                android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                double ceil = java.lang.Math.ceil(fontMetrics.bottom - fontMetrics.top);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextViewHeight", str4);
                str = str3;
                str2 = str4;
                if (ceil <= f19) {
                    break;
                }
            } else {
                str = str3;
                str2 = str4;
            }
            f27 -= 1.0f;
            if (f27 <= f28) {
                paint.setTextSize(f28);
                f27 = f28;
                break;
            }
            paint.setTextSize(f27);
            str3 = str;
            str4 = str2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "adjustAutoTextSize, costTime is " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", trySize is " + f27);
        textView.setTextSize(0, f27);
        float measureText = paint.measureText(charSequence);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
        return measureText;
    }

    public static boolean c0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDebugEnv", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        boolean z17 = z65.c.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDebugEnv", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z17;
    }

    public static java.lang.String d(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendClickTimeToWeAppPath", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && z17) {
                str = za4.z0.c(str, java.lang.String.format("gdt_clicktime=%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendClickTimeToWeAppPath", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return str;
    }

    public static boolean d0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDebugerEnv", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c || z65.c.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDebugerEnv", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z17;
    }

    public static java.lang.String e(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return str;
        }
        java.lang.String str3 = str2 + str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return str3;
    }

    public static boolean e0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isForbidUpdateContact", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z17 = !android.text.TextUtils.isEmpty(str) && str.contains("<forbidUpdateContact>1</forbidUpdateContact>");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isForbidUpdateContact", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z17;
    }

    public static void f(com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad, i64.b1 b1Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendSnsAdClickParams", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        g(c11137xb05b06ad, b1Var, c17933xe8d1b226, i17, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendSnsAdClickParams", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static boolean f0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLargeWindowCheckPadDisable", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ad_large_window_pad_check_disable, 0) > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLargeWindowCheckPadDisable", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "clicfg_ad_large_window_pad_check_disable, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLargeWindowCheckPadDisable", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
    }

    public static void g(com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad, i64.b1 b1Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, int i18) {
        long h17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendSnsAdClickParams", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        long j17 = 0;
        if (b1Var == null) {
            h17 = 0;
        } else {
            try {
                h17 = b1Var.h(c17933xe8d1b226.m70363x51f8f990(), i17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "appendSnsAdClickParams exp=" + e17.toString() + ", clockPos=" + i17);
            }
        }
        c11137xb05b06ad.f153010r = h17;
        if (b1Var != null) {
            j17 = b1Var.g(c17933xe8d1b226.f68891x29d1292e);
        }
        c11137xb05b06ad.f153011s = j17;
        c11137xb05b06ad.f153012t = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendSnsAdClickParams", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static boolean g0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPadForceFullScreenWebView", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ad_pad_open_full_screen_webview, 0) > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPadForceFullScreenWebView", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "isPadForceFullScreenWebView, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPadForceFullScreenWebView", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
    }

    public static boolean h(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771, int i17, i64.b1 b1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkOpenApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (c17933xe8d1b226 != null && c17902x72cc1771 != null) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a aVar = c17902x72cc1771.f38051x52710f64;
                if (aVar != null) {
                    if (ik1.b.b(context, aVar.f247445b)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "checkOpenApp isInstalled=true, " + c17902x72cc1771.f38051x52710f64.m70478x9616526c());
                        i64.p0 p0Var = new i64.p0(java.lang.String.valueOf(c17933xe8d1b226.f68891x29d1292e), c17902x72cc1771.f38104xce64ddf1, c17933xe8d1b226.m70354x74235b3e() != null ? c17933xe8d1b226.m70354x74235b3e().f38172xd73c98cc : "", 2, c17902x72cc1771.aid, c17902x72cc1771.f38103xc060c120, c17902x72cc1771.pId);
                        l44.z.q(true, c17933xe8d1b226, i17);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a aVar2 = c17902x72cc1771.f38051x52710f64;
                        if (o0(context, aVar2.f247444a, aVar2.f247445b, aVar2.f247447d, aVar2.f247446c, 0, p0Var)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkOpenApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                            return true;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "checkOpenApp failed, " + c17902x72cc1771.f38051x52710f64.m70478x9616526c());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a aVar3 = c17902x72cc1771.f38051x52710f64;
                        l44.k.b(aVar3.f247445b, aVar3.f247446c);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "checkOpenApp isInstalled=false, " + c17902x72cc1771.f38051x52710f64.m70478x9616526c());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a aVar4 = c17902x72cc1771.f38051x52710f64;
                        l44.k.b(aVar4.f247445b, aVar4.f247446c);
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "checkOpenApp exp=" + th6.toString());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkOpenApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return false;
    }

    public static boolean h0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPreviewAd", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAd", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z17 = c17933xe8d1b226 != null && c17933xe8d1b226.m70377x3172ed();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAd", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPreviewAd", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
        if (m70354x74235b3e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPreviewAd", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        boolean z18 = m70354x74235b3e.f38267xb3033354 == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPreviewAd", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z18;
    }

    public static boolean i(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (c17933xe8d1b226 == null || c17902x72cc1771 == null || c17702x544f64e9 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "checkTryProcessAdAppMarket, input param is wrong");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a aVar = c17902x72cc1771.f38051x52710f64;
        java.lang.String str = aVar != null ? aVar.f247445b : "";
        if (android.text.TextUtils.isEmpty(str)) {
            str = c17702x544f64e9.B;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
        if (m70354x74235b3e == null || m70354x74235b3e.f38274x8e006dda != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.A(1958, 8);
        java.lang.String str2 = m70354x74235b3e.f38172xd73c98cc;
        android.content.Intent intent = m70354x74235b3e.f38225x29e33eb9;
        if (android.text.TextUtils.isEmpty(str) && intent != null) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "target_app_id");
        }
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "checkTryProcessAdAppMarket, the target package is empty!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        if (da4.a.f(intent)) {
            B0(java.lang.String.valueOf(c17933xe8d1b226.f68891x29d1292e), c17902x72cc1771.f38104xce64ddf1, str2, 4, "0");
        } else {
            B0(java.lang.String.valueOf(c17933xe8d1b226.f68891x29d1292e), c17902x72cc1771.f38104xce64ddf1, str2, 4, "1");
        }
        if (!da4.a.e(intent)) {
            B0(java.lang.String.valueOf(c17933xe8d1b226.f68891x29d1292e), c17902x72cc1771.f38104xce64ddf1, str2, 1, "1");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        B0(java.lang.String.valueOf(c17933xe8d1b226.f68891x29d1292e), c17902x72cc1771.f38104xce64ddf1, str2, 1, "0");
        l44.z.q(false, c17933xe8d1b226, i17);
        g0Var.A(1958, 9);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return true;
    }

    public static boolean i0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isReportAppInstallStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_report_app_install_status, 1) > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReportAppInstallStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "isReportAppInstallStatus, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReportAppInstallStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        }
    }

    public static boolean j(java.lang.String str, android.content.Intent intent, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "checkTryProcessAdAppMarket, intent is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "target_app_id");
        }
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "checkTryProcessAdAppMarket, the target package is empty!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        if (da4.a.f(intent)) {
            B0("", str2, str3, 4, "0");
        } else {
            B0("", str2, str3, 4, "1");
        }
        if (da4.a.e(intent)) {
            B0("", str2, str3, 1, "0");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        }
        B0("", str2, str3, 1, "1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return false;
    }

    public static boolean j0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isStrictDebugEnv", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isStrictDebugEnv", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return false;
    }

    public static java.lang.String k(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ParamsToLocalId", "clearParamsToLocalId, localIdAppendParams = " + str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || !str.contains(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return str;
        }
        int indexOf = str.indexOf(str2);
        if (indexOf <= -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return str;
        }
        try {
            str = str.substring(0, indexOf) + str.substring(indexOf + str2.length());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ParamsToLocalId", "clearParamsToLocalId, " + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return str;
    }

    public static boolean k0(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        r45.a90 a90Var;
        java.util.LinkedList linkedList;
        r45.jj4 jj4Var;
        r45.lj4 lj4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isVerticalVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (c19807x593d1720 != null && (a90Var = c19807x593d1720.f39014x86965dde) != null && (linkedList = a90Var.f451373h) != null && linkedList.size() > 0 && (jj4Var = (r45.jj4) c19807x593d1720.f39014x86965dde.f451373h.get(0)) != null && (lj4Var = jj4Var.f459398p) != null) {
            float f17 = lj4Var.f461053d;
            if (f17 > 0.0f) {
                float f18 = lj4Var.f461054e;
                if (f18 > 0.0f) {
                    boolean z17 = ((int) f18) > ((int) f17);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isVerticalVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                    return z17;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isVerticalVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return false;
    }

    public static void l(android.app.Activity activity) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertActivityToTranslucent", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "convertActivityToTranslucent:" + activity);
            if (activity != null) {
                db5.f.c(activity, null);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "convertActivityToTranslucent, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertActivityToTranslucent", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static void l0(android.widget.TextView textView, float f17) {
        int i17;
        android.graphics.drawable.ColorDrawable colorDrawable;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("justifyString", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        android.graphics.drawable.ColorDrawable colorDrawable2 = new android.graphics.drawable.ColorDrawable(16777215);
        android.graphics.drawable.ColorDrawable colorDrawable3 = new android.graphics.drawable.ColorDrawable(16777215);
        android.text.SpannableString spannableString = new android.text.SpannableString(" ");
        android.text.SpannableString spannableString2 = new android.text.SpannableString(" ");
        java.lang.String charSequence = textView.getText().toString();
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (android.text.TextUtils.isEmpty(charSequence)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("justifyString", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return;
        }
        float M = M(textView, charSequence);
        if (M >= f17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("justifyString", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return;
        }
        char[] charArray = charSequence.trim().toCharArray();
        int length = charArray.length;
        if (length <= 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("justifyString", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return;
        }
        int i18 = length - 1;
        int i19 = (int) ((f17 - M) / i18);
        int i27 = ((int) f17) - ((i19 * i18) + ((int) M));
        int i28 = 0;
        while (i28 < length) {
            spannableStringBuilder.append(charArray[i28]);
            if (i28 == i18) {
                i17 = i27;
                colorDrawable = colorDrawable3;
                z17 = true;
            } else if (i28 == 0) {
                colorDrawable3.setBounds(0, 0, i27 + i19, 0);
                android.text.style.ImageSpan imageSpan = new android.text.style.ImageSpan(colorDrawable3);
                i17 = i27;
                colorDrawable = colorDrawable3;
                z17 = true;
                spannableString2.setSpan(imageSpan, 0, 1, 17);
                spannableStringBuilder.append((java.lang.CharSequence) spannableString2);
            } else {
                i17 = i27;
                colorDrawable = colorDrawable3;
                z17 = true;
                colorDrawable2.setBounds(0, 0, i19, 0);
                spannableString.setSpan(new android.text.style.ImageSpan(colorDrawable2), 0, 1, 17);
                spannableStringBuilder.append((java.lang.CharSequence) spannableString);
            }
            i28++;
            colorDrawable3 = colorDrawable;
            i27 = i17;
        }
        textView.setText(spannableStringBuilder);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("justifyString", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static java.lang.String m(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            java.lang.String t07 = ca4.z0.t0(D0(str));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return t07;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
    }

    public static void m0(long j17, java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openAdCanvasById", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openAdCanvasById", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        p94.v0 v0Var = new p94.v0();
        v0Var.f434451f = str2;
        v0Var.f434450e = i17;
        n0(null, j17, str, v0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openAdCanvasById", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openAdCanvasById", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean n() {
        /*
            java.lang.String r0 = "SnsAdUtil"
            java.lang.String r1 = "disableAllViewHeightInFloatWeb called"
            java.lang.String r2 = "disableAllViewHeightInFloatWeb"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.data.SnsAdUtil"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            r4 = 0
            java.lang.Class<e42.e0> r5 = e42.e0.class
            i95.m r5 = i95.n0.c(r5)     // Catch: java.lang.Throwable -> L2e
            e42.e0 r5 = (e42.e0) r5     // Catch: java.lang.Throwable -> L2e
            e42.d0 r6 = e42.d0.clicfg_ad_disable_landing_page_all_top_view_height_android     // Catch: java.lang.Throwable -> L2e
            h62.d r5 = (h62.d) r5     // Catch: java.lang.Throwable -> L2e
            int r5 = r5.Ni(r6, r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            r6.append(r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L2c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L2c
            goto L41
        L2c:
            r1 = move-exception
            goto L30
        L2e:
            r1 = move-exception
            r5 = r4
        L30:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "disableAllViewHeightInFloatWeb, exp="
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
        L41:
            if (r5 <= 0) goto L44
            r4 = 1
        L44:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ca4.m0.n():boolean");
    }

    public static void n0(android.content.Context context, long j17, java.lang.String str, p94.v0 v0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openAdCanvasById", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (context == null) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "openAdCanvasById, use MMApplicationContext");
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "openAdCanvasById, canvasId=" + j17 + ", exp=" + th6.toString());
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_landing_pages_pageid", j17);
        intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
        int i17 = v0Var != null ? v0Var.f434450e : 0;
        intent.putExtra("sns_landing_pages_ad_info", n74.d2.a(str, i17));
        intent.putExtra("sns_landig_pages_from_source", i17);
        if (v0Var != null) {
            intent.putExtra("sns_landing_page_half_screen_mode", v0Var.f434446a);
            intent.putExtra("sns_landing_page_is_preview_page_fullscreen", v0Var.f434459n);
            if (v0Var.f434446a) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1898, 6);
                n54.i.d(true);
                intent.putExtra("sns_landing_page_half_screen_height", v0Var.f434448c);
                intent.putExtra("sns_landing_page_half_screen_forbid_slide_top", v0Var.f434449d);
                intent.putExtra("sns_landing_page_open_from_half_screen_mode", v0Var.f434447b);
            }
            if (!android.text.TextUtils.isEmpty(v0Var.f434451f)) {
                intent.putExtra("sns_landing_pages_extra_param", v0Var.f434451f);
            }
            if (!android.text.TextUtils.isEmpty(v0Var.f434452g)) {
                intent.putExtra("sns_landing_page_canvas_dynamicinfo", v0Var.f434452g);
            }
            if (v0Var.f434453h) {
                intent.putExtra("sns_landing_is_native_sight_ad", true);
            }
            int i18 = v0Var.f434454i;
            if (i18 > 0) {
                intent.putExtra("sns_landing_pages_no_store", i18);
            }
            int i19 = v0Var.f434455j;
            if (i19 > 0) {
                intent.putExtra("sns_landing_pages_from_outer_index", i19);
            }
            long j18 = v0Var.f434457l;
            if (j18 > 0) {
                intent.putExtra("sns_landing_page_sight_video_seek_time", j18);
            }
            int i27 = v0Var.f434458m;
            if (i27 > 0) {
                intent.putExtra("sns_landing_page_is_direct_download", i27);
            }
            if (l64.a.c(i17)) {
                intent.putExtra("sns_landing_pages_forbid_back_to_biz_app", v0Var.f434456k);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "openAdCanvasById, bundle==null");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "openAdCanvasById, canvasId=" + j17 + ", bundle=" + v0Var);
        j45.l.j(context, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openAdCanvasById", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean o() {
        /*
            java.lang.String r0 = "SnsAdUtil"
            java.lang.String r1 = "disableIpInteractHaptic called"
            java.lang.String r2 = "disableIpInteractHaptic"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.data.SnsAdUtil"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            r4 = 0
            java.lang.Class<e42.e0> r5 = e42.e0.class
            i95.m r5 = i95.n0.c(r5)     // Catch: java.lang.Throwable -> L2e
            e42.e0 r5 = (e42.e0) r5     // Catch: java.lang.Throwable -> L2e
            e42.d0 r6 = e42.d0.clicfg_ad_ip_interact_comment_haptic_feedback_android     // Catch: java.lang.Throwable -> L2e
            h62.d r5 = (h62.d) r5     // Catch: java.lang.Throwable -> L2e
            int r5 = r5.Ni(r6, r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            r6.append(r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L2c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L2c
            goto L41
        L2c:
            r1 = move-exception
            goto L30
        L2e:
            r1 = move-exception
            r5 = r4
        L30:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "disableIpInteractHaptic, exp="
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
        L41:
            if (r5 <= 0) goto L44
            r4 = 1
        L44:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ca4.m0.o():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean o0(android.content.Context r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, int r33, i64.p0 r34) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ca4.m0.o0(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, i64.p0):boolean");
    }

    public static boolean p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableFixAppendUri", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_enable_fix_append_uri_android, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "enableFixAppendUri called" + Ni);
        boolean z17 = Ni > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableFixAppendUri", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z17;
    }

    public static void p0(android.content.Context context, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, android.content.Intent intent) {
        int i18;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openEggLandingPage", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "openGestureLandingPage, source=" + i17 + ", snsId=" + c17933xe8d1b226.f68891x29d1292e);
            int[] iArr = new int[2];
            if (view != null) {
                view.getLocationInWindow(iArr);
                i19 = view.getWidth();
                i18 = view.getHeight();
            } else {
                i18 = 0;
                i19 = 0;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("img_gallery_left", iArr[0]);
            intent2.putExtra("img_gallery_top", iArr[1]);
            intent2.putExtra("img_gallery_width", i19);
            intent2.putExtra("img_gallery_height", i18);
            intent2.putExtra("sns_landing_pages_share_sns_id", c17933xe8d1b226.m70367x7525eefd());
            intent2.putExtra("sns_landing_pages_rawSnsId", c17933xe8d1b226.m70371x485d7().Id);
            intent2.putExtra("sns_landing_pages_ux_info", c17933xe8d1b226.m70375x338a8cc7());
            if (intent != null) {
                intent2.putExtras(intent);
            }
            java.lang.String m70123x77665b99 = c17933xe8d1b226.m70354x74235b3e().m70123x77665b99();
            if (!za4.z0.v(m70123x77665b99, "adCanvasInfo")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "openEggLandingPage, invalid adFullCardGestureCanvasInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 118);
                if (!c17933xe8d1b226.m70354x74235b3e().m70146xae00c4ba()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "openEggLandingPage, is not landingpageAd");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openEggLandingPage", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                    return;
                } else {
                    m70123x77665b99 = c17933xe8d1b226.m70354x74235b3e().xml.replaceAll("(?s)<adFullCardGestureCanvasInfo[^>]*>.*?</adFullCardGestureCanvasInfo>", "");
                    if (!za4.z0.v(m70123x77665b99, "adCanvasInfo")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "openEggLandingPage, invalid adCanvasInfo too");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openEggLandingPage", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                        return;
                    }
                }
            }
            intent2.putExtra("sns_landing_page_is_interactive_canvas", true);
            intent2.putExtra("sns_landing_pages_xml", m70123x77665b99);
            a54.g.b(context, intent2, m70123x77665b99);
            intent2.putExtra("sns_landig_pages_from_source", i17);
            intent2.putExtra("sns_landing_pages_xml_prefix", dm.n.f67493x36901555);
            if (!c17933xe8d1b226.m70354x74235b3e().f38248xdb8989da) {
                intent2.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
            }
            intent2.putExtra("sns_landing_is_native_sight_ad", true);
            intent2.putExtra("sns_landing_page_start_time", java.lang.System.currentTimeMillis());
            if (c17933xe8d1b226.m70418xa6d27920()) {
                intent2.putExtra("sns_landing_page_is_gesture_twist_ad", true);
            } else if (c17933xe8d1b226.m70409x57def53f()) {
                intent2.putExtra("sns_landing_page_is_gesture_shake_ad", true);
            } else if (c17933xe8d1b226.m70400xed24eaaf()) {
                if (c17933xe8d1b226.m70354x74235b3e().f38182x86831750.f38341xd41fa323 != null) {
                    intent2.putExtra("sns_landing_page_is_longpress_ad", false);
                } else {
                    intent2.putExtra("sns_landing_page_is_longpress_ad", true);
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/data/SnsAdUtil", "openEggLandingPage", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;ILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/sns/data/SnsAdUtil", "openEggLandingPage", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;ILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (context instanceof android.app.Activity) {
                ((android.app.Activity) context).overridePendingTransition(0, 0);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "openGestureLandingPage, exp=" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openEggLandingPage", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean q() {
        /*
            java.lang.String r0 = "SnsAdUtil"
            java.lang.String r1 = "enablePreloadWebView called"
            java.lang.String r2 = "enablePreloadWebView"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.data.SnsAdUtil"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            r4 = 0
            java.lang.Class<e42.e0> r5 = e42.e0.class
            i95.m r5 = i95.n0.c(r5)     // Catch: java.lang.Throwable -> L2e
            e42.e0 r5 = (e42.e0) r5     // Catch: java.lang.Throwable -> L2e
            e42.d0 r6 = e42.d0.clicfg_sns_ad_enable_ad_preload_webview_android     // Catch: java.lang.Throwable -> L2e
            h62.d r5 = (h62.d) r5     // Catch: java.lang.Throwable -> L2e
            int r5 = r5.Ni(r6, r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            r6.append(r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L2c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L2c
            goto L41
        L2c:
            r1 = move-exception
            goto L30
        L2e:
            r1 = move-exception
            r5 = r4
        L30:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "enablePreloadWebView, exp="
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
        L41:
            if (r5 <= 0) goto L44
            r4 = 1
        L44:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ca4.m0.q():boolean");
    }

    public static java.lang.String q0(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseColor", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        try {
            if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
                str = java.lang.String.format("#%02x%s", java.lang.Integer.valueOf((int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1(str2) * 255.0d)), str.substring(1));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "parseColor exp=" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseColor", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return str;
    }

    public static int r(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, int i18) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fetchAdLogo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (c17933xe8d1b226 == null || !c17933xe8d1b226.m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fetchAdLogo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70356x450e1efa = i17 == 2 ? c17933xe8d1b226.m70356x450e1efa() : c17933xe8d1b226.m70346x10413e67();
        if (m70356x450e1efa != null && m70356x450e1efa.m70102x6a4a5724(i18) && (c17702x544f64e9 = m70356x450e1efa.f38072xb6139d47.get(i18)) != null) {
            int J2 = J(c17702x544f64e9);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fetchAdLogo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return J2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkCanJumpCanvas", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
            i19 = m70354x74235b3e.f38255x57660db8;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkCanJumpCanvas", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        }
        if (i19 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkCanJumpCanvas", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            z17 = true;
        } else if (i19 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkCanJumpCanvas", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            z17 = false;
        } else {
            z17 = m70354x74235b3e.m70146xae00c4ba() && za4.z0.u(c17933xe8d1b226.m70351xaa22b9ed().f67593x28cf0d8f);
            if (z17) {
                m70354x74235b3e.f38255x57660db8 = 1;
            } else {
                m70354x74235b3e.f38255x57660db8 = 0;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkCanJumpCanvas", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fetchAdLogo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0;
        }
        if (m70356x450e1efa != null) {
            int i27 = m70356x450e1efa.f38067xf8d8cf13;
            if (i27 == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fetchAdLogo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return 1;
            }
            if (i27 == 9 || i27 == 10) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fetchAdLogo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return 3;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fetchAdLogo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return 0;
    }

    public static boolean r0(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, int i17, int i18, i64.p0 p0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            boolean i19 = i(c17933xe8d1b226, c17902x72cc1771, c17702x544f64e9, i17);
            if (i19) {
                java.lang.String str = c17933xe8d1b226.m70354x74235b3e().f38172xd73c98cc;
                android.content.Intent intent = c17933xe8d1b226.m70354x74235b3e().f38225x29e33eb9;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a aVar = c17902x72cc1771.f38051x52710f64;
                java.lang.String str2 = aVar != null ? aVar.f247445b : "";
                if (android.text.TextUtils.isEmpty(str2)) {
                    str2 = c17702x544f64e9.B;
                }
                if (android.text.TextUtils.isEmpty(str2) && intent != null) {
                    str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "target_app_id");
                }
                java.lang.String str3 = str2;
                k44.i iVar = c17702x544f64e9.I;
                if (iVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(iVar.a(), c17702x544f64e9.I.b(), c17702x544f64e9.I.c())) {
                    l44.z.g(new ca4.d(c17902x72cc1771.f38104xce64ddf1, str, c17902x72cc1771.aid, c17902x72cc1771.f38103xc060c120, c17902x72cc1771.pId), 1);
                    z0(context, intent, str3, java.lang.String.valueOf(c17933xe8d1b226.f68891x29d1292e), c17902x72cc1771.f38104xce64ddf1, str, i18 == 1 ? 2 : 0, c17933xe8d1b226, i17, p0Var);
                } else {
                    h44.c a17 = h44.c.a(c17702x544f64e9);
                    if (a17 != null) {
                        if (p0Var != null) {
                            p0Var.f370813j = 106;
                        }
                        a17.e(p0Var);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.xml.C17713x74160c71 c17713x74160c71 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.xml.C17713x74160c71(context);
                        ca4.j0 j0Var = new ca4.j0(context, intent, str3, c17933xe8d1b226, c17902x72cc1771, str, i17, p0Var);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
                        c17713x74160c71.f244222x = j0Var;
                        c17713x74160c71.f244223y = false;
                        c17713x74160c71.u(a17);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return i19;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdUtil", "processAdAppMarket has something wrong");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
    }

    public static int s(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fromDPToPixOrigin", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        int round = java.lang.Math.round(j65.f.f() * i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fromDPToPixOrigin", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return round;
    }

    public static void s0(android.content.Context context, android.content.Intent intent, int i17, h44.c cVar, ya2.n1 n1Var) {
        java.lang.String str;
        java.lang.String str2;
        i64.p0 p0Var;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processFinderHalfScreenAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdUtil", "processAdAppMarket has something wrong");
        }
        if (context == null || intent == null || n1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "context or intent or halfScreenListener is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processFinderHalfScreenAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return;
        }
        java.lang.String str4 = "";
        if (cVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPackageName", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
            java.lang.String str5 = cVar.f360461c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPackageName", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
            i64.p0 d17 = cVar.d();
            if (d17 != null) {
                d17.f370813j = 106;
                str4 = d17.f370805b;
                str3 = d17.f370806c;
            } else {
                str3 = "";
            }
            p0Var = d17;
            java.lang.String str6 = str3;
            str = str4;
            str4 = str5;
            str2 = str6;
        } else {
            str = "";
            str2 = str;
            p0Var = null;
        }
        if (android.text.TextUtils.isEmpty(str4)) {
            str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "target_app_id");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17709x80c95f7 c17709x80c95f7 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17709x80c95f7(context);
        ca4.k0 k0Var = new ca4.k0(context, intent, str4, str, str2, i17, p0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        c17709x80c95f7.f244194s = k0Var;
        c17709x80c95f7.f244195t = false;
        c17709x80c95f7.r(cVar, n1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processFinderHalfScreenAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static int t(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdAppInstallStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        int i17 = 0;
        if (c17933xe8d1b226 != null) {
            try {
                if (c17933xe8d1b226.m70377x3172ed() && (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) != null && !android.text.TextUtils.isEmpty(m70354x74235b3e.f38247x9b327e33)) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    i17 = ik1.b.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, m70354x74235b3e.f38247x9b327e33) ? 2 : 1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1893, 12);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "getAdAppInstallStatus, pkg=" + m70354x74235b3e.f38247x9b327e33 + ", installState=" + i17 + ", timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "appInstalled exp=" + th6.toString());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdAppInstallStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        if (r5 == 0) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t0(int r4, int r5) {
        /*
            java.lang.String r0 = "reportAdFinderTopicImageDownload"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.data.SnsAdUtil"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            r2 = 2
            r3 = 1
            if (r4 != r3) goto L10
            if (r5 != 0) goto L21
        Le:
            r2 = r3
            goto L21
        L10:
            r3 = 3
            if (r4 != r2) goto L18
            if (r5 != 0) goto L16
            goto Le
        L16:
            r2 = 4
            goto L21
        L18:
            if (r4 != r3) goto L20
            if (r5 != 0) goto L1e
            r2 = 5
            goto L21
        L1e:
            r2 = 6
            goto L21
        L20:
            r2 = 0
        L21:
            if (r2 == 0) goto L2a
            com.tencent.mm.plugin.report.service.g0 r4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE     // Catch: java.lang.Throwable -> L2a
            r5 = 1606(0x646, float:2.25E-42)
            r4.A(r5, r2)     // Catch: java.lang.Throwable -> L2a
        L2a:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca4.m0.t0(int, int):void");
    }

    public static int u(java.lang.String str, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdBreakFrameFullCardContainerHeight", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        int e17 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx) + com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.j_);
        int i17 = (int) (f17 * 0.75f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "getAdBreakFrameFullCardContainerHeight, fullCardContainerMargin is " + e17 + ", fullCardContainerHeight is " + i17);
        int i18 = i17 + e17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdBreakFrameFullCardContainerHeight", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return i18;
    }

    public static int u0(e42.b0 b0Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("safeGetExptValue", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(b0Var, i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeGetExptValue", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return Ni;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "safeGetExptValue, exp=" + e17);
            ca4.q.c("safeGetExptValue", new java.lang.RuntimeException());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeGetExptValue", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return i17;
        }
    }

    public static int v(java.lang.String str, int i17, boolean z17) {
        int e17;
        int e18;
        int b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdBreakFrameLeftMargin", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (z17) {
            int i18 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
            int e19 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.aav);
            if (i17 == 0) {
                int b18 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 14);
                int e27 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
                int e28 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.aa7);
                int b19 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 2);
                e18 = e28 + b19 + b19;
                e17 = b18 + (((((i18 - b18) - e27) - e18) - e19) / 2);
                b17 = e17 + e18;
            } else {
                int e29 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561252dc);
                int e37 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                int e38 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
                int i19 = e29 + e37;
                b17 = i19 + (((((i18 - e38) - e38) - i19) - e19) / 2);
            }
        } else if (i17 == 0) {
            int e39 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.aa7);
            int b27 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 2);
            b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 14) + e39 + b27 + b27;
        } else {
            e17 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561252dc);
            e18 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
            b17 = e17 + e18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "getAdLeftMargin, totalLeftMargin is " + b17 + ", and inLargeWindow is " + z17 + ", source is " + i17);
        int max = java.lang.Math.max(b17, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdBreakFrameLeftMargin", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return max;
    }

    public static void v0() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClickHapticFeedbackForClickLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            try {
                i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_social_like_haptic_feedback_level_android, 0);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "clicfg_ad_social_like_haptic_feedback_level_android, exp=" + th6);
                i17 = 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "setClickHapticFeedbackForClickLike, gray is " + i17);
            long j17 = i17 == 1 ? 50L : i17 == 2 ? 80L : i17 == 3 ? 100L : 0L;
            if (j17 > 0) {
                ca4.z0.I0(new long[]{0, j17});
            }
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "setClickHapticFeedbackForClickLike, exp is " + th7);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickHapticFeedbackForClickLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static int w(java.lang.String str, int i17, android.widget.TextView textView) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdBreakFrameTopMargin", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        int N = (int) N(textView);
        int e17 = i17 == 0 ? com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561410hq) * 2 : com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "getAdBreakFrameTopMargin, nickNameHeight is " + N + ", extraPadding is " + e17 + ", and source is " + i17);
        int i18 = N + e17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdBreakFrameTopMargin", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return i18;
    }

    public static void w0() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClickHapticFeedbackForIpComment", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            try {
                i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_ip_comment_haptic_feedback_level_android, 0);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "clicfg_ad_ip_comment_haptic_feedback_level_android, exp=" + th6);
                i17 = 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "setClickHapticFeedbackForIpComment, gray is " + i17);
            long j17 = i17 == 1 ? 50L : i17 == 2 ? 80L : i17 == 3 ? 100L : 0L;
            if (j17 > 0) {
                ca4.z0.I0(new long[]{0, j17});
            }
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "setClickHapticFeedbackForIpComment, exp is " + th7);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickHapticFeedbackForIpComment", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static ca4.c x(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdCommonData", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        ca4.c cVar = new ca4.c();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "getAdCommonData: uxInfo is null or nil");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdCommonData", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return cVar;
        }
        try {
            java.lang.String[] split = str.split("\\|");
            java.lang.String str2 = "";
            if (split.length >= 1) {
                java.lang.String str3 = split[0];
                if (str3 == null) {
                    str3 = "";
                }
                cVar.f121380d = str3;
            }
            if (split.length >= 2) {
                java.lang.String str4 = split[1];
                if (str4 == null) {
                    str4 = "";
                }
                cVar.f121381e = str4;
            }
            if (split.length >= 8) {
                java.lang.String str5 = split[7];
                if (str5 != null) {
                    str2 = str5;
                }
                cVar.f121382f = str2;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "getAdCommonData: exp is " + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdCommonData", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return cVar;
    }

    public static void x0(android.widget.TextView textView, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFixedFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (textView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFixedFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return;
        }
        try {
            textView.setTextSize(0, i65.a.f(textView.getContext(), i17));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "setFixedFontSize, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFixedFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static int y(java.lang.String str, android.content.Context context, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdDisplayWidth", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        int z18 = z(str, context, i17, z17, com.p314xaae8f345.mm.R.C30860x5b28f31.aav);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdDisplayWidth", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z18;
    }

    public static void y0(android.widget.TextView textView, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLimitedScaleFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (textView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLimitedScaleFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return;
        }
        try {
            textView.setTextSize(0, I(i17));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "setLimitedScaleFontSize, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLimitedScaleFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static int z(java.lang.String str, android.content.Context context, int i17, boolean z17, int i18) {
        int dimensionPixelSize;
        int i19;
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdDisplayWidth", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "getAdDisplayWidth but context is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdDisplayWidth", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0;
        }
        if (z17) {
            i27 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i18);
        } else {
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            int min = java.lang.Math.min(windowManager.getDefaultDisplay().getWidth(), windowManager.getDefaultDisplay().getHeight());
            int b17 = i65.a.b(context, 56);
            if (i17 == 0) {
                dimensionPixelSize = i65.a.b(context, 14);
                i19 = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
            } else {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
                i19 = dimensionPixelSize;
            }
            i27 = ((min - b17) - dimensionPixelSize) - i19;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "getAdDisplayWidth, remainSpace is " + i27 + ", and inLargeWindow is " + z17);
        int max = java.lang.Math.max(i27, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdDisplayWidth", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return max;
    }

    public static void z0(android.content.Context context, android.content.Intent intent, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i18, i64.p0 p0Var) {
        java.lang.String str5;
        java.lang.String str6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70347x10413e67;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startMarketActivity", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (context == null || intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdUtil", "startMarketActivity input param is error");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startMarketActivity", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return;
        }
        try {
            if (!(context instanceof android.app.Activity)) {
                intent.addFlags(268435456);
            }
            java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "market_app_name");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str7 = "";
            java.lang.String str8 = l17 == null ? "" : l17;
            if (c17933xe8d1b226 == null || (m70347x10413e67 = c17933xe8d1b226.m70347x10413e67(i18)) == null) {
                str5 = "";
                str6 = str5;
            } else {
                str7 = m70347x10413e67.aid;
                str6 = m70347x10413e67.f38103xc060c120;
                str5 = m70347x10413e67.pId;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                str7 = D(str3);
            }
            java.lang.String str9 = str7;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                str6 = P(str3);
            }
            java.lang.String str10 = str6;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                str5 = L(str3);
            }
            ca4.d dVar = new ca4.d(str3, str4, str9, str10, str5);
            if (p0Var != null) {
                dVar.c(p0Var.f370813j);
            }
            if (i17 != 2) {
                l44.z.d(dVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.d(context, intent.getPackage(), "", intent, str8, new ca4.l0(i17, str2, str3, str4, dVar, str, c17933xe8d1b226, i18), i17);
        } catch (java.lang.Throwable unused) {
            B0(str2, str3, str4, 2, "1");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startMarketActivity", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }
}
