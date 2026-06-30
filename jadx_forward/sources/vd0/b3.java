package vd0;

/* loaded from: classes8.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public final a24.t f516904a;

    /* renamed from: b, reason: collision with root package name */
    public final int f516905b;

    /* renamed from: c, reason: collision with root package name */
    public final a24.t f516906c;

    public b3(a24.t node, int i17, a24.t tVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(node, "node");
        this.f516904a = node;
        this.f516905b = i17;
        this.f516906c = tVar;
    }

    /* renamed from: equals */
    public boolean m171484xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd0.b3)) {
            return false;
        }
        vd0.b3 b3Var = (vd0.b3) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f516904a, b3Var.f516904a) && this.f516905b == b3Var.f516905b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f516906c, b3Var.f516906c);
    }

    /* renamed from: hashCode */
    public int m171485x8cdac1b() {
        int m453x8cdac1b = ((this.f516904a.m453x8cdac1b() * 31) + java.lang.Integer.hashCode(this.f516905b)) * 31;
        a24.t tVar = this.f516906c;
        return m453x8cdac1b + (tVar == null ? 0 : tVar.m453x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m171486x9616526c() {
        return "QueueItem(node=" + this.f516904a + ", depth=" + this.f516905b + ", parent=" + this.f516906c + ')';
    }
}
