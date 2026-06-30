package qe5;

/* loaded from: classes9.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.o f443670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.e0 f443671e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(qe5.o oVar, qi3.e0 e0Var) {
        super(0);
        this.f443670d = oVar;
        this.f443671e = e0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qe5.o oVar = this.f443670d;
        if (!oVar.m158354x19263085().isFinishing() && !oVar.m158354x19263085().isDestroyed()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22713x95c5cea1 z17 = oVar.V6().z();
            qi3.e0 e0Var = this.f443671e;
            z17.m82113x3ae760af(a06.d.b(e0Var.f445231h));
            qi3.g0 g0Var = qi3.g0.f445245n;
            qi3.g0 g0Var2 = e0Var.f445224a;
            if (g0Var2 == g0Var) {
                if (e0Var.a() == 0) {
                    j75.f Q6 = oVar.Q6();
                    if (Q6 != null) {
                        Q6.B3(new kd5.i(true));
                    }
                } else if (e0Var.a() != -510001) {
                    oVar.V6().y().setText(com.p314xaae8f345.mm.R.C30867xcad56011.h0a);
                }
                oVar.f443695g = false;
            } else if (g0Var2 == qi3.g0.f445242h) {
                oVar.f443695g = true;
            }
            oVar.W6();
        }
        return jz5.f0.f384359a;
    }
}
