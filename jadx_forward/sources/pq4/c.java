package pq4;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f439213a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f439214b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.HandlerThread f439215c;

    /* renamed from: d, reason: collision with root package name */
    public rs0.h f439216d;

    public c(java.lang.String usage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usage, "usage");
        this.f439213a = usage;
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("voip{" + usage + '}', 10);
        this.f439215c = a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipThread", "init voip render thread " + usage);
        a17.start();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17.getLooper());
        this.f439214b = n3Var;
        n3Var.m77789xc5a5549d(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipThread", "start: " + a17.getName());
    }

    public final boolean a() {
        android.os.Message m77781x1d1b2a3e;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f439214b;
        if (((n3Var == null || (m77781x1d1b2a3e = n3Var.m77781x1d1b2a3e()) == null) ? null : m77781x1d1b2a3e.getCallback()) == null) {
            return false;
        }
        java.lang.StackTraceElement[] stackTrace = this.f439215c.getStackTrace();
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stackTrace);
        for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
            stringWriter.write(stackTraceElement.toString());
            stringWriter.write("\n");
        }
        stringWriter.flush();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipThread", "voip{" + this.f439213a + "} current run " + stringWriter);
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(null);
        }
        return true;
    }

    public final void b(java.lang.Runnable callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f439214b;
        if (n3Var != null) {
            n3Var.mo50293x3498a0(callback);
        }
    }

    public final void c(final yz5.a callback) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.os.Looper myLooper = android.os.Looper.myLooper();
        android.os.HandlerThread handlerThread = this.f439215c;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(myLooper, handlerThread.getLooper())) {
            callback.mo152xb9724478();
        } else {
            if (!handlerThread.isAlive() || (n3Var = this.f439214b) == null) {
                return;
            }
            n3Var.mo50293x3498a0(new java.lang.Runnable(callback) { // from class: pq4.b

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f439212d;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "function");
                    this.f439212d = callback;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f439212d.mo152xb9724478();
                }
            });
        }
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipThread", "release voip render thread " + this.f439213a);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f439214b;
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(null);
        }
        c(new pq4.a(this));
    }
}
