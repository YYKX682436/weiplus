package bn2;

/* loaded from: classes3.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final bn2.s f104422d = new bn2.s();

    public s() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        hn0.f fVar;
        lo0.b0 item = (lo0.b0) obj;
        double doubleValue = ((java.lang.Number) obj2).doubleValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        item.f401507h = doubleValue;
        tn0.w0 w0Var = dk2.ef.f314911d;
        if (w0Var != null && (fVar = w0Var.f502306t) != null) {
            go0.f0 f0Var = ((hn0.p) fVar).f363933b;
            f0Var.getClass();
            f0Var.l(new go0.b0(f0Var, item));
        }
        return jz5.f0.f384359a;
    }
}
