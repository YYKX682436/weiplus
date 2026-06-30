package a92;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f2412a = {"V1950A", "V1955A"};

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f2413b = {"Hi3751V811", "IdeaHub"};

    public static boolean a() {
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        if (L != null) {
            java.lang.String b17 = b();
            java.lang.String string = L.getString("fcm_last_anr_fg", "");
            if (!android.text.TextUtils.isEmpty(string) && string.equals(b17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmServiceHelper", "fcm anr happened: ".concat(string));
                return true;
            }
            java.lang.String string2 = L.getString("fcm_last_gms_dying", "");
            if (!android.text.TextUtils.isEmpty(string2) && string2.equals(b17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmServiceHelper", "gms dying happened: ".concat(string2));
                return true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmServiceHelper", "no yet bad case captured");
        return false;
    }

    public static java.lang.String b() {
        java.lang.String b17;
        try {
            b17 = fp.s0.b(android.os.Build.FINGERPRINT, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FCM.FcmServiceHelper", "getDeviceFingerPrint err: " + th6.getMessage());
        }
        if (!android.text.TextUtils.isEmpty(b17)) {
            return b17;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FCM.FcmServiceHelper", "getDeviceFingerPrint err: empty");
        return java.lang.String.valueOf(o45.wf.f343029g);
    }

    public static boolean c(android.content.Context context) {
        boolean z17;
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            return false;
        }
        fp.e0.e();
        if (fp.e0.h() && android.os.Build.VERSION.SDK_INT == 29) {
            java.lang.String[] strArr = f2412a;
            for (int i17 = 0; i17 < 2; i17++) {
                java.lang.String str = strArr[i17];
                if (str.equalsIgnoreCase(android.os.Build.DEVICE) || str.equalsIgnoreCase(android.os.Build.PRODUCT)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FCM.FcmServiceHelper", "fcm service incompatible!");
                    com.tencent.mars.xlog.Log.w("MicroMsg.FCM.FcmServiceHelper", "for vivo firebase problem, %s", wo.w0.m());
                    break;
                }
            }
        }
        if (fp.e0.c() && android.os.Build.VERSION.SDK_INT >= 28) {
            java.lang.String[] strArr2 = f2413b;
            for (int i18 = 0; i18 < 2; i18++) {
                java.lang.String str2 = strArr2[i18];
                if (str2.equalsIgnoreCase(android.os.Build.DEVICE) || str2.equalsIgnoreCase(android.os.Build.PRODUCT)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FCM.FcmServiceHelper", "fcm service incompatible!");
                    com.tencent.mars.xlog.Log.w("MicroMsg.FCM.FcmServiceHelper", "for huawei firebase problem, %s", wo.w0.m());
                    z17 = true;
                }
            }
        }
        z17 = false;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmServiceHelper", "normal device");
            com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmServiceHelper", "fcm is available");
            return com.tencent.mm.sdk.platformtools.a0.c() || !a();
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FCM.FcmServiceHelper", "fcm-incompatible device");
        int isGooglePlayServicesAvailable = com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmServiceHelper", "check google play service available, code = " + isGooglePlayServicesAvailable);
        if (isGooglePlayServicesAvailable != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmServiceHelper", "fcm is NOT available");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmServiceHelper", "fcm is available");
        return com.tencent.mm.sdk.platformtools.a0.c() || !a();
    }

    public static void d(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmServiceHelper", "notifyGmsDying");
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (str.contains("in dying proc com.google.android.gms (") || str.contains("in dying proc com.google.android.gms.persistent (")) {
            java.lang.String b17 = b();
            com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmServiceHelper", "note that gms provider dying happened: " + str + ", fp=" + b17);
            com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
            if (L != null) {
                L.D("fcm_last_gms_dying", b17);
            }
        }
    }
}
