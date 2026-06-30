package com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8;

/* renamed from: com.tencent.soter.core.biometric.FaceidManagerProxy */
/* loaded from: classes15.dex */
final class C25617x2087cb39 {

    /* renamed from: FACEMANAGER_FACTORY_CLASS_NAME */
    public static final java.lang.String f46997xf0bb1596 = "com.tencent.soter.core.biometric.SoterFaceManagerFactory";
    private static final java.lang.String TAG = "Soter.FaceidManagerProxy";

    /* renamed from: com.tencent.soter.core.biometric.FaceidManagerProxy$AuthenticationCallback */
    /* loaded from: classes15.dex */
    public static abstract class AuthenticationCallback {
        /* renamed from: onAuthenticationError */
        public void mo96019x974d2211(int i17, java.lang.CharSequence charSequence) {
        }

        /* renamed from: onAuthenticationFailed */
        public void mo96020x53184554() {
        }

        /* renamed from: onAuthenticationHelp */
        public void mo96021xa1c9da18(int i17, java.lang.CharSequence charSequence) {
        }

        /* renamed from: onAuthenticationSucceeded */
        public void mo96022x2dbde5ea(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.AuthenticationResult authenticationResult) {
        }
    }

    /* renamed from: com.tencent.soter.core.biometric.FaceidManagerProxy$AuthenticationResult */
    /* loaded from: classes15.dex */
    public static final class AuthenticationResult {

        /* renamed from: mCryptoObject */
        private com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.CryptoObject f46999xc208446d;

        public AuthenticationResult(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.CryptoObject cryptoObject) {
            this.f46999xc208446d = cryptoObject;
        }

        /* renamed from: getCryptoObject */
        public com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.CryptoObject m96056x8b65bdd6() {
            return this.f46999xc208446d;
        }
    }

