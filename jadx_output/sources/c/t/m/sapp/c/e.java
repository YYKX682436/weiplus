package c.t.m.sapp.c;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f36875a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static c.t.m.sapp.c.e f36876b;

    /* renamed from: d, reason: collision with root package name */
    public android.os.HandlerThread f36878d;

    /* renamed from: e, reason: collision with root package name */
    public c.t.m.sapp.c.e.a f36879e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f36880f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f36881g;

    /* renamed from: h, reason: collision with root package name */
    public c.t.m.sapp.c.j f36882h;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f36877c = "DexAsynchHandler";

    /* renamed from: i, reason: collision with root package name */
    public java.text.SimpleDateFormat f36883i = new java.text.SimpleDateFormat("HHmmss");

    /* renamed from: j, reason: collision with root package name */
    public java.text.SimpleDateFormat f36884j = new java.text.SimpleDateFormat("yyyyMMdd-HHmmss");

    /* loaded from: classes13.dex */
    public class a extends android.os.Handler {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.StringBuilder f36885a;

        public a(android.os.Looper looper) {
            super(looper);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(1024);
            this.f36885a = sb6;
            sb6.setLength(0);
        }

        public void a(android.os.Message message) {
            try {
                if (message.what != 10008) {
                    return;
                }
                c.t.m.sapp.c.q.a(c.t.m.sapp.c.e.this.f36881g);
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
        this.f36881g = applicationContext;
        this.f36882h = new c.t.m.sapp.c.j(applicationContext);
    }

    public static c.t.m.sapp.c.e b() {
        return f36876b;
    }

    public void a() {
    }

    public void c() {
        try {
            if (this.f36880f) {
                return;
            }
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("d_thread");
            this.f36878d = handlerThread;
            handlerThread.start();
            c.t.m.sapp.c.e.a aVar = new c.t.m.sapp.c.e.a(this.f36878d.getLooper());
            this.f36879e = aVar;
            this.f36880f = true;
            c.t.m.sapp.c.n.a(aVar, 10008, 1000L);
        } catch (java.lang.Throwable unused) {
            c.t.m.sapp.c.q.a(this.f36881g);
        }
    }

    public void d() {
    }

    public void a(java.lang.String str, java.lang.String str2) {
    }

    public static c.t.m.sapp.c.e a(android.content.Context context) {
        if (f36876b == null) {
            synchronized (c.t.m.sapp.c.e.class) {
                if (f36876b == null) {
                    f36876b = new c.t.m.sapp.c.e(context);
                }
            }
        }
        return f36876b;
    }
}
