package pk2;

/* loaded from: classes3.dex */
public final class e9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f437245a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f437246b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f437247c;

    public e9(java.util.List items, java.lang.String title, android.view.View view, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        items = (i17 & 1) != 0 ? new java.util.ArrayList() : items;
        title = (i17 & 2) != 0 ? "" : title;
        view = (i17 & 4) != 0 ? null : view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f437245a = items;
        this.f437246b = title;
        this.f437247c = view;
    }

    /* renamed from: equals */
    public boolean m158633xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk2.e9)) {
            return false;
        }
        pk2.e9 e9Var = (pk2.e9) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f437245a, e9Var.f437245a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f437246b, e9Var.f437246b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f437247c, e9Var.f437247c);
    }

    /* renamed from: hashCode */
    public int m158634x8cdac1b() {
        int hashCode = ((this.f437245a.hashCode() * 31) + this.f437246b.hashCode()) * 31;
        android.view.View view = this.f437247c;
        return hashCode + (view == null ? 0 : view.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m158635x9616526c() {
        return "MenuLevelConfig(items=" + this.f437245a + ", title=" + this.f437246b + ", customWidget=" + this.f437247c + ')';
    }
}
