package ve1;

/* loaded from: classes13.dex */
public class j implements javax.net.ssl.X509TrustManager {
    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) {
        ve1.g.p(3, "SSLUtil", "checkClientTrusted", null);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) {
        if (qe1.a.a().f443550b) {
            int i17 = 0;
            while (i17 < x509CertificateArr.length) {
                java.security.cert.X509Certificate x509Certificate = x509CertificateArr[i17];
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" Server certificate ");
                i17++;
                sb6.append(i17);
                sb6.append(":");
                ve1.g.p(3, "SSLUtil", sb6.toString(), null);
                ve1.g.p(3, "SSLUtil", "  Subject DN: " + x509Certificate.getSubjectX500Principal(), null);
                ve1.g.p(3, "SSLUtil", "  Issuer DN: " + x509Certificate.getIssuerX500Principal(), null);
                ve1.g.p(3, "SSLUtil", "  Signature Algorithm: " + x509Certificate.getSigAlgName(), null);
                ve1.g.p(3, "SSLUtil", "  Valid from: " + x509Certificate.getNotBefore(), null);
                ve1.g.p(3, "SSLUtil", "  Valid until: " + x509Certificate.getNotAfter(), null);
                ve1.g.p(3, "SSLUtil", "  Serial #: " + x509Certificate.getSerialNumber().toString(16), null);
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}
