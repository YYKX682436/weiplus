package oc2;

/* loaded from: classes8.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f425854a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f425855b;

    /* renamed from: c, reason: collision with root package name */
    public r45.st3 f425856c;

    public y0(int i17, java.util.ArrayList nodes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nodes, "nodes");
        this.f425854a = i17;
        this.f425855b = nodes;
    }

    /* renamed from: equals */
    public boolean m151021xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc2.y0)) {
            return false;
        }
        oc2.y0 y0Var = (oc2.y0) obj;
        return this.f425854a == y0Var.f425854a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f425855b, y0Var.f425855b);
    }

    /* renamed from: hashCode */
    public int m151022x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f425854a) * 31) + this.f425855b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m151023x9616526c() {
        return "SplitNode(style=" + this.f425854a + ", nodes=" + this.f425855b + ')';
    }
}
