package by5;

/* loaded from: classes13.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.HashSet f36430a;

    static {
        d("cmd", false, new by5.o1());
        c("enable_remote_debug", "inspector", false, new by5.z1());
        d("show_webview_version", false, new by5.k2());
        c("ignore_crash_watch", "ignore_crashwatch", true, new by5.v2());
        d("reset_crash_count", true, new by5.g3());
        d("clear_cache", false, new by5.q3());
        d("clear_old_version", false, new by5.r3());
        d("clear_all_version", false, new by5.s3());
        c("check_update", "check_xwalk_update", false, new by5.t3());
        d("try_check_update", false, new by5.e1());
        d("check_plugin_update", false, new by5.f1());
        c("set_gray_value", "set_grayvalue", false, new by5.g1());
        d("set_config_url", false, new by5.h1());
        d("set_plugin_config_url", false, new by5.i1());
        c("clear_config_timestamp", "clear_config_time_stamp", false, new by5.j1());
        d("clear_schedule", false, new by5.k1());
        d("clear_test_setting", false, new by5.l1());
        d("enable_check_storage", false, new by5.m1());
        d("reset_webview_kind", false, new by5.n1());
        d("reset_webview_kind_sys", false, new by5.p1());
        d("reset_webview_kind_xweb", false, new by5.q1());
        d("set_mm_config", false, new by5.r1());
        c("set_tools_config", "set_web_config", false, new by5.s1());
        d("set_appbrand_config", false, new by5.t1());
        d("mm_webview_mode", false, new by5.u1());
        d("check_files", false, new by5.v1());
        d("multi_profile_mode", false, new by5.w1());
        d("install_embed_core", false, new by5.x1());
        d("enable_new_debug_page", true, new by5.y1());
        d("enable_show_version", true, new by5.a2());
        d("enable_test_base_config", true, new by5.b2());
        c("enable_show_fps", "show_fps", true, new by5.c2());
        c("enable_show_save_page", "save_page", true, new by5.d2());
        d("load_saved_page", true, new by5.e2());
        d("clear_saved_page", true, new by5.f2());
        d("clear_config_commands", true, new by5.g2());
        d("recheck_config_commands", true, new by5.h2());
        d("kill_gpu_process", true, new by5.i2());
        d("kill_render_process", true, new by5.j2());
        d("kill_child_process", true, new by5.l2());
        d("kill_tools_process", true, new by5.m2());
        d("kill_all_process", true, new by5.n2());
        d("revert_to_apk", true, new by5.o2());
        c("set_apk_version", "set_apkver", true, new by5.p2());
        c("load_cache_package", "load_local_xwalk", true, new by5.q2());
        d("load_sdcard_package", true, new by5.r2());
        d("enable_forbid_download_code", true, new by5.s2());
        d("enable_check_thread", true, new by5.t2());
        d("delete_origin", true, new by5.u2());
        d("gpu_native_crash", true, new by5.w2());
        d("gpu_java_crash", true, new by5.x2());
        d("render_native_crash", true, new by5.y2());
        d("browser_native_crash", true, new by5.z2());
        d("set_dark_mode", true, new by5.a3());
        d("enable_debug_package", true, new by5.b3());
        d("enable_auto_check_update", true, new by5.c3());
        d("set_runtime_config", true, new by5.d3());
        d("start_record_main_trace_when_startup", true, new by5.e3());
        d("start_record_main_trace", true, new by5.f3());
        d("stop_record_main_trace", true, new by5.h3());
        d("start_record_appbrand_trace_when_startup", true, new by5.i3());
        d("start_record_appbrand_trace", true, new by5.j3());
        d("stop_record_appbrand_trace", true, new by5.k3());
        d("clear_all_plugin", true, new by5.l3());
        d("install_embed_plugin", true, new by5.m3());
        d("set_force_use_office_reader", true, new by5.n3());
        d("disable_file_reader_cache", true, new by5.o3());
        d("disable_file_reader_crash_detect", true, new by5.p3());
    }

    public static qx5.c a(java.lang.String str) {
        if (f36430a == null || android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.util.Iterator it = f36430a.iterator();
        while (it.hasNext()) {
            qx5.c cVar = (qx5.c) it.next();
            if (cVar.f367483a.equals(str) || str.equals(cVar.f367484b)) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static qx5.a b(final android.os.Bundle r13, final qx5.l r14) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: by5.d1.b(android.os.Bundle, qx5.l):qx5.a");
    }

    public static void c(java.lang.String str, java.lang.String str2, boolean z17, qx5.j jVar) {
        if (f36430a == null) {
            f36430a = new java.util.HashSet();
        }
        if (a(str) != null) {
            by5.c4.c("XWebCommandHandler", "registerDebugCommand, name:" + str + " has been registered");
        }
        f36430a.add(new qx5.c(str, str2, z17, jVar));
    }

    public static void d(java.lang.String str, boolean z17, qx5.j jVar) {
        if (f36430a == null) {
            f36430a = new java.util.HashSet();
        }
        if (a(str) != null) {
            by5.c4.c("XWebCommandHandler", "registerDebugCommand, name:" + str + " has been registered");
        }
        f36430a.add(new qx5.c(str, z17, jVar));
    }
}
