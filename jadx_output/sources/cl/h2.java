package cl;

/* loaded from: classes7.dex */
public class h2 extends cl.r1 {

    /* renamed from: b, reason: collision with root package name */
    public final cl.t f42654b;

    /* renamed from: c, reason: collision with root package name */
    public final cl.s f42655c;

    public h2(cl.t tVar, cl.s sVar) {
        super("WeixinArrayBuffer");
        this.f42654b = tVar;
        this.f42655c = sVar;
    }

    @Override // cl.r1
    public void a() {
        cl.j0 j0Var = (cl.j0) this.f42655c;
        j0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareBufferTracerManager", "untraceAll");
        ((java.util.HashMap) j0Var.f42666a).clear();
    }

    @Override // cl.r1
    public void c(cl.q0 q0Var, com.eclipsesource.mmv8.V8Object v8Object) {
        v8Object.registerJavaMethod(new cl.d2(this), "get");
        v8Object.registerJavaMethod(new cl.e2(this, q0Var), "trace");
        v8Object.registerJavaMethod(new cl.f2(this), "untrace");
        v8Object.registerJavaMethod(new cl.g2(this), "getTraceBuffer");
    }
}
