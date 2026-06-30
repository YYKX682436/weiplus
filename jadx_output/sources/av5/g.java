package av5;

/* loaded from: classes16.dex */
public class g implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f14372d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14373e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14374f;

    public g(int i17, int i18, int i19) {
        this.f14372d = i17;
        this.f14373e = i18;
        this.f14374f = i19;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(av5.g gVar) {
        int f17 = cv5.c.f(this.f14372d, gVar.f14372d);
        if (f17 != 0) {
            return f17;
        }
        int c17 = cv5.c.c(this.f14373e, gVar.f14373e);
        return c17 != 0 ? c17 : cv5.c.c(this.f14374f, gVar.f14374f);
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof av5.g) && compareTo((av5.g) obj) == 0;
    }

    public int hashCode() {
        return cv5.e.a(java.lang.Integer.valueOf(this.f14372d), java.lang.Integer.valueOf(this.f14373e), java.lang.Integer.valueOf(this.f14374f));
    }
}
