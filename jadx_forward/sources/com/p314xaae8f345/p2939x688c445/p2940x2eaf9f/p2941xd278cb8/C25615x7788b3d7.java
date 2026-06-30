package com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8;

/* renamed from: com.tencent.soter.core.biometric.BiometricManagerCompat */
/* loaded from: classes15.dex */
public class C25615x7788b3d7 {

    /* renamed from: IMPL_PROVIDER */
    static final java.util.Map<java.lang.Integer, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager> f46954x5a403130 = new java.util.HashMap();
    private static final java.lang.String TAG = "Soter.BiometricManagerCompat";

    /* renamed from: mBiometricType */
    private java.lang.Integer f46955x3bd87ca5;

    /* renamed from: mContext */
    private android.content.Context f46956xd6cfe882;

    /* renamed from: com.tencent.soter.core.biometric.BiometricManagerCompat$AuthenticationCallback */
    /* loaded from: classes15.dex */
    public static abstract class AuthenticationCallback {
        /* renamed from: onAuthenticationCancelled */
        public void mo95998x11c74cda() {
        }

        /* renamed from: onAuthenticationError */
        public void mo95999x974d2211(int i17, java.lang.CharSequence charSequence) {
        }

        /* renamed from: onAuthenticationFailed */
        public void mo96000x53184554() {
        }

        /* renamed from: onAuthenticationHelp */
        public void mo96001xa1c9da18(int i17, java.lang.CharSequence charSequence) {
        }

        /* renamed from: onAuthenticationSucceeded */
        public void mo96002x2dbde5ea(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationResult authenticationResult) {
        }
    }

    /* renamed from: com.tencent.soter.core.biometric.BiometricManagerCompat$AuthenticationResult */
    /* loaded from: classes15.dex */
    public static final class AuthenticationResult {

        /* renamed from: mCryptoObject */
        private com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.CryptoObject f46957xc208446d;

        public AuthenticationResult(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.CryptoObject cryptoObject) {
            this.f46957xc208446d = cryptoObject;
        }

        /* renamed from: getCryptoObject */
        public com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.CryptoObject m96003x8b65bdd6() {
            return this.f46957xc208446d;
        }
    }

