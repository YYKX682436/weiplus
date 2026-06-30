package au5;

/* loaded from: classes15.dex */
public class c extends au5.b implements zt5.b {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f95680c;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f95681b;

    public c(java.lang.String str) {
        this.f95681b = "SoterKeyStore";
        this.f95681b = str;
    }

    public static void v() {
        try {
            try {
                try {
                    java.lang.reflect.Method method = java.lang.Class.forName("android.security.keystore.SoterKeyStoreProvider").getMethod("install", new java.lang.Class[0]);
                    method.setAccessible(true);
                    method.invoke(null, new java.lang.Object[0]);
                } catch (java.lang.ClassNotFoundException unused) {
                    zt5.h.c("Soter.SoterCoreBeforeTreble", "soter: no SoterProvider found", new java.lang.Object[0]);
                } catch (java.lang.IllegalAccessException unused2) {
                    zt5.h.c("Soter.SoterCoreBeforeTreble", "soter: cannot access", new java.lang.Object[0]);
                }
            } catch (java.lang.NoSuchMethodException unused3) {
                zt5.h.c("Soter.SoterCoreBeforeTreble", "soter: function not found", new java.lang.Object[0]);
            } catch (java.lang.reflect.InvocationTargetException unused4) {
                zt5.h.c("Soter.SoterCoreBeforeTreble", "soter: InvocationTargetException", new java.lang.Object[0]);
            }
        } finally {
            f95680c = true;
        }
    }

    @Override // au5.b
    public byte[] a(long j17) {
        return new byte[0];
    }

    @Override // au5.b
    public zt5.k b() {
        zt5.h.c("Soter.SoterCoreBeforeTreble", "soter: start generate ask", new java.lang.Object[0]);
        if (m()) {
            try {
                java.security.KeyStore.getInstance(this.f95681b).load(null);
                java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance("RSA", "SoterKeyStore");
                keyPairGenerator.initialize(yt5.c.b(zt5.j.a().f557137a + ".addcounter.auto_signed_when_get_pubkey_attk", 4).c("SHA-256").d("PSS").a());
                long nanoTime = java.lang.System.nanoTime();
                keyPairGenerator.generateKeyPair();
                zt5.h.c("Soter.SoterCoreBeforeTreble", "soter: generate global successfully. cost: %d ms", java.lang.Long.valueOf(((java.lang.System.nanoTime() - nanoTime) / 1000) / 1000));
                zt5.o.b();
                return new zt5.k(0);
            } catch (java.lang.Exception e17) {
                zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: generateAppGlobalSecureKey " + e17.toString(), new java.lang.Object[0]);
                zt5.h.d("Soter.SoterCoreBeforeTreble", e17, "soter: generateAppGlobalSecureKey error");
                zt5.i.b(103, "BeforeTreble: generateAppGlobalSecureKey.", e17);
                return new zt5.k(4, e17.toString());
            } catch (java.lang.OutOfMemoryError e18) {
                zt5.h.d("Soter.SoterCoreBeforeTreble", e18, "soter: out of memory when generate ASK!! maybe no attk inside");
                zt5.o.a();
            }
        } else {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: not support soter", new java.lang.Object[0]);
        }
        return new zt5.k(2);
    }

