package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
final class zzkb extends javax.net.ssl.SSLSocketFactory {
    private final javax.net.ssl.SSLSocketFactory zzari;

    public zzkb() {
        this(javax.net.ssl.HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private final javax.net.ssl.SSLSocket zza(javax.net.ssl.SSLSocket sSLSocket) {
        return new com.google.android.gms.internal.measurement.zzkc(this, sSLSocket);
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket() {
        return zza((javax.net.ssl.SSLSocket) this.zzari.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getDefaultCipherSuites() {
        return this.zzari.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getSupportedCipherSuites() {
        return this.zzari.getSupportedCipherSuites();
    }

    private zzkb(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        this.zzari = sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String str, int i17) {
        return zza((javax.net.ssl.SSLSocket) this.zzari.createSocket(str, i17));
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String str, int i17, java.net.InetAddress inetAddress, int i18) {
        return zza((javax.net.ssl.SSLSocket) this.zzari.createSocket(str, i17, inetAddress, i18));
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress inetAddress, int i17) {
        return zza((javax.net.ssl.SSLSocket) this.zzari.createSocket(inetAddress, i17));
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress inetAddress, int i17, java.net.InetAddress inetAddress2, int i18) {
        return zza((javax.net.ssl.SSLSocket) this.zzari.createSocket(inetAddress, i17, inetAddress2, i18));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.net.Socket createSocket(java.net.Socket socket, java.lang.String str, int i17, boolean z17) {
        return zza((javax.net.ssl.SSLSocket) this.zzari.createSocket(socket, str, i17, z17));
    }
}
