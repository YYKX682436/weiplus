package g2;

/* loaded from: classes14.dex */
public final class b implements g2.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f349216a;

    /* renamed from: b, reason: collision with root package name */
    public final int f349217b;

    public b(int i17, int i18) {
        this.f349216a = i17;
        this.f349217b = i18;
    }

    @Override // g2.d
    public void a(g2.f buffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        int i17 = buffer.f349231c;
        buffer.a(i17, java.lang.Math.min(this.f349217b + i17, buffer.c()));
        buffer.a(java.lang.Math.max(0, buffer.f349230b - this.f349216a), buffer.f349230b);
    }

    /* renamed from: equals */
    public boolean m130673xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2.b)) {
            return false;
        }
        g2.b bVar = (g2.b) obj;
        return this.f349216a == bVar.f349216a && this.f349217b == bVar.f349217b;
    }

    /* renamed from: hashCode */
    public int m130674x8cdac1b() {
        return (this.f349216a * 31) + this.f349217b;
    }

    /* renamed from: toString */
    public java.lang.String m130675x9616526c() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f349216a + ", lengthAfterCursor=" + this.f349217b + ')';
    }
}
