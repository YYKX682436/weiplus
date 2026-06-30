package av5;

/* loaded from: classes16.dex */
public class g implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f95905d;

    /* renamed from: e, reason: collision with root package name */
    public final int f95906e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95907f;

    public g(int i17, int i18, int i19) {
        this.f95905d = i17;
        this.f95906e = i18;
        this.f95907f = i19;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(av5.g gVar) {
        int f17 = cv5.c.f(this.f95905d, gVar.f95905d);
        if (f17 != 0) {
            return f17;
        }
        int c17 = cv5.c.c(this.f95906e, gVar.f95906e);
        return c17 != 0 ? c17 : cv5.c.c(this.f95907f, gVar.f95907f);
    }

    /* renamed from: equals */
    public boolean m9122xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof av5.g) && compareTo((av5.g) obj) == 0;
    }

    /* renamed from: hashCode */
    public int m9123x8cdac1b() {
        return cv5.e.a(java.lang.Integer.valueOf(this.f95905d), java.lang.Integer.valueOf(this.f95906e), java.lang.Integer.valueOf(this.f95907f));
    }
}
