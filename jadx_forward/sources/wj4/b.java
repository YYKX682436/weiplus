package wj4;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f528284a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f528285b;

    public b(int i17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f528284a = i17;
        this.f528285b = source;
    }

    /* renamed from: equals */
    public boolean m174048xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj4.b)) {
            return false;
        }
        wj4.b bVar = (wj4.b) obj;
        return this.f528284a == bVar.f528284a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f528285b, bVar.f528285b);
    }

    /* renamed from: hashCode */
    public int m174049x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f528284a) * 31) + this.f528285b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m174050x9616526c() {
        return "CardStrokeContentSnapshot(edgeColor=" + this.f528284a + ", source=" + this.f528285b + ')';
    }
}
