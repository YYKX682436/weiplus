package com.tencent.mars.comm;

/* loaded from: classes7.dex */
public class X509Util {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String OID_ANY_EKU = "2.5.29.37.0";
    private static final java.lang.String OID_SERVER_GATED_MICROSOFT = "1.3.6.1.4.1.311.10.3.3";
    private static final java.lang.String OID_SERVER_GATED_NETSCAPE = "2.16.840.1.113730.4.1";
    private static final java.lang.String OID_TLS_SERVER_AUTH = "1.3.6.1.5.5.7.3.1";
    public static final int STATE_APPBRAND = 1;
    public static final int STATE_CDN = 0;
    private static final java.lang.String TAG = "X509Util";
    private static java.security.cert.CertificateFactory sCertificateFactory;
    private static com.tencent.mars.comm.X509Util.X509TrustManagerImplementation sDefaultTrustManager;
    private static boolean sLoadedSystemKeyStore;
    private static com.tencent.mm.vfs.r6 sSystemCertificateDirectory;
    private static java.security.KeyStore sSystemKeyStore;
    private static java.util.Set<android.util.Pair<javax.security.auth.x500.X500Principal, java.security.PublicKey>> sSystemTrustAnchorCache;
    private static java.security.KeyStore sTestKeyStore;
    private static com.tencent.mars.comm.X509Util.X509TrustManagerImplementation sTestTrustManager;
    private static com.tencent.mars.comm.X509Util.TrustStorageListener sTrustStorageListener;
    private static final java.lang.Object sLock = new java.lang.Object();
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* loaded from: classes6.dex */
    public static final class CertVerifyStatusAndroid {
        public static final int EXPIRED = -3;
        public static final int FAILED = -1;
        public static final int INCORRECT_KEY_USAGE = -6;
        public static final int NOT_YET_VALID = -4;
        public static final int NO_TRUSTED_ROOT = -2;
        public static final int OK = 0;
        public static final int UNABLE_TO_PARSE = -5;
    }

    /* loaded from: classes7.dex */
    public static final class TrustStorageListener extends android.content.BroadcastReceiver {
        private TrustStorageListener() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            boolean equals;
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                equals = true;
                if (!"android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction()) && !"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction()) && (!"android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) || intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false))) {
                    equals = false;
                }
            } else {
                equals = "android.security.STORAGE_CHANGED".equals(intent.getAction());
            }
            if (equals) {
                try {
                    com.tencent.mars.comm.X509Util.reloadDefaultTrustManager();
                } catch (java.security.KeyStoreException e17) {
                    com.tencent.mars.xlog.Log.e(com.tencent.mars.comm.X509Util.TAG, "Unable to reload the default TrustManager", e17);
                } catch (java.security.NoSuchAlgorithmException e18) {
                    com.tencent.mars.xlog.Log.e(com.tencent.mars.comm.X509Util.TAG, "Unable to reload the default TrustManager", e18);
                } catch (java.security.cert.CertificateException e19) {
                    com.tencent.mars.xlog.Log.e(com.tencent.mars.comm.X509Util.TAG, "Unable to reload the default TrustManager", e19);
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class X509TrustManagerIceCreamSandwich implements com.tencent.mars.comm.X509Util.X509TrustManagerImplementation {
        private final javax.net.ssl.X509TrustManager mTrustManager;

        public X509TrustManagerIceCreamSandwich(javax.net.ssl.X509TrustManager x509TrustManager) {
            this.mTrustManager = x509TrustManager;
        }

        @Override // com.tencent.mars.comm.X509Util.X509TrustManagerImplementation
        public java.util.List<java.security.cert.X509Certificate> checkServerTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str, java.lang.String str2) {
            this.mTrustManager.checkServerTrusted(x509CertificateArr, str);
            return java.util.Collections.emptyList();
        }
    }

    /* loaded from: classes7.dex */
    public interface X509TrustManagerImplementation {
        java.util.List<java.security.cert.X509Certificate> checkServerTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str, java.lang.String str2);
    }

    /* loaded from: classes7.dex */
    public static final class X509TrustManagerJellyBean implements com.tencent.mars.comm.X509Util.X509TrustManagerImplementation {
        private final android.net.http.X509TrustManagerExtensions mTrustManagerExtensions;

        public X509TrustManagerJellyBean(javax.net.ssl.X509TrustManager x509TrustManager) {
            this.mTrustManagerExtensions = new android.net.http.X509TrustManagerExtensions(x509TrustManager);
        }

