package my2;

/* loaded from: classes.dex */
public final class g0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ my2.k0 f414264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.me2 f414265b;

    public g0(my2.k0 k0Var, r45.me2 me2Var) {
        this.f414264a = k0Var;
        this.f414265b = me2Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        my2.k0 k0Var = this.f414264a;
        k0Var.A.b();
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.me2 me2Var = this.f414265b;
            if (me2Var != null) {
                me2Var.set(4, 1);
            }
            if (me2Var != null) {
                me2Var.set(3, 0);
            }
            k0Var.u1();
        }
        return jz5.f0.f384359a;
    }
}
