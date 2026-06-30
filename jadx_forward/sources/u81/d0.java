package u81;

/* loaded from: classes7.dex */
public final class d0 extends u81.c0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f506943f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(u81.f0 f0Var, u81.k0 k0Var) {
        super(f0Var, k0Var);
        this.f506943f = f0Var;
    }

    @Override // u81.c0, u81.j0, k75.c
    public void a() {
        super.a();
        k75.j jVar = this.f506943f.f386380e;
        u81.u uVar = u81.u.NONE;
        jVar.removeMessages(11);
        this.f506943f.H.a(this);
    }

    @Override // u81.c0, k75.c
    public void b() {
        super.b();
        this.f506943f.H.b(this);
    }

    @Override // u81.c0, k75.c
    public boolean c(android.os.Message message) {
        int ordinal = u81.u.a(message.what).ordinal();
        if (ordinal != 5) {
            u81.f0 f0Var = this.f506943f;
            if (ordinal != 7) {
                if (ordinal == 18) {
                    if (f0Var.f506958w) {
                        u81.e0.b(f0Var.C, 2);
                        d();
                    } else {
                        f0Var.x(f0Var.f506949n);
                    }
                    return true;
                }
                if (ordinal != 22) {
                    return super.c(message);
                }
                if (f0Var.f506958w) {
                    u81.e0.b(f0Var.C, 4);
                    d();
                }
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(f0Var.f386379d, "ignore ON_SUSPEND_TIMEOUT");
        }
        return true;
    }

    @Override // u81.c0
    public void d() {
        u81.f0 f0Var = this.f506943f;
        if (f0Var.C.f506945a != 0) {
            return;
        }
        f0Var.x(f0Var.f506949n);
    }

    @Override // u81.c0, k75.c, k75.a
    /* renamed from: getName */
    public java.lang.String mo51017xfb82e301() {
        return "|StateSuspendKeepAlive";
    }
}
