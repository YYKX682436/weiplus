package g2;

/* loaded from: classes14.dex */
public final class z implements g2.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f349295a;

    /* renamed from: b, reason: collision with root package name */
    public final int f349296b;

    public z(int i17, int i18) {
        this.f349295a = i17;
        this.f349296b = i18;
    }

    @Override // g2.d
    public void a(g2.f buffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        if (buffer.f349232d != -1) {
            buffer.f349232d = -1;
            buffer.f349233e = -1;
        }
        int f17 = e06.p.f(this.f349295a, 0, buffer.c());
        int f18 = e06.p.f(this.f349296b, 0, buffer.c());
        if (f17 != f18) {
            if (f17 < f18) {
                buffer.e(f17, f18);
            } else {
                buffer.e(f18, f17);
            }
        }
    }

    /* renamed from: equals */
    public boolean m130713xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2.z)) {
            return false;
        }
        g2.z zVar = (g2.z) obj;
        return this.f349295a == zVar.f349295a && this.f349296b == zVar.f349296b;
    }

    /* renamed from: hashCode */
    public int m130714x8cdac1b() {
        return (this.f349295a * 31) + this.f349296b;
    }

    /* renamed from: toString */
    public java.lang.String m130715x9616526c() {
        return "SetComposingRegionCommand(start=" + this.f349295a + ", end=" + this.f349296b + ')';
    }
}
