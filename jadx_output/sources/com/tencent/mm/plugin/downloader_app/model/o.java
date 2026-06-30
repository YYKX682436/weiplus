package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes8.dex */
public abstract class o {
    public static void a(android.content.Context context) {
        if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Bi(e42.d0.clicfg_download_game_ignore_network, false) && com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(context) && !com.tencent.mars.comm.NetStatusUtil.isWifi(context) && (context instanceof android.app.Activity)) {
            com.tencent.mm.ui.widget.dialog.y3.b((android.app.Activity) context, com.tencent.mm.R.layout.d1_, com.tencent.mm.R.raw.bottomsheet_icon_complain, context.getResources().getColor(com.tencent.mm.R.color.f478554ao), context.getString(com.tencent.mm.R.string.brp), 2000L);
        }
    }

    public static void b(android.content.Context context, com.tencent.mm.plugin.downloader_app.model.r0 r0Var, boolean z17) {
        java.lang.String str;
        if (!z17) {
            o02.a.b(10, o02.a.a(r0Var.f97314c), r0Var.f97315d, 23, r0Var.f97317f, "", "");
        }
        if (context == null || r0Var == null) {
            return;
        }
        com.tencent.mm.plugin.downloader_app.model.a aVar = new com.tencent.mm.plugin.downloader_app.model.a();
        d02.c cVar = r0Var.f97324m;
        aVar.f97234a = cVar.f225276d;
        aVar.f97235b = cVar.f225284o;
        aVar.f97237d = r0Var.f97317f;
        aVar.f97236c = r0Var.f97318g;
        aVar.f97240g = cVar.f225278f;
        aVar.f97241h = cVar.f225279g;
        aVar.f97239f = cVar.f225277e;
        aVar.f97242i = cVar.f225280h;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("DownloadInWidget", 1);
            jSONObject.put("OpInWidget", 1);
        } catch (org.json.JSONException unused) {
        }
        try {
            str = java.net.URLEncoder.encode(jSONObject.toString(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        } catch (java.io.UnsupportedEncodingException unused2) {
            str = null;
        }
        aVar.f97243j = str;
        int i17 = z17 ? 6003 : 6002;
        aVar.f97244k = i17;
        d02.c cVar2 = r0Var.f97324m;
        aVar.f97245l = cVar2.f225286q;
        aVar.f97247n = 1;
        aVar.f97248o = 1;
        aVar.f97253t = cVar2.f225287r;
        g02.b.c(9, new g02.c(aVar.f97237d, i17, -1L, "", null, 0));
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(context)) {
            db5.e1.E(context, context.getString(com.tencent.mm.R.string.h7r), context.getString(com.tencent.mm.R.string.h7s), context.getString(com.tencent.mm.R.string.g8q), false, new com.tencent.mm.plugin.downloader_app.model.h(aVar, null));
            return;
        }
        com.tencent.mm.plugin.downloader_app.model.i iVar = new com.tencent.mm.plugin.downloader_app.model.i(context, null);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.f97234a)) {
            int wi6 = ((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).wi(e42.d0.clicfg_download_allow_not_wifi_apk_size, 80);
            long j17 = aVar.f97240g;
            boolean z18 = j17 > 0 && j17 <= ((long) ((wi6 * 1024) * 1024));
            if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Bi(e42.d0.clicfg_download_game_ignore_network, false)) {
                aVar.f97245l = com.tencent.mars.comm.NetStatusUtil.isWifi(context);
                c(aVar, iVar);
            } else if (com.tencent.mars.comm.NetStatusUtil.isWifi(context) || z18) {
                com.tencent.mm.plugin.downloader_app.model.x.c(aVar.f97237d);
                aVar.f97245l = false;
                c(aVar, iVar);
            } else {
                vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
                com.tencent.mm.plugin.downloader_app.model.j jVar = new com.tencent.mm.plugin.downloader_app.model.j(iVar, aVar);
                ((uz.c2) a2Var).getClass();
                com.tencent.mm.plugin.downloader.model.j1.j(context, aVar, jVar);
            }
        }
    }

    public static long c(com.tencent.mm.plugin.downloader_app.model.a aVar, m02.b bVar) {
        long b17;
        if (!com.tencent.mm.plugin.downloader_app.model.s0.b(aVar.f97237d)) {
            java.util.LinkedList c17 = com.tencent.mm.plugin.downloader_app.model.s0.c();
            c17.add(aVar.f97237d);
            com.tencent.mm.plugin.downloader_app.model.q0.b(c17, new com.tencent.mm.plugin.downloader_app.model.k());
            com.tencent.mm.plugin.downloader_app.model.s0.a(aVar.f97237d);
        }
        com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
        t0Var.f97150a = aVar.f97234a;
        t0Var.f97151b = aVar.f97235b;
        t0Var.f97153d = aVar.f97236c;
        t0Var.f97156g = aVar.f97237d;
        t0Var.f97154e = aVar.f97241h;
        t0Var.f97158i = aVar.f97246m;
        t0Var.f97159j = false;
        int i17 = aVar.f97247n;
        if (i17 == 0) {
            i17 = 1;
        }
        t0Var.f97155f = i17;
        java.lang.String str = aVar.f97239f;
        t0Var.f97157h = str;
        t0Var.f97167r = true;
        t0Var.f97161l = aVar.f97244k;
        t0Var.f97166q = aVar.f97243j;
        t0Var.f97163n = aVar.f97245l;
        t0Var.f97171v = aVar.f97248o;
        t0Var.f97168s = aVar.f97251r;
        t0Var.f97169t = aVar.f97250q;
        t0Var.f97170u = aVar.f97249p;
        t0Var.f97160k = aVar.f97252s;
        t0Var.f97172w = aVar.f97253t;
        t0Var.f97173x = aVar.f97238e;
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? com.tencent.mm.vfs.q7.c("gameDownload") + "/gameApk/" + (java.lang.System.currentTimeMillis() + ".apk") : com.tencent.mm.vfs.q7.c("gameDownload") + "/gameApk/" + str + "/" + (str.replace(".", "") + java.lang.System.currentTimeMillis() + ".apk");
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadPluginUtil", "gamelog.download, gamedownload, download apk path  = " + str2);
        t0Var.f97175z = str2;
        if (aVar.f97242i == 1) {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            b17 = com.tencent.mm.plugin.downloader.model.r0.i().c(t0Var);
        } else {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            b17 = com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadPluginUtil", " add download task result:[%d], appid[%s]，downloaerType[%d]", java.lang.Long.valueOf(b17), aVar.f97237d, java.lang.Integer.valueOf(aVar.f97242i));
        if (bVar != null) {
            if (!aVar.f97245l || com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                bVar.a(b17 > 0 ? m02.a.OK : m02.a.FAIL, b17);
            } else {
                bVar.a(m02.a.WAIT_FOR_WIFI, b17);
            }
        }
        if (aVar.f97245l && !com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            java.lang.String str3 = aVar.f97237d;
            java.util.Iterator it = com.tencent.mm.plugin.downloader_app.model.x.f97336e.iterator();
            while (it.hasNext()) {
                r02.x0 x0Var = (r02.x0) ((com.tencent.mm.plugin.downloader_app.model.t) it.next());
                x0Var.getClass();
                int i18 = com.tencent.mm.plugin.downloader_app.ui.TaskListView.f97417s2;
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) x0Var.f368342a.getLayoutManager();
                int childCount = linearLayoutManager.getChildCount();
                for (int i19 = 0; i19 <= childCount; i19++) {
                    if (linearLayoutManager.getChildAt(i19) != null) {
                        android.view.View childAt = ((android.view.ViewGroup) linearLayoutManager.getChildAt(i19)).getChildAt(0);
                        if (childAt.getVisibility() == 0 && (childAt instanceof com.tencent.mm.plugin.downloader_app.ui.TaskItemView)) {
                            com.tencent.mm.plugin.downloader_app.ui.TaskItemView taskItemView = (com.tencent.mm.plugin.downloader_app.ui.TaskItemView) childAt;
                            if (taskItemView.B.f97317f.equals(str3)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.TaskItemView", "onOrderWifiDownload, appId: %s", str3);
                                taskItemView.C = false;
                                taskItemView.post(new r02.c0(taskItemView));
                            }
                        }
                    }
                }
            }
        }
        return b17;
    }

    public static boolean d(android.content.Context context, com.tencent.mm.plugin.downloader_app.model.r0 r0Var) {
        h02.a d17 = com.tencent.mm.plugin.downloader.model.m0.d(r0Var.f97317f);
        if (d17 == null) {
            return false;
        }
        if (!com.tencent.mm.vfs.w6.j(d17.field_filePath)) {
            db5.e1.C(context, context.getString(com.tencent.mm.R.string.hfx), context.getString(com.tencent.mm.R.string.hfy), context.getString(com.tencent.mm.R.string.f492835i23), context.getString(com.tencent.mm.R.string.jq7), false, new com.tencent.mm.plugin.downloader_app.model.c(context, r0Var), new com.tencent.mm.plugin.downloader_app.model.d());
            return false;
        }
        k02.l.a(d17.field_downloadId, false, null);
        o02.a.b(10, o02.a.a(r0Var.f97314c), r0Var.f97315d, 44, r0Var.f97317f, "", "");
        return true;
    }

    public static void e(h02.a aVar, com.tencent.mm.plugin.downloader_app.model.r0 r0Var) {
        if (aVar != null) {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.r0.i().t(aVar.field_downloadId);
        }
        o02.a.b(11, o02.a.a(r0Var.f97314c), r0Var.f97315d, 81, r0Var.f97317f, "", "");
    }

    public static void f(android.content.Context context, h02.a aVar, com.tencent.mm.plugin.downloader_app.model.r0 r0Var, boolean z17, m02.b bVar) {
        if (aVar != null) {
            java.lang.String str = aVar.field_extInfo;
            if (str == null || !str.contains("OpInWidget")) {
                org.json.JSONObject jSONObject = null;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    try {
                        str = java.net.URLDecoder.decode(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
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
                    str = java.net.URLEncoder.encode(jSONObject.toString(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                } catch (java.io.UnsupportedEncodingException unused4) {
                }
            }
            aVar.field_extInfo = str;
            aVar.field_downloadType = 1;
            com.tencent.mm.plugin.downloader_app.model.l lVar = new com.tencent.mm.plugin.downloader_app.model.l(context, bVar);
            if (com.tencent.mars.comm.NetStatusUtil.isConnected(context)) {
                boolean Bi = ((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Bi(e42.d0.clicfg_download_game_ignore_network, false);
                if (Bi) {
                    com.tencent.mm.plugin.downloader_app.model.x.c(aVar.field_appId);
                    g(aVar, com.tencent.mars.comm.NetStatusUtil.isWifi(context), lVar);
                } else if (com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
                    com.tencent.mm.plugin.downloader_app.model.x.c(aVar.field_appId);
                    g(aVar, false, lVar);
                } else {
                    vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
                    long j17 = aVar.field_downloadId;
                    com.tencent.mm.plugin.downloader_app.model.n nVar = new com.tencent.mm.plugin.downloader_app.model.n(lVar, aVar);
                    ((uz.c2) a2Var).getClass();
                    com.tencent.mm.plugin.downloader.model.j1.h(context, j17, Bi, nVar);
                }
            } else {
                db5.e1.E(context, context.getString(com.tencent.mm.R.string.h7r), context.getString(com.tencent.mm.R.string.h7s), context.getString(com.tencent.mm.R.string.g8q), false, new com.tencent.mm.plugin.downloader_app.model.m(aVar, lVar));
            }
            g02.c cVar = new g02.c();
            cVar.a(aVar);
            g02.b.c(10, cVar);
        }
        if (z17) {
            o02.a.b(10, o02.a.a(r0Var.f97314c), r0Var.f97315d, 6, r0Var.f97317f, "", "");
        }
    }

    public static boolean g(h02.a aVar, boolean z17, m02.b bVar) {
        if (!com.tencent.mm.plugin.downloader_app.model.s0.b(aVar.field_appId)) {
            java.util.LinkedList c17 = com.tencent.mm.plugin.downloader_app.model.s0.c();
            c17.add(aVar.field_appId);
            com.tencent.mm.plugin.downloader_app.model.q0.b(c17, null);
            com.tencent.mm.plugin.downloader_app.model.s0.a(aVar.field_appId);
        }
        aVar.field_showNotification = false;
        aVar.field_fromDownloadApp = true;
        aVar.field_downloadInWifi = z17;
        aVar.field_reserveInWifi = z17;
        com.tencent.mm.plugin.downloader.model.m0.l(aVar);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        boolean w17 = com.tencent.mm.plugin.downloader.model.r0.i().w(aVar.field_downloadId);
        if (bVar != null) {
            bVar.a(w17 ? m02.a.OK : m02.a.FAIL, aVar.field_downloadId);
        }
        return w17;
    }
}