    /* renamed from: com.tencent.soter.core.biometric.BiometricManagerCompat$FaceidManagerImpl */
    /* loaded from: classes15.dex */
    public static class FaceidManagerImpl implements com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager {
        private static final java.lang.String TAG = "Soter.BiometricManagerCompat.Faceid";

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: informTooManyTrial */
        public static void m96010xc612570c(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.AuthenticationCallback authenticationCallback) {
            zt5.h.f(TAG, "soter: too many fail callback. inform it.", new java.lang.Object[0]);
            authenticationCallback.mo96019x974d2211(10308, "Too many failed times");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: shouldInformTooManyTrial */
        public static boolean m96011xb168421f(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.AuthenticationCallback authenticationCallback, android.content.Context context) {
            if (com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96086x91c06c78()) {
                zt5.h.e(TAG, "soter: using system anti brute force strategy", new java.lang.Object[0]);
                return false;
            }
            if (com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96085xba1c2120(context)) {
                if (!com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96084x80ed5ecf(context)) {
                    zt5.h.e(TAG, "soter: unfreeze former frozen status", new java.lang.Object[0]);
                    com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96091xb2c01e90(context);
                }
                return false;
            }
            if (com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96084x80ed5ecf(context)) {
                zt5.h.e(TAG, "soter: failure time available", new java.lang.Object[0]);
                return false;
            }
            m96010xc612570c(authenticationCallback);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: unwrapCryptoObject */
        public static com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.CryptoObject m96012x80c7ed63(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.m96057x14030901() != null) {
                return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.CryptoObject(cryptoObject.m96057x14030901());
            }
            if (cryptoObject.m96059x3f6b0a02() != null) {
                return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.CryptoObject(cryptoObject.m96059x3f6b0a02());
            }
            if (cryptoObject.m96058xb5885619() != null) {
                return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.CryptoObject(cryptoObject.m96058xb5885619());
            }
            return null;
        }

        /* renamed from: wrapCallback */
        private static com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.AuthenticationCallback m96013x48c66aaf(final android.content.Context context, final com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback authenticationCallback) {
            return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.AuthenticationCallback() { // from class: com.tencent.soter.core.biometric.BiometricManagerCompat.FaceidManagerImpl.1

                /* renamed from: mMarkPermanentlyCallbacked */
                private boolean f46961x859d4c05 = false;

                @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.AuthenticationCallback
                /* renamed from: onAuthenticationError */
                public void mo96019x974d2211(int i17, java.lang.CharSequence charSequence) {
                    zt5.h.a(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FaceidManagerImpl.TAG, "soter: basic onAuthenticationError code[%d], msg[%s] entered.", java.lang.Integer.valueOf(i17), charSequence);
                    if (this.f46961x859d4c05) {
                        zt5.h.a(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FaceidManagerImpl.TAG, "soter: basic onAuthenticationError code[%d], msg[%s] returned cause permanently callback.", java.lang.Integer.valueOf(i17), charSequence);
                        return;
                    }
                    this.f46961x859d4c05 = true;
                    if (i17 == 5) {
                        zt5.h.c(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FaceidManagerImpl.TAG, "soter: basic onAuthenticationError code[%d], msg[%s] callbacked and returned cause FACE_ERROR_CANCELED got.", java.lang.Integer.valueOf(i17), charSequence);
                        com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback.this.mo95998x11c74cda();
                    } else {
                        if (i17 != 7) {
                            zt5.h.a(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FaceidManagerImpl.TAG, "soter: basic onAuthenticationError code[%d], msg[%s] callbacked and returned.", java.lang.Integer.valueOf(i17), charSequence);
                            com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback.this.mo95999x974d2211(i17, charSequence);
                            return;
                        }
                        zt5.h.c(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FaceidManagerImpl.TAG, "soter: basic onAuthenticationError code[%d], msg[%s] callbacked and returned cause FACE_ERROR_LOCKOUT got.", java.lang.Integer.valueOf(i17), charSequence);
                        if (!com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96084x80ed5ecf(context) && !com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96085xba1c2120(context) && !com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96086x91c06c78()) {
                            com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96079xb4843a97(context);
                        }
                        com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback.this.mo95999x974d2211(10308, "Too many failed times");
                    }
                }

                @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.AuthenticationCallback
                /* renamed from: onAuthenticationFailed */
                public void mo96020x53184554() {
                    zt5.h.a(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FaceidManagerImpl.TAG, "soter: basic onAuthenticationFailed", new java.lang.Object[0]);
                    if (this.f46961x859d4c05) {
                        return;
                    }
                    this.f46961x859d4c05 = true;
                    if (!com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FaceidManagerImpl.m96011xb168421f(this, context) && !com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96086x91c06c78()) {
                        com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96078xee288acc(context);
                        if (!com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96084x80ed5ecf(context)) {
                            zt5.h.f(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FaceidManagerImpl.TAG, "soter: too many fail trials", new java.lang.Object[0]);
                            com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96079xb4843a97(context);
                            com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FaceidManagerImpl.m96010xc612570c(this);
                            return;
                        }
                    }
                    com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback.this.mo96000x53184554();
                }

                @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.AuthenticationCallback
                /* renamed from: onAuthenticationHelp */
                public void mo96021xa1c9da18(int i17, java.lang.CharSequence charSequence) {
                    zt5.h.a(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FaceidManagerImpl.TAG, "soter: basic onAuthenticationHelp helpMsgId[%d], helpString[%s]", java.lang.Integer.valueOf(i17), charSequence);
                    java.lang.System.currentTimeMillis();
                    if (this.f46961x859d4c05 || com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FaceidManagerImpl.m96011xb168421f(this, context)) {
                        return;
                    }
                    com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback.this.mo96001xa1c9da18(i17, charSequence);
                }

                @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.AuthenticationCallback
                /* renamed from: onAuthenticationSucceeded */
                public void mo96022x2dbde5ea(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.AuthenticationResult authenticationResult) {
                    zt5.h.a(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FaceidManagerImpl.TAG, "soter: basic onAuthenticationSucceeded", new java.lang.Object[0]);
                    if (this.f46961x859d4c05) {
                        return;
                    }
                    this.f46961x859d4c05 = true;
                    if (com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FaceidManagerImpl.m96011xb168421f(this, context)) {
                        return;
                    }
                    if (!com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96086x91c06c78()) {
                        com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96091xb2c01e90(context);
                    }
                    com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback.this.mo96002x2dbde5ea(new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationResult(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FaceidManagerImpl.m96012x80c7ed63(authenticationResult.m96056x8b65bdd6())));
                }
            };
        }

        /* renamed from: wrapCryptoObject */
        private static com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.CryptoObject m96014x11e30ca(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.m96004x14030901() != null) {
                return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.CryptoObject(cryptoObject.m96004x14030901());
            }
            if (cryptoObject.m96006x3f6b0a02() != null) {
                return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.CryptoObject(cryptoObject.m96006x3f6b0a02());
            }
            if (cryptoObject.m96005xb5885619() != null) {
                return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.CryptoObject(cryptoObject.m96005xb5885619());
            }
            return null;
        }

