package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzkb */
/* loaded from: classes13.dex */
final class C2341x394c97 extends javax.net.ssl.SSLSocketFactory {

    /* renamed from: zzari */
    private final javax.net.ssl.SSLSocketFactory f7039x6f02318;

    public C2341x394c97() {
        this(javax.net.ssl.HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private final javax.net.ssl.SSLSocket zza(javax.net.ssl.SSLSocket sSLSocket) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2342x394c98(this, sSLSocket);
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket() {
        return zza((javax.net.ssl.SSLSocket) this.f7039x6f02318.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getDefaultCipherSuites() {
        return this.f7039x6f02318.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getSupportedCipherSuites() {
        return this.f7039x6f02318.getSupportedCipherSuites();
    }

    private C2341x394c97(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        this.f7039x6f02318 = sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String str, int i17) {
        return zza((javax.net.ssl.SSLSocket) this.f7039x6f02318.createSocket(str, i17));
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String str, int i17, java.net.InetAddress inetAddress, int i18) {
        return zza((javax.net.ssl.SSLSocket) this.f7039x6f02318.createSocket(str, i17, inetAddress, i18));
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress inetAddress, int i17) {
        return zza((javax.net.ssl.SSLSocket) this.f7039x6f02318.createSocket(inetAddress, i17));
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress inetAddress, int i17, java.net.InetAddress inetAddress2, int i18) {
        return zza((javax.net.ssl.SSLSocket) this.f7039x6f02318.createSocket(inetAddress, i17, inetAddress2, i18));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.net.Socket createSocket(java.net.Socket socket, java.lang.String str, int i17, boolean z17) {
        return zza((javax.net.ssl.SSLSocket) this.f7039x6f02318.createSocket(socket, str, i17, z17));
    }
}
