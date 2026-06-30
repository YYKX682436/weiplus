package com.tencent.mm.plugin.expt.hellhound.ext.session.config;

/* loaded from: classes15.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.String session) {
        kotlin.jvm.internal.o.g(session, "session");
        if (session.length() <= 3) {
            return session;
        }
        if (r26.n0.B(session, "_", false)) {
            return (java.lang.String) r26.n0.f0(session, new java.lang.String[]{"_"}, false, 0, 6, null).get(0);
        }
        java.lang.String substring = session.substring(0, 3);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public final boolean b() {
        if (!a52.a.b()) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellKSessionConfig", "HellSessionMonitor monitor, fetchHellhoundConfig: FALSE");
            return true;
        }
        com.tencent.mm.plugin.expt.hellhound.ext.session.config.d.a().getClass();
        r45.v06 a17 = x52.b.a();
        if ((a17 == null ? true : a17.f387785d) || b52.b.h() == 0) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellKSessionConfig", "HellSessionMonitor monitor FALSE");
            return true;
        }
        if (a52.a.c()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellKSessionConfig", "HellSessionMonitor monitor, close !!!");
        return true;
    }

    public final java.lang.String c() {
        r45.c45 e17 = x52.c.e();
        java.lang.String str = e17 == null ? null : e17.f371270d;
        if (str == null) {
            return null;
        }
        return a(str);
    }

    public final java.lang.String d(int i17) {
        com.tencent.mm.plugin.expt.hellhound.ext.session.config.d.a().getClass();
        r45.v06 a17 = x52.b.a();
        if (a17 == null) {
            return e(i17);
        }
        if (a17.f387785d) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellKSessionConfig", "getRealChatSid, configCloud.isDel");
            return "-1";
        }
        java.util.Iterator it = a17.f387788g.iterator();
        while (it.hasNext()) {
            r45.u06 u06Var = (r45.u06) it.next();
            if (u06Var != null) {
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellKSessionConfig", "getRealChatSid, chatConfig.expect=" + u06Var.f386915g);
                if (com.tencent.mm.sdk.platformtools.t8.P(u06Var.f386915g, -1) == i17) {
                    java.lang.String sid = u06Var.f386912d;
                    kotlin.jvm.internal.o.f(sid, "sid");
                    return sid;
                }
            }
        }
        return e(i17);
    }

    public final java.lang.String e(int i17) {
        java.lang.String str = i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 4 ? i17 != 5 ? "-1" : "112" : "111" : "103" : "102" : "101";
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellKSessionConfig", "getRealChatSidLocal: ".concat(str));
        return str;
    }

    public final java.lang.String f(java.lang.String str, java.lang.String str2, java.util.List list) {
        java.lang.String str3;
        java.lang.String g17 = b52.b.g(str);
        java.lang.String g18 = b52.b.g(str2);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellKSessionConfig", "getSessionIdLocal: " + g17 + ", " + g18);
        if ((kotlin.jvm.internal.o.b("ChattingUI", str2) || kotlin.jvm.internal.o.b("ChattingUIFragment", str2)) && (kotlin.jvm.internal.o.b("MainUI", g17) || android.text.TextUtils.isEmpty(g17))) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellKSessionConfig", "getSidId: 999");
            return "999";
        }
        if (kotlin.jvm.internal.o.b("WebViewUI", g18) && ((kotlin.jvm.internal.o.b("FindMoreFriendsUI", g17) || kotlin.jvm.internal.o.b("MainUI", g17) || kotlin.jvm.internal.o.b("AddressUIFragment", g17) || kotlin.jvm.internal.o.b("MvvmAddressUIFragment", g17)) && f62.b.f259847c)) {
            return "148";
        }
        if (kotlin.jvm.internal.o.b("BaseScanUI", g18)) {
            if (d62.b.f226766b) {
                return "124";
            }
            if (f62.b.f259845a) {
                return "109";
            }
        }
        if (list == null || list.isEmpty()) {
            for (x52.h hVar : com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99784b) {
                if (android.text.TextUtils.isEmpty(g17)) {
                    return null;
                }
                if (kotlin.jvm.internal.o.b(g17, hVar.f452117b)) {
                    java.util.Iterator it = hVar.f452118c.iterator();
                    while (it.hasNext()) {
                        if (kotlin.jvm.internal.o.b(g18, (java.lang.String) it.next())) {
                            java.lang.String str4 = hVar.f452116a;
                            return kotlin.jvm.internal.o.b(str4, "109") ? f62.b.f259845a ? "109" : "124" : (kotlin.jvm.internal.o.b(str4, "105") || kotlin.jvm.internal.o.b(str4, "131")) ? d62.b.f226765a ? "131" : "105" : str4;
                        }
                    }
                }
            }
            return null;
        }
        boolean z17 = false;
        int i17 = 0;
        for (x52.h hVar2 : com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99784b) {
            if (android.text.TextUtils.isEmpty(g17)) {
                return null;
            }
            if (kotlin.jvm.internal.o.b(g17, hVar2.f452117b)) {
                java.util.Iterator it6 = hVar2.f452118c.iterator();
                while (true) {
                    boolean hasNext = it6.hasNext();
                    str3 = hVar2.f452116a;
                    if (!hasNext) {
                        break;
                    }
                    java.lang.String str5 = (java.lang.String) it6.next();
                    if (z17) {
                        if (i17 >= list.size()) {
                            return str3;
                        }
                        int i18 = i17 + 1;
                        if (!kotlin.jvm.internal.o.b(str5, list.get(i17))) {
                            z17 = false;
                            i17 = 0;
                            break;
                        }
                        i17 = i18;
                    } else {
                        if (!kotlin.jvm.internal.o.b(g18, str5)) {
                            break;
                        }
                        z17 = true;
                        i17 = 0;
                    }
                }
                if (z17) {
                    return str3;
                }
            }
        }
        return null;
    }

    public final java.lang.String g(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (r26.n0.B(str, ".", false)) {
            if (kotlin.jvm.internal.o.b(str, "com.tencent.mm.ui.conversation.MainUI")) {
                return "0";
            }
            return kotlin.jvm.internal.o.b(str, "com.tencent.mm.ui.contact.AddressUI.AddressUIFragment") ? true : kotlin.jvm.internal.o.b(str, "com.tencent.mm.ui.contact.address.MvvmAddressUIFragment") ? "1" : kotlin.jvm.internal.o.b(str, "com.tencent.mm.ui.FindMoreFriendsUI") ? "2" : kotlin.jvm.internal.o.b(str, "com.tencent.mm.ui.MoreTabUI") ? "3" : str;
        }
        if (kotlin.jvm.internal.o.b(str, "MainUI")) {
            return "0";
        }
        return kotlin.jvm.internal.o.b(str, "AddressUIFragment") ? true : kotlin.jvm.internal.o.b(str, "MvvmAddressUIFragment") ? "1" : kotlin.jvm.internal.o.b(str, "FindMoreFriendsUI") ? "2" : kotlin.jvm.internal.o.b(str, "MoreTabUI") ? "3" : str;
    }

    public final boolean h(java.lang.String str) {
        return kotlin.jvm.internal.o.b("101", str) || kotlin.jvm.internal.o.b("102", str) || kotlin.jvm.internal.o.b("103", str) || kotlin.jvm.internal.o.b("111", str) || kotlin.jvm.internal.o.b("112", str);
    }

    public final boolean i(java.lang.String str) {
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    return false;
                }
                break;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                if (str.equals("1")) {
                    return false;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    return false;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    return false;
                }
                break;
        }
        return b52.b.o(str);
    }

    public final boolean j() {
        if (com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99786d == null) {
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99786d = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_hell_finder_report_open_fix_share_and_finder_home, false));
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellKSessionConfig", "open fix 19943 isOpenFixFinderHomeMultiTask = [" + com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99786d + ']');
        }
        java.lang.Boolean bool = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99786d;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean k() {
        if (com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99789g == null) {
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99789g = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_hell_finder_report_open_fix_other_page_enter_multi_task, false));
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellKSessionConfig", "open fix 19943 isOpenFixFinderOtherPageMultiEnterTask = [" + com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99789g + ']');
        }
        java.lang.Boolean bool = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99789g;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final nm5.b l(java.lang.String str) {
        if (str == null || kotlin.jvm.internal.o.i(str.length(), 4) <= 0) {
            return null;
        }
        java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"_"}, false, 0, 6, null);
        if (kotlin.jvm.internal.o.i(f07.size(), 2) != 0) {
            return null;
        }
        return nm5.j.c(f07.get(0), f07.get(1));
    }
}
