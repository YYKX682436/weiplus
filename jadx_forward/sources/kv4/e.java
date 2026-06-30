package kv4;

/* loaded from: classes12.dex */
public final class e implements jv4.n {

    /* renamed from: a, reason: collision with root package name */
    public final kv4.g f394227a;

    /* renamed from: b, reason: collision with root package name */
    public final jv4.m f394228b;

    public e(kv4.g gapSize) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gapSize, "gapSize");
        this.f394227a = gapSize;
        this.f394228b = jv4.m.f383788u;
    }

    @Override // jv4.n
    public void c(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View view = ((qv4.s0) holder).f3639x46306858;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kv4.g gVar = this.f394227a;
        if (layoutParams == null) {
            view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, gVar.f394233a));
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = gVar.f394233a;
        view.setLayoutParams(layoutParams2);
    }

    @Override // jv4.n
    /* renamed from: getType */
    public jv4.m mo141457xfb85f7b0() {
        return this.f394228b;
    }

    @Override // nv4.g
    public java.lang.String v() {
        return "gap-" + this.f394227a.f394233a;
    }

    @Override // nv4.g
    public void w() {
    }
}
