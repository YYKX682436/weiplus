package w36;

/* loaded from: classes16.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w36.h f524311d;

    public f(w36.h hVar) {
        this.f524311d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        w36.h hVar = this.f524311d;
        synchronized (hVar) {
            if (hVar.f524334s) {
                return;
            }
            w36.m mVar = hVar.f524324i;
            int i17 = hVar.f524336u ? hVar.f524335t : -1;
            hVar.f524335t++;
            hVar.f524336u = true;
            if (i17 == -1) {
                try {
                    mVar.a(9, x36.o.f533228g);
                    return;
                } catch (java.io.IOException e17) {
                    hVar.c(e17, null);
                    return;
                }
            }
            hVar.c(new java.net.SocketTimeoutException("sent ping but didn't receive pong within " + hVar.f524319d + "ms (after " + (i17 - 1) + " successful ping/pongs)"), null);
        }
    }
}
