package zr0;

/* loaded from: classes10.dex */
public abstract class c implements nr0.c {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f556643d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f556644e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.HandlerThread f556645f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f556646g;

    /* renamed from: h, reason: collision with root package name */
    public rs0.h f556647h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f556648i;

    public c(boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        this.f556643d = z17;
        this.f556644e = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f556648i = new java.lang.Object();
        if (z17) {
            int i18 = pu5.i.f440006b;
            android.os.HandlerThread a17 = pu5.f.a("Heavy-GLThread", -2);
            a17.start();
            this.f556646g = p3325xe03a0797.p3326xc267989b.z0.a(t26.e.b(new android.os.Handler(a17.getLooper()), null, 1, null));
            this.f556645f = a17;
        }
    }

    public final void b() {
        synchronized (this.f556648i) {
            java.util.List todoList = this.f556644e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(todoList, "todoList");
            if (!todoList.isEmpty()) {
                java.util.List todoList2 = this.f556644e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(todoList2, "todoList");
                java.util.Iterator it = todoList2.iterator();
                while (it.hasNext()) {
                    ((java.lang.Runnable) it.next()).run();
                }
                this.f556644e.clear();
            }
        }
    }

    public final p3325xe03a0797.p3326xc267989b.r2 c(boolean z17, java.lang.Runnable runnable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runnable, "runnable");
        if (this.f556646g != null) {
            android.os.HandlerThread handlerThread = this.f556645f;
            boolean z18 = false;
            if (handlerThread != null && handlerThread.isAlive()) {
                z18 = true;
            }
            if (z18) {
                p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f556646g;
                if (y0Var != null) {
                    return p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new zr0.b(this, z17, runnable, null), 3, null);
                }
                return null;
            }
        }
        synchronized (this.f556648i) {
            this.f556644e.add(runnable);
        }
        return null;
    }
}
