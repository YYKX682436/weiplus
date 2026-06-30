package to;

/* loaded from: classes5.dex */
public abstract class a {
    public static void a(android.media.AudioManager audioManager, int i17, int i18, int i19) {
        if (!fp.h.c(24)) {
            audioManager.adjustStreamVolume(i17, i18, i19);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioAdaptNHelp", "adjustStreamVolume()");
        try {
            audioManager.adjustStreamVolume(i17, i18, i19);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AudioAdaptNHelp", "adjustStreamVolume() Exception: %s", e17.getMessage());
            b();
        }
    }

    public static void b() {
        boolean isNotificationPolicyAccessGranted = ((android.app.NotificationManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a().getSystemService("notification")).isNotificationPolicyAccessGranted();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioAdaptNHelp", "requestPermission() result:%s", java.lang.Boolean.valueOf(isNotificationPolicyAccessGranted));
        if (isNotificationPolicyAccessGranted) {
            return;
        }
        try {
            android.content.Intent intent = new android.content.Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a().getPackageName());
            android.app.Application a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/compatible/audio/AudioAdaptNHelp", "requestPermission", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            a17.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(a17, "com/tencent/mm/compatible/audio/AudioAdaptNHelp", "requestPermission", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AudioAdaptNHelp", "requestPermission() Exception:%s", e17.getMessage());
        }
    }

    public static void c(android.media.AudioManager audioManager, int i17, int i18, int i19) {
        if (!fp.h.c(24)) {
            audioManager.setStreamVolume(i17, i18, i19);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioAdaptNHelp", "setStreamVolume()");
        try {
            audioManager.setStreamVolume(i17, i18, i19);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AudioAdaptNHelp", "setStreamVolume() Exception:%s", e17.getMessage());
            b();
        }
    }
}
