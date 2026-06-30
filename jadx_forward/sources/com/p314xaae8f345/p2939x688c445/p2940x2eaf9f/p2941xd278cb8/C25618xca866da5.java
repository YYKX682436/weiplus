package com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8;

/* renamed from: com.tencent.soter.core.biometric.FingerprintManagerProxy */
/* loaded from: classes15.dex */
final class C25618xca866da5 {

    /* renamed from: FINGERPRINT_SERVICE */
    public static final java.lang.String f47003xb618721a = "fingerprint";
    private static final java.lang.String TAG = "Soter.FingerprintManagerProxy";

    /* renamed from: sCLOSE_API31 */
    public static boolean f47004x49793e5e;

    /* renamed from: com.tencent.soter.core.biometric.FingerprintManagerProxy$AuthenticationCallback */
    /* loaded from: classes15.dex */
    public static abstract class AuthenticationCallback {
        /* renamed from: onAuthenticationError */
        public void mo96031x974d2211(int i17, java.lang.CharSequence charSequence) {
        }

        /* renamed from: onAuthenticationFailed */
        public void mo96032x53184554() {
        }

        /* renamed from: onAuthenticationHelp */
        public void mo96033xa1c9da18(int i17, java.lang.CharSequence charSequence) {
        }

        /* renamed from: onAuthenticationSucceeded */
        public void mo96034x2dbde5ea(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationResultInternal authenticationResultInternal) {
        }
    }

    /* renamed from: com.tencent.soter.core.biometric.FingerprintManagerProxy$AuthenticationResultInternal */
    /* loaded from: classes15.dex */
    public static final class AuthenticationResultInternal {

        /* renamed from: mCryptoObject */
        private com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.CryptoObject f47008xc208446d;

        public AuthenticationResultInternal(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.CryptoObject cryptoObject) {
            this.f47008xc208446d = cryptoObject;
        }

        /* renamed from: getCryptoObject */
        public com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.CryptoObject m96074x8b65bdd6() {
            return this.f47008xc208446d;
        }
    }

    /* renamed from: authenticate */
    public static void m96062x669626d5(android.content.Context context, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.CryptoObject cryptoObject, int i17, java.lang.Object obj, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback authenticationCallback, android.os.Handler handler, android.os.Bundle bundle) {
        boolean z17 = bundle.getBoolean("use_biometric_prompt");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        int i18 = android.os.Build.VERSION.SDK_INT;
        zt5.h.c(TAG, "use_biometric_prompt: %s, sdk_version: %s", valueOf, java.lang.Integer.valueOf(i18));
        if (!z17 || i18 < 28) {
            m96064x55e0d2fe(context, cryptoObject, i17, obj, authenticationCallback, handler);
        } else {
            m96063x8e92480b(context, cryptoObject, i17, obj, authenticationCallback, handler, bundle);
        }
    }

