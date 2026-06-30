package t36;

/* loaded from: classes13.dex */
public class a extends t36.e {
    public a(java.lang.Class cls) {
        super(cls, null, null, null, null);
    }

    @Override // t36.e, t36.k
    public void f(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        try {
            if (android.net.ssl.SSLSockets.isSupportedSocket(sSLSocket)) {
                android.net.ssl.SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            javax.net.ssl.SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((java.lang.String[]) ((java.util.ArrayList) t36.k.b(list)).toArray(new java.lang.String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (java.lang.IllegalArgumentException e17) {
            throw new java.io.IOException("Android internal error", e17);
        }
    }

    @Override // t36.e, t36.k
    public java.lang.String i(javax.net.ssl.SSLSocket sSLSocket) {
        java.lang.String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
