package kv4;

/* loaded from: classes12.dex */
public final class f0 implements jv4.n {

    /* renamed from: a, reason: collision with root package name */
    public final rv4.p f394231a;

    /* renamed from: b, reason: collision with root package name */
    public final kv4.m f394232b;

    public f0(rv4.p data, kv4.m delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f394231a = data;
        this.f394232b = delegate;
    }

    @Override // jv4.n
    public void c(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        kv4.d dVar = holder instanceof kv4.d ? (kv4.d) holder : null;
        if (dVar == null) {
            return;
        }
        rv4.p pVar = this.f394231a;
        pVar.f482071m = pVar.f482070l;
        android.view.View view = dVar.f394224d;
        view.getMeasuredHeight();
        pVar.getClass();
        com.p314xaae8f345.mm.ui.kk.f(view, pVar.f482071m);
        java.lang.Object mo141623x754a37bb = ((jz5.n) dVar.f394225e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.view.View) mo141623x754a37bb).setOnClickListener(new kv4.d0(this));
    }

    @Override // jv4.n
    /* renamed from: getType */
    public jv4.m mo141457xfb85f7b0() {
        return jv4.m.f383786s;
    }

    @Override // nv4.g
    public java.lang.String v() {
        jv4.l lVar = jv4.m.f383775e;
        return "10-".concat(kz5.n0.g0(this.f394231a.f482061c, "-", null, null, 0, null, kv4.e0.f394229d, 30, null));
    }

    @Override // nv4.g
    public void w() {
        rv4.p pVar = this.f394231a;
        pVar.getClass();
        pVar.getClass();
        pVar.k(vu4.a.f521772f, vu4.b.B, "", pVar.f482064f, pVar.g(false, null, false));
    }
}
