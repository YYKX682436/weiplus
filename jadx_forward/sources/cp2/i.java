package cp2;

/* loaded from: classes2.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp2.k f302350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f302351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc f302352f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 f302353g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(cp2.k kVar, java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var) {
        super(1);
        this.f302350d = kVar;
        this.f302351e = obj;
        this.f302352f = c14500x958689dc;
        this.f302353g = n0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        fp0.r task = (fp0.r) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        cp2.k kVar = this.f302350d;
        java.lang.String m56464xb5886c64 = kVar.m56464xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[call] pullType=");
        cp2.l lVar = (cp2.l) this.f302351e;
        sb6.append(lVar.f302367a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
        cp2.g gVar = new cp2.g(kVar.f302362d, task);
        cp2.f fVar = kVar.f302363e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
        fVar.E0(lVar, new cp2.h(kVar, this.f302352f, this.f302353g, task), gVar);
        return jz5.f0.f384359a;
    }
}
