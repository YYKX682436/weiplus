package f4;

/* loaded from: classes15.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f340912a;

    /* renamed from: b, reason: collision with root package name */
    public final long f340913b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f340914c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f340915d;

    public d(long j17, long j18, boolean z17, java.util.List states) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(states, "states");
        this.f340912a = j17;
        this.f340913b = j18;
        this.f340914c = z17;
        this.f340915d = states;
    }

    /* renamed from: equals */
    public boolean mo129008xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type androidx.metrics.performance.FrameData");
        f4.d dVar = (f4.d) obj;
        return this.f340912a == dVar.f340912a && this.f340913b == dVar.f340913b && this.f340914c == dVar.f340914c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f340915d, dVar.f340915d);
    }

    /* renamed from: hashCode */
    public int mo129009x8cdac1b() {
        return (((((java.lang.Long.hashCode(this.f340912a) * 31) + java.lang.Long.hashCode(this.f340913b)) * 31) + java.lang.Boolean.hashCode(this.f340914c)) * 31) + this.f340915d.hashCode();
    }
}
