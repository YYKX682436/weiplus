package bz3;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.o4 f36775b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f36776c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f36777d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f36778e = true;

    /* renamed from: f, reason: collision with root package name */
    public static int f36779f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f36780g = false;

    /* renamed from: h, reason: collision with root package name */
    public static int f36781h = 20;

    /* renamed from: i, reason: collision with root package name */
    public static int f36782i = 12;

    /* renamed from: j, reason: collision with root package name */
    public static int f36783j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f36784k = true;

    /* renamed from: q, reason: collision with root package name */
    public static int f36790q;

    /* renamed from: r, reason: collision with root package name */
    public static int f36791r;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f36792s;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f36793t;

    /* renamed from: a, reason: collision with root package name */
    public static final bz3.h f36774a = new bz3.h();

    /* renamed from: l, reason: collision with root package name */
    public static final jz5.g f36785l = jz5.h.b(bz3.g.f36773d);

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f36786m = jz5.h.b(bz3.c.f36769d);

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f36787n = jz5.h.b(bz3.f.f36772d);

    /* renamed from: o, reason: collision with root package name */
    public static final jz5.g f36788o = jz5.h.b(bz3.a.f36767d);

    /* renamed from: p, reason: collision with root package name */
    public static final jz5.g f36789p = jz5.h.b(bz3.b.f36768d);

    /* renamed from: u, reason: collision with root package name */
    public static final jz5.g f36794u = jz5.h.b(bz3.d.f36770d);

    /* renamed from: v, reason: collision with root package name */
    public static final jz5.g f36795v = jz5.h.b(bz3.e.f36771d);

    static {
        f36793t = true;
        try {
            boolean a17 = gm0.j1.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanClientConfigManager", "initMMKV %s, mmkv: %s", java.lang.Boolean.valueOf(a17), f36775b);
            if (a17 && f36775b == null) {
                f36775b = com.tencent.mm.sdk.platformtools.o4.M(c01.z1.r() + "_scan_client_config_mmkv");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanClientConfigManager", e17, "checkInitMMKV exception", new java.lang.Object[0]);
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_image_ocr_disable, 0);
        if (Ni == 1) {
            f36777d = false;
        }
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_merge_scan_product_skip_frame_count, 4);
        if (Ni2 > 0) {
            f36779f = Ni2;
        }
        f36790q = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_merge_scan_similar_threshold, 15);
        f36791r = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_merge_scan_similar_post_threshold, 15);
        f36792s = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_scan_merge_scan_pre_similar_filter, false);
        f36793t = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_scan_merge_scan_post_similar_filter, true);
        f36783j = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.scan.RepairerConfigScanProductUploadImageFormat());
        int Ni3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_merge_disable_image_detect_by_server, 0);
        int Ni4 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_merge_scan_no_result_frame_count_limit, 20);
        if (Ni3 == 1) {
            f36780g = true;
        }
        if (Ni4 > 0) {
            f36781h = Ni4;
        }
        int Ni5 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_merge_scan_no_model_frame_count_limit, 12);
        if (Ni5 > 0) {
            f36782i = Ni5;
        }
        f36784k = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_merge_enable_skip_framge_by_sensor, 1) == 1;
        b();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanClientConfigManager", "updateScanProductConfig config");
        com.tencent.mm.sdk.platformtools.o4 o4Var = f36775b;
        f36776c = (o4Var != null ? o4Var.getInt("qrcode_btn_new_clicked", 0) : 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanClientConfigManager", "ScanClientConfigManager init disableImageOCR config: " + Ni + ", enableImageOCR: " + f36777d + ", scanProductEncodeImageType: " + f36783j + ", scanProductOriginImageType: 4, skipFrameCount: " + f36779f + ", configDisableServerDetect: " + Ni3 + ", disableImageDetectByServer: " + f36780g + ", configScanNoResultFrame: " + Ni4 + ", scanNoResultFrameCountLimit: " + f36781h + ", enableScanProductSkipFrameBySensor:" + f36784k + "scanNoModelFrameCountLimit:" + f36782i + ", qrCodeBtnNewClicked: " + f36776c);
    }

    public static final boolean a() {
        f36774a.getClass();
        return ((java.lang.Boolean) f36788o.getValue()).booleanValue();
    }

    public static final void b() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.scan_goods_tabmerge_param, 0);
        if (Ni == 0) {
            f36778e = true;
            e04.f2 f2Var = e04.f2.f245925a;
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanClientConfigManager", "updateEnableScanCodeAndProductCombine enable: " + f36778e);
            return;
        }
        if (Ni == 1) {
            f36778e = true;
        } else if (Ni == 2) {
            f36778e = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanClientConfigManager", "updateEnableScanCodeAndProductCombine update by expt, enable: " + f36778e + ", config: " + Ni);
    }
}
