package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes7.dex */
public abstract class j {
    public static void a(ze.n nVar, org.json.JSONObject jSONObject, boolean z17) {
        boolean z18;
        com.tencent.mm.plugin.appbrand.me meVar = (com.tencent.mm.plugin.appbrand.me) nVar.f471743c2.b();
        try {
            org.json.JSONObject n17 = nVar.u0().n();
            if (n17 != null) {
                jSONObject.put("shareInfo", n17);
            }
        } catch (org.json.JSONException unused) {
        }
        meVar.getClass();
        if ((com.tencent.mm.plugin.appbrand.me.f85749d || com.tencent.mm.plugin.appbrand.me.f85750e) && kotlin.jvm.internal.o.b(meVar.f85751a.u0().f47276v, meVar.f85752b)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeLaunchSessionPlugin", "shouldAppendRefererInfoToEnterForegroundEvent return false, appId:" + meVar.f85751a.f74803n + ", sessionId:" + meVar.f85752b);
            z18 = false;
        } else {
            z18 = true;
        }
        if (!z18) {
            jSONObject.remove("referrerInfo");
        }
        com.tencent.mm.plugin.appbrand.report.model.y g17 = nVar.x0().getReporter().g();
        if (z17) {
            d(nVar, jSONObject);
            b(nVar, jSONObject);
            try {
                try {
                    jSONObject.put("isEntrance", g17.c(nVar.t0()));
                } catch (java.lang.Throwable th6) {
                    try {
                        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, meVar.b());
                    } catch (org.json.JSONException unused2) {
                    }
                    throw th6;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandPageVisitStatisticsHelper", e17, "fillEventOnAppEnterForeground", new java.lang.Object[0]);
            }
            try {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, meVar.b());
                return;
            } catch (org.json.JSONException unused3) {
                return;
            }
        }
        try {
            try {
                c(nVar, jSONObject);
                b(nVar, jSONObject);
                com.tencent.mm.plugin.appbrand.report.model.w wVar = nVar.x0().getReporter().g().peek().f88116d;
                jSONObject.put("referpagepath", wVar == null ? null : wVar.f88117a);
                jSONObject.put("clickTimestamp", nVar.u0().I);
                jSONObject.put("isEntrance", g17.c(nVar.x0().getCurrentUrl()));
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandPageVisitStatisticsHelper", e18, "fillEventOnAppEnterForeground", new java.lang.Object[0]);
            }
            try {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, meVar.b());
            } catch (org.json.JSONException unused4) {
            }
        } catch (java.lang.Throwable th7) {
            try {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, meVar.b());
            } catch (org.json.JSONException unused5) {
            }
            throw th7;
        }
    }

    public static void b(ze.n nVar, org.json.JSONObject jSONObject) {
        try {
            jSONObject.put("isTransparentBackgroundSupport", nVar.u0().r() == k91.z3.TRANSPARENT && !nVar.t2());
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPageVisitStatisticsHelper", "fillTransparentBackground ex = %s", e17);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x02e8, code lost:
    
        if (r0 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x033a, code lost:
    
        if (r0 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x056a, code lost:
    
        if (r6 != 3) goto L256;
     */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(ze.n r21, org.json.JSONObject r22) {
        /*
            Method dump skipped, instructions count: 1522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.report.model.j.c(ze.n, org.json.JSONObject):void");
    }

    public static void d(ze.n nVar, org.json.JSONObject jSONObject) {
        try {
            c(nVar, jSONObject);
            jSONObject.put("referpagepath", f(nVar.u0().D));
            jSONObject.put("clickTimestamp", nVar.u0().I);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPageVisitStatisticsHelper", "fillWxConfigLaunchInfo ex = %s", e17);
        }
    }

    public static android.util.Pair e(com.tencent.luggage.sdk.jsapi.component.b bVar) {
        int i17;
        java.lang.String str;
        int ordinal = com.tencent.mm.plugin.appbrand.x0.d(bVar.getAppId()).ordinal();
        java.lang.String str2 = null;
        if (ordinal != 0) {
            i17 = 7;
            if (ordinal != 1) {
                if (ordinal != 3) {
                    str = "";
                    if (ordinal != 7) {
                        android.content.Intent l17 = bVar.t3().x0().getReporter().l();
                        if (l17 != null) {
                            if (l17.getComponent() == null) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPageVisitStatisticsHelper", "onBackground, intent %s, get null cmp name", l17);
                            } else {
                                str = l17.getComponent().getClassName();
                            }
                            if (str.contains("WebViewUI")) {
                                str2 = com.tencent.mm.sdk.platformtools.c2.l(l17, "appbrand_report_key_target_url");
                                i17 = 10;
                            } else {
                                java.lang.String l18 = com.tencent.mm.sdk.platformtools.c2.l(l17, "appbrand_report_key_target_activity");
                                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                if (l18 != null) {
                                    str = l18;
                                }
                                i17 = 8;
                                str2 = str;
                            }
                        }
                    } else {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(com.tencent.mm.plugin.appbrand.m6.b(bVar.getAppId()).f85711d);
                        sb6.append(":");
                        java.lang.String str3 = com.tencent.mm.plugin.appbrand.m6.b(bVar.getAppId()).f85712e;
                        sb6.append(fp.s0.a(str3 != null ? str3 : ""));
                        str2 = sb6.toString();
                        i17 = 9;
                    }
                } else {
                    i17 = 6;
                }
            } else if (bVar.w3().b()) {
                i17 = 5;
            }
        } else {
            i17 = bVar.w3().b() ? 4 : 3;
        }
        return android.util.Pair.create(java.lang.Integer.valueOf(i17), str2);
    }

    public static java.lang.String f(com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer) {
        if (appBrandLaunchReferrer == null) {
            return null;
        }
        int i17 = appBrandLaunchReferrer.f77322d;
        return (1 == i17 || 3 == i17) ? appBrandLaunchReferrer.f77323e : 2 == i17 ? appBrandLaunchReferrer.f77327i : "";
    }
}
