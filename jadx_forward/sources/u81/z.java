package u81;

/* loaded from: classes7.dex */
public final class z extends u81.t {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f507023f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(u81.f0 f0Var, u81.k0 k0Var) {
        super(f0Var, k0Var);
        this.f507023f = f0Var;
    }

    @Override // u81.j0, k75.c
    public void a() {
        super.a();
        this.f507023f.H.a(this);
        android.os.Message obtain = android.os.Message.obtain(this.f507023f.f386380e);
        u81.u uVar = u81.u.NONE;
        obtain.what = 4;
        long j17 = u81.h.f506963e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f507023f.f386379d, "enter with lifespanMillis:" + j17);
        if (j17 > 0) {
            k75.j jVar = this.f507023f.f386380e;
            if (jVar == null) {
                return;
            }
            jVar.sendMessageDelayed(obtain, j17);
            return;
        }
        k75.j jVar2 = this.f507023f.f386380e;
        if (jVar2 == null) {
            return;
        }
        jVar2.sendMessage(obtain);
    }

    @Override // k75.c
    public void b() {
        k75.j jVar = this.f507023f.f386380e;
        u81.u uVar = u81.u.NONE;
        jVar.removeMessages(4);
        this.f507023f.H.b(this);
    }

    @Override // u81.t, k75.c
    public boolean c(android.os.Message message) {
        int ordinal = u81.u.a(message.what).ordinal();
        u81.f0 f0Var = this.f507023f;
        if (ordinal != 3) {
            if (ordinal != 5) {
                if (ordinal != 18) {
                    return super.c(message);
                }
                f0Var.x(f0Var.f506948m);
            }
            return true;
        }
        if (f0Var.f506958w) {
            u81.e0.a(f0Var.C, 2);
            u81.f0.r(f0Var);
        } else {
            f0Var.x(f0Var.f506950o);
        }
        return true;
    }

    @Override // k75.c, k75.a
    /* renamed from: getName */
    public java.lang.String mo51017xfb82e301() {
        return "|StateBackgroundTemporaryDuringScreenOff";
    }
}
