package j2;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f378745a;

    /* renamed from: b, reason: collision with root package name */
    public final int f378746b;

    /* renamed from: c, reason: collision with root package name */
    public final int f378747c;

    public c(java.lang.Object span, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(span, "span");
        this.f378745a = span;
        this.f378746b = i17;
        this.f378747c = i18;
    }

    /* renamed from: equals */
    public boolean m140212xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2.c)) {
            return false;
        }
        j2.c cVar = (j2.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f378745a, cVar.f378745a) && this.f378746b == cVar.f378746b && this.f378747c == cVar.f378747c;
    }

    /* renamed from: hashCode */
    public int m140213x8cdac1b() {
        return (((this.f378745a.hashCode() * 31) + java.lang.Integer.hashCode(this.f378746b)) * 31) + java.lang.Integer.hashCode(this.f378747c);
    }

    /* renamed from: toString */
    public java.lang.String m140214x9616526c() {
        return "SpanRange(span=" + this.f378745a + ", start=" + this.f378746b + ", end=" + this.f378747c + ')';
    }
}
