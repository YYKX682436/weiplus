package md;

/* loaded from: classes13.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f407235a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f407236b;

    public static java.lang.String a(java.lang.String str) {
        return (f(str) || str.contains("huawei") || str.contains("honor")) ? "navigationbar_is_min" : (str.contains("xiaomi") || str.contains("redmi")) ? "force_fsg_nav_bar" : str.contains("vivo") ? "navigation_gesture_on" : str.contains("oppo") ? "hide_navigationbar_enable" : str.contains("samsung") ? "navigationbar_hide_bar_enabled" : str.contains("nokia") ? android.os.Build.VERSION.SDK_INT < 28 ? "navigation_bar_can_hiden" : "swipe_up_to_switch_apps_enabled" : "navigationbar_is_min";
    }

    public static int b(android.content.Context context, int i17) {
        if (!c(context)) {
            return 0;
        }
        int identifier = android.content.res.Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        int dimensionPixelSize = identifier > 0 ? android.content.res.Resources.getSystem().getDimensionPixelSize(identifier) : 0;
        int d17 = d(context);
        if (i17 < 0 || d17 <= i17 || d17 <= 200) {
            i17 = d17;
        } else if (i17 < dimensionPixelSize) {
            dimensionPixelSize = i17;
        }
        return (i17 == 0 || i17 == dimensionPixelSize || i17 >= 200) ? dimensionPixelSize : i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(android.content.Context r4) {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = md.n.f407235a     // Catch: java.lang.Exception -> L72
            boolean r2 = f(r2)     // Catch: java.lang.Exception -> L72
            if (r2 == 0) goto Le
            java.lang.String r2 = android.os.Build.BRAND     // Catch: java.lang.Exception -> L72
            md.n.f407235a = r2     // Catch: java.lang.Exception -> L72
        Le:
            java.lang.String r2 = md.n.f407236b     // Catch: java.lang.Exception -> L72
            boolean r2 = f(r2)     // Catch: java.lang.Exception -> L72
            if (r2 == 0) goto L1a
            java.lang.String r2 = android.os.Build.MODEL     // Catch: java.lang.Exception -> L72
            md.n.f407236b = r2     // Catch: java.lang.Exception -> L72
        L1a:
            java.lang.String r2 = md.n.f407235a     // Catch: java.lang.Exception -> L72
            boolean r2 = f(r2)     // Catch: java.lang.Exception -> L72
            if (r2 != 0) goto L2a
            java.lang.String r2 = md.n.f407235a     // Catch: java.lang.Exception -> L72
            java.lang.String r2 = r2.toLowerCase()     // Catch: java.lang.Exception -> L72
            md.n.f407235a = r2     // Catch: java.lang.Exception -> L72
        L2a:
            java.lang.String r2 = md.n.f407236b     // Catch: java.lang.Exception -> L72
            boolean r2 = f(r2)     // Catch: java.lang.Exception -> L72
            if (r2 != 0) goto L3a
            java.lang.String r2 = md.n.f407236b     // Catch: java.lang.Exception -> L72
            java.lang.String r2 = r2.toLowerCase()     // Catch: java.lang.Exception -> L72
            md.n.f407236b = r2     // Catch: java.lang.Exception -> L72
        L3a:
            java.lang.String r2 = md.n.f407235a     // Catch: java.lang.Exception -> L72
            boolean r2 = f(r2)     // Catch: java.lang.Exception -> L72
            if (r2 != 0) goto L72
            java.lang.String r2 = md.n.f407235a     // Catch: java.lang.Exception -> L72
            java.lang.String r3 = "huawei"
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Exception -> L72
            if (r2 != 0) goto L56
            java.lang.String r2 = md.n.f407235a     // Catch: java.lang.Exception -> L72
            java.lang.String r3 = "honor"
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Exception -> L72
            if (r2 == 0) goto L72
        L56:
            java.lang.String r2 = md.n.f407236b     // Catch: java.lang.Exception -> L72
            java.lang.String r3 = "lio-an00m"
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Exception -> L72
            if (r2 == 0) goto L72
            android.content.ContentResolver r2 = r4.getContentResolver()     // Catch: java.lang.Exception -> L72
            java.lang.String r3 = md.n.f407235a     // Catch: java.lang.Exception -> L72
            java.lang.String r3 = a(r3)     // Catch: java.lang.Exception -> L72
            int r2 = android.provider.Settings.Global.getInt(r2, r3, r1)     // Catch: java.lang.Exception -> L72
            if (r2 == 0) goto L72
            r2 = r0
            goto L73
        L72:
            r2 = r1
        L73:
            if (r2 == 0) goto L76
            return r1
        L76:
            boolean r2 = r4 instanceof android.app.Activity
            if (r2 == 0) goto L82
            r2 = r4
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r2 = r2.isInMultiWindowMode()
            goto L83
        L82:
            r2 = r1
        L83:
            if (r2 == 0) goto L8f
            java.lang.String r4 = "isInMultiWindowMode"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "WeUIToolHelper"
            kd.c.c(r2, r4, r0)
            return r1
        L8f:
            int r4 = d(r4)
            if (r4 <= 0) goto L96
            goto L97
        L96:
            r0 = r1
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: md.n.c(android.content.Context):boolean");
    }

    public static int d(android.content.Context context) {
        if (context == null) {
            kd.c.b("WeUIToolHelper", "getRealBottomHeight context is null", new java.lang.Object[0]);
            return 0;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            kd.c.b("WeUIToolHelper", "getRealBottomHeight windowManager is null", new java.lang.Object[0]);
            return 0;
        }
        android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getSize(point);
        boolean z17 = context.getResources().getConfiguration().orientation == 1;
        android.graphics.Point point2 = new android.graphics.Point();
        ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point2);
        int max = java.lang.Math.max(point.y, point.x);
        if (z17) {
            max = point.y;
        }
        int max2 = java.lang.Math.max(point2.y, point2.x);
        if (z17) {
            max2 = point2.y;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            max = java.lang.Math.max(rect.bottom, rect.right);
            if (z17) {
                max = rect.bottom;
            }
        }
        if (max2 > max) {
            return max2 - max;
        }
        return 0;
    }

    public static int e(android.content.Context context) {
        java.lang.String obj;
        int intValue;
        n3.g3 g3Var;
        if (context != null && md.m.f407234a < 0.0f) {
            md.m.f407234a = context.getResources().getDisplayMetrics().density;
        }
        int round = java.lang.Math.round(md.m.f407234a * 25);
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            if (context instanceof android.app.Activity) {
                android.view.View peekDecorView = ((android.app.Activity) context).getWindow().peekDecorView();
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                g3Var = n3.b1.a(peekDecorView);
            } else {
                g3Var = null;
            }
            return g3Var != null ? g3Var.a(1).f328578b : round;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.android.internal.R$dimen");
            obj = cls.getField("status_bar_height").get(cls.newInstance()).toString();
        } catch (java.lang.Exception unused) {
        }
        if (obj != null) {
            if (obj.length() > 0) {
                intValue = java.lang.Integer.decode(obj).intValue();
                round = context.getResources().getDimensionPixelSize(intValue);
                kd.c.c("WeUIToolHelper", "[getStatusBarHeightFromSysR] :%s ", java.lang.Integer.valueOf(round));
                return round;
            }
        }
        intValue = 0;
        round = context.getResources().getDimensionPixelSize(intValue);
        kd.c.c("WeUIToolHelper", "[getStatusBarHeightFromSysR] :%s ", java.lang.Integer.valueOf(round));
        return round;
    }

    public static boolean f(java.lang.String str) {
        return str == null || str.length() <= 0;
    }
}
