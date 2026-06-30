package yy3;

/* loaded from: classes13.dex */
public class f {

    /* renamed from: m, reason: collision with root package name */
    public static final yy3.f f550000m = new yy3.f();

    /* renamed from: e, reason: collision with root package name */
    public long f550005e;

    /* renamed from: f, reason: collision with root package name */
    public yy3.e f550006f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f550007g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f550008h;

    /* renamed from: i, reason: collision with root package name */
    public int f550009i;

    /* renamed from: j, reason: collision with root package name */
    public int f550010j;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f550001a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f550002b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f550003c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f550004d = java.util.concurrent.Executors.newSingleThreadExecutor();

    /* renamed from: k, reason: collision with root package name */
    public android.graphics.Rect f550011k = new android.graphics.Rect();

    /* renamed from: l, reason: collision with root package name */
    public android.graphics.Rect f550012l = new android.graphics.Rect();

    public static void a(yy3.f fVar) {
        if (!((java.util.HashMap) fVar.f550001a).isEmpty()) {
            long j17 = fVar.f550005e;
            if (j17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LicenseCardDecodeQueue", "%d decode hit cache", java.lang.Long.valueOf(j17));
                s75.d.b(new yy3.d(fVar, fVar.f550005e), "BankCardDecodeQueue_decode_task");
                return;
            }
        }
        yy3.e eVar = fVar.f550006f;
        if (eVar != null) {
            long j18 = fVar.f550005e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 c17345xe981d116 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.n) eVar).f241496e;
            if (j18 == c17345xe981d116.f241422q) {
                c17345xe981d116.k(0L);
            }
        }
    }

    public void b(byte[] bArr, android.graphics.Point point, int i17, android.graphics.Rect rect) {
        synchronized (this.f550002b) {
            if (rect.width() != this.f550011k.width() || rect.height() != this.f550011k.height()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LicenseCardDecodeQueue", "release");
                synchronized (this.f550003c) {
                    if (this.f550007g) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1794x9f08251.p1795x633fb29.C16183x46c0b853.m65231xc42a0d69();
                    }
                    this.f550007g = false;
                }
                this.f550007g = false;
            }
        }
        if (!this.f550007g) {
            synchronized (this.f550003c) {
                this.f550011k = rect;
                int width = (((int) (rect.width() * 1.05d)) / 4) * 4;
                int height = (((int) (rect.height() * 1.05d)) / 4) * 4;
                this.f550012l.left = rect.left - ((width - rect.width()) / 2);
                this.f550012l.top = rect.top - ((height - rect.height()) / 2);
                android.graphics.Rect rect2 = this.f550012l;
                rect2.right = rect2.left + width;
                rect2.bottom = rect2.top + height;
                if (i17 % 180 != 0) {
                    int height2 = (point.y - rect2.height()) / 2;
                    int width2 = (point.x - this.f550012l.width()) / 2;
                    if (c()) {
                        width2 = rect.left;
                    }
                    this.f550012l = new android.graphics.Rect(height2, width2, this.f550012l.height() + height2, this.f550012l.width() + width2);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LicenseCardDecodeQueue", "init cropRect %s", this.f550012l);
                int m65229xdd674aee = com.p314xaae8f345.mm.p1006xc5476f33.p1794x9f08251.p1795x633fb29.C16183x46c0b853.m65229xdd674aee(this.f550012l.width(), this.f550012l.height(), this.f550009i);
                this.f550012l.width();
                this.f550012l.height();
                this.f550007g = m65229xdd674aee == 0;
            }
        }
        if (this.f550007g) {
            synchronized (this.f550002b) {
                ((java.util.HashMap) this.f550001a).clear();
                ((java.util.HashMap) this.f550001a).put("param_preview_data", bArr);
                ((java.util.HashMap) this.f550001a).put("param_camera_resolution", point);
                ((java.util.HashMap) this.f550001a).put("param_camera_rotation", java.lang.Integer.valueOf(i17));
                if (!this.f550008h) {
                    long j17 = this.f550005e;
                    if (j17 != 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LicenseCardDecodeQueue", "%d submit decode license card", java.lang.Long.valueOf(j17));
                        this.f550004d.execute(new yy3.d(this, this.f550005e));
                    }
                }
            }
        }
    }

    public final boolean c() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_id_card_scan_v2, 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LicenseCardDecodeQueue", "id_card_scan_v2: %s", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public void d(long j17) {
        synchronized (this.f550002b) {
            if (this.f550005e == j17) {
                this.f550005e = 0L;
                this.f550010j = 0;
                this.f550006f = null;
                ((java.util.HashMap) this.f550001a).clear();
            }
        }
    }
}
