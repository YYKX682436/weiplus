package dr4;

/* loaded from: classes14.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.d2 f324303d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(dr4.d2 d2Var) {
        super(1);
        this.f324303d = d2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        is0.c cVar = (is0.c) obj;
        if (cVar != null) {
            dr4.d2 d2Var = this.f324303d;
            dr4.r1 r1Var = d2Var.f324219l;
            if (r1Var != null) {
                r1Var.F(!cVar.f375929f);
            }
            d2Var.d(new dr4.m(d2Var, cVar));
            d2Var.i(cVar);
        }
        return jz5.f0.f384359a;
    }
}
