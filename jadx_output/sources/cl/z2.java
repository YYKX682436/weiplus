package cl;

/* loaded from: classes7.dex */
public class z2 implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.k3 f42841a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f42842b;

    public z2(cl.l3 l3Var, cl.k3 k3Var, long j17) {
        this.f42841a = k3Var;
        this.f42842b = j17;
    }

    @Override // cl.j1
    public void a(java.lang.String str, cl.k1 k1Var) {
        cl.k3 k3Var = this.f42841a;
        if (k3Var != null) {
            ((com.tencent.mm.plugin.appbrand.y9) k3Var).a(java.lang.System.currentTimeMillis() - this.f42842b);
        }
    }
}
