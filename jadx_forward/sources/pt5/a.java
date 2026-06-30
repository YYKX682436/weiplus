package pt5;

/* loaded from: classes15.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f439799a = "";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f439800b = null;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f439801c = null;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f439802d = null;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f439803e = null;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f439804f = false;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f439805g = null;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f439806h = null;

    /* renamed from: i, reason: collision with root package name */
    public static volatile boolean f439807i = false;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f439808j = null;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.String f439809k = null;

    /* renamed from: l, reason: collision with root package name */
    public static volatile int f439810l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static volatile boolean f439811m = true;

    /* renamed from: n, reason: collision with root package name */
    public static volatile boolean f439812n = true;

    /* renamed from: o, reason: collision with root package name */
    public static volatile boolean f439813o = true;

    /* renamed from: p, reason: collision with root package name */
    public static volatile boolean f439814p;

    public static com.p314xaae8f345.p2891x34da02.C25307xad2910d9 a(android.content.Context context) {
        try {
            com.p314xaae8f345.p2891x34da02.C25307xad2910d9 c25307xad2910d9 = new com.p314xaae8f345.p2891x34da02.C25307xad2910d9();
            if (f439810l == 1) {
                c25307xad2910d9.f45397x7630eff6 = "";
                c25307xad2910d9.f45404xca76eaba = "";
                c25307xad2910d9.f45396x832f8c70 = f439801c;
                c25307xad2910d9.f45395xc84327b2 = f439800b;
                c25307xad2910d9.f45403xb37d6834 = f439803e;
                c25307xad2910d9.f45402x8b863196 = f439802d;
                c25307xad2910d9.f45399x70dd9799 = f439804f;
                if (f439804f) {
                    c25307xad2910d9.f45401xe9487ac4 = f439806h;
                } else {
                    c25307xad2910d9.f45401xe9487ac4 = "";
                }
                c25307xad2910d9.f45394x83deee29 = f439814p;
                c25307xad2910d9.f45398xadb11991 = f439807i;
                if (f439807i) {
                    c25307xad2910d9.f45400x47104a15 = f439809k;
                } else {
                    c25307xad2910d9.f45400x47104a15 = "";
                }
            } else {
                c25307xad2910d9.f45396x832f8c70 = "";
                c25307xad2910d9.f45397x7630eff6 = "";
                c25307xad2910d9.f45403xb37d6834 = "";
                c25307xad2910d9.f45404xca76eaba = "";
                c25307xad2910d9.f45395xc84327b2 = "";
                c25307xad2910d9.f45402x8b863196 = "";
            }
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanUtil", "getAiModelParam detectModelBinPath: %s, detectModelParamPath: %s, srModelBinPath: %S, srModelParamPath: %s, currentDetectModelVersion: %s, currentSRModelVersion: %s,enableSeg: %s, segmentationModelPath: %s, segmentationModelVersion: %s, detectModeUseFp16: %s, enableReverseCls: %s, reverseClsModelPath: %s, reverseClsModelVersion: %s", c25307xad2910d9.f45396x832f8c70, c25307xad2910d9.f45397x7630eff6, c25307xad2910d9.f45403xb37d6834, c25307xad2910d9.f45404xca76eaba, c25307xad2910d9.f45395xc84327b2, c25307xad2910d9.f45402x8b863196, java.lang.Boolean.valueOf(c25307xad2910d9.f45399x70dd9799), c25307xad2910d9.f45401xe9487ac4, f439805g, java.lang.Boolean.valueOf(f439814p), java.lang.Boolean.valueOf(c25307xad2910d9.f45398xadb11991), c25307xad2910d9.f45400x47104a15, f439808j);
            return c25307xad2910d9;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("ScanUtil", "copy qbar ai model file error! " + e17.getMessage());
            return null;
        }
    }

    public static java.lang.String b(android.content.Context context) {
        try {
            java.lang.String str = f439799a;
            if (str == null || str.isEmpty()) {
                f439799a = context.getFilesDir().getAbsolutePath() + "/qbar/";
            }
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanUtil", "getQBarAIDataDir :" + f439799a);
            return f439799a;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("ScanUtil", "getQBarAIDataDir " + e17);
            return "";
        }
    }
}
