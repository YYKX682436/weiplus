package av5;

/* loaded from: classes16.dex */
public class f implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f14370d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14371e;

    public f(int i17, int i18) {
        this.f14370d = i17;
        this.f14371e = i18;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        av5.f fVar = (av5.f) obj;
        int f17 = cv5.c.f(this.f14370d, fVar.f14370d);
        return f17 != 0 ? f17 : cv5.c.c(this.f14371e, fVar.f14371e);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof av5.f)) {
            return false;
        }
        av5.f fVar = (av5.f) obj;
        int f17 = cv5.c.f(this.f14370d, fVar.f14370d);
        if (f17 == 0) {
            f17 = cv5.c.c(this.f14371e, fVar.f14371e);
        }
        return f17 == 0;
    }

    public int hashCode() {
        return cv5.e.a(java.lang.Integer.valueOf(this.f14370d), java.lang.Integer.valueOf(this.f14371e));
    }
}