        @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager
        /* renamed from: authenticate */
        public void mo96015x669626d5(android.content.Context context, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.CryptoObject cryptoObject, int i17, android.os.CancellationSignal cancellationSignal, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback authenticationCallback, android.os.Handler handler, android.os.Bundle bundle) {
            com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.m96048x669626d5(context, m96014x11e30ca(cryptoObject), i17, cancellationSignal, m96013x48c66aaf(context, authenticationCallback), handler);
        }

        @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager
        /* renamed from: getBiometricName */
        public java.lang.String mo96016x9e271bad(android.content.Context context) {
            return com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.m96049x9e271bad(context);
        }

        @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager
        /* renamed from: hasEnrolledBiometric */
        public boolean mo96017x7fe982f9(android.content.Context context) {
            return com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.m96051xa680d9bc(context);
        }

        @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager
        /* renamed from: isHardwareDetected */
        public boolean mo96018xa185b5d4(android.content.Context context) {
            return com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.m96052xa185b5d4(context);
        }
    }

    /* renamed from: com.tencent.soter.core.biometric.BiometricManagerCompat$FingerprintManagerImpl */
    /* loaded from: classes15.dex */
    public static class FingerprintManagerImpl implements com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager {
        private static final java.lang.String TAG = "Soter.BiometricManagerCompat.Fingerprint";

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: informTooManyTrial */
        public static void m96026xc612570c(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback authenticationCallback) {
            zt5.h.f(TAG, "soter: too many fail fingerprint callback. inform it.", new java.lang.Object[0]);
            authenticationCallback.mo96031x974d2211(10308, "Too many failed times");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: shouldInformTooManyTrial */
        public static boolean m96027xb168421f(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback authenticationCallback, android.content.Context context) {
            if (com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96086x91c06c78()) {
                zt5.h.e(TAG, "soter: using system anti brute force strategy", new java.lang.Object[0]);
                return false;
            }
            if (com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96085xba1c2120(context)) {
                if (!com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96084x80ed5ecf(context)) {
                    zt5.h.e(TAG, "soter: unfreeze former frozen status", new java.lang.Object[0]);
                    com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96091xb2c01e90(context);
                }
                return false;
            }
            if (com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96084x80ed5ecf(context)) {
                zt5.h.e(TAG, "soter: failure time available", new java.lang.Object[0]);
                return false;
            }
            m96026xc612570c(authenticationCallback);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: unwrapCryptoObject */
        public static com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.CryptoObject m96028x80c7ed63(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.m96075x14030901() != null) {
                return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.CryptoObject(cryptoObject.m96075x14030901());
            }
            if (cryptoObject.m96077x3f6b0a02() != null) {
                return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.CryptoObject(cryptoObject.m96077x3f6b0a02());
            }
            if (cryptoObject.m96076xb5885619() != null) {
                return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.CryptoObject(cryptoObject.m96076xb5885619());
            }
            return null;
        }

        /* renamed from: wrapCallback */
        private static com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback m96029x48c66aaf(final android.content.Context context, final com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback authenticationCallback) {
            return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback() { // from class: com.tencent.soter.core.biometric.BiometricManagerCompat.FingerprintManagerImpl.1

                /* renamed from: mMarkPermanentlyCallbacked */
                private boolean f46964x859d4c05 = false;

                @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback
                /* renamed from: onAuthenticationError */
                public void mo96031x974d2211(int i17, java.lang.CharSequence charSequence) {
                    zt5.h.a(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FingerprintManagerImpl.TAG, "soter: basic onAuthenticationError", new java.lang.Object[0]);
                    if (this.f46964x859d4c05) {
                        return;
                    }
                    this.f46964x859d4c05 = true;
                    if (i17 == 5 || i17 == 10) {
                        zt5.h.c(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FingerprintManagerImpl.TAG, "soter: user cancelled fingerprint authen", new java.lang.Object[0]);
                        com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback.this.mo95998x11c74cda();
                        return;
                    }
                    if (i17 != 7 && i17 != 9) {
                        com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback.this.mo95999x974d2211(i17, charSequence);
                        return;
                    }
                    zt5.h.c(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FingerprintManagerImpl.TAG, "soter: system call too many trial.", new java.lang.Object[0]);
                    if (!com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96084x80ed5ecf(context) && !com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96085xba1c2120(context) && !com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96086x91c06c78()) {
                        com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96079xb4843a97(context);
                    }
                    this.f46964x859d4c05 = false;
                    if (i17 == 7) {
                        mo96031x974d2211(10308, "Too many failed times");
                    } else {
                        mo96031x974d2211(10309, "Too many failed times");
                    }
                }

                @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback
                /* renamed from: onAuthenticationFailed */
                public void mo96032x53184554() {
                    zt5.h.a(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FingerprintManagerImpl.TAG, "soter: basic onAuthenticationFailed", new java.lang.Object[0]);
                    if (this.f46964x859d4c05 || com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FingerprintManagerImpl.m96027xb168421f(this, context)) {
                        return;
                    }
                    if (!com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96086x91c06c78()) {
                        com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96078xee288acc(context);
                        if (!com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96084x80ed5ecf(context)) {
                            zt5.h.f(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FingerprintManagerImpl.TAG, "soter: too many fail trials", new java.lang.Object[0]);
                            com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96079xb4843a97(context);
                            com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FingerprintManagerImpl.m96026xc612570c(this);
                            return;
                        }
                    }
                    com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback.this.mo96000x53184554();
                }

                @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback
                /* renamed from: onAuthenticationHelp */
                public void mo96033xa1c9da18(int i17, java.lang.CharSequence charSequence) {
                    zt5.h.a(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FingerprintManagerImpl.TAG, "soter: basic onAuthenticationHelp", new java.lang.Object[0]);
                    if (this.f46964x859d4c05 || com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FingerprintManagerImpl.m96027xb168421f(this, context)) {
                        return;
                    }
                    com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback.this.mo96001xa1c9da18(i17, charSequence);
                }

                @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationCallback
                /* renamed from: onAuthenticationSucceeded */
                public void mo96034x2dbde5ea(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.AuthenticationResultInternal authenticationResultInternal) {
                    zt5.h.a(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FingerprintManagerImpl.TAG, "soter: basic onAuthenticationSucceeded", new java.lang.Object[0]);
                    if (this.f46964x859d4c05 || com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FingerprintManagerImpl.m96027xb168421f(this, context)) {
                        return;
                    }
                    if (!com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96086x91c06c78()) {
                        com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96091xb2c01e90(context);
                    }
                    this.f46964x859d4c05 = true;
                    com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback.this.mo96002x2dbde5ea(new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationResult(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FingerprintManagerImpl.m96028x80c7ed63(authenticationResultInternal.m96074x8b65bdd6())));
                }
            };
        }

        /* renamed from: wrapCryptoObject */
        private static com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.CryptoObject m96030x11e30ca(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.m96004x14030901() != null) {
                return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.CryptoObject(cryptoObject.m96004x14030901());
            }
            if (cryptoObject.m96006x3f6b0a02() != null) {
                return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.CryptoObject(cryptoObject.m96006x3f6b0a02());
            }
            if (cryptoObject.m96005xb5885619() != null) {
                return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.CryptoObject(cryptoObject.m96005xb5885619());
            }
            return null;
        }

