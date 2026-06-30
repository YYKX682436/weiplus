package av5;

/* loaded from: classes16.dex */
public class f implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f95903d;

    /* renamed from: e, reason: collision with root package name */
    public final int f95904e;

    public f(int i17, int i18) {
        this.f95903d = i17;
        this.f95904e = i18;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        av5.f fVar = (av5.f) obj;
        int f17 = cv5.c.f(this.f95903d, fVar.f95903d);
        return f17 != 0 ? f17 : cv5.c.c(this.f95904e, fVar.f95904e);
    }

    /* renamed from: equals */
    public boolean m9120xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof av5.f)) {
            return false;
        }
        av5.f fVar = (av5.f) obj;
        int f17 = cv5.c.f(this.f95903d, fVar.f95903d);
        if (f17 == 0) {
            f17 = cv5.c.c(this.f95904e, fVar.f95904e);
        }
        return f17 == 0;
    }

    /* renamed from: hashCode */
    public int m9121x8cdac1b() {
        return cv5.e.a(java.lang.Integer.valueOf(this.f95903d), java.lang.Integer.valueOf(this.f95904e));
    }
}
