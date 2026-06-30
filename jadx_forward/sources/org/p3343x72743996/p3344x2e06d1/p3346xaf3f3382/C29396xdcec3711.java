package org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382;

/* renamed from: org.chromium.base.compat.ApiHelperForR */
/* loaded from: classes13.dex */
public final class C29396xdcec3711 {
    private C29396xdcec3711() {
    }

    /* renamed from: getDisplay */
    public static android.view.Display m152857xa172548c(android.content.Context context) {
        return context.getDisplay();
    }

    /* renamed from: getMaximumWindowMetricsBounds */
    public static android.graphics.Rect m152858xf32228fe(android.view.WindowManager windowManager) {
        return windowManager.getMaximumWindowMetrics().getBounds();
    }

    /* renamed from: getVolumeDir */
    public static java.io.File m152859x8092085d(android.os.storage.StorageManager storageManager, android.net.Uri uri) {
        return storageManager.getStorageVolume(uri).getDirectory();
    }

    /* renamed from: setProcessStateSummary */
    public static void m152860x137a4622(android.app.ActivityManager activityManager, byte[] bArr) {
        activityManager.setProcessStateSummary(bArr);
    }

    /* renamed from: verifyInputEvent */
    public static android.view.VerifiedInputEvent m152861xe3a5a49(android.hardware.input.InputManager inputManager, android.view.InputEvent inputEvent) {
        return inputManager.verifyInputEvent(inputEvent);
    }
}
