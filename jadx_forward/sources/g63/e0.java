package g63;

/* loaded from: classes8.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.f0 f350635d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g63.f0 f0Var) {
        super(2);
        this.f350635d = f0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        g63.t0 t0Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.util.List result = (java.util.List) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        g63.f0 f0Var = this.f350635d;
        if (booleanValue) {
            g63.j jVar = f0Var.f350640b;
            jVar.getClass();
            pm0.v.X(new g63.i(jVar, result));
            g63.t0 t0Var2 = f0Var.f350639a;
            if (t0Var2 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16045xfe36c025) t0Var2).T6().f83286e.N(result.size());
            }
            if (result.size() < 10 && (t0Var = f0Var.f350639a) != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16045xfe36c025) t0Var).f223525h = false;
            }
        } else {
            g63.t0 t0Var3 = f0Var.f350639a;
            if (t0Var3 != null) {
                pm0.v.X(new g63.l0((com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16045xfe36c025) t0Var3));
            }
        }
        return jz5.f0.f384359a;
    }
}
