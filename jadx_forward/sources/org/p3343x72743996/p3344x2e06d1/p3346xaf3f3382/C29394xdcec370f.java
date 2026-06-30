package org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382;

/* renamed from: org.chromium.base.compat.ApiHelperForP */
/* loaded from: classes13.dex */
public final class C29394xdcec370f {
    private C29394xdcec370f() {
    }

    /* renamed from: build */
    public static android.view.textclassifier.TextSelection.Request m152834x59bc66e(android.view.textclassifier.TextSelection.Request.Builder builder) {
        return builder.build();
    }

    /* renamed from: clearPrimaryClip */
    public static void m152835x3ce743e5(android.content.ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }

    /* renamed from: getLongVersionCode */
    public static long m152836xdd582093(android.content.pm.PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    /* renamed from: getPrivateDnsServerName */
    public static java.lang.String m152837x4aa59a2a(android.net.LinkProperties linkProperties) {
        return linkProperties.getPrivateDnsServerName();
    }

    /* renamed from: getSignalStrength */
    public static android.telephony.SignalStrength m152838xd707c7ff(android.telephony.TelephonyManager telephonyManager) {
        return telephonyManager.getSignalStrength();
    }

    /* renamed from: hasSigningCertificate */
    public static boolean m152839x85771b8c(android.content.pm.PackageManager packageManager, java.lang.String str, byte[] bArr, int i17) {
        return packageManager.hasSigningCertificate(str, bArr, i17);
    }

    /* renamed from: isLocationEnabled */
    public static boolean m152840xc6f1cf42(android.location.LocationManager locationManager) {
        return locationManager.isLocationEnabled();
    }

    /* renamed from: isPrivateDnsActive */
    public static boolean m152841xf1a5e896(android.net.LinkProperties linkProperties) {
        return linkProperties.isPrivateDnsActive();
    }

    /* renamed from: newTextSelectionRequestBuilder */
    public static android.view.textclassifier.TextSelection.Request.Builder m152842x8b63490b(java.lang.CharSequence charSequence, int i17, int i18) {
        return new android.view.textclassifier.TextSelection.Request.Builder(charSequence, i17, i18);
    }

    /* renamed from: setDefaultLocales */
    public static android.view.textclassifier.TextSelection.Request.Builder m152843x422e58da(android.view.textclassifier.TextSelection.Request.Builder builder, android.os.LocaleList localeList) {
        return builder.setDefaultLocales(localeList);
    }

    /* renamed from: suggestSelection */
    public static android.view.textclassifier.TextSelection m152844xeb065668(android.view.textclassifier.TextClassifier textClassifier, android.view.textclassifier.TextSelection.Request request) {
        return textClassifier.suggestSelection(request);
    }
}
