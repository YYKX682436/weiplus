package bt2;

/* loaded from: classes3.dex */
public final class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.bw2 f24187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km2.m f24188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f24189c;

    public g(r45.bw2 bw2Var, km2.m mVar, kotlin.jvm.internal.h0 h0Var) {
        this.f24187a = bw2Var;
        this.f24188b = mVar;
        this.f24189c = h0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str;
        r45.y23 y23Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        r45.bw2 bw2Var = this.f24187a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.bv1 bv1Var = (r45.bv1) fVar.f70618d;
            if (bv1Var == null || (y23Var = (r45.y23) bv1Var.getCustom(3)) == null || (str = y23Var.getString(17)) == null) {
                str = "";
            }
            r45.y23 y23Var2 = (r45.y23) bw2Var.getCustom(4);
            if (y23Var2 != null) {
                y23Var2.set(17, str);
            }
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "shop report requestId replay enter cgiback, ".concat(str));
        }
        bt2.h.O6(this.f24188b, (java.lang.String) this.f24189c.f310123d, bw2Var);
        return jz5.f0.f302826a;
    }
}
