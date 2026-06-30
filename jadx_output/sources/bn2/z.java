package bn2;

/* loaded from: classes14.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.d0 f22910d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(bn2.d0 d0Var) {
        super(2);
        this.f22910d = d0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        hn0.f fVar;
        lo0.h0 item = (lo0.h0) obj;
        double doubleValue = ((java.lang.Number) obj2).doubleValue();
        kotlin.jvm.internal.o.g(item, "item");
        item.f320006j = doubleValue;
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (w0Var != null && (fVar = w0Var.f420773t) != null) {
            if (item.f320002f) {
                lo0.g0 g0Var = this.f22910d.f22849c;
                lo0.b0 b0Var = g0Var.f319994c;
                kotlin.jvm.internal.o.g(b0Var, "<set-?>");
                g0Var.f319996e = b0Var;
                go0.f0 f0Var = ((hn0.p) fVar).f282400b;
                f0Var.getClass();
                f0Var.l(new go0.b0(f0Var, g0Var.f319994c));
                hn0.f.a(fVar, doubleValue, false, false, 4, null);
            } else {
                ((hn0.p) fVar).f(item.f320001e, doubleValue);
            }
        }
        return jz5.f0.f302826a;
    }
}
