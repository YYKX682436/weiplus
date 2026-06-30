package em1;

/* loaded from: classes7.dex */
public class h implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f336577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f336578b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f336579c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.k3 f336580d;

    public h(em1.d dVar, java.util.ArrayList arrayList, cl.q0 q0Var, cl.k3 k3Var) {
        this.f336578b = arrayList;
        this.f336579c = q0Var;
        this.f336580d = k3Var;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f336577a = java.lang.System.currentTimeMillis();
    }

    @Override // r.a
    /* renamed from: apply */
    public java.lang.Object mo1850x58b836e(java.lang.Object obj) {
        cl.k3 k3Var;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        java.util.ArrayList arrayList = this.f336578b;
        if (!arrayList.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
            arrayList.clear();
            this.f336579c.b(arrayList2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e3.a(), new em1.g(this, bool));
            return null;
        }
        if (!bool.booleanValue() || (k3Var = this.f336580d) == null) {
            return null;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y9) k3Var).a(java.lang.System.currentTimeMillis() - this.f336577a);
        return null;
    }
}