        @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager
        /* renamed from: authenticate */
        public void mo96015x669626d5(android.content.Context context, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.CryptoObject cryptoObject, int i17, android.os.CancellationSignal cancellationSignal, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback authenticationCallback, android.os.Handler handler, android.os.Bundle bundle) {
            com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.m96062x669626d5(context, m96030x11e30ca(cryptoObject), i17, cancellationSignal, m96029x48c66aaf(context, authenticationCallback), handler, bundle);
        }

        @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager
        /* renamed from: getBiometricName */
        public java.lang.String mo96016x9e271bad(android.content.Context context) {
            return com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.f47003xb618721a;
        }

        @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager
        /* renamed from: hasEnrolledBiometric */
        public boolean mo96017x7fe982f9(android.content.Context context) {
            return com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.m96067x8b300a2e(context);
        }

        @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager
        /* renamed from: isHardwareDetected */
        public boolean mo96018xa185b5d4(android.content.Context context) {
            return com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.m96068xa185b5d4(context);
        }
    }

    /* renamed from: com.tencent.soter.core.biometric.BiometricManagerCompat$IBiometricManager */
    /* loaded from: classes15.dex */
    public interface IBiometricManager {
        /* renamed from: authenticate */
        void mo96015x669626d5(android.content.Context context, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.CryptoObject cryptoObject, int i17, android.os.CancellationSignal cancellationSignal, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback authenticationCallback, android.os.Handler handler, android.os.Bundle bundle);

