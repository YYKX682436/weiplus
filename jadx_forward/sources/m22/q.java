package m22;

/* loaded from: classes12.dex */
public final class q extends in5.n0 {

    /* renamed from: t, reason: collision with root package name */
    public final m22.y f404595t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f404596u;

    public q(m22.y clickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickListener, "clickListener");
        this.f404595t = clickListener;
        this.f404596u = new java.util.LinkedList();
        this.f374640q = true;
    }

    @Override // in5.n0
    public void I(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        m22.g holder = (m22.g) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f404596u.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        holder.i((m22.i) obj);
    }

    @Override // in5.n0
    public void J(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        m22.g holder = (m22.g) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        java.lang.Object obj = this.f404596u.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        holder.i((m22.i) obj);
    }

    @Override // in5.n0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 M(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        return new m22.o(parent, this.f404595t);
    }

    @Override // in5.n0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m0(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return new m22.r(view);
    }

    @Override // in5.n0
    public int x() {
        return this.f404596u.size();
    }
}
