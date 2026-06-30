package eh3;

/* loaded from: classes11.dex */
public final class a implements com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f334444a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh3.d f334445b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.t80 f334446c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f334447d;

    public a(java.util.List list, eh3.d dVar, r45.t80 t80Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f334444a = list;
        this.f334445b = dVar;
        this.f334446c = t80Var;
        this.f334447d = h0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u
    public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.z3 it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remark: ");
        java.lang.String w07 = it.w0();
        eh3.d dVar = this.f334445b;
        sb6.append(eh3.d.b(dVar, w07));
        sb6.append(" -> ");
        r45.t80 t80Var = this.f334446c;
        r45.du5 du5Var = (r45.du5) t80Var.m75936x14adae67(0);
        sb6.append(eh3.d.b(dVar, du5Var != null ? du5Var.f454289d : null));
        this.f334444a.add(sb6.toString());
        r45.du5 du5Var2 = (r45.du5) t80Var.m75936x14adae67(0);
        it.n1(du5Var2 != null ? du5Var2.f454289d : null);
        com.p314xaae8f345.mm.p2621x8fb0427b.ya yaVar = (com.p314xaae8f345.mm.p2621x8fb0427b.ya) this.f334447d.f391656d;
        r45.du5 du5Var3 = (r45.du5) t80Var.m75936x14adae67(0);
        yaVar.f66692x4854b29d = du5Var3 != null ? du5Var3.f454289d : null;
    }
}
