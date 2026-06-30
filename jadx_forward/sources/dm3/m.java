package dm3;

/* loaded from: classes11.dex */
public final class m extends com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 implements b66.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm3.o f323246d;

    public m(dm3.o oVar) {
        this.f323246d = oVar;
    }

    @Override // b66.t
    public void o(byte[] item, int i17, byte[] msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (i17 == 3) {
            dm3.o oVar = this.f323246d;
            if (oVar.f323260t) {
                return;
            }
            oVar.f323260t = true;
            ku5.u0 u0Var = ku5.t0.f394148d;
            dm3.n nVar = new dm3.n(oVar);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            oVar.f323261u = t0Var.z(nVar, 5000L, false);
        }
    }

    @Override // b66.t
    public void x(long j17, long j18, long j19) {
        pm0.v.X(new dm3.l(this.f323246d, j17));
    }
}
