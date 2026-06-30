package cl;

/* loaded from: classes7.dex */
public class z2 implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.k3 f124374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f124375b;

    public z2(cl.l3 l3Var, cl.k3 k3Var, long j17) {
        this.f124374a = k3Var;
        this.f124375b = j17;
    }

    @Override // cl.j1
    public void a(java.lang.String str, cl.k1 k1Var) {
        cl.k3 k3Var = this.f124374a;
        if (k3Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y9) k3Var).a(java.lang.System.currentTimeMillis() - this.f124375b);
        }
    }
}
