package eh3;

/* loaded from: classes11.dex */
public final class c implements com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f334451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh3.d f334452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.t80 f334453c;

    public c(java.util.List list, eh3.d dVar, r45.t80 t80Var) {
        this.f334451a = list;
        this.f334452b = dVar;
        this.f334453c = t80Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u
    public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.z3 it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remarkQuanpin: ");
        java.lang.String U0 = it.U0();
        eh3.d dVar = this.f334452b;
        sb6.append(eh3.d.b(dVar, U0));
        sb6.append(" -> ");
        r45.t80 t80Var = this.f334453c;
        r45.du5 du5Var = (r45.du5) t80Var.m75936x14adae67(2);
        sb6.append(eh3.d.b(dVar, du5Var != null ? du5Var.f454289d : null));
        this.f334451a.add(sb6.toString());
        r45.du5 du5Var2 = (r45.du5) t80Var.m75936x14adae67(2);
        it.S1(du5Var2 != null ? du5Var2.f454289d : null);
    }
}
