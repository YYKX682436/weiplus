package org.p3343x72743996.net;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "net")
@org.p3343x72743996.p3353x59bc66e.p3354xc6ad7b24.InterfaceC29461x94c0977e
/* renamed from: org.chromium.net.X509Util */
/* loaded from: classes7.dex */
public class C29565xfe45eec8 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f74339x7118e671 = false;

    /* renamed from: OID_ANY_EKU */
    private static final java.lang.String f74341x82e301e7 = "2.5.29.37.0";

    /* renamed from: OID_SERVER_GATED_MICROSOFT */
    private static final java.lang.String f74342xfeb31621 = "1.3.6.1.4.1.311.10.3.3";

    /* renamed from: OID_SERVER_GATED_NETSCAPE */
    private static final java.lang.String f74343x4e2f7e96 = "2.16.840.1.113730.4.1";

    /* renamed from: OID_TLS_SERVER_AUTH */
    private static final java.lang.String f74344xb583232b = "1.3.6.1.5.5.7.3.1";
    private static final java.lang.String TAG = "X509Util";

    /* renamed from: sCertificateFactory */
    private static java.security.cert.CertificateFactory f74345x18688546;

    /* renamed from: sDefaultTrustManager */
    private static android.net.http.X509TrustManagerExtensions f74346x228fba3;

    /* renamed from: sLoadedSystemKeyStore */
    private static boolean f74347x35f75189;

    /* renamed from: sSystemCertificateDirectory */
    private static java.io.File f74349x2427b238;

    /* renamed from: sSystemKeyStore */
    private static java.security.KeyStore f74350xe4024c64;

    /* renamed from: sSystemTrustAnchorCache */
    private static java.util.Set<android.util.Pair<javax.security.auth.x500.X500Principal, java.security.PublicKey>> f74351xf3cde4f7;

    /* renamed from: sTestKeyStore */
    private static java.security.KeyStore f74352x7670c487;

    /* renamed from: sTestRoot */
    private static java.security.cert.X509Certificate f74353x5a3ce227;

    /* renamed from: sTestTrustManager */
    private static android.net.http.X509TrustManagerExtensions f74354xf937627a;

    /* renamed from: sTrustStorageListener */
    private static org.p3343x72743996.net.C29565xfe45eec8.TrustStorageListener f74355x629d3bea;

    /* renamed from: sLock */
    private static final java.lang.Object f74348x678c83e = new java.lang.Object();

    /* renamed from: HEX_DIGITS */
    private static final char[] f74340x7a20c6aa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: org.chromium.net.X509Util$Natives */
    /* loaded from: classes7.dex */
    public interface Natives {
        /* renamed from: notifyClientCertStoreChanged */
        void mo153709x23a0336b();

        /* renamed from: notifyTrustStoreChanged */
        void mo153710xc07244c2();
    }

    /* renamed from: org.chromium.net.X509Util$TrustStorageListener */
    /* loaded from: classes7.dex */
    public static final class TrustStorageListener extends android.content.BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            boolean z17 = true;
            if (android.os.Build.VERSION.SDK_INT < 26) {
                if ("android.security.STORAGE_CHANGED".equals(intent.getAction())) {
                    org.p3343x72743996.net.C29566xc275fbd.get().mo153709x23a0336b();
                }
                z17 = false;
            } else if (!"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction())) {
                if ("android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction())) {
                    org.p3343x72743996.net.C29566xc275fbd.get().mo153709x23a0336b();
                } else if ("android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) && !intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false)) {
                    org.p3343x72743996.net.C29566xc275fbd.get().mo153709x23a0336b();
                }
                z17 = false;
            }
            if (z17) {
                try {
                    org.p3343x72743996.net.C29565xfe45eec8.m153704x20aaacbd();
                } catch (java.security.KeyStoreException e17) {
                    org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.C29565xfe45eec8.TAG, "Unable to reload the default TrustManager", (java.lang.Throwable) e17);
                } catch (java.security.NoSuchAlgorithmException e18) {
                    org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.C29565xfe45eec8.TAG, "Unable to reload the default TrustManager", (java.lang.Throwable) e18);
                } catch (java.security.cert.CertificateException e19) {
                    org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.C29565xfe45eec8.TAG, "Unable to reload the default TrustManager", (java.lang.Throwable) e19);
                }
            }
        }

        private TrustStorageListener() {
        }
    }

    /* renamed from: addTestRootCertificate */
    public static void m153693x520b0602(byte[] bArr) {
        java.security.cert.X509Certificate m153696x54e32a26 = m153696x54e32a26(bArr);
        synchronized (f74348x678c83e) {
            m153700xc5ef2eee();
            java.security.KeyStore keyStore = f74352x7670c487;
            keyStore.setCertificateEntry("root_cert_" + java.lang.Integer.toString(keyStore.size()), m153696x54e32a26);
            m153705x7f96d7a0();
        }
    }

    /* renamed from: checkServerTrustedIgnoringRuntimeException */
    private static java.util.List<java.security.cert.X509Certificate> m153694x6be07bb2(android.net.http.X509TrustManagerExtensions x509TrustManagerExtensions, java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str, java.lang.String str2) {
        try {
            return x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, str2);
        } catch (java.lang.RuntimeException e17) {
            org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "checkServerTrusted() unexpectedly threw: %s", (java.lang.Throwable) e17);
            throw new java.security.cert.CertificateException(e17);
        }
    }

    /* renamed from: clearTestRootCertificates */
    public static void m153695xa43e6a5d() {
        synchronized (f74348x678c83e) {
            m153700xc5ef2eee();
            try {
                f74352x7670c487.load(null);
                m153705x7f96d7a0();
            } catch (java.io.IOException unused) {
            }
        }
    }

    /* renamed from: createCertificateFromBytes */
    public static java.security.cert.X509Certificate m153696x54e32a26(byte[] bArr) {
        m153698x44063fb6();
        return (java.security.cert.X509Certificate) f74345x18688546.generateCertificate(new java.io.ByteArrayInputStream(bArr));
    }

    /* renamed from: createTrustManager */
    private static android.net.http.X509TrustManagerExtensions m153697x286a7151(java.security.KeyStore keyStore) {
        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        try {
            for (javax.net.ssl.TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                    try {
                        return new android.net.http.X509TrustManagerExtensions((javax.net.ssl.X509TrustManager) trustManager);
                    } catch (java.lang.IllegalArgumentException e17) {
                        org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Error creating trust manager (" + trustManager.getClass().getName() + "): " + e17);
                    }
                }
            }
            org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Could not find suitable trust manager");
            return null;
        } catch (java.lang.RuntimeException e18) {
            org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "TrustManagerFactory.getTrustManagers() unexpectedly threw: %s", (java.lang.Throwable) e18);
            throw new java.security.KeyStoreException(e18);
        }
    }

    /* renamed from: ensureInitialized */
    private static void m153698x44063fb6() {
        synchronized (f74348x678c83e) {
            m153699x73c43e60();
        }
    }

    /* renamed from: ensureInitializedLocked */
    private static void m153699x73c43e60() {
        if (f74345x18688546 == null) {
            f74345x18688546 = java.security.cert.CertificateFactory.getInstance("X.509");
        }
        if (f74346x228fba3 == null) {
            f74346x228fba3 = m153697x286a7151(null);
        }
        if (!f74347x35f75189) {
            try {
                java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidCAStore");
                f74350xe4024c64 = keyStore;
                try {
                    keyStore.load(null);
                } catch (java.io.IOException unused) {
                }
                f74349x2427b238 = new java.io.File(java.lang.System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
            } catch (java.security.KeyStoreException unused2) {
            }
            f74347x35f75189 = true;
        }
        if (f74351xf3cde4f7 == null) {
            f74351xf3cde4f7 = new java.util.HashSet();
        }
        if (f74355x629d3bea == null) {
            f74355x629d3bea = new org.p3343x72743996.net.C29565xfe45eec8.TrustStorageListener();
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
                intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
                intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
            } else {
                intentFilter.addAction("android.security.STORAGE_CHANGED");
            }
            org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152361xd9ec0c5(org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035(), f74355x629d3bea, intentFilter);
        }
    }

    /* renamed from: ensureTestInitializedLocked */
    private static void m153700xc5ef2eee() {
        if (f74352x7670c487 == null) {
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance(java.security.KeyStore.getDefaultType());
            f74352x7670c487 = keyStore;
            try {
                keyStore.load(null);
            } catch (java.io.IOException unused) {
            }
        }
        if (f74354xf937627a == null) {
            f74354xf937627a = m153697x286a7151(f74352x7670c487);
        }
    }

    /* renamed from: getUserAddedRoots */
    public static byte[][] m153701xb846fdd2() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (f74348x678c83e) {
            try {
                try {
                    m153698x44063fb6();
                    java.security.KeyStore keyStore = f74350xe4024c64;
                    if (keyStore == null) {
                        return new byte[0];
                    }
                    try {
                        java.util.Enumeration<java.lang.String> aliases = keyStore.aliases();
                        while (aliases.hasMoreElements()) {
                            java.lang.String nextElement = aliases.nextElement();
                            if (nextElement.startsWith("user:")) {
                                try {
                                    java.security.cert.Certificate certificate = f74350xe4024c64.getCertificate(nextElement);
                                    if (certificate instanceof java.security.cert.X509Certificate) {
                                        arrayList.add(((java.security.cert.X509Certificate) certificate).getEncoded());
                                    } else {
                                        org.p3343x72743996.p3344x2e06d1.Log.w(TAG, "alias: " + nextElement + " is not a X509 Cert, skipping");
                                    }
                                } catch (java.security.KeyStoreException e17) {
                                    org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Error reading cert with alias %s, error: %s", nextElement, e17);
                                } catch (java.security.cert.CertificateEncodingException e18) {
                                    org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Error encoding cert with alias %s, error: %s", nextElement, e18);
                                }
                            }
                        }
                        java.security.cert.X509Certificate x509Certificate = f74353x5a3ce227;
                        if (x509Certificate != null) {
                            try {
                                arrayList.add(x509Certificate.getEncoded());
                            } catch (java.security.cert.CertificateEncodingException e19) {
                                org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Error encoding test root cert, error %s", (java.lang.Throwable) e19);
                            }
                        }
                        return (byte[][]) arrayList.toArray(new byte[0]);
                    } catch (java.security.KeyStoreException e27) {
                        org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Error reading cert aliases: %s", (java.lang.Throwable) e27);
                        return new byte[0];
                    }
                } catch (java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.cert.CertificateException unused) {
                    return new byte[0];
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }

    /* renamed from: hashPrincipal */
    private static java.lang.String m153702xfb8d1ec0(javax.security.auth.x500.X500Principal x500Principal) {
        byte[] digest = java.security.MessageDigest.getInstance("MD5").digest(x500Principal.getEncoded());
        char[] cArr = new char[8];
        for (int i17 = 0; i17 < 4; i17++) {
            int i18 = i17 * 2;
            char[] cArr2 = f74340x7a20c6aa;
            byte b17 = digest[3 - i17];
            cArr[i18] = cArr2[(b17 >> 4) & 15];
            cArr[i18 + 1] = cArr2[b17 & 15];
        }
        return new java.lang.String(cArr);
    }

    /* renamed from: isKnownRoot */
    private static boolean m153703xa2b260bb(java.security.cert.X509Certificate x509Certificate) {
        if (f74350xe4024c64 == null) {
            return false;
        }
        android.util.Pair<javax.security.auth.x500.X500Principal, java.security.PublicKey> pair = new android.util.Pair<>(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (f74351xf3cde4f7.contains(pair)) {
            return true;
        }
        java.lang.String m153702xfb8d1ec0 = m153702xfb8d1ec0(x509Certificate.getSubjectX500Principal());
        int i17 = 0;
        while (true) {
            java.lang.String str = m153702xfb8d1ec0 + "." + i17;
            if (!new java.io.File(f74349x2427b238, str).exists()) {
                return false;
            }
            java.security.cert.Certificate certificate = f74350xe4024c64.getCertificate("system:" + str);
            if (certificate != null) {
                if (certificate instanceof java.security.cert.X509Certificate) {
                    java.security.cert.X509Certificate x509Certificate2 = (java.security.cert.X509Certificate) certificate;
                    if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                        f74351xf3cde4f7.add(pair);
                        return true;
                    }
                } else {
                    org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Anchor " + str + " not an X509Certificate: " + certificate.getClass().getName());
                }
            }
            i17++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reloadDefaultTrustManager */
    public static void m153704x20aaacbd() {
        synchronized (f74348x678c83e) {
            f74346x228fba3 = null;
            f74351xf3cde4f7 = null;
            m153699x73c43e60();
        }
        org.p3343x72743996.net.C29566xc275fbd.get().mo153710xc07244c2();
    }

    /* renamed from: reloadTestTrustManager */
    private static void m153705x7f96d7a0() {
        m153700xc5ef2eee();
        f74354xf937627a = m153697x286a7151(f74352x7670c487);
    }

    /* renamed from: setTestRootCertificateForBuiltin */
    public static void m153706x8260ba9b(byte[] bArr) {
        java.security.cert.X509Certificate m153696x54e32a26 = m153696x54e32a26(bArr);
        synchronized (f74348x678c83e) {
            f74353x5a3ce227 = m153696x54e32a26;
        }
    }

    /* renamed from: verifyKeyUsage */
    public static boolean m153707x3f9c761b(java.security.cert.X509Certificate x509Certificate) {
        java.util.List<java.lang.String> extendedKeyUsage;
        try {
            extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
        } catch (java.lang.NullPointerException unused) {
        }
        if (extendedKeyUsage == null) {
            return true;
        }
        for (java.lang.String str : extendedKeyUsage) {
            if (str.equals(f74344xb583232b) || str.equals(f74341x82e301e7) || str.equals(f74343x4e2f7e96) || str.equals(f74342xfeb31621)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00e6 A[Catch: all -> 0x00fe, TryCatch #9 {, blocks: (B:61:0x009f, B:63:0x00a3, B:64:0x00a8, B:67:0x00aa, B:68:0x00e0, B:70:0x00e6, B:71:0x00f7, B:72:0x00fc, B:77:0x00b0, B:81:0x00b6, B:83:0x00be, B:84:0x00de), top: B:60:0x009f, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00be A[Catch: all -> 0x00fe, TRY_ENTER, TryCatch #9 {, blocks: (B:61:0x009f, B:63:0x00a3, B:64:0x00a8, B:67:0x00aa, B:68:0x00e0, B:70:0x00e6, B:71:0x00f7, B:72:0x00fc, B:77:0x00b0, B:81:0x00b6, B:83:0x00be, B:84:0x00de), top: B:60:0x009f, inners: #8 }] */
    /* renamed from: verifyServerCertificates */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.p3343x72743996.net.C29485xcbb9aa9 m153708xe12d20f8(byte[][] r8, java.lang.String r9, java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p3343x72743996.net.C29565xfe45eec8.m153708xe12d20f8(byte[][], java.lang.String, java.lang.String, boolean):org.chromium.net.AndroidCertVerifyResult");
    }
}
