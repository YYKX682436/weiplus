package b83;

/* loaded from: classes.dex */
public abstract class s {
    public static boolean a(android.content.Context context, java.lang.String str) {
        java.lang.String string = context.getSharedPreferences("tinker_patch_share_config", 4).getString("tinker_before_install", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.TinkerPatchSharedPreferencesUtil", "isBeforeDownloadDialogHaveCancel current patchID :%s patchID:%s", string, str);
        return (z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !string.equalsIgnoreCase(str)) ? false : true;
    }

    public static void b(android.content.Context context) {
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("TinkerCheckUpdateInterval", 12);
        if (b17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.TinkerPatchSharedPreferencesUtil", "saveTinkerCheckUpdateTinker hours < 0 ");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.TinkerPatchSharedPreferencesUtil", "saveTinkerCheckUpdateTinker hours:%d", java.lang.Integer.valueOf(b17));
            context.getSharedPreferences("tinker_patch_share_config", 4).edit().putInt("check_tinker_update_interval", b17).apply();
        }
    }
}
