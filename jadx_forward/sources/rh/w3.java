package rh;

/* loaded from: classes12.dex */
public class w3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f477072a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f477073b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f477074c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f477075d;

    /* renamed from: f, reason: collision with root package name */
    public long f477077f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final long f477076e = android.os.SystemClock.uptimeMillis();

    public w3(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        this.f477072a = i17;
        this.f477073b = str;
        this.f477074c = str2;
        this.f477075d = str3;
    }

    public long a() {
        long j17 = this.f477077f;
        long j18 = this.f477076e;
        if (!(j17 >= j18)) {
            j17 = android.os.SystemClock.uptimeMillis();
        }
        long j19 = j17 - j18;
        if (j19 > 0) {
            return j19;
        }
        return 0L;
    }

    /* renamed from: toString */
    public java.lang.String m162377x9616526c() {
        return "WakeLockRecord{flags=" + this.f477072a + ", tag='" + this.f477073b + "', packageName='" + this.f477074c + "', stack='" + this.f477075d + "', timeBgn=" + this.f477076e + ", timeEnd=" + this.f477077f + '}';
    }
}
