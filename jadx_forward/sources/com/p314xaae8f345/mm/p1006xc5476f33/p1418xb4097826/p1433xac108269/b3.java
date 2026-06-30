package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3 f183555a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f183556b = kz5.c0.i(1, 2, 3, 4, 5, 7, 8, 9, 10, 11);

    public final void a(android.view.View view) {
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + com.p314xaae8f345.mm.ui.bl.h(view.getContext()), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final boolean b(android.content.Context context, java.lang.String packageName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageName, "packageName");
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderGameLiveUtil", "checkInstalled " + packageName + " Exception: %s", e17.getMessage());
        }
        return context.getPackageManager().getPackageInfo(packageName, 64) != null;
    }

    public final void c(android.content.Context context, java.lang.String downloadUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadUrl, "downloadUrl");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGameLiveUtil", "download SecondCut url ".concat(downloadUrl));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", downloadUrl);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void d(int i17, java.lang.String errMsg, java.lang.String str, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", i17);
        jSONObject.put("errmsg", errMsg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject.toString(), "toString(...)");
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        ((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).Ai(str == null ? "" : str, jSONObject.toString(), str2 == null ? "" : str2, -1, "");
    }

    public final void e(java.util.LinkedList gameList) {
        java.util.Iterator it;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gameList, "gameList");
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        ((android.app.ActivityManager) systemService).getMemoryInfo(memoryInfo);
        long j17 = 1024;
        long j18 = (memoryInfo.totalMem / j17) / j17;
        java.util.Iterator it6 = gameList.iterator();
        while (it6.hasNext()) {
            java.util.LinkedList m75941xfb821914 = ((r45.a63) it6.next()).m75941xfb821914(2);
            if (m75941xfb821914 != null && (it = m75941xfb821914.iterator()) != null) {
                while (it.hasNext()) {
                    r45.z53 z53Var = (r45.z53) it.next();
                    if (j18 <= z53Var.m75939xb282bd08(10)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGameLiveUtil", "#filterGame2 remove game by mem: " + z53Var.m75945x2fec8307(1) + ", min_mem_size=" + z53Var.m75939xb282bd08(10) + ", totalMem=" + j18);
                        it.remove();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.rm0 f() {
        /*
            r8 = this;
            java.lang.Class<rh0.x> r0 = rh0.x.class
            i95.m r0 = i95.n0.c(r0)
            rh0.x r0 = (rh0.x) r0
            rh0.z r1 = rh0.z.f477146g
            java.lang.String r2 = "DisableScreenCastGame"
            p05.v2 r0 = (p05.v2) r0
            java.lang.String r0 = r0.wi(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "#isNotLowDeviceScreenCastGame DisableScreenCastGame->cfgValue="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Finder.FinderGameLiveUtil"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L32
            int r4 = r0.length()
            if (r4 != 0) goto L30
            goto L32
        L30:
            r4 = r1
            goto L33
        L32:
            r4 = r3
        L33:
            if (r4 != 0) goto L47
            float r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1(r0)
            r4 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L41
            r0 = r3
            goto L42
        L41:
            r0 = r1
        L42:
            if (r0 != 0) goto L45
            goto L47
        L45:
            r0 = r1
            goto L48
        L47:
            r0 = r3
        L48:
            r0 = r0 ^ r3
            ae2.in r4 = ae2.in.f85221a
            jz5.g r4 = ae2.in.f85427u6
            r5 = r4
            jz5.n r5 = (jz5.n) r5
            java.lang.Object r5 = r5.mo141623x754a37bb()
            lb2.j r5 = (lb2.j) r5
            java.lang.Object r5 = r5.r()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 != r3) goto L64
            r5 = r3
            goto L65
        L64:
            r5 = r1
        L65:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "#genExtDeviceInfo isLowDevice="
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r7 = " FINDER_LIVE_SCREEN_CAST_LOW_DEVICE_ENABLE="
            r6.append(r7)
            jz5.n r4 = (jz5.n) r4
            java.lang.Object r4 = r4.mo141623x754a37bb()
            lb2.j r4 = (lb2.j) r4
            java.lang.Object r4 = r4.r()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4)
            r45.rm0 r2 = new r45.rm0
            r2.<init>()
            java.lang.String r4 = wo.w0.m()
            r6 = 2
            r2.set(r6, r4)
            java.lang.String r4 = android.os.Build.BRAND
            r2.set(r1, r4)
            java.lang.String r4 = android.os.Build.MANUFACTURER
            r2.set(r3, r4)
            java.lang.String r4 = android.os.Build.VERSION.RELEASE
            r6 = 3
            r2.set(r6, r4)
            java.lang.String r4 = android.os.Build.VERSION.INCREMENTAL
            r6 = 4
            r2.set(r6, r4)
            java.lang.String r4 = android.os.Build.DISPLAY
            r6 = 5
            r2.set(r6, r4)
            if (r0 == 0) goto Lbe
            if (r5 != 0) goto Lbe
            r1 = r3
        Lbe:
            r0 = 6
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.set(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f():r45.rm0");
    }

    public final java.lang.String g(boolean z17, int i17, java.lang.String gameName, android.content.Context context, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gameName, "gameName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (z17) {
            java.lang.String string = i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? i17 != 7 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d08, gameName) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d09, gameName) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d07, gameName) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572941d06, gameName) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572940d05, gameName) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572939d04, gameName);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        java.lang.String string2 = i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? i17 != 7 ? i17 != 8 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cyu, gameName) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cyt, gameName) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.czs, gameName) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cys, gameName) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cyr, gameName) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cyq, gameName) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cyp, gameName);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        java.lang.String string3 = i18 == 1 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d0_) : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
        return string2.concat(string3);
    }

    public final android.text.SpannableString h(android.content.Context context, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String string = z17 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4y) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        java.lang.String string2 = context.getString(i17, string);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        int L = r26.n0.L(string2, string, 0, false, 6, null);
        int length = string.length() + L;
        android.text.SpannableString spannableString = new android.text.SpannableString(string2);
        if (L <= 0 || length > string2.length()) {
            length = string2.length();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderGameLiveUtil", "license text err,all string:" + string2 + ",license:" + string);
            L = 0;
        }
        spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.z2(z17, context), L, length, 33);
        return spannableString;
    }

    public final java.lang.String i(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        switch (i17) {
            case 2:
            case 9:
                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mhl);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                return string;
            case 3:
                java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mhk);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                return string2;
            case 4:
                java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mhi);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                return string3;
            case 5:
                java.lang.String string4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mhm);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                return string4;
            case 6:
            default:
                java.lang.String string5 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mhj);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
                return string5;
            case 7:
                java.lang.String string6 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mhn);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
                return string6;
            case 8:
                java.lang.String string7 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nmz);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string7, "getString(...)");
                return string7;
        }
    }

    public final java.lang.String j(java.lang.String text, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[一-龥]");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        int length = text.length();
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        while (i18 < length) {
            int i28 = i18 + 1;
            java.lang.String substring = text.substring(i18, i28);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            if (compile.matcher(substring).matches()) {
                i27++;
            } else {
                i19++;
            }
            if ((i27 * 2) + i19 > i17 * 2) {
                java.lang.String substring2 = text.substring(0, i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                return substring2.concat("...");
            }
            i18 = i28;
        }
        return text;
    }

    public final void k(android.content.Intent intent) {
        intent.addFlags(268435456);
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        c61.yb.H7((c61.yb) c17, context, intent, 0L, null, 0, 0, false, 124, null);
        intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14021x37325479.class);
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/FinderGameLiveUtil", "goToLivePostUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/finder/assist/FinderGameLiveUtil", "goToLivePostUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void l(org.json.JSONObject jSONObject, android.content.Intent intent, r45.n46 n46Var, java.lang.String str) {
        java.lang.String string = jSONObject.getString("ticket");
        intent.putExtra("KEY_POST_FROM_SHARE", n46Var.mo14344x5f01b1f6());
        intent.putExtra("KEY_TICKET", string);
        intent.putExtra("KEY_APPID", str);
        intent.putExtra("KEY_FROM_SCAN", false);
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).zj(context, intent);
    }

    public final void m(int i17, org.json.JSONObject jSONObject, java.lang.String str, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGameLiveUtil", "jumpGameLiveUI action:" + i17);
        java.lang.String string = jSONObject.getString("liveObjectExportId");
        java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(11, 8, 65);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        vd2.t3.f517454a.i(i17, intent, string, 0L, e17, Gj, "");
    }

    public final void n(org.json.JSONObject jSONObject, java.lang.String str, android.content.Intent intent) {
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk()) {
            new ke2.y(str, 0, false, null, false, null, 60, null).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a3(intent, jSONObject.optString("ticket", ""), str, 0));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderGameLiveUtil", "CgiFinderLiveGetUserGameConfig failed.");
            k(intent);
        }
    }

    public final void o(gk2.e liveData, int i17, int i18, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        if (((mm2.c1) liveData.a(mm2.c1.class)).S) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", java.lang.String.valueOf(i17));
            jSONObject.put("appid", str);
            jSONObject.put("gametype", java.lang.String.valueOf(i18));
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.K1, jSONObject.toString(), null, 4, null);
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("type", i17 == 1 ? "23" : "24");
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("appid", str);
        jSONObject3.put("gametype", java.lang.String.valueOf(i18));
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        ml2.c1 c1Var = ml2.c1.f408858e;
        java.lang.String jSONObject4 = jSONObject2.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject4, ",", ";", false);
        java.lang.String jSONObject5 = jSONObject3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject5, "toString(...)");
        j0Var.hj(18L, t17, r26.i0.t(jSONObject5, ",", ";", false));
    }

    public final int p(int i17) {
        if (i17 != 1) {
            if (i17 != 20007) {
                if (i17 != 20009) {
                    if (i17 == 20036) {
                        os5.m[] mVarArr = os5.m.f429822d;
                        return 1;
                    }
                    if (i17 != 20080) {
                        if (i17 != 20001 && i17 != 20002) {
                            if (i17 != 20013) {
                                if (i17 == 20014) {
                                    os5.m[] mVarArr2 = os5.m.f429822d;
                                    return 11;
                                }
                                if (i17 == 20019) {
                                    os5.m[] mVarArr3 = os5.m.f429822d;
                                    return 13;
                                }
                                if (i17 == 20020) {
                                    os5.m[] mVarArr4 = os5.m.f429822d;
                                    return 14;
                                }
                                switch (i17) {
                                    case 10005:
                                        os5.m[] mVarArr5 = os5.m.f429822d;
                                        return 3;
                                    case 10006:
                                    case 10007:
                                        os5.m[] mVarArr6 = os5.m.f429822d;
                                        return 6;
                                    case 10008:
                                        os5.m[] mVarArr7 = os5.m.f429822d;
                                        return 7;
                                    default:
                                        switch (i17) {
                                            case 100000:
                                                os5.m[] mVarArr8 = os5.m.f429822d;
                                                return 1;
                                            case 100001:
                                                os5.m[] mVarArr9 = os5.m.f429822d;
                                                return 16;
                                            default:
                                                os5.m[] mVarArr10 = os5.m.f429822d;
                                                return 0;
                                        }
                                }
                            }
                        }
                    }
                }
                os5.m[] mVarArr11 = os5.m.f429822d;
                return 10;
            }
            os5.m[] mVarArr12 = os5.m.f429822d;
            return 17;
        }
        os5.m[] mVarArr13 = os5.m.f429822d;
        return 2;
    }
}
