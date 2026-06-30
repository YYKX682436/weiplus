package com.p314xaae8f345.p552xbf8d97c1.p553x50bbe4be;

/* renamed from: com.tencent.matrix.backtrace.WarmUpService */
/* loaded from: classes13.dex */
public class ServiceC4622xd0ac7e75 extends android.app.Service {

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f134073f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f134074g;

    /* renamed from: h, reason: collision with root package name */
    public static android.os.HandlerThread f134075h;

    /* renamed from: i, reason: collision with root package name */
    public static android.os.Handler f134076i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f134077m = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f134078n = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Messenger f134079d = new android.os.Messenger(new jh.u(this, oj.g.b().getLooper()));

    /* renamed from: e, reason: collision with root package name */
    public final jh.m f134080e = new jh.m();

    public static void a(boolean z17) {
        oj.j.c("Matrix.WarmUpService", "Schedule suicide", new java.lang.Object[0]);
        synchronized (f134078n) {
            if (z17) {
                f134076i.sendEmptyMessageDelayed(1, 60000L);
            } else if (f134077m.decrementAndGet() == 0) {
                f134076i.sendEmptyMessageDelayed(1, 60000L);
            }
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        if (!f134074g) {
            synchronized (com.p314xaae8f345.p552xbf8d97c1.p553x50bbe4be.ServiceC4622xd0ac7e75.class) {
                if (!f134074g) {
                    oj.j.c("Matrix.WarmUpService", "Init called.", new java.lang.Object[0]);
                    jh.g0.d();
                    boolean booleanExtra = intent.getBooleanExtra("enable-logger", false);
                    java.lang.String stringExtra = intent.getStringExtra("path-of-xlog-so");
                    oj.j.c("Matrix.WarmUpService", "Enable logger: %s", java.lang.Boolean.valueOf(booleanExtra));
                    oj.j.c("Matrix.WarmUpService", "Path of XLog: %s", stringExtra);
                    com.p314xaae8f345.p552xbf8d97c1.p591x382fcc.C4726xdb7b5f03.a(stringExtra);
                    com.p314xaae8f345.p552xbf8d97c1.p553x50bbe4be.C4623x5780ee2f.m40740x8f3298f3(booleanExtra);
                    f134074g = true;
                }
            }
        }
        return this.f134079d.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (f134073f) {
            return;
        }
        synchronized (com.p314xaae8f345.p552xbf8d97c1.p553x50bbe4be.ServiceC4622xd0ac7e75.class) {
            if (f134073f) {
                return;
            }
            synchronized (f134078n) {
                if (f134075h == null) {
                    android.os.HandlerThread handlerThread = new android.os.HandlerThread("backtrace-recycler");
                    f134075h = handlerThread;
                    handlerThread.start();
                    f134076i = new android.os.Handler(f134075h.getLooper(), new jh.v(null));
                }
            }
            a(true);
            f134073f = true;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        return 2;
    }
}
