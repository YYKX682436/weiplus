package dm3;

/* loaded from: classes11.dex */
public final class b0 extends com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 implements b66.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm3.e0 f323204d;

    public b0(dm3.e0 e0Var) {
        this.f323204d = e0Var;
    }

    @Override // b66.t
    public void o(byte[] item, int i17, byte[] msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (i17 == 3) {
            dm3.e0 e0Var = this.f323204d;
            if (e0Var.f323220s) {
                return;
            }
            e0Var.f323220s = true;
            ku5.u0 u0Var = ku5.t0.f394148d;
            dm3.d0 d0Var = new dm3.d0(e0Var);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            e0Var.f323221t = t0Var.z(d0Var, 5000L, false);
        }
    }

    @Override // b66.t
    public void x(long j17, long j18, long j19) {
        pm0.v.X(new dm3.a0(this.f323204d, j17));
    }
}
