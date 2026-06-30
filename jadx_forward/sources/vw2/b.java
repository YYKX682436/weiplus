package vw2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f522362a;

    /* renamed from: b, reason: collision with root package name */
    public final long f522363b;

    /* renamed from: c, reason: collision with root package name */
    public final vw2.c f522364c;

    public b(long j17, long j18, vw2.c button) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(button, "button");
        this.f522362a = j17;
        this.f522363b = j18;
        this.f522364c = button;
    }

    /* renamed from: equals */
    public boolean m172813xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw2.b)) {
            return false;
        }
        vw2.b bVar = (vw2.b) obj;
        return this.f522362a == bVar.f522362a && this.f522363b == bVar.f522363b && this.f522364c == bVar.f522364c;
    }

    /* renamed from: hashCode */
    public int m172814x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f522362a) * 31) + java.lang.Long.hashCode(this.f522363b)) * 31) + this.f522364c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m172815x9616526c() {
        return "AnimationData(animateDuration=" + this.f522362a + ", reverseDelay=" + this.f522363b + ", button=" + this.f522364c + ')';
    }
}
