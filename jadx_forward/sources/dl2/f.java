package dl2;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f316728a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.n30 f316729b;

    public f(boolean z17, r45.n30 productItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productItem, "productItem");
        this.f316728a = z17;
        this.f316729b = productItem;
    }

    /* renamed from: equals */
    public boolean m124750xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl2.f)) {
            return false;
        }
        dl2.f fVar = (dl2.f) obj;
        return this.f316728a == fVar.f316728a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f316729b, fVar.f316729b);
    }

    /* renamed from: hashCode */
    public int m124751x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f316728a) * 31) + this.f316729b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124752x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isChoose=");
        sb6.append(this.f316728a);
        sb6.append(",  count=");
        r45.n30 n30Var = this.f316729b;
        sb6.append(n30Var.m75939xb282bd08(1));
        sb6.append(", giftId=");
        sb6.append(n30Var.m75945x2fec8307(0));
        return sb6.toString();
    }
}
