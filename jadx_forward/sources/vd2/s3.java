package vd2;

/* loaded from: classes3.dex */
public final class s3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd2.g5 f517444a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vd2.g5 f517445b;

    public s3(vd2.g5 g5Var, vd2.g5 g5Var2) {
        this.f517444a = g5Var;
        this.f517445b = g5Var2;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0 && fVar.f152149b == 0) {
            vd2.g5 g5Var = this.f517444a;
            if (g5Var != null) {
                g5Var.a(null);
                return f0Var;
            }
        } else {
            vd2.g5 g5Var2 = this.f517445b;
            if (g5Var2 != null) {
                g5Var2.a(java.lang.Integer.valueOf(fVar.f152149b));
                return f0Var;
            }
        }
        return null;
    }
}
