package wi5;

/* loaded from: classes.dex */
public final class x extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final ri5.j f527892b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe f527893c;

    public x(ri5.j item, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f527892b = item;
        this.f527893c = c16718x7059cefe;
    }

    /* renamed from: equals */
    public boolean m173869xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi5.x)) {
            return false;
        }
        wi5.x xVar = (wi5.x) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527892b, xVar.f527892b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527893c, xVar.f527893c);
    }

    /* renamed from: hashCode */
    public int m173870x8cdac1b() {
        int mo148315x8cdac1b = this.f527892b.mo148315x8cdac1b() * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = this.f527893c;
        return mo148315x8cdac1b + (c16718x7059cefe == null ? 0 : c16718x7059cefe.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m173871x9616526c() {
        return "SearchMoreClickAction(item=" + this.f527892b + ", searchMvvmList=" + this.f527893c + ')';
    }
}
