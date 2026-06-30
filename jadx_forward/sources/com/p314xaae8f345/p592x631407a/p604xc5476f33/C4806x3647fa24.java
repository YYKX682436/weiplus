package com.p314xaae8f345.p592x631407a.p604xc5476f33;

/* renamed from: com.tencent.midas.plugin.APPluginConfig */
/* loaded from: classes13.dex */
public class C4806x3647fa24 {

    /* renamed from: KERNEL_FILE_NAME */
    static final java.lang.String f20745x9a411dec = "MidasPay.zip";

    /* renamed from: PLUGIN_BACKUP_TEMP_DIR_NAME */
    static java.lang.String f20746x98fa28f7 = "midaspluginsBKTemp";

    /* renamed from: PLUGIN_DIR_NAME */
    public static java.lang.String f20747x9def16a9 = "midasplugins";

    /* renamed from: PLUGIN_EMPTY_RES_DIR_NAME */
    static java.lang.String f20748xdf808a5a = "midasemptyRes";

    /* renamed from: PLUGIN_LIB_DIR_NAME */
    static java.lang.String f20749xe938dd43 = "midaslib";

    /* renamed from: PLUGIN_ODEX_DIR_NAME */
    static java.lang.String f20750x9e1fb028 = "midasodex";

    /* renamed from: PLUGIN_UPDATE_DIR_NAME */
    static java.lang.String f20751xc1bda8c7 = "midaspluginsTemp";

    /* renamed from: SIGN_FILE_NAME */
    static java.lang.String f20752xbedcd36c = "MidasSign.ini";

    /* renamed from: libExtend */
    static int f20753xe4ec95ff;

    /* renamed from: getLibPath */
    public static java.io.File m42072x47a5ec14(android.content.Context context) {
        return context.getDir(f20749xe938dd43 + "_" + f20753xe4ec95ff, 0);
    }

    /* renamed from: getOptimizedDexPath */
    public static java.io.File m42073x88fb252b(android.content.Context context) {
        return context.getDir(f20750x9e1fb028, 0);
    }

    /* renamed from: getPluginBackUpPath */
    public static java.io.File m42074x9bf91830(android.content.Context context) {
        return context.getDir(f20746x98fa28f7, 0);
    }

    /* renamed from: getPluginDexOfOat */
    public static java.io.File m42075xfa9602fd(android.content.Context context) {
        try {
            return new java.io.File(context.getDir(f20747x9def16a9, 0).getPath() + java.io.File.separator + com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55618xabeb581f);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: getPluginEmptyResPath */
    public static java.io.File m42076xbf7623a1(android.content.Context context) {
        return context.getDir(f20748xdf808a5a, 0);
    }

    /* renamed from: getPluginPath */
    public static java.io.File m42077xd72d2dee(android.content.Context context) {
        return context.getDir(f20747x9def16a9, 0);
    }

    /* renamed from: getPluginUpdatePath */
    public static java.io.File m42078xf89d1397(android.content.Context context) {
        return context.getDir(f20751xc1bda8c7, 0);
    }

    /* renamed from: setPluginDirName */
    public static void m42079x781fc0c3(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        f20747x9def16a9 = str;
    }

    /* renamed from: setSignFileName */
    public static void m42080xf4ca8886(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        f20752xbedcd36c = str;
    }
}
