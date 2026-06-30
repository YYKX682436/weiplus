package g2;

/* loaded from: classes14.dex */
public final class b0 implements g2.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f349218a;

    /* renamed from: b, reason: collision with root package name */
    public final int f349219b;

    public b0(int i17, int i18) {
        this.f349218a = i17;
        this.f349219b = i18;
    }

    @Override // g2.d
    public void a(g2.f buffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        int f17 = e06.p.f(this.f349218a, 0, buffer.c());
        int f18 = e06.p.f(this.f349219b, 0, buffer.c());
        if (f17 < f18) {
            buffer.f(f17, f18);
        } else {
            buffer.f(f18, f17);
        }
    }

    /* renamed from: equals */
    public boolean m130676xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2.b0)) {
            return false;
        }
        g2.b0 b0Var = (g2.b0) obj;
        return this.f349218a == b0Var.f349218a && this.f349219b == b0Var.f349219b;
    }

    /* renamed from: hashCode */
    public int m130677x8cdac1b() {
        return (this.f349218a * 31) + this.f349219b;
    }

    /* renamed from: toString */
    public java.lang.String m130678x9616526c() {
        return "SetSelectionCommand(start=" + this.f349218a + ", end=" + this.f349219b + ')';
    }
}
