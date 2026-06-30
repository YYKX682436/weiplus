package y;

/* loaded from: classes14.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y.h1 f539886d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(y.h1 h1Var) {
        super(1);
        this.f539886d = h1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        z.d2 d2Var = (z.d2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d2Var, "$this$null");
        y.g0 g0Var = y.g0.PreEnter;
        y.g0 g0Var2 = y.g0.Visible;
        z.e2 e2Var = (z.e2) d2Var;
        boolean a17 = e2Var.a(g0Var, g0Var2);
        y.h1 h1Var = this.f539886d;
        if (a17) {
            y.u uVar = (y.u) h1Var.f539892f.mo128745x754a37bb();
            if (uVar != null) {
                obj2 = uVar.f539984c;
            }
            obj2 = null;
        } else if (e2Var.a(g0Var2, y.g0.PostExit)) {
            y.u uVar2 = (y.u) h1Var.f539893g.mo128745x754a37bb();
            if (uVar2 != null) {
                obj2 = uVar2.f539984c;
            }
            obj2 = null;
        } else {
            obj2 = y.x0.f540006e;
        }
        return obj2 == null ? y.x0.f540006e : obj2;
    }
}
