package rk4;

/* loaded from: classes11.dex */
public abstract class x3 extends com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 implements w71.r0 {

    /* renamed from: d, reason: collision with root package name */
    public static final rk4.w3 f478604d = new rk4.w3(null);

    public abstract void a(w71.t0 t0Var, java.util.Map map, yz5.l lVar);

    @Override // w71.r0
    public void x7(w71.t0 t0Var, yz5.l lVar) {
        if (t0Var != null) {
            a(t0Var, t0Var instanceof rk4.y3 ? ((rk4.y3) t0Var).f478631e : kz5.c1.t(km4.f.c(t0Var.nb())), lVar);
        } else {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PlatformHybridRouter", "handleOpen params cannot be null", null);
        }
    }
}
