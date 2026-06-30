package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29;

/* loaded from: classes8.dex */
public abstract class o {
    public static void a(android.content.Context context) {
        if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Bi(e42.d0.clicfg_download_game_ignore_network, false) && com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(context) && !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context) && (context instanceof android.app.Activity)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y3.b((android.app.Activity) context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d1_, com.p314xaae8f345.mm.R.raw.f78676x57631304, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560087ao), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.brp), 2000L);
        }
    }

    public static void b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var, boolean z17) {
        java.lang.String str;
        if (!z17) {
            o02.a.b(10, o02.a.a(r0Var.f178847c), r0Var.f178848d, 23, r0Var.f178850f, "", "");
        }
        if (context == null || r0Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a();
        d02.c cVar = r0Var.f178857m;
        aVar.f178767a = cVar.f306809d;
        aVar.f178768b = cVar.f306817o;
        aVar.f178770d = r0Var.f178850f;
        aVar.f178769c = r0Var.f178851g;
        aVar.f178773g = cVar.f306811f;
        aVar.f178774h = cVar.f306812g;
        aVar.f178772f = cVar.f306810e;
        aVar.f178775i = cVar.f306813h;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("DownloadInWidget", 1);
            jSONObject.put("OpInWidget", 1);
        } catch (org.json.JSONException unused) {
        }
        try {
            str = java.net.URLEncoder.encode(jSONObject.toString(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        } catch (java.io.UnsupportedEncodingException unused2) {
            str = null;
        }
        aVar.f178776j = str;
        int i17 = z17 ? 6003 : 6002;
        aVar.f178777k = i17;
        d02.c cVar2 = r0Var.f178857m;
        aVar.f178778l = cVar2.f306819q;
        aVar.f178780n = 1;
        aVar.f178781o = 1;
        aVar.f178786t = cVar2.f306820r;
        g02.b.c(9, new g02.c(aVar.f178770d, i17, -1L, "", null, 0));
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(context)) {
            db5.e1.E(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h7r), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h7s), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g8q), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.h(aVar, null));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i(context, null);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f178767a)) {
            int wi6 = ((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).wi(e42.d0.clicfg_download_allow_not_wifi_apk_size, 80);
            long j17 = aVar.f178773g;
            boolean z18 = j17 > 0 && j17 <= ((long) ((wi6 * 1024) * 1024));
            if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Bi(e42.d0.clicfg_download_game_ignore_network, false)) {
                aVar.f178778l = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context);
                c(aVar, iVar);
            } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context) || z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.c(aVar.f178770d);
                aVar.f178778l = false;
                c(aVar, iVar);
            } else {
                vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.j jVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.j(iVar, aVar);
                ((uz.c2) a2Var).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.j(context, aVar, jVar);
            }
        }
    }

    public static long c(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a aVar, m02.b bVar) {
        long b17;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.b(aVar.f178770d)) {
            java.util.LinkedList c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.c();
            c17.add(aVar.f178770d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.q0.b(c17, new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.k());
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.a(aVar.f178770d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0(null);
        t0Var.f178683a = aVar.f178767a;
        t0Var.f178684b = aVar.f178768b;
        t0Var.f178686d = aVar.f178769c;
        t0Var.f178689g = aVar.f178770d;
        t0Var.f178687e = aVar.f178774h;
        t0Var.f178691i = aVar.f178779m;
        t0Var.f178692j = false;
        int i17 = aVar.f178780n;
        if (i17 == 0) {
            i17 = 1;
        }
        t0Var.f178688f = i17;
        java.lang.String str = aVar.f178772f;
        t0Var.f178690h = str;
        t0Var.f178700r = true;
        t0Var.f178694l = aVar.f178777k;
        t0Var.f178699q = aVar.f178776j;
        t0Var.f178696n = aVar.f178778l;
        t0Var.f178704v = aVar.f178781o;
        t0Var.f178701s = aVar.f178784r;
        t0Var.f178702t = aVar.f178783q;
        t0Var.f178703u = aVar.f178782p;
        t0Var.f178693k = aVar.f178785s;
        t0Var.f178705w = aVar.f178786t;
        t0Var.f178706x = aVar.f178771e;
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? com.p314xaae8f345.mm.vfs.q7.c("gameDownload") + "/gameApk/" + (java.lang.System.currentTimeMillis() + ".apk") : com.p314xaae8f345.mm.vfs.q7.c("gameDownload") + "/gameApk/" + str + "/" + (str.replace(".", "") + java.lang.System.currentTimeMillis() + ".apk");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadPluginUtil", "gamelog.download, gamedownload, download apk path  = " + str2);
        t0Var.f178708z = str2;
        if (aVar.f178775i == 1) {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().c(t0Var);
        } else {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().b(t0Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadPluginUtil", " add download task result:[%d], appid[%s]，downloaerType[%d]", java.lang.Long.valueOf(b17), aVar.f178770d, java.lang.Integer.valueOf(aVar.f178775i));
        if (bVar != null) {
            if (!aVar.f178778l || com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                bVar.a(b17 > 0 ? m02.a.OK : m02.a.FAIL, b17);
            } else {
                bVar.a(m02.a.WAIT_FOR_WIFI, b17);
            }
        }
        if (aVar.f178778l && !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            java.lang.String str3 = aVar.f178770d;
            java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.f178869e.iterator();
            while (it.hasNext()) {
                r02.x0 x0Var = (r02.x0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.t) it.next());
                x0Var.getClass();
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928.f178950s2;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) x0Var.f449875a.getLayoutManager();
                int m8008x3d79f549 = c1162x665295de.m8008x3d79f549();
                for (int i19 = 0; i19 <= m8008x3d79f549; i19++) {
                    if (c1162x665295de.m8007x6a486239(i19) != null) {
                        android.view.View childAt = ((android.view.ViewGroup) c1162x665295de.m8007x6a486239(i19)).getChildAt(0);
                        if (childAt.getVisibility() == 0 && (childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d c13249xf095011d = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d) childAt;
                            if (c13249xf095011d.B.f178850f.equals(str3)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskItemView", "onOrderWifiDownload, appId: %s", str3);
                                c13249xf095011d.C = false;
                                c13249xf095011d.post(new r02.c0(c13249xf095011d));
                            }
                        }
                    }
                }
            }
        }
        return b17;
    }

    public static boolean d(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var) {
        h02.a d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(r0Var.f178850f);
        if (d17 == null) {
            return false;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(d17.f68419xf1e9b966)) {
            db5.e1.C(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hfx), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hfy), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574368i23), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jq7), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.c(context, r0Var), new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.d());
            return false;
        }
        k02.l.a(d17.f68408x32b20428, false, null);
        o02.a.b(10, o02.a.a(r0Var.f178847c), r0Var.f178848d, 44, r0Var.f178850f, "", "");
        return true;
    }

    public static void e(h02.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var) {
        if (aVar != null) {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().t(aVar.f68408x32b20428);
        }
        o02.a.b(11, o02.a.a(r0Var.f178847c), r0Var.f178848d, 81, r0Var.f178850f, "", "");
    }

    public static void f(android.content.Context context, h02.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var, boolean z17, m02.b bVar) {
        if (aVar != null) {
            java.lang.String str = aVar.f68417x26b3182a;
            if (str == null || !str.contains("OpInWidget")) {
                org.json.JSONObject jSONObject = null;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    try {
                        str = java.net.URLDecoder.decode(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                    } catch (java.io.UnsupportedEncodingException unused) {
                    }
                    try {
                        jSONObject = new org.json.JSONObject(str);
                    } catch (java.lang.Exception unused2) {
                    }
                }
                if (jSONObject == null) {
                    jSONObject = new org.json.JSONObject();
                }
                try {
                    jSONObject.put("OpInWidget", 1);
                } catch (org.json.JSONException unused3) {
                }
                try {
                    str = java.net.URLEncoder.encode(jSONObject.toString(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                } catch (java.io.UnsupportedEncodingException unused4) {
                }
            }
            aVar.f68417x26b3182a = str;
            aVar.f68410x4e46f707 = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l(context, bVar);
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(context)) {
                boolean Bi = ((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Bi(e42.d0.clicfg_download_game_ignore_network, false);
                if (Bi) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.c(aVar.f68404x28d45f97);
                    g(aVar, com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context), lVar);
                } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.c(aVar.f68404x28d45f97);
                    g(aVar, false, lVar);
                } else {
                    vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
                    long j17 = aVar.f68408x32b20428;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.n(lVar, aVar);
                    ((uz.c2) a2Var).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.h(context, j17, Bi, nVar);
                }
            } else {
                db5.e1.E(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h7r), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h7s), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g8q), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.m(aVar, lVar));
            }
            g02.c cVar = new g02.c();
            cVar.a(aVar);
            g02.b.c(10, cVar);
        }
        if (z17) {
            o02.a.b(10, o02.a.a(r0Var.f178847c), r0Var.f178848d, 6, r0Var.f178850f, "", "");
        }
    }

    public static boolean g(h02.a aVar, boolean z17, m02.b bVar) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.b(aVar.f68404x28d45f97)) {
            java.util.LinkedList c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.c();
            c17.add(aVar.f68404x28d45f97);
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.q0.b(c17, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.a(aVar.f68404x28d45f97);
        }
        aVar.f68435x73c7b92d = false;
        aVar.f68423x7e6ed12a = true;
        aVar.f68409xc4f9be67 = z17;
        aVar.f68431x4651c731 = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        boolean w17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().w(aVar.f68408x32b20428);
        if (bVar != null) {
            bVar.a(w17 ? m02.a.OK : m02.a.FAIL, aVar.f68408x32b20428);
        }
        return w17;
    }
}
