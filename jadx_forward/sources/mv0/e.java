package mv0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f413071a;

    /* renamed from: b, reason: collision with root package name */
    public final mv0.d f413072b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f413073c;

    public e(java.lang.String text, mv0.d page, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f413071a = text;
        this.f413072b = page;
        this.f413073c = view;
    }

    /* renamed from: equals */
    public boolean m148452xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv0.e)) {
            return false;
        }
        mv0.e eVar = (mv0.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413071a, eVar.f413071a) && this.f413072b == eVar.f413072b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413073c, eVar.f413073c);
    }

    /* renamed from: hashCode */
    public int m148453x8cdac1b() {
        return (((this.f413071a.hashCode() * 31) + this.f413072b.hashCode()) * 31) + this.f413073c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m148454x9616526c() {
        return "ToolbarTabItem(text=" + this.f413071a + ", page=" + this.f413072b + ", view=" + this.f413073c + ')';
    }
}
