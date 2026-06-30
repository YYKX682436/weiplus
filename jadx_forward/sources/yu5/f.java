package yu5;

/* loaded from: classes12.dex */
public final class f implements yu5.a {

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f547452f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f547453g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f547454h;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f547450d = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(yu5.f.class), "stubExecutor", "getStubExecutor()Ljava/util/concurrent/ScheduledExecutorService;")), p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(yu5.f.class), "stubHandlerThreads", "getStubHandlerThreads()Ljava/util/List;"))};

    /* renamed from: i, reason: collision with root package name */
    public static final yu5.f f547455i = new yu5.f();

    /* renamed from: e, reason: collision with root package name */
    public static final android.os.Handler f547451e = new android.os.Handler(android.os.Looper.getMainLooper());

    static {
        jz5.i iVar = jz5.i.f384362d;
        f547452f = jz5.h.a(iVar, yu5.d.f547448d);
        f547453g = jz5.h.a(iVar, yu5.e.f547449d);
        f547454h = new java.util.LinkedHashMap();
    }

    @Override // yu5.a
    public java.util.concurrent.Future a(java.lang.Runnable runnable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(runnable, "runnable");
        return mo177691xb158f775(runnable);
    }

    @Override // yu5.a
    public java.util.concurrent.Future b(java.lang.Runnable runnable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(runnable, "runnable");
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(runnable, null);
        f547451e.post(futureTask);
        return new yu5.i(futureTask);
    }

    @Override // yu5.a
    public java.util.concurrent.Future d(java.lang.Runnable runnable, java.lang.String str) {
        android.os.Handler handler;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(runnable, "runnable");
        if (str == null) {
            return mo177691xb158f775(runnable);
        }
        yu5.f fVar = f547455i;
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(runnable, null);
        fVar.getClass();
        java.util.Map map = f547454h;
        synchronized (map) {
            handler = (android.os.Handler) ((java.util.LinkedHashMap) map).get(str);
            if (handler == null) {
                jz5.g gVar = f547453g;
                f06.v vVar = f547450d[1];
                java.util.List list = (java.util.List) gVar.mo141623x754a37bb();
                int hashCode = str.hashCode();
                if (hashCode < 0) {
                    hashCode *= -1;
                }
                android.os.HandlerThread handlerThread = (android.os.HandlerThread) list.get(hashCode % 50);
                if (!handlerThread.isAlive()) {
                    handlerThread.start();
                    handlerThread.getName();
                }
                android.os.Handler handler2 = new android.os.Handler(handlerThread.getLooper());
                handlerThread.getName();
                map.put(str, handler2);
                handler = handler2;
            }
        }
        handler.postDelayed(futureTask, 0L);
        return futureTask;
    }

    @Override // yu5.a
    public java.util.concurrent.Future e(java.lang.Runnable runnable, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(runnable, "runnable");
        jz5.g gVar = f547452f;
        f06.v vVar = f547450d[0];
        java.util.concurrent.ScheduledFuture<?> schedule = ((java.util.concurrent.ScheduledExecutorService) gVar.mo141623x754a37bb()).schedule(runnable, j17, java.util.concurrent.TimeUnit.MILLISECONDS);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.c(schedule, "stubExecutor.schedule(ru…s, TimeUnit.MILLISECONDS)");
        return schedule;
    }

    @Override // yu5.a
    /* renamed from: execute */
    public java.util.concurrent.Future mo177691xb158f775(java.lang.Runnable runnable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(runnable, "runnable");
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(runnable, null);
        jz5.g gVar = f547452f;
        f06.v vVar = f547450d[0];
        ((java.util.concurrent.ScheduledExecutorService) gVar.mo141623x754a37bb()).execute(futureTask);
        return futureTask;
    }
}
