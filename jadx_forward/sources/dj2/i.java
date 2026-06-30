package dj2;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.PointF f314435a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.PointF f314436b;

    public i(android.graphics.PointF startPointF, android.graphics.PointF endPointF) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(startPointF, "startPointF");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(endPointF, "endPointF");
        this.f314435a = startPointF;
        this.f314436b = endPointF;
    }

    /* renamed from: equals */
    public boolean m124492xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj2.i)) {
            return false;
        }
        dj2.i iVar = (dj2.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f314435a, iVar.f314435a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f314436b, iVar.f314436b);
    }

    /* renamed from: hashCode */
    public int m124493x8cdac1b() {
        return (this.f314435a.hashCode() * 31) + this.f314436b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124494x9616526c() {
        return "LinePoint(startPointF=" + this.f314435a + ", endPointF=" + this.f314436b + ')';
    }
}
