package com.tencent.mm.matrix;

/* loaded from: classes12.dex */
public class z implements ni.h {
    public z(com.tencent.mm.matrix.b0 b0Var) {
    }

    @Override // ni.h
    public void a(oi.e eVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i17;
        java.lang.String dumpBriefNativeStack;
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("MatrixDelegate", "OpenGLInfo null");
            return;
        }
        oi.d dVar = eVar.f345559e;
        oi.d dVar2 = oi.d.EGL_CONTEXT;
        if (dVar == dVar2) {
            oi.b bVar = new oi.b(dVar2);
            if (eVar.f345560f != bVar) {
                eVar.f345560f = bVar;
            }
        } else if (eVar.f345560f == null) {
            com.tencent.mars.xlog.Log.e("MatrixDelegate", "opengl res memory null");
            return;
        }
        com.tencent.mars.xlog.Log.e("LeakMonitorForBackstage", eVar.toString());
        java.lang.String str5 = "";
        java.lang.String str6 = "";
        if (eVar.b() != null) {
            str5 = eVar.b().replace(",", " ").replace("\n", ";").replace("\t", "");
            oi.h hVar = oi.h.f345567e;
            synchronized (hVar.f345569b) {
                int indexOf = ((java.util.LinkedList) hVar.f345569b).indexOf(eVar);
                if (-1 == indexOf) {
                    dumpBriefNativeStack = "res already released, can not get native stack";
                } else {
                    oi.e eVar2 = (oi.e) ((java.util.LinkedList) hVar.f345569b).get(indexOf);
                    if (eVar2 == null) {
                        dumpBriefNativeStack = "";
                    } else {
                        long j17 = eVar2.f345558d;
                        dumpBriefNativeStack = j17 != 0 ? com.tencent.matrix.openglleak.hook.OpenGLHook.dumpBriefNativeStack(j17) : "";
                    }
                }
            }
            str6 = dumpBriefNativeStack.replace("\n", "").replace("\t", "");
        }
        java.lang.String str7 = str5;
        java.lang.String a17 = eVar.f345560f.a();
        if (!android.text.TextUtils.isEmpty(a17)) {
            a17 = a17.replace(",", " ").replace("\n", ";").replace("\t", "");
        }
        java.lang.String str8 = a17;
        int ordinal = eVar.f345559e.ordinal();
        int i18 = 1;
        if (ordinal != 0) {
            int i19 = 2;
            if (ordinal != 1) {
                i18 = 3;
                if (ordinal != 2) {
                    i19 = 4;
                    if (ordinal != 3) {
                        i18 = ordinal != 4 ? 0 : 10;
                    }
                }
            }
            i18 = i19;
        }
        java.lang.String valueOf = java.lang.String.valueOf(com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance().getResidualQueueSize());
        java.lang.String valueOf2 = java.lang.String.valueOf(eVar.d());
        java.lang.String str9 = "";
        if (eVar.a() != null) {
            str9 = eVar.a().replace("\n", ";").replace("\t", "");
            if (str9.contains(com.tencent.matrix.openglleak.utils.EGLHelper.class.getName())) {
                com.tencent.mars.xlog.Log.i("OpenglLeakPlugin.TAG", "skip reporting test leaking: %s", str9);
                return;
            }
        }
        java.lang.String str10 = str9;
        java.lang.String str11 = "";
        oi.b bVar2 = eVar.f345560f;
        if (bVar2 != null) {
            pi.e eVar3 = bVar2.f345539h;
            str11 = (eVar3 == null ? "" : eVar3.f354498a).replace("\n", ";").replace("\t", "");
        }
        java.lang.String str12 = str11;
        java.lang.String str13 = str6 + "==========;" + str10;
        if (i18 == 10) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("xweb-sdk", com.tencent.xwebsdk.BuildConfig.SDK_VERSION_CODE);
                jSONObject.put("xweb-apk", org.xwalk.core.XWalkEnvironment.d());
                synchronized (com.tencent.xweb.j1.class) {
                    i17 = com.tencent.xweb.j1.f220317a;
                }
                jSONObject.put("webview-count", i17);
            } catch (java.lang.Throwable th6) {
                oj.j.d("MicroMsgEglLeakReportHelper", th6, "", new java.lang.Object[0]);
            }
            try {
                int size = com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker.getTrackingMap().size();
                if (size > 0) {
                    try {
                        jSONObject.put(com.tencent.mapsdk.internal.kx.f50210k, size);
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        str = str8;
                        str2 = valueOf;
                        str3 = valueOf2;
                        oj.j.d("MicroMsgEglLeakReportHelper", th, "", new java.lang.Object[0]);
                        jSONObject.put("Activity", ri.l0.a(com.tencent.matrix.lifecycle.owners.f0.f52742x.f()));
                        str4 = ri.l0.b(jSONObject);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24828, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(eVar.f345560f.b()), eVar.f345565k.f354493b, str10, str7, str12, str, str2, str3, str4, java.lang.Integer.valueOf(eVar.c() ? 1 : 0), com.tencent.mm.sdk.platformtools.z.f193109e, com.tencent.mm.sdk.platformtools.z.f193105a, str13);
                    }
                }
                int Ri = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ri();
                str3 = valueOf2;
                str2 = valueOf;
                if (Ri > 0) {
                    str = str8;
                    try {
                        jSONObject.put("Flutter", Ri);
                        jSONObject.put("FlutterBiz", r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.v(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ni().toString(), "[", "", false, 4, null), "]", "", false), ",", "|", false), " ", "", false));
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        oj.j.d("MicroMsgEglLeakReportHelper", th, "", new java.lang.Object[0]);
                        jSONObject.put("Activity", ri.l0.a(com.tencent.matrix.lifecycle.owners.f0.f52742x.f()));
                        str4 = ri.l0.b(jSONObject);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24828, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(eVar.f345560f.b()), eVar.f345565k.f354493b, str10, str7, str12, str, str2, str3, str4, java.lang.Integer.valueOf(eVar.c() ? 1 : 0), com.tencent.mm.sdk.platformtools.z.f193109e, com.tencent.mm.sdk.platformtools.z.f193105a, str13);
                    }
                } else {
                    str = str8;
                }
                int yj6 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).yj();
                if (yj6 > 0) {
                    jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP, yj6);
                    jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP_ID, r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.v(((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).xj().toString(), "[", "", false, 4, null), "]", "", false), ",", "|", false), " ", "", false));
                }
                android.util.Pair d17 = pb0.g.d();
                java.lang.Integer num = (java.lang.Integer) d17.first;
                java.lang.Long l17 = (java.lang.Long) d17.second;
                kotlin.jvm.internal.o.d(l17);
                if (l17.longValue() > 30000000) {
                    kotlin.jvm.internal.o.d(num);
                    jSONObject.put("BmCount", num.intValue());
                    jSONObject.put("BmSize", l17.longValue());
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
            }
            try {
                jSONObject.put("Activity", ri.l0.a(com.tencent.matrix.lifecycle.owners.f0.f52742x.f()));
            } catch (java.lang.Throwable th10) {
                oj.j.d("MicroMsgEglLeakReportHelper", th10, "", new java.lang.Object[0]);
            }
            str4 = ri.l0.b(jSONObject);
        } else {
            str = str8;
            str2 = valueOf;
            str3 = valueOf2;
            str4 = "";
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24828, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(eVar.f345560f.b()), eVar.f345565k.f354493b, str10, str7, str12, str, str2, str3, str4, java.lang.Integer.valueOf(eVar.c() ? 1 : 0), com.tencent.mm.sdk.platformtools.z.f193109e, com.tencent.mm.sdk.platformtools.z.f193105a, str13);
    }
}
