package cl;

/* loaded from: classes7.dex */
public class e2 implements com.eclipsesource.mmv8.JavaCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cl.h2 f42623b;

    public e2(cl.h2 h2Var, cl.q0 q0Var) {
        this.f42623b = h2Var;
        this.f42622a = q0Var;
    }

    @Override // com.eclipsesource.mmv8.JavaCallback
    public java.lang.Object invoke(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Array v8Array) {
        cl.i0 i0Var = null;
        if (v8Array.length() < 2 || v8Array.getType(0) != 10 || v8Array.getType(1) != 4) {
            com.tencent.mars.xlog.Log.w("MicroMsg.V8DirectApiSharedBuffer", "get invalid parameters");
            return null;
        }
        com.eclipsesource.mmv8.V8ArrayBuffer v8ArrayBuffer = (com.eclipsesource.mmv8.V8ArrayBuffer) v8Array.get(0);
        java.lang.String mode = v8Array.getString(1);
        cl.s sVar = this.f42623b.f42655c;
        cl.i0.f42658d.getClass();
        kotlin.jvm.internal.o.g(mode, "mode");
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = mode.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        if (kotlin.jvm.internal.o.b(lowerCase, "r")) {
            i0Var = cl.i0.f42659e;
        } else {
            java.lang.String lowerCase2 = mode.toLowerCase(locale);
            kotlin.jvm.internal.o.f(lowerCase2, "toLowerCase(...)");
            if (kotlin.jvm.internal.o.b(lowerCase2, "rw")) {
                i0Var = cl.i0.f42660f;
            }
        }
        cl.j0 j0Var = (cl.j0) sVar;
        j0Var.getClass();
        cl.q0 v86 = this.f42622a;
        kotlin.jvm.internal.o.g(v86, "v8");
        kotlin.jvm.internal.o.g(v8ArrayBuffer, "v8ArrayBuffer");
        int incrementAndGet = j0Var.f42667b.incrementAndGet();
        ((java.util.HashMap) j0Var.f42666a).put(java.lang.Integer.valueOf(incrementAndGet), new cl.k0(v86, v8ArrayBuffer, i0Var));
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareBufferTracerManager", "trace[" + incrementAndGet + ']');
        com.tencent.mars.xlog.Log.i("MicroMsg.V8DirectApiSharedBuffer", "trace, traceId:%d", java.lang.Integer.valueOf(incrementAndGet));
        return java.lang.Integer.valueOf(incrementAndGet);
    }
}
