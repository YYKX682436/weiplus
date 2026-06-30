package u81;

/* loaded from: classes7.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public int f506945a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f506946b;

    public e0(u81.f0 f0Var, u81.k kVar) {
        this.f506946b = f0Var;
    }

    public static void a(u81.e0 e0Var, int i17) {
        e0Var.f506945a |= i17;
        u81.f0 f0Var = e0Var.f506946b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f0Var.f506956u, "addSuspendFlag, appId:%s, flag: %d, result: %d", f0Var.f506957v.f156336n, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(e0Var.f506945a));
    }

    public static void b(u81.e0 e0Var, int i17) {
        e0Var.f506945a &= ~i17;
        u81.f0 f0Var = e0Var.f506946b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f0Var.f506956u, "removeSuspendFlag, appId:%s, flag: %d, result: %d", f0Var.f506957v.f156336n, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(e0Var.f506945a));
    }
}
