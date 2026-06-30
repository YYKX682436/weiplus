package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.ApiCompatibilityUtils */
/* loaded from: classes13.dex */
public class C29279xa15234bb {
    private static final java.lang.String TAG = "ApiCompatUtil";

    /* renamed from: org.chromium.base.ApiCompatibilityUtils$ApisNMR1 */
    /* loaded from: classes13.dex */
    public static class ApisNMR1 {
        private ApisNMR1() {
        }

        /* renamed from: isDemoUser */
        public static boolean m152177x3c75b98() {
            return ((android.os.UserManager) org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getSystemService("user")).isDemoUser();
        }
    }

    /* renamed from: org.chromium.base.ApiCompatibilityUtils$ApisO */
    /* loaded from: classes13.dex */
    public static class ApisO {
        private ApisO() {
        }

        /* renamed from: createLaunchDisplayIdActivityOptions */
        public static android.os.Bundle m152178xde7cc41(int i17) {
            android.app.ActivityOptions makeBasic = android.app.ActivityOptions.makeBasic();
            makeBasic.setLaunchDisplayId(i17);
            return makeBasic.toBundle();
        }

        /* renamed from: disableSmartSelectionTextClassifier */
        public static void m152179xd30a1ad9(android.widget.TextView textView) {
            textView.setTextClassifier(android.view.textclassifier.TextClassifier.NO_OP);
        }

