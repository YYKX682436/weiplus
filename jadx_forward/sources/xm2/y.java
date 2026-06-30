package xm2;

/* loaded from: classes14.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xm2.a0 f536815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(xm2.a0 a0Var) {
        super(1);
        this.f536815d = a0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xm2.a0 a0Var = this.f536815d;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a0Var.f536722f, obj)) {
            a0Var.f536722f = obj;
            a0Var.f536723g.f536806e = obj;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView = a0Var.f536724h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recyclerView, "recyclerView");
            java.util.Iterator it = oj5.x.b(recyclerView).iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
                xm2.v vVar = k3Var instanceof xm2.v ? (xm2.v) k3Var : null;
                if (vVar != null) {
                    zm2.d dVar = vVar.f536804m;
                    vVar.i(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar != null ? dVar.f555695d : null, obj));
                }
            }
            a0Var.a(obj);
            a0Var.f536720d.mo146xb9724478(obj);
        }
        return jz5.f0.f384359a;
    }
}
