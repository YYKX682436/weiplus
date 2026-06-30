package bm2;

/* loaded from: classes3.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ty1 f103596a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f103597b;

    public l2(r45.ty1 item, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f103596a = item;
        this.f103597b = z17;
    }

    /* renamed from: equals */
    public boolean m10754xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm2.l2)) {
            return false;
        }
        bm2.l2 l2Var = (bm2.l2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f103596a, l2Var.f103596a) && this.f103597b == l2Var.f103597b;
    }

    /* renamed from: hashCode */
    public int m10755x8cdac1b() {
        return (this.f103596a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f103597b);
    }

    /* renamed from: toString */
    public java.lang.String m10756x9616526c() {
        return "selectItem(item=" + this.f103596a + ", isCheck=" + this.f103597b + ')';
    }
}
