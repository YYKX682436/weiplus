package org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382;

/* renamed from: org.chromium.base.compat.ApiHelperForQ */
/* loaded from: classes13.dex */
public final class C29395xdcec3710 {
    private C29395xdcec3710() {
    }

    /* renamed from: bindIsolatedService */
    public static boolean m152845xe95c5d5f(android.content.Context context, android.content.Intent intent, int i17, java.lang.String str, java.util.concurrent.Executor executor, android.content.ServiceConnection serviceConnection) {
        return context.bindIsolatedService(intent, i17, str, executor, serviceConnection);
    }

    /* renamed from: canAuthenticate */
    public static int m152846x4191c2c5(android.hardware.biometrics.BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    /* renamed from: copy */
    public static long m152847x2eaf75(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        return android.os.FileUtils.copy(inputStream, outputStream);
    }

    /* renamed from: getBiometricManagerSystemService */
    public static android.hardware.biometrics.BiometricManager m152848x607bc7fb(android.content.Context context) {
        return (android.hardware.biometrics.BiometricManager) context.getSystemService(android.hardware.biometrics.BiometricManager.class);
    }

    /* renamed from: getClassification */
    public static int m152849x56200dc(android.view.MotionEvent motionEvent) {
        return motionEvent.getClassification();
    }

    /* renamed from: getCurrentThermalStatus */
    public static int m152850xf510a1e6(android.os.PowerManager powerManager) {
        return powerManager.getCurrentThermalStatus();
    }

    /* renamed from: getExternalVolumeNames */
    public static java.util.Set<java.lang.String> m152851xa36c44d(android.content.Context context) {
        return android.provider.MediaStore.getExternalVolumeNames(context);
    }

    /* renamed from: getTransportInfo */
    public static android.net.TransportInfo m152852x6633cfc1(android.net.NetworkCapabilities networkCapabilities) {
        return networkCapabilities.getTransportInfo();
    }

    /* renamed from: requestCellInfoUpdate */
    public static void m152853xc43fa88(android.telephony.TelephonyManager telephonyManager, final org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<java.util.List<android.telephony.CellInfo>> interfaceC29287xf9968465) {
        telephonyManager.requestCellInfoUpdate(org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01.f73579x921e6421, new android.telephony.TelephonyManager.CellInfoCallback() { // from class: org.chromium.base.compat.ApiHelperForQ.1
            @Override // android.telephony.TelephonyManager.CellInfoCallback
            public void onCellInfo(java.util.List<android.telephony.CellInfo> list) {
                org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465.this.m152269xd7b79106(list);
            }
        });
    }

    /* renamed from: setIncludePending */
    public static android.net.Uri m152854x67acf4d1(android.net.Uri uri) {
        return android.provider.MediaStore.setIncludePending(uri);
    }

    /* renamed from: startForeground */
    public static void m152855xe78c7745(android.app.Service service, int i17, android.app.Notification notification, int i18) {
        service.startForeground(i17, notification, i18);
    }

    /* renamed from: updateServiceGroup */
    public static void m152856xda3ad033(android.content.Context context, android.content.ServiceConnection serviceConnection, int i17, int i18) {
        context.updateServiceGroup(serviceConnection, i17, i18);
    }
}
