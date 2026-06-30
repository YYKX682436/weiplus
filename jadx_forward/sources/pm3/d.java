package pm3;

/* loaded from: classes10.dex */
public final class d extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final pm3.c f438408b;

    /* renamed from: c, reason: collision with root package name */
    public final im3.j f438409c;

    public d(pm3.c source, im3.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f438408b = source;
        this.f438409c = item;
    }

    /* renamed from: equals */
    public boolean m158724xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm3.d)) {
            return false;
        }
        pm3.d dVar = (pm3.d) obj;
        return this.f438408b == dVar.f438408b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f438409c, dVar.f438409c);
    }

    /* renamed from: hashCode */
    public int m158725x8cdac1b() {
        return (this.f438408b.hashCode() * 31) + this.f438409c.mo148315x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m158726x9616526c() {
        return "SelectAction(source=" + this.f438408b + ", item=" + this.f438409c + ')';
    }
}
