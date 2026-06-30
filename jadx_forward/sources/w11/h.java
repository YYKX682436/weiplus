package w11;

/* loaded from: classes8.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final w11.h f523570d = new w11.h();

    public h() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.jl0 jl0Var = new r45.jl0();
        try {
            w11.k kVar = w11.k.f523601a;
            java.lang.Object mo141623x754a37bb = ((jz5.n) w11.k.f523602b).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            byte[] j17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).j(gm0.j1.b().j());
            if (j17 != null) {
                jl0Var.mo11468x92b714fd(j17);
                w11.k.a(kVar, jl0Var);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DoCmdErrorHandler", th6, "ErrorCmdRecord decodeBytes error", new java.lang.Object[0]);
        }
        return jl0Var;
    }
}
