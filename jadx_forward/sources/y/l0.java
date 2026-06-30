package y;

/* loaded from: classes14.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y.y0 f539925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y.a1 f539926e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(y.y0 y0Var, y.a1 a1Var) {
        super(3);
        this.f539925d = y0Var;
        this.f539926e = a1Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object obj4;
        z.d2 animateFloat = (z.d2) obj;
        ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animateFloat, "$this$animateFloat");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(-57153604);
        y.g0 g0Var = y.g0.PreEnter;
        y.g0 g0Var2 = y.g0.Visible;
        z.e2 e2Var = (z.e2) animateFloat;
        if (e2Var.a(g0Var, g0Var2)) {
            y.i1 i1Var = ((y.z0) this.f539925d).f540019a.f539839a;
            if (i1Var == null || (obj4 = i1Var.f539902b) == null) {
                obj4 = y.x0.f540004c;
            }
        } else if (e2Var.a(g0Var2, y.g0.PostExit)) {
            y.i1 i1Var2 = ((y.b1) this.f539926e).f539845a.f539839a;
            if (i1Var2 == null || (obj4 = i1Var2.f539902b) == null) {
                obj4 = y.x0.f540004c;
            }
        } else {
            obj4 = y.x0.f540004c;
        }
        y0Var.o(false);
        return obj4;
    }
}
