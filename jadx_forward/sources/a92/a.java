package a92;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f83945a = {"V1950A", "V1955A"};

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f83946b = {"Hi3751V811", "IdeaHub"};

    public static boolean a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        if (L != null) {
            java.lang.String b17 = b();
            java.lang.String string = L.getString("fcm_last_anr_fg", "");
            if (!android.text.TextUtils.isEmpty(string) && string.equals(b17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmServiceHelper", "fcm anr happened: ".concat(string));
                return true;
            }
            java.lang.String string2 = L.getString("fcm_last_gms_dying", "");
            if (!android.text.TextUtils.isEmpty(string2) && string2.equals(b17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmServiceHelper", "gms dying happened: ".concat(string2));
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmServiceHelper", "no yet bad case captured");
        return false;
    }

    public static java.lang.String b() {
        java.lang.String b17;
        try {
            b17 = fp.s0.b(android.os.Build.FINGERPRINT, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FCM.FcmServiceHelper", "getDeviceFingerPrint err: " + th6.getMessage());
        }
        if (!android.text.TextUtils.isEmpty(b17)) {
            return b17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FCM.FcmServiceHelper", "getDeviceFingerPrint err: empty");
        return java.lang.String.valueOf(o45.wf.f424562g);
    }

    public static boolean c(android.content.Context context) {
        boolean z17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return false;
        }
        fp.e0.e();
        if (fp.e0.h() && android.os.Build.VERSION.SDK_INT == 29) {
            java.lang.String[] strArr = f83945a;
            for (int i17 = 0; i17 < 2; i17++) {
                java.lang.String str = strArr[i17];
                if (str.equalsIgnoreCase(android.os.Build.DEVICE) || str.equalsIgnoreCase(android.os.Build.PRODUCT)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FCM.FcmServiceHelper", "fcm service incompatible!");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FCM.FcmServiceHelper", "for vivo firebase problem, %s", wo.w0.m());
                    break;
                }
            }
        }
        if (fp.e0.c() && android.os.Build.VERSION.SDK_INT >= 28) {
            java.lang.String[] strArr2 = f83946b;
            for (int i18 = 0; i18 < 2; i18++) {
                java.lang.String str2 = strArr2[i18];
                if (str2.equalsIgnoreCase(android.os.Build.DEVICE) || str2.equalsIgnoreCase(android.os.Build.PRODUCT)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FCM.FcmServiceHelper", "fcm service incompatible!");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FCM.FcmServiceHelper", "for huawei firebase problem, %s", wo.w0.m());
                    z17 = true;
                }
            }
        }
        z17 = false;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmServiceHelper", "normal device");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmServiceHelper", "fcm is available");
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c() || !a();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FCM.FcmServiceHelper", "fcm-incompatible device");
        int m17660x402556f4 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1712x8c1d834d.m17660x402556f4(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmServiceHelper", "check google play service available, code = " + m17660x402556f4);
        if (m17660x402556f4 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmServiceHelper", "fcm is NOT available");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmServiceHelper", "fcm is available");
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c() || !a();
    }

    public static void d(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmServiceHelper", "notifyGmsDying");
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (str.contains("in dying proc com.google.android.gms (") || str.contains("in dying proc com.google.android.gms.persistent (")) {
            java.lang.String b17 = b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmServiceHelper", "note that gms provider dying happened: " + str + ", fp=" + b17);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
            if (L != null) {
                L.D("fcm_last_gms_dying", b17);
            }
        }
    }
}
