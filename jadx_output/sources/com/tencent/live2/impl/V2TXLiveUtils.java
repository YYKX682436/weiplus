package com.tencent.live2.impl;

/* loaded from: classes16.dex */
public class V2TXLiveUtils {
    private static final java.lang.String TAG = "V2TXLiveUtils";
    public static final java.lang.String TRTC_ADDRESS1 = new java.lang.String(android.util.Base64.decode("cm9vbTovL2Nsb3VkLnRlbmNlbnQuY29tL3J0Yw==", 0));
    public static final java.lang.String TRTC_ADDRESS2 = new java.lang.String(android.util.Base64.decode("cm9vbTovL3J0Yy50ZW5jZW50LmNvbQ==", 0));

    /* renamed from: com.tencent.live2.impl.V2TXLiveUtils$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47191a;

        static {
            int[] iArr = new int[com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.values().length];
            f47191a = iArr;
            try {
                iArr[com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution160x160.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f47191a[com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution270x270.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f47191a[com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution480x480.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f47191a[com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution320x240.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f47191a[com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution480x360.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f47191a[com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution640x480.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f47191a[com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution320x180.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f47191a[com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution480x270.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                f47191a[com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution640x360.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                f47191a[com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution960x540.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                f47191a[com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution1280x720.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                f47191a[com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution1920x1080.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    /* loaded from: classes16.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f47192a;

        /* renamed from: b, reason: collision with root package name */
        public int f47193b;

        public a(int i17, int i18) {
            this.f47192a = i17;
            this.f47193b = i18;
        }
    }

    public static com.tencent.live2.impl.V2TXLiveUtils.a getBitrateByResolution(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution v2TXLiveVideoResolution) {
        int i17 = 900;
        int i18 = 600;
        switch (com.tencent.live2.impl.V2TXLiveUtils.AnonymousClass1.f47191a[v2TXLiveVideoResolution.ordinal()]) {
            case 1:
                i18 = 100;
                i17 = 150;
                break;
            case 2:
                i18 = 200;
                i17 = 300;
                break;
            case 3:
                i17 = 525;
                i18 = 350;
                break;
            case 4:
                i17 = 375;
                i18 = 250;
                break;
            case 5:
                i17 = 600;
                i18 = 400;
                break;
            case 6:
                break;
            case 7:
                i17 = 400;
                i18 = 250;
                break;
            case 8:
                i17 = com.tencent.mm.plugin.appbrand.jsapi.contact.n0.CTRL_INDEX;
                i18 = 350;
                break;
            case 9:
                i18 = 500;
                break;
            case 10:
            default:
                i18 = 800;
                i17 = 1500;
                break;
            case 11:
                i18 = 1000;
                i17 = 1800;
                break;
            case 12:
                i18 = 2500;
                i17 = 3000;
                break;
        }
        return new com.tencent.live2.impl.V2TXLiveUtils.a(i18, i17);
    }

    public static com.tencent.live2.V2TXLiveDef.V2TXLiveMode parseLiveMode(java.lang.String str) {
        if (str.startsWith("trtc://") || str.startsWith(TRTC_ADDRESS1) || str.startsWith(TRTC_ADDRESS2)) {
            com.tencent.liteav.basic.log.TXCLog.i(TAG, "parseLiveMode: rtc.");
            return com.tencent.live2.V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTC;
        }
        com.tencent.liteav.basic.log.TXCLog.i(TAG, "parseLiveMode: rtmp.");
        return com.tencent.live2.V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTMP;
    }

    public static java.lang.String removeURLSensitiveInfo(java.lang.String str) {
        int indexOf;
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            java.lang.String[] strArr = {"roomsig", "privatemapkey", "usersig"};
            for (int i17 = 0; i17 < 3; i17++) {
                if (str.contains(strArr[i17]) && (indexOf = str.indexOf(strArr[i17])) != -1) {
                    int indexOf2 = str.indexOf("&", indexOf);
                    str = indexOf2 == -1 ? str.substring(0, indexOf) : str.substring(0, indexOf) + str.substring(indexOf2);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.liteav.basic.log.TXCLog.e(TAG, "remove url sensitive info failed.", e17);
        }
        return str;
    }
}
