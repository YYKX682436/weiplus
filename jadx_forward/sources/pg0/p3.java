package pg0;

@j95.b(m140513x1e06fd29 = {pg0.j2.class})
/* loaded from: classes9.dex */
public final class p3 extends i95.w implements qg0.g0 {
    public int Ai() {
        int i17 = 0;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_close_check_accessibility_touch_enable_switch, false);
        if (!fj6) {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("accessibility");
            android.view.accessibility.AccessibilityManager accessibilityManager = systemService instanceof android.view.accessibility.AccessibilityManager ? (android.view.accessibility.AccessibilityManager) systemService : null;
            i17 = accessibilityManager != null ? accessibilityManager.isTouchExplorationEnabled() : false ? 1 : 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "[getAccessibilityIsTouchExplorationEnabled] needCloseCheck: " + fj6 + " ， finalRet ： " + i17);
        return i17;
    }

    public int Bi() {
        java.util.ArrayList Di = Di(false);
        int i17 = 1;
        if (Di.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletUtilNewService", "[getAccessibilitySecureStatus] nowUseServiceList.isNullOrEmpty()");
            return 1;
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAY_SAFE_ACCESSIBILITY_SERVICE_SERVER_CONFIG_NEW_STRING_SYNC, null);
        java.lang.String str = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletUtilNewService", "[getAccessibilitySecureStatus] config is null");
            return 1;
        }
        r45.ex6 ex6Var = new r45.ex6();
        try {
            java.nio.charset.Charset ISO_8859_1 = java.nio.charset.StandardCharsets.ISO_8859_1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ISO_8859_1, "ISO_8859_1");
            byte[] bytes = str.getBytes(ISO_8859_1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            ex6Var.mo11468x92b714fd(bytes);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "[getAccessibilitySecureStatus] getConfig success");
            java.util.LinkedList linkedList = ex6Var.f455325f;
            if (linkedList == null || linkedList.size() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletUtilNewService", "[getAccessibilitySecureStatus] config.safe_service_list == null || config.safe_service_list.size() <= 0");
                return 1;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ex6Var.f455325f.iterator();
            while (it.hasNext()) {
                r45.b1 b1Var = (r45.b1) it.next();
                java.lang.String str2 = b1Var != null ? b1Var.f451957d : null;
                if (!(str2 == null || str2.length() == 0)) {
                    arrayList.add(b1Var.f451957d);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "[getAccessibilitySecureStatus] add name：%s", b1Var.f451957d);
                }
            }
            boolean containsAll = arrayList.containsAll(Di);
            boolean Vi = Vi(arrayList, Di);
            boolean z17 = !Vi;
            if (!containsAll) {
                if (Vi) {
                    i17 = 2;
                } else if (z17) {
                    i17 = 3;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "[getAccessibilitySecureStatus] result: %s，inWhiteListAll:%s, inWhiteListPart：%s, inWhiteListNone：%s, serverlis.size() : %s , nowUseList.size() : %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(containsAll), java.lang.Boolean.valueOf(Vi), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(Di.size()));
            return i17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletUtilNewService", "[getAccessibilitySecureStatus] getConfig fail: %s", e17.getLocalizedMessage());
            return 1;
        }
    }

    public java.util.ArrayList Di(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "[getAccessibilityServiceLocal] isLiteApp: " + z17);
        boolean fj6 = z17 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_do_check_accessibility_safety_switch_liteapp, false) : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_do_check_accessibility_safety_switch, false);
        if (!fj6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "[getAccessibilityServiceLocal] svrOpen " + fj6);
            return new java.util.ArrayList();
        }
        android.content.ContentResolver contentResolver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("enabled_accessibility_services");
        arrayList.add(contentResolver);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        java.lang.String str = (java.lang.String) yj0.a.k(obj, arrayList.toArray(), "com/tencent/mm/feature/wallet_core/WalletUtilNewService", "getAccessibilityServiceLocal", "(Z)Ljava/util/ArrayList;", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "[getAccessibilityServiceLocal] list is： %s", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return new java.util.ArrayList();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1((java.lang.String[]) r26.n0.f0(str, new java.lang.String[]{":"}, false, 0, 6, null).toArray(new java.lang.String[0]));
        if (P1 == null || P1.isEmpty()) {
            return new java.util.ArrayList();
        }
        java.util.List S0 = kz5.n0.S0(kz5.n0.X0(P1));
        if (!(true ^ S0.isEmpty())) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        kz5.n0.O0(S0, arrayList2);
        return arrayList2;
    }

    public int Ni(java.util.ArrayList arrayList, boolean z17) {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "[getAccessibilityServiceSafetyConfigAction] isLiteApp: " + z17);
        if (z17) {
            java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAY_SAFE_ACCESSIBILITY_SERVICE_SERVER_CONFIG_LITE_APP_NEW_STRING_SYNC, null);
            if (m17 instanceof java.lang.String) {
                str = (java.lang.String) m17;
            }
            str = null;
        } else {
            java.lang.Object m18 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAY_SAFE_ACCESSIBILITY_SERVICE_SERVER_CONFIG_NEW_STRING_SYNC, null);
            if (m18 instanceof java.lang.String) {
                str = (java.lang.String) m18;
            }
            str = null;
        }
        int i17 = 1;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletUtilNewService", "[getAccessibilityServiceSafetyConfigAction] config is null");
            return 0;
        }
        r45.ex6 ex6Var = new r45.ex6();
        try {
            java.nio.charset.Charset ISO_8859_1 = java.nio.charset.StandardCharsets.ISO_8859_1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ISO_8859_1, "ISO_8859_1");
            byte[] bytes = str.getBytes(ISO_8859_1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            ex6Var.mo11468x92b714fd(bytes);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "[getAccessibilityServiceSafetyConfigAction] getConfig success");
            java.util.LinkedList linkedList = ex6Var.f455325f;
            if (linkedList == null || linkedList.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletUtilNewService", "[getAccessibilityServiceSafetyConfigAction] config.safe_service_list == null || config.safe_service_list.size() <= 0");
                return 0;
            }
            if (ex6Var.f455326g == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletUtilNewService", "[getAccessibilityServiceSafetyConfigAction] config.rules == null");
                return 0;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = ex6Var.f455325f.iterator();
            while (it.hasNext()) {
                r45.b1 b1Var = (r45.b1) it.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b1Var.f451957d)) {
                    java.lang.String service_name = b1Var.f451957d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(service_name, "service_name");
                    arrayList2.add(service_name);
                }
            }
            boolean containsAll = arrayList != null ? arrayList2.containsAll(arrayList) : false;
            boolean Vi = Vi(arrayList2, arrayList);
            boolean z18 = !Vi;
            int Ai = Ai();
            if (Ai == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletUtilNewService", "[getAccessibilityServiceSafetyConfigAction] touchState is 0 do not check");
                return 0;
            }
            boolean z19 = Ai == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "isOpenTouchExploration " + z19 + ", action_on_and_all: " + ex6Var.f455326g.f452730d + ", action_on_and_part: " + ex6Var.f455326g.f452731e + ", action_on_and_0: " + ex6Var.f455326g.f452732f + ", action_off_and_all: " + ex6Var.f455326g.f452733g + ", action_off_and_part: " + ex6Var.f455326g.f452734h + ", action_off_and_0: " + ex6Var.f455326g.f452735i + ", ");
            if (z19) {
                if (containsAll) {
                    i17 = ex6Var.f455326g.f452730d;
                } else if (Vi) {
                    i17 = ex6Var.f455326g.f452731e;
                } else if (z18) {
                    i17 = ex6Var.f455326g.f452732f;
                }
            } else if (containsAll) {
                i17 = ex6Var.f455326g.f452733g;
            } else if (Vi) {
                i17 = ex6Var.f455326g.f452734h;
            } else if (z18) {
                i17 = ex6Var.f455326g.f452735i;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getAccessibilityServiceSafetyConfigAction] final action: ");
            sb6.append(i17);
            sb6.append(", isOpenTouchExploration : ");
            sb6.append(z19);
            sb6.append("，inWhiteListAll:");
            sb6.append(containsAll);
            sb6.append(", inWhiteListPart：");
            sb6.append(Vi);
            sb6.append(", inWhiteListNone：");
            sb6.append(z18);
            sb6.append(", serverlis.size() : ");
            sb6.append(arrayList2.size());
            sb6.append(" , nowUseList.size() : ");
            sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", sb6.toString());
            return i17;
        } catch (java.lang.Exception e17) {
            java.lang.String format = java.lang.String.format("[getAccessibilityServiceSafetyConfigAction] getConfig fail: %s", java.util.Arrays.copyOf(new java.lang.Object[]{e17.getLocalizedMessage()}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletUtilNewService", format);
            return 0;
        }
    }

    public boolean Ri() {
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.p Di = rn3.i.Di();
        android.util.Pair c17 = Di != null ? Di.c(new vn3.c(56)) : null;
        boolean z17 = (c17 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r) c17.first : null) == com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT && c17.second != null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "[hasPersonalPanelBottomSheetRedDot] " + z17);
        return z17;
    }

    public boolean Ui() {
        boolean z17;
        java.lang.Object obj;
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.p Di = rn3.i.Di();
        android.util.Pair c17 = Di != null ? Di.c(new vn3.c(57)) : null;
        if ((c17 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r) c17.first : null) == com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE && (obj = c17.second) != null) {
            r45.pm6 pm6Var = (r45.pm6) obj;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pm6Var != null ? pm6Var.f464720e : null)) {
                z17 = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "[hasPersonalSendRedDot] " + z17);
                return z17;
            }
        }
        z17 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "[hasPersonalSendRedDot] " + z17);
        return z17;
    }

    public final boolean Vi(java.util.List list, java.util.List list2) {
        if (!(list2 == null || list2.isEmpty())) {
            if (!(list == null || list.isEmpty())) {
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    if (list.contains(str)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "[hasStringSection] contain element：" + str);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean Zi() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_lucky_money_detail_ui_new, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "[isLuckyMoneyDetailUINew] switch：" + fj6 + ' ');
        return fj6;
    }

    public boolean aj() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_lucky_money_receive_ui_new, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "[isLuckyMoneyReceiveUINew] switch：" + fj6 + " （default is true）");
        return fj6;
    }

    public boolean bj() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "[isPrepareUINew] hardcode：true，originalSwitch：" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_lucky_money_prepare_ui_new, false) + ' ');
        return true;
    }

    public void cj(android.content.Context context, android.content.Intent intent) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletUtilNewService", "jumpToH5 context:" + context + "is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "jumpToH5");
        android.content.Intent intent2 = new android.content.Intent();
        if (intent != null) {
            intent2.putExtras(intent);
        }
        intent2.putExtra("allow_mix_content_mode", false);
        j45.l.j(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent2, null);
    }

    public void fj(android.content.Context context, r45.q74 q74Var) {
        if (context == null || q74Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletUtilNewService", "jumpToLiteApp context:" + context + " or liteAppInfo:" + q74Var + " is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "jumpToLiteApp");
        android.os.Bundle bundle = new android.os.Bundle();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q74Var.f465267d)) {
            bundle.putString("appId", q74Var.f465267d);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q74Var.f465268e)) {
            bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, q74Var.f465268e);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q74Var.f465269f)) {
            bundle.putString("query", q74Var.f465269f);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q74Var.f465270g)) {
            bundle.putString("minVersion", q74Var.f465270g);
        }
        bundle.putBoolean("isHalfScreen", q74Var.f465271h);
        bundle.putDouble("heightPercent", q74Var.f465272i);
        bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, q74Var.f465273m);
        bundle.putInt("nextAnimIn", com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea);
        bundle.putInt("currentAnimOut", com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(context, bundle, true, false, null);
    }

    public void hj(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "jumpToTinyApp username:" + str + " path:" + str2 + " version:" + i17 + " scene:" + i18);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
        am.nx nxVar = c6113xa3727625.f136390g;
        nxVar.f88999a = str;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        nxVar.f89000b = str2;
        nxVar.f89007i = i17;
        nxVar.f89002d = i18;
        nxVar.f89001c = 0;
        c6113xa3727625.e();
    }

    public boolean ij() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_do_report_screen_page_close_switch, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "[doReportScreenShotPageCgi] needCloseReport：" + fj6);
        return fj6;
    }

    public boolean mj(boolean z17, java.lang.String str, java.lang.String str2) {
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24610, "9", "4", str, str2);
        }
        boolean z18 = false;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_page_restore_switch, false);
        if (z17 && fj6) {
            z18 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtilNewService", "[openPageRestoreSwitch] result: " + z18 + "、switch：" + fj6 + " 、isRestoreCreate:" + z17 + "、errmsg：" + str2);
        return z18;
    }

    public void wi(java.lang.String str, java.util.LinkedList linkedList, int i17) {
        if (ij()) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new pg0.o3(str, linkedList, i17));
    }
}
