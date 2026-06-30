package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29;

/* loaded from: classes7.dex */
public abstract class j {
    public static void a(ze.n nVar, org.json.JSONObject jSONObject, boolean z17) {
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.me meVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.me) nVar.f553276c2.b();
        try {
            org.json.JSONObject n17 = nVar.u0().n();
            if (n17 != null) {
                jSONObject.put("shareInfo", n17);
            }
        } catch (org.json.JSONException unused) {
        }
        meVar.getClass();
        if ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.me.f167282d || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.me.f167283e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(meVar.f167284a.u0().f128809v, meVar.f167285b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RuntimeLaunchSessionPlugin", "shouldAppendRefererInfoToEnterForegroundEvent return false, appId:" + meVar.f167284a.f156336n + ", sessionId:" + meVar.f167285b);
            z18 = false;
        } else {
            z18 = true;
        }
        if (!z18) {
            jSONObject.remove("referrerInfo");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.y g17 = nVar.x0().mo51924x62662257().g();
        if (z17) {
            d(nVar, jSONObject);
            b(nVar, jSONObject);
            try {
                try {
                    jSONObject.put("isEntrance", g17.c(nVar.t0()));
                } catch (java.lang.Throwable th6) {
                    try {
                        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, meVar.b());
                    } catch (org.json.JSONException unused2) {
                    }
                    throw th6;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandPageVisitStatisticsHelper", e17, "fillEventOnAppEnterForeground", new java.lang.Object[0]);
            }
            try {
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, meVar.b());
                return;
            } catch (org.json.JSONException unused3) {
                return;
            }
        }
        try {
            try {
                c(nVar, jSONObject);
                b(nVar, jSONObject);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.w wVar = nVar.x0().mo51924x62662257().g().mo52410x34715b().f169649d;
                jSONObject.put("referpagepath", wVar == null ? null : wVar.f169650a);
                jSONObject.put("clickTimestamp", nVar.u0().I);
                jSONObject.put("isEntrance", g17.c(nVar.x0().m52170xad58292c()));
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandPageVisitStatisticsHelper", e18, "fillEventOnAppEnterForeground", new java.lang.Object[0]);
            }
            try {
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, meVar.b());
            } catch (org.json.JSONException unused4) {
            }
        } catch (java.lang.Throwable th7) {
            try {
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, meVar.b());
            } catch (org.json.JSONException unused5) {
            }
            throw th7;
        }
    }

    public static void b(ze.n nVar, org.json.JSONObject jSONObject) {
        try {
            jSONObject.put("isTransparentBackgroundSupport", nVar.u0().r() == k91.z3.TRANSPARENT && !nVar.t2());
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPageVisitStatisticsHelper", "fillTransparentBackground ex = %s", e17);
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.j.c(ze.n, org.json.JSONObject):void");
    }

    public static void d(ze.n nVar, org.json.JSONObject jSONObject) {
        try {
            c(nVar, jSONObject);
            jSONObject.put("referpagepath", f(nVar.u0().D));
            jSONObject.put("clickTimestamp", nVar.u0().I);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPageVisitStatisticsHelper", "fillWxConfigLaunchInfo ex = %s", e17);
        }
    }

    public static android.util.Pair e(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        int i17;
        java.lang.String str;
        int ordinal = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.d(bVar.mo48798x74292566()).ordinal();
        java.lang.String str2 = null;
        if (ordinal != 0) {
            i17 = 7;
            if (ordinal != 1) {
                if (ordinal != 3) {
                    str = "";
                    if (ordinal != 7) {
                        android.content.Intent l17 = bVar.t3().x0().mo51924x62662257().l();
                        if (l17 != null) {
                            if (l17.getComponent() == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPageVisitStatisticsHelper", "onBackground, intent %s, get null cmp name", l17);
                            } else {
                                str = l17.getComponent().getClassName();
                            }
                            if (str.contains("WebViewUI")) {
                                str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(l17, "appbrand_report_key_target_url");
                                i17 = 10;
                            } else {
                                java.lang.String l18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(l17, "appbrand_report_key_target_activity");
                                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                if (l18 != null) {
                                    str = l18;
                                }
                                i17 = 8;
                                str2 = str;
                            }
                        }
                    } else {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.b(bVar.mo48798x74292566()).f167244d);
                        sb6.append(":");
                        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.b(bVar.mo48798x74292566()).f167245e;
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

    public static java.lang.String f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98) {
        if (c11812xa040dc98 == null) {
            return null;
        }
        int i17 = c11812xa040dc98.f158855d;
        return (1 == i17 || 3 == i17) ? c11812xa040dc98.f158856e : 2 == i17 ? c11812xa040dc98.f158860i : "";
    }
}
