package com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8;

/* renamed from: com.tencent.soter.core.biometric.FaceManager */
/* loaded from: classes15.dex */
public abstract class AbstractC25616x2dac0670 {

    /* renamed from: FACE_ACQUIRED_BRIGHT */
    public static final int f46967xc0832c29 = 1112;

    /* renamed from: FACE_ACQUIRED_DARK */
    public static final int f46968x623bf065 = 1110;

    /* renamed from: FACE_ACQUIRED_DOWN */
    public static final int f46969x623c2591 = 1116;

    /* renamed from: FACE_ACQUIRED_FAR_FACE */
    public static final int f46970xd9503414 = 1106;

    /* renamed from: FACE_ACQUIRED_GOOD */
    public static final int f46971x623d81ac = 1101;

    /* renamed from: FACE_ACQUIRED_HACKER */
    public static final int f46972xc9ce04bd = 1111;

    /* renamed from: FACE_ACQUIRED_IMAGER_DIRTY */
    public static final int f46973xccf739d9 = 1103;

    /* renamed from: FACE_ACQUIRED_INSUFFICIENT */
    public static final int f46974x724171f2 = 1102;

    /* renamed from: FACE_ACQUIRED_LEFT */
    public static final int f46975x623fa0f6 = 1113;

    /* renamed from: FACE_ACQUIRED_MOUTH_OCCLUSION */
    public static final int f46976x7a0aab86 = 1119;

    /* renamed from: FACE_ACQUIRED_MULTI_FACE */
    public static final int f46977x5b094b72 = 1121;

    /* renamed from: FACE_ACQUIRED_NEAR_FACE */
    public static final int f46978xfa481485 = 1107;

    /* renamed from: FACE_ACQUIRED_NOSE_OCCLUSION */
    public static final int f46979x99889630 = 1120;

    /* renamed from: FACE_ACQUIRED_NO_FACE */
    public static final int f46980xc6c40acc = 1108;

    /* renamed from: FACE_ACQUIRED_NO_FOCUS */
    public static final int f46981x11c3ae29 = 1118;

    /* renamed from: FACE_ACQUIRED_RIGHT */
    public static final int f46982xe60adeed = 1114;

    /* renamed from: FACE_ACQUIRED_SHIFTING */
    public static final int f46983x8155ad8f = 1109;

    /* renamed from: FACE_ACQUIRED_TOO_FAST */
    public static final int f46984x67195df6 = 1105;

    /* renamed from: FACE_ACQUIRED_TOO_SLOW */
    public static final int f46985x671f6f9b = 1104;

    /* renamed from: FACE_ACQUIRED_UP */
    public static final int f46986x8a17834a = 1115;

    /* renamed from: FACE_ERROR_CAMERA_UNAVAILABLE */
    public static final int f46987x4743bd6f = 8;

    /* renamed from: FACE_ERROR_CANCELED */
    public static final int f46988x8346eb32 = 5;

    /* renamed from: FACE_ERROR_HW_UNAVAILABLE */
    public static final int f46989x75f14d9 = 1;

    /* renamed from: FACE_ERROR_LOCKOUT */
    public static final int f46990x6b3db46a = 7;

    /* renamed from: FACE_ERROR_TIMEOUT */
    public static final int f46991x8bcab88 = 3;

    /* renamed from: FACE_ERROR_UNABLE_TO_PROCESS */
    public static final int f46992xb492b25e = 2;

    /* renamed from: FACE_ERROR_VENDOR_BASE */
    public static final int f46993x3c8e022f = 1000;

    /* renamed from: FACE_WITH_EYES_CLOSED */
    public static final int f46994x20465392 = 1117;
    private static final java.lang.String TAG = "Soter.FaceManager";

    /* renamed from: com.tencent.soter.core.biometric.FaceManager$AuthenticationCallback */
    /* loaded from: classes15.dex */
    public static abstract class AuthenticationCallback {
        /* renamed from: onAuthenticationError */
        public void mo96039x974d2211(int i17, java.lang.CharSequence charSequence) {
        }

        /* renamed from: onAuthenticationFailed */
        public void mo96040x53184554() {
        }

        /* renamed from: onAuthenticationHelp */
        public void mo96041xa1c9da18(int i17, java.lang.CharSequence charSequence) {
        }

        /* renamed from: onAuthenticationSucceeded */
        public void mo96042x2dbde5ea(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670.AuthenticationResult authenticationResult) {
        }
    }

    /* renamed from: com.tencent.soter.core.biometric.FaceManager$AuthenticationResult */
    /* loaded from: classes15.dex */
    public static class AuthenticationResult {

        /* renamed from: mCryptoObject */
        private com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670.CryptoObject f46995xc208446d;

        public AuthenticationResult(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670.CryptoObject cryptoObject) {
            this.f46995xc208446d = cryptoObject;
        }

        /* renamed from: getCryptoObject */
        public com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670.CryptoObject m96043x8b65bdd6() {
            return this.f46995xc208446d;
        }
    }

    /* renamed from: authenticate */
    public abstract void m96035x669626d5(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670.CryptoObject cryptoObject, android.os.CancellationSignal cancellationSignal, int i17, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670.AuthenticationCallback authenticationCallback, android.os.Handler handler);

    /* renamed from: getBiometricName */
    public abstract java.lang.String m96036x9e271bad(android.content.Context context);

    /* renamed from: hasEnrolledFaces */
    public abstract boolean m96037xe4bc3477();

    /* renamed from: isHardwareDetected */
    public abstract boolean m96038xa185b5d4();

    /* renamed from: com.tencent.soter.core.biometric.FaceManager$CryptoObject */
    /* loaded from: classes15.dex */
    public static final class CryptoObject {

        /* renamed from: mCrypto */
        private final java.lang.Object f46996xfedb178e;

        public CryptoObject(java.security.Signature signature) {
            this.f46996xfedb178e = signature;
        }

        /* renamed from: getCipher */
        public javax.crypto.Cipher m96044x14030901() {
            java.lang.Object obj = this.f46996xfedb178e;
            if (obj instanceof javax.crypto.Cipher) {
                return (javax.crypto.Cipher) obj;
            }
            return null;
        }

        /* renamed from: getMac */
        public javax.crypto.Mac m96045xb5885619() {
            java.lang.Object obj = this.f46996xfedb178e;
            if (obj instanceof javax.crypto.Mac) {
                return (javax.crypto.Mac) obj;
            }
            return null;
        }

        /* renamed from: getSignature */
        public java.security.Signature m96046x3f6b0a02() {
            java.lang.Object obj = this.f46996xfedb178e;
            if (obj instanceof java.security.Signature) {
                return (java.security.Signature) obj;
            }
            return null;
        }

        public CryptoObject(javax.crypto.Cipher cipher) {
            this.f46996xfedb178e = cipher;
        }

        public CryptoObject(javax.crypto.Mac mac) {
            this.f46996xfedb178e = mac;
        }
    }
}
