package u81;

/* loaded from: classes7.dex */
public final class a0 extends u81.t {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f506934f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(u81.f0 f0Var, u81.k0 k0Var) {
        super(f0Var, k0Var);
        this.f506934f = f0Var;
    }

    @Override // u81.j0, k75.c
    public void a() {
        super.a();
        android.os.Message obtain = android.os.Message.obtain(this.f506934f.f386380e);
        u81.u uVar = u81.u.NONE;
        obtain.what = 4;
        long j17 = u81.h.f506964f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f506934f.f386379d, "enter with lifespanMillis:" + j17);
        if (j17 > 0) {
            k75.j jVar = this.f506934f.f386380e;
            if (jVar == null) {
                return;
            }
            jVar.sendMessageDelayed(obtain, j17);
            return;
        }
        k75.j jVar2 = this.f506934f.f386380e;
        if (jVar2 == null) {
            return;
        }
        jVar2.sendMessage(obtain);
    }

    @Override // k75.c
    public void b() {
        k75.j jVar = this.f506934f.f386380e;
        u81.u uVar = u81.u.NONE;
        jVar.removeMessages(4);
    }

    @Override // u81.t, k75.c
    public boolean c(android.os.Message message) {
        int ordinal = u81.u.a(message.what).ordinal();
        if (ordinal != 3) {
            if (ordinal == 5 || ordinal == 16 || ordinal == 17) {
                return true;
            }
            return super.c(message);
        }
        u81.f0 f0Var = this.f506934f;
        if (f0Var.f506958w) {
            u81.e0.a(f0Var.C, 1);
            u81.f0.r(f0Var);
        } else {
            f0Var.x(f0Var.f506950o);
        }
        return true;
    }

    @Override // k75.c, k75.a
    /* renamed from: getName */
    public java.lang.String mo51017xfb82e301() {
        return "|StateBackgroundTemporaryPostHomePressed";
    }
}
