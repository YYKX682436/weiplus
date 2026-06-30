package p05;

/* loaded from: classes3.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f431969a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f431970b;

    public a1(long j17, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f431969a = j17;
        this.f431970b = path;
    }

    /* renamed from: equals */
    public boolean m157544xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p05.a1)) {
            return false;
        }
        p05.a1 a1Var = (p05.a1) obj;
        return this.f431969a == a1Var.f431969a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f431970b, a1Var.f431970b);
    }

    /* renamed from: hashCode */
    public int m157545x8cdac1b() {
        return (java.lang.Long.hashCode(this.f431969a) * 31) + this.f431970b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m157546x9616526c() {
        return "RunningAnimationInfo(glPtr=" + this.f431969a + ", path=" + this.f431970b + ')';
    }
}
