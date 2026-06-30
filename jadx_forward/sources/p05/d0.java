package p05;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f432010a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f432011b;

    public d0(long j17, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f432010a = j17;
        this.f432011b = path;
    }

    /* renamed from: equals */
    public boolean m157552xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p05.d0)) {
            return false;
        }
        p05.d0 d0Var = (p05.d0) obj;
        return this.f432010a == d0Var.f432010a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f432011b, d0Var.f432011b);
    }

    /* renamed from: hashCode */
    public int m157553x8cdac1b() {
        return (java.lang.Long.hashCode(this.f432010a) * 31) + this.f432011b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m157554x9616526c() {
        return "RunningAnimationInfo(glPtr=" + this.f432010a + ", path=" + this.f432011b + ')';
    }
}
