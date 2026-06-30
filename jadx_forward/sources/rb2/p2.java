package rb2;

/* loaded from: classes10.dex */
public final class p2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f475259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f475260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475261f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(so2.y0 y0Var, rb2.z2 z2Var, in5.s0 s0Var) {
        super(1);
        this.f475259d = y0Var;
        this.f475260e = z2Var;
        this.f475261f = s0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        so2.y0 y0Var = this.f475259d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76094x9781015 = y0Var.f492236d.u0().m76094x9781015();
        jz5.f0 f0Var = null;
        r45.xk b17 = m76094x9781015 != null ? ya2.d.b(ya2.d.h(m76094x9781015, null, false, 3, null), false) : null;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        in5.s0 s0Var = this.f475261f;
        if (b17 != null) {
            so2.y0 y0Var2 = this.f475259d;
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String m75945x2fec8307 = b17.m75945x2fec8307(0);
            java.lang.String str = m75945x2fec8307 == null ? "" : m75945x2fec8307;
            rb2.z2 z2Var = this.f475260e;
            so2.g0.b(y0Var2, context, str, z2Var.f475219e.mo56026x8fadefe3(), z2Var.f475219e.z0(), "");
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            android.content.Context context2 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            so2.g0.d(y0Var, username, context2, "");
        }
        return f0Var2;
    }
}
