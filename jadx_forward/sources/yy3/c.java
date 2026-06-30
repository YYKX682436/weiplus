package yy3;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: l, reason: collision with root package name */
    public static final yy3.c f549981l = new yy3.c();

    /* renamed from: m, reason: collision with root package name */
    public static final float f549982m = 1.15f;

    /* renamed from: e, reason: collision with root package name */
    public long f549987e;

    /* renamed from: f, reason: collision with root package name */
    public yy3.a f549988f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f549989g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f549990h;

    /* renamed from: k, reason: collision with root package name */
    public int f549993k;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f549983a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f549984b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f549985c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f549986d = java.util.concurrent.Executors.newSingleThreadExecutor();

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Rect f549991i = new android.graphics.Rect();

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Rect f549992j = new android.graphics.Rect();

    public static void a(yy3.c cVar) {
        if (!((java.util.HashMap) cVar.f549983a).isEmpty()) {
            long j17 = cVar.f549987e;
            if (j17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankCardDetectQueue", "%d decode hit cache", java.lang.Long.valueOf(j17));
                s75.d.b(new yy3.b(cVar, cVar.f549987e), "BankCardDetectQueue_detect_task");
                return;
            }
        }
        yy3.a aVar = cVar.f549988f;
        if (aVar != null) {
            long j18 = cVar.f549987e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 c17345xe981d116 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.i) aVar).f241474a;
            if (j18 == c17345xe981d116.f241422q) {
                c17345xe981d116.k(0L);
            }
        }
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankCardDetectQueue", "release");
        long j17 = this.f549987e;
        synchronized (this.f549984b) {
            if (this.f549987e == j17) {
                this.f549987e = 0L;
                this.f549993k = 0;
                this.f549988f = null;
                ((java.util.HashMap) this.f549983a).clear();
            }
        }
        synchronized (this.f549985c) {
            if (this.f549989g) {
                boolean z17 = et5.h.f338209a;
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.c.f298507b.e();
            }
            this.f549989g = false;
        }
    }
}
