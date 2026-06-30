package cl;

/* loaded from: classes7.dex */
public class t3 extends cl.a {
    public com.eclipsesource.mmv8.MultiContextV8 A;

    @Override // cl.a
    public void a() {
        ku5.u0 u0Var = ku5.t0.f312615d;
        cl.a$$b a__b = new cl.a$$b();
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.t(a__b, 30000L, null);
        try {
            this.A.release();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.V8JSRuntime", "commonCleanUp exp = %s", e17);
        }
    }

    @Override // cl.a
    public cl.r d() {
        cl.s3 s3Var = new cl.s3(this);
        boolean z17 = this.f42589v.f53952j;
        java.lang.ThreadLocal threadLocal = cl.z3.f42843p;
        if (threadLocal.get() != null) {
            throw new java.lang.RuntimeException("Only one Looper may be created per thread");
        }
        cl.z3 z3Var = new cl.z3(s3Var, z17);
        threadLocal.set(z3Var);
        return z3Var;
    }

    @Override // cl.a
    public com.eclipsesource.mmv8.MultiContextV8 e() {
        java.lang.String str = this.f42575h;
        byte[] bArr = this.f42576i;
        java.lang.String str2 = this.f42577j;
        com.eclipsesource.mmv8.MultiContextV8 createMultiContextV8 = com.eclipsesource.mmv8.MultiContextV8.createMultiContextV8(null, str, bArr, str2, !android.text.TextUtils.isEmpty(str2) && this.f42578k, 2);
        this.A = createMultiContextV8;
        this.f42576i = null;
        return createMultiContextV8;
    }
}
