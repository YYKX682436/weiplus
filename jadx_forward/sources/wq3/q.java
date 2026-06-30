package wq3;

/* loaded from: classes2.dex */
public class q extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f530118d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f530119e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f530120f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f530121g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f530122h;

    public q(java.util.LinkedList linkedList, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.rb5();
        lVar.f152198b = new r45.sb5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/presubmitorder";
        lVar.f152200d = 554;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f530119e = a17;
        r45.rb5 rb5Var = (r45.rb5) a17.f152243a.f152217a;
        rb5Var.f466237e = linkedList;
        rb5Var.f466236d = linkedList != null ? linkedList.size() : 0;
        rb5Var.f466238f = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f530118d = u0Var;
        return mo9409x10f9447a(sVar, this.f530119e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 554;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        int i27;
        r45.sb5 sb5Var = (r45.sb5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 == 0 && i19 == 0 && sb5Var.f467146g == 0) {
            java.lang.String str2 = sb5Var.f467145f;
            this.f530121g = sb5Var.f467144e;
            this.f530120f = str2;
            this.f530122h = sb5Var.f467148i;
        }
        if (i19 == 0 && (i27 = sb5Var.f467146g) != 0) {
            str = sb5Var.f467147h;
            i19 = i27;
        }
        this.f530118d.mo815x76e0bfae(i18, i19, str, this);
    }
}
