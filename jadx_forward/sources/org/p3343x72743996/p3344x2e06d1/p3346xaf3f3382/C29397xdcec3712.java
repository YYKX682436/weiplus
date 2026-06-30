package org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382;

/* renamed from: org.chromium.base.compat.ApiHelperForS */
/* loaded from: classes13.dex */
public final class C29397xdcec3712 {
    private static final java.lang.String TAG = "ApiHelperForS";

    private C29397xdcec3712() {
    }

    /* renamed from: createWindowContext */
    public static android.content.Context m152862xfdb1ac03(android.content.Context context, android.view.Display display, int i17, android.os.Bundle bundle) {
        return context.createWindowContext(display, i17, bundle);
    }

    /* renamed from: getConfidenceScore */
    public static float m152863xe6dc47f2(android.content.ClipDescription clipDescription, java.lang.String str) {
        return clipDescription.getConfidenceScore(str);
    }

    /* renamed from: getPendingIntentMutableFlag */
    public static int m152864x986f2815() {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432;
    }

    /* renamed from: getTextClassification */
    public static android.view.textclassifier.TextClassification m152865x47589469(android.view.textclassifier.TextSelection textSelection) {
        return textSelection.getTextClassification();
    }

    /* renamed from: getTextLinks */
    public static android.view.textclassifier.TextLinks m152866xc084bfd6(android.content.ClipData.Item item) {
        return item.getTextLinks();
    }

    /* renamed from: hasBluetoothConnectPermission */
    public static boolean m152867xd597af85() {
        return org.p3343x72743996.p3344x2e06d1.C29279xa15234bb.m152158x28e6dcf7(org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035(), "android.permission.BLUETOOTH_CONNECT", android.os.Process.myPid(), android.os.Process.myUid()) == 0;
    }

    /* renamed from: isGetClassificationStatusIsComplete */
    public static boolean m152868x496c0b07(android.content.ClipDescription clipDescription) {
        return clipDescription.getClassificationStatus() == 3;
    }

    /* renamed from: isStyleText */
    public static boolean m152869xb1d7d874(android.content.ClipDescription clipDescription) {
        return clipDescription.isStyledText();
    }

    /* renamed from: setAutoEnterEnabled */
    public static void m152870x1bac591a(android.app.PictureInPictureParams.Builder builder, boolean z17) {
        builder.setAutoEnterEnabled(z17);
    }

    /* renamed from: setIncludeTextClassification */
    public static android.view.textclassifier.TextSelection.Request.Builder m152871x107e5ef9(android.view.textclassifier.TextSelection.Request.Builder builder, boolean z17) {
        return builder.setIncludeTextClassification(z17);
    }

    /* renamed from: startForeground */
    public static void m152872xe78c7745(android.app.Service service, int i17, android.app.Notification notification, int i18) {
        try {
            service.startForeground(i17, notification, i18);
        } catch (android.app.ForegroundServiceStartNotAllowedException e17) {
            org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Cannot run service as foreground: " + e17 + " for notification channel " + notification.getChannelId() + " notification id " + i17);
        }
    }
}
