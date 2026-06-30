package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f64832b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final android.content.IntentFilter f64833c = new android.content.IntentFilter();

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.console.Shell$Receiver f64834a = null;

    static {
        b("wechat.shell.SET_NEXTRET", new com.tencent.mm.console.u1(), true);
        b("wechat.shell.SET_LOGLEVEL", new com.tencent.mm.console.f2(), true);
        b("wechat.shell.SET_DKTEST", new com.tencent.mm.console.q2(), true);
        b("wechat.shell.NET_DNS_TEST", new com.tencent.mm.console.b3(), true);
        b("wechat.shell.IDC_ERROR", new com.tencent.mm.console.m3(), true);
        b("wechat.shell.OPENGL_HOOK_DUMP", new com.tencent.mm.console.n3(), true);
        b("wechat.shell.SET_DK_WT_TEST", new com.tencent.mm.console.i4(), true);
        b("wechat.shell.SET_MUTE_ROOM_TEST", new com.tencent.mm.console.t4(), true);
        b("wechat.shell.HOTPATCH_TEST", new com.tencent.mm.console.f5(), true);
        b("wechat.shell.EXEC_STATUSDB_SQL", new com.tencent.mm.console.g1(), true);
        b("wechat.shell.GET_ROAM_PACKAGE_INFO", new com.tencent.mm.console.k1(), true);
        b("wechat.shell.GET_STAND_ALONE_PACKAGE", new com.tencent.mm.console.l1(), true);
        b("wechat.shell.MAKE_DIR", new com.tencent.mm.console.m1(), true);
        b("wechat.shell.DU", new com.tencent.mm.console.n1(), true);
        b("wechat.shell.REPORT_C2C_BY_ONE_DAY", new com.tencent.mm.console.o1(), true);
        b("wechat.shell.EXPORT_OHOS_MIGRATE_DATA", new com.tencent.mm.console.p1(), true);
        b("wechat.shell.EXEC_SQL", new com.tencent.mm.console.q1(), true);
        b("wechat.shell.GC", new com.tencent.mm.console.s1(), true);
        b("wechat.shell.OOM", new com.tencent.mm.console.t1(), true);
        b("wechat.shell.DUMP_AND_PUBLISH", new com.tencent.mm.console.v1(), true);
        b("wechat.shell.DUMP_SMAPS", new com.tencent.mm.console.w1(), true);
        b("wechat.shell.DUMP_HPROF", new com.tencent.mm.console.x1(), true);
        b("wechat.shell.DUMP_BITMAP", new com.tencent.mm.console.y1(), true);
        b("wechat.shell.HOOK_ALL", new com.tencent.mm.console.z1(), true);
        b("wechat.shell.HOOK_MM", new com.tencent.mm.console.a2(), true);
        b("wechat.shell.DISABLE_HOOK_TOAST", new com.tencent.mm.console.b2(), true);
        b("wechat.shell.HOOK_DISABLE", new com.tencent.mm.console.c2(), true);
        b("wechat.shell.HOOK_REPORT", new com.tencent.mm.console.d2(), true);
        b("wechat.shell.ROAM_DG", new com.tencent.mm.console.e2(), true);
        b("wechat.shell.ROAM_CANCEL_DG", new com.tencent.mm.console.g2(), true);
        b("wechat.shell.MEMORY_HOOK", new com.tencent.mm.console.h2(), true);
        b("wechat.shell." + tp3.b.a("\u0099\u009d\u0082\u0080\u0089\u008d\u0095\u0089\u0085\u0096\u0083\u0098\u008f\u0085\u0087\u009b"), new com.tencent.mm.console.i2(), true);
        b("wechat.shell." + tp3.b.a("\u0099\u009d\u0082\u0080\u0089\u008d\u0095\u0089\u0085\u0096\u0083\u0098\u0096\u0085\u0087\u009b"), new com.tencent.mm.console.j2(), true);
        b("wechat.shell." + tp3.b.a("\u009b\u009f\u0084\u0086\u008b\u008f\u009b\u0087\u0087\u0094\u0085\u009e\u0091\u008c"), new com.tencent.mm.console.k2(), true);
        b("wechat.shell." + tp3.b.a("\u009c\u009a\u0087\u008b\u0084\u0082\u0098\u008d\u0080\u0092\u0090"), new com.tencent.mm.console.l2(), true);
        b("wechat.shell." + tp3.b.a("\u009d\u0099\u0086\u0084\u0085\u0081\u0099\u0094\u008d\u0080\u0092\u0090"), new com.tencent.mm.console.m2(), true);
        b("wechat.shell.RECOVERY_LAUNCH_UI", new com.tencent.mm.console.n2(), true);
        b("wechat.shell.RECOVERY_FETCH_PATCH", new com.tencent.mm.console.o2(), true);
        b("wechat.shell.RECOVERY_EXERCISE_STOP", new com.tencent.mm.console.p2(), true);
        b("wechat.shell.RECOVERY_EXERCISE", new com.tencent.mm.console.r2(), true);
        b("wechat.shell.MATRIX_BATTERY_DUMP_THREAD", new com.tencent.mm.console.s2(), true);
        b("wechat.shell.MATRIX_DUMP_TRACE", new com.tencent.mm.console.t2(), true);
        b("wechat.shell.MATRIX_DUMP_SAMPLING_TRACE", new com.tencent.mm.console.u2(), true);
        b("wechat.shell.MATRIX_STOP_TRACE", new com.tencent.mm.console.v2(), true);
        b("wechat.shell.ROAM_SVC_START", new com.tencent.mm.console.w2(), true);
        b("wechat.shell.ROAM_SVC_STOP", new com.tencent.mm.console.x2(), true);
        b("wechat.shell.MATRIX_BATTERY_TOP_SHELL", new com.tencent.mm.console.y2(), true);
        b("wechat.shell.MATRIX_BATTERY_TOP_SHELL_STOP", new com.tencent.mm.console.z2(), true);
        b("wechat.shell.MATRIX_BATTERY_TOP_SHOW", new com.tencent.mm.console.a3(), true);
        b("wechat.shell.MATRIX_BATTERY_TOP_HIDE", new com.tencent.mm.console.c3(), true);
        b("wechat.shell.MATRIX_PROC_RECYCLE_BG_MIN", new com.tencent.mm.console.d3(), true);
        b("wechat.shell.MATRIX_BATTERY_PROFILER", new com.tencent.mm.console.e3(), true);
        b("wechat.shell.MATRIX_BATTERY_PROFILER_STOP", new com.tencent.mm.console.f3(), true);
        b("wechat.shell.STORAGE_CACHE_CLEAN", new com.tencent.mm.console.g3(), true);
        b("wechat.shell.THREAD_HOOK", new com.tencent.mm.console.h3(), true);
        b("wechat.shell.THREAD_DUMP", new com.tencent.mm.console.i3(), true);
        b("wechat.shell.FINDER_SHELL", new com.tencent.mm.console.j3(), true);
        b("wechat.shell.WATCH_MEM", new com.tencent.mm.console.k3(), true);
        b("wechat.shell.TRIM_MEM", new com.tencent.mm.console.l3(), true);
        b("wechat.shell.WATCH_PROC", new com.tencent.mm.console.o3(), true);
        b("wechat.shell.UPLOAD_RECENT_XLOG", new com.tencent.mm.console.p3(), true);
        b("wechat.shell.MOVE_XLOG", new com.tencent.mm.console.q3(), false);
        com.tencent.mm.console.r3 r3Var = new com.tencent.mm.console.r3();
        b("wechat.shell.OpenWeApp", r3Var, true);
        b("wechat.shell.KillWeApp", r3Var, true);
        b("wechat.shell.FINDER_VIDEO_TEST", new com.tencent.mm.console.s3(), true);
        b("wechat.shell.EXPT_TEST", new com.tencent.mm.console.t3(), true);
        b("wechat.shell.DUMP_MAPS", new com.tencent.mm.console.u3(), true);
        b("wechat.shell.BRANDS_XID", new com.tencent.mm.console.v3(), true);
        b("wechat.shell.BRANDS_BIZ", new com.tencent.mm.console.w3(), true);
        b("wechat.shell.BRANDS_CLEAR", new com.tencent.mm.console.x3(), true);
        b("wechat.shell.BRANDS_DUMP", new com.tencent.mm.console.y3(), true);
        b("wechat.shell.WATCH_FD", new com.tencent.mm.console.z3(), true);
        b("wechat.shell.PRINT_INFO", new com.tencent.mm.console.a4(), true);
        b("wechat.shell.SET_REPAIRER", new com.tencent.mm.console.b4(), true);
        b("wechat.shell.DISABLE_ACTIVITY_NOTIFIER", new com.tencent.mm.console.c4(), true);
        b("wechat.shell.MUTE_ACTIVITY_NOTIFIER", new com.tencent.mm.console.d4(), true);
        b("wechat.shell.WATCH_THREAD", new com.tencent.mm.console.e4(), true);
        b("wechat.shell.CLASSLOADER_DUMP", new com.tencent.mm.console.f4(), true);
        b("wechat.shell.LIVE_STREAM_LOCAL_VIDEO", new com.tencent.mm.console.g4(), true);
        b("wechat.shell.LRU_KILL", new com.tencent.mm.console.h4(), true);
        b("wechat.shell.WATCH_TASK", new com.tencent.mm.console.j4(), true);
        b("wechat.shell.WATCH_ACTIVITY", new com.tencent.mm.console.p0$$a(), true);
        b("wechat.shell.CLEAR_TASK", new com.tencent.mm.console.k4(), true);
        b("wechat.shell.DUMP_VIEW", new com.tencent.mm.console.l4(), true);
        b("wechat.shell.TEST_REPORT", new com.tencent.mm.console.p0$$b(), true);
        b("wechat.shell.TEST_MTE", new com.tencent.mm.console.p0$$c(), true);
        b("wechat.shell.TEST_HALF", new com.tencent.mm.console.p0$$d(), true);
        b("wechat.shell.FINDER_LIVE_NEW_ENTRANCE", new com.tencent.mm.console.m4(), true);
        b("wechat.shell.FINDER_LIVE_DELETE_MULTI_STREAM", new com.tencent.mm.console.n4(), true);
        b("wechat.shell.FINDER_LIVE_CHANGE_MULTI_STREAM", new com.tencent.mm.console.o4(), true);
        b("wechat.shell.COPY_LIBRARY_FROM_SDCARD", new com.tencent.mm.console.p0$$e(), true);
        b("wechat.shell.FINDER_LIVE_CHEER_UPDATE", new com.tencent.mm.console.p4(), true);
        b("wechat.shell.RESTART_PROCESS", new com.tencent.mm.console.q4(), true);
        b("wechat.shell.FINDER_SUPPORT_FIND_PAGE_LIVE", new com.tencent.mm.console.r4(), true);
        b("wechat.shell.SET_VOIP_SETTING_CUSTOM", new com.tencent.mm.console.s4(), true);
        b("wechat.shell.RUN_XWEB_COMMAND", new com.tencent.mm.console.u4(), true);
        b("wechat.shell.SET_VOIP_QOS_CUSTOM", new com.tencent.mm.console.v4(), true);
        b("wechat.shell.DUMP_ALL", new com.tencent.mm.console.w4(), true);
        b("wechat.shell.DUMP_TRACE", new com.tencent.mm.console.x4(), true);
        b("wechat.shell.Report_IMAGE_AND_VIDEO", new com.tencent.mm.console.y4(), true);
        b("wechat.shell.CONVERT_JPG_TO_WXAM", new com.tencent.mm.console.z4(), true);
        b("wechat.shell.CONVERT_H265", new com.tencent.mm.console.a5(), true);
        b("wechat.shell.CLEAN_WILD_C2C_FILE", new com.tencent.mm.console.b5(), true);
        b("wechat.shell.CHECK_NEW_WILD_FILE", new com.tencent.mm.console.c5(), true);
        b("wechat.shell.CONVERT_VIDEO_TO_H265", new com.tencent.mm.console.e5(), true);
        b("wechat.shell.CONVERT_ORIGINAL_MEDIA", new com.tencent.mm.console.q0(), true);
        b("wechat.shell.CONVERT_ORIGINAL_MEDIA_SUSPEND", new com.tencent.mm.console.t0(), true);
        b("wechat.shell.CONVERT_ORIGINAL_MEDIA_WAKEUP", new com.tencent.mm.console.v0(), true);
        b("wechat.shell.DUMP_C2C_IMAGE", new com.tencent.mm.console.x0(), true);
        b("wechat.shell.CLEAN_HD_THUMB", new com.tencent.mm.console.z0(), true);
        b("wechat.shell.CLEAN_COMPRESS_VIDEO", new com.tencent.mm.console.b1(), true);
        b("wechat.shell.JPG2WXAM", new com.tencent.mm.console.d1(), true);
        b("wechat.shell.TEST_WCPROBE", new com.tencent.mm.console.e1(), true);
        b("wechat.shell.TEST_ROAM_DO_DEBUG_CMD", new com.tencent.mm.console.f1(), true);
        b("wechat.shell.WXINDEX_CALC", new com.tencent.mm.console.p0$$f(), true);
        b("wechat.shell.FLUTTER_START_FLUENCY_TRACKER", new com.tencent.mm.console.p0$$g(), true);
        b("wechat.shell.FLUTTER_REPORT_FLUENCY_TRACKER", new com.tencent.mm.console.p0$$h(), true);
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        return android.text.TextUtils.isEmpty(str) ? str2 : str;
    }

    public static void b(java.lang.String str, com.tencent.mm.console.g5 g5Var, boolean z17) {
        boolean z18 = true;
        if (!(g5Var instanceof com.tencent.mm.console.h5) && !com.tencent.mm.sdk.platformtools.x2.n()) {
            z18 = false;
        }
        if (z18) {
            if (!z17 || z65.c.a()) {
                f64833c.addAction(str);
                f64832b.put(str, g5Var);
            }
        }
    }

    public static void c(com.tencent.mm.vfs.r6 r6Var, int i17) {
        com.tencent.mm.vfs.r6[] G;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i18 = 0; i18 < i17; i18++) {
            sb6.append("    ");
        }
        if (r6Var.m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Shell", ((java.lang.Object) sb6) + "|-- " + r6Var.getName() + ", size = " + r6Var.C());
        }
        if (!r6Var.y() || (G = r6Var.G()) == null) {
            return;
        }
        for (com.tencent.mm.vfs.r6 r6Var2 : G) {
            c(r6Var2, i17 + 1);
        }
    }
}