        /* renamed from: initNotificationSettingsIntent */
        public static void m152180x5f67a39a(android.content.Intent intent, java.lang.String str) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", str);
        }
    }

    /* renamed from: org.chromium.base.ApiCompatibilityUtils$ApisP */
    /* loaded from: classes13.dex */
    public static class ApisP {
        private ApisP() {
        }

        /* renamed from: getBitmapByUri */
        public static android.graphics.Bitmap m152181x439a1870(android.content.ContentResolver contentResolver, android.net.Uri uri) {
            return android.graphics.ImageDecoder.decodeBitmap(android.graphics.ImageDecoder.createSource(contentResolver, uri));
        }

        /* renamed from: getProcessName */
        public static java.lang.String m152182xe5e58464() {
            return android.app.Application.getProcessName();
        }
    }

    /* renamed from: org.chromium.base.ApiCompatibilityUtils$ApisQ */
    /* loaded from: classes11.dex */
    public static class ApisQ {
        private ApisQ() {
        }

        /* renamed from: getTargetableDisplayIds */
        public static java.util.List<java.lang.Integer> m152183x64a4dbd7(android.app.Activity activity) {
            android.hardware.display.DisplayManager displayManager;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (activity == null || (displayManager = (android.hardware.display.DisplayManager) activity.getSystemService("display")) == null) {
                return arrayList;
            }
            android.view.Display[] displays = displayManager.getDisplays();
            android.app.ActivityManager activityManager = (android.app.ActivityManager) activity.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            for (android.view.Display display : displays) {
                if (display.getState() == 2 && activityManager.isActivityStartAllowedOnDisplay(activity, display.getDisplayId(), new android.content.Intent(activity, activity.getClass()))) {
                    arrayList.add(java.lang.Integer.valueOf(display.getDisplayId()));
                }
            }
            return arrayList;
        }

        /* renamed from: isRunningInUserTestHarness */
        public static boolean m152184xa96b0219() {
            return android.app.ActivityManager.isRunningInUserTestHarness();
        }
    }

    private C29279xa15234bb() {
    }

    /* renamed from: checkPermission */
    public static int m152158x28e6dcf7(android.content.Context context, java.lang.String str, int i17, int i18) {
        try {
            return context.checkPermission(str, i17, i18);
        } catch (java.lang.RuntimeException unused) {
            return -1;
        }
    }

    /* renamed from: clearHandwritingBoundsOffsetBottom */
    public static void m152159x2e7fed13(android.view.View view) {
        if (j3.b.c()) {
            try {
                float floatValue = ((java.lang.Float) android.view.View.class.getMethod("getHandwritingBoundsOffsetTop", new java.lang.Class[0]).invoke(view, new java.lang.Object[0])).floatValue();
                float floatValue2 = ((java.lang.Float) android.view.View.class.getMethod("getHandwritingBoundsOffsetLeft", new java.lang.Class[0]).invoke(view, new java.lang.Object[0])).floatValue();
                float floatValue3 = ((java.lang.Float) android.view.View.class.getMethod("getHandwritingBoundsOffsetRight", new java.lang.Class[0]).invoke(view, new java.lang.Object[0])).floatValue();
                java.lang.Class cls = java.lang.Float.TYPE;
                android.view.View.class.getMethod("setHandwritingBoundsOffsets", cls, cls, cls, cls).invoke(view, java.lang.Float.valueOf(floatValue2), java.lang.Float.valueOf(floatValue), java.lang.Float.valueOf(floatValue3), 0);
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.NullPointerException | java.lang.reflect.InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: createLaunchDisplayIdActivityOptions */
    public static android.os.Bundle m152160xde7cc41(int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return org.p3343x72743996.p3344x2e06d1.C29279xa15234bb.ApisO.m152178xde7cc41(i17);
        }
        return null;
    }

    /* renamed from: disableSmartSelectionTextClassifier */
    public static void m152161xd30a1ad9(android.widget.TextView textView) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            org.p3343x72743996.p3344x2e06d1.C29279xa15234bb.ApisO.m152179xd30a1ad9(textView);
        }
    }

    /* renamed from: getBitmapByUri */
    public static android.graphics.Bitmap m152162x439a1870(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        return android.os.Build.VERSION.SDK_INT >= 28 ? org.p3343x72743996.p3344x2e06d1.C29279xa15234bb.ApisP.m152181x439a1870(contentResolver, uri) : android.provider.MediaStore.Images.Media.getBitmap(contentResolver, uri);
    }

    /* renamed from: getBytesUtf8 */
    public static byte[] m152163x863767c6(java.lang.String str) {
        return str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    /* renamed from: getColor */
    public static int m152164x7444d5ad(android.content.res.Resources resources, int i17) {
        return resources.getColor(i17);
    }

    /* renamed from: getDrawable */
    public static android.graphics.drawable.Drawable m152165x4a96be14(android.content.res.Resources resources, int i17) {
        return m152166xfd6b6d13(resources, i17, 0);
    }

    /* renamed from: getDrawableForDensity */
    public static android.graphics.drawable.Drawable m152166xfd6b6d13(android.content.res.Resources resources, int i17, int i18) {
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            return i18 == 0 ? resources.getDrawable(i17, null) : resources.getDrawableForDensity(i17, i18, null);
        } finally {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: getNotificationSettingsIntent */
    public static android.content.Intent m152167x3421e260() {
        android.content.Intent intent = new android.content.Intent();
        java.lang.String packageName = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getPackageName();
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            org.p3343x72743996.p3344x2e06d1.C29279xa15234bb.ApisO.m152180x5f67a39a(intent, packageName);
        } else {
            intent.setAction("android.settings.ACTION_APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", packageName);
            intent.putExtra("app_uid", org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getApplicationInfo().uid);
        }
        return intent;
    }

    /* renamed from: getProcessName */
    public static java.lang.String m152168xe5e58464() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return org.p3343x72743996.p3344x2e06d1.C29279xa15234bb.ApisP.m152182xe5e58464();
        }
        try {
            return (java.lang.String) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentProcessName", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    /* renamed from: getTargetableDisplayIds */
    public static java.util.List<java.lang.Integer> m152169x64a4dbd7(android.app.Activity activity) {
        return android.os.Build.VERSION.SDK_INT >= 29 ? org.p3343x72743996.p3344x2e06d1.C29279xa15234bb.ApisQ.m152183x64a4dbd7(activity) : new java.util.ArrayList();
    }

    /* renamed from: isDemoUser */
    public static boolean m152170x3c75b98() {
        return android.os.Build.VERSION.SDK_INT >= 25 && org.p3343x72743996.p3344x2e06d1.C29279xa15234bb.ApisNMR1.m152177x3c75b98();
    }

    /* renamed from: isInMultiWindowMode */
    public static boolean m152171xea4a57dd(android.app.Activity activity) {
        return activity.isInMultiWindowMode();
    }

    /* renamed from: isRunningInUserTestHarness */
    public static boolean m152172xa96b0219() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return org.p3343x72743996.p3344x2e06d1.C29279xa15234bb.ApisQ.m152184xa96b0219();
        }
        return false;
    }

    /* renamed from: requireNonNull */
    public static <T> T m152173x3697e0cf(T t17) {
        t17.getClass();
        return t17;
    }

    /* renamed from: setActivityOptionsBackgroundActivityStartMode */
    public static void m152175x4afb633b(android.app.ActivityOptions activityOptions) {
        if (j3.b.c()) {
            activityOptions.setPendingIntentBackgroundActivityStartMode(1);
        }
    }

    /* renamed from: setTextAppearance */
    public static void m152176x1d8f3e73(android.widget.TextView textView, int i17) {
        textView.setTextAppearance(textView.getContext(), i17);
    }

    /* renamed from: requireNonNull */
    public static <T> T m152174x3697e0cf(T t17, java.lang.String str) {
        if (t17 != null) {
            return t17;
        }
        throw new java.lang.NullPointerException(str);
    }
}
