package ed5;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f332909a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f332910b;

    public p(android.view.View view, java.lang.String sectionKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sectionKey, "sectionKey");
        this.f332909a = view;
        this.f332910b = sectionKey;
    }

    /* renamed from: equals */
    public boolean m127335xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed5.p)) {
            return false;
        }
        ed5.p pVar = (ed5.p) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f332909a, pVar.f332909a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f332910b, pVar.f332910b);
    }

    /* renamed from: hashCode */
    public int m127336x8cdac1b() {
        return (this.f332909a.hashCode() * 31) + this.f332910b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m127337x9616526c() {
        return "NearestTimeline(view=" + this.f332909a + ", sectionKey=" + this.f332910b + ')';
    }
}
