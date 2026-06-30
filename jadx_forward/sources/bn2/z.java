package bn2;

/* loaded from: classes14.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.d0 f104443d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(bn2.d0 d0Var) {
        super(2);
        this.f104443d = d0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        hn0.f fVar;
        lo0.h0 item = (lo0.h0) obj;
        double doubleValue = ((java.lang.Number) obj2).doubleValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        item.f401539j = doubleValue;
        tn0.w0 w0Var = dk2.ef.f314911d;
        if (w0Var != null && (fVar = w0Var.f502306t) != null) {
            if (item.f401535f) {
                lo0.g0 g0Var = this.f104443d.f104382c;
                lo0.b0 b0Var = g0Var.f401527c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(b0Var, "<set-?>");
                g0Var.f401529e = b0Var;
                go0.f0 f0Var = ((hn0.p) fVar).f363933b;
                f0Var.getClass();
                f0Var.l(new go0.b0(f0Var, g0Var.f401527c));
                hn0.f.a(fVar, doubleValue, false, false, 4, null);
            } else {
                ((hn0.p) fVar).f(item.f401534e, doubleValue);
            }
        }
        return jz5.f0.f384359a;
    }
}
