package ou5;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f430585a;

    /* renamed from: b, reason: collision with root package name */
    public final long f430586b;

    /* renamed from: c, reason: collision with root package name */
    public final long f430587c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f430588d;

    /* renamed from: e, reason: collision with root package name */
    public long f430589e;

    /* renamed from: f, reason: collision with root package name */
    public final float f430590f;

    public c(java.lang.String str, long j17, long j18, java.lang.String str2) {
        this.f430585a = str;
        this.f430586b = j17;
        this.f430587c = j18;
        this.f430588d = str2;
        this.f430590f = j18 > 1 ? (((float) j17) * 1.0f) / ((float) j18) : 1.0f;
        this.f430589e = java.lang.System.currentTimeMillis();
    }

    /* renamed from: equals */
    public boolean m157136xb2c87fbf(java.lang.Object obj) {
        return this.f430585a.equals(obj);
    }

    /* renamed from: hashCode */
    public int m157137x8cdac1b() {
        return this.f430585a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m157138x9616526c() {
        return this.f430585a + " " + this.f430586b + " " + this.f430587c;
    }
}
