package com.tencent.matrix.backtrace;

/* loaded from: classes13.dex */
public class WarmUpService extends android.app.Service {

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f52540f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f52541g;

    /* renamed from: h, reason: collision with root package name */
    public static android.os.HandlerThread f52542h;

    /* renamed from: i, reason: collision with root package name */
    public static android.os.Handler f52543i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f52544m = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f52545n = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Messenger f52546d = new android.os.Messenger(new jh.u(this, oj.g.b().getLooper()));

    /* renamed from: e, reason: collision with root package name */
    public final jh.m f52547e = new jh.m();

    public static void a(boolean z17) {
        oj.j.c("Matrix.WarmUpService", "Schedule suicide", new java.lang.Object[0]);
        synchronized (f52545n) {
            if (z17) {
                f52543i.sendEmptyMessageDelayed(1, 60000L);
            } else if (f52544m.decrementAndGet() == 0) {
                f52543i.sendEmptyMessageDelayed(1, 60000L);
            }
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        if (!f52541g) {
            synchronized (com.tencent.matrix.backtrace.WarmUpService.class) {
                if (!f52541g) {
                    oj.j.c("Matrix.WarmUpService", "Init called.", new java.lang.Object[0]);
                    jh.g0.d();
                    boolean booleanExtra = intent.getBooleanExtra("enable-logger", false);
                    java.lang.String stringExtra = intent.getStringExtra("path-of-xlog-so");
                    oj.j.c("Matrix.WarmUpService", "Enable logger: %s", java.lang.Boolean.valueOf(booleanExtra));
                    oj.j.c("Matrix.WarmUpService", "Path of XLog: %s", stringExtra);
                    com.tencent.matrix.xlog.XLogNative.a(stringExtra);
                    com.tencent.matrix.backtrace.WeChatBacktraceNative.enableLogger(booleanExtra);
                    f52541g = true;
                }
            }
        }
        return this.f52546d.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (f52540f) {
            return;
        }
        synchronized (com.tencent.matrix.backtrace.WarmUpService.class) {
            if (f52540f) {
                return;
            }
            synchronized (f52545n) {
                if (f52542h == null) {
                    android.os.HandlerThread handlerThread = new android.os.HandlerThread("backtrace-recycler");
                    f52542h = handlerThread;
                    handlerThread.start();
                    f52543i = new android.os.Handler(f52542h.getLooper(), new jh.v(null));
                }
            }
            a(true);
            f52540f = true;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        return 2;
    }
}
