package aw1;

/* loaded from: classes12.dex */
public abstract class v0 {
    public static final void a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("clean_status_report", gm0.j1.b().h(), 1);
        if (J2.p("last_scan_time") <= 0 || !J2.f("scan_result")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportCleanStatus", "Not scanned before, skip report");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - J2.p("last_report_time") < 86400000 && !J2.h("report_cheat")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportCleanStatus", "Interval not match, skip");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(J2.t("scan_result"));
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                java.lang.Object obj = jSONObject.get(next);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                hashMap.put(next, obj);
            }
            long[] c17 = yv1.h1.c();
            hashMap.put("device_stroage_size", java.lang.Long.valueOf(c17[1]));
            hashMap.put("remain_size", java.lang.Long.valueOf(c17[0]));
            hashMap.put("storage_status_ts", java.lang.Long.valueOf(J2.p("last_scan_time")));
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, wo.w0.k());
            long p17 = J2.p("last_enter_clean");
            long j17 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c;
            hashMap.put("has_storage_management", java.lang.Integer.valueOf(p17 / j17 == currentTimeMillis / j17 ? 1 : 0));
            aw1.t0 t0Var = aw1.t0.f96215a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("MicroMsg.ReportC2CFileExist", gm0.j1.b().h(), 1);
            long j18 = J3.getLong("h264_video_cnt", -1L);
            long j19 = J3.getLong("h264_video_size", -1L);
            long j27 = J3.getLong("h265_video_cnt", -1L);
            long j28 = J3.getLong("h265_video_size", -1L);
            hashMap.put("h265_video_cnt", java.lang.Long.valueOf(j27));
            hashMap.put("h265_video_size", java.lang.Long.valueOf(j28));
            hashMap.put("h264_video_cnt", java.lang.Long.valueOf(j18));
            hashMap.put("h264_video_size", java.lang.Long.valueOf(j19));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("user_storage_polling", hashMap, 34574);
            J2.B("last_report_time", currentTimeMillis);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ReportCleanStatus", e17, "Cannot load report.", new java.lang.Object[0]);
        }
    }

    public static final void b(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("clean_status_report", gm0.j1.b().h(), 1);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!z65.c.a()) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (currentTimeMillis - J2.p("last_scan_time") < 604800000 && !J2.h("scan_cheat")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportCleanStatus", "Interval not match, skip");
                return;
            }
        }
        yv1.g1 g1Var = new yv1.g1();
        bw1.f fVar = new bw1.f();
        aw1.v.f(g1Var, new aw1.u0(fVar), c26987xeef691ab, false);
        if (((java.lang.Boolean) fVar.get()).booleanValue()) {
            try {
                J2.B("latest_chat_log_size", g1Var.f547579e);
                J2.B("latest_wechat_total_size", g1Var.f547577c);
                org.json.JSONObject put = new org.json.JSONObject().put("wechat_size", g1Var.f547577c).put("cache_size", g1Var.f547578d + g1Var.f547584j + g1Var.f547585k).put("chat_history_size", g1Var.f547579e).put("resource_file_size", g1Var.f547582h).put("other_account_size", g1Var.f547580f).put("essential_file_size", (((g1Var.f547577c - g1Var.f547579e) - g1Var.f547578d) - g1Var.f547582h) - g1Var.f547580f).put("cache_size_without_origin", g1Var.f547578d).put("origin_visual_size", g1Var.f547584j + g1Var.f547585k);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportCleanStatus", "json = " + put);
                J2.D("scan_result", put.toString());
                J2.B("last_scan_time", currentTimeMillis);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ReportCleanStatus", e17, "Cannot save report.", new java.lang.Object[0]);
            }
            try {
                ((yv1.q) ((c01.d8) i95.n0.c(c01.d8.class))).wi("ReportClean", g1Var.f547579e);
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
