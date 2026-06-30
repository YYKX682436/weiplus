package rh;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f476947a;

    /* renamed from: b, reason: collision with root package name */
    public final long f476948b;

    /* renamed from: c, reason: collision with root package name */
    public final long f476949c;

    /* renamed from: d, reason: collision with root package name */
    public final long f476950d;

    /* renamed from: e, reason: collision with root package name */
    public final int f476951e;

    /* renamed from: f, reason: collision with root package name */
    public final long f476952f = java.lang.System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f476953g;

    public i(int i17, long j17, long j18, long j19, int i18, java.lang.String str) {
        this.f476947a = i17;
        this.f476948b = j17;
        this.f476949c = j18;
        this.f476950d = j19;
        this.f476951e = i18;
        this.f476953g = str;
    }

    /* renamed from: equals */
    public boolean m162370xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && rh.i.class == obj.getClass() && hashCode() == ((rh.i) obj).hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m162371x9616526c() {
        return "AlarmRecord{type=" + this.f476947a + ", triggerAtMillis=" + this.f476948b + ", windowMillis=" + this.f476949c + ", intervalMillis=" + this.f476950d + ", flag=" + this.f476951e + ", timeBgn=" + this.f476952f + ", stack='" + this.f476953g + "'}";
    }
}