    @Override // au5.b
    public zt5.k c(java.lang.String str) {
        java.lang.String str2 = this.f95681b;
        if (zt5.l.b(str)) {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: auth key name is null or nil. abort.", new java.lang.Object[0]);
            return new zt5.k(1, "no authKeyName");
        }
        if (m()) {
            try {
                if (!g()) {
                    return new zt5.k(3, "app secure key not exist");
                }
                java.security.KeyStore.getInstance(str2).load(null);
                java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance("RSA", str2);
                try {
                    keyPairGenerator.initialize(yt5.c.b(str + java.lang.String.format(".addcounter.auto_signed_when_get_pubkey(%s).secmsg_and_counter_signed_when_sign", zt5.j.a().f557137a), 4).c("SHA-256").e(true).d("PSS").a());
                    long nanoTime = java.lang.System.nanoTime();
                    keyPairGenerator.generateKeyPair();
                    zt5.h.c("Soter.SoterCoreBeforeTreble", "soter: generate auth successfully, cost: %d ms", java.lang.Long.valueOf(((java.lang.System.nanoTime() - nanoTime) / 1000) / 1000));
                    zt5.o.b();
                    return new zt5.k(0);
                } catch (java.lang.Error e17) {
                    zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: cause error. maybe reflection exception: " + e17.toString(), new java.lang.Object[0]);
                    zt5.i.a(103, "BeforeTreble: generateAuthKey error:" + e17);
                    return new zt5.k(6, e17.toString());
                } catch (java.lang.Exception e18) {
                    zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: cause exception. maybe reflection exception: " + e18.toString(), new java.lang.Object[0]);
                    zt5.i.b(103, "BeforeTreble: generateAuthKey.", e18);
                    return new zt5.k(6, e18.toString());
                }
            } catch (java.lang.Exception e19) {
                zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: generate auth key failed: " + e19.toString(), new java.lang.Object[0]);
                zt5.i.b(103, "BeforeTreble: generateAuthKey.", e19);
                return new zt5.k(6, e19.toString());
            } catch (java.lang.OutOfMemoryError e27) {
                zt5.h.d("Soter.SoterCoreBeforeTreble", e27, "soter: out of memory when generate AuthKey!! maybe no attk inside");
                zt5.o.a();
            } catch (java.lang.Error e28) {
                zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: outside cause error. maybe reflection exception: " + e28.toString(), new java.lang.Object[0]);
                zt5.i.a(103, "BeforeTreble: generateAuthKey outside error:" + e28);
                return new zt5.k(6, e28.toString());
            }
        } else {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: not support soter", new java.lang.Object[0]);
        }
        return new zt5.k(2);
    }

    @Override // au5.b
    public zt5.r d() {
        zt5.h.c("Soter.SoterCoreBeforeTreble", "soter: start get app global secure key pub", new java.lang.Object[0]);
        if (m()) {
            try {
                java.security.KeyStore keyStore = java.security.KeyStore.getInstance(this.f95681b);
                keyStore.load(null);
                try {
                    java.security.Key key = keyStore.getKey(zt5.j.a().f557137a, "from_soter_ui".toCharArray());
                    if (key != null) {
                        zt5.o.b();
                        return au5.b.q(key.getEncoded());
                    }
                    zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: key can not be retrieved", new java.lang.Object[0]);
                    zt5.i.a(103, "BeforeTreble: getAppGlobalSecureKeyModel. keyStore.getKey is null");
                    return null;
                } catch (java.lang.ClassCastException e17) {
                    zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: cast error: " + e17.toString(), new java.lang.Object[0]);
                    zt5.i.b(103, "BeforeTreble: getAppGlobalSecureKeyModel.", e17);
                    return null;
                }
            } catch (java.lang.Exception e18) {
                zt5.h.d("Soter.SoterCoreBeforeTreble", e18, "soter: error when get ask");
                zt5.i.b(103, "BeforeTreble: getAppGlobalSecureKeyModel.", e18);
            } catch (java.lang.OutOfMemoryError e19) {
                zt5.h.d("Soter.SoterCoreBeforeTreble", e19, "soter: out of memory when getting ask!! maybe no attk inside");
                zt5.o.a();
            }
        } else {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: not support soter", new java.lang.Object[0]);
        }
        return null;
    }

    @Override // au5.b
    public java.security.Signature e(java.lang.String str) {
        if (zt5.l.b(str)) {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: auth key name is null or nil. abort.", new java.lang.Object[0]);
            return null;
        }
        if (!m()) {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: not support soter" + this.f95681b, new java.lang.Object[0]);
            return null;
        }
        try {
            zt5.o.b();
            return u(str);
        } catch (java.security.InvalidKeyException e17) {
            e = e17;
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: key invalid. Advice remove the key", new java.lang.Object[0]);
            zt5.i.b(103, "BeforeTreble: getAuthInitAndSign.", e);
            return null;
        } catch (java.security.UnrecoverableEntryException e18) {
            e = e18;
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: key invalid. Advice remove the key", new java.lang.Object[0]);
            zt5.i.b(103, "BeforeTreble: getAuthInitAndSign.", e);
            return null;
        } catch (java.lang.Exception e19) {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: exception when getSignatureResult: " + e19.toString(), new java.lang.Object[0]);
            zt5.h.d("Soter.SoterCoreBeforeTreble", e19, "soter: exception when getSignatureResult");
            zt5.i.b(103, "BeforeTreble: getAuthInitAndSign.", e19);
            return null;
        } catch (java.lang.OutOfMemoryError e27) {
            zt5.h.d("Soter.SoterCoreBeforeTreble", e27, "soter: out of memory when getAuthInitAndSign!! maybe no attk inside");
            zt5.o.a();
            return null;
        }
    }

