package wh;

/* loaded from: classes8.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f527299a;

    /* renamed from: b, reason: collision with root package name */
    public static wh.d1 f527300b;

    /* renamed from: c, reason: collision with root package name */
    public static final wh.e1 f527301c = new wh.e1();

    public static final java.lang.String a(android.content.Context context) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        wh.d1 b17 = f527301c.b(context);
        return (b17 == null || (str = b17.f527293b) == null) ? "android.os.action.POWER_SAVE_MODE_CHANGED" : str;
    }

    public static final boolean c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        wh.d1 b17 = f527301c.b(context);
        if (b17 != null) {
            return android.provider.Settings.System.getInt(context.getContentResolver(), b17.f527294c, Integer.MIN_VALUE) == b17.f527295d;
        }
        java.lang.Object systemService = context.getSystemService("power");
        if (!(systemService instanceof android.os.PowerManager)) {
            systemService = null;
        }
        android.os.PowerManager powerManager = (android.os.PowerManager) systemService;
        if (powerManager != null) {
            return powerManager.isPowerSaveMode();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[Catch: all -> 0x006c, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:12:0x0056, B:14:0x0064, B:15:0x0066, B:17:0x002e, B:19:0x0036, B:20:0x0041, B:22:0x0049), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final wh.d1 b(android.content.Context r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = wh.e1.f527299a     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L68
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = "manufacture"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)     // Catch: java.lang.Throwable -> L6c
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "Locale.getDefault()"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = r0.toUpperCase(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "(this as java.lang.String).toUpperCase(locale)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)     // Catch: java.lang.Throwable -> L6c
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> L6c
            r3 = -1706170181(0xffffffff9a4de8bb, float:-4.2581005E-23)
            r4 = 1
            if (r2 == r3) goto L41
            r3 = 2141820391(0x7fa995e7, float:NaN)
            if (r2 == r3) goto L2e
            goto L53
        L2e:
            java.lang.String r2 = "HUAWEI"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L53
            wh.d1 r1 = new wh.d1     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "huawei.intent.action.POWER_MODE_CHANGED_ACTION"
            java.lang.String r3 = "SmartModeStatus"
            r5 = 4
            r1.<init>(r0, r2, r3, r5)     // Catch: java.lang.Throwable -> L6c
            goto L54
        L41:
            java.lang.String r2 = "XIAOMI"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L53
            wh.d1 r1 = new wh.d1     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "miui.intent.action.POWER_SAVE_MODE_CHANGED"
            java.lang.String r3 = "POWER_SAVE_MODE_OPEN"
            r1.<init>(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L6c
            goto L54
        L53:
            r1 = 0
        L54:
            if (r1 == 0) goto L66
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = r1.f527294c     // Catch: java.lang.Throwable -> L6c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.provider.Settings.System.getInt(r7, r0, r2)     // Catch: java.lang.Throwable -> L6c
            if (r7 == r2) goto L66
            wh.e1.f527300b = r1     // Catch: java.lang.Throwable -> L6c
        L66:
            wh.e1.f527299a = r4     // Catch: java.lang.Throwable -> L6c
        L68:
            monitor-exit(r6)
            wh.d1 r7 = wh.e1.f527300b
            return r7
        L6c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.e1.b(android.content.Context):wh.d1");
    }
}
