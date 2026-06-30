package a24;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public a24.t f905a;

    /* renamed from: b, reason: collision with root package name */
    public final a24.i f906b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f907c;

    public t(a24.t tVar, a24.i item, java.util.List children, int i17, kotlin.jvm.internal.i iVar) {
        children = (i17 & 4) != 0 ? new java.util.ArrayList() : children;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(children, "children");
        this.f905a = tVar;
        this.f906b = item;
        this.f907c = children;
        item.a7();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a24.t)) {
            return false;
        }
        a24.t tVar = (a24.t) obj;
        return kotlin.jvm.internal.o.b(this.f905a, tVar.f905a) && kotlin.jvm.internal.o.b(this.f906b, tVar.f906b) && kotlin.jvm.internal.o.b(this.f907c, tVar.f907c);
    }

    public int hashCode() {
        a24.t tVar = this.f905a;
        return ((((tVar == null ? 0 : tVar.hashCode()) * 31) + this.f906b.hashCode()) * 31) + this.f907c.hashCode();
    }

    public java.lang.String toString() {
        return "SettingItemNode(parent=" + this.f905a + ", item=" + this.f906b + ", children=" + this.f907c + ')';
    }
}
