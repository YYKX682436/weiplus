package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability */
/* loaded from: classes14.dex */
public class C26322xe3cb8d7f {
    private static java.lang.String TAG = "TPPlayerDecoderCapability";

    /* renamed from: mIsLibLoaded */
    private static boolean f52308xe0a15a33;

    /* renamed from: mNativeContext */
    private long f52309x5abc8e2b = 0;

    static {
        try {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26318xfb67d9bb.m101882x9ec66011(null);
            f52308xe0a15a33 = true;
        } catch (java.lang.UnsupportedOperationException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, e17.getMessage());
            f52308xe0a15a33 = false;
        }
    }

    /* renamed from: _addACodecBlacklist */
    private static native boolean m101890xc4541026(int i17, int i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPACodecPropertyRange tPACodecPropertyRange);

    /* renamed from: _addACodecWhitelist */
    private static native boolean m101891x124c2750(int i17, int i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPACodecPropertyRange tPACodecPropertyRange);

    /* renamed from: _addVCodecBlacklist */
    private static native boolean m101892x2353c77b(int i17, int i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPVCodecPropertyRange tPVCodecPropertyRange);

    /* renamed from: _addVCodecWhitelist */
    private static native boolean m101893x714bdea5(int i17, int i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPVCodecPropertyRange tPVCodecPropertyRange);

    /* renamed from: _getDecoderMaxCapabilityMap */
    private static native java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability> m101894x7938c5ed(int i17);

    /* renamed from: _isACodecCapabilitySupport */
    private static native boolean m101895x716b57d9(int i17, int i18, int i19, int i27, int i28, int i29, int i37);

    /* renamed from: _isVCodecCapabilitySupport */
    private static native boolean m101896x877cea2e(int i17, int i18, int i19, int i27, int i28, int i29, int i37);

    /* renamed from: addACodecBlacklist */
    public static boolean m101897x7219c987(int i17, int i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPACodecPropertyRange tPACodecPropertyRange) {
        if (!m101911x369448e0()) {
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7("addACodecBlacklist: Failed to load native library.");
        }
        try {
            return m101890xc4541026(i17, i18, tPACodecPropertyRange);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7("Failed to call _addACodecBlacklist.");
        }
    }

    /* renamed from: addACodecWhitelist */
    public static boolean m101898xc011e0b1(int i17, int i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPACodecPropertyRange tPACodecPropertyRange) {
        if (!m101911x369448e0()) {
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7("addACodecWhitelist: Failed to load native library.");
        }
        try {
            return m101891x124c2750(i17, i18, tPACodecPropertyRange);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7("Failed to call _addVCodecWhitelist.");
        }
    }

    /* renamed from: addDRMLevel1Blacklist */
    public static boolean m101899x9a538952(int i17) {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101696x9a538952(i17);
    }

    /* renamed from: addHDRBlackList */
    public static boolean m101900x2f088628(int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101697x2f088628(i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7(), tPHdrSupportVersionRange);
    }

    /* renamed from: addHDRVideoDecoderTypeWhiteList */
    public static boolean m101901x7681486f(int i17, int i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101699x7681486f(i17, i18, tPHdrSupportVersionRange);
    }

    /* renamed from: addHDRWhiteList */
    public static boolean m101902x7d009d52(int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101700x7d009d52(i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7(), tPHdrSupportVersionRange);
    }

    /* renamed from: addVCodecBlacklist */
    public static boolean m101903xd11980dc(int i17, int i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPVCodecPropertyRange tPVCodecPropertyRange) {
        if (!m101911x369448e0()) {
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7("addVCodecBlacklist: Failed to load native library.");
        }
        try {
            return m101892x2353c77b(i17, i18, tPVCodecPropertyRange);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7("Failed to call _addVCodecBlacklist.");
        }
    }

    /* renamed from: addVCodecWhitelist */
    public static boolean m101904x1f119806(int i17, int i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPVCodecPropertyRange tPVCodecPropertyRange) {
        if (!m101911x369448e0()) {
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7("addVCodecWhitelist :Failed to load native library.");
        }
        try {
            return m101893x714bdea5(i17, i18, tPVCodecPropertyRange);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7("Failed to call _addVCodecWhitelist.");
        }
    }

    /* renamed from: getVCodecDecoderMaxCapabilityMap */
    public static java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability> m101905x8dad856e(int i17) {
        if (!m101911x369448e0()) {
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7("Failed to load native library.");
        }
        try {
            return m101894x7938c5ed(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7("Failed to call _getDecoderMaxCapabilityMap.");
        }
    }

    /* renamed from: init */
    public static synchronized void m101906x316510(android.content.Context context, boolean z17) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26322xe3cb8d7f.class) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101727x316510(context, z17);
        }
    }

    /* renamed from: isACodecCapabilitySupport */
    public static boolean m101907xc1c57f58(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        java.lang.String str;
        if (2 == i17) {
            if (i18 == 5012) {
                str = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54255x7affee51;
            } else if (i18 != 5040) {
                switch (i18) {
                    case 5002:
                        str = "audio/aac";
                        break;
                    case 5003:
                        str = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54244xb1630448;
                        break;
                    case 5004:
                        str = "audio/dts";
                        break;
                    default:
                        str = "";
                        break;
                }
            } else {
                str = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54253xe4f8678e;
            }
            if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101740x4d63b186(str)) {
                return true;
            }
            if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101729x6576f695() || com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101730x3e12110d(str)) {
                return false;
            }
        }
        if (!m101911x369448e0()) {
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7("Failed to load native library.");
        }
        try {
            return m101895x716b57d9(i17, i18, i19, i27, i28, i29, i37);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7("Failed to call _isACodecCapabilitySupport.");
        }
    }

    /* renamed from: isDDPlusSupported */
    public static boolean m101908x4f0fc52a() {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101742xfcb56cb8();
    }

    /* renamed from: isDolbyDSSupported */
    public static boolean m101909x2e8a4dd1() {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101743x35999803();
    }

    /* renamed from: isHDRsupport */
    public static boolean m101910xf9014ce3(int i17, int i18, int i19) {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101734xf9014ce3(i17, i18, i19);
    }

    /* renamed from: isLibLoaded */
    private static boolean m101911x369448e0() {
        return f52308xe0a15a33;
    }

    /* renamed from: isVCodecCapabilitySupport */
    public static boolean m101912xd7d711ad(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        if (102 == i17) {
            java.lang.String str = i18 != 26 ? i18 != 138 ? i18 != 166 ? i18 != 172 ? i18 != 193 ? i18 != 1029 ? "" : "video/av01" : "video/vvc" : "video/hevc" : "video/x-vnd.on2.vp9" : "video/x-vnd.on2.vp8" : "video/avc";
            if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101740x4d63b186(str)) {
                return true;
            }
            if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101746x3d6d47aa() || com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101730x3e12110d(str)) {
                return false;
            }
        }
        if (!m101911x369448e0()) {
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7("Failed to load native library.");
        }
        try {
            return m101896x877cea2e(i17, i18, i19, i27, i28, i29, i37);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            throw new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7("Failed to call _isVCodecCapabilitySupport.");
        }
    }

    /* renamed from: setMediaCodecPreferredSoftwareComponent */
    public static void m101913x36d3bc49(boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101749x36d3bc49(z17);
    }
}
