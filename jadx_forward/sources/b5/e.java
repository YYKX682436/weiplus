package b5;

/* loaded from: classes13.dex */
public class e implements b5.b, i5.a {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String f99390r = a5.a0.e("Processor");

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f99392e;

    /* renamed from: f, reason: collision with root package name */
    public final a5.d f99393f;

    /* renamed from: g, reason: collision with root package name */
    public final m5.a f99394g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc f99395h;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f99398n;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f99397m = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f99396i = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f99399o = new java.util.HashSet();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f99400p = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f99391d = null;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Object f99401q = new java.lang.Object();

    public e(android.content.Context context, a5.d dVar, m5.a aVar, p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc abstractC1265x5c5aefcc, java.util.List list) {
        this.f99392e = context;
        this.f99393f = dVar;
        this.f99394g = aVar;
        this.f99395h = abstractC1265x5c5aefcc;
        this.f99398n = list;
    }

    public static boolean b(java.lang.String str, b5.a0 a0Var) {
        boolean z17;
        if (a0Var == null) {
            a5.a0.c().a(f99390r, java.lang.String.format("WorkerWrapper could not be found for %s", str), new java.lang.Throwable[0]);
            return false;
        }
        a0Var.f99384y = true;
        a0Var.i();
        wa.a aVar = a0Var.f99383x;
        if (aVar != null) {
            z17 = aVar.isDone();
            a0Var.f99383x.cancel(true);
        } else {
            z17 = false;
        }
        p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f abstractC1260xfe49ee9f = a0Var.f99371i;
        if (abstractC1260xfe49ee9f == null || z17) {
            a5.a0.c().a(b5.a0.f99365z, java.lang.String.format("WorkSpec %s is already done. Not interrupting.", a0Var.f99370h), new java.lang.Throwable[0]);
        } else {
            abstractC1260xfe49ee9f.g();
        }
        a5.a0.c().a(f99390r, java.lang.String.format("WorkerWrapper interrupted for %s", str), new java.lang.Throwable[0]);
        return true;
    }

    public void a(b5.b bVar) {
        synchronized (this.f99401q) {
            ((java.util.ArrayList) this.f99400p).add(bVar);
        }
    }

    public boolean c(java.lang.String str) {
        boolean z17;
        synchronized (this.f99401q) {
            z17 = ((java.util.HashMap) this.f99397m).containsKey(str) || ((java.util.HashMap) this.f99396i).containsKey(str);
        }
        return z17;
    }

    @Override // b5.b
    public void d(java.lang.String str, boolean z17) {
        synchronized (this.f99401q) {
            ((java.util.HashMap) this.f99397m).remove(str);
            a5.a0.c().a(f99390r, java.lang.String.format("%s %s executed; reschedule = %s", b5.e.class.getSimpleName(), str, java.lang.Boolean.valueOf(z17)), new java.lang.Throwable[0]);
            java.util.Iterator it = ((java.util.ArrayList) this.f99400p).iterator();
            while (it.hasNext()) {
                ((b5.b) it.next()).d(str, z17);
            }
        }
    }

    public void e(java.lang.String str, a5.o oVar) {
        synchronized (this.f99401q) {
            a5.a0.c().d(f99390r, java.lang.String.format("Moving WorkSpec (%s) to the foreground", str), new java.lang.Throwable[0]);
            b5.a0 a0Var = (b5.a0) ((java.util.HashMap) this.f99397m).remove(str);
            if (a0Var != null) {
                if (this.f99391d == null) {
                    android.os.PowerManager.WakeLock a17 = k5.o.a(this.f99392e, "ProcessorForegroundLck");
                    this.f99391d = a17;
                    yj0.a.c(a17, "androidx/work/impl/Processor", "startForeground", "(Ljava/lang/String;Landroidx/work/ForegroundInfo;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                    a17.acquire();
                    yj0.a.f(a17, "androidx/work/impl/Processor", "startForeground", "(Ljava/lang/String;Landroidx/work/ForegroundInfo;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                }
                ((java.util.HashMap) this.f99396i).put(str, a0Var);
                b3.l.m9723x47fd1fb0(this.f99392e, i5.d.c(this.f99392e, str, oVar));
            }
        }
    }

    public boolean f(java.lang.String str, a5.x0 x0Var) {
        synchronized (this.f99401q) {
            if (c(str)) {
                a5.a0.c().a(f99390r, java.lang.String.format("Work %s is already enqueued for processing", str), new java.lang.Throwable[0]);
                return false;
            }
            b5.z zVar = new b5.z(this.f99392e, this.f99393f, this.f99394g, this, this.f99395h, str);
            zVar.f99449g = this.f99398n;
            if (x0Var != null) {
                zVar.f99450h = x0Var;
            }
            b5.a0 a0Var = new b5.a0(zVar);
            l5.m mVar = a0Var.f99382w;
            mVar.mo606x162a7075(new b5.d(this, str, mVar), ((m5.c) this.f99394g).f405005c);
            ((java.util.HashMap) this.f99397m).put(str, a0Var);
            ((m5.c) this.f99394g).f405003a.execute(a0Var);
            a5.a0.c().a(f99390r, java.lang.String.format("%s: processing %s", b5.e.class.getSimpleName(), str), new java.lang.Throwable[0]);
            return true;
        }
    }

    public final void g() {
        synchronized (this.f99401q) {
            if (!(!((java.util.HashMap) this.f99396i).isEmpty())) {
                android.content.Context context = this.f99392e;
                java.lang.String str = i5.d.f369965p;
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.f99392e.startService(intent);
                } catch (java.lang.Throwable th6) {
                    a5.a0.c().b(f99390r, "Unable to stop foreground service", th6);
                }
                android.os.PowerManager.WakeLock wakeLock = this.f99391d;
                if (wakeLock != null) {
                    yj0.a.c(wakeLock, "androidx/work/impl/Processor", "stopForegroundService", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    wakeLock.release();
                    yj0.a.f(wakeLock, "androidx/work/impl/Processor", "stopForegroundService", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    this.f99391d = null;
                }
            }
        }
    }

    public boolean h(java.lang.String str) {
        boolean b17;
        synchronized (this.f99401q) {
            a5.a0.c().a(f99390r, java.lang.String.format("Processor stopping foreground work %s", str), new java.lang.Throwable[0]);
            b17 = b(str, (b5.a0) ((java.util.HashMap) this.f99396i).remove(str));
        }
        return b17;
    }

    public boolean i(java.lang.String str) {
        boolean b17;
        synchronized (this.f99401q) {
            a5.a0.c().a(f99390r, java.lang.String.format("Processor stopping background work %s", str), new java.lang.Throwable[0]);
            b17 = b(str, (b5.a0) ((java.util.HashMap) this.f99397m).remove(str));
        }
        return b17;
    }
}
