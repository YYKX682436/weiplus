package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class gc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f290220d;

    public gc(android.app.Activity activity) {
        this.f290220d = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SilentDownloadApkAtWiFi"), 0) != 0) {
            return;
        }
        boolean z18 = (((java.lang.Integer) c01.d9.b().p().l(7, 0)).intValue() & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) == 0;
        android.app.Activity activity = this.f290220d;
        boolean z19 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(activity) && z18;
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273971a & 1) != 0) {
            z19 = false;
        }
        if (z19) {
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("update_config_prefs", 4);
            long j17 = sharedPreferences.getLong("update_downloading_in_silence", 0L);
            boolean z27 = sharedPreferences.getBoolean("update_download_start_one_immediate", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "hasUnfinishDownloadingInSilence unfinish %s", java.lang.Long.valueOf(j17));
            if (z27 || (j17 != 0 && java.lang.System.currentTimeMillis() - j17 > 3600000)) {
                z17 = true;
            }
            if (z17) {
                activity.runOnUiThread(new com.p314xaae8f345.mm.ui.fc(this));
            }
        }
    }
}
