package di3;

/* loaded from: classes10.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f314211a;

    /* renamed from: b, reason: collision with root package name */
    public long f314212b;

    /* renamed from: c, reason: collision with root package name */
    public long f314213c;

    /* renamed from: d, reason: collision with root package name */
    public long f314214d;

    /* renamed from: e, reason: collision with root package name */
    public long f314215e;

    public c(java.lang.String str) {
        this.f314211a = "default";
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f314212b = android.os.SystemClock.elapsedRealtime();
        this.f314213c = android.os.SystemClock.elapsedRealtime();
        this.f314214d = 0L;
        this.f314215e = 0L;
        this.f314211a = str;
    }

    public void a(long j17) {
        if (this.f314215e == 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f314212b = android.os.SystemClock.elapsedRealtime();
        }
        this.f314214d += j17;
        this.f314215e++;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f314213c = android.os.SystemClock.elapsedRealtime();
    }

    public java.lang.String b() {
        if (this.f314215e == 0) {
            return "";
        }
        double d17 = (this.f314213c - this.f314212b) / 1000.0d;
        if (d17 == 0.0d) {
            d17 = 1.0d;
        }
        return ((this.f314215e * 1.0d) / d17) + "";
    }

    public java.lang.String c() {
        long j17 = this.f314215e;
        if (j17 == 0) {
            return "";
        }
        double d17 = (this.f314213c - this.f314212b) / 1000.0d;
        if (d17 == 0.0d) {
            d17 = 1.0d;
        }
        return java.lang.String.format("CounterUtil %s tag %s count %s passed %.3f perValue %.3f/count counttime %.3f/s valuetime %.3f/s st:%s ed:%s diff%s", "", this.f314211a, java.lang.Long.valueOf(j17), java.lang.Double.valueOf(d17), java.lang.Double.valueOf((this.f314214d * 1.0d) / this.f314215e), java.lang.Double.valueOf((this.f314215e * 1.0d) / d17), java.lang.Double.valueOf((this.f314214d * 1.0d) / d17), java.lang.Long.valueOf(this.f314212b), java.lang.Long.valueOf(this.f314213c), java.lang.Long.valueOf(this.f314213c - this.f314212b));
    }

    public void d() {
        this.f314214d = 0L;
        this.f314215e = 0L;
    }
}
