package ke5;

/* loaded from: classes9.dex */
public class v implements he5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ke5.x f388666a;

    public v(ke5.x xVar) {
        this.f388666a = xVar;
    }

    public boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2) {
        ke5.x xVar = this.f388666a;
        yb5.d dVar = xVar.f388574b;
        if (dVar == null || dVar.f542241c.a(sb5.g0.class) == null) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n7 n7Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n7) ((sb5.g0) xVar.f388574b.f542241c.a(sb5.g0.class));
        n7Var.getClass();
        java.lang.String str = xVar.f388575c;
        if (!(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? false : com.p314xaae8f345.mm.p2621x8fb0427b.z3.j4(str))) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "checkIfNeedGroupMsg");
        n7Var.r0();
        return n7Var.m0(f9Var, f9Var2);
    }
}
