package com.p314xaae8f345.mm.p849xbf8d97c1;

/* loaded from: classes12.dex */
public class z implements ni.h {
    public z(com.p314xaae8f345.mm.p849xbf8d97c1.b0 b0Var) {
    }

    @Override // ni.h
    public void a(oi.e eVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i17;
        java.lang.String m41157x3b671deb;
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MatrixDelegate", "OpenGLInfo null");
            return;
        }
        oi.d dVar = eVar.f427092e;
        oi.d dVar2 = oi.d.EGL_CONTEXT;
        if (dVar == dVar2) {
            oi.b bVar = new oi.b(dVar2);
            if (eVar.f427093f != bVar) {
                eVar.f427093f = bVar;
            }
        } else if (eVar.f427093f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MatrixDelegate", "opengl res memory null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LeakMonitorForBackstage", eVar.m151425x9616526c());
        java.lang.String str5 = "";
        java.lang.String str6 = "";
        if (eVar.b() != null) {
            str5 = eVar.b().replace(",", " ").replace("\n", ";").replace("\t", "");
            oi.h hVar = oi.h.f427100e;
            synchronized (hVar.f427102b) {
                int indexOf = ((java.util.LinkedList) hVar.f427102b).indexOf(eVar);
                if (-1 == indexOf) {
                    m41157x3b671deb = "res already released, can not get native stack";
                } else {
                    oi.e eVar2 = (oi.e) ((java.util.LinkedList) hVar.f427102b).get(indexOf);
                    if (eVar2 == null) {
                        m41157x3b671deb = "";
                    } else {
                        long j17 = eVar2.f427091d;
                        m41157x3b671deb = j17 != 0 ? com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41157x3b671deb(j17) : "";
                    }
                }
            }
            str6 = m41157x3b671deb.replace("\n", "").replace("\t", "");
        }
        java.lang.String str7 = str5;
        java.lang.String a17 = eVar.f427093f.a();
        if (!android.text.TextUtils.isEmpty(a17)) {
            a17 = a17.replace(",", " ").replace("\n", ";").replace("\t", "");
        }
        java.lang.String str8 = a17;
        int ordinal = eVar.f427092e.ordinal();
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
        java.lang.String valueOf = java.lang.String.valueOf(com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41201x77b489b7());
        java.lang.String valueOf2 = java.lang.String.valueOf(eVar.d());
        java.lang.String str9 = "";
        if (eVar.a() != null) {
            str9 = eVar.a().replace("\n", ";").replace("\t", "");
            if (str9.contains(com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p579x6a710b1.AbstractC4701xfaddf038.class.getName())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenglLeakPlugin.TAG", "skip reporting test leaking: %s", str9);
                return;
            }
        }
        java.lang.String str10 = str9;
        java.lang.String str11 = "";
        oi.b bVar2 = eVar.f427093f;
        if (bVar2 != null) {
            pi.e eVar3 = bVar2.f427072h;
            str11 = (eVar3 == null ? "" : eVar3.f436031a).replace("\n", ";").replace("\t", "");
        }
        java.lang.String str12 = str11;
        java.lang.String str13 = str6 + "==========;" + str10;
        if (i18 == 10) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("xweb-sdk", com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61212x34eb0d19);
                jSONObject.put("xweb-apk", org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d());
                synchronized (com.p314xaae8f345.p3210x3857dc.j1.class) {
                    i17 = com.p314xaae8f345.p3210x3857dc.j1.f301850a;
                }
                jSONObject.put("webview-count", i17);
            } catch (java.lang.Throwable th6) {
                oj.j.d("MicroMsgEglLeakReportHelper", th6, "", new java.lang.Object[0]);
            }
            try {
                int size = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26151xea584e7d.m100777x49d3c5ef().size();
                if (size > 0) {
                    try {
                        jSONObject.put(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131743k, size);
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        str = str8;
                        str2 = valueOf;
                        str3 = valueOf2;
                        oj.j.d("MicroMsgEglLeakReportHelper", th, "", new java.lang.Object[0]);
                        jSONObject.put("Activity", ri.l0.a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134275x.f()));
                        str4 = ri.l0.b(jSONObject);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24828, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(eVar.f427093f.b()), eVar.f427098k.f436026b, str10, str7, str12, str, str2, str3, str4, java.lang.Integer.valueOf(eVar.c() ? 1 : 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a, str13);
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
                        jSONObject.put("Activity", ri.l0.a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134275x.f()));
                        str4 = ri.l0.b(jSONObject);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24828, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(eVar.f427093f.b()), eVar.f427098k.f436026b, str10, str7, str12, str, str2, str3, str4, java.lang.Integer.valueOf(eVar.c() ? 1 : 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a, str13);
                    }
                } else {
                    str = str8;
                }
                int yj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).yj();
                if (yj6 > 0) {
                    jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14346xd56cf4f0, yj6);
                    jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14347x926d12ca, r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.v(((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).xj().toString(), "[", "", false, 4, null), "]", "", false), ",", "|", false), " ", "", false));
                }
                android.util.Pair d17 = pb0.g.d();
                java.lang.Integer num = (java.lang.Integer) d17.first;
                java.lang.Long l17 = (java.lang.Long) d17.second;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
                if (l17.longValue() > 30000000) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                    jSONObject.put("BmCount", num.intValue());
                    jSONObject.put("BmSize", l17.longValue());
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
            }
            try {
                jSONObject.put("Activity", ri.l0.a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134275x.f()));
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
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24828, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(eVar.f427093f.b()), eVar.f427098k.f436026b, str10, str7, str12, str, str2, str3, str4, java.lang.Integer.valueOf(eVar.c() ? 1 : 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a, str13);
    }
}
