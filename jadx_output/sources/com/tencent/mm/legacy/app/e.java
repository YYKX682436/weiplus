package com.tencent.mm.legacy.app;

/* loaded from: classes12.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Application f68495d;

    public e(android.app.Application application) {
        this.f68495d = application;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (com.tencent.mm.legacy.app.g.class) {
            if (!com.tencent.mm.legacy.app.g.c()) {
                synchronized (com.tencent.mm.legacy.app.g.class) {
                    com.tencent.mm.legacy.app.g.f68498c = false;
                    com.tencent.mm.legacy.app.g.b().remove("kLastCallOnStartClientVersion");
                    com.tencent.mars.xlog.Log.w("MicroMsg.AccidentallyQuitMonitor", "[!] Process [%s] was quit accidentally last time, try to report it.", bm5.f1.a());
                    java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.legacy.app.g.f68501f).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.AccidentallyQuitMonitor", "[!] Process [%s] was quit accidentally last time and not handled by any handlers ！！", bm5.f1.a());
                            break;
                        }
                        com.tencent.mm.legacy.app.f fVar = (com.tencent.mm.legacy.app.f) it.next();
                        if (fVar.b()) {
                            fVar.a();
                            break;
                        }
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AccidentallyQuitMonitor", "[+] Process [%s] was quit normally last time, skip report.", bm5.f1.a());
                synchronized (com.tencent.mm.legacy.app.g.class) {
                    com.tencent.mm.legacy.app.g.f68498c = false;
                    com.tencent.mm.legacy.app.g.b().remove("kLastCallOnStartClientVersion");
                    synchronized (com.tencent.mm.legacy.app.g.class) {
                        com.tencent.mm.legacy.app.g.f68499d = false;
                        com.tencent.mm.legacy.app.g.b().remove("kLastCallOnStopClientVersion");
                    }
                }
            }
        }
        this.f68495d.registerActivityLifecycleCallbacks(com.tencent.mm.legacy.app.g.f68502g);
    }
}