        /* renamed from: getBiometricName */
        java.lang.String mo96016x9e271bad(android.content.Context context);

        /* renamed from: hasEnrolledBiometric */
        boolean mo96017x7fe982f9(android.content.Context context);

        /* renamed from: isHardwareDetected */
        boolean mo96018xa185b5d4(android.content.Context context);
    }

    /* renamed from: com.tencent.soter.core.biometric.BiometricManagerCompat$LegacyFingerprintManagerImpl */
    /* loaded from: classes15.dex */
    public static class LegacyFingerprintManagerImpl implements com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager {
        @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager
        /* renamed from: authenticate */
        public void mo96015x669626d5(android.content.Context context, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.CryptoObject cryptoObject, int i17, android.os.CancellationSignal cancellationSignal, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback authenticationCallback, android.os.Handler handler, android.os.Bundle bundle) {
        }

        @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager
        /* renamed from: getBiometricName */
        public java.lang.String mo96016x9e271bad(android.content.Context context) {
            return null;
        }

        @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager
        /* renamed from: hasEnrolledBiometric */
        public boolean mo96017x7fe982f9(android.content.Context context) {
            return false;
        }

        @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager
        /* renamed from: isHardwareDetected */
        public boolean mo96018xa185b5d4(android.content.Context context) {
            zt5.i.a(200, "LegacyFingerprintManagerImpl.isHardwareDetected return false");
            return false;
        }
    }

    private C25615x7788b3d7(android.content.Context context, java.lang.Integer num) {
        this.f46956xd6cfe882 = context;
        this.f46955x3bd87ca5 = num;
        m95990xffb3350();
    }

    /* renamed from: from */
    public static com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7 m95989x3017aa(android.content.Context context, java.lang.Integer num) {
        return new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7(context, num);
    }

    /* renamed from: initImpl */
    private void m95990xffb3350() {
        com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager legacyFingerprintManagerImpl;
        if (wt5.a.l()) {
            zt5.h.c(TAG, "soter: set IMPL to FingerprintManagerImpl", new java.lang.Object[0]);
            legacyFingerprintManagerImpl = new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FingerprintManagerImpl();
        } else {
            zt5.h.c(TAG, "soter: set IMPL to LegacyFingerprintManagerImpl", new java.lang.Object[0]);
            legacyFingerprintManagerImpl = new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.LegacyFingerprintManagerImpl();
        }
        java.util.Map<java.lang.Integer, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager> map = f46954x5a403130;
        map.put(1, legacyFingerprintManagerImpl);
        if (wt5.a.l() && m95991xd5299886()) {
            map.put(2, new com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.FaceidManagerImpl());
        }
    }

