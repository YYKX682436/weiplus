package b5;

/* loaded from: classes13.dex */
public class e implements b5.b, i5.a {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String f17857r = a5.a0.e("Processor");

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f17859e;

    /* renamed from: f, reason: collision with root package name */
    public final a5.d f17860f;

    /* renamed from: g, reason: collision with root package name */
    public final m5.a f17861g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.work.impl.WorkDatabase f17862h;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f17865n;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f17864m = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f17863i = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f17866o = new java.util.HashSet();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f17867p = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f17858d = null;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Object f17868q = new java.lang.Object();

    public e(android.content.Context context, a5.d dVar, m5.a aVar, androidx.work.impl.WorkDatabase workDatabase, java.util.List list) {
        this.f17859e = context;
        this.f17860f = dVar;
        this.f17861g = aVar;
        this.f17862h = workDatabase;
        this.f17865n = list;
    }

    public static boolean b(java.lang.String str, b5.a0 a0Var) {
        boolean z17;
        if (a0Var == null) {
            a5.a0.c().a(f17857r, java.lang.String.format("WorkerWrapper could not be found for %s", str), new java.lang.Throwable[0]);
            return false;
        }
        a0Var.f17851y = true;
        a0Var.i();
        wa.a aVar = a0Var.f17850x;
        if (aVar != null) {
            z17 = aVar.isDone();
            a0Var.f17850x.cancel(true);
        } else {
            z17 = false;
        }
        androidx.work.ListenableWorker listenableWorker = a0Var.f17838i;
        if (listenableWorker == null || z17) {
            a5.a0.c().a(b5.a0.f17832z, java.lang.String.format("WorkSpec %s is already done. Not interrupting.", a0Var.f17837h), new java.lang.Throwable[0]);
        } else {
            listenableWorker.g();
        }
        a5.a0.c().a(f17857r, java.lang.String.format("WorkerWrapper interrupted for %s", str), new java.lang.Throwable[0]);
        return true;
    }

    public void a(b5.b bVar) {
        synchronized (this.f17868q) {
            ((java.util.ArrayList) this.f17867p).add(bVar);
        }
    }

    public boolean c(java.lang.String str) {
        boolean z17;
        synchronized (this.f17868q) {
            z17 = ((java.util.HashMap) this.f17864m).containsKey(str) || ((java.util.HashMap) this.f17863i).containsKey(str);
        }
        return z17;
    }

    @Override // b5.b
    public void d(java.lang.String str, boolean z17) {
        synchronized (this.f17868q) {
            ((java.util.HashMap) this.f17864m).remove(str);
            a5.a0.c().a(f17857r, java.lang.String.format("%s %s executed; reschedule = %s", b5.e.class.getSimpleName(), str, java.lang.Boolean.valueOf(z17)), new java.lang.Throwable[0]);
            java.util.Iterator it = ((java.util.ArrayList) this.f17867p).iterator();
            while (it.hasNext()) {
                ((b5.b) it.next()).d(str, z17);
            }
        }
    }

    public void e(java.lang.String str, a5.o oVar) {
        synchronized (this.f17868q) {
            a5.a0.c().d(f17857r, java.lang.String.format("Moving WorkSpec (%s) to the foreground", str), new java.lang.Throwable[0]);
            b5.a0 a0Var = (b5.a0) ((java.util.HashMap) this.f17864m).remove(str);
            if (a0Var != null) {
                if (this.f17858d == null) {
                    android.os.PowerManager.WakeLock a17 = k5.o.a(this.f17859e, "ProcessorForegroundLck");
                    this.f17858d = a17;
                    yj0.a.c(a17, "androidx/work/impl/Processor", "startForeground", "(Ljava/lang/String;Landroidx/work/ForegroundInfo;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                    a17.acquire();
                    yj0.a.f(a17, "androidx/work/impl/Processor", "startForeground", "(Ljava/lang/String;Landroidx/work/ForegroundInfo;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                }
                ((java.util.HashMap) this.f17863i).put(str, a0Var);
                b3.l.startForegroundService(this.f17859e, i5.d.c(this.f17859e, str, oVar));
            }
        }
    }

    public boolean f(java.lang.String str, a5.x0 x0Var) {
        synchronized (this.f17868q) {
            if (c(str)) {
                a5.a0.c().a(f17857r, java.lang.String.format("Work %s is already enqueued for processing", str), new java.lang.Throwable[0]);
                return false;
            }
            b5.z zVar = new b5.z(this.f17859e, this.f17860f, this.f17861g, this, this.f17862h, str);
            zVar.f17916g = this.f17865n;
            if (x0Var != null) {
                zVar.f17917h = x0Var;
            }
            b5.a0 a0Var = new b5.a0(zVar);
            l5.m mVar = a0Var.f17849w;
            mVar.addListener(new b5.d(this, str, mVar), ((m5.c) this.f17861g).f323472c);
            ((java.util.HashMap) this.f17864m).put(str, a0Var);
            ((m5.c) this.f17861g).f323470a.execute(a0Var);
            a5.a0.c().a(f17857r, java.lang.String.format("%s: processing %s", b5.e.class.getSimpleName(), str), new java.lang.Throwable[0]);
            return true;
        }
    }

    public final void g() {
        synchronized (this.f17868q) {
            if (!(!((java.util.HashMap) this.f17863i).isEmpty())) {
                android.content.Context context = this.f17859e;
                java.lang.String str = i5.d.f288432p;
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.foreground.SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.f17859e.startService(intent);
                } catch (java.lang.Throwable th6) {
                    a5.a0.c().b(f17857r, "Unable to stop foreground service", th6);
                }
                android.os.PowerManager.WakeLock wakeLock = this.f17858d;
                if (wakeLock != null) {
                    yj0.a.c(wakeLock, "androidx/work/impl/Processor", "stopForegroundService", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    wakeLock.release();
                    yj0.a.f(wakeLock, "androidx/work/impl/Processor", "stopForegroundService", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    this.f17858d = null;
                }
            }
        }
    }

    public boolean h(java.lang.String str) {
        boolean b17;
        synchronized (this.f17868q) {
            a5.a0.c().a(f17857r, java.lang.String.format("Processor stopping foreground work %s", str), new java.lang.Throwable[0]);
            b17 = b(str, (b5.a0) ((java.util.HashMap) this.f17863i).remove(str));
        }
        return b17;
    }

    public boolean i(java.lang.String str) {
        boolean b17;
        synchronized (this.f17868q) {
            a5.a0.c().a(f17857r, java.lang.String.format("Processor stopping background work %s", str), new java.lang.Throwable[0]);
            b17 = b(str, (b5.a0) ((java.util.HashMap) this.f17864m).remove(str));
        }
        return b17;
    }
}
