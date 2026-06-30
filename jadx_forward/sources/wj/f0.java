package wj;

/* loaded from: classes5.dex */
public final class f0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj.j0 f527933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wj.t0 f527934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wj.u0 f527935f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f527936g;

    public f0(wj.j0 j0Var, wj.t0 t0Var, wj.u0 u0Var, java.lang.String str) {
        this.f527933d = j0Var;
        this.f527934e = t0Var;
        this.f527935f = u0Var;
        this.f527936g = str;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        r45.m93 m93Var;
        com.p314xaae8f345.mm.p617xd6d92827.cgi.C4975x585fc1a8 c4975x585fc1a8 = (com.p314xaae8f345.mm.p617xd6d92827.cgi.C4975x585fc1a8) obj;
        if (c4975x585fc1a8 != null) {
            wj.j0 j0Var = this.f527933d;
            wj.t0 t0Var = this.f527934e;
            wj.u0 u0Var = this.f527935f;
            java.lang.String str = this.f527936g;
            if (!c4975x585fc1a8.f134681d) {
                wj.j0.wi(j0Var, t0Var, u0Var, str, wj.o.f527987e, "net", null);
                return;
            }
            r45.m93 m93Var2 = new r45.m93();
            byte[] bArr = c4975x585fc1a8.f134682e;
            if (bArr != null) {
                try {
                    m93Var2.mo11468x92b714fd(bArr);
                    m93Var = m93Var2;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
                if (m93Var == null && m93Var.m75939xb282bd08(0) == 0) {
                    wj.j0.wi(j0Var, t0Var, u0Var, str, wj.o.f527986d, "0", m93Var);
                    return;
                }
                if (m93Var != null || (r8 = java.lang.Integer.valueOf(m93Var.m75939xb282bd08(0)).toString()) == null) {
                    java.lang.String str2 = "null";
                }
                wj.j0.wi(j0Var, t0Var, u0Var, str, wj.o.f527987e, str2, m93Var);
            }
            m93Var = null;
            if (m93Var == null) {
            }
            if (m93Var != null) {
            }
            java.lang.String str22 = "null";
            wj.j0.wi(j0Var, t0Var, u0Var, str, wj.o.f527987e, str22, m93Var);
        }
    }
}
