package t36;

/* loaded from: classes13.dex */
public class f extends t36.k {
    public static t36.f n() {
        try {
            java.lang.Class.forName("org.conscrypt.Conscrypt");
            if (org.conscrypt.Conscrypt.isAvailable()) {
                return new t36.f();
            }
            return null;
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // t36.k
    public void e(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        if (org.conscrypt.Conscrypt.isConscrypt(sSLSocketFactory)) {
            org.conscrypt.Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    @Override // t36.k
    public void f(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        if (org.conscrypt.Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                org.conscrypt.Conscrypt.setUseSessionTickets(sSLSocket, true);
                org.conscrypt.Conscrypt.setHostname(sSLSocket, str);
            }
            org.conscrypt.Conscrypt.setApplicationProtocols(sSLSocket, (java.lang.String[]) ((java.util.ArrayList) t36.k.b(list)).toArray(new java.lang.String[0]));
        }
    }

    @Override // t36.k
    public javax.net.ssl.SSLContext h() {
        try {
            return javax.net.ssl.SSLContext.getInstance("TLSv1.3", o());
        } catch (java.security.NoSuchAlgorithmException e17) {
            try {
                return javax.net.ssl.SSLContext.getInstance("TLS", o());
            } catch (java.security.NoSuchAlgorithmException unused) {
                throw new java.lang.IllegalStateException("No TLS provider", e17);
            }
        }
    }

    @Override // t36.k
    public java.lang.String i(javax.net.ssl.SSLSocket sSLSocket) {
        if (org.conscrypt.Conscrypt.isConscrypt(sSLSocket)) {
            return org.conscrypt.Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public final java.security.Provider o() {
        return org.conscrypt.Conscrypt.newProviderBuilder().provideTrustManager().build();
    }
}
