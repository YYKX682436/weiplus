package b83;

/* loaded from: classes.dex */
public abstract class s {
    public static boolean a(android.content.Context context, java.lang.String str) {
        java.lang.String string = context.getSharedPreferences("tinker_patch_share_config", 4).getString("tinker_before_install", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.TinkerPatchSharedPreferencesUtil", "isBeforeDownloadDialogHaveCancel current patchID :%s patchID:%s", string, str);
        return (z65.c.a() || com.tencent.mm.sdk.platformtools.t8.K0(string) || com.tencent.mm.sdk.platformtools.t8.K0(str) || !string.equalsIgnoreCase(str)) ? false : true;
    }

    public static void b(android.content.Context context) {
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("TinkerCheckUpdateInterval", 12);
        if (b17 < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.TinkerPatchSharedPreferencesUtil", "saveTinkerCheckUpdateTinker hours < 0 ");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.TinkerPatchSharedPreferencesUtil", "saveTinkerCheckUpdateTinker hours:%d", java.lang.Integer.valueOf(b17));
            context.getSharedPreferences("tinker_patch_share_config", 4).edit().putInt("check_tinker_update_interval", b17).apply();
        }
    }
}
