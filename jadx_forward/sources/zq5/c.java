package zq5;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final long f556590b = zq5.d.a(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f556591c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f556592a;

    public static final int a(long j17) {
        return (int) (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2);
    }

    public static java.lang.String b(long j17) {
        return "(" + ((int) (j17 >> 32)) + ", " + a(j17) + ')';
    }

    /* renamed from: equals */
    public boolean m179311xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof zq5.c) {
            return this.f556592a == ((zq5.c) obj).f556592a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m179312x8cdac1b() {
        return java.lang.Long.hashCode(this.f556592a);
    }

    /* renamed from: toString */
    public java.lang.String m179313x9616526c() {
        return b(this.f556592a);
    }
}
