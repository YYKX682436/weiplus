package xu5;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.ThreadLocal f538831c = new java.lang.ThreadLocal();

    /* renamed from: d, reason: collision with root package name */
    public static xu5.b f538832d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f538833e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f538834f = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f538835a;

    /* renamed from: b, reason: collision with root package name */
    public final xu5.t f538836b = new xu5.t(new xu5.d(new xu5.a(this)));

    public b(java.lang.String str) {
        this.f538835a = str;
        f538833e.put(str, this);
    }

    public static xu5.b a(java.lang.String str) {
        return new xu5.b(str + "@" + f538834f.getAndIncrement());
    }

    public static xu5.b b() {
        if (f538832d == null) {
            java.lang.String c17 = c(android.os.Looper.getMainLooper());
            xu5.b bVar = (xu5.b) f538833e.get(c17);
            if (bVar == null) {
                bVar = new xu5.b(c17);
            }
            f538832d = bVar;
        }
        return f538832d;
    }

    public static java.lang.String c(android.os.Looper looper) {
        if (looper == null) {
            return null;
        }
        java.lang.Thread thread = looper.getThread();
        return thread.getName() + "@" + thread.getId();
    }

    public static xu5.b d() {
        return android.os.Looper.getMainLooper() == android.os.Looper.myLooper() ? b() : (xu5.b) f538831c.get();
    }

    public static java.lang.String e() {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            return b().f538835a;
        }
        xu5.b bVar = (xu5.b) f538831c.get();
        if (bVar == null) {
            return null;
        }
        return bVar.f538835a;
    }

    /* renamed from: equals */
    public boolean m175999xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof xu5.b) {
            return ((xu5.b) obj).f538835a.equals(this.f538835a);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m176000x8cdac1b() {
        return this.f538835a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m176001x9616526c() {
        return "[" + this.f538835a + "]";
    }
}
