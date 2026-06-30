package sa2;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f486832a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f486833b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639 f486834c;

    public d(int i17, android.widget.FrameLayout container, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639 fragment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f486832a = i17;
        this.f486833b = container;
        this.f486834c = fragment;
    }

    /* renamed from: equals */
    public boolean m164175xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa2.d)) {
            return false;
        }
        sa2.d dVar = (sa2.d) obj;
        return this.f486832a == dVar.f486832a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f486833b, dVar.f486833b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f486834c, dVar.f486834c);
    }

    /* renamed from: hashCode */
    public int m164176x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f486832a) * 31) + this.f486833b.hashCode()) * 31) + this.f486834c.m7479x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m164177x9616526c() {
        return "FragmentInfo(pos=" + this.f486832a + ", container=" + this.f486833b + ", fragment=" + this.f486834c + ')';
    }
}
