package aw1;

/* loaded from: classes12.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final aw1.j1 f96093a = new aw1.j1();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f96094b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f96095c;

    /* renamed from: d, reason: collision with root package name */
    public static long f96096d;

    /* renamed from: e, reason: collision with root package name */
    public static long f96097e;

    public final void a() {
        java.lang.String k17 = wo.w0.k();
        long q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("clean_status_report", gm0.j1.b().h(), 1).q("latest_chat_log_size", 0L);
        long q18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("clean_status_report", gm0.j1.b().h(), 1).q("latest_wechat_total_size", 0L);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("LATEST_STORAGE_DATA", gm0.j1.b().h(), 1);
        long q19 = J2.q("latest_clean_cache_time", 0L);
        long q27 = J2.q("latest_clean_chat_log_time", 0L);
        int i17 = (q19 != 0 || q27 <= 0) ? (q19 <= 0 || q27 != 0) ? (q19 <= 0 || q27 <= 0) ? 0 : 3 : 2 : 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VFSExpireCallbackManager", "report32337, deviceId = " + k17 + ", cleanedOriginImageSize = " + f96096d + ", cleanedOriginVideoSize = " + f96097e + ", latestChatLogSize = " + q17 + ", latestWechatTotalSize = " + q18 + ", cleanType = " + i17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("auto_cleaup_finish", kz5.c1.k(new jz5.l("device_uniqle_id", k17), new jz5.l("auto_cleanup_origin_video", java.lang.Long.valueOf(f96097e)), new jz5.l("auto_cleanup_origin_image", java.lang.Long.valueOf(f96096d)), new jz5.l("before_auto_cleanup_total_size", java.lang.Long.valueOf(q18)), new jz5.l("before_auto_cleanup_chat_size", java.lang.Long.valueOf(q17)), new jz5.l("if_manual_cleanup_before_last_auto", java.lang.Integer.valueOf(i17))), 32337);
        J2.remove("latest_clean_cache_time");
        J2.remove("latest_clean_chat_log_time");
        f96094b = false;
        f96095c = false;
    }
}
