package org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382;

/* renamed from: org.chromium.base.compat.ApiHelperForM */
/* loaded from: classes13.dex */
public final class C29390xdcec370c {

    /* renamed from: _hellAccFlag_ */
    private byte f73493x7f11beae;

    private C29390xdcec370c() {
    }

    /* renamed from: createIconWithBitmap */
    public static android.graphics.drawable.Icon m152786xc174fb0a(android.graphics.Bitmap bitmap) {
        return android.graphics.drawable.Icon.createWithBitmap(bitmap);
    }

    /* renamed from: getActionButton */
    public static int m152787x9de3237e(android.view.MotionEvent motionEvent) {
        return motionEvent.getActionButton();
    }

    /* renamed from: getActionModeType */
    public static int m152788xcec2ccc9(android.view.ActionMode actionMode) {
        return actionMode.getType();
    }

    /* renamed from: getActiveNetwork */
    public static android.net.Network m152789xe4f45c92(android.net.ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetwork();
        } catch (java.lang.SecurityException unused) {
            return null;
        }
    }

    /* renamed from: getBoundNetworkForProcess */
    public static android.net.Network m152790x689da34c(android.net.ConnectivityManager connectivityManager) {
        return connectivityManager.getBoundNetworkForProcess();
    }

    /* renamed from: getDefaultActionModeHideDuration */
    public static long m152791x4b83c87a() {
        return android.view.ViewConfiguration.getDefaultActionModeHideDuration();
    }

    /* renamed from: getModePhysicalHeight */
    public static int m152792x6906f57(android.view.Display.Mode mode) {
        return mode.getPhysicalHeight();
    }

    /* renamed from: getModePhysicalWidth */
    public static int m152793x3ad9c996(android.view.Display.Mode mode) {
        return mode.getPhysicalWidth();
    }

    /* renamed from: getNetworkHandle */
    public static long m152794x711b9640(android.net.Network network) {
        return network.getNetworkHandle();
    }

    /* renamed from: getNetworkInfo */
    public static android.net.NetworkInfo m152795x6625b2c6(android.net.ConnectivityManager connectivityManager, android.net.Network network) {
        return connectivityManager.getNetworkInfo(network);
    }

    /* renamed from: getPendingIntentImmutableFlag */
    public static int m152796xdd01afb1() {
        return 67108864;
    }

    /* renamed from: getSystemService */
    public static <T> T m152797xac92a5d0(android.content.Context context, java.lang.Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* renamed from: hideActionMode */
    public static void m152798x3aa6afdb(android.view.ActionMode actionMode, long j17) {
        actionMode.hide(j17);
    }

    /* renamed from: invalidateContentRectOnActionMode */
    public static void m152799x497f531a(android.view.ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    /* renamed from: isCleartextTrafficPermitted */
    public static boolean m152800xc4f99fab() {
        return android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    /* renamed from: isDeviceIdleMode */
    public static boolean m152801x973a37d7(android.os.PowerManager powerManager) {
        return powerManager.isDeviceIdleMode();
    }

    /* renamed from: isPermissionRevokedByPolicy */
    public static boolean m152802x8ff2b94e(android.app.Activity activity, java.lang.String str) {
        return activity.getPackageManager().isPermissionRevokedByPolicy(str, activity.getPackageName());
    }

    /* renamed from: isProcess64Bit */
    public static boolean m152803x47101eaa() {
        return android.os.Process.is64Bit();
    }

    /* renamed from: isSystemUser */
    public static boolean m152804xa7bd1f64(android.os.UserManager userManager) {
        return userManager.isSystemUser();
    }

    /* renamed from: onPageCommitVisible */
    public static void m152805x20cd5ccd(android.webkit.WebViewClient webViewClient, android.webkit.WebView webView, java.lang.String str) {
        webViewClient.onPageCommitVisible(webView, str);
    }

    /* renamed from: onWindowFocusChangedOnActionMode */
    public static void m152806x15f416e3(android.view.ActionMode actionMode, boolean z17) {
        actionMode.onWindowFocusChanged(z17);
    }

    /* renamed from: reportNetworkConnectivity */
    public static void m152807xfc992131(android.net.ConnectivityManager connectivityManager, android.net.Network network, boolean z17) {
        connectivityManager.reportNetworkConnectivity(network, z17);
    }

    /* renamed from: requestActivityPermissions */
    public static void m152808x8ae5cee6(android.app.Activity activity, java.lang.String[] strArr, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(strArr);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "org/chromium/base/compat/ApiHelperForM", "requestActivityPermissions", "(Landroid/app/Activity;[Ljava/lang/String;I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
        activity.requestPermissions((java.lang.String[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(activity, "org/chromium/base/compat/ApiHelperForM", "requestActivityPermissions", "(Landroid/app/Activity;[Ljava/lang/String;I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
    }

    /* renamed from: shouldShowRequestPermissionRationale */
    public static boolean m152809xc35d0049(android.app.Activity activity, java.lang.String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
