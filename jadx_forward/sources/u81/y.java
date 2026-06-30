package u81;

/* loaded from: classes7.dex */
public final class y extends u81.t {

    /* renamed from: f, reason: collision with root package name */
    public boolean f507021f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f507022g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(u81.f0 f0Var, u81.k0 k0Var) {
        super(f0Var, k0Var);
        this.f507022g = f0Var;
    }

    @Override // u81.j0, k75.c
    public void a() {
        boolean z17;
        super.a();
        if (this.f507022g.f506960y.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f507022g.f506956u, "invokeEnterMethods: %s, sm stopped", "|BackgroundTemporary");
            return;
        }
        if (this.f507022g.f506957v.E0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f507022g.f506956u, "invokeEnterMethods: %s, NULL sysConfig, transitionTo StateSuspend", "|BackgroundTemporary");
            u81.f0 f0Var = this.f507022g;
            if (f0Var.f506958w) {
                u81.f0.r(f0Var);
                return;
            } else {
                f0Var.x(f0Var.f506949n);
                return;
            }
        }
        if (this.f507022g.f506957v.E0().f387383p == Integer.MAX_VALUE) {
            return;
        }
        android.os.Message d17 = this.f507022g.d();
        if (d17 != null) {
            u81.u uVar = u81.u.NONE;
            if (5 != d17.what) {
                java.lang.Object obj = d17.obj;
                if (obj instanceof android.os.Message) {
                    android.os.Message message = (android.os.Message) obj;
                    if (5 == message.what) {
                        message.recycle();
                    }
                }
            }
            z17 = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f507022g.f506956u, "invokeEnterMethods %s, awakenInBackground:%b", "|BackgroundTemporary", java.lang.Boolean.valueOf(z17));
            android.os.Message obtain = android.os.Message.obtain(this.f507022g.f386380e);
            u81.u uVar2 = u81.u.NONE;
            obtain.what = 4;
            android.os.Bundle bundle = new android.os.Bundle(1);
            bundle.putBoolean("awakenInBackground", z17);
            obtain.obj = bundle;
            this.f507022g.f386380e.sendMessageDelayed(obtain, this.f507022g.f506957v.E0().f387383p * 1000);
        }
        z17 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f507022g.f506956u, "invokeEnterMethods %s, awakenInBackground:%b", "|BackgroundTemporary", java.lang.Boolean.valueOf(z17));
        android.os.Message obtain2 = android.os.Message.obtain(this.f507022g.f386380e);
        u81.u uVar22 = u81.u.NONE;
        obtain2.what = 4;
        android.os.Bundle bundle2 = new android.os.Bundle(1);
        bundle2.putBoolean("awakenInBackground", z17);
        obtain2.obj = bundle2;
        this.f507022g.f386380e.sendMessageDelayed(obtain2, this.f507022g.f506957v.E0().f387383p * 1000);
    }

    @Override // k75.c
    public void b() {
        k75.j jVar = this.f507022g.f386380e;
        u81.u uVar = u81.u.NONE;
        jVar.removeMessages(4);
        this.f507021f = false;
        this.f507022g.H.b(this);
    }

    @Override // u81.t, k75.c
    public boolean c(android.os.Message message) {
        int ordinal = u81.u.a(message.what).ordinal();
        if (ordinal != 3) {
            if (ordinal != 6) {
                if (ordinal != 18) {
                    return super.c(message);
                }
                this.f507021f = false;
                this.f507022g.H.b(this);
                return true;
            }
            this.f507021f = true;
            this.f507022g.H.a(this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f507022g.f386379d, "BackgroundTemporary process ON_SYSTEM_SCREEN_OFF, no suicide");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f507022g.f506956u, "BackgroundTemporary process ON_SYSTEM_SCREEN_OFF");
            u81.f0 f0Var = this.f507022g;
            f0Var.x(f0Var.f506951p);
            return true;
        }
        if (this.f507022g.f506957v.x0().t()) {
            u81.f0 f0Var2 = this.f507022g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f0Var2.f506956u, "%s process TO_SUSPEND_FROM_BACKGROUND, transfer to onSuspendTimeout directly due to HeadlessPage, appId:%s", "|BackgroundTemporary", f0Var2.f506957v.f156336n);
            this.f507022g.w();
            return true;
        }
        u81.f0 f0Var3 = this.f507022g;
        if (f0Var3.f506958w) {
            if (this.f507021f) {
                u81.e0.a(f0Var3.C, 2);
            }
            u81.f0.r(this.f507022g);
        } else if (this.f507021f) {
            f0Var3.x(f0Var3.f506950o);
        } else {
            f0Var3.x(f0Var3.f506949n);
        }
        return true;
    }

    @Override // k75.c, k75.a
    /* renamed from: getName */
    public java.lang.String mo51017xfb82e301() {
        return "|BackgroundTemporary";
    }
}
