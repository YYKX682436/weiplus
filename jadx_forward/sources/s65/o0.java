package s65;

/* loaded from: classes11.dex */
public abstract class o0 {
    public static java.lang.String a() {
        return ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "update_config_prefs", 4)).getString("update_downloaded_pack_md5_key", null);
    }

    public static java.lang.String[] b() {
        java.lang.String string = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "update_config_prefs", 4)).getString("update_downloaded_ignored_pack", null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            return null;
        }
        return string.split(":");
    }

    public static void c() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "update_config_prefs", 4);
        o4Var.getClass();
        o4Var.putLong("update_downloading_in_silence", java.lang.System.currentTimeMillis()).putBoolean("update_download_start_one_immediate", false).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "putDowningInSilence");
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, java.lang.String str4) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "update_config_prefs", 4);
        o4Var.getClass();
        o4Var.putString("update_downloaded_pack_md5_key", str).putString("update_downloaded_pack_sig_key", str2).putString("update_downloaded_pack_desc_key", str3).putInt("update_downloaded_pack_size_key", i17).putInt("update_downloaded_pack_download_mode", i18).putInt("update_downloaded_pack_update_type", i19).putString("update_download_not_auto_download_range", str4).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "summerupdate putDownloadedPackInfo md5: %s size: %s range: %s", str, java.lang.Integer.valueOf(i17), str4);
    }

    public static void e() {
        java.lang.StringBuffer stringBuffer;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "update_config_prefs", 4);
        int i17 = o4Var.getInt("update_downloaded_cancel_times", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "putIgnoreDownloadedPack times %s", java.lang.Integer.valueOf(i17));
        if (i17 < 2) {
            o4Var.putLong("update_downloaded_cancel_ts", java.lang.System.currentTimeMillis()).putInt("update_downloaded_cancel_times", i17 + 1).commit();
            return;
        }
        java.lang.String a17 = a();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
            stringBuffer = null;
        } else {
            java.lang.String[] b17 = b();
            stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(a17);
            if (b17 != null) {
                for (java.lang.String str : b17) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        stringBuffer.append(":");
                        stringBuffer.append(str);
                    }
                }
            }
        }
        o4Var.clear();
        if (stringBuffer != null) {
            o4Var.putString("update_downloaded_ignored_pack", stringBuffer.toString()).commit();
        }
    }

    public static void f() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "update_config_prefs", 4);
        o4Var.getClass();
        o4Var.remove("update_downloading_in_silence");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "removeUnfinishDownloadingInSilence");
    }

    public static void g(android.content.Context context, int i17, int i18) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
        intent.putExtra("intent_extra_is_silence_stat", true);
        intent.putExtra("intent_extra_opcode", i17);
        if (i17 == 2) {
            intent.putExtra("intent_extra_install_dialog_times", i18);
        }
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        context.sendBroadcast(intent, com.p314xaae8f345.mm.sdk.p2603x2137b148.v9.a());
    }

    public static void h(android.content.Context context, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
        intent.putExtra("intent_extra_is_silence_stat", false);
        intent.putExtra("intent_extra_opcode", i17);
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        context.sendBroadcast(intent, com.p314xaae8f345.mm.sdk.p2603x2137b148.v9.a());
    }
}
