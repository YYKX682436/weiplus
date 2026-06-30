package com.tencent.mm.modelstat;

/* loaded from: classes4.dex */
public abstract class k0 {
    public static void a(java.lang.String str, m21.x xVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendSourceAndSnsStat", "com.tencent.mm.modelstat.SnsStatExtUtil");
        if (xVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStat", "com.tencent.mm.modelstat.SnsStatExtUtil");
        } else {
            b(str, xVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStat", "com.tencent.mm.modelstat.SnsStatExtUtil");
        }
    }

    public static void b(java.lang.String str, m21.x xVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendSourceAndSnsStatWithExt", "com.tencent.mm.modelstat.SnsStatExtUtil");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || xVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStatWithExt", "com.tencent.mm.modelstat.SnsStatExtUtil");
            return;
        }
        r45.ud6 h17 = h(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(h17 == null ? -1 : h17.f387270g);
        sb6.append(",");
        xVar.a("Source", sb6.toString());
        xVar.a("SnsStatExt", g(h17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStatWithExt", "com.tencent.mm.modelstat.SnsStatExtUtil");
    }

    public static java.lang.String c(r45.ht0 ht0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("composeTopicTitle", "com.tencent.mm.modelstat.SnsStatExtUtil");
        java.lang.String string = (android.text.TextUtils.isEmpty(ht0Var.getString(2)) || (ht0Var.getLong(4) & 1) == 1) ? ht0Var.getString(1) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jel, ht0Var.getString(2), ht0Var.getString(1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("composeTopicTitle", "com.tencent.mm.modelstat.SnsStatExtUtil");
        return string;
    }

    public static int d(java.lang.String str) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdCanvasType", "com.tencent.mm.modelstat.SnsStatExtUtil");
        int i18 = 0;
        try {
            if (!android.text.TextUtils.isEmpty(str)) {
                java.lang.String T6 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI.T6(str, dm.n.COL_ADXML, ".adxml.canvasShareInfo.canvasDynamicExtInfo");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsStatExtUtil", "canvasDynamicExtInfo is " + T6 + ", adCanvasInfo is " + str);
                if (android.text.TextUtils.isEmpty(T6) || !T6.contains("ad_canvas_type")) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShareGiveHBCanvas", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
                    boolean z17 = str != null && str.contains("<giveHBCardInfo>");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShareGiveHBCanvas", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
                    if (z17) {
                        i17 = 2;
                    } else if (str.contains("isInteractiveCanvas")) {
                        i18 = 1;
                    }
                } else {
                    i17 = new cl0.g(T6).optInt("ad_canvas_type");
                }
                i18 = i17;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsStatExtUtil", "getAdCanvasType exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdCanvasType", "com.tencent.mm.modelstat.SnsStatExtUtil");
        return i18;
    }

    public static java.lang.String e(java.lang.String str) {
        java.lang.StringBuilder sb6;
        com.tencent.mm.modelstat.j0 j0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChatScene", "com.tencent.mm.modelstat.SnsStatExtUtil");
        if (str.endsWith("@chatroom")) {
            sb6 = new java.lang.StringBuilder("");
            j0Var = com.tencent.mm.modelstat.j0.TalkChat;
        } else {
            sb6 = new java.lang.StringBuilder("");
            j0Var = com.tencent.mm.modelstat.j0.Chat;
        }
        sb6.append(j0Var.f71529d);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChatScene", "com.tencent.mm.modelstat.SnsStatExtUtil");
        return sb7;
    }

    public static java.lang.String f(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
        if (f9Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
            return "";
        }
        if (f9Var.k2()) {
            ot0.q v17 = ot0.q.v(f9Var.j());
            if (v17 == null || com.tencent.mm.sdk.platformtools.t8.K0(v17.Y1)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
                return "";
            }
            str = v17.Y1;
        } else {
            str = null;
        }
        if (f9Var.Y2()) {
            t21.v2 h17 = t21.d3.h(f9Var.z0());
            if (h17 == null || com.tencent.mm.sdk.platformtools.t8.K0(h17.F)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
                return "";
            }
            str = h17.F;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
        return str;
    }

    public static java.lang.String g(r45.ud6 ud6Var) {
        java.lang.String[] split;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsStatExt", "com.tencent.mm.modelstat.SnsStatExtUtil");
        if (ud6Var != null) {
            java.lang.String str = ud6Var.f387269f;
            try {
                java.lang.String format = java.lang.String.format("expId=%d&adgroup_id=%s&snsId=%s", java.lang.Integer.valueOf(ud6Var.f387272i), java.net.URLEncoder.encode((com.tencent.mm.sdk.platformtools.t8.K0(str) || (split = str.split("\\|")) == null || split.length <= 0) ? "" : split[0], com.tencent.mapsdk.internal.rv.f51270c), ud6Var.f387268e);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsStatExt", "com.tencent.mm.modelstat.SnsStatExtUtil");
                return format;
            } catch (java.io.UnsupportedEncodingException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsStatExtUtil", "", e17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsStatExt", "com.tencent.mm.modelstat.SnsStatExtUtil");
        return "";
    }

    public static r45.ud6 h(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseStatSnsAdInfo", "com.tencent.mm.modelstat.SnsStatExtUtil");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseStatSnsAdInfo", "com.tencent.mm.modelstat.SnsStatExtUtil");
            return null;
        }
        byte[] decode = android.util.Base64.decode(str, 0);
        r45.td6 td6Var = new r45.td6();
        try {
            td6Var.parseFrom(decode);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsStatExtUtil", "", e17);
        }
        r45.ud6 ud6Var = td6Var.f386329d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseStatSnsAdInfo", "com.tencent.mm.modelstat.SnsStatExtUtil");
        return ud6Var;
    }

    public static r45.td6 i(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseStatisticsExtInfoFromEncodeStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsStatExtUtil", "parseStatisticsExtInfoFromEncodeStr, statextstr empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseStatisticsExtInfoFromEncodeStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
            return null;
        }
        r45.td6 td6Var = new r45.td6();
        try {
            td6Var.parseFrom(android.util.Base64.decode(str, 0));
            if (td6Var.f386329d == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseStatisticsExtInfoFromEncodeStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
                return null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseStatisticsExtInfoFromEncodeStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
            return td6Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsStatExtUtil", e17, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseStatisticsExtInfoFromEncodeStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
            return null;
        }
    }

    public static void j(com.tencent.mm.storage.f9 f9Var) {
        r45.td6 i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAdShareClickForChat", "com.tencent.mm.modelstat.SnsStatExtUtil");
        try {
            i17 = i(f(f9Var));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsStatExtUtil", "reportAdShareClickForChat, exp=" + th6.toString());
        }
        if (i17 != null && i17.f386329d != null) {
            java.lang.String e17 = e(f9Var.Q0());
            int d17 = d(f9Var.j());
            a54.f fVar = new a54.f();
            r45.ud6 ud6Var = i17.f386329d;
            fVar.f1596a = ud6Var.f387268e;
            fVar.f1597b = ud6Var.f387269f;
            fVar.f1598c = 2;
            fVar.f1599d = com.tencent.mm.sdk.platformtools.t8.D1(e17, 0);
            fVar.f1600e = d17;
            a84.t0.a(fVar);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1898, 1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdShareClickForChat", "com.tencent.mm.modelstat.SnsStatExtUtil");
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsStatExtUtil", "reportAdShareClickForChat, extInfo or extInfo.StatSnsAdInfo==null");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdShareClickForChat", "com.tencent.mm.modelstat.SnsStatExtUtil");
    }

    public static void k(com.tencent.mm.modelstat.j0 j0Var, java.lang.String str, int i17, java.lang.String str2, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        r45.td6 i18;
        int d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("statisticsExtInfo", "com.tencent.mm.modelstat.SnsStatExtUtil");
        try {
            i18 = i(str);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsStatExtUtil", "statisticsExtInfo for timeline, exp=" + th6.toString());
        }
        if (i18 == null || i18.f386329d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsStatExtUtil", "statisticsExtInfo for timeline, extInfo or extInfo.StatSnsAdInfo==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("statisticsExtInfo", "com.tencent.mm.modelstat.SnsStatExtUtil");
            return;
        }
        if (snsInfo != null) {
            try {
                d17 = d(snsInfo.getTimeLine().canvasInfo);
            } catch (java.lang.Throwable unused) {
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsStatExtUtil", "report adPageExposure(13235) for timeline: scene=" + j0Var.f71529d + ", adCanvasType=" + d17 + ", srcSnsId=" + i18.f386329d.f387268e + ", uxinfo=" + i18.f386329d.f387269f + ", statExtStr=" + str);
            p94.f0 f0Var = (p94.f0) i95.n0.c(p94.f0.class);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(j0Var.f71529d);
            sb6.append("");
            r45.ud6 ud6Var = i18.f386329d;
            ((p34.p) f0Var).Bi(13235, i17, sb6.toString(), ud6Var.f387268e, ud6Var.f387269f, "", str2, java.lang.Integer.valueOf(d17));
            a54.f fVar = new a54.f();
            r45.ud6 ud6Var2 = i18.f386329d;
            fVar.f1596a = ud6Var2.f387268e;
            fVar.f1597b = ud6Var2.f387269f;
            fVar.f1598c = 1;
            fVar.f1599d = 3;
            fVar.f1600e = d17;
            a84.t0.a(fVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("statisticsExtInfo", "com.tencent.mm.modelstat.SnsStatExtUtil");
        }
        d17 = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStatExtUtil", "report adPageExposure(13235) for timeline: scene=" + j0Var.f71529d + ", adCanvasType=" + d17 + ", srcSnsId=" + i18.f386329d.f387268e + ", uxinfo=" + i18.f386329d.f387269f + ", statExtStr=" + str);
        p94.f0 f0Var2 = (p94.f0) i95.n0.c(p94.f0.class);
        java.lang.StringBuilder sb62 = new java.lang.StringBuilder();
        sb62.append(j0Var.f71529d);
        sb62.append("");
        r45.ud6 ud6Var3 = i18.f386329d;
        ((p34.p) f0Var2).Bi(13235, i17, sb62.toString(), ud6Var3.f387268e, ud6Var3.f387269f, "", str2, java.lang.Integer.valueOf(d17));
        a54.f fVar2 = new a54.f();
        r45.ud6 ud6Var22 = i18.f386329d;
        fVar2.f1596a = ud6Var22.f387268e;
        fVar2.f1597b = ud6Var22.f387269f;
        fVar2.f1598c = 1;
        fVar2.f1599d = 3;
        fVar2.f1600e = d17;
        a84.t0.a(fVar2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("statisticsExtInfo", "com.tencent.mm.modelstat.SnsStatExtUtil");
    }
}
