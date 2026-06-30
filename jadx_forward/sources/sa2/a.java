package sa2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f486827a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f486828b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639 f486829c;

    public a(int i17, android.widget.FrameLayout container, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639 fragment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f486827a = i17;
        this.f486828b = container;
        this.f486829c = fragment;
    }

    /* renamed from: equals */
    public boolean m164172xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa2.a)) {
            return false;
        }
        sa2.a aVar = (sa2.a) obj;
        return this.f486827a == aVar.f486827a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f486828b, aVar.f486828b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f486829c, aVar.f486829c);
    }

    /* renamed from: hashCode */
    public int m164173x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f486827a) * 31) + this.f486828b.hashCode()) * 31) + this.f486829c.m7479x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m164174x9616526c() {
        return "FragmentInfo(pos=" + this.f486827a + ", container=" + this.f486828b + ", fragment=" + this.f486829c + ')';
    }
}
