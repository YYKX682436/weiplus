package sw0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f494952a;

    /* renamed from: b, reason: collision with root package name */
    public final ov0.e f494953b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f494954c;

    public c(java.lang.String text, ov0.e page, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f494952a = text;
        this.f494953b = page;
        this.f494954c = view;
    }

    /* renamed from: equals */
    public boolean m165394xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw0.c)) {
            return false;
        }
        sw0.c cVar = (sw0.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494952a, cVar.f494952a) && this.f494953b == cVar.f494953b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494954c, cVar.f494954c);
    }

    /* renamed from: hashCode */
    public int m165395x8cdac1b() {
        return (((this.f494952a.hashCode() * 31) + this.f494953b.hashCode()) * 31) + this.f494954c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m165396x9616526c() {
        return "TextEditTabItem(text=" + this.f494952a + ", page=" + this.f494953b + ", view=" + this.f494954c + ')';
    }
}
