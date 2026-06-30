package g2;

/* loaded from: classes14.dex */
public final class a0 implements g2.d {

    /* renamed from: a, reason: collision with root package name */
    public final a2.d f349214a;

    /* renamed from: b, reason: collision with root package name */
    public final int f349215b;

    public a0(java.lang.String text, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f349214a = new a2.d(text, null, null, 6, null);
        this.f349215b = i17;
    }

    @Override // g2.d
    public void a(g2.f buffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        int i17 = buffer.f349232d;
        boolean z17 = i17 != -1;
        a2.d dVar = this.f349214a;
        if (z17) {
            buffer.d(i17, buffer.f349233e, dVar.f82214d);
            java.lang.String str = dVar.f82214d;
            if (str.length() > 0) {
                buffer.e(i17, str.length() + i17);
            }
        } else {
            int i18 = buffer.f349230b;
            buffer.d(i18, buffer.f349231c, dVar.f82214d);
            java.lang.String str2 = dVar.f82214d;
            if (str2.length() > 0) {
                buffer.e(i18, str2.length() + i18);
            }
        }
        int i19 = buffer.f349230b;
        int i27 = buffer.f349231c;
        int i28 = i19 == i27 ? i27 : -1;
        int i29 = this.f349215b;
        int i37 = i28 + i29;
        int f17 = e06.p.f(i29 > 0 ? i37 - 1 : i37 - dVar.f82214d.length(), 0, buffer.c());
        buffer.f(f17, f17);
    }

    /* renamed from: equals */
    public boolean m130670xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2.a0)) {
            return false;
        }
        g2.a0 a0Var = (g2.a0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349214a.f82214d, a0Var.f349214a.f82214d) && this.f349215b == a0Var.f349215b;
    }

    /* renamed from: hashCode */
    public int m130671x8cdac1b() {
        return (this.f349214a.f82214d.hashCode() * 31) + this.f349215b;
    }

    /* renamed from: toString */
    public java.lang.String m130672x9616526c() {
        return "SetComposingTextCommand(text='" + this.f349214a.f82214d + "', newCursorPosition=" + this.f349215b + ')';
    }
}
