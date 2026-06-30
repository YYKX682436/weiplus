package wi5;

/* loaded from: classes.dex */
public final class v extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final wi5.z f527881b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f527882c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f527883d;

    public v(wi5.z queryActionResult, java.util.HashMap resultMap, java.util.List itemList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(queryActionResult, "queryActionResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultMap, "resultMap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemList, "itemList");
        this.f527881b = queryActionResult;
        this.f527882c = resultMap;
        this.f527883d = itemList;
    }

    /* renamed from: equals */
    public boolean m173860xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi5.v)) {
            return false;
        }
        wi5.v vVar = (wi5.v) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527881b, vVar.f527881b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527882c, vVar.f527882c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527883d, vVar.f527883d);
    }

    /* renamed from: hashCode */
    public int m173861x8cdac1b() {
        return (((this.f527881b.hashCode() * 31) + this.f527882c.hashCode()) * 31) + this.f527883d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m173862x9616526c() {
        return "SearchEndAction(queryActionResult=" + this.f527881b + ", resultMap=" + this.f527882c + ", itemList=" + this.f527883d + ')';
    }
}
