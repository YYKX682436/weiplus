package d6;

/* loaded from: classes14.dex */
public final class f implements d6.l {

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f308172c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f308173d;

    public f(android.view.View view, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f308172c = view;
        this.f308173d = z17;
    }

    @Override // d6.h
    public java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p135x2eae8f.p138x35e001.C1420x6f1c9387 b17 = d6.i.b(this);
        if (b17 != null) {
            return b17;
        }
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        android.view.ViewTreeObserver viewTreeObserver = this.f308172c.getViewTreeObserver();
        d6.k kVar = new d6.k(this, viewTreeObserver, rVar);
        viewTreeObserver.addOnPreDrawListener(kVar);
        rVar.m(new d6.j(this, viewTreeObserver, kVar));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    /* renamed from: equals */
    public boolean m123545xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d6.f) {
            d6.f fVar = (d6.f) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f308172c, fVar.f308172c)) {
                if (this.f308173d == fVar.f308173d) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m123546x8cdac1b() {
        return (this.f308172c.hashCode() * 31) + java.lang.Boolean.hashCode(this.f308173d);
    }

    /* renamed from: toString */
    public java.lang.String m123547x9616526c() {
        return "RealViewSizeResolver(view=" + this.f308172c + ", subtractPadding=" + this.f308173d + ')';
    }
}