    @Override // au5.b
    public zt5.r f(java.lang.String str) {
        if (zt5.l.b(str)) {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: auth key name is null or nil. abort.", new java.lang.Object[0]);
            return null;
        }
        boolean m17 = m();
        java.lang.String str2 = this.f95681b;
        if (m17) {
            try {
                java.security.KeyStore keyStore = java.security.KeyStore.getInstance(str2);
                keyStore.load(null);
                try {
                    java.security.Key key = keyStore.getKey(str, "from_soter_ui".toCharArray());
                    zt5.o.b();
                    if (key != null) {
                        return au5.b.q(key.getEncoded());
                    }
                    zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: key can not be retrieved", new java.lang.Object[0]);
                    zt5.i.a(103, "BeforeTreble: getAuthKeyModel. keyStore.getKey is null");
                    return null;
                } catch (java.lang.ClassCastException e17) {
                    zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: cast error: " + e17.toString(), new java.lang.Object[0]);
                    zt5.i.b(103, "BeforeTreble: getAuthKeyModel.", e17);
                    return null;
                }
            } catch (java.lang.Exception e18) {
                zt5.h.d("Soter.SoterCoreBeforeTreble", e18, "soter: error in get auth key model");
                zt5.i.b(103, "BeforeTreble: getAuthKeyModel.", e18);
            } catch (java.lang.OutOfMemoryError e19) {
                zt5.h.d("Soter.SoterCoreBeforeTreble", e19, "soter: out of memory when getAuthKeyModel!! maybe no attk inside");
                zt5.o.a();
            }
        } else {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: not support soter " + str2, new java.lang.Object[0]);
        }
        return null;
    }

    @Override // au5.b
    public boolean g() {
        try {
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance(this.f95681b);
            keyStore.load(null);
            return keyStore.getCertificate(zt5.j.a().f557137a) != null;
        } catch (java.lang.Exception e17) {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: hasAppGlobalSecureKey exception: " + e17.toString(), new java.lang.Object[0]);
            zt5.i.b(103, "BeforeTreble: hasAppGlobalSecureKey.", e17);
            return false;
        }
    }

    @Override // au5.b
    public boolean h(java.lang.String str) {
        if (zt5.l.b(str)) {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: authkey name not correct", new java.lang.Object[0]);
            return false;
        }
        try {
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance(this.f95681b);
            keyStore.load(null);
            return keyStore.getCertificate(str) != null;
        } catch (java.lang.Exception e17) {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: hasAppGlobalSecureKey exception: " + e17.toString(), new java.lang.Object[0]);
            zt5.i.b(103, "BeforeTreble: hasAuthKey.", e17);
            return false;
        }
    }

    @Override // au5.b
    public com.p314xaae8f345.p2939x688c445.p2942x51f5ebc8.C25623x18006e2e i(java.lang.String str, java.lang.String str2) {
        return null;
    }

    @Override // au5.b
    public boolean j(android.content.Context context) {
        v();
        return true;
    }

    @Override // au5.b
    public boolean k() {
        return g() && d() != null;
    }

