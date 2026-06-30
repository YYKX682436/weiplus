package com.p314xaae8f345.mm.p849xbf8d97c1;

/* loaded from: classes12.dex */
public enum o implements com.p314xaae8f345.mm.p849xbf8d97c1.m {
    INSTANCE;


    /* renamed from: p, reason: collision with root package name */
    public static boolean f150362p = false;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f150363q = false;

    /* renamed from: d, reason: collision with root package name */
    public jr0.l f150365d = null;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f150366e = false;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f150367f = false;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f150368g = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MatrixDelegate");

    /* renamed from: h, reason: collision with root package name */
    public wu5.c f150369h = null;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f150370i = new com.p314xaae8f345.mm.p849xbf8d97c1.w(this);

    /* renamed from: m, reason: collision with root package name */
    public final android.os.Handler f150371m = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    public li.d f150372n;

    o() {
    }

    public static void i(com.p314xaae8f345.mm.p849xbf8d97c1.o oVar, java.lang.String str, boolean z17) {
        oVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(str);
        intent.putExtra(str, z17);
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        com.p314xaae8f345.mm.p849xbf8d97c1.e0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, intent);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent, com.p314xaae8f345.mm.p849xbf8d97c1.p856x6a8fa373.C10887x707c7a64.f150377a);
    }

    public static void j() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_normal_report", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_normal_report, false));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_report_dropframe", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_report_dropframe, true));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_report_frame", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_report_frame, false));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_detect_syncbarrier_leak", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_detect_syncbarrier_leak, false));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_matrix_base_swtich", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_matrix_base_swtich, false));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_matrix_traceplugin_switch", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_matrix_traceplugin_switch, true));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_matrix_trace_evil_method_switch", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_matrix_trace_evil_method_switch, false));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_matrix_io_switch", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_matrix_io_switch, false));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_matrix_new_frame_tracer_switch", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_matrix_new_frame_tracer_switch, false));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_matrix_startup_tracer_switch", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_matrix_startup_tracer_switch, false));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_matrix_trace_looper_printer_switch", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_matrix_trace_looper_printer_switch, true));
        java.lang.String str = android.os.Build.BRAND;
        boolean z17 = ((str.toLowerCase().contains("lenovo") && wo.w0.m().toLowerCase().contains("tb")) || str.toLowerCase().contains("royole")) ? false : true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixDelegate", "cameraCacheDevice = " + z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_camera_util_use_cache_new", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_camera_util_use_cache_new, true) && z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_voip_camera_info_use_cache_new", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_camera_info_use_cache_new, true) && z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_network_cache_wifi", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_network_cache_wifi, true));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_network_cache_wap", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_network_cache_wap, true));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_get_active_network_cache", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_get_active_network_cache, true));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_record_history_msg", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_record_history_msg, false));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_touch_event_tracer", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_touch_event_tracer, false));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_idle_handler_tracer", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_idle_handler_tracer, false));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_pthread_key_seq", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_pthread_key_seq, false));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_matrix_settings_entrance", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_matrix_settings_entrance, false));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("mmkv_log_monitor_short_time_count", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_log_monitor_short_time_count, 0));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("mmkv_log_monitor_long_time_count", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_log_monitor_long_time_count, 0));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("mmkv_log_monitor_long_long_time_count", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_log_monitor_long_long_time_count, 0));
    }

    public static boolean k() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixDelegate", "[debugEnableEvilMethod] ret=%s", java.lang.Boolean.FALSE);
        return false;
    }

    public final wi.b h() {
        boolean h17 = ih.a.h("clicfg_android_enable_memory_fork_lazy_dump_solid", true);
        if (ih.a.h("clicfg_android_enable_memory_fork_lazy_dump_v2_solid", true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixDelegate", "LAZY_FORK_ANALYZE_V2");
            return wi.b.LAZY_FORK_ANALYZE_V2;
        }
        if (h17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixDelegate", "LAZY_FORK_ANALYZE");
            return wi.b.LAZY_FORK_ANALYZE;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixDelegate", "FORK_ANALYZE");
        return wi.b.FORK_ANALYSE;
    }

    public void l(java.util.Queue queue) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = queue.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17++;
            sb6.append((gj.j) it.next());
            sb6.append("\n");
            if (i17 % 10 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixDelegate", "DumpDenseMsg, info = \n" + sb6.toString());
                sb6 = new java.lang.StringBuilder();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixDelegate", "DumpDenseMsg, info.end = " + sb6.toString());
    }

    public final boolean m() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s() || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixDelegate", "[isEnableActivityLeak] isEnable=%s", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public final void n(boolean z17) {
        if (!this.f150366e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MatrixDelegate", "[onAppForeground] but matrix is never initialized, delay to notify!");
            this.f150367f = true;
            return;
        }
        java.util.Iterator it = ih.d.d().f373003a.iterator();
        while (it.hasNext()) {
            qi.b bVar = (qi.b) it.next();
            if (!(bVar instanceof dj.b) && !(bVar instanceof ph.u)) {
                bVar.a(z17);
            }
        }
        if (z17 && f150363q) {
            if (this.f150369h == null) {
                this.f150369h = ((ku5.t0) ku5.t0.f394148d).d(new com.p314xaae8f345.mm.p849xbf8d97c1.s(this), 100L, 5000L);
                return;
            }
            return;
        }
        wu5.c cVar = this.f150369h;
        if (cVar == null || cVar.isCancelled()) {
            return;
        }
        this.f150369h.cancel(true);
        this.f150369h = null;
    }

    public void o(ih.d dVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixDelegate", "onFinalJob");
        int i17 = p() ? this.f150368g.getInt("ENABLE_FPS_FLOAT", 0) : 0;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(i17 == 1);
        objArr[1] = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixDelegate", "[isEnableFpsFloat] enable=%s, value=%s", objArr);
        if (i17 == 1) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = com.p314xaae8f345.mm.p849xbf8d97c1.e0.f150243a;
            if (android.provider.Settings.canDrawOverlays(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p849xbf8d97c1.t(this));
            }
        }
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p849xbf8d97c1.u(this), "Matrix-Save-AccInfo");
        this.f150366e = true;
        if (this.f150367f) {
            n(com.p314xaae8f345.mm.app.w.INSTANCE.f135422n);
        }
        lr0.f.f402163a = lr0.b.f402159d;
        lr0.f.f402165c = lr0.e.f402162d;
        lr0.f.f402166d = lr0.a.f402158d;
        lr0.f.f402167e = lr0.g.f402168d;
        try {
            if (!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.d()) {
                com.p314xaae8f345.mm.p849xbf8d97c1.p858xc0d355b8.C10889xf2b6a72 c10889xf2b6a72 = com.p314xaae8f345.mm.p849xbf8d97c1.p858xc0d355b8.C10889xf2b6a72.f150380d;
                c10889xf2b6a72.getClass();
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("com.tencent.mm.RemoteTrigger");
                if (fp.h.a(33)) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(c10889xf2b6a72, intentFilter, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.WXApp.f32839x928a5f8c, null);
                } else {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(c10889xf2b6a72, intentFilter, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.WXApp.f32839x928a5f8c, null, 2);
                }
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d("MatrixDelegate", th6, "", new java.lang.Object[0]);
        }
        if (m()) {
            rk5.b.f478674d.c(new com.p314xaae8f345.mm.p849xbf8d97c1.v(this));
        }
    }

    public boolean p() {
        if (z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            return true;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().i("clicfg_matrix_settings_entrance", false);
    }

    public java.lang.String r(gj.j jVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String m131663x9616526c = jVar.m131663x9616526c();
        if (m131663x9616526c.contains("(")) {
            str = m131663x9616526c.substring(m131663x9616526c.indexOf("(") + 1, m131663x9616526c.indexOf(")"));
            str2 = m131663x9616526c.substring(m131663x9616526c.indexOf("}") + 2);
            if (!str2.equals("null") && m131663x9616526c.contains("@")) {
                str2 = m131663x9616526c.substring(m131663x9616526c.indexOf("}") + 2, m131663x9616526c.lastIndexOf("@"));
            }
        } else {
            str = "";
            str2 = "";
        }
        return str + " : " + str2;
    }
}
