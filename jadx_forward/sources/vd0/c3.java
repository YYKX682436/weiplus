package vd0;

/* loaded from: classes8.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f516914a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f516915b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f516916c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f516917d;

    public c3(java.util.List indexedNodes, java.util.Map nodeByKey, java.util.Map indexedByKey, java.util.Map visibleByKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(indexedNodes, "indexedNodes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nodeByKey, "nodeByKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(indexedByKey, "indexedByKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibleByKey, "visibleByKey");
        this.f516914a = indexedNodes;
        this.f516915b = nodeByKey;
        this.f516916c = indexedByKey;
        this.f516917d = visibleByKey;
    }

    /* renamed from: equals */
    public boolean m171493xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd0.c3)) {
            return false;
        }
        vd0.c3 c3Var = (vd0.c3) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f516914a, c3Var.f516914a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f516915b, c3Var.f516915b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f516916c, c3Var.f516916c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f516917d, c3Var.f516917d);
    }

    /* renamed from: hashCode */
    public int m171494x8cdac1b() {
        return (((((this.f516914a.hashCode() * 31) + this.f516915b.hashCode()) * 31) + this.f516916c.hashCode()) * 31) + this.f516917d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m171495x9616526c() {
        return "SearchIndex(indexedNodes=" + this.f516914a + ", nodeByKey=" + this.f516915b + ", indexedByKey=" + this.f516916c + ", visibleByKey=" + this.f516917d + ')';
    }
}
