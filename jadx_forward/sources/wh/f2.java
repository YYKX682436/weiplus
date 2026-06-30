package wh;

/* loaded from: classes12.dex */
public class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f527307a;

    /* renamed from: b, reason: collision with root package name */
    public final long f527308b;

    /* renamed from: c, reason: collision with root package name */
    public final long f527309c;

    public f2(java.lang.String str) {
        this.f527307a = str;
        this.f527308b = android.os.SystemClock.uptimeMillis();
        this.f527309c = java.lang.System.currentTimeMillis();
    }

    /* renamed from: toString */
    public java.lang.String m173772x9616526c() {
        return "Stamp{key='" + this.f527307a + "', upTime=" + this.f527308b + ", statMillis=" + this.f527309c + '}';
    }

    public f2(java.lang.String str, long j17) {
        this.f527307a = str;
        this.f527308b = j17;
        this.f527309c = java.lang.System.currentTimeMillis();
    }
}
