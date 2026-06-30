package ah3;

/* loaded from: classes11.dex */
public final class d implements vg3.o3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f4870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f4871e;

    public d(kotlin.jvm.internal.f0 f0Var, java.util.Set set) {
        this.f4870d = f0Var;
        this.f4871e = set;
    }

    @Override // vg3.o3
    public void f(com.tencent.mm.storage.z3 z3Var) {
    }

    @Override // vg3.o3
    public void i(java.lang.String str, java.lang.String str2) {
        boolean z17 = true;
        this.f4870d.f310116d++;
        if (str != null && !r26.n0.N(str)) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        this.f4871e.add(str);
    }

    @Override // vg3.o3
    public void q(com.tencent.mm.storage.z3 z3Var) {
    }

    @Override // vg3.o3
    public void t(com.tencent.mm.storage.z3 z3Var) {
        boolean z17 = true;
        this.f4870d.f310116d++;
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        if (d17 != null && !r26.n0.N(d17)) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        this.f4871e.add(d17);
    }
}
