package bn2;

/* loaded from: classes3.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final bn2.s f22889d = new bn2.s();

    public s() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        hn0.f fVar;
        lo0.b0 item = (lo0.b0) obj;
        double doubleValue = ((java.lang.Number) obj2).doubleValue();
        kotlin.jvm.internal.o.g(item, "item");
        item.f319974h = doubleValue;
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (w0Var != null && (fVar = w0Var.f420773t) != null) {
            go0.f0 f0Var = ((hn0.p) fVar).f282400b;
            f0Var.getClass();
            f0Var.l(new go0.b0(f0Var, item));
        }
        return jz5.f0.f302826a;
    }
}
