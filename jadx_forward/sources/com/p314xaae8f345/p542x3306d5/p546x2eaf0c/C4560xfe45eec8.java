package com.p314xaae8f345.p542x3306d5.p546x2eaf0c;

/* renamed from: com.tencent.mars.comm.X509Util */
/* loaded from: classes7.dex */
public class C4560xfe45eec8 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f19349x7118e671 = false;

    /* renamed from: OID_ANY_EKU */
    private static final java.lang.String f19351x82e301e7 = "2.5.29.37.0";

    /* renamed from: OID_SERVER_GATED_MICROSOFT */
    private static final java.lang.String f19352xfeb31621 = "1.3.6.1.4.1.311.10.3.3";

    /* renamed from: OID_SERVER_GATED_NETSCAPE */
    private static final java.lang.String f19353x4e2f7e96 = "2.16.840.1.113730.4.1";

    /* renamed from: OID_TLS_SERVER_AUTH */
    private static final java.lang.String f19354xb583232b = "1.3.6.1.5.5.7.3.1";

    /* renamed from: STATE_APPBRAND */
    public static final int f19355x9ea7c214 = 1;

    /* renamed from: STATE_CDN */
    public static final int f19356x29d75f3f = 0;
    private static final java.lang.String TAG = "X509Util";

    /* renamed from: sCertificateFactory */
    private static java.security.cert.CertificateFactory f19357x18688546;

    /* renamed from: sDefaultTrustManager */
    private static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.X509TrustManagerImplementation f19358x228fba3;

    /* renamed from: sLoadedSystemKeyStore */
    private static boolean f19359x35f75189;

    /* renamed from: sSystemCertificateDirectory */
    private static com.p314xaae8f345.mm.vfs.r6 f19361x2427b238;

    /* renamed from: sSystemKeyStore */
    private static java.security.KeyStore f19362xe4024c64;

    /* renamed from: sSystemTrustAnchorCache */
    private static java.util.Set<android.util.Pair<javax.security.auth.x500.X500Principal, java.security.PublicKey>> f19363xf3cde4f7;

    /* renamed from: sTestKeyStore */
    private static java.security.KeyStore f19364x7670c487;

    /* renamed from: sTestTrustManager */
    private static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.X509TrustManagerImplementation f19365xf937627a;

    /* renamed from: sTrustStorageListener */
    private static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.TrustStorageListener f19366x629d3bea;

    /* renamed from: sLock */
    private static final java.lang.Object f19360x678c83e = new java.lang.Object();

    /* renamed from: HEX_DIGITS */
    private static final char[] f19350x7a20c6aa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: com.tencent.mars.comm.X509Util$CertVerifyStatusAndroid */
    /* loaded from: classes6.dex */
    public static final class CertVerifyStatusAndroid {

        /* renamed from: EXPIRED */
        public static final int f19367xdcc23305 = -3;

        /* renamed from: FAILED */
        public static final int f19368x7b29883d = -1;

        /* renamed from: INCORRECT_KEY_USAGE */
        public static final int f19369xada7bf47 = -6;

        /* renamed from: NOT_YET_VALID */
        public static final int f19370x1c07c119 = -4;

        /* renamed from: NO_TRUSTED_ROOT */
        public static final int f19371xce648108 = -2;
        public static final int OK = 0;

        /* renamed from: UNABLE_TO_PARSE */
        public static final int f19372x5326471b = -5;
    }

    /* renamed from: com.tencent.mars.comm.X509Util$TrustStorageListener */
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
                    com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.m40146x20aaacbd();
                } catch (java.security.KeyStoreException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.TAG, "Unable to reload the default TrustManager", e17);
                } catch (java.security.NoSuchAlgorithmException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.TAG, "Unable to reload the default TrustManager", e18);
                } catch (java.security.cert.CertificateException e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.TAG, "Unable to reload the default TrustManager", e19);
                }
            }
        }
    }

    /* renamed from: com.tencent.mars.comm.X509Util$X509TrustManagerIceCreamSandwich */
    /* loaded from: classes7.dex */
    public static final class X509TrustManagerIceCreamSandwich implements com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.X509TrustManagerImplementation {

        /* renamed from: mTrustManager */
        private final javax.net.ssl.X509TrustManager f19373x49442f42;

        public X509TrustManagerIceCreamSandwich(javax.net.ssl.X509TrustManager x509TrustManager) {
            this.f19373x49442f42 = x509TrustManager;
        }

        @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.X509TrustManagerImplementation
        /* renamed from: checkServerTrusted */
        public java.util.List<java.security.cert.X509Certificate> mo40152x1aca140c(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str, java.lang.String str2) {
            this.f19373x49442f42.checkServerTrusted(x509CertificateArr, str);
            return java.util.Collections.emptyList();
        }
    }

    /* renamed from: com.tencent.mars.comm.X509Util$X509TrustManagerImplementation */
    /* loaded from: classes7.dex */
    public interface X509TrustManagerImplementation {
        /* renamed from: checkServerTrusted */
        java.util.List<java.security.cert.X509Certificate> mo40152x1aca140c(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str, java.lang.String str2);
    }

    /* renamed from: com.tencent.mars.comm.X509Util$X509TrustManagerJellyBean */
    /* loaded from: classes7.dex */
    public static final class X509TrustManagerJellyBean implements com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.X509TrustManagerImplementation {

        /* renamed from: mTrustManagerExtensions */
        private final android.net.http.X509TrustManagerExtensions f19374xef03ccf6;

        public X509TrustManagerJellyBean(javax.net.ssl.X509TrustManager x509TrustManager) {
            this.f19374xef03ccf6 = new android.net.http.X509TrustManagerExtensions(x509TrustManager);
        }

        @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.X509TrustManagerImplementation
        /* renamed from: checkServerTrusted */
        public java.util.List<java.security.cert.X509Certificate> mo40152x1aca140c(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str, java.lang.String str2) {
            return this.f19374xef03ccf6.checkServerTrusted(x509CertificateArr, str, str2);
        }
    }

    /* renamed from: addTestRootCertificate */
    public static void m40136x520b0602(byte[] bArr) {
        m40140x44063fb6();
        java.security.cert.X509Certificate m40138x54e32a26 = m40138x54e32a26(bArr);
        synchronized (f19360x678c83e) {
            f19364x7670c487.setCertificateEntry("root_cert_" + java.lang.Integer.toString(f19364x7670c487.size()), m40138x54e32a26);
            m40147x7f96d7a0();
        }
    }

    /* renamed from: clearTestRootCertificates */
    public static void m40137xa43e6a5d() {
        m40140x44063fb6();
        synchronized (f19360x678c83e) {
            try {
                f19364x7670c487.load(null);
                m40147x7f96d7a0();
            } catch (java.io.IOException unused) {
            }
        }
    }

    /* renamed from: createCertificateFromBytes */
    public static java.security.cert.X509Certificate m40138x54e32a26(byte[] bArr) {
        m40140x44063fb6();
        return (java.security.cert.X509Certificate) f19357x18688546.generateCertificate(new java.io.ByteArrayInputStream(bArr));
    }

    /* renamed from: createTrustManager */
    private static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.X509TrustManagerImplementation m40139x286a7151(java.security.KeyStore keyStore) {
        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        for (javax.net.ssl.TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
            if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                try {
                    return new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.X509TrustManagerJellyBean((javax.net.ssl.X509TrustManager) trustManager);
                } catch (java.lang.IllegalArgumentException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "Error creating trust manager (" + trustManager.getClass().getName() + "): " + e17);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "Could not find suitable trust manager");
        return null;
    }

    /* renamed from: ensureInitialized */
    private static void m40140x44063fb6() {
        synchronized (f19360x678c83e) {
            m40141x73c43e60();
        }
    }

    /* renamed from: ensureInitializedLocked */
    private static void m40141x73c43e60() {
        if (f19357x18688546 == null) {
            f19357x18688546 = java.security.cert.CertificateFactory.getInstance("X.509");
        }
        if (f19358x228fba3 == null) {
            f19358x228fba3 = m40139x286a7151(null);
        }
        if (!f19359x35f75189) {
            try {
                java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidCAStore");
                f19362xe4024c64 = keyStore;
                try {
                    keyStore.load(null);
                } catch (java.io.IOException unused) {
                }
                f19361x2427b238 = new com.p314xaae8f345.mm.vfs.r6(java.lang.System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
            } catch (java.security.KeyStoreException unused2) {
            }
            f19359x35f75189 = true;
        }
        if (f19363xf3cde4f7 == null) {
            f19363xf3cde4f7 = new java.util.HashSet();
        }
        if (f19364x7670c487 == null) {
            java.security.KeyStore keyStore2 = java.security.KeyStore.getInstance(java.security.KeyStore.getDefaultType());
            f19364x7670c487 = keyStore2;
            try {
                keyStore2.load(null);
            } catch (java.io.IOException unused3) {
            }
        }
        if (f19365xf937627a == null) {
            f19365xf937627a = m40139x286a7151(f19364x7670c487);
        }
        if (f19366x629d3bea == null) {
            f19366x629d3bea = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.TrustStorageListener();
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
                intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
                intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
            } else {
                intentFilter.addAction("android.security.STORAGE_CHANGED");
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(f19366x629d3bea, intentFilter);
        }
    }

    /* renamed from: getSubjectAlternativeNames */
    private static java.util.List<java.lang.String> m40142x85e1acb1(java.security.cert.X509Certificate x509Certificate) {
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "certificate dn %s cn %s", trim, str);
        if (str.length() > 0) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* renamed from: hashPrincipal */
    private static java.lang.String m40143xfb8d1ec0(javax.security.auth.x500.X500Principal x500Principal) {
        byte[] digest = java.security.MessageDigest.getInstance("MD5").digest(x500Principal.getEncoded());
        char[] cArr = new char[8];
        for (int i17 = 0; i17 < 4; i17++) {
            int i18 = i17 * 2;
            char[] cArr2 = f19350x7a20c6aa;
            byte b17 = digest[3 - i17];
            cArr[i18] = cArr2[(b17 >> 4) & 15];
            cArr[i18 + 1] = cArr2[b17 & 15];
        }
        return new java.lang.String(cArr);
    }

    /* renamed from: isHostMatched */
    private static boolean m40144x56d29ad2(java.util.List<java.lang.String> list, java.lang.String str) {
        if (list.contains(str)) {
            return true;
        }
        int indexOf = str.indexOf(".");
        int lastIndexOf = str.lastIndexOf(".");
        while (indexOf > 0 && indexOf < lastIndexOf) {
            java.lang.String str2 = "*" + str.substring(indexOf);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "try match nhost " + str2);
            if (list.contains(str2)) {
                return true;
            }
            indexOf = str.indexOf(".", indexOf + 1);
        }
        return false;
    }

    /* renamed from: isKnownRoot */
    private static boolean m40145xa2b260bb(java.security.cert.X509Certificate x509Certificate) {
        if (f19362xe4024c64 == null) {
            return false;
        }
        android.util.Pair<javax.security.auth.x500.X500Principal, java.security.PublicKey> pair = new android.util.Pair<>(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (f19363xf3cde4f7.contains(pair)) {
            return true;
        }
        java.lang.String m40143xfb8d1ec0 = m40143xfb8d1ec0(x509Certificate.getSubjectX500Principal());
        int i17 = 0;
        while (true) {
            java.lang.String str = m40143xfb8d1ec0 + '.' + i17;
            com.p314xaae8f345.mm.vfs.r6 r6Var = f19361x2427b238;
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, true);
            com.p314xaae8f345.mm.vfs.z7 z7Var = r6Var == null ? com.p314xaae8f345.mm.vfs.z7.f294809i : r6Var.f294699d;
            if (l17 != null && !l17.isEmpty()) {
                java.lang.String str2 = z7Var.f294812f;
                z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, str2 + '/' + l17, z7Var.f294813g, z7Var.f294814h);
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null);
            if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                return false;
            }
            java.security.cert.Certificate certificate = f19362xe4024c64.getCertificate("system:".concat(str));
            if (certificate != null) {
                if (certificate instanceof java.security.cert.X509Certificate) {
                    java.security.cert.X509Certificate x509Certificate2 = (java.security.cert.X509Certificate) certificate;
                    if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                        f19363xf3cde4f7.add(pair);
                        return true;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "Anchor " + str + " not an X509Certificate: " + certificate.getClass().getName());
                }
            }
            i17++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reloadDefaultTrustManager */
    public static void m40146x20aaacbd() {
        synchronized (f19360x678c83e) {
            f19358x228fba3 = null;
            f19363xf3cde4f7 = null;
            m40141x73c43e60();
        }
    }

    /* renamed from: reloadTestTrustManager */
    private static void m40147x7f96d7a0() {
        f19365xf937627a = m40139x286a7151(f19364x7670c487);
    }

    /* renamed from: verifyKeyUsage */
    public static boolean m40148x3f9c761b(java.security.cert.X509Certificate x509Certificate) {
        java.util.List<java.lang.String> extendedKeyUsage;
        try {
            extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
        } catch (java.lang.NullPointerException unused) {
        }
        if (extendedKeyUsage == null) {
            return true;
        }
        for (java.lang.String str : extendedKeyUsage) {
            if (str.equals(f19354xb583232b) || str.equals(f19351x82e301e7) || str.equals(f19353x4e2f7e96) || str.equals(f19352xfeb31621)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: verifyServerCertificates */
    public static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4546xcbb9aa9 m40149xe12d20f8(byte[][] bArr, java.lang.String str, java.lang.String str2) {
        return m40150xe12d20f8(bArr, str, str2, 0, null);
    }

    /* renamed from: verifyServerCertificates */
    public static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4546xcbb9aa9 m40151xe12d20f8(byte[][] bArr, java.lang.String str, java.lang.String str2, javax.net.ssl.X509TrustManager x509TrustManager) {
        return m40150xe12d20f8(bArr, str, str2, 0, x509TrustManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf A[Catch: CertificateException -> 0x0158, CertificateNotYetValidException -> 0x015e, CertificateExpiredException -> 0x0165, TRY_LEAVE, TryCatch #10 {CertificateExpiredException -> 0x0165, CertificateNotYetValidException -> 0x015e, CertificateException -> 0x0158, blocks: (B:37:0x00b2, B:39:0x00bf), top: B:36:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* renamed from: verifyServerCertificates */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4546xcbb9aa9 m40150xe12d20f8(byte[][] r9, java.lang.String r10, java.lang.String r11, int r12, javax.net.ssl.X509TrustManager r13) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.m40150xe12d20f8(byte[][], java.lang.String, java.lang.String, int, javax.net.ssl.X509TrustManager):com.tencent.mars.comm.AndroidCertVerifyResult");
    }
}
