package au5;

/* loaded from: classes15.dex */
public class a extends au5.c {
    @Override // au5.c, au5.b
    public zt5.k b() {
        zt5.h.c("Soter.CertSoterCore", "soter: start generate ask", new java.lang.Object[0]);
        if (m()) {
            try {
                java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance("RSA", this.f14148b);
                keyPairGenerator.initialize(yt5.c.b(zt5.j.a().f475604a + ".addcounter.auto_signed_when_get_pubkey_attk", 16).c("SHA-256").d("PSS").a());
                long nanoTime = java.lang.System.nanoTime();
                keyPairGenerator.generateKeyPair();
                zt5.h.c("Soter.CertSoterCore", "soter: generate successfully. cost: %d ms", java.lang.Long.valueOf(((java.lang.System.nanoTime() - nanoTime) / 1000) / 1000));
                zt5.o.b();
                return new zt5.k(0);
            } catch (java.lang.Exception e17) {
                zt5.h.b("Soter.CertSoterCore", "soter: generateAppGlobalSecureKey " + e17.toString(), new java.lang.Object[0]);
                zt5.h.d("Soter.CertSoterCore", e17, "soter: generateAppGlobalSecureKey error");
                zt5.i.b(103, "CertSoter: generateAppGlobalSecureKey.", e17);
                return new zt5.k(4, e17.toString());
            } catch (java.lang.OutOfMemoryError e18) {
                zt5.h.d("Soter.CertSoterCore", e18, "soter: out of memory when generate ASK!! maybe no attk inside");
                zt5.o.a();
            }
        } else {
            zt5.h.b("Soter.CertSoterCore", "soter: not support soter", new java.lang.Object[0]);
        }
        return new zt5.k(2);
    }

    @Override // au5.c, au5.b
    public zt5.r d() {
        zt5.h.c("Soter.CertSoterCore", "soter: start get app global secure key pub", new java.lang.Object[0]);
        if (m()) {
            try {
                java.security.KeyStore keyStore = java.security.KeyStore.getInstance(this.f14148b);
                keyStore.load(null);
                try {
                    java.security.cert.Certificate[] certificateChain = keyStore.getCertificateChain(zt5.j.a().f475604a);
                    if (certificateChain != null) {
                        zt5.o.b();
                        return new zt5.r(certificateChain);
                    }
                    zt5.h.b("Soter.CertSoterCore", "soter: key can not be retrieved", new java.lang.Object[0]);
                    zt5.i.a(103, "CertSoter: getAppGlobalSecureKeyModel. keyStore.getCertificateChain is null");
                    return null;
                } catch (java.lang.ClassCastException e17) {
                    zt5.h.b("Soter.CertSoterCore", "soter: cast error: " + e17.toString(), new java.lang.Object[0]);
                    zt5.i.b(103, "CertSoter: getAppGlobalSecureKeyModel.", e17);
                    return null;
                }
            } catch (java.lang.Exception e18) {
                zt5.h.d("Soter.CertSoterCore", e18, "soter: error when get ask");
                zt5.i.b(103, "CertSoter: getAppGlobalSecureKeyModel.", e18);
            } catch (java.lang.OutOfMemoryError e19) {
                zt5.h.d("Soter.CertSoterCore", e19, "soter: out of memory when getting ask!! maybe no attk inside");
                zt5.o.a();
            }
        } else {
            zt5.h.b("Soter.CertSoterCore", "soter: not support soter", new java.lang.Object[0]);
        }
        return null;
    }

    @Override // au5.c
    public java.security.Signature u(java.lang.String str) {
        zt5.h.a("Monday", "CertSoterCore initAuthKeySignature", new java.lang.Object[0]);
        if (zt5.l.b(str)) {
            zt5.h.b("Soter.CertSoterCore", "soter: auth key name is null or nil. abort.", new java.lang.Object[0]);
            return null;
        }
        java.security.Signature signature = java.security.Signature.getInstance("SHA256withRSA/PSS");
        java.security.KeyStore keyStore = java.security.KeyStore.getInstance(this.f14148b);
        keyStore.load(null);
        java.security.Key key = keyStore.getKey(str, null);
        if (key != null) {
            signature.initSign((java.security.PrivateKey) key);
            return signature;
        }
        zt5.h.b("Soter.CertSoterCore", "soter: entry not exists", new java.lang.Object[0]);
        return null;
    }
}
