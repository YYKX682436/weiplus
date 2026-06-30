package kw0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f394331a;

    /* renamed from: b, reason: collision with root package name */
    public final kw0.c f394332b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f394333c;

    public d(java.lang.String text, kw0.c page, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f394331a = text;
        this.f394332b = page;
        this.f394333c = view;
    }

    /* renamed from: equals */
    public boolean m144473xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw0.d)) {
            return false;
        }
        kw0.d dVar = (kw0.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f394331a, dVar.f394331a) && this.f394332b == dVar.f394332b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f394333c, dVar.f394333c);
    }

    /* renamed from: hashCode */
    public int m144474x8cdac1b() {
        return (((this.f394331a.hashCode() * 31) + this.f394332b.hashCode()) * 31) + this.f394333c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m144475x9616526c() {
        return "StickerTabItem(text=" + this.f394331a + ", page=" + this.f394332b + ", view=" + this.f394333c + ')';
    }
}