    /* renamed from: authenticate */
    public static void m96048x669626d5(android.content.Context context, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.CryptoObject cryptoObject, int i17, java.lang.Object obj, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.AuthenticationCallback authenticationCallback, android.os.Handler handler) {
        try {
            com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670 m96050xa418a55a = m96050xa418a55a(context);
            if (m96050xa418a55a != null) {
                m96050xa418a55a.m96035x669626d5(m96055x11e30ca(cryptoObject), (android.os.CancellationSignal) obj, i17, m96054x48c66aaf(authenticationCallback), handler);
            } else {
                zt5.h.b(TAG, "soter: facemanager is null in authenticate! Should never happen", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception unused) {
            zt5.h.b(TAG, "soter: triggered SecurityException in authenticate! Make sure you declared USE_FACEID in AndroidManifest.xml", new java.lang.Object[0]);
        }
    }

    /* renamed from: getBiometricName */
    public static java.lang.String m96049x9e271bad(android.content.Context context) {
        try {
            com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670 m96050xa418a55a = m96050xa418a55a(context);
            if (m96050xa418a55a != null) {
                return m96050xa418a55a.m96036x9e271bad(context);
            }
            zt5.h.b(TAG, "soter: faceid manager is null! no biometric name returned.", new java.lang.Object[0]);
            return null;
        } catch (java.lang.Exception unused) {
            zt5.h.b(TAG, "soter: triggered SecurityException in getBiometricName! Make sure you declared USE_FACEID in AndroidManifest.xml", new java.lang.Object[0]);
            return null;
        }
    }

    /* renamed from: getFaceManager */
    private static com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670 m96050xa418a55a(android.content.Context context) {
        try {
            return (com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670) java.lang.Class.forName(f46997xf0bb1596).getDeclaredMethod("getFaceManager", android.content.Context.class).invoke(null, context);
        } catch (java.lang.Exception e17) {
            zt5.h.b(TAG, "soter: FaceManager init failed, maybe not support." + e17.toString(), new java.lang.Object[0]);
            return null;
        }
    }

    /* renamed from: hasEnrolledFaceids */
    public static boolean m96051xa680d9bc(android.content.Context context) {
        try {
            com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670 m96050xa418a55a = m96050xa418a55a(context);
            if (m96050xa418a55a != null) {
                return m96050xa418a55a.m96037xe4bc3477();
            }
            zt5.h.b(TAG, "soter: facemanager is null in hasEnrolledBiometric! Should never happen", new java.lang.Object[0]);
            return false;
        } catch (java.lang.Exception unused) {
            zt5.h.b(TAG, "soter: triggered SecurityException in hasEnrolledBiometric! Make sure you declared USE_FACEID in AndroidManifest.xml", new java.lang.Object[0]);
            return false;
        }
    }

    /* renamed from: isHardwareDetected */
    public static boolean m96052xa185b5d4(android.content.Context context) {
        try {
            com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670 m96050xa418a55a = m96050xa418a55a(context);
            if (m96050xa418a55a == null) {
                zt5.h.b(TAG, "soter: facemanager is null in isHardwareDetected! Should never happen", new java.lang.Object[0]);
                return false;
            }
            boolean m96038xa185b5d4 = m96050xa418a55a.m96038xa185b5d4();
            if (!m96038xa185b5d4) {
                zt5.i.a(104, "FaceManager.isHardwareDetected return false");
            }
            return m96038xa185b5d4;
        } catch (java.lang.Exception unused) {
            zt5.h.b(TAG, "soter: triggered SecurityException in isHardwareDetected! Make sure you declared USE_FACEID in AndroidManifest.xml", new java.lang.Object[0]);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: unwrapCryptoObject */
    public static com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.CryptoObject m96053x80c7ed63(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.m96044x14030901() != null) {
            return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.CryptoObject(cryptoObject.m96044x14030901());
        }
        if (cryptoObject.m96046x3f6b0a02() != null) {
            return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.CryptoObject(cryptoObject.m96046x3f6b0a02());
        }
        if (cryptoObject.m96045xb5885619() != null) {
            return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.CryptoObject(cryptoObject.m96045xb5885619());
        }
        return null;
    }

    /* renamed from: wrapCallback */
    private static com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670.AuthenticationCallback m96054x48c66aaf(final com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.AuthenticationCallback authenticationCallback) {
        return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670.AuthenticationCallback() { // from class: com.tencent.soter.core.biometric.FaceidManagerProxy.1
            @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670.AuthenticationCallback
            /* renamed from: onAuthenticationError */
            public void mo96039x974d2211(int i17, java.lang.CharSequence charSequence) {
                zt5.h.a(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.TAG, "hy: lowest level return onAuthenticationError", new java.lang.Object[0]);
                com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.AuthenticationCallback.this.mo96019x974d2211(i17, charSequence);
            }

            @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670.AuthenticationCallback
            /* renamed from: onAuthenticationFailed */
            public void mo96040x53184554() {
                zt5.h.a(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.TAG, "hy: lowest level return onAuthenticationFailed", new java.lang.Object[0]);
                com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.AuthenticationCallback.this.mo96020x53184554();
            }

            @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670.AuthenticationCallback
            /* renamed from: onAuthenticationHelp */
            public void mo96041xa1c9da18(int i17, java.lang.CharSequence charSequence) {
                zt5.h.a(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.TAG, "hy: lowest level return onAuthenticationHelp", new java.lang.Object[0]);
                com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.AuthenticationCallback.this.mo96021xa1c9da18(i17, charSequence);
            }

            @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670.AuthenticationCallback
            /* renamed from: onAuthenticationSucceeded */
            public void mo96042x2dbde5ea(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670.AuthenticationResult authenticationResult) {
                zt5.h.a(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.TAG, "hy: lowest level return onAuthenticationSucceeded", new java.lang.Object[0]);
                com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.AuthenticationCallback.this.mo96022x2dbde5ea(new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.AuthenticationResult(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.m96053x80c7ed63(authenticationResult.m96043x8b65bdd6())));
            }
        };
    }

    /* renamed from: wrapCryptoObject */
    private static com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670.CryptoObject m96055x11e30ca(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.m96057x14030901() != null) {
            return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670.CryptoObject(cryptoObject.m96057x14030901());
        }
        if (cryptoObject.m96059x3f6b0a02() != null) {
            return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670.CryptoObject(cryptoObject.m96059x3f6b0a02());
        }
        if (cryptoObject.m96058xb5885619() != null) {
            return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.AbstractC25616x2dac0670.CryptoObject(cryptoObject.m96058xb5885619());
        }
        return null;
    }

    /* renamed from: com.tencent.soter.core.biometric.FaceidManagerProxy$CryptoObject */
    /* loaded from: classes15.dex */
    public static class CryptoObject {

        /* renamed from: mCipher */
        private final javax.crypto.Cipher f47000xfe580cd8;

        /* renamed from: mMac */
        private final javax.crypto.Mac f47001x32b9a2;

        /* renamed from: mSignature */
        private final java.security.Signature f47002xbab4e2cb;

        public CryptoObject(java.security.Signature signature) {
            this.f47002xbab4e2cb = signature;
            this.f47000xfe580cd8 = null;
            this.f47001x32b9a2 = null;
        }

        /* renamed from: getCipher */
        public javax.crypto.Cipher m96057x14030901() {
            return this.f47000xfe580cd8;
        }

        /* renamed from: getMac */
        public javax.crypto.Mac m96058xb5885619() {
            return this.f47001x32b9a2;
        }

        /* renamed from: getSignature */
        public java.security.Signature m96059x3f6b0a02() {
            return this.f47002xbab4e2cb;
        }

        public CryptoObject(javax.crypto.Cipher cipher) {
            this.f47000xfe580cd8 = cipher;
            this.f47002xbab4e2cb = null;
            this.f47001x32b9a2 = null;
        }

        public CryptoObject(javax.crypto.Mac mac) {
            this.f47001x32b9a2 = mac;
            this.f47000xfe580cd8 = null;
            this.f47002xbab4e2cb = null;
        }
    }
}