    /* renamed from: authenticateApi28 */
    private static void m96063x8e92480b(android.content.Context context, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.CryptoObject cryptoObject, int i17, java.lang.Object obj, final com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback authenticationCallback, android.os.Handler handler, android.os.Bundle bundle) {
        if (m96065x3fed0563(context, "android.permission.USE_BIOMETRIC") != 0) {
            zt5.h.b(TAG, "soter: permission check failed: authenticate", new java.lang.Object[0]);
            return;
        }
        android.hardware.biometrics.BiometricPrompt.Builder builder = new android.hardware.biometrics.BiometricPrompt.Builder(context);
        builder.setDeviceCredentialAllowed(false);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            builder.setAllowedAuthenticators(15);
        }
        builder.setTitle(bundle.getString("prompt_title"));
        builder.setSubtitle(bundle.getString("prompt_subtitle"));
        builder.setDescription(bundle.getString("prompt_description"));
        java.lang.String string = bundle.getString("prompt_button");
        if (android.text.TextUtils.isEmpty(string)) {
            string = context.getString(android.R.string.cancel);
        }
        builder.setNegativeButton(string, context.getMainExecutor(), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.soter.core.biometric.FingerprintManagerProxy.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback.this.mo96031x974d2211(10310, "click negative button");
            }
        });
        zt5.h.c(TAG, "call system build().authenticate", new java.lang.Object[0]);
        builder.build().authenticate((android.os.CancellationSignal) obj, context.getMainExecutor(), m96072xd006eb63(authenticationCallback));
    }

    /* renamed from: authenticateLegacy */
    private static void m96064x55e0d2fe(android.content.Context context, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.CryptoObject cryptoObject, int i17, java.lang.Object obj, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback authenticationCallback, android.os.Handler handler) {
        if (m96065x3fed0563(context, "android.permission.USE_FINGERPRINT") != 0) {
            zt5.h.b(TAG, "soter: permission check failed: authenticate", new java.lang.Object[0]);
            return;
        }
        try {
            android.hardware.fingerprint.FingerprintManager m96066x1c18181f = m96066x1c18181f(context);
            if (m96066x1c18181f != null) {
                zt5.h.c(TAG, "call system authenticate", new java.lang.Object[0]);
                m96066x1c18181f.authenticate(m96073x11e30ca(cryptoObject), (android.os.CancellationSignal) obj, i17, m96071x48c66aaf(authenticationCallback), handler);
            } else {
                zt5.h.b(TAG, "soter: fingerprint manager is null in authenticate! Should never happen", new java.lang.Object[0]);
            }
        } catch (java.lang.SecurityException unused) {
            zt5.h.b(TAG, "soter: triggered SecurityException in authenticate! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new java.lang.Object[0]);
        }
    }

    /* renamed from: checkSelfPermission */
    private static int m96065x3fed0563(android.content.Context context, java.lang.String str) {
        if (context == null) {
            zt5.h.b(TAG, "soter: check self permission: context is null", new java.lang.Object[0]);
            return -1;
        }
        if (!zt5.l.b(str)) {
            return context.checkSelfPermission(str);
        }
        zt5.h.b(TAG, "soter: requested permission is null or nil", new java.lang.Object[0]);
        return -1;
    }

    /* renamed from: getFingerprintManager */
    private static android.hardware.fingerprint.FingerprintManager m96066x1c18181f(android.content.Context context) {
        return (android.hardware.fingerprint.FingerprintManager) context.getSystemService(f47003xb618721a);
    }

    /* renamed from: hasEnrolledFingerprints */
    public static boolean m96067x8b300a2e(android.content.Context context) {
        if (m96065x3fed0563(context, "android.permission.USE_FINGERPRINT") != 0) {
            zt5.h.b(TAG, "soter: permission check failed: hasEnrolledBiometric", new java.lang.Object[0]);
            return false;
        }
        try {
            android.hardware.fingerprint.FingerprintManager m96066x1c18181f = m96066x1c18181f(context);
            if (m96066x1c18181f != null) {
                return m96066x1c18181f.hasEnrolledFingerprints();
            }
            zt5.h.b(TAG, "soter: fingerprint manager is null in hasEnrolledBiometric! Should never happen", new java.lang.Object[0]);
            return false;
        } catch (java.lang.SecurityException unused) {
            zt5.h.b(TAG, "soter: triggered SecurityException in hasEnrolledBiometric! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new java.lang.Object[0]);
            return false;
        }
    }

    /* renamed from: isHardwareDetected */
    public static boolean m96068xa185b5d4(android.content.Context context) {
        if (m96065x3fed0563(context, "android.permission.USE_FINGERPRINT") != 0) {
            zt5.h.b(TAG, "soter: permission check failed: isHardwareDetected", new java.lang.Object[0]);
            return false;
        }
        try {
            android.hardware.fingerprint.FingerprintManager m96066x1c18181f = m96066x1c18181f(context);
            if (m96066x1c18181f == null) {
                zt5.h.b(TAG, "soter: fingerprint manager is null in isHardwareDetected! Should never happen", new java.lang.Object[0]);
                return false;
            }
            boolean isHardwareDetected = m96066x1c18181f.isHardwareDetected();
            if (!isHardwareDetected) {
                zt5.i.a(104, "FingerprintManager.isHardwareDetected return false");
            }
            return isHardwareDetected;
        } catch (java.lang.SecurityException unused) {
            zt5.h.b(TAG, "soter: triggered SecurityException in isHardwareDetected! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new java.lang.Object[0]);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: unwrapCryptoObject */
    public static com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.CryptoObject m96070x80c7ed63(android.hardware.fingerprint.FingerprintManager.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.CryptoObject(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.CryptoObject(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.CryptoObject(cryptoObject.getMac());
        }
        return null;
    }

    /* renamed from: wrapCallback */
    private static android.hardware.fingerprint.FingerprintManager.AuthenticationCallback m96071x48c66aaf(final com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback authenticationCallback) {
        return new android.hardware.fingerprint.FingerprintManager.AuthenticationCallback() { // from class: com.tencent.soter.core.biometric.FingerprintManagerProxy.2
            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationError(int i17, java.lang.CharSequence charSequence) {
                zt5.h.a(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.TAG, "hy: lowest level return onAuthenticationError", new java.lang.Object[0]);
                com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback.this.mo96031x974d2211(i17, charSequence);
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationFailed() {
                zt5.h.a(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.TAG, "hy: lowest level return onAuthenticationFailed", new java.lang.Object[0]);
                com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback.this.mo96032x53184554();
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationHelp(int i17, java.lang.CharSequence charSequence) {
                zt5.h.a(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.TAG, "hy: lowest level return onAuthenticationHelp", new java.lang.Object[0]);
                com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback.this.mo96033xa1c9da18(i17, charSequence);
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult authenticationResult) {
                zt5.h.a(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.TAG, "hy: lowest level return onAuthenticationSucceeded", new java.lang.Object[0]);
                com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback.this.mo96034x2dbde5ea(new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationResultInternal(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.m96070x80c7ed63(authenticationResult.getCryptoObject())));
            }
        };
    }

    /* renamed from: wrapCallback2 */
    private static android.hardware.biometrics.BiometricPrompt.AuthenticationCallback m96072xd006eb63(final com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback authenticationCallback) {
        return new android.hardware.biometrics.BiometricPrompt.AuthenticationCallback() { // from class: com.tencent.soter.core.biometric.FingerprintManagerProxy.3
            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationError(int i17, java.lang.CharSequence charSequence) {
                com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback.this.mo96031x974d2211(i17, charSequence);
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationFailed() {
                com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback.this.mo96032x53184554();
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationHelp(int i17, java.lang.CharSequence charSequence) {
                com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback.this.mo96033xa1c9da18(i17, charSequence);
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt.AuthenticationResult authenticationResult) {
                com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback.this.mo96034x2dbde5ea(new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationResultInternal(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.m96069x80c7ed63(authenticationResult.getCryptoObject())));
            }
        };
    }

    /* renamed from: wrapCryptoObject */
    private static android.hardware.fingerprint.FingerprintManager.CryptoObject m96073x11e30ca(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.m96075x14030901() != null) {
            return new android.hardware.fingerprint.FingerprintManager.CryptoObject(cryptoObject.m96075x14030901());
        }
        if (cryptoObject.m96077x3f6b0a02() != null) {
            return new android.hardware.fingerprint.FingerprintManager.CryptoObject(cryptoObject.m96077x3f6b0a02());
        }
        if (cryptoObject.m96076xb5885619() != null) {
            return new android.hardware.fingerprint.FingerprintManager.CryptoObject(cryptoObject.m96076xb5885619());
        }
        return null;
    }

    /* renamed from: com.tencent.soter.core.biometric.FingerprintManagerProxy$CryptoObject */
    /* loaded from: classes15.dex */
    public static class CryptoObject {

        /* renamed from: mCipher */
        private final javax.crypto.Cipher f47009xfe580cd8;

        /* renamed from: mMac */
        private final javax.crypto.Mac f47010x32b9a2;

        /* renamed from: mSignature */
        private final java.security.Signature f47011xbab4e2cb;

        public CryptoObject(java.security.Signature signature) {
            this.f47011xbab4e2cb = signature;
            this.f47009xfe580cd8 = null;
            this.f47010x32b9a2 = null;
        }

        /* renamed from: getCipher */
        public javax.crypto.Cipher m96075x14030901() {
            return this.f47009xfe580cd8;
        }

        /* renamed from: getMac */
        public javax.crypto.Mac m96076xb5885619() {
            return this.f47010x32b9a2;
        }

        /* renamed from: getSignature */
        public java.security.Signature m96077x3f6b0a02() {
            return this.f47011xbab4e2cb;
        }

        public CryptoObject(javax.crypto.Cipher cipher) {
            this.f47009xfe580cd8 = cipher;
            this.f47011xbab4e2cb = null;
            this.f47010x32b9a2 = null;
        }

        public CryptoObject(javax.crypto.Mac mac) {
            this.f47010x32b9a2 = mac;
            this.f47009xfe580cd8 = null;
            this.f47011xbab4e2cb = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: unwrapCryptoObject */
    public static com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.CryptoObject m96069x80c7ed63(android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.CryptoObject(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.CryptoObject(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.CryptoObject(cryptoObject.getMac());
        }
        return null;
    }
}
