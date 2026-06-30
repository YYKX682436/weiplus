package com.p314xaae8f345.mm.p815xbe0af3c9.app;

/* loaded from: classes12.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Application f150028d;

    public e(android.app.Application application) {
        this.f150028d = application;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (com.p314xaae8f345.mm.p815xbe0af3c9.app.g.class) {
            if (!com.p314xaae8f345.mm.p815xbe0af3c9.app.g.c()) {
                synchronized (com.p314xaae8f345.mm.p815xbe0af3c9.app.g.class) {
                    com.p314xaae8f345.mm.p815xbe0af3c9.app.g.f150031c = false;
                    com.p314xaae8f345.mm.p815xbe0af3c9.app.g.b().remove("kLastCallOnStartClientVersion");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AccidentallyQuitMonitor", "[!] Process [%s] was quit accidentally last time, try to report it.", bm5.f1.a());
                    java.util.Iterator it = ((java.util.ArrayList) com.p314xaae8f345.mm.p815xbe0af3c9.app.g.f150034f).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AccidentallyQuitMonitor", "[!] Process [%s] was quit accidentally last time and not handled by any handlers ！！", bm5.f1.a());
                            break;
                        }
                        com.p314xaae8f345.mm.p815xbe0af3c9.app.f fVar = (com.p314xaae8f345.mm.p815xbe0af3c9.app.f) it.next();
                        if (fVar.b()) {
                            fVar.a();
                            break;
                        }
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccidentallyQuitMonitor", "[+] Process [%s] was quit normally last time, skip report.", bm5.f1.a());
                synchronized (com.p314xaae8f345.mm.p815xbe0af3c9.app.g.class) {
                    com.p314xaae8f345.mm.p815xbe0af3c9.app.g.f150031c = false;
                    com.p314xaae8f345.mm.p815xbe0af3c9.app.g.b().remove("kLastCallOnStartClientVersion");
                    synchronized (com.p314xaae8f345.mm.p815xbe0af3c9.app.g.class) {
                        com.p314xaae8f345.mm.p815xbe0af3c9.app.g.f150032d = false;
                        com.p314xaae8f345.mm.p815xbe0af3c9.app.g.b().remove("kLastCallOnStopClientVersion");
                    }
                }
            }
        }
        this.f150028d.registerActivityLifecycleCallbacks(com.p314xaae8f345.mm.p815xbe0af3c9.app.g.f150035g);
    }
}