    /* renamed from: isNativeSupportFaceid */
    public static boolean m95991xd5299886() {
        try {
            java.lang.Class.forName(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25617x2087cb39.f46997xf0bb1596);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: authenticate */
    public void m95992x669626d5(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.CryptoObject cryptoObject, int i17, android.os.CancellationSignal cancellationSignal, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback authenticationCallback, android.os.Handler handler, android.os.Bundle bundle) {
        com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager iBiometricManager = f46954x5a403130.get(this.f46955x3bd87ca5);
        if (iBiometricManager == null) {
            zt5.h.c(TAG, "soter: Biometric provider not initialized type[" + this.f46955x3bd87ca5 + "]", new java.lang.Object[0]);
            authenticationCallback.mo95998x11c74cda();
        }
        iBiometricManager.mo96015x669626d5(this.f46956xd6cfe882, cryptoObject, i17, cancellationSignal, authenticationCallback, handler, bundle);
    }

    /* renamed from: getBiometricName */
    public java.lang.String m95993x9e271bad() {
        com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager iBiometricManager = f46954x5a403130.get(this.f46955x3bd87ca5);
        if (iBiometricManager != null) {
            return iBiometricManager.mo96016x9e271bad(this.f46956xd6cfe882);
        }
        zt5.h.c(TAG, "soter: Biometric provider not initialized type[" + this.f46955x3bd87ca5 + "]", new java.lang.Object[0]);
        return null;
    }

    /* renamed from: hasEnrolledBiometric */
    public boolean m95994x7fe982f9() {
        com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager iBiometricManager = f46954x5a403130.get(this.f46955x3bd87ca5);
        if (iBiometricManager != null) {
            return iBiometricManager.mo96017x7fe982f9(this.f46956xd6cfe882);
        }
        zt5.h.c(TAG, "soter: Biometric provider not initialized type[" + this.f46955x3bd87ca5 + "]", new java.lang.Object[0]);
        return false;
    }

    /* renamed from: isCurrentFailTimeAvailable */
    public boolean m95995x80ed5ecf() {
        return com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96084x80ed5ecf(this.f46956xd6cfe882);
    }

    /* renamed from: isCurrentTweenTimeAvailable */
    public boolean m95996xba1c2120(android.content.Context context) {
        return com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25619x6afc94bd.m96085xba1c2120(this.f46956xd6cfe882);
    }

    /* renamed from: isHardwareDetected */
    public boolean m95997xa185b5d4() {
        com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.IBiometricManager iBiometricManager = f46954x5a403130.get(this.f46955x3bd87ca5);
        if (iBiometricManager != null) {
            return iBiometricManager.mo96018xa185b5d4(this.f46956xd6cfe882);
        }
        zt5.h.c(TAG, "soter: Biometric provider not initialized type[" + this.f46955x3bd87ca5 + "]", new java.lang.Object[0]);
        return false;
    }

    /* renamed from: com.tencent.soter.core.biometric.BiometricManagerCompat$CryptoObject */
    /* loaded from: classes15.dex */
    public static class CryptoObject {

        /* renamed from: mCipher */
        private final javax.crypto.Cipher f46958xfe580cd8;

        /* renamed from: mMac */
        private final javax.crypto.Mac f46959x32b9a2;

        /* renamed from: mSignature */
        private final java.security.Signature f46960xbab4e2cb;

        public CryptoObject(java.security.Signature signature) {
            this.f46960xbab4e2cb = signature;
            this.f46958xfe580cd8 = null;
            this.f46959x32b9a2 = null;
        }

        /* renamed from: getCipher */
        public javax.crypto.Cipher m96004x14030901() {
            return this.f46958xfe580cd8;
        }

        /* renamed from: getMac */
        public javax.crypto.Mac m96005xb5885619() {
            return this.f46959x32b9a2;
        }

        /* renamed from: getSignature */
        public java.security.Signature m96006x3f6b0a02() {
            return this.f46960xbab4e2cb;
        }

        public CryptoObject(javax.crypto.Cipher cipher) {
            this.f46958xfe580cd8 = cipher;
            this.f46960xbab4e2cb = null;
            this.f46959x32b9a2 = null;
        }

        public CryptoObject(javax.crypto.Mac mac) {
            this.f46959x32b9a2 = mac;
            this.f46958xfe580cd8 = null;
            this.f46960xbab4e2cb = null;
        }
    }
}
