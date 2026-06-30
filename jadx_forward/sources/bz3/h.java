package bz3;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f118308b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f118309c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f118310d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f118311e = true;

    /* renamed from: f, reason: collision with root package name */
    public static int f118312f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f118313g = false;

    /* renamed from: h, reason: collision with root package name */
    public static int f118314h = 20;

    /* renamed from: i, reason: collision with root package name */
    public static int f118315i = 12;

    /* renamed from: j, reason: collision with root package name */
    public static int f118316j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f118317k = true;

    /* renamed from: q, reason: collision with root package name */
    public static int f118323q;

    /* renamed from: r, reason: collision with root package name */
    public static int f118324r;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f118325s;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f118326t;

    /* renamed from: a, reason: collision with root package name */
    public static final bz3.h f118307a = new bz3.h();

    /* renamed from: l, reason: collision with root package name */
    public static final jz5.g f118318l = jz5.h.b(bz3.g.f118306d);

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f118319m = jz5.h.b(bz3.c.f118302d);

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f118320n = jz5.h.b(bz3.f.f118305d);

    /* renamed from: o, reason: collision with root package name */
    public static final jz5.g f118321o = jz5.h.b(bz3.a.f118300d);

    /* renamed from: p, reason: collision with root package name */
    public static final jz5.g f118322p = jz5.h.b(bz3.b.f118301d);

    /* renamed from: u, reason: collision with root package name */
    public static final jz5.g f118327u = jz5.h.b(bz3.d.f118303d);

    /* renamed from: v, reason: collision with root package name */
    public static final jz5.g f118328v = jz5.h.b(bz3.e.f118304d);

    static {
        f118326t = true;
        try {
            boolean a17 = gm0.j1.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanClientConfigManager", "initMMKV %s, mmkv: %s", java.lang.Boolean.valueOf(a17), f118308b);
            if (a17 && f118308b == null) {
                f118308b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(c01.z1.r() + "_scan_client_config_mmkv");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanClientConfigManager", e17, "checkInitMMKV exception", new java.lang.Object[0]);
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_image_ocr_disable, 0);
        if (Ni == 1) {
            f118310d = false;
        }
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_merge_scan_product_skip_frame_count, 4);
        if (Ni2 > 0) {
            f118312f = Ni2;
        }
        f118323q = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_merge_scan_similar_threshold, 15);
        f118324r = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_merge_scan_similar_post_threshold, 15);
        f118325s = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_scan_merge_scan_pre_similar_filter, false);
        f118326t = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_scan_merge_scan_post_similar_filter, true);
        f118316j = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2566x35c67d.C20663x848c85fb());
        int Ni3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_merge_disable_image_detect_by_server, 0);
        int Ni4 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_merge_scan_no_result_frame_count_limit, 20);
        if (Ni3 == 1) {
            f118313g = true;
        }
        if (Ni4 > 0) {
            f118314h = Ni4;
        }
        int Ni5 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_merge_scan_no_model_frame_count_limit, 12);
        if (Ni5 > 0) {
            f118315i = Ni5;
        }
        f118317k = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_merge_enable_skip_framge_by_sensor, 1) == 1;
        b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanClientConfigManager", "updateScanProductConfig config");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f118308b;
        f118309c = (o4Var != null ? o4Var.getInt("qrcode_btn_new_clicked", 0) : 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanClientConfigManager", "ScanClientConfigManager init disableImageOCR config: " + Ni + ", enableImageOCR: " + f118310d + ", scanProductEncodeImageType: " + f118316j + ", scanProductOriginImageType: 4, skipFrameCount: " + f118312f + ", configDisableServerDetect: " + Ni3 + ", disableImageDetectByServer: " + f118313g + ", configScanNoResultFrame: " + Ni4 + ", scanNoResultFrameCountLimit: " + f118314h + ", enableScanProductSkipFrameBySensor:" + f118317k + "scanNoModelFrameCountLimit:" + f118315i + ", qrCodeBtnNewClicked: " + f118309c);
    }

    public static final boolean a() {
        f118307a.getClass();
        return ((java.lang.Boolean) f118321o.mo141623x754a37bb()).booleanValue();
    }

    public static final void b() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.scan_goods_tabmerge_param, 0);
        if (Ni == 0) {
            f118311e = true;
            e04.f2 f2Var = e04.f2.f327458a;
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanClientConfigManager", "updateEnableScanCodeAndProductCombine enable: " + f118311e);
            return;
        }
        if (Ni == 1) {
            f118311e = true;
        } else if (Ni == 2) {
            f118311e = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanClientConfigManager", "updateEnableScanCodeAndProductCombine update by expt, enable: " + f118311e + ", config: " + Ni);
    }
}
