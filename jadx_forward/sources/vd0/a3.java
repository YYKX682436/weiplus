package vd0;

/* loaded from: classes8.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public final vd0.z2 f516900a;

    /* renamed from: b, reason: collision with root package name */
    public final wd0.w1 f516901b;

    public a3(vd0.z2 indexedNode, wd0.w1 matchType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(indexedNode, "indexedNode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matchType, "matchType");
        this.f516900a = indexedNode;
        this.f516901b = matchType;
    }

    /* renamed from: equals */
    public boolean m171480xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd0.a3)) {
            return false;
        }
        vd0.a3 a3Var = (vd0.a3) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f516900a, a3Var.f516900a) && this.f516901b == a3Var.f516901b;
    }

    /* renamed from: hashCode */
    public int m171481x8cdac1b() {
        return (this.f516900a.m171577x8cdac1b() * 31) + this.f516901b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m171482x9616526c() {
        return "MatchedNode(indexedNode=" + this.f516900a + ", matchType=" + this.f516901b + ')';
    }
}