    @Override // au5.b
    public boolean l(java.lang.String str, boolean z17) {
        zt5.h.c("Soter.SoterCoreBeforeTreble", java.lang.String.format("soter: checking key valid: auth key name: %s, autoDelIfNotValid: %b ", str, java.lang.Boolean.valueOf(z17)), new java.lang.Object[0]);
        if (zt5.l.b(str)) {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: checking key valid: authkey name not correct", new java.lang.Object[0]);
            return false;
        }
        try {
            u(str);
            zt5.h.c("Soter.SoterCoreBeforeTreble", "soter: key valid", new java.lang.Object[0]);
            zt5.o.b();
            return true;
        } catch (java.security.InvalidKeyException | java.security.UnrecoverableEntryException unused) {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: key invalid.", new java.lang.Object[0]);
            if (z17) {
                p(str, false);
            }
            return false;
        } catch (java.lang.Exception e17) {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: occurs other exceptions: %s", e17.toString());
            zt5.h.d("Soter.SoterCoreBeforeTreble", e17, "soter: occurs other exceptions");
            return false;
        } catch (java.lang.OutOfMemoryError e18) {
            zt5.h.d("Soter.SoterCoreBeforeTreble", e18, "soter: out of memory when isAuthKeyValid!! maybe no attk inside");
            zt5.o.a();
            return false;
        }
    }

    @Override // au5.b
    public boolean m() {
        if (!f95680c) {
            v();
        }
        if (zt5.o.f557141a.b()) {
            zt5.h.f("Soter.SoterCoreBeforeTreble", "hy: the device has already triggered OOM. mark as not support", new java.lang.Object[0]);
            return false;
        }
        java.security.Provider[] providers = java.security.Security.getProviders();
        if (providers == null) {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: no provider supported", new java.lang.Object[0]);
            return false;
        }
        for (java.security.Provider provider : providers) {
            java.lang.String name = provider.getName();
            if (name != null && name.startsWith("SoterKeyStore")) {
                zt5.h.c("Soter.SoterCoreBeforeTreble", "soter: found soter provider", new java.lang.Object[0]);
                return true;
            }
        }
        zt5.h.c("Soter.SoterCoreBeforeTreble", "soter: soter provider not found", new java.lang.Object[0]);
        return false;
    }

    @Override // au5.b
    public zt5.k o() {
        zt5.h.c("Soter.SoterCoreBeforeTreble", "soter: start remove app global secure key", new java.lang.Object[0]);
        if (!m()) {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: not support soter", new java.lang.Object[0]);
            return new zt5.k(2);
        }
        try {
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance(this.f95681b);
            keyStore.load(null);
            keyStore.deleteEntry(zt5.j.a().f557137a);
            return new zt5.k(0);
        } catch (java.lang.Exception e17) {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: removeAppGlobalSecureKey " + e17.toString(), new java.lang.Object[0]);
            return new zt5.k(5, e17.toString());
        }
    }

    @Override // au5.b
    public zt5.k p(java.lang.String str, boolean z17) {
        if (zt5.l.b(str)) {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: auth key name is null or nil. abort.", new java.lang.Object[0]);
            return new zt5.k(1, "no authKeyName");
        }
        zt5.h.c("Soter.SoterCoreBeforeTreble", "soter: start remove key: " + str, new java.lang.Object[0]);
        if (!m()) {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: not support soter", new java.lang.Object[0]);
            return new zt5.k(2);
        }
        try {
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance(this.f95681b);
            keyStore.load(null);
            keyStore.deleteEntry(str);
            if (z17) {
                zt5.h.c("Soter.SoterCoreBeforeTreble", "soter: auto delete ask", new java.lang.Object[0]);
                if (g()) {
                    o();
                }
            }
            return new zt5.k(0);
        } catch (java.lang.Exception e17) {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: removeAuthKey " + e17.toString(), new java.lang.Object[0]);
            return new zt5.k(7, e17.toString());
        }
    }

    public java.security.Signature u(java.lang.String str) {
        if (zt5.l.b(str)) {
            zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: auth key name is null or nil. abort.", new java.lang.Object[0]);
            return null;
        }
        java.security.Signature signature = java.security.Signature.getInstance("SHA256withRSA/PSS", "AndroidKeyStoreBCWorkaround");
        java.security.KeyStore keyStore = java.security.KeyStore.getInstance(this.f95681b);
        keyStore.load(null);
        java.security.KeyStore.PrivateKeyEntry privateKeyEntry = (java.security.KeyStore.PrivateKeyEntry) keyStore.getEntry(str, null);
        if (privateKeyEntry != null) {
            signature.initSign(privateKeyEntry.getPrivateKey());
            return signature;
        }
        zt5.h.b("Soter.SoterCoreBeforeTreble", "soter: entry not exists", new java.lang.Object[0]);
        return null;
    }
}
