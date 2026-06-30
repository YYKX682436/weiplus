package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker */
/* loaded from: classes14.dex */
public final class C0414xa74f3bea {
    private static final java.lang.String TAG = "FlashAvailability";

    private C0414xa74f3bea() {
    }

    /* renamed from: isFlashAvailable */
    public static boolean m4074x9ae63083(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.InterfaceC0410x3d442f44 interfaceC0410x3d442f44) {
        return m4075x9ae63083(false, interfaceC0410x3d442f44);
    }

    /* renamed from: isFlashAvailable */
    public static boolean m4075x9ae63083(boolean z17, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.InterfaceC0410x3d442f44 interfaceC0410x3d442f44) {
        java.lang.Boolean bool;
        try {
            bool = (java.lang.Boolean) interfaceC0410x3d442f44.get(android.hardware.camera2.CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (java.nio.BufferUnderflowException e17) {
            if (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0370xcf1a968b.get(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0377x1ee4f5a3.class) != null) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, java.lang.String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", android.os.Build.MANUFACTURER, android.os.Build.MODEL, java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT)));
            } else {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, java.lang.String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", android.os.Build.MANUFACTURER, android.os.Build.MODEL, java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT)), e17);
            }
            if (!z17) {
                bool = java.lang.Boolean.FALSE;
            } else {
                throw e17;
            }
        }
        if (bool == null) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
