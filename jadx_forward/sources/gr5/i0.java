package gr5;

/* loaded from: classes14.dex */
public final class i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final gr5.i0 f356464c;

    /* renamed from: a, reason: collision with root package name */
    public final gr5.v f356465a;

    /* renamed from: b, reason: collision with root package name */
    public final gr5.v f356466b;

    static {
        gr5.v vVar = gr5.v.f356485g;
        f356464c = new gr5.i0(vVar, vVar);
    }

    public i0(gr5.v horizontal, gr5.v vertical) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(horizontal, "horizontal");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vertical, "vertical");
        this.f356465a = horizontal;
        this.f356466b = vertical;
    }

    /* renamed from: equals */
    public boolean m132112xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr5.i0)) {
            return false;
        }
        gr5.i0 i0Var = (gr5.i0) obj;
        return this.f356465a == i0Var.f356465a && this.f356466b == i0Var.f356466b;
    }

    /* renamed from: hashCode */
    public int m132113x8cdac1b() {
        return (this.f356465a.hashCode() * 31) + this.f356466b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m132114x9616526c() {
        return "ScrollEdge(horizontal=" + this.f356465a + ", vertical=" + this.f356466b + ')';
    }
}
