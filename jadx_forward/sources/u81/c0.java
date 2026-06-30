package u81;

/* loaded from: classes7.dex */
public class c0 extends u81.j0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f506942e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(u81.f0 f0Var, u81.k0 k0Var) {
        super(k0Var);
        this.f506942e = f0Var;
    }

    @Override // u81.j0, k75.c
    public void a() {
        super.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f506942e.f506956u, "invokeEnterMethods: %s appId:%s, lifespanAfterSuspend:%d, stopped:%b", mo51017xfb82e301(), this.f506942e.f506957v.f156336n, java.lang.Integer.valueOf(this.f506942e.f506957v.E0().f387384q), java.lang.Boolean.valueOf(this.f506942e.f506960y.get()));
        if (this.f506942e.f506960y.get()) {
            return;
        }
        k75.j jVar = this.f506942e.f386380e;
        u81.u uVar = u81.u.NONE;
        jVar.sendEmptyMessageDelayed(11, this.f506942e.f506957v.E0().f387384q * 1000);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 C0 = this.f506942e.f506957v.C0();
        if (C0 != null) {
            C0.n1();
        }
    }

    @Override // k75.c
    public void b() {
        k75.j jVar = this.f506942e.f386380e;
        u81.u uVar = u81.u.NONE;
        jVar.removeMessages(11);
    }

    @Override // k75.c
    public boolean c(android.os.Message message) {
        int ordinal = u81.u.a(message.what).ordinal();
        if (ordinal == 2) {
            u81.f0 f0Var = this.f506942e;
            f0Var.x(f0Var.f506947i);
            return true;
        }
        if (ordinal != 4) {
            if (ordinal == 7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f506942e.f506956u, "processMessage: %s, ON_SUSPEND_TIMEOUT, appId:%s", mo51017xfb82e301(), this.f506942e.f506957v.f156336n);
                this.f506942e.w();
                return true;
            }
            if (ordinal != 19) {
                if (ordinal != 23) {
                    return false;
                }
                u81.f0 f0Var2 = this.f506942e;
                if (f0Var2.f506958w) {
                    u81.e0.a(f0Var2.C, 4);
                    d();
                }
                return true;
            }
        }
        u81.f0 f0Var3 = this.f506942e;
        f0Var3.x(f0Var3.f506948m);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 C0 = this.f506942e.f506957v.C0();
        if (C0 != null) {
            C0.q1();
        }
        return true;
    }

    public void d() {
        u81.f0 f0Var = this.f506942e;
        if (f0Var.C.f506945a != 0) {
            f0Var.x(f0Var.f506950o);
        }
    }

    @Override // k75.c, k75.a
    /* renamed from: getName */
    public java.lang.String mo51017xfb82e301() {
        return "|Suspend";
    }
}
