package oe1;

/* loaded from: classes10.dex */
public abstract class x1 {
    public static java.lang.String a(long j17) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(j17 < 3600000 ? "mm:ss" : "HH:mm:ss");
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT+0:00"));
        return simpleDateFormat.format(java.lang.Long.valueOf(j17));
    }

    public static float b(android.content.Context context) {
        int i17;
        android.content.res.Resources system;
        int identifier;
        if (!(context instanceof android.app.Activity)) {
            return 1.0f;
        }
        float f17 = ((android.app.Activity) context).getWindow().getAttributes().screenBrightness;
        float f18 = 0.0f;
        if (f17 >= 0.0f) {
            return f17;
        }
        try {
            f18 = android.provider.Settings.System.getInt(context.getContentResolver(), "screen_brightness");
            try {
                system = android.content.res.Resources.getSystem();
                identifier = system.getIdentifier("config_screenBrightnessSettingMaximum", "integer", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerUtils", "get max brightness fail, fallback to 255");
            }
        } catch (android.provider.Settings.SettingNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoPlayerUtils", e17, "", new java.lang.Object[0]);
        }
        if (identifier != 0) {
            i17 = system.getInteger(identifier);
            f18 /= i17;
            return f18;
        }
        i17 = 255;
        f18 /= i17;
        return f18;
    }

    public static boolean c(ye1.e eVar) {
        return eVar != null && 2 == eVar.mo1853x6b2cfdb1();
    }

    public static boolean d(ye1.e eVar) {
        return eVar != null && 1 == eVar.mo1853x6b2cfdb1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
    
        if (r3 > 1.0f) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(android.content.Context r2, float r3) {
        /*
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Le
        Lc:
            r3 = r0
            goto L15
        Le:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L15
            goto Lc
        L15:
            android.app.Activity r2 = (android.app.Activity) r2
            android.view.Window r0 = r2.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            r0.screenBrightness = r3
            android.view.Window r2 = r2.getWindow()
            r2.setAttributes(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oe1.x1.e(android.content.Context, float):void");
    }
}
