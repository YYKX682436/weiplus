package x24;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f533099a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f533100b;

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|2|3|(8:5|6|7|8|(3:10|11|12)|15|11|12)|18|6|7|8|(0)|15|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingScreenBrightnessUtil", "getMinBrightness fail, fallback to 0");
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #1 {Exception -> 0x0031, blocks: (B:8:0x0020, B:10:0x002c), top: B:7:0x0020 }] */
    static {
        /*
            java.lang.String r0 = "android"
            java.lang.String r1 = "integer"
            java.lang.String r2 = "MicroMsg.SettingScreenBrightnessUtil"
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()     // Catch: java.lang.Exception -> L17
            java.lang.String r4 = "config_screenBrightnessSettingMaximum"
            int r4 = r3.getIdentifier(r4, r1, r0)     // Catch: java.lang.Exception -> L17
            if (r4 == 0) goto L1c
            int r3 = r3.getInteger(r4)     // Catch: java.lang.Exception -> L17
            goto L1e
        L17:
            java.lang.String r3 = "getMaxBrightness fail, fallback to 255"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3)
        L1c:
            r3 = 255(0xff, float:3.57E-43)
        L1e:
            x24.a.f533099a = r3
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()     // Catch: java.lang.Exception -> L31
            java.lang.String r4 = "config_screenBrightnessSettingMinimum"
            int r0 = r3.getIdentifier(r4, r1, r0)     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L36
            int r0 = r3.getInteger(r0)     // Catch: java.lang.Exception -> L31
            goto L37
        L31:
            java.lang.String r0 = "getMinBrightness fail, fallback to 0"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
        L36:
            r0 = 0
        L37:
            x24.a.f533100b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x24.a.m174927x8c160ea9():void");
    }

    public static final int a(android.app.Activity activity) {
        android.view.WindowManager.LayoutParams attributes;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.view.Window window = activity.getWindow();
        java.lang.Float valueOf = (window == null || (attributes = window.getAttributes()) == null) ? null : java.lang.Float.valueOf(attributes.screenBrightness);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingScreenBrightnessUtil", "getScreenBrightness " + valueOf);
        if (valueOf == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingScreenBrightnessUtil", "getScreenBrightness null, use system");
            return b(activity);
        }
        if (java.lang.Float.compare(-1.0f, valueOf.floatValue()) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingScreenBrightnessUtil", "getScreenBrightness not set, use system");
            return b(activity);
        }
        int b17 = a06.d.b(java.lang.Float.valueOf(java.lang.Math.max(0.0f, java.lang.Float.valueOf(java.lang.Math.min(1.0f, valueOf.floatValue())).floatValue())).floatValue() * 255);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingScreenBrightnessUtil", "getScreenBrightness report " + b17);
        return b17;
    }

    public static final int b(android.app.Activity activity) {
        try {
            boolean z17 = true;
            if (android.provider.Settings.System.getInt(activity.getContentResolver(), "screen_brightness_mode") != 1) {
                z17 = false;
            }
            int i17 = android.provider.Settings.System.getInt(activity.getContentResolver(), "screen_brightness");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingScreenBrightnessUtil", "getSystemBrightness isAuto: " + z17 + ", systemBrightness: " + i17);
            int min = java.lang.Math.min(f533099a, i17);
            int i18 = f533100b;
            return a06.d.b((((java.lang.Math.max(i18, min) - i18) * 1.0f) / (r1 - i18)) * 255);
        } catch (android.provider.Settings.SettingNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SettingScreenBrightnessUtil", e17, "getSystemBrightness no setting exception", new java.lang.Object[0]);
            return -3;
        } catch (java.lang.SecurityException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SettingScreenBrightnessUtil", e18, "getSystemBrightness no permission exception", new java.lang.Object[0]);
            return -2;
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SettingScreenBrightnessUtil", e19, "getSystemBrightness other exception", new java.lang.Object[0]);
            return -4;
        }
    }

    public static final void c(float f17, android.app.Activity activity) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingScreenBrightnessUtil", "setScreenBrightness value: %s, activity is %s", java.lang.Float.valueOf(f17), activity);
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingScreenBrightnessUtil", "setScreenBrightness activity is null");
            return;
        }
        try {
            android.view.WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            if (attributes != null) {
                attributes.screenBrightness = f17;
                activity.getWindow().setAttributes(attributes);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SettingScreenBrightnessUtil", th6, "setScreenBrightness exception", new java.lang.Object[0]);
        }
    }
}
