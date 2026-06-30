package xz1;

/* loaded from: classes15.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xz1.k f539719d;

    public j(xz1.k kVar) {
        this.f539719d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DevTools.DevToolsService", "start");
        while (true) {
            xz1.k kVar = this.f539719d;
            if (!kVar.f539724e) {
                kVar.m176178x41012807();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DevTools.DevToolsService", "end");
                return;
            }
            try {
                android.net.LocalSocket accept = ((android.net.LocalServerSocket) ((jz5.n) kVar.f539723d).mo141623x754a37bb()).accept();
                yz1.c cVar = new yz1.c(new java.io.BufferedInputStream(accept.getInputStream(), 1024));
                xz1.k kVar2 = this.f539719d;
                yz1.d dVar = new yz1.d(new java.io.BufferedOutputStream(accept.getOutputStream()));
                java.io.OutputStream outputStream = accept.getOutputStream();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(outputStream, "getOutputStream(...)");
                xz1.d dVar2 = xz1.k.f539720i;
                yz1.h hVar = new yz1.h();
                xz1.d.b(dVar2, hVar, cVar);
                xz1.k.wi(kVar2, accept, dVar, outputStream, hVar, new yz1.i());
            } catch (java.io.IOException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DevTools.DevToolsService", "Could not start server");
                kVar.f539724e = false;
            }
        }
    }
}
