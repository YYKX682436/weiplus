package sw0;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f494976a;

    /* renamed from: b, reason: collision with root package name */
    public final sw0.f f494977b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f494978c;

    public n(java.lang.String text, sw0.f page, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f494976a = text;
        this.f494977b = page;
        this.f494978c = view;
    }

    /* renamed from: equals */
    public boolean m165412xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw0.n)) {
            return false;
        }
        sw0.n nVar = (sw0.n) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494976a, nVar.f494976a) && this.f494977b == nVar.f494977b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494978c, nVar.f494978c);
    }

    /* renamed from: hashCode */
    public int m165413x8cdac1b() {
        return (((this.f494976a.hashCode() * 31) + this.f494977b.hashCode()) * 31) + this.f494978c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m165414x9616526c() {
        return "TextTabItem(text=" + this.f494976a + ", page=" + this.f494977b + ", view=" + this.f494978c + ')';
    }
}
