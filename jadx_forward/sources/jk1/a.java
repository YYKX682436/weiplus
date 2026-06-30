package jk1;

/* loaded from: classes7.dex */
public enum a implements jk1.g, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y0 {
    INST;


    /* renamed from: g, reason: collision with root package name */
    public static final jk1.e f381581g = new jk1.e();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f381584e = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final jk1.g f381583d = new jk1.d();

    a() {
    }

    public void a(android.content.Context context) {
        if (this.f381584e.getAndSet(true)) {
            return;
        }
        jk1.d dVar = (jk1.d) this.f381583d;
        synchronized (dVar) {
            dVar.f381589g = null;
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            dVar.f381586d = context;
        }
    }

    public void h() {
        try {
            jk1.d dVar = (jk1.d) this.f381583d;
            synchronized (dVar) {
                android.content.Context context = dVar.f381586d;
                if (context != null) {
                    jk1.c cVar = dVar.f381591i;
                    if (cVar != null) {
                        try {
                            context.unregisterReceiver(cVar);
                        } catch (java.lang.IllegalArgumentException unused) {
                        }
                    }
                    dVar.f381586d = null;
                }
            }
        } finally {
            this.f381584e.set(false);
        }
    }
}
