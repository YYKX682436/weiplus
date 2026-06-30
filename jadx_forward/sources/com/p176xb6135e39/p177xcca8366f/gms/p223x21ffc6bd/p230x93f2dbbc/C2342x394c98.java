package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzkc */
/* loaded from: classes13.dex */
public final class C2342x394c98 extends javax.net.ssl.SSLSocket {

    /* renamed from: zzarj */
    private final javax.net.ssl.SSLSocket f7040x6f02319;

    public C2342x394c98(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2341x394c97 c2341x394c97, javax.net.ssl.SSLSocket sSLSocket) {
        this.f7040x6f02319 = sSLSocket;
    }

    @Override // javax.net.ssl.SSLSocket
    public final void addHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener handshakeCompletedListener) {
        this.f7040x6f02319.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public final void bind(java.net.SocketAddress socketAddress) {
        this.f7040x6f02319.bind(socketAddress);
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f7040x6f02319.close();
    }

    @Override // java.net.Socket
    public final void connect(java.net.SocketAddress socketAddress) {
        this.f7040x6f02319.connect(socketAddress);
    }

    /* renamed from: equals */
    public final boolean m19293xb2c87fbf(java.lang.Object obj) {
        return this.f7040x6f02319.equals(obj);
    }

    @Override // java.net.Socket
    public final java.nio.channels.SocketChannel getChannel() {
        return this.f7040x6f02319.getChannel();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getEnableSessionCreation() {
        return this.f7040x6f02319.getEnableSessionCreation();
    }

    @Override // javax.net.ssl.SSLSocket
    public final java.lang.String[] getEnabledCipherSuites() {
        return this.f7040x6f02319.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final java.lang.String[] getEnabledProtocols() {
        return this.f7040x6f02319.getEnabledProtocols();
    }

    @Override // java.net.Socket
    public final java.net.InetAddress getInetAddress() {
        return this.f7040x6f02319.getInetAddress();
    }

    @Override // java.net.Socket
    public final java.io.InputStream getInputStream() {
        return this.f7040x6f02319.getInputStream();
    }

    @Override // java.net.Socket
    public final boolean getKeepAlive() {
        return this.f7040x6f02319.getKeepAlive();
    }

    @Override // java.net.Socket
    public final java.net.InetAddress getLocalAddress() {
        return this.f7040x6f02319.getLocalAddress();
    }

    @Override // java.net.Socket
    public final int getLocalPort() {
        return this.f7040x6f02319.getLocalPort();
    }

    @Override // java.net.Socket
    public final java.net.SocketAddress getLocalSocketAddress() {
        return this.f7040x6f02319.getLocalSocketAddress();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getNeedClientAuth() {
        return this.f7040x6f02319.getNeedClientAuth();
    }

    @Override // java.net.Socket
    public final boolean getOOBInline() {
        return this.f7040x6f02319.getOOBInline();
    }

    @Override // java.net.Socket
    public final java.io.OutputStream getOutputStream() {
        return this.f7040x6f02319.getOutputStream();
    }

    @Override // java.net.Socket
    public final int getPort() {
        return this.f7040x6f02319.getPort();
    }

    @Override // java.net.Socket
    public final synchronized int getReceiveBufferSize() {
        return this.f7040x6f02319.getReceiveBufferSize();
    }

    @Override // java.net.Socket
    public final java.net.SocketAddress getRemoteSocketAddress() {
        return this.f7040x6f02319.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getReuseAddress() {
        return this.f7040x6f02319.getReuseAddress();
    }

    @Override // java.net.Socket
    public final synchronized int getSendBufferSize() {
        return this.f7040x6f02319.getSendBufferSize();
    }

    @Override // javax.net.ssl.SSLSocket
    public final javax.net.ssl.SSLSession getSession() {
        return this.f7040x6f02319.getSession();
    }

    @Override // java.net.Socket
    public final int getSoLinger() {
        return this.f7040x6f02319.getSoLinger();
    }

    @Override // java.net.Socket
    public final synchronized int getSoTimeout() {
        return this.f7040x6f02319.getSoTimeout();
    }

    @Override // javax.net.ssl.SSLSocket
    public final java.lang.String[] getSupportedCipherSuites() {
        return this.f7040x6f02319.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final java.lang.String[] getSupportedProtocols() {
        return this.f7040x6f02319.getSupportedProtocols();
    }

    @Override // java.net.Socket
    public final boolean getTcpNoDelay() {
        return this.f7040x6f02319.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public final int getTrafficClass() {
        return this.f7040x6f02319.getTrafficClass();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getUseClientMode() {
        return this.f7040x6f02319.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getWantClientAuth() {
        return this.f7040x6f02319.getWantClientAuth();
    }

    @Override // java.net.Socket
    public final boolean isBound() {
        return this.f7040x6f02319.isBound();
    }

    @Override // java.net.Socket
    public final boolean isClosed() {
        return this.f7040x6f02319.isClosed();
    }

    @Override // java.net.Socket
    public final boolean isConnected() {
        return this.f7040x6f02319.isConnected();
    }

    @Override // java.net.Socket
    public final boolean isInputShutdown() {
        return this.f7040x6f02319.isInputShutdown();
    }

    @Override // java.net.Socket
    public final boolean isOutputShutdown() {
        return this.f7040x6f02319.isOutputShutdown();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void removeHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener handshakeCompletedListener) {
        this.f7040x6f02319.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public final void sendUrgentData(int i17) {
        this.f7040x6f02319.sendUrgentData(i17);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnableSessionCreation(boolean z17) {
        this.f7040x6f02319.setEnableSessionCreation(z17);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledCipherSuites(java.lang.String[] strArr) {
        this.f7040x6f02319.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledProtocols(java.lang.String[] strArr) {
        if (strArr != null && java.util.Arrays.asList(strArr).contains("SSLv3")) {
            java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(this.f7040x6f02319.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        }
        this.f7040x6f02319.setEnabledProtocols(strArr);
    }

    @Override // java.net.Socket
    public final void setKeepAlive(boolean z17) {
        this.f7040x6f02319.setKeepAlive(z17);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setNeedClientAuth(boolean z17) {
        this.f7040x6f02319.setNeedClientAuth(z17);
    }

    @Override // java.net.Socket
    public final void setOOBInline(boolean z17) {
        this.f7040x6f02319.setOOBInline(z17);
    }

    @Override // java.net.Socket
    public final void setPerformancePreferences(int i17, int i18, int i19) {
        this.f7040x6f02319.setPerformancePreferences(i17, i18, i19);
    }

    @Override // java.net.Socket
    public final synchronized void setReceiveBufferSize(int i17) {
        this.f7040x6f02319.setReceiveBufferSize(i17);
    }

    @Override // java.net.Socket
    public final void setReuseAddress(boolean z17) {
        this.f7040x6f02319.setReuseAddress(z17);
    }

    @Override // java.net.Socket
    public final synchronized void setSendBufferSize(int i17) {
        this.f7040x6f02319.setSendBufferSize(i17);
    }

    @Override // java.net.Socket
    public final void setSoLinger(boolean z17, int i17) {
        this.f7040x6f02319.setSoLinger(z17, i17);
    }

    @Override // java.net.Socket
    public final synchronized void setSoTimeout(int i17) {
        this.f7040x6f02319.setSoTimeout(i17);
    }

    @Override // java.net.Socket
    public final void setTcpNoDelay(boolean z17) {
        this.f7040x6f02319.setTcpNoDelay(z17);
    }

    @Override // java.net.Socket
    public final void setTrafficClass(int i17) {
        this.f7040x6f02319.setTrafficClass(i17);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setUseClientMode(boolean z17) {
        this.f7040x6f02319.setUseClientMode(z17);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setWantClientAuth(boolean z17) {
        this.f7040x6f02319.setWantClientAuth(z17);
    }

    @Override // java.net.Socket
    public final void shutdownInput() {
        this.f7040x6f02319.shutdownInput();
    }

    @Override // java.net.Socket
    public final void shutdownOutput() {
        this.f7040x6f02319.shutdownOutput();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void startHandshake() {
        this.f7040x6f02319.startHandshake();
    }

    @Override // javax.net.ssl.SSLSocket, java.net.Socket
    public final java.lang.String toString() {
        return this.f7040x6f02319.toString();
    }

    @Override // java.net.Socket
    public final void connect(java.net.SocketAddress socketAddress, int i17) {
        this.f7040x6f02319.connect(socketAddress, i17);
    }
}
