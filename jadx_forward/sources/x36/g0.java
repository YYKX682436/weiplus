package x36;

/* loaded from: classes16.dex */
public final class g0 extends x36.g {

    /* renamed from: l, reason: collision with root package name */
    public final java.net.Socket f533213l;

    public g0(java.net.Socket socket) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(socket, "socket");
        this.f533213l = socket;
    }

    @Override // x36.g
    public java.io.IOException k(java.io.IOException iOException) {
        java.net.SocketTimeoutException socketTimeoutException = new java.net.SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // x36.g
    public void l() {
        java.net.Socket socket = this.f533213l;
        try {
            socket.close();
        } catch (java.lang.AssertionError e17) {
            if (!x36.v.c(e17)) {
                throw e17;
            }
            x36.w.f533247a.log(java.util.logging.Level.WARNING, "Failed to close timed out socket " + socket, (java.lang.Throwable) e17);
        } catch (java.lang.Exception e18) {
            x36.w.f533247a.log(java.util.logging.Level.WARNING, "Failed to close timed out socket " + socket, (java.lang.Throwable) e18);
        }
    }
}
