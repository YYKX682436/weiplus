package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzkc extends javax.net.ssl.SSLSocket {
    private final javax.net.ssl.SSLSocket zzarj;

    public zzkc(com.google.android.gms.internal.measurement.zzkb zzkbVar, javax.net.ssl.SSLSocket sSLSocket) {
        this.zzarj = sSLSocket;
    }

    @Override // javax.net.ssl.SSLSocket
    public final void addHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener handshakeCompletedListener) {
        this.zzarj.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public final void bind(java.net.SocketAddress socketAddress) {
        this.zzarj.bind(socketAddress);
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.zzarj.close();
    }

    @Override // java.net.Socket
    public final void connect(java.net.SocketAddress socketAddress) {
        this.zzarj.connect(socketAddress);
    }

    public final boolean equals(java.lang.Object obj) {
        return this.zzarj.equals(obj);
    }

    @Override // java.net.Socket
    public final java.nio.channels.SocketChannel getChannel() {
        return this.zzarj.getChannel();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getEnableSessionCreation() {
        return this.zzarj.getEnableSessionCreation();
    }

    @Override // javax.net.ssl.SSLSocket
    public final java.lang.String[] getEnabledCipherSuites() {
        return this.zzarj.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final java.lang.String[] getEnabledProtocols() {
        return this.zzarj.getEnabledProtocols();
    }

    @Override // java.net.Socket
    public final java.net.InetAddress getInetAddress() {
        return this.zzarj.getInetAddress();
    }

    @Override // java.net.Socket
    public final java.io.InputStream getInputStream() {
        return this.zzarj.getInputStream();
    }

    @Override // java.net.Socket
    public final boolean getKeepAlive() {
        return this.zzarj.getKeepAlive();
    }

    @Override // java.net.Socket
    public final java.net.InetAddress getLocalAddress() {
        return this.zzarj.getLocalAddress();
    }

    @Override // java.net.Socket
    public final int getLocalPort() {
        return this.zzarj.getLocalPort();
    }

    @Override // java.net.Socket
    public final java.net.SocketAddress getLocalSocketAddress() {
        return this.zzarj.getLocalSocketAddress();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getNeedClientAuth() {
        return this.zzarj.getNeedClientAuth();
    }

    @Override // java.net.Socket
    public final boolean getOOBInline() {
        return this.zzarj.getOOBInline();
    }

    @Override // java.net.Socket
    public final java.io.OutputStream getOutputStream() {
        return this.zzarj.getOutputStream();
    }

    @Override // java.net.Socket
    public final int getPort() {
        return this.zzarj.getPort();
    }

    @Override // java.net.Socket
    public final synchronized int getReceiveBufferSize() {
        return this.zzarj.getReceiveBufferSize();
    }

    @Override // java.net.Socket
    public final java.net.SocketAddress getRemoteSocketAddress() {
        return this.zzarj.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getReuseAddress() {
        return this.zzarj.getReuseAddress();
    }

    @Override // java.net.Socket
    public final synchronized int getSendBufferSize() {
        return this.zzarj.getSendBufferSize();
    }

    @Override // javax.net.ssl.SSLSocket
    public final javax.net.ssl.SSLSession getSession() {
        return this.zzarj.getSession();
    }

    @Override // java.net.Socket
    public final int getSoLinger() {
        return this.zzarj.getSoLinger();
    }

    @Override // java.net.Socket
    public final synchronized int getSoTimeout() {
        return this.zzarj.getSoTimeout();
    }

    @Override // javax.net.ssl.SSLSocket
    public final java.lang.String[] getSupportedCipherSuites() {
        return this.zzarj.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final java.lang.String[] getSupportedProtocols() {
        return this.zzarj.getSupportedProtocols();
    }

    @Override // java.net.Socket
    public final boolean getTcpNoDelay() {
        return this.zzarj.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public final int getTrafficClass() {
        return this.zzarj.getTrafficClass();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getUseClientMode() {
        return this.zzarj.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getWantClientAuth() {
        return this.zzarj.getWantClientAuth();
    }

    @Override // java.net.Socket
    public final boolean isBound() {
        return this.zzarj.isBound();
    }

    @Override // java.net.Socket
    public final boolean isClosed() {
        return this.zzarj.isClosed();
    }

    @Override // java.net.Socket
    public final boolean isConnected() {
        return this.zzarj.isConnected();
    }

    @Override // java.net.Socket
    public final boolean isInputShutdown() {
        return this.zzarj.isInputShutdown();
    }

    @Override // java.net.Socket
    public final boolean isOutputShutdown() {
        return this.zzarj.isOutputShutdown();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void removeHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener handshakeCompletedListener) {
        this.zzarj.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public final void sendUrgentData(int i17) {
        this.zzarj.sendUrgentData(i17);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnableSessionCreation(boolean z17) {
        this.zzarj.setEnableSessionCreation(z17);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledCipherSuites(java.lang.String[] strArr) {
        this.zzarj.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledProtocols(java.lang.String[] strArr) {
        if (strArr != null && java.util.Arrays.asList(strArr).contains("SSLv3")) {
            java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(this.zzarj.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        }
        this.zzarj.setEnabledProtocols(strArr);
    }

    @Override // java.net.Socket
    public final void setKeepAlive(boolean z17) {
        this.zzarj.setKeepAlive(z17);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setNeedClientAuth(boolean z17) {
        this.zzarj.setNeedClientAuth(z17);
    }

    @Override // java.net.Socket
    public final void setOOBInline(boolean z17) {
        this.zzarj.setOOBInline(z17);
    }

    @Override // java.net.Socket
    public final void setPerformancePreferences(int i17, int i18, int i19) {
        this.zzarj.setPerformancePreferences(i17, i18, i19);
    }

    @Override // java.net.Socket
    public final synchronized void setReceiveBufferSize(int i17) {
        this.zzarj.setReceiveBufferSize(i17);
    }

    @Override // java.net.Socket
    public final void setReuseAddress(boolean z17) {
        this.zzarj.setReuseAddress(z17);
    }

    @Override // java.net.Socket
    public final synchronized void setSendBufferSize(int i17) {
        this.zzarj.setSendBufferSize(i17);
    }

    @Override // java.net.Socket
    public final void setSoLinger(boolean z17, int i17) {
        this.zzarj.setSoLinger(z17, i17);
    }

    @Override // java.net.Socket
    public final synchronized void setSoTimeout(int i17) {
        this.zzarj.setSoTimeout(i17);
    }

    @Override // java.net.Socket
    public final void setTcpNoDelay(boolean z17) {
        this.zzarj.setTcpNoDelay(z17);
    }

    @Override // java.net.Socket
    public final void setTrafficClass(int i17) {
        this.zzarj.setTrafficClass(i17);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setUseClientMode(boolean z17) {
        this.zzarj.setUseClientMode(z17);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setWantClientAuth(boolean z17) {
        this.zzarj.setWantClientAuth(z17);
    }

    @Override // java.net.Socket
    public final void shutdownInput() {
        this.zzarj.shutdownInput();
    }

    @Override // java.net.Socket
    public final void shutdownOutput() {
        this.zzarj.shutdownOutput();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void startHandshake() {
        this.zzarj.startHandshake();
    }

    @Override // javax.net.ssl.SSLSocket, java.net.Socket
    public final java.lang.String toString() {
        return this.zzarj.toString();
    }

    @Override // java.net.Socket
    public final void connect(java.net.SocketAddress socketAddress, int i17) {
        this.zzarj.connect(socketAddress, i17);
    }
}
