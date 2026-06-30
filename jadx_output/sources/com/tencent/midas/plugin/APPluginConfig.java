package com.tencent.midas.plugin;

/* loaded from: classes13.dex */
public class APPluginConfig {
    static final java.lang.String KERNEL_FILE_NAME = "MidasPay.zip";
    static java.lang.String PLUGIN_BACKUP_TEMP_DIR_NAME = "midaspluginsBKTemp";
    public static java.lang.String PLUGIN_DIR_NAME = "midasplugins";
    static java.lang.String PLUGIN_EMPTY_RES_DIR_NAME = "midasemptyRes";
    static java.lang.String PLUGIN_LIB_DIR_NAME = "midaslib";
    static java.lang.String PLUGIN_ODEX_DIR_NAME = "midasodex";
    static java.lang.String PLUGIN_UPDATE_DIR_NAME = "midaspluginsTemp";
    static java.lang.String SIGN_FILE_NAME = "MidasSign.ini";
    static int libExtend;

    public static java.io.File getLibPath(android.content.Context context) {
        return context.getDir(PLUGIN_LIB_DIR_NAME + "_" + libExtend, 0);
    }

    public static java.io.File getOptimizedDexPath(android.content.Context context) {
        return context.getDir(PLUGIN_ODEX_DIR_NAME, 0);
    }

    public static java.io.File getPluginBackUpPath(android.content.Context context) {
        return context.getDir(PLUGIN_BACKUP_TEMP_DIR_NAME, 0);
    }

    public static java.io.File getPluginDexOfOat(android.content.Context context) {
        try {
            return new java.io.File(context.getDir(PLUGIN_DIR_NAME, 0).getPath() + java.io.File.separator + com.tencent.tinker.loader.shareutil.ShareConstants.ANDROID_O_DEX_OPTIMIZE_PATH);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.io.File getPluginEmptyResPath(android.content.Context context) {
        return context.getDir(PLUGIN_EMPTY_RES_DIR_NAME, 0);
    }

    public static java.io.File getPluginPath(android.content.Context context) {
        return context.getDir(PLUGIN_DIR_NAME, 0);
    }

    public static java.io.File getPluginUpdatePath(android.content.Context context) {
        return context.getDir(PLUGIN_UPDATE_DIR_NAME, 0);
    }

    public static void setPluginDirName(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        PLUGIN_DIR_NAME = str;
    }

    public static void setSignFileName(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        SIGN_FILE_NAME = str;
    }
}
