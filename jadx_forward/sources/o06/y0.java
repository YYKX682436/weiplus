package o06;

/* loaded from: classes5.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final n16.b f423539a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f423540b;

    public y0(n16.b classId, java.util.List typeParametersCount) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classId, "classId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeParametersCount, "typeParametersCount");
        this.f423539a = classId;
        this.f423540b = typeParametersCount;
    }

    /* renamed from: equals */
    public boolean m150395xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o06.y0)) {
            return false;
        }
        o06.y0 y0Var = (o06.y0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f423539a, y0Var.f423539a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f423540b, y0Var.f423540b);
    }

    /* renamed from: hashCode */
    public int m150396x8cdac1b() {
        return (this.f423539a.m148881x8cdac1b() * 31) + this.f423540b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m150397x9616526c() {
        return "ClassRequest(classId=" + this.f423539a + ", typeParametersCount=" + this.f423540b + ')';
    }
}
