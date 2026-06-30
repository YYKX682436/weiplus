package es;

/* loaded from: classes13.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f337812a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f337813b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f337814c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f337815d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Boolean f337816e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Boolean f337817f;

    static {
        new android.graphics.Rect(0, 0, 0, 0);
        new android.util.SparseArray(4);
        new android.util.SparseArray(4);
        f337812a = null;
        f337813b = null;
        f337814c = null;
        f337815d = "xiaomi&28, redmi&28, samsung&28, vivo&28, oppo&29, huawei&29, honor&29, oneplus&29, meizu&24, smartisan&24, other&29";
        f337816e = null;
        f337817f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.ViewGroup a(android.view.Window r6, android.view.View r7) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            ds.c r1 = new ds.c
            java.lang.String r2 = "mContentRoot"
            r1.<init>(r6, r2, r0)
            r1.b()
            java.lang.reflect.Field r2 = r1.f324314c
            r3 = 0
            if (r2 == 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = r3
        L16:
            if (r2 == 0) goto L2f
            java.lang.Object r1 = r1.a()     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.IllegalAccessException -> L21 java.lang.NoSuchFieldException -> L23
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.IllegalAccessException -> L21 java.lang.NoSuchFieldException -> L23
            goto L30
        L1f:
            r1 = move-exception
            goto L24
        L21:
            r1 = move-exception
            goto L24
        L23:
            r1 = move-exception
        L24:
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r4 = "MicroMsg.UIUtils"
            kd.c.b(r4, r1, r2)
        L2f:
            r1 = r0
        L30:
            if (r1 == 0) goto L33
            return r1
        L33:
            if (r7 == 0) goto L49
            android.view.ViewParent r7 = r7.getParent()
        L39:
            android.view.View r1 = r6.getDecorView()
            if (r7 == r1) goto L49
            if (r7 == 0) goto L49
            android.view.ViewParent r0 = r7.getParent()
            r5 = r0
            r0 = r7
            r7 = r5
            goto L39
        L49:
            if (r0 != 0) goto L61
            android.view.View r7 = r6.getDecorView()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.view.View r7 = r7.getChildAt(r3)
            boolean r1 = r7 instanceof android.view.ViewGroup
            if (r1 == 0) goto L5c
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            return r7
        L5c:
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r6.clearFlags(r7)
        L61:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: es.u.a(android.view.Window, android.view.View):android.view.ViewGroup");
    }

    public static android.graphics.Point b(android.content.Context context) {
        android.graphics.Point point = new android.graphics.Point();
        if (context == null) {
            return point;
        }
        android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        defaultDisplay.getRealSize(point);
        android.graphics.Point point2 = new android.graphics.Point();
        defaultDisplay.getSize(point2);
        int i17 = point.x;
        double d17 = i17;
        int i18 = point2.x;
        if (d17 <= i18 * 1.7d && i17 != i18 && (context instanceof android.app.Activity)) {
            point.x = ((android.app.Activity) context).getWindow().getDecorView().getWidth();
        }
        return point;
    }

    public static android.graphics.Point c(android.content.Context context) {
        android.graphics.Point point = new android.graphics.Point();
        if (context == null) {
            return point;
        }
        ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return point;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(android.content.Context r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: es.u.d(android.content.Context, boolean):boolean");
    }

    public static boolean e() {
        boolean z17;
        if (f337816e == null) {
            f337816e = java.lang.Boolean.FALSE;
        }
        if (!f337816e.booleanValue()) {
            return false;
        }
        if (f337812a == null) {
            f337812a = new java.lang.Boolean(true);
        }
        if (f337812a.booleanValue()) {
            if (f337817f == null) {
                f337817f = java.lang.Boolean.FALSE;
            }
            if ((f337817f.booleanValue() || g()) && android.os.Build.VERSION.SDK_INT >= 26) {
                z17 = true;
                return !z17 || f();
            }
        }
        z17 = false;
        if (z17) {
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean f() {
        if (f337812a == null) {
            f337812a = new java.lang.Boolean(true);
        }
        if (f337812a.booleanValue()) {
            if (f337817f == null) {
                f337817f = java.lang.Boolean.FALSE;
            }
            if (f337817f.booleanValue() || g()) {
                if (f337814c == null) {
                    f337814c = new java.lang.Boolean(false);
                    try {
                        kd.c.c("MicroMsg.UIUtils", "dancy test darkModeUsableBrandAPI: %s", "");
                    } catch (java.lang.Exception e17) {
                        kd.c.b("MicroMsg.UIUtils", "darModeUsableBrandAPI %s", e17.toString());
                    }
                    if (!android.text.TextUtils.isEmpty("")) {
                        java.lang.String lowerCase = android.os.Build.BRAND.toLowerCase();
                        if (f337815d.contains(lowerCase)) {
                            for (java.lang.String str : "".split(",")) {
                                if (str.contains(lowerCase)) {
                                    kd.c.c("MicroMsg.UIUtils", "dancy test usable brandAPI: %s", str);
                                    java.lang.String[] split = str.split("&");
                                    if (split.length >= 2 && !android.text.TextUtils.isEmpty(split[1])) {
                                        try {
                                            int parseInt = java.lang.Integer.parseInt(split[1]);
                                            kd.c.a("MicroMsg.UIUtils", "dancy test api: %s", java.lang.Integer.valueOf(parseInt));
                                            if (android.os.Build.VERSION.SDK_INT >= parseInt) {
                                                f337814c = new java.lang.Boolean(true);
                                            }
                                        } catch (java.lang.NumberFormatException e18) {
                                            kd.c.b("MicroMsg.UIUtils", "parse api error! %s", e18.toString());
                                        }
                                    }
                                }
                            }
                        } else if ("".contains("other") && android.os.Build.VERSION.SDK_INT >= 29) {
                            f337814c = new java.lang.Boolean(true);
                        }
                    }
                }
                if (f337814c.booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean g() {
        if (f337813b == null) {
            try {
                f337813b = new java.lang.Boolean(false);
            } catch (java.lang.Exception e17) {
                kd.c.b("MicroMsg.UIUtils", "isDarkModeUnusedOn %s", e17.toString());
                f337813b = new java.lang.Boolean(false);
            }
        }
        return f337813b.booleanValue();
    }
}
