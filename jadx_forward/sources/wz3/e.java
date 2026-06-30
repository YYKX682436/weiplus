package wz3;

/* loaded from: classes12.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f532310a = "";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f532311b = "";

    /* renamed from: c, reason: collision with root package name */
    public static e04.x2 f532312c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f532313d;

    public static final void a() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String b17;
        if (f532310a.length() <= 0 || !com.p314xaae8f345.mm.vfs.w6.j(f532310a) || f532311b.length() <= 0 || !com.p314xaae8f345.mm.vfs.w6.j(f532311b)) {
            boolean a07 = c01.e2.a0();
            str = "";
            if (a07) {
                if (f532312c == null) {
                    f532312c = new e04.x2();
                }
                e04.x2 x2Var = f532312c;
                if (x2Var == null || (str2 = x2Var.b("MODEL_SCAN_GOODS_CSC_DET")) == null) {
                    str2 = "";
                }
                f532310a = str2;
                e04.x2 x2Var2 = f532312c;
                if (x2Var2 != null && (b17 = x2Var2.b("MODEL_SCAN_GOODS_SCAN_CLS")) != null) {
                    str = b17;
                }
                f532311b = str;
                if (!f532313d) {
                    if (f532310a.length() <= 0 || f532311b.length() <= 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, 11);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, 10);
                    }
                }
            } else {
                ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
                p05.a3 a3Var = p05.a3.f431972a;
                java.lang.String g17 = a3Var.g("MODEL_CSC_DET");
                if (com.p314xaae8f345.mm.vfs.w6.j(g17)) {
                    if (g17 == null) {
                        g17 = "";
                    }
                    f532310a = g17;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanProductModelConfigManager", "cscDetectModelPath not exist: " + g17);
                    f532310a = "";
                }
                ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
                java.lang.String g18 = a3Var.g("MODEL_SCAN_CLS");
                if (com.p314xaae8f345.mm.vfs.w6.j(g18)) {
                    f532311b = g18 != null ? g18 : "";
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanProductModelConfigManager", "scanClsModelPath not exist: " + g18);
                    f532311b = "";
                }
                if (!f532313d) {
                    if (f532310a.length() <= 0 || f532311b.length() <= 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, 13);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, 12);
                    }
                }
            }
            f532313d = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductModelConfigManager", "initScanProductModelConfig detectModel: " + f532310a + ", scanClsModel: " + f532311b + ", isOverseaUser: " + a07);
        }
    }
}
