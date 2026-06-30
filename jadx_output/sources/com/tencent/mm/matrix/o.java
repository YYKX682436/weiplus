package com.tencent.mm.matrix;

/* loaded from: classes12.dex */
public enum o implements com.tencent.mm.matrix.m {
    INSTANCE;


    /* renamed from: p, reason: collision with root package name */
    public static boolean f68829p = false;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f68830q = false;

    /* renamed from: d, reason: collision with root package name */
    public jr0.l f68832d = null;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f68833e = false;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f68834f = false;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f68835g = com.tencent.mm.sdk.platformtools.o4.M("MatrixDelegate");

    /* renamed from: h, reason: collision with root package name */
    public wu5.c f68836h = null;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f68837i = new com.tencent.mm.matrix.w(this);

    /* renamed from: m, reason: collision with root package name */
    public final android.os.Handler f68838m = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    public li.d f68839n;

    o() {
    }

    public static void i(com.tencent.mm.matrix.o oVar, java.lang.String str, boolean z17) {
        oVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(str);
        intent.putExtra(str, z17);
        intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        com.tencent.mm.matrix.e0.a(com.tencent.mm.sdk.platformtools.x2.f193071a, intent);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent, com.tencent.mm.matrix.strategy.MatrixStrategyNotifyBroadcast.f68844a);
    }

    public static void j() {
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_normal_report", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_normal_report, false));
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_report_dropframe", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_report_dropframe, true));
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_report_frame", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_report_frame, false));
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_detect_syncbarrier_leak", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_detect_syncbarrier_leak, false));
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_matrix_base_swtich", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_matrix_base_swtich, false));
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_matrix_traceplugin_switch", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_matrix_traceplugin_switch, true));
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_matrix_trace_evil_method_switch", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_matrix_trace_evil_method_switch, false));
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_matrix_io_switch", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_matrix_io_switch, false));
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_matrix_new_frame_tracer_switch", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_matrix_new_frame_tracer_switch, false));
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_matrix_startup_tracer_switch", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_matrix_startup_tracer_switch, false));
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_matrix_trace_looper_printer_switch", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_matrix_trace_looper_printer_switch, true));
        java.lang.String str = android.os.Build.BRAND;
        boolean z17 = ((str.toLowerCase().contains("lenovo") && wo.w0.m().toLowerCase().contains("tb")) || str.toLowerCase().contains("royole")) ? false : true;
        com.tencent.mars.xlog.Log.i("MatrixDelegate", "cameraCacheDevice = " + z17);
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_camera_util_use_cache_new", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_camera_util_use_cache_new, true) && z17);
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_voip_camera_info_use_cache_new", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_camera_info_use_cache_new, true) && z17);
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_network_cache_wifi", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_network_cache_wifi, true));
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_network_cache_wap", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_network_cache_wap, true));
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_get_active_network_cache", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_get_active_network_cache, true));
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_record_history_msg", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_record_history_msg, false));
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_touch_event_tracer", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_touch_event_tracer, false));
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_idle_handler_tracer", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_idle_handler_tracer, false));
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_pthread_key_seq", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_pthread_key_seq, false));
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_matrix_settings_entrance", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_matrix_settings_entrance, false));
        com.tencent.mm.sdk.platformtools.o4.L().A("mmkv_log_monitor_short_time_count", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_log_monitor_short_time_count, 0));
        com.tencent.mm.sdk.platformtools.o4.L().A("mmkv_log_monitor_long_time_count", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_log_monitor_long_time_count, 0));
        com.tencent.mm.sdk.platformtools.o4.L().A("mmkv_log_monitor_long_long_time_count", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_log_monitor_long_long_time_count, 0));
    }

    public static boolean k() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mars.xlog.Log.i("MatrixDelegate", "[debugEnableEvilMethod] ret=%s", java.lang.Boolean.FALSE);
        return false;
    }

    public final wi.b h() {
        boolean h17 = ih.a.h("clicfg_android_enable_memory_fork_lazy_dump_solid", true);
        if (ih.a.h("clicfg_android_enable_memory_fork_lazy_dump_v2_solid", true)) {
            com.tencent.mars.xlog.Log.i("MatrixDelegate", "LAZY_FORK_ANALYZE_V2");
            return wi.b.LAZY_FORK_ANALYZE_V2;
        }
        if (h17) {
            com.tencent.mars.xlog.Log.i("MatrixDelegate", "LAZY_FORK_ANALYZE");
            return wi.b.LAZY_FORK_ANALYZE;
        }
        com.tencent.mars.xlog.Log.i("MatrixDelegate", "FORK_ANALYZE");
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
                com.tencent.mars.xlog.Log.i("MatrixDelegate", "DumpDenseMsg, info = \n" + sb6.toString());
                sb6 = new java.lang.StringBuilder();
            }
        }
        com.tencent.mars.xlog.Log.i("MatrixDelegate", "DumpDenseMsg, info.end = " + sb6.toString());
    }

    public final boolean m() {
        boolean z17 = com.tencent.mm.sdk.platformtools.x2.n() || com.tencent.mm.sdk.platformtools.x2.s() || com.tencent.mm.sdk.platformtools.x2.j();
        com.tencent.mars.xlog.Log.i("MatrixDelegate", "[isEnableActivityLeak] isEnable=%s", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public final void n(boolean z17) {
        if (!this.f68833e) {
            com.tencent.mars.xlog.Log.w("MatrixDelegate", "[onAppForeground] but matrix is never initialized, delay to notify!");
            this.f68834f = true;
            return;
        }
        java.util.Iterator it = ih.d.d().f291470a.iterator();
        while (it.hasNext()) {
            qi.b bVar = (qi.b) it.next();
            if (!(bVar instanceof dj.b) && !(bVar instanceof ph.u)) {
                bVar.a(z17);
            }
        }
        if (z17 && f68830q) {
            if (this.f68836h == null) {
                this.f68836h = ((ku5.t0) ku5.t0.f312615d).d(new com.tencent.mm.matrix.s(this), 100L, 5000L);
                return;
            }
            return;
        }
        wu5.c cVar = this.f68836h;
        if (cVar == null || cVar.isCancelled()) {
            return;
        }
        this.f68836h.cancel(true);
        this.f68836h = null;
    }

    public void o(ih.d dVar) {
        com.tencent.mars.xlog.Log.i("MatrixDelegate", "onFinalJob");
        int i17 = p() ? this.f68835g.getInt("ENABLE_FPS_FLOAT", 0) : 0;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(i17 == 1);
        objArr[1] = java.lang.Integer.valueOf(i17);
        com.tencent.mars.xlog.Log.i("MatrixDelegate", "[isEnableFpsFloat] enable=%s, value=%s", objArr);
        if (i17 == 1) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.matrix.e0.f68710a;
            if (android.provider.Settings.canDrawOverlays(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.matrix.t(this));
            }
        }
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.matrix.u(this), "Matrix-Save-AccInfo");
        this.f68833e = true;
        if (this.f68834f) {
            n(com.tencent.mm.app.w.INSTANCE.f53889n);
        }
        lr0.f.f320630a = lr0.b.f320626d;
        lr0.f.f320632c = lr0.e.f320629d;
        lr0.f.f320633d = lr0.a.f320625d;
        lr0.f.f320634e = lr0.g.f320635d;
        try {
            if (!com.tencent.matrix.lifecycle.supervisor.d0.f52834k.d()) {
                com.tencent.mm.matrix.trigger.RemoteTrigger remoteTrigger = com.tencent.mm.matrix.trigger.RemoteTrigger.f68847d;
                remoteTrigger.getClass();
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("com.tencent.mm.RemoteTrigger");
                if (fp.h.a(33)) {
                    com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(remoteTrigger, intentFilter, com.tencent.mm.opensdk.constants.ConstantsAPI.WXApp.WXAPP_BROADCAST_PERMISSION, null);
                } else {
                    com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(remoteTrigger, intentFilter, com.tencent.mm.opensdk.constants.ConstantsAPI.WXApp.WXAPP_BROADCAST_PERMISSION, null, 2);
                }
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d("MatrixDelegate", th6, "", new java.lang.Object[0]);
        }
        if (m()) {
            rk5.b.f397141d.c(new com.tencent.mm.matrix.v(this));
        }
    }

    public boolean p() {
        if (z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192975c) {
            return true;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return com.tencent.mm.sdk.platformtools.o4.L().i("clicfg_matrix_settings_entrance", false);
    }

    public java.lang.String r(gj.j jVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String jVar2 = jVar.toString();
        if (jVar2.contains("(")) {
            str = jVar2.substring(jVar2.indexOf("(") + 1, jVar2.indexOf(")"));
            str2 = jVar2.substring(jVar2.indexOf("}") + 2);
            if (!str2.equals("null") && jVar2.contains("@")) {
                str2 = jVar2.substring(jVar2.indexOf("}") + 2, jVar2.lastIndexOf("@"));
            }
        } else {
            str = "";
            str2 = "";
        }
        return str + " : " + str2;
    }
}
