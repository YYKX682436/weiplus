package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public abstract class u {
    public static final com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct a(com.tencent.mm.plugin.appbrand.report.quality.QualitySession session) {
        kotlin.jvm.internal.o.g(session, "session");
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct weAppQualitySystemContactCGIStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct();
        weAppQualitySystemContactCGIStruct.f62724e = weAppQualitySystemContactCGIStruct.b("AppId", session.f88135e, true);
        weAppQualitySystemContactCGIStruct.f62723d = weAppQualitySystemContactCGIStruct.b("InstanceId", session.f88134d, true);
        int i17 = session.f88136f;
        weAppQualitySystemContactCGIStruct.f62726g = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.g0.demo : cm.g0.debug : cm.g0.release;
        weAppQualitySystemContactCGIStruct.f62727h = session.f88137g;
        weAppQualitySystemContactCGIStruct.f62729j = session.f88138h;
        weAppQualitySystemContactCGIStruct.f62725f = session.f88139i;
        return weAppQualitySystemContactCGIStruct;
    }

    public static final com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct b(com.tencent.mm.plugin.appbrand.report.quality.QualitySession session) {
        kotlin.jvm.internal.o.g(session, "session");
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct weAppQualitySystemLaunchCGIStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct();
        weAppQualitySystemLaunchCGIStruct.f62765e = weAppQualitySystemLaunchCGIStruct.b("AppId", session.f88135e, true);
        weAppQualitySystemLaunchCGIStruct.f62764d = weAppQualitySystemLaunchCGIStruct.b("InstanceId", session.f88134d, true);
        int i17 = session.f88136f;
        weAppQualitySystemLaunchCGIStruct.f62767g = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.n0.demo : cm.n0.debug : cm.n0.release;
        weAppQualitySystemLaunchCGIStruct.f62768h = session.f88137g;
        weAppQualitySystemLaunchCGIStruct.f62770j = session.f88138h;
        weAppQualitySystemLaunchCGIStruct.f62766f = session.f88139i;
        return weAppQualitySystemLaunchCGIStruct;
    }

    public static final int c() {
        java.lang.String b17 = com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (kotlin.jvm.internal.o.b(b17, com.eclipsesource.mmv8.Platform.UNKNOWN)) {
            return 0;
        }
        if (kotlin.jvm.internal.o.b(b17, "wifi")) {
            return 1;
        }
        if (kotlin.jvm.internal.o.b(b17, "2g")) {
            return 2;
        }
        if (kotlin.jvm.internal.o.b(b17, "3g")) {
            return 3;
        }
        if (kotlin.jvm.internal.o.b(b17, "4g")) {
            return 4;
        }
        return kotlin.jvm.internal.o.b(b17, "offline") ? 5 : 10000;
    }

    public static final long d() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.app.u6 u6Var = com.tencent.mm.app.u6.INSTANCE;
        long e17 = u6Var.e(com.tencent.mm.app.t6.UNTIL_KERNEL_STARTUP_END);
        if (e17 <= -1) {
            return 0L;
        }
        long j17 = u6Var.f53830g;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return (java.lang.System.currentTimeMillis() - (android.os.SystemClock.elapsedRealtime() - j17)) + e17;
    }

    public static final void e(com.tencent.mm.plugin.appbrand.o6 runtime, boolean z17, boolean z18) {
        java.lang.String a17;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime a18 = com.tencent.mm.plugin.appbrand.report.quality.e.a(runtime);
        kotlin.jvm.internal.o.d(a18);
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityOpenStruct weAppQualityOpenStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityOpenStruct();
        weAppQualityOpenStruct.f62577e = weAppQualityOpenStruct.b("AppId", a18.f88135e, true);
        weAppQualityOpenStruct.f62578f = a18.f88139i;
        int i17 = a18.f88136f;
        weAppQualityOpenStruct.f62579g = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.z.demo : cm.z.debug : cm.z.release;
        weAppQualityOpenStruct.f62580h = a18.f88137g;
        weAppQualityOpenStruct.f62581i = runtime.l2().f87790f;
        java.lang.String str = runtime.l2().f87791g;
        weAppQualityOpenStruct.f62597y = weAppQualityOpenStruct.b("SceneNote", (str == null || (a17 = fp.s0.a(str)) == null) ? null : u46.l.t(a17, 0, 1024), true);
        if (1036 == runtime.l2().f87790f || 1346 == runtime.l2().f87790f) {
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = runtime.u0().D;
            weAppQualityOpenStruct.f62587o = weAppQualityOpenStruct.b("scene_data", appBrandLaunchReferrer != null ? appBrandLaunchReferrer.f77323e : null, true);
        }
        weAppQualityOpenStruct.f62583k = weAppQualityOpenStruct.b("networkType", com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a), true);
        weAppQualityOpenStruct.f62585m = weAppQualityOpenStruct.b("UserName", runtime.u0().f47278x, true);
        weAppQualityOpenStruct.f62576d = weAppQualityOpenStruct.b("InstanceId", a18.f88134d, true);
        weAppQualityOpenStruct.f62596x = weAppQualityOpenStruct.b(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, runtime.u0().f47276v, true);
        weAppQualityOpenStruct.f62584l = z17 ? 0L : 1L;
        weAppQualityOpenStruct.f62582j = a18.f88145q;
        weAppQualityOpenStruct.f62586n = java.lang.Long.valueOf(z18 ? 1L : 0L).longValue();
        weAppQualityOpenStruct.f62588p = a18.b();
        java.lang.String t07 = runtime.t0();
        if (t07 == null) {
            t07 = "";
        }
        java.lang.String b17 = s91.a.b(t07);
        weAppQualityOpenStruct.f62589q = weAppQualityOpenStruct.b(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, b17 != null ? u46.l.t(b17, 0, 1024) : null, true);
        com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle appBrandRuntimeReloadReportBundle = runtime.u0().f47268a2;
        if (appBrandRuntimeReloadReportBundle != null) {
            weAppQualityOpenStruct.f62590r = weAppQualityOpenStruct.b("reload_referrer", appBrandRuntimeReloadReportBundle.f85127d, true);
            weAppQualityOpenStruct.f62591s = weAppQualityOpenStruct.b("reload_reason", appBrandRuntimeReloadReportBundle.f85128e, true);
        }
        weAppQualityOpenStruct.f62592t = a18.f88141n ? 1 : 0;
        weAppQualityOpenStruct.f62593u = runtime.u0().K1;
        weAppQualityOpenStruct.f62594v = runtime.u0().W1.f47624d;
        weAppQualityOpenStruct.f62595w = weAppQualityOpenStruct.b("shortLink", runtime.u0().E1, true);
        weAppQualityOpenStruct.f62598z = com.tencent.mm.plugin.appbrand.report.q2.a(a18.F);
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader S2 = runtime.S2(false);
        weAppQualityOpenStruct.A = weAppQualityOpenStruct.b("PubLibVersion", S2 != null ? S2.W0() : null, true);
        weAppQualityOpenStruct.B = a18.f88142o;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppStartupPerformanceReportUtil", "qualityOpen report username[" + runtime.u0().f47278x + "] appId[" + runtime.f74803n + "], instanceId[" + weAppQualityOpenStruct.f62576d + "], sessionId[" + weAppQualityOpenStruct.f62596x + ']');
        weAppQualityOpenStruct.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0196, code lost:
    
        if (r7 != false) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a8  */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String f(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.report.quality.u.f(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel, java.lang.String, boolean):java.lang.String");
    }

    public static final void g(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel parcel, java.lang.String instanceId, java.lang.String str) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        if (parcel.f84910o.f87797p != null) {
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityCGISpeedStruct weAppQualityCGISpeedStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityCGISpeedStruct();
            weAppQualityCGISpeedStruct.f62427d = weAppQualityCGISpeedStruct.b("instanceId", instanceId, true);
            weAppQualityCGISpeedStruct.f62437n = parcel.f84910o.f87797p.getInt("CgiSpeedOutSideStructCgiNo");
            weAppQualityCGISpeedStruct.f62433j = weAppQualityCGISpeedStruct.b("networkType", parcel.f84910o.f87797p.getString("CgiSpeedOutSideStructNetworkType"), true);
            weAppQualityCGISpeedStruct.f62429f = weAppQualityCGISpeedStruct.b(dm.i4.COL_USERNAME, parcel.f84901d, true);
            weAppQualityCGISpeedStruct.f62428e = weAppQualityCGISpeedStruct.b("appid", str, true);
            weAppQualityCGISpeedStruct.f62436m = parcel.f84910o.f87797p.getInt("CgiSpeedOutSideStructBizRet");
            weAppQualityCGISpeedStruct.f62432i = parcel.f84910o.f87797p.getLong("CgiSpeedOutSideStructCostTime");
            weAppQualityCGISpeedStruct.f62431h = parcel.f84910o.f87797p.getLong("CgiSpeedOutSideStructEndTimeStamp");
            weAppQualityCGISpeedStruct.f62434k = parcel.f84910o.f87797p.getLong("CgiSpeedOutSideStructResponseSize");
            weAppQualityCGISpeedStruct.f62435l = parcel.f84910o.f87797p.getInt("CgiSpeedOutSideStructRet");
            weAppQualityCGISpeedStruct.f62430g = parcel.f84910o.f87797p.getLong("CgiSpeedOutSideStructStartTimeStamp");
            weAppQualityCGISpeedStruct.k();
        }
    }
}
