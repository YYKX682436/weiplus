package cr0;

/* loaded from: classes12.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f303234a;

    /* renamed from: b, reason: collision with root package name */
    public final int f303235b;

    /* renamed from: c, reason: collision with root package name */
    public gi.w0 f303236c;

    public o4(java.lang.String module, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(module, "module");
        this.f303234a = module;
        this.f303235b = i17;
    }

    public final rh.c1 a() {
        gi.w0 w0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShellPowerProfiler", "finish: " + this.f303234a);
        if (gi.d.e() == null || (w0Var = this.f303236c) == null) {
            return null;
        }
        w0Var.l();
        return w0Var;
    }

    public final void b() {
        gi.w0 w0Var;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (wh.m.x(context)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ShellPowerProfiler", "Use `adb shell dumpsys battery unplug` cmd to emulate discharging status before starting profiler");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                throw new java.lang.IllegalStateException("Use `adb shell dumpsys battery unplug` cmd to emulate discharging status before starting profiler".toString());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShellPowerProfiler", "start: " + this.f303234a);
        if (gi.d.e() != null) {
            ph.u e17 = gi.d.e();
            if (e17 != null) {
                rh.c1 c1Var = new cr0.l4(this, e17.f435829h).f353554a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c1Var, "null cannot be cast to non-null type com.tencent.matrix.manager.MMCompositeMonitors");
                w0Var = (gi.w0) c1Var;
            } else {
                w0Var = null;
            }
            this.f303236c = w0Var;
            if (w0Var != null) {
                w0Var.I();
            }
        }
    }
}
