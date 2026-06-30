package c.t.m.p134x35c0ce.c;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f118408a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static c.t.m.p134x35c0ce.c.e f118409b;

    /* renamed from: d, reason: collision with root package name */
    public android.os.HandlerThread f118411d;

    /* renamed from: e, reason: collision with root package name */
    public c.t.m.sapp.c.e.a f118412e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f118413f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f118414g;

    /* renamed from: h, reason: collision with root package name */
    public c.t.m.p134x35c0ce.c.j f118415h;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f118410c = "DexAsynchHandler";

    /* renamed from: i, reason: collision with root package name */
    public java.text.SimpleDateFormat f118416i = new java.text.SimpleDateFormat("HHmmss");

    /* renamed from: j, reason: collision with root package name */
    public java.text.SimpleDateFormat f118417j = new java.text.SimpleDateFormat("yyyyMMdd-HHmmss");

    /* loaded from: classes13.dex */
    public class a extends android.os.Handler {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.StringBuilder f118418a;

        public a(android.os.Looper looper) {
            super(looper);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(1024);
            this.f118418a = sb6;
            sb6.setLength(0);
        }

        public void a(android.os.Message message) {
            try {
                if (message.what != 10008) {
                    return;
                }
                c.t.m.p134x35c0ce.c.q.a(c.t.m.p134x35c0ce.c.e.this.f118414g);
            } catch (java.lang.Throwable unused) {
            }
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            super.handleMessage(message);
            a(message);
        }
    }

    public e(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f118414g = applicationContext;
        this.f118415h = new c.t.m.p134x35c0ce.c.j(applicationContext);
    }

    public static c.t.m.p134x35c0ce.c.e b() {
        return f118409b;
    }

    public void a() {
    }

    public void c() {
        try {
            if (this.f118413f) {
                return;
            }
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("d_thread");
            this.f118411d = handlerThread;
            handlerThread.start();
            c.t.m.sapp.c.e.a aVar = new c.t.m.sapp.c.e.a(this.f118411d.getLooper());
            this.f118412e = aVar;
            this.f118413f = true;
            c.t.m.p134x35c0ce.c.n.a(aVar, 10008, 1000L);
        } catch (java.lang.Throwable unused) {
            c.t.m.p134x35c0ce.c.q.a(this.f118414g);
        }
    }

    public void d() {
    }

    public void a(java.lang.String str, java.lang.String str2) {
    }

    public static c.t.m.p134x35c0ce.c.e a(android.content.Context context) {
        if (f118409b == null) {
            synchronized (c.t.m.p134x35c0ce.c.e.class) {
                if (f118409b == null) {
                    f118409b = new c.t.m.p134x35c0ce.c.e(context);
                }
            }
        }
        return f118409b;
    }
}
