package ca4;

/* loaded from: classes4.dex */
public abstract class m0 {
    public static java.lang.String A(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdExtraInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
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
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdExtraInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return sb7;
    }

    public static void A0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startToolsProcess", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (a54.g.a()) {
            com.tencent.mars.xlog.Log.w("SnsAdUtil", "startToolsProcess, break");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startToolsProcess", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return;
        }
        com.tencent.mars.xlog.Log.i("SnsAdUtil", "startToolsProcess");
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(com.tencent.mm.ui.u2.f211062a, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
        intent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startToolsProcess", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static java.lang.String B(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "uxInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        java.lang.String str2 = "<ADInfo><uxInfo>" + str + "</uxInfo></ADInfo>";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return str2;
    }

    public static void B0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("timelineReport19790", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        arrayMap.put("outSns", 1);
        da4.a.h(str, str2, str3, i17, str4, arrayMap);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("timelineReport19790", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static int C(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdUserFollowStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        int i17 = 1;
        try {
            java.lang.String str = "";
            java.lang.String userName = snsInfo.getUserName();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (snsInfo.isAd() && !android.text.TextUtils.isEmpty(userName)) {
                gm0.j1.i();
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
                if (n17 != null) {
                    if (((int) n17.E2) > 0 && n17.r2()) {
                        i17 = 2;
                    }
                    str = n17.f2();
                }
            }
            com.tencent.mars.xlog.Log.i("SnsAdUtil", "getAdUserFollowStatus, userName=" + userName + ", followStatus=" + i17 + ", displayName=" + str + ", timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "isContact exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdUserFollowStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return i17;
    }

    public static boolean C0(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, int i17, int i18) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (context == null || snsInfo == null || aDInfo == null) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "tryProcessAdAppMarket input param is wrong");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.a aVar = aDInfo.actionExtAppJump;
        java.lang.String str8 = "";
        if (aVar != null) {
            str2 = aVar.f165914d;
            str3 = aVar.f165911a;
            str4 = aVar.f165913c;
            str = aVar.f165912b;
        } else {
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
        if (adXml == null || adXml.toAdMarket != 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.A(1958, 8);
        java.lang.String str9 = adXml.adExtInfo;
        android.content.Intent intent = adXml.appMarketIntent;
        if (android.text.TextUtils.isEmpty(str) && intent != null) {
            str = com.tencent.mm.sdk.platformtools.c2.l(adXml.appMarketIntent, "target_app_id");
        }
        if (str == null) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "the target package is empty!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        int i19 = i18 == 1 ? 2 : 0;
        if (ik1.b.b(context, str)) {
            if (android.text.TextUtils.isEmpty(str2)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getApplicationName", "com.tencent.mm.plugin.sns.adutils.AdUtils$System");
                if (android.text.TextUtils.isEmpty(str)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getApplicationName", "com.tencent.mm.plugin.sns.adutils.AdUtils$System");
                } else {
                    try {
                        android.content.pm.PackageManager packageManager = context.getPackageManager();
                        java.lang.CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128));
                        if (applicationLabel != null) {
                            str8 = applicationLabel.toString();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getApplicationName", "com.tencent.mm.plugin.sns.adutils.AdUtils$System");
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getApplicationName", "com.tencent.mm.plugin.sns.adutils.AdUtils$System");
                }
                str7 = str8;
            } else {
                str7 = str2;
            }
            l44.z.q(true, snsInfo, i17);
            o0(context, str3, str, str7, str4, i19, new i64.p0(java.lang.String.valueOf(snsInfo.field_snsId), aDInfo.uxInfo, str9, i18, aDInfo.aid, aDInfo.traceid, aDInfo.pId));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 10);
            str6 = "tryProcessAdAppMarket";
        } else {
            if (da4.a.f(intent)) {
                str5 = "tryProcessAdAppMarket";
                B0(java.lang.String.valueOf(snsInfo.field_snsId), aDInfo.uxInfo, str9, 4, "0");
            } else {
                str5 = "tryProcessAdAppMarket";
                B0(java.lang.String.valueOf(snsInfo.field_snsId), aDInfo.uxInfo, str9, 4, "1");
            }
            if (!da4.a.e(intent)) {
                B0(java.lang.String.valueOf(snsInfo.field_snsId), aDInfo.uxInfo, str9, 1, "1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return false;
            }
            B0(java.lang.String.valueOf(snsInfo.field_snsId), aDInfo.uxInfo, str9, 1, "0");
            l44.z.q(false, snsInfo, i17);
            l44.z.g(new ca4.d(aDInfo.uxInfo, str9, aDInfo.aid, aDInfo.traceid, aDInfo.pId), 1);
            z0(context, intent, str, java.lang.String.valueOf(snsInfo.field_snsId), aDInfo.uxInfo, str9, i19, snsInfo, i17, new i64.p0());
            g0Var.A(1958, 9);
            str6 = str5;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return true;
    }

    public static java.lang.String D(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        try {
            java.lang.String[] split = str.split("\\|");
            if (split.length >= 1) {
                java.lang.String str2 = split[0];
                java.lang.String str3 = str2 != null ? str2 : "";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return str3;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return "";
    }

    public static long D0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return 0L;
            }
            if (str.startsWith("ad_table_")) {
                long E1 = com.tencent.mm.sdk.platformtools.t8.E1(str.substring(9));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return E1;
            }
            if (str.startsWith("sns_table_")) {
                long E12 = com.tencent.mm.sdk.platformtools.t8.E1(str.substring(10));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return E12;
            }
            long F0 = ca4.z0.F0(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return F0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0L;
        }
    }

    public static java.lang.String E(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAidFromUxInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAidFromUxInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        java.lang.String[] split = str.split("\\|");
        if (split == null || split.length <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAidFromUxInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        java.lang.String str2 = split[0];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAidFromUxInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return str2;
    }

    public static java.util.HashSet F(com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentUsers", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        java.util.HashSet hashSet = new java.util.HashSet();
        if (snsObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentUsers", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return hashSet;
        }
        java.util.Iterator<r45.e86> it = snsObject.CommentUserList.iterator();
        if (it != null) {
            while (it.hasNext()) {
                java.lang.String str = it.next().f373126d;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                hashSet.add(str);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentUsers", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return hashSet;
    }

    public static java.util.HashSet G(java.util.HashSet hashSet, java.util.HashSet hashSet2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLikeCommentUsersUnion", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        java.util.HashSet hashSet3 = new java.util.HashSet();
        if (!a84.b0.b(hashSet)) {
            hashSet3.addAll(hashSet);
        }
        if (!a84.b0.b(hashSet2)) {
            hashSet3.addAll(hashSet2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeCommentUsersUnion", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return hashSet3;
    }

    public static java.util.HashSet H(com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLikeUsers", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        java.util.HashSet hashSet = new java.util.HashSet();
        if (snsObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeUsers", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return hashSet;
        }
        java.util.Iterator<r45.e86> it = snsObject.LikeUserList.iterator();
        if (it != null) {
            while (it.hasNext()) {
                java.lang.String str = it.next().f373126d;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                hashSet.add(str);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeUsers", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return hashSet;
    }

    public static float I(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLimitedScaleFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        float f17 = i65.a.f(context, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLimitedScaleSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        float f18 = i65.a.E(context) ? i65.a.l(context) ? 1.12f : 1.1f : 1.0f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLimitedScaleSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        float f19 = f17 * f18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLimitedScaleFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return f19;
    }

    public static int J(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLogoType", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (adClickActionInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLogoType", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0;
        }
        int i17 = adClickActionInfo.f162571b;
        if (i17 == 4 || i17 == 28) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLogoType", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 1;
        }
        if (n74.i0.a(adClickActionInfo)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLogoType", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 2;
        }
        int i18 = adClickActionInfo.f162571b;
        if (i18 == 10 || i18 == 24 || i18 == 12) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLogoType", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 3;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLogoType", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return 0;
    }

    public static java.lang.String K(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPaddingStr", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        java.lang.String str = "[" + view.getPaddingLeft() + "," + view.getPaddingTop() + "," + view.getPaddingRight() + "," + view.getPaddingBottom() + "]";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPaddingStr", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return str;
    }

    public static java.lang.String L(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        try {
            java.lang.String[] split = str.split("\\|");
            if (split.length >= 8) {
                java.lang.String str2 = split[7];
                java.lang.String str3 = str2 != null ? str2 : "";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return str3;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return "";
    }

    public static float M(android.widget.TextView textView, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRealTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRealTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0.0f;
        }
        float measureText = textView.getPaint().measureText(str.trim());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRealTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return measureText;
    }

    public static double N(android.widget.TextView textView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextViewHeight", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (textView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextViewHeight", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0.0d;
        }
        android.graphics.Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
        double ceil = java.lang.Math.ceil(fontMetrics.bottom - fontMetrics.top);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextViewHeight", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return ceil;
    }

    public static java.lang.String O() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineSessionId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.lang.String Ni = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
            com.tencent.mars.xlog.Log.i("SnsAdUtil", "getTimelineSessionId=" + Ni + ", timeCost=" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineSessionId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return Ni;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "getTimelineSessionId exp=" + th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineSessionId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
    }

    public static java.lang.String P(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTraceId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTraceId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        try {
            java.lang.String[] split = str.split("\\|");
            if (split.length >= 2) {
                java.lang.String str2 = split[1];
                java.lang.String str3 = str2 != null ? str2 : "";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTraceId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return str3;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTraceId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return "";
    }

    public static java.lang.String Q(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUxInfoFromAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUxInfoFromAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        try {
            com.tencent.mars.xlog.Log.i("SnsAdUtil", "getUxinfoFromAdInfoXml, xml=" + str);
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "ADInfo", null);
            if (d17 != null) {
                java.lang.String str2 = (java.lang.String) d17.get(".ADInfo.uxInfo");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str3 = str2 != null ? str2 : "";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUxInfoFromAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return str3;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "getUxinfoFromAdInfoXml, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUxInfoFromAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return "";
    }

    public static boolean R(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, int i17, i64.b1 b1Var, int i18, int i19) {
        com.tencent.mm.modelsns.SnsAdClick snsAdClick;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleAdClickDownloadAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (snsInfo == null || aDInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleAdClickDownloadAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        try {
            snsAdClick = new com.tencent.mm.modelsns.SnsAdClick(i17, i17 == 0 ? 1 : 2, snsInfo.field_snsId, i18, 0);
            g(snsAdClick, b1Var, snsInfo, i18, i19);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "handleAdClickDownloadAction, exp=" + th6.toString());
        }
        if (h(context, snsInfo, aDInfo, i17, b1Var)) {
            com.tencent.mars.xlog.Log.i("SnsAdUtil", "handleAdClickDownloadAction, checkOpenApp success");
            snsAdClick.f71470h = 34;
            ca4.z0.x0(snsAdClick);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleAdClickDownloadAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        }
        if (!C0(context, snsInfo, aDInfo, i17, 2)) {
            l44.z.q(false, snsInfo, i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleAdClickDownloadAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        com.tencent.mars.xlog.Log.i("SnsAdUtil", "handleAdClickDownloadAction, tryProcessAdAppMarket success");
        snsAdClick.f71470h = 36;
        ca4.z0.x0(snsAdClick);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleAdClickDownloadAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return true;
    }

    public static boolean S(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, int i17, i64.b1 b1Var) {
        boolean z17;
        com.tencent.mm.plugin.sns.storage.h hVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (snsInfo == null || aDInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "handleAdClickAction, exp=" + th6.toString());
        }
        if (h(context, snsInfo, aDInfo, i17, b1Var)) {
            com.tencent.mars.xlog.Log.i("SnsAdUtil", "handleAdClickAction, checkOpenApp succ");
            com.tencent.mm.modelsns.SnsAdClick snsAdClick = new com.tencent.mm.modelsns.SnsAdClick(i17, i17 == 0 ? 1 : 2, snsInfo.field_snsId, 22, 34);
            f(snsAdClick, b1Var, snsInfo, 22);
            ca4.z0.x0(snsAdClick);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        }
        if (C0(context, snsInfo, aDInfo, i17, 2)) {
            com.tencent.mars.xlog.Log.i("SnsAdUtil", "handleAdClickAction, tryProcessAdAppMarket succ");
            com.tencent.mm.modelsns.SnsAdClick snsAdClick2 = new com.tencent.mm.modelsns.SnsAdClick(i17, i17 == 0 ? 1 : 2, snsInfo.field_snsId, 22, 36);
            f(snsAdClick2, b1Var, snsInfo, 22);
            ca4.z0.x0(snsAdClick2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        }
        l44.z.q(false, snsInfo, i17);
        com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkJumpScan", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
        if (adXml == null || (hVar = adXml.adScanJumpInfo) == null || aDInfo.adActionType != 8) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkJumpScan", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
            z17 = false;
        } else {
            l44.o5.a(context, hVar, aDInfo.uxInfo, 7);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkJumpScan", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("SnsAdUtil", "handleAdClickAction, checkJumpScan succ");
            com.tencent.mm.modelsns.SnsAdClick snsAdClick3 = new com.tencent.mm.modelsns.SnsAdClick(i17, i17 == 0 ? 1 : 2, snsInfo.field_snsId, 22, 35);
            f(snsAdClick3, b1Var, snsInfo, 22);
            ca4.z0.x0(snsAdClick3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        }
        if (l44.s4.a(context, snsInfo.getAdXml(), aDInfo, snsInfo.field_snsId, 3)) {
            com.tencent.mm.modelsns.SnsAdClick snsAdClick4 = new com.tencent.mm.modelsns.SnsAdClick(i17, i17 == 0 ? 1 : 2, snsInfo.field_snsId, 22, 37);
            f(snsAdClick4, b1Var, snsInfo, 22);
            ca4.z0.x0(snsAdClick4);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return false;
    }

    public static boolean T(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, r45.e86 e86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdBossFirstLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z17 = false;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdBossFirstLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        if (e86Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdBossFirstLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(e86Var.f373126d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdBossFirstLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        if (snsInfo.isAd() && com.tencent.mm.plugin.sns.ui.widget.t2.i(e86Var.f373139t, 128) && com.tencent.mm.sdk.platformtools.t8.D0(e86Var.f373126d, snsInfo.getUserName())) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdBossFirstLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z17;
    }

    public static boolean U(com.tencent.mm.protocal.protobuf.SnsObject snsObject, java.lang.String str) {
        boolean z17;
        boolean z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdCommentOrLikedBySelf", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            java.util.Iterator<r45.e86> it = snsObject.CommentUserList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                r45.e86 next = it.next();
                if (next != null && !com.tencent.mm.sdk.platformtools.t8.K0(next.f373126d) && next.f373126d.equals(str)) {
                    z17 = true;
                    break;
                }
            }
            java.util.Iterator<r45.e86> it6 = snsObject.LikeUserList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    z18 = false;
                    break;
                }
                r45.e86 next2 = it6.next();
                if (next2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(next2.f373126d) && next2.f373126d.equals(str)) {
                    z18 = true;
                    break;
                }
            }
            com.tencent.mars.xlog.Log.i("SnsAdUtil", "isAdCommentOrLikedBySelf, snsId=" + ca4.z0.t0(snsObject.Id) + ", hasComment=" + z17 + ", hasLiked=" + z18);
            boolean z19 = z17 || z18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdCommentOrLikedBySelf", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return z19;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "isAdCommentOrLikedBySelf, exp=" + e17.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdCommentOrLikedBySelf", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
    }

    public static boolean V(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdEquals", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (snsInfo == snsInfo2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdEquals", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        }
        boolean z17 = (snsInfo != null ? snsInfo.field_snsId : 0L) == (snsInfo2 != null ? snsInfo2.field_snsId : 0L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdEquals", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z17;
    }

    public static boolean W(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdUsePreferedInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z17 = !android.text.TextUtils.isEmpty(str) && str.contains("<usePreferedInfo>1</usePreferedInfo>");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdUsePreferedInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z17;
    }

    public static boolean X(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z17 = i17 == 5 || i17 == 15;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z17;
    }

    public static boolean Y(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        if (timeLine == null || (a90Var = timeLine.ContentObj) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        boolean X = X(a90Var.f369837e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return X;
    }

    public static boolean Z(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdapterElder", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (context != null) {
            boolean z17 = i65.a.q(context) > 1.1f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdapterElder", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return z17;
        }
        com.tencent.mars.xlog.Log.w("SnsAdUtil", "isAdapterElder() called with: context = [" + context + "]");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdapterElder", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return false;
    }

    public static void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adChannelCgiReport", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                ib4.i iVar = new ib4.i(str, str2);
                gm0.j1.i();
                gm0.j1.n().f273288b.g(iVar);
                com.tencent.mars.xlog.Log.i("SnsAdUtil", "adChannelCgiReport, main, channel=" + str + ", content=" + str2);
            } else if (com.tencent.mm.sdk.platformtools.x2.s()) {
                com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().onAdLandingPageClick(str, str2);
                com.tencent.mars.xlog.Log.i("SnsAdUtil", "adChannelCgiReport, tools, channel=" + str + ", content=" + str2);
            } else {
                com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().onAdLandingPageClick(str, str2);
                com.tencent.mars.xlog.Log.i("SnsAdUtil", "adChannelCgiReport, other process, channel=" + str + ", content=" + str2);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "adChannelCgiReport, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adChannelCgiReport", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static boolean a0(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdapterElderSuper", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (context != null) {
            boolean z17 = i65.a.q(context) > 1.12f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdapterElderSuper", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return z17;
        }
        com.tencent.mars.xlog.Log.w("SnsAdUtil", "isAdapterElderSuper() called with: context = [" + context + "]");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdapterElderSuper", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return false;
    }

    public static float b(android.content.Context context, android.widget.TextView textView, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustAutoTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (context == null || textView == null) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "adjustAutoTextSize, but context or textView is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustAutoTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0.0f;
        }
        com.tencent.mars.xlog.Log.i("SnsAdUtil", "adjustAutoTextSize, tryMaxSizePx is " + f17 + ", availableWidth is " + f18);
        if (f17 <= 0.0f || f18 <= 0.0f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustAutoTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0.0f;
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.set(textView.getPaint());
        paint.setTextSize(f17);
        int b17 = i65.a.b(context, 1);
        java.lang.String charSequence = textView.getText().toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(charSequence)) {
            com.tencent.mars.xlog.Log.w("SnsAdUtil", "adjustAutoTextSize, text is null or empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustAutoTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
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
        com.tencent.mars.xlog.Log.i("SnsAdUtil", "adjustAutoTextSize, costTime is " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", trySize is " + f17);
        textView.setTextSize(0, f17);
        float measureText = paint.measureText(charSequence);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustAutoTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return measureText;
    }

    public static boolean b0(android.app.Activity activity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDarkStatusBar", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            if (activity == null) {
                boolean C = com.tencent.mm.ui.bk.C();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDarkStatusBar", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return C;
            }
            if ((activity.getWindow().getDecorView().getSystemUiVisibility() & 8192) != 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDarkStatusBar", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return false;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDarkStatusBar", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "isDarkStatusBar, exp=" + e17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDarkStatusBar", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
    }

    public static float c(android.content.Context context, android.widget.TextView textView, float f17, float f18, float f19) {
        java.lang.String str;
        java.lang.String str2;
        float f27 = f17;
        java.lang.String str3 = "adjustAutoTextSize";
        java.lang.String str4 = "com.tencent.mm.plugin.sns.data.SnsAdUtil";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustAutoTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (context == null || textView == null) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "adjustAutoTextSize, but context or textView is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustAutoTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0.0f;
        }
        com.tencent.mars.xlog.Log.i("SnsAdUtil", "adjustAutoTextSize, tryMaxSizePx is " + f27 + ", availableWidth is " + f18 + ", availableHeight is " + f19);
        if (f27 <= 0.0f || f18 <= 0.0f || f19 <= 0.0f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustAutoTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0.0f;
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.set(textView.getPaint());
        paint.setTextSize(f27);
        int b17 = i65.a.b(context, 1);
        java.lang.String charSequence = textView.getText().toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(charSequence)) {
            com.tencent.mars.xlog.Log.w("SnsAdUtil", "adjustAutoTextSize, text is null or empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustAutoTextSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
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
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextViewHeight", str4);
                android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                double ceil = java.lang.Math.ceil(fontMetrics.bottom - fontMetrics.top);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextViewHeight", str4);
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
        com.tencent.mars.xlog.Log.i("SnsAdUtil", "adjustAutoTextSize, costTime is " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", trySize is " + f27);
        textView.setTextSize(0, f27);
        float measureText = paint.measureText(charSequence);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
        return measureText;
    }

    public static boolean c0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDebugEnv", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean z17 = z65.c.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDebugEnv", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z17;
    }

    public static java.lang.String d(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendClickTimeToWeAppPath", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && z17) {
                str = za4.z0.c(str, java.lang.String.format("gdt_clicktime=%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendClickTimeToWeAppPath", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return str;
    }

    public static boolean d0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDebugerEnv", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean z17 = com.tencent.mm.sdk.platformtools.s9.f192975c || z65.c.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDebugerEnv", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z17;
    }

    public static java.lang.String e(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return str;
        }
        java.lang.String str3 = str2 + str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return str3;
    }

    public static boolean e0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isForbidUpdateContact", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z17 = !android.text.TextUtils.isEmpty(str) && str.contains("<forbidUpdateContact>1</forbidUpdateContact>");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isForbidUpdateContact", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z17;
    }

    public static void f(com.tencent.mm.modelsns.SnsAdClick snsAdClick, i64.b1 b1Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendSnsAdClickParams", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        g(snsAdClick, b1Var, snsInfo, i17, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendSnsAdClickParams", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static boolean f0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLargeWindowCheckPadDisable", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ad_large_window_pad_check_disable, 0) > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLargeWindowCheckPadDisable", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "clicfg_ad_large_window_pad_check_disable, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLargeWindowCheckPadDisable", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
    }

    public static void g(com.tencent.mm.modelsns.SnsAdClick snsAdClick, i64.b1 b1Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, int i18) {
        long h17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendSnsAdClickParams", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        long j17 = 0;
        if (b1Var == null) {
            h17 = 0;
        } else {
            try {
                h17 = b1Var.h(snsInfo.getLocalid(), i17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("SnsAdUtil", "appendSnsAdClickParams exp=" + e17.toString() + ", clockPos=" + i17);
            }
        }
        snsAdClick.f71477r = h17;
        if (b1Var != null) {
            j17 = b1Var.g(snsInfo.field_snsId);
        }
        snsAdClick.f71478s = j17;
        snsAdClick.f71479t = i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendSnsAdClickParams", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static boolean g0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPadForceFullScreenWebView", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ad_pad_open_full_screen_webview, 0) > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPadForceFullScreenWebView", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "isPadForceFullScreenWebView, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPadForceFullScreenWebView", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
    }

    public static boolean h(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, int i17, i64.b1 b1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkOpenApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (snsInfo != null && aDInfo != null) {
            try {
                com.tencent.mm.plugin.sns.storage.a aVar = aDInfo.actionExtAppJump;
                if (aVar != null) {
                    if (ik1.b.b(context, aVar.f165912b)) {
                        com.tencent.mars.xlog.Log.i("SnsAdUtil", "checkOpenApp isInstalled=true, " + aDInfo.actionExtAppJump.toString());
                        i64.p0 p0Var = new i64.p0(java.lang.String.valueOf(snsInfo.field_snsId), aDInfo.uxInfo, snsInfo.getAdXml() != null ? snsInfo.getAdXml().adExtInfo : "", 2, aDInfo.aid, aDInfo.traceid, aDInfo.pId);
                        l44.z.q(true, snsInfo, i17);
                        com.tencent.mm.plugin.sns.storage.a aVar2 = aDInfo.actionExtAppJump;
                        if (o0(context, aVar2.f165911a, aVar2.f165912b, aVar2.f165914d, aVar2.f165913c, 0, p0Var)) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkOpenApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                            return true;
                        }
                        com.tencent.mars.xlog.Log.e("SnsAdUtil", "checkOpenApp failed, " + aDInfo.actionExtAppJump.toString());
                        com.tencent.mm.plugin.sns.storage.a aVar3 = aDInfo.actionExtAppJump;
                        l44.k.b(aVar3.f165912b, aVar3.f165913c);
                    } else {
                        com.tencent.mars.xlog.Log.e("SnsAdUtil", "checkOpenApp isInstalled=false, " + aDInfo.actionExtAppJump.toString());
                        com.tencent.mm.plugin.sns.storage.a aVar4 = aDInfo.actionExtAppJump;
                        l44.k.b(aVar4.f165912b, aVar4.f165913c);
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAdUtil", "checkOpenApp exp=" + th6.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkOpenApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return false;
    }

    public static boolean h0(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPreviewAd", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAd", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z17 = snsInfo != null && snsInfo.isAd();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAd", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPreviewAd", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
        if (adXml == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPreviewAd", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        boolean z18 = adXml.previewFlag == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPreviewAd", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z18;
    }

    public static boolean i(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (snsInfo == null || aDInfo == null || adClickActionInfo == null) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "checkTryProcessAdAppMarket, input param is wrong");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.a aVar = aDInfo.actionExtAppJump;
        java.lang.String str = aVar != null ? aVar.f165912b : "";
        if (android.text.TextUtils.isEmpty(str)) {
            str = adClickActionInfo.B;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
        if (adXml == null || adXml.toAdMarket != 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.A(1958, 8);
        java.lang.String str2 = adXml.adExtInfo;
        android.content.Intent intent = adXml.appMarketIntent;
        if (android.text.TextUtils.isEmpty(str) && intent != null) {
            str = com.tencent.mm.sdk.platformtools.c2.l(intent, "target_app_id");
        }
        if (str == null) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "checkTryProcessAdAppMarket, the target package is empty!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        if (da4.a.f(intent)) {
            B0(java.lang.String.valueOf(snsInfo.field_snsId), aDInfo.uxInfo, str2, 4, "0");
        } else {
            B0(java.lang.String.valueOf(snsInfo.field_snsId), aDInfo.uxInfo, str2, 4, "1");
        }
        if (!da4.a.e(intent)) {
            B0(java.lang.String.valueOf(snsInfo.field_snsId), aDInfo.uxInfo, str2, 1, "1");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        B0(java.lang.String.valueOf(snsInfo.field_snsId), aDInfo.uxInfo, str2, 1, "0");
        l44.z.q(false, snsInfo, i17);
        g0Var.A(1958, 9);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return true;
    }

    public static boolean i0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReportAppInstallStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_report_app_install_status, 1) > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReportAppInstallStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "isReportAppInstallStatus, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReportAppInstallStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        }
    }

    public static boolean j(java.lang.String str, android.content.Intent intent, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "checkTryProcessAdAppMarket, intent is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            str = com.tencent.mm.sdk.platformtools.c2.l(intent, "target_app_id");
        }
        if (str == null) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "checkTryProcessAdAppMarket, the target package is empty!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        if (da4.a.f(intent)) {
            B0("", str2, str3, 4, "0");
        } else {
            B0("", str2, str3, 4, "1");
        }
        if (da4.a.e(intent)) {
            B0("", str2, str3, 1, "0");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        }
        B0("", str2, str3, 1, "1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkTryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return false;
    }

    public static boolean j0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isStrictDebugEnv", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isStrictDebugEnv", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return false;
    }

    public static java.lang.String k(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        com.tencent.mars.xlog.Log.i("ParamsToLocalId", "clearParamsToLocalId, localIdAppendParams = " + str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || !str.contains(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return str;
        }
        int indexOf = str.indexOf(str2);
        if (indexOf <= -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return str;
        }
        try {
            str = str.substring(0, indexOf) + str.substring(indexOf + str2.length());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ParamsToLocalId", "clearParamsToLocalId, " + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return str;
    }

    public static boolean k0(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        r45.a90 a90Var;
        java.util.LinkedList linkedList;
        r45.jj4 jj4Var;
        r45.lj4 lj4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isVerticalVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (timeLineObject != null && (a90Var = timeLineObject.ContentObj) != null && (linkedList = a90Var.f369840h) != null && linkedList.size() > 0 && (jj4Var = (r45.jj4) timeLineObject.ContentObj.f369840h.get(0)) != null && (lj4Var = jj4Var.f377865p) != null) {
            float f17 = lj4Var.f379520d;
            if (f17 > 0.0f) {
                float f18 = lj4Var.f379521e;
                if (f18 > 0.0f) {
                    boolean z17 = ((int) f18) > ((int) f17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVerticalVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                    return z17;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVerticalVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return false;
    }

    public static void l(android.app.Activity activity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertActivityToTranslucent", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            com.tencent.mars.xlog.Log.i("SnsAdUtil", "convertActivityToTranslucent:" + activity);
            if (activity != null) {
                db5.f.c(activity, null);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "convertActivityToTranslucent, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertActivityToTranslucent", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static void l0(android.widget.TextView textView, float f17) {
        int i17;
        android.graphics.drawable.ColorDrawable colorDrawable;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("justifyString", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        android.graphics.drawable.ColorDrawable colorDrawable2 = new android.graphics.drawable.ColorDrawable(16777215);
        android.graphics.drawable.ColorDrawable colorDrawable3 = new android.graphics.drawable.ColorDrawable(16777215);
        android.text.SpannableString spannableString = new android.text.SpannableString(" ");
        android.text.SpannableString spannableString2 = new android.text.SpannableString(" ");
        java.lang.String charSequence = textView.getText().toString();
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (android.text.TextUtils.isEmpty(charSequence)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("justifyString", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return;
        }
        float M = M(textView, charSequence);
        if (M >= f17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("justifyString", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return;
        }
        char[] charArray = charSequence.trim().toCharArray();
        int length = charArray.length;
        if (length <= 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("justifyString", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
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
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("justifyString", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static java.lang.String m(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            java.lang.String t07 = ca4.z0.t0(D0(str));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return t07;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
    }

    public static void m0(long j17, java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openAdCanvasById", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openAdCanvasById", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        p94.v0 v0Var = new p94.v0();
        v0Var.f352918f = str2;
        v0Var.f352917e = i17;
        n0(null, j17, str, v0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openAdCanvasById", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openAdCanvasById", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
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
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
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
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L2c
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
            com.tencent.mars.xlog.Log.e(r0, r1)
        L41:
            if (r5 <= 0) goto L44
            r4 = 1
        L44:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ca4.m0.n():boolean");
    }

    public static void n0(android.content.Context context, long j17, java.lang.String str, p94.v0 v0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openAdCanvasById", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (context == null) {
            try {
                com.tencent.mars.xlog.Log.i("SnsAdUtil", "openAdCanvasById, use MMApplicationContext");
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAdUtil", "openAdCanvasById, canvasId=" + j17 + ", exp=" + th6.toString());
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_landing_pages_pageid", j17);
        intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
        int i17 = v0Var != null ? v0Var.f352917e : 0;
        intent.putExtra("sns_landing_pages_ad_info", n74.d2.a(str, i17));
        intent.putExtra("sns_landig_pages_from_source", i17);
        if (v0Var != null) {
            intent.putExtra("sns_landing_page_half_screen_mode", v0Var.f352913a);
            intent.putExtra("sns_landing_page_is_preview_page_fullscreen", v0Var.f352926n);
            if (v0Var.f352913a) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1898, 6);
                n54.i.d(true);
                intent.putExtra("sns_landing_page_half_screen_height", v0Var.f352915c);
                intent.putExtra("sns_landing_page_half_screen_forbid_slide_top", v0Var.f352916d);
                intent.putExtra("sns_landing_page_open_from_half_screen_mode", v0Var.f352914b);
            }
            if (!android.text.TextUtils.isEmpty(v0Var.f352918f)) {
                intent.putExtra("sns_landing_pages_extra_param", v0Var.f352918f);
            }
            if (!android.text.TextUtils.isEmpty(v0Var.f352919g)) {
                intent.putExtra("sns_landing_page_canvas_dynamicinfo", v0Var.f352919g);
            }
            if (v0Var.f352920h) {
                intent.putExtra("sns_landing_is_native_sight_ad", true);
            }
            int i18 = v0Var.f352921i;
            if (i18 > 0) {
                intent.putExtra("sns_landing_pages_no_store", i18);
            }
            int i19 = v0Var.f352922j;
            if (i19 > 0) {
                intent.putExtra("sns_landing_pages_from_outer_index", i19);
            }
            long j18 = v0Var.f352924l;
            if (j18 > 0) {
                intent.putExtra("sns_landing_page_sight_video_seek_time", j18);
            }
            int i27 = v0Var.f352925m;
            if (i27 > 0) {
                intent.putExtra("sns_landing_page_is_direct_download", i27);
            }
            if (l64.a.c(i17)) {
                intent.putExtra("sns_landing_pages_forbid_back_to_biz_app", v0Var.f352923k);
            }
        } else {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "openAdCanvasById, bundle==null");
        }
        com.tencent.mars.xlog.Log.i("SnsAdUtil", "openAdCanvasById, canvasId=" + j17 + ", bundle=" + v0Var);
        j45.l.j(context, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openAdCanvasById", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
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
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
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
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L2c
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
            com.tencent.mars.xlog.Log.e(r0, r1)
        L41:
            if (r5 <= 0) goto L44
            r4 = 1
        L44:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
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
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableFixAppendUri", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_enable_fix_append_uri_android, 0);
        com.tencent.mars.xlog.Log.i("SnsAdUtil", "enableFixAppendUri called" + Ni);
        boolean z17 = Ni > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFixAppendUri", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z17;
    }

    public static void p0(android.content.Context context, android.view.View view, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, android.content.Intent intent) {
        int i18;
        int i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openEggLandingPage", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            com.tencent.mars.xlog.Log.i("SnsAdUtil", "openGestureLandingPage, source=" + i17 + ", snsId=" + snsInfo.field_snsId);
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
            intent2.putExtra("sns_landing_pages_share_sns_id", snsInfo.getSnsId());
            intent2.putExtra("sns_landing_pages_rawSnsId", snsInfo.getTimeLine().Id);
            intent2.putExtra("sns_landing_pages_ux_info", snsInfo.getUxinfo());
            if (intent != null) {
                intent2.putExtras(intent);
            }
            java.lang.String gestureCanvasInfo = snsInfo.getAdXml().getGestureCanvasInfo();
            if (!za4.z0.v(gestureCanvasInfo, "adCanvasInfo")) {
                com.tencent.mars.xlog.Log.e("SnsAdUtil", "openEggLandingPage, invalid adFullCardGestureCanvasInfo");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 118);
                if (!snsInfo.getAdXml().isLandingPagesAd()) {
                    com.tencent.mars.xlog.Log.e("SnsAdUtil", "openEggLandingPage, is not landingpageAd");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openEggLandingPage", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                    return;
                } else {
                    gestureCanvasInfo = snsInfo.getAdXml().xml.replaceAll("(?s)<adFullCardGestureCanvasInfo[^>]*>.*?</adFullCardGestureCanvasInfo>", "");
                    if (!za4.z0.v(gestureCanvasInfo, "adCanvasInfo")) {
                        com.tencent.mars.xlog.Log.e("SnsAdUtil", "openEggLandingPage, invalid adCanvasInfo too");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openEggLandingPage", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                        return;
                    }
                }
            }
            intent2.putExtra("sns_landing_page_is_interactive_canvas", true);
            intent2.putExtra("sns_landing_pages_xml", gestureCanvasInfo);
            a54.g.b(context, intent2, gestureCanvasInfo);
            intent2.putExtra("sns_landig_pages_from_source", i17);
            intent2.putExtra("sns_landing_pages_xml_prefix", dm.n.COL_ADXML);
            if (!snsInfo.getAdXml().forbiddenCustomAnimation) {
                intent2.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
            }
            intent2.putExtra("sns_landing_is_native_sight_ad", true);
            intent2.putExtra("sns_landing_page_start_time", java.lang.System.currentTimeMillis());
            if (snsInfo.isTwistAd()) {
                intent2.putExtra("sns_landing_page_is_gesture_twist_ad", true);
            } else if (snsInfo.isShakeAd()) {
                intent2.putExtra("sns_landing_page_is_gesture_shake_ad", true);
            } else if (snsInfo.isLongPressGestureAd()) {
                if (snsInfo.getAdXml().adFullCardInfo.gestureClickActionInfo != null) {
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
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "openGestureLandingPage, exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openEggLandingPage", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
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
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
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
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L2c
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
            com.tencent.mars.xlog.Log.e(r0, r1)
        L41:
            if (r5 <= 0) goto L44
            r4 = 1
        L44:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ca4.m0.q():boolean");
    }

    public static java.lang.String q0(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseColor", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        try {
            if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
                str = java.lang.String.format("#%02x%s", java.lang.Integer.valueOf((int) (com.tencent.mm.sdk.platformtools.t8.A1(str2) * 255.0d)), str.substring(1));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "parseColor exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseColor", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return str;
    }

    public static int r(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, int i18) {
        boolean z17;
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        int i19;
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fetchAdLogo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (snsInfo == null || !snsInfo.isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchAdLogo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0;
        }
        com.tencent.mm.plugin.sns.storage.ADInfo atAdInfo = i17 == 2 ? snsInfo.getAtAdInfo() : snsInfo.getAdInfo();
        if (atAdInfo != null && atAdInfo.checkCurIndexCanJump(i18) && (adClickActionInfo = atAdInfo.adClickActionInfoList.get(i18)) != null) {
            int J2 = J(adClickActionInfo);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchAdLogo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return J2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkCanJumpCanvas", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            adXml = snsInfo.getAdXml();
            i19 = adXml.isValidJumpCanvas;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCanJumpCanvas", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        }
        if (i19 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCanJumpCanvas", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            z17 = true;
        } else if (i19 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCanJumpCanvas", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            z17 = false;
        } else {
            z17 = adXml.isLandingPagesAd() && za4.z0.u(snsInfo.getAdSnsInfo().field_adxml);
            if (z17) {
                adXml.isValidJumpCanvas = 1;
            } else {
                adXml.isValidJumpCanvas = 0;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCanJumpCanvas", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        }
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchAdLogo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0;
        }
        if (atAdInfo != null) {
            int i27 = atAdInfo.adActionType;
            if (i27 == 4) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchAdLogo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return 1;
            }
            if (i27 == 9 || i27 == 10) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchAdLogo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return 3;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchAdLogo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return 0;
    }

    public static boolean r0(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, int i17, int i18, i64.p0 p0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            boolean i19 = i(snsInfo, aDInfo, adClickActionInfo, i17);
            if (i19) {
                java.lang.String str = snsInfo.getAdXml().adExtInfo;
                android.content.Intent intent = snsInfo.getAdXml().appMarketIntent;
                com.tencent.mm.plugin.sns.storage.a aVar = aDInfo.actionExtAppJump;
                java.lang.String str2 = aVar != null ? aVar.f165912b : "";
                if (android.text.TextUtils.isEmpty(str2)) {
                    str2 = adClickActionInfo.B;
                }
                if (android.text.TextUtils.isEmpty(str2) && intent != null) {
                    str2 = com.tencent.mm.sdk.platformtools.c2.l(intent, "target_app_id");
                }
                java.lang.String str3 = str2;
                k44.i iVar = adClickActionInfo.I;
                if (iVar == null || com.tencent.mm.sdk.platformtools.t8.N0(iVar.a(), adClickActionInfo.I.b(), adClickActionInfo.I.c())) {
                    l44.z.g(new ca4.d(aDInfo.uxInfo, str, aDInfo.aid, aDInfo.traceid, aDInfo.pId), 1);
                    z0(context, intent, str3, java.lang.String.valueOf(snsInfo.field_snsId), aDInfo.uxInfo, str, i18 == 1 ? 2 : 0, snsInfo, i17, p0Var);
                } else {
                    h44.c a17 = h44.c.a(adClickActionInfo);
                    if (a17 != null) {
                        if (p0Var != null) {
                            p0Var.f289280j = 106;
                        }
                        a17.e(p0Var);
                        com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper adGalleryOpenAppMarketHalfScreenHelper = new com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper(context);
                        ca4.j0 j0Var = new ca4.j0(context, intent, str3, snsInfo, aDInfo, str, i17, p0Var);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
                        adGalleryOpenAppMarketHalfScreenHelper.f162689x = j0Var;
                        adGalleryOpenAppMarketHalfScreenHelper.f162690y = false;
                        adGalleryOpenAppMarketHalfScreenHelper.u(a17);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return i19;
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.w("SnsAdUtil", "processAdAppMarket has something wrong");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
    }

    public static int s(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fromDPToPixOrigin", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        int round = java.lang.Math.round(j65.f.f() * i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fromDPToPixOrigin", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return round;
    }

    public static void s0(android.content.Context context, android.content.Intent intent, int i17, h44.c cVar, ya2.n1 n1Var) {
        java.lang.String str;
        java.lang.String str2;
        i64.p0 p0Var;
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processFinderHalfScreenAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.w("SnsAdUtil", "processAdAppMarket has something wrong");
        }
        if (context == null || intent == null || n1Var == null) {
            com.tencent.mars.xlog.Log.i("SnsAdUtil", "context or intent or halfScreenListener is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processFinderHalfScreenAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return;
        }
        java.lang.String str4 = "";
        if (cVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPackageName", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
            java.lang.String str5 = cVar.f278928c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPackageName", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
            i64.p0 d17 = cVar.d();
            if (d17 != null) {
                d17.f289280j = 106;
                str4 = d17.f289272b;
                str3 = d17.f289273c;
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
            str4 = com.tencent.mm.sdk.platformtools.c2.l(intent, "target_app_id");
        }
        com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper adFinderOpenAppMarketHalfScreenHelper = new com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper(context);
        ca4.k0 k0Var = new ca4.k0(context, intent, str4, str, str2, i17, p0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        adFinderOpenAppMarketHalfScreenHelper.f162661s = k0Var;
        adFinderOpenAppMarketHalfScreenHelper.f162662t = false;
        adFinderOpenAppMarketHalfScreenHelper.r(cVar, n1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processFinderHalfScreenAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static int t(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdAppInstallStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        int i17 = 0;
        if (snsInfo != null) {
            try {
                if (snsInfo.isAd() && (adXml = snsInfo.getAdXml()) != null && !android.text.TextUtils.isEmpty(adXml.firstDownloadApkPkgName)) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    i17 = ik1.b.b(com.tencent.mm.sdk.platformtools.x2.f193071a, adXml.firstDownloadApkPkgName) ? 2 : 1;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1893, 12);
                    com.tencent.mars.xlog.Log.i("SnsAdUtil", "getAdAppInstallStatus, pkg=" + adXml.firstDownloadApkPkgName + ", installState=" + i17 + ", timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAdUtil", "appInstalled exp=" + th6.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdAppInstallStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
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
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
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
            com.tencent.mm.plugin.report.service.g0 r4 = com.tencent.mm.plugin.report.service.g0.INSTANCE     // Catch: java.lang.Throwable -> L2a
            r5 = 1606(0x646, float:2.25E-42)
            r4.A(r5, r2)     // Catch: java.lang.Throwable -> L2a
        L2a:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca4.m0.t0(int, int):void");
    }

    public static int u(java.lang.String str, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdBreakFrameFullCardContainerHeight", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        int e17 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479884hx) + com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.j_);
        int i17 = (int) (f17 * 0.75f);
        com.tencent.mars.xlog.Log.i(str, "getAdBreakFrameFullCardContainerHeight, fullCardContainerMargin is " + e17 + ", fullCardContainerHeight is " + i17);
        int i18 = i17 + e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdBreakFrameFullCardContainerHeight", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return i18;
    }

    public static int u0(e42.b0 b0Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("safeGetExptValue", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(b0Var, i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeGetExptValue", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return Ni;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "safeGetExptValue, exp=" + e17);
            ca4.q.c("safeGetExptValue", new java.lang.RuntimeException());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeGetExptValue", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return i17;
        }
    }

    public static int v(java.lang.String str, int i17, boolean z17) {
        int e17;
        int e18;
        int b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdBreakFrameLeftMargin", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (z17) {
            int i18 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
            int e19 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aav);
            if (i17 == 0) {
                int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 14);
                int e27 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.i_);
                int e28 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aa7);
                int b19 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 2);
                e18 = e28 + b19 + b19;
                e17 = b18 + (((((i18 - b18) - e27) - e18) - e19) / 2);
                b17 = e17 + e18;
            } else {
                int e29 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479719dc);
                int e37 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv);
                int e38 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.i_);
                int i19 = e29 + e37;
                b17 = i19 + (((((i18 - e38) - e38) - i19) - e19) / 2);
            }
        } else if (i17 == 0) {
            int e39 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aa7);
            int b27 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 2);
            b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 14) + e39 + b27 + b27;
        } else {
            e17 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479719dc);
            e18 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv);
            com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.i_);
            b17 = e17 + e18;
        }
        com.tencent.mars.xlog.Log.i(str, "getAdLeftMargin, totalLeftMargin is " + b17 + ", and inLargeWindow is " + z17 + ", source is " + i17);
        int max = java.lang.Math.max(b17, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdBreakFrameLeftMargin", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return max;
    }

    public static void v0() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickHapticFeedbackForClickLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            try {
                i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_social_like_haptic_feedback_level_android, 0);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAdUtil", "clicfg_ad_social_like_haptic_feedback_level_android, exp=" + th6);
                i17 = 0;
            }
            com.tencent.mars.xlog.Log.i("SnsAdUtil", "setClickHapticFeedbackForClickLike, gray is " + i17);
            long j17 = i17 == 1 ? 50L : i17 == 2 ? 80L : i17 == 3 ? 100L : 0L;
            if (j17 > 0) {
                ca4.z0.I0(new long[]{0, j17});
            }
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "setClickHapticFeedbackForClickLike, exp is " + th7);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickHapticFeedbackForClickLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static int w(java.lang.String str, int i17, android.widget.TextView textView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdBreakFrameTopMargin", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        int N = (int) N(textView);
        int e17 = i17 == 0 ? com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479877hq) * 2 : com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479688cn);
        com.tencent.mars.xlog.Log.i(str, "getAdBreakFrameTopMargin, nickNameHeight is " + N + ", extraPadding is " + e17 + ", and source is " + i17);
        int i18 = N + e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdBreakFrameTopMargin", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return i18;
    }

    public static void w0() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickHapticFeedbackForIpComment", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            try {
                i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_ip_comment_haptic_feedback_level_android, 0);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAdUtil", "clicfg_ad_ip_comment_haptic_feedback_level_android, exp=" + th6);
                i17 = 0;
            }
            com.tencent.mars.xlog.Log.i("SnsAdUtil", "setClickHapticFeedbackForIpComment, gray is " + i17);
            long j17 = i17 == 1 ? 50L : i17 == 2 ? 80L : i17 == 3 ? 100L : 0L;
            if (j17 > 0) {
                ca4.z0.I0(new long[]{0, j17});
            }
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "setClickHapticFeedbackForIpComment, exp is " + th7);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickHapticFeedbackForIpComment", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static ca4.c x(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdCommonData", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        ca4.c cVar = new ca4.c();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "getAdCommonData: uxInfo is null or nil");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdCommonData", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
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
                cVar.f39847d = str3;
            }
            if (split.length >= 2) {
                java.lang.String str4 = split[1];
                if (str4 == null) {
                    str4 = "";
                }
                cVar.f39848e = str4;
            }
            if (split.length >= 8) {
                java.lang.String str5 = split[7];
                if (str5 != null) {
                    str2 = str5;
                }
                cVar.f39849f = str2;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "getAdCommonData: exp is " + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdCommonData", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return cVar;
    }

    public static void x0(android.widget.TextView textView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFixedFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (textView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFixedFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return;
        }
        try {
            textView.setTextSize(0, i65.a.f(textView.getContext(), i17));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "setFixedFontSize, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFixedFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static int y(java.lang.String str, android.content.Context context, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        int z18 = z(str, context, i17, z17, com.tencent.mm.R.dimen.aav);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z18;
    }

    public static void y0(android.widget.TextView textView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLimitedScaleFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (textView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLimitedScaleFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return;
        }
        try {
            textView.setTextSize(0, I(i17));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "setLimitedScaleFontSize, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLimitedScaleFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    public static int z(java.lang.String str, android.content.Context context, int i17, boolean z17, int i18) {
        int dimensionPixelSize;
        int i19;
        int i27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (context == null) {
            com.tencent.mars.xlog.Log.e(str, "getAdDisplayWidth but context is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0;
        }
        if (z17) {
            i27 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, i18);
        } else {
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            int min = java.lang.Math.min(windowManager.getDefaultDisplay().getWidth(), windowManager.getDefaultDisplay().getHeight());
            int b17 = i65.a.b(context, 56);
            if (i17 == 0) {
                dimensionPixelSize = i65.a.b(context, 14);
                i19 = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.i_);
            } else {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.i_);
                i19 = dimensionPixelSize;
            }
            i27 = ((min - b17) - dimensionPixelSize) - i19;
        }
        com.tencent.mars.xlog.Log.i(str, "getAdDisplayWidth, remainSpace is " + i27 + ", and inLargeWindow is " + z17);
        int max = java.lang.Math.max(i27, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return max;
    }

    public static void z0(android.content.Context context, android.content.Intent intent, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i18, i64.p0 p0Var) {
        java.lang.String str5;
        java.lang.String str6;
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startMarketActivity", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (context == null || intent == null) {
            com.tencent.mars.xlog.Log.e("SnsAdUtil", "startMarketActivity input param is error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startMarketActivity", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return;
        }
        try {
            if (!(context instanceof android.app.Activity)) {
                intent.addFlags(268435456);
            }
            java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(intent, "market_app_name");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str7 = "";
            java.lang.String str8 = l17 == null ? "" : l17;
            if (snsInfo == null || (adInfo = snsInfo.getAdInfo(i18)) == null) {
                str5 = "";
                str6 = str5;
            } else {
                str7 = adInfo.aid;
                str6 = adInfo.traceid;
                str5 = adInfo.pId;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
                str7 = D(str3);
            }
            java.lang.String str9 = str7;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                str6 = P(str3);
            }
            java.lang.String str10 = str6;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                str5 = L(str3);
            }
            ca4.d dVar = new ca4.d(str3, str4, str9, str10, str5);
            if (p0Var != null) {
                dVar.c(p0Var.f289280j);
            }
            if (i17 != 2) {
                l44.z.d(dVar);
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.d(context, intent.getPackage(), "", intent, str8, new ca4.l0(i17, str2, str3, str4, dVar, str, snsInfo, i18), i17);
        } catch (java.lang.Throwable unused) {
            B0(str2, str3, str4, 2, "1");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startMarketActivity", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }
}
