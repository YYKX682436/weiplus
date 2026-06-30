package a24;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public a24.t f82438a;

    /* renamed from: b, reason: collision with root package name */
    public final a24.i f82439b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f82440c;

    public t(a24.t tVar, a24.i item, java.util.List children, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        children = (i17 & 4) != 0 ? new java.util.ArrayList() : children;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(children, "children");
        this.f82438a = tVar;
        this.f82439b = item;
        this.f82440c = children;
        item.a7();
    }

    /* renamed from: equals */
    public boolean m452xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a24.t)) {
            return false;
        }
        a24.t tVar = (a24.t) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82438a, tVar.f82438a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82439b, tVar.f82439b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82440c, tVar.f82440c);
    }

    /* renamed from: hashCode */
    public int m453x8cdac1b() {
        a24.t tVar = this.f82438a;
        return ((((tVar == null ? 0 : tVar.m453x8cdac1b()) * 31) + this.f82439b.hashCode()) * 31) + this.f82440c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m454x9616526c() {
        return "SettingItemNode(parent=" + this.f82438a + ", item=" + this.f82439b + ", children=" + this.f82440c + ')';
    }
}
