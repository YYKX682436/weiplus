package su4;

/* loaded from: classes8.dex */
public abstract class r2 {
    public static android.content.Intent a() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        intent.putExtra("neverGetA8Key", true);
        return intent;
    }

    public static java.util.Map b(int i17, boolean z17, int i18) {
        return c(i17, z17, i18, "");
    }

    public static java.util.Map c(int i17, boolean z17, int i18, java.lang.String str) {
        return d(i17, z17, i18, str, "", "", "", "", "", "", "");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0175, code lost:
    
        if (su4.o2.d("bizUnionTopEntry").optInt("sugSwitch") == 1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0182, code lost:
    
        if (su4.o2.d("bizEntry").optInt("sugSwitch") == 1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0222, code lost:
    
        if (su4.o2.d("mixGlobal").optInt("mixSugSwitch", 0) == 1) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map d(int r16, boolean r17, int r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: su4.r2.d(int, boolean, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.util.Map");
    }

    public static java.lang.String e(java.util.Map map, int i17) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("file://");
        java.lang.String l17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(i17).l();
        map.put("isOpenPreload", "1");
        stringBuffer.append(l17);
        if (map.size() <= 0) {
            stringBuffer.append("/app.html");
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(i17).getClass();
            return stringBuffer.toString();
        }
        int h17 = h(false);
        java.lang.String str = h17 == 2 ? "app_finder.html" : h17 == 3 ? "app_finder_inline.html" : "";
        if (map.containsKey("preloadForScene") && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get("preloadForScene"), 0) == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            stringBuffer.append("/");
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(i17).getClass();
            stringBuffer.append("app.html".replace("app.html", str));
            stringBuffer.append("?");
        } else {
            stringBuffer.append("/app.html?");
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(i17).getClass();
        }
        boolean a17 = tg0.r2.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), 0));
        for (java.util.Map.Entry entry : map.entrySet()) {
            stringBuffer.append((java.lang.String) entry.getKey());
            stringBuffer.append("=");
            if (!a17 || entry.getValue() == null) {
                stringBuffer.append((java.lang.String) entry.getValue());
            } else {
                stringBuffer.append(android.net.Uri.encode((java.lang.String) entry.getValue()));
            }
            stringBuffer.append("&");
        }
        java.lang.String str2 = (java.lang.String) map.get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
        if (!map.containsKey(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984)) {
            str2 = f(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), 0));
            stringBuffer.append("sessionId=");
            stringBuffer.append(a17 ? android.net.Uri.encode(str2) : str2);
            stringBuffer.append("&");
        }
        if (!map.containsKey("subSessionId")) {
            stringBuffer.append("subSessionId=");
            if (a17) {
                str2 = android.net.Uri.encode(str2);
            }
            stringBuffer.append(str2);
            stringBuffer.append("&");
        }
        stringBuffer.append("wechatVersion=");
        stringBuffer.append(o45.wf.f424562g);
        stringBuffer.append("&");
        return stringBuffer.substring(0, stringBuffer.length() - 1);
    }

    public static final java.lang.String f(int i17) {
        return i17 + "_" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? kk.v.a(gm0.j1.b().h()) : java.lang.String.valueOf(j62.e.g().n())) + "_" + java.lang.System.currentTimeMillis();
    }

    public static r45.j30 g() {
        r45.j30 j30Var = new r45.j30();
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        j30Var.f459065g = mo168058x74219ae7;
        if (mo168058x74219ae7) {
            int h47 = ((uh4.c0) i95.n0.c(uh4.c0.class)).h4();
            int i17 = 0;
            j30Var.f459062d = h47 != 0 ? h47 != 1 ? h47 != 2 ? 0 : 2 : 1 : 3;
            int hd6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).hd();
            j30Var.f459063e = hd6 != 0 ? hd6 != 1 ? hd6 != 2 ? 0 : 2 : 1 : 3;
            int G8 = ((uh4.c0) i95.n0.c(uh4.c0.class)).G8();
            if (G8 == 0) {
                i17 = 3;
            } else if (G8 == 1) {
                i17 = 1;
            } else if (G8 == 2) {
                i17 = 2;
            }
            j30Var.f459064f = i17;
        }
        return j30Var;
    }

    public static int h(boolean z17) {
        int i17 = j62.e.g().i("clicfg_android_finder_search_preload_webview_alone", 0, z17, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchInnerLogic", "getFinderSearchPreloadMode %d needReport:%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (i17 == 2) {
            java.lang.String replace = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(0).c().replace("app.html", "app_finder.html");
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(replace);
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchInnerLogic", "getFinderSearchPreloadMode %s not exists", replace);
                return 1;
            }
        } else if (i17 == 3) {
            java.lang.String replace2 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(0).c().replace("app.html", "app_finder_inline.html");
            com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(replace2);
            java.lang.String str2 = a18.f294812f;
            if (str2 != null) {
                java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l18)) {
                    a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
            if (!(m18.a() ? m18.f294799a.F(m18.f294800b) : false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchInnerLogic", "getFinderSearchPreloadMode %s not exists", replace2);
                return 1;
            }
        }
        return i17;
    }

    public static r45.e64 i() {
        try {
            boolean Ri = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f308701s);
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(67591, null);
            if (Ri && str != null) {
                r45.e64 e64Var = new r45.e64();
                java.lang.String[] split = str.split(",");
                e64Var.f454581f = java.lang.Integer.valueOf(split[0]).intValue();
                e64Var.f454584i = java.lang.Integer.valueOf(split[1]).intValue();
                e64Var.f454580e = java.lang.Integer.valueOf(split[2]).intValue() / 1000000.0f;
                e64Var.f454579d = java.lang.Integer.valueOf(split[3]).intValue() / 1000000.0f;
                e64Var.f454586n = j() ? 0 : 1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchInnerLogic", "lbs location is not null, %f, %f", java.lang.Float.valueOf(e64Var.f454580e), java.lang.Float.valueOf(e64Var.f454579d));
                return e64Var;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchInnerLogic", "lbs location is null, lbsContent is null!");
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_lbslocationnew_default_null, 0) == 1) {
                return null;
            }
            r45.e64 e64Var2 = new r45.e64();
            e64Var2.f454581f = 0;
            e64Var2.f454584i = 0;
            e64Var2.f454580e = 0.0f;
            e64Var2.f454579d = 0.0f;
            e64Var2.f454586n = j() ? 0 : 1;
            return e64Var2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchInnerLogic", "lbs location is null, reason %s", e17.getMessage());
            return null;
        }
    }

    public static boolean j() {
        return (b3.l.m9698x3fed0563(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "android.permission.ACCESS_FINE_LOCATION") == 0) && ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f308701s);
    }

    public static boolean k() {
        int Bi = ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Bi();
        boolean z17 = Bi == 3 || Bi == 4 || Bi == 5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchInnerLogic", "isFreeSimCard result :%b simType: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(Bi));
        return z17;
    }

    public static final boolean l() {
        return ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
    }

    public static void m(android.content.Context context, java.lang.String str, android.content.Intent intent, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        if (intent == null || context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchInnerLogic", "openNews intent is null, or context is null");
            return;
        }
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("ftsbizscene", 21);
        intent.putExtra("ftsQuery", str);
        if (str2 != null) {
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str2);
        }
        intent.putExtra("isWebwx", str);
        intent.putExtra("ftscaneditable", false);
        intent.putExtra("key_load_js_without_delay", true);
        java.lang.String f17 = android.text.TextUtils.isEmpty(str5) ? f(21) : str5;
        java.util.Map d17 = d(21, false, 2, str3, str4, f17, str, java.lang.String.valueOf(2), android.text.TextUtils.isEmpty(str6) ? f(21) : str6, "", "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("")) {
            ((java.util.HashMap) d17).put("redPointMsgId", "");
        }
        intent.putExtra("rawUrl", e(d17, 1));
        intent.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, f17);
        intent.putExtra("customize_status_bar_color", android.graphics.Color.parseColor("#F2F2F2"));
        intent.putExtra("status_bar_style", "black");
        j45.l.j(context, "webview", ".ui.tools.fts.FTSWebViewUI", intent, null);
    }

    public static void n(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5, int i18, int i19, java.lang.String str6, int i27, java.lang.String str7, java.util.Map map) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5848x86b8e43d c5848x86b8e43d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5848x86b8e43d();
        am.qo qoVar = c5848x86b8e43d.f136156g;
        qoVar.f89260c = str4;
        qoVar.f89258a = str2;
        qoVar.f89259b = str3;
        qoVar.f89261d = i17;
        qoVar.f89262e = str;
        qoVar.f89264g = str5;
        qoVar.f89265h = i18;
        qoVar.f89269l = i19;
        qoVar.f89263f = str6;
        qoVar.f89266i = i27;
        qoVar.f89267j = str7;
        qoVar.f89268k = map;
        c5848x86b8e43d.e();
    }

    public static void o() {
        p(0L, false, true, 0);
    }

    public static void p(long j17, boolean z17, boolean z18, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        ((ku5.t0) ku5.t0.f394148d).l(new su4.q2(-1, z18, i17, hashMap, z17), j17, "WebSearchThread");
    }

    public static void q(android.app.Activity activity, r45.un6 un6Var, int i17) {
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(activity);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        try {
            intent.putExtra("key_context", un6Var.mo14344x5f01b1f6());
        } catch (java.io.IOException unused) {
        }
        if (un6Var.f469038h == 100203) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.j(activity, ".ui.video.fs.TopStoryFSVideoUI", intent, i17);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.j(activity, ".ui.video.list.TopStoryListVideoUI", intent, i17);
        }
    }

    public static void r(android.content.Context context, r45.un6 un6Var) {
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        try {
            intent.putExtra("key_context", un6Var.mo14344x5f01b1f6());
        } catch (java.io.IOException unused) {
        }
        if (un6Var.f469038h == 100203) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.i(context, ".ui.video.fs.TopStoryFSVideoUI", intent);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.i(context, ".ui.video.list.TopStoryListVideoUI", intent);
        }
    }
}
