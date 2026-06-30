package l2;

/* loaded from: classes14.dex */
public final class b implements l2.l {

    /* renamed from: b, reason: collision with root package name */
    public final long f396640b;

    public b(long j17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f396640b = j17;
        if (!(j17 != e1.y.f327853k)) {
            throw new java.lang.IllegalArgumentException("ColorStyle value must be specified, use TextDrawStyle.Unspecified instead.".toString());
        }
    }

    @Override // l2.l
    public long a() {
        return this.f396640b;
    }

    @Override // l2.l
    public l2.l b(yz5.a other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this, l2.j.f396655b) ? this : (l2.l) other.mo152xb9724478();
    }

    @Override // l2.l
    public l2.l c(l2.l lVar) {
        return l2.i.a(this, lVar);
    }

    @Override // l2.l
    public e1.r d() {
        return null;
    }

    /* renamed from: equals */
    public boolean m144893xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2.b) && e1.y.c(this.f396640b, ((l2.b) obj).f396640b);
    }

    /* renamed from: hashCode */
    public int m144894x8cdac1b() {
        int i17 = e1.y.f327854l;
        return java.lang.Long.hashCode(this.f396640b);
    }

    /* renamed from: toString */
    public java.lang.String m144895x9616526c() {
        return "ColorStyle(value=" + ((java.lang.Object) e1.y.i(this.f396640b)) + ')';
    }
}
