package t6;

/* loaded from: classes13.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final t6.j f497501e = new t6.i();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f497502a;

    /* renamed from: b, reason: collision with root package name */
    public final t6.j f497503b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f497504c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f497505d;

    public k(java.lang.String str, java.lang.Object obj, t6.j jVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Must not be null or empty");
        }
        this.f497504c = str;
        this.f497502a = obj;
        q7.n.b(jVar);
        this.f497503b = jVar;
    }

    public static t6.k a(java.lang.String str, java.lang.Object obj) {
        return new t6.k(str, obj, f497501e);
    }

    /* renamed from: equals */
    public boolean m165943xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof t6.k) {
            return this.f497504c.equals(((t6.k) obj).f497504c);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m165944x8cdac1b() {
        return this.f497504c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m165945x9616526c() {
        return "Option{key='" + this.f497504c + "'}";
    }
}
