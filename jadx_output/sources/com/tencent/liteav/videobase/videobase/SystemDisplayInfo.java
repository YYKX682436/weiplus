package com.tencent.liteav.videobase.videobase;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class SystemDisplayInfo {
    private static final java.lang.String TAG = "SystemDisplayInfo";

    private static android.view.Display getDefaultDisplayByWindowManager() {
        android.content.Context applicationContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "context is null.");
            return null;
        }
        try {
            return ((android.view.WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay();
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "error getting display from window service.", th6);
            return null;
        }
    }

    public static android.view.Display getDisplay() {
        if (nativeGetDisplayRotationObtainMethod() == 0) {
            android.view.Display displayByDisplayManager = getDisplayByDisplayManager();
            return displayByDisplayManager != null ? displayByDisplayManager : getDefaultDisplayByWindowManager();
        }
        android.view.Display defaultDisplayByWindowManager = getDefaultDisplayByWindowManager();
        return defaultDisplayByWindowManager != null ? defaultDisplayByWindowManager : getDisplayByDisplayManager();
    }

    private static android.view.Display getDisplayByDisplayManager() {
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() < 32) {
            return null;
        }
        android.content.Context applicationContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "context is null.");
            return null;
        }
        try {
            return ((android.hardware.display.DisplayManager) applicationContext.getSystemService("display")).getDisplay(0);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "error getting display from display service.", th6);
            return null;
        }
    }

    public static com.tencent.liteav.base.util.k getDisplayRotation() {
        com.tencent.liteav.base.util.k displayRotationCorrection = getDisplayRotationCorrection();
        if (displayRotationCorrection != null) {
            return displayRotationCorrection;
        }
        try {
            android.view.Display display = getDisplay();
            if (display != null) {
                return surfaceRotationEnumToRotation(display.getRotation());
            }
        } catch (java.lang.Exception e17) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "error getting display rotation.", e17);
        }
        return com.tencent.liteav.base.util.k.NORMAL;
    }

    private static com.tencent.liteav.base.util.k getDisplayRotationCorrection() {
        int nativeGetDisplayRotationCorrection = nativeGetDisplayRotationCorrection();
        if (com.tencent.liteav.base.util.k.b(nativeGetDisplayRotationCorrection)) {
            return com.tencent.liteav.base.util.k.a(nativeGetDisplayRotationCorrection);
        }
        return null;
    }

    public static int getDisplayRotationDegree() {
        return getDisplayRotation().mValue;
    }

    public static com.tencent.liteav.base.util.Size getDisplaySize() {
        try {
            android.view.Display display = getDisplay();
            if (display != null) {
                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                display.getRealMetrics(displayMetrics);
                return new com.tencent.liteav.base.util.Size(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "error getting display size.", e17);
        }
        return new com.tencent.liteav.base.util.Size(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, 1280);
    }

    private static native synchronized int nativeGetDisplayRotationCorrection();

    private static native synchronized int nativeGetDisplayRotationObtainMethod();

    private static com.tencent.liteav.base.util.k surfaceRotationEnumToRotation(int i17) {
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? com.tencent.liteav.base.util.k.NORMAL : com.tencent.liteav.base.util.k.ROTATION_270 : com.tencent.liteav.base.util.k.ROTATION_180 : com.tencent.liteav.base.util.k.ROTATION_90;
    }
}
