package a0;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final float f81725a;

    /* renamed from: b, reason: collision with root package name */
    public final e1.r f81726b;

    public k(float f17, e1.r rVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f81725a = f17;
        this.f81726b = rVar;
    }

    /* renamed from: equals */
    public boolean m170xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0.k)) {
            return false;
        }
        a0.k kVar = (a0.k) obj;
        return p2.h.a(this.f81725a, kVar.f81725a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f81726b, kVar.f81726b);
    }

    /* renamed from: hashCode */
    public int m171x8cdac1b() {
        return (java.lang.Float.hashCode(this.f81725a) * 31) + this.f81726b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m172x9616526c() {
        return "BorderStroke(width=" + ((java.lang.Object) p2.h.b(this.f81725a)) + ", brush=" + this.f81726b + ')';
    }
}
