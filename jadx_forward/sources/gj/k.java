package gj;

/* loaded from: classes12.dex */
public class k implements android.os.MessageQueue.IdleHandler {

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.Map f353886p;

    /* renamed from: q, reason: collision with root package name */
    public static final gj.k f353887q;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f353888r;

    /* renamed from: m, reason: collision with root package name */
    public gj.i f353895m;

    /* renamed from: n, reason: collision with root package name */
    public android.os.Looper f353896n;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Queue f353889d = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Queue f353890e = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f353891f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f353892g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f353893h = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f353894i = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public long f353897o = 0;

    static {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        f353886p = concurrentHashMap;
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        gj.k kVar = (gj.k) concurrentHashMap.get(mainLooper);
        if (kVar == null) {
            kVar = new gj.k(mainLooper);
            concurrentHashMap.put(mainLooper, kVar);
        }
        f353887q = kVar;
        new android.os.Handler(oj.g.c("historyMsgHandlerThread", 5).getLooper());
        f353888r = false;
    }

    public k(android.os.Looper looper) {
        java.util.Objects.requireNonNull(looper);
        this.f353896n = looper;
        c();
        synchronized (this) {
            looper.getQueue().addIdleHandler(this);
        }
    }

    public static void d(jj.d dVar) {
        gj.k kVar = f353887q;
        synchronized (kVar.f353894i) {
            ((java.util.HashMap) kVar.f353894i).remove(dVar);
        }
    }

    public void a() {
        ((java.util.concurrent.ConcurrentLinkedQueue) this.f353890e).clear();
        this.f353892g = 0L;
    }

    public synchronized void b() {
        if (this.f353895m != null) {
            synchronized (this.f353893h) {
                this.f353893h.clear();
            }
            synchronized (this.f353894i) {
                ((java.util.HashMap) this.f353894i).clear();
            }
            oj.j.e("Matrix.LooperMonitor", "[onRelease] %s, origin printer:%s", this.f353896n.getThread().getName(), this.f353895m.f353880d);
            android.os.Looper looper = this.f353896n;
            synchronized (this) {
                looper.getQueue().removeIdleHandler(this);
                this.f353896n.setMessageLogging(this.f353895m.f353880d);
                this.f353896n = null;
                this.f353895m = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[Catch: all -> 0x0071, TryCatch #1 {, blocks: (B:5:0x0006, B:7:0x000a, B:9:0x001a, B:17:0x0026, B:19:0x003e, B:27:0x0075, B:29:0x007a, B:30:0x0096, B:32:0x00a4, B:25:0x0073), top: B:4:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4 A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0006, B:7:0x000a, B:9:0x001a, B:17:0x0026, B:19:0x003e, B:27:0x0075, B:29:0x007a, B:30:0x0096, B:32:0x00a4, B:25:0x0073), top: B:4:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c() {
        /*
            r8 = this;
            java.lang.String r0 = "LooperPrinter might be loaded by different classloader, my = "
            monitor-enter(r8)
            r1 = 0
            r2 = 1
            r3 = 0
            boolean r4 = gj.k.f353888r     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            if (r4 != 0) goto L75
            android.os.Looper r4 = r8.f353896n     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            java.lang.String r5 = "mLogging"
            android.os.Looper r6 = r8.f353896n     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            java.lang.Object r4 = oj.c0.a(r4, r5, r6)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            android.util.Printer r4 = (android.util.Printer) r4     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            gj.i r3 = r8.f353895m     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L71
            if (r4 != r3) goto L22
            if (r3 == 0) goto L22
            monitor-exit(r8)
            return
        L22:
            if (r4 == 0) goto L6d
            if (r3 == 0) goto L6d
            java.lang.Class r3 = r4.getClass()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L71
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L71
            gj.i r5 = r8.f353895m     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L71
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L71
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L71
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L71
            if (r3 == 0) goto L6d
            java.lang.String r3 = "Matrix.LooperMonitor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L71
            gj.i r0 = r8.f353895m     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L71
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L71
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L71
            r5.append(r0)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L71
            java.lang.String r0 = ", other = "
            r5.append(r0)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L71
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L71
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L71
            r5.append(r0)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L71
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L71
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L71
            oj.j.f(r3, r0, r5)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L71
            monitor-exit(r8)
            return
        L6d:
            r3 = r4
            goto L75
        L6f:
            r3 = r4
            goto L73
        L71:
            r0 = move-exception
            goto Lbe
        L73:
            gj.k.f353888r = r2     // Catch: java.lang.Throwable -> L71
        L75:
            gj.i r0 = r8.f353895m     // Catch: java.lang.Throwable -> L71
            r4 = 2
            if (r0 == 0) goto L96
            java.lang.String r0 = "Matrix.LooperMonitor"
            java.lang.String r5 = "maybe thread:%s printer[%s] was replace other[%s]!"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L71
            android.os.Looper r7 = r8.f353896n     // Catch: java.lang.Throwable -> L71
            java.lang.Thread r7 = r7.getThread()     // Catch: java.lang.Throwable -> L71
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L71
            r6[r1] = r7     // Catch: java.lang.Throwable -> L71
            gj.i r7 = r8.f353895m     // Catch: java.lang.Throwable -> L71
            r6[r2] = r7     // Catch: java.lang.Throwable -> L71
            r6[r4] = r3     // Catch: java.lang.Throwable -> L71
            oj.j.f(r0, r5, r6)     // Catch: java.lang.Throwable -> L71
        L96:
            android.os.Looper r0 = r8.f353896n     // Catch: java.lang.Throwable -> L71
            gj.i r5 = new gj.i     // Catch: java.lang.Throwable -> L71
            r5.<init>(r8, r3)     // Catch: java.lang.Throwable -> L71
            r8.f353895m = r5     // Catch: java.lang.Throwable -> L71
            r0.setMessageLogging(r5)     // Catch: java.lang.Throwable -> L71
            if (r3 == 0) goto Lbc
            java.lang.String r0 = "Matrix.LooperMonitor"
            java.lang.String r5 = "reset printer, originPrinter[%s] in %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L71
            r4[r1] = r3     // Catch: java.lang.Throwable -> L71
            android.os.Looper r1 = r8.f353896n     // Catch: java.lang.Throwable -> L71
            java.lang.Thread r1 = r1.getThread()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r4[r2] = r1     // Catch: java.lang.Throwable -> L71
            oj.j.c(r0, r5, r4)     // Catch: java.lang.Throwable -> L71
        Lbc:
            monitor-exit(r8)
            return
        Lbe:
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gj.k.c():void");
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        if (android.os.SystemClock.uptimeMillis() - this.f353897o < 60000) {
            return true;
        }
        c();
        this.f353897o = android.os.SystemClock.uptimeMillis();
        return true;
    }
}
