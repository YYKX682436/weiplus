package em1;

/* loaded from: classes7.dex */
public class g implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f336575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ em1.h f336576b;

    public g(em1.h hVar, java.lang.Boolean bool) {
        this.f336576b = hVar;
        this.f336575a = bool;
    }

    @Override // cl.j1
    public void a(java.lang.String str, cl.k1 k1Var) {
        em1.h hVar;
        cl.k3 k3Var;
        if (!this.f336575a.booleanValue() || (k3Var = (hVar = this.f336576b).f336580d) == null) {
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y9) k3Var).a(java.lang.System.currentTimeMillis() - hVar.f336577a);
    }
}
