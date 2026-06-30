package cl;

/* loaded from: classes7.dex */
public class z3 extends cl.u3 {

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.ThreadLocal f42843p = new java.lang.ThreadLocal();

    /* renamed from: o, reason: collision with root package name */
    public final cl.a4 f42844o;

    public z3(cl.a4 a4Var, boolean z17) {
        super("MicroMsg.WASMCompatibleV8JSRuntimeLooper", z17);
        this.f42844o = a4Var;
    }

    @Override // cl.u3
    public void g() {
        super.g();
        cl.a4 a4Var = this.f42844o;
        if (a4Var != null) {
            ((cl.s3) a4Var).f42762a.A.getV8().pumpMessageLoopDirect();
            f(new cl.z3$$a());
        }
    }
}
