package cl;

/* loaded from: classes7.dex */
public class h2 extends cl.r1 {

    /* renamed from: b, reason: collision with root package name */
    public final cl.t f124187b;

    /* renamed from: c, reason: collision with root package name */
    public final cl.s f124188c;

    public h2(cl.t tVar, cl.s sVar) {
        super("WeixinArrayBuffer");
        this.f124187b = tVar;
        this.f124188c = sVar;
    }

    @Override // cl.r1
    public void a() {
        cl.j0 j0Var = (cl.j0) this.f124188c;
        j0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareBufferTracerManager", "untraceAll");
        ((java.util.HashMap) j0Var.f124199a).clear();
    }

    @Override // cl.r1
    public void c(cl.q0 q0Var, com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        c1477x4679881.mo16337x1af320a6(new cl.d2(this), "get");
        c1477x4679881.mo16337x1af320a6(new cl.e2(this, q0Var), "trace");
        c1477x4679881.mo16337x1af320a6(new cl.f2(this), "untrace");
        c1477x4679881.mo16337x1af320a6(new cl.g2(this), "getTraceBuffer");
    }
}
