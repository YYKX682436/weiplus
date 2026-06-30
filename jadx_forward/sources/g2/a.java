package g2;

/* loaded from: classes14.dex */
public final class a implements g2.d {

    /* renamed from: a, reason: collision with root package name */
    public final a2.d f349212a;

    /* renamed from: b, reason: collision with root package name */
    public final int f349213b;

    public a(java.lang.String text, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f349212a = new a2.d(text, null, null, 6, null);
        this.f349213b = i17;
    }

    @Override // g2.d
    public void a(g2.f buffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        int i17 = buffer.f349232d;
        boolean z17 = i17 != -1;
        a2.d dVar = this.f349212a;
        if (z17) {
            buffer.d(i17, buffer.f349233e, dVar.f82214d);
        } else {
            buffer.d(buffer.f349230b, buffer.f349231c, dVar.f82214d);
        }
        int i18 = buffer.f349230b;
        int i19 = buffer.f349231c;
        if (i18 != i19) {
            i19 = -1;
        }
        int i27 = this.f349213b;
        int i28 = i19 + i27;
        int f17 = e06.p.f(i27 > 0 ? i28 - 1 : i28 - dVar.f82214d.length(), 0, buffer.c());
        buffer.f(f17, f17);
    }

    /* renamed from: equals */
    public boolean m130667xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2.a)) {
            return false;
        }
        g2.a aVar = (g2.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349212a.f82214d, aVar.f349212a.f82214d) && this.f349213b == aVar.f349213b;
    }

    /* renamed from: hashCode */
    public int m130668x8cdac1b() {
        return (this.f349212a.f82214d.hashCode() * 31) + this.f349213b;
    }

    /* renamed from: toString */
    public java.lang.String m130669x9616526c() {
        return "CommitTextCommand(text='" + this.f349212a.f82214d + "', newCursorPosition=" + this.f349213b + ')';
    }
}
