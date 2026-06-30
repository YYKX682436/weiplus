package cl;

/* loaded from: classes7.dex */
public class t3 extends cl.a {
    public com.p159x477cd522.p160x333422.C1460x397c7778 A;

    @Override // cl.a
    public void a() {
        ku5.u0 u0Var = ku5.t0.f394148d;
        cl.RunnableC1397x2ca3e1 runnableC1397x2ca3e1 = new cl.RunnableC1397x2ca3e1();
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.t(runnableC1397x2ca3e1, 30000L, null);
        try {
            this.A.m15878x41012807();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.V8JSRuntime", "commonCleanUp exp = %s", e17);
        }
    }

    @Override // cl.a
    public cl.r d() {
        cl.s3 s3Var = new cl.s3(this);
        boolean z17 = this.f124122v.f135485j;
        java.lang.ThreadLocal threadLocal = cl.z3.f124376p;
        if (threadLocal.get() != null) {
            throw new java.lang.RuntimeException("Only one Looper may be created per thread");
        }
        cl.z3 z3Var = new cl.z3(s3Var, z17);
        threadLocal.set(z3Var);
        return z3Var;
    }

    @Override // cl.a
    public com.p159x477cd522.p160x333422.C1460x397c7778 e() {
        java.lang.String str = this.f124108h;
        byte[] bArr = this.f124109i;
        java.lang.String str2 = this.f124110j;
        com.p159x477cd522.p160x333422.C1460x397c7778 m15863x2a86af74 = com.p159x477cd522.p160x333422.C1460x397c7778.m15863x2a86af74(null, str, bArr, str2, !android.text.TextUtils.isEmpty(str2) && this.f124111k, 2);
        this.A = m15863x2a86af74;
        this.f124109i = null;
        return m15863x2a86af74;
    }
}