        @Override // com.tencent.mars.comm.X509Util.X509TrustManagerImplementation
        public java.util.List<java.security.cert.X509Certificate> checkServerTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str, java.lang.String str2) {
            return this.mTrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, str2);
        }
    }

    public static void addTestRootCertificate(byte[] bArr) {
        ensureInitialized();
        java.security.cert.X509Certificate createCertificateFromBytes = createCertificateFromBytes(bArr);
        synchronized (sLock) {
            sTestKeyStore.setCertificateEntry("root_cert_" + java.lang.Integer.toString(sTestKeyStore.size()), createCertificateFromBytes);
            reloadTestTrustManager();
        }
    }

    public static void clearTestRootCertificates() {
        ensureInitialized();
        synchronized (sLock) {
            try {
                sTestKeyStore.load(null);
                reloadTestTrustManager();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static java.security.cert.X509Certificate createCertificateFromBytes(byte[] bArr) {
        ensureInitialized();
        return (java.security.cert.X509Certificate) sCertificateFactory.generateCertificate(new java.io.ByteArrayInputStream(bArr));
    }

    private static com.tencent.mars.comm.X509Util.X509TrustManagerImplementation createTrustManager(java.security.KeyStore keyStore) {
        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        for (javax.net.ssl.TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
            if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                try {
                    return new com.tencent.mars.comm.X509Util.X509TrustManagerJellyBean((javax.net.ssl.X509TrustManager) trustManager);
                } catch (java.lang.IllegalArgumentException e17) {
                    com.tencent.mars.xlog.Log.e(TAG, "Error creating trust manager (" + trustManager.getClass().getName() + "): " + e17);
                }
            }
        }
        com.tencent.mars.xlog.Log.e(TAG, "Could not find suitable trust manager");
        return null;
    }

    private static void ensureInitialized() {
        synchronized (sLock) {
            ensureInitializedLocked();
        }
    }

    private static void ensureInitializedLocked() {
        if (sCertificateFactory == null) {
            sCertificateFactory = java.security.cert.CertificateFactory.getInstance("X.509");
        }
        if (sDefaultTrustManager == null) {
            sDefaultTrustManager = createTrustManager(null);
        }
        if (!sLoadedSystemKeyStore) {
            try {
                java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidCAStore");
                sSystemKeyStore = keyStore;
                try {
                    keyStore.load(null);
                } catch (java.io.IOException unused) {
                }
                sSystemCertificateDirectory = new com.tencent.mm.vfs.r6(java.lang.System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
            } catch (java.security.KeyStoreException unused2) {
            }
            sLoadedSystemKeyStore = true;
        }
        if (sSystemTrustAnchorCache == null) {
            sSystemTrustAnchorCache = new java.util.HashSet();
        }
        if (sTestKeyStore == null) {
            java.security.KeyStore keyStore2 = java.security.KeyStore.getInstance(java.security.KeyStore.getDefaultType());
            sTestKeyStore = keyStore2;
            try {
                keyStore2.load(null);
            } catch (java.io.IOException unused3) {
            }
        }
        if (sTestTrustManager == null) {
            sTestTrustManager = createTrustManager(sTestKeyStore);
        }
        if (sTrustStorageListener == null) {
            sTrustStorageListener = new com.tencent.mars.comm.X509Util.TrustStorageListener();
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
                intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
                intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
            } else {
                intentFilter.addAction("android.security.STORAGE_CHANGED");
            }
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(sTrustStorageListener, intentFilter);
        }
    }

    private static java.util.List<java.lang.String> getSubjectAlternativeNames(java.security.cert.X509Certificate x509Certificate) {
        java.lang.String str;
        java.util.Collection<java.util.List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        if (subjectAlternativeNames == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.List<?>> it = subjectAlternativeNames.iterator();
        while (it.hasNext()) {
            java.lang.Object obj = it.next().get(1);
            if (obj instanceof java.lang.String) {
                arrayList.add(((java.lang.String) obj).toLowerCase());
            }
        }
        java.lang.String trim = x509Certificate.getSubjectDN().getName().trim();
        int indexOf = trim.indexOf("CN=");
        if (indexOf >= 0) {
            str = trim.substring(indexOf + 3);
            int indexOf2 = str.indexOf(",");
            if (indexOf2 > 0) {
                str = str.substring(0, indexOf2);
            }
        } else {
            str = "";
        }
        com.tencent.mars.xlog.Log.i(TAG, "certificate dn %s cn %s", trim, str);
        if (str.length() > 0) {
            arrayList.add(str);
        }
        return arrayList;
    }

    private static java.lang.String hashPrincipal(javax.security.auth.x500.X500Principal x500Principal) {
        byte[] digest = java.security.MessageDigest.getInstance("MD5").digest(x500Principal.getEncoded());
        char[] cArr = new char[8];
        for (int i17 = 0; i17 < 4; i17++) {
            int i18 = i17 * 2;
            char[] cArr2 = HEX_DIGITS;
            byte b17 = digest[3 - i17];
            cArr[i18] = cArr2[(b17 >> 4) & 15];
            cArr[i18 + 1] = cArr2[b17 & 15];
        }
        return new java.lang.String(cArr);
    }

    private static boolean isHostMatched(java.util.List<java.lang.String> list, java.lang.String str) {
        if (list.contains(str)) {
            return true;
        }
        int indexOf = str.indexOf(".");
        int lastIndexOf = str.lastIndexOf(".");
        while (indexOf > 0 && indexOf < lastIndexOf) {
            java.lang.String str2 = "*" + str.substring(indexOf);
            com.tencent.mars.xlog.Log.i(TAG, "try match nhost " + str2);
            if (list.contains(str2)) {
                return true;
            }
            indexOf = str.indexOf(".", indexOf + 1);
        }
        return false;
    }

    private static boolean isKnownRoot(java.security.cert.X509Certificate x509Certificate) {
        if (sSystemKeyStore == null) {
            return false;
        }
        android.util.Pair<javax.security.auth.x500.X500Principal, java.security.PublicKey> pair = new android.util.Pair<>(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (sSystemTrustAnchorCache.contains(pair)) {
            return true;
        }
        java.lang.String hashPrincipal = hashPrincipal(x509Certificate.getSubjectX500Principal());
        int i17 = 0;
        while (true) {
            java.lang.String str = hashPrincipal + '.' + i17;
            com.tencent.mm.vfs.r6 r6Var = sSystemCertificateDirectory;
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, true);
            com.tencent.mm.vfs.z7 z7Var = r6Var == null ? com.tencent.mm.vfs.z7.f213276i : r6Var.f213166d;
            if (l17 != null && !l17.isEmpty()) {
                java.lang.String str2 = z7Var.f213279f;
                z7Var = new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, str2 + '/' + l17, z7Var.f213280g, z7Var.f213281h);
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, null);
            if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                return false;
            }
            java.security.cert.Certificate certificate = sSystemKeyStore.getCertificate("system:".concat(str));
            if (certificate != null) {
                if (certificate instanceof java.security.cert.X509Certificate) {
                    java.security.cert.X509Certificate x509Certificate2 = (java.security.cert.X509Certificate) certificate;
                    if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                        sSystemTrustAnchorCache.add(pair);
                        return true;
                    }
                } else {
                    com.tencent.mars.xlog.Log.e(TAG, "Anchor " + str + " not an X509Certificate: " + certificate.getClass().getName());
                }
            }
            i17++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reloadDefaultTrustManager() {
        synchronized (sLock) {
            sDefaultTrustManager = null;
            sSystemTrustAnchorCache = null;
            ensureInitializedLocked();
        }
    }

    private static void reloadTestTrustManager() {
        sTestTrustManager = createTrustManager(sTestKeyStore);
    }

    public static boolean verifyKeyUsage(java.security.cert.X509Certificate x509Certificate) {
        java.util.List<java.lang.String> extendedKeyUsage;
        try {
            extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
        } catch (java.lang.NullPointerException unused) {
        }
        if (extendedKeyUsage == null) {
            return true;
        }
        for (java.lang.String str : extendedKeyUsage) {
            if (str.equals(OID_TLS_SERVER_AUTH) || str.equals(OID_ANY_EKU) || str.equals(OID_SERVER_GATED_NETSCAPE) || str.equals(OID_SERVER_GATED_MICROSOFT)) {
                return true;
            }
        }
        return false;
    }

    public static com.tencent.mars.comm.AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, java.lang.String str, java.lang.String str2) {
        return verifyServerCertificates(bArr, str, str2, 0, null);
    }

    public static com.tencent.mars.comm.AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, java.lang.String str, java.lang.String str2, javax.net.ssl.X509TrustManager x509TrustManager) {
        return verifyServerCertificates(bArr, str, str2, 0, x509TrustManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf A[Catch: CertificateException -> 0x0158, CertificateNotYetValidException -> 0x015e, CertificateExpiredException -> 0x0165, TRY_LEAVE, TryCatch #10 {CertificateExpiredException -> 0x0165, CertificateNotYetValidException -> 0x015e, CertificateException -> 0x0158, blocks: (B:37:0x00b2, B:39:0x00bf), top: B:36:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mars.comm.AndroidCertVerifyResult verifyServerCertificates(byte[][] r9, java.lang.String r10, java.lang.String r11, int r12, javax.net.ssl.X509TrustManager r13) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mars.comm.X509Util.verifyServerCertificates(byte[][], java.lang.String, java.lang.String, int, javax.net.ssl.X509TrustManager):com.tencent.mars.comm.AndroidCertVerifyResult");
    }
}
