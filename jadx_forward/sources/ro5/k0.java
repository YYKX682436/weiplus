package ro5;

/* loaded from: classes14.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f479761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f479762e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f479763f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(yz5.l lVar, ro5.m1 m1Var, int i17) {
        super(2);
        this.f479761d = lVar;
        this.f479762e = m1Var;
        this.f479763f = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        int intValue = ((java.lang.Number) obj).intValue();
        so5.b bVar = (so5.b) this.f479761d.mo146xb9724478(java.lang.Long.valueOf(((java.lang.Number) obj2).longValue()));
        ro5.m1 m1Var = this.f479762e;
        ro5.d0 d0Var = m1Var.f479779h;
        if (d0Var != null) {
            ((ro5.n) d0Var).a(this.f479763f, bVar.f492325a.getWidth(), bVar.f492325a.getHeight(), bVar.f492327c, bVar.f492328d);
        }
        dp5.d dVar = ((yo5.e) m1Var.f479775d.f537331i.mo141623x754a37bb()).f545898n;
        if (dVar != null) {
            z17 = ro5.m1.a(m1Var, this.f479763f, dVar, new ro5.j0(bVar, m1Var, intValue));
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
