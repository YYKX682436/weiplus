package ly;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ly.a f403699a = new ly.a();

    public static void a(ly.a aVar, android.content.Context context, long j17, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            j17 = 50;
        }
        if ((i18 & 4) != 0) {
            i17 = 255;
        }
        aVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i19 = android.os.Build.VERSION.SDK_INT;
        if (i19 >= 31) {
            java.lang.Object systemService = context.getSystemService("vibrator_manager");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
            android.os.Vibrator defaultVibrator = ((android.os.VibratorManager) systemService).getDefaultVibrator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(defaultVibrator, "getDefaultVibrator(...)");
            defaultVibrator.vibrate(android.os.VibrationEffect.createOneShot(j17, i17));
            return;
        }
        java.lang.Object systemService2 = context.getSystemService("vibrator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
        android.os.Vibrator vibrator = (android.os.Vibrator) systemService2;
        if (i19 >= 26) {
            vibrator.vibrate(android.os.VibrationEffect.createOneShot(j17, i17));
        } else {
            vibrator.vibrate(j17);
        }
    }
}
