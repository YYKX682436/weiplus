package ns2;

/* loaded from: classes3.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ov2 f420911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f420912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ns2.g f420913f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ns2.b f420914g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r45.ov2 ov2Var, r45.h32 h32Var, ns2.g gVar, ns2.b bVar) {
        super(1);
        this.f420911d = ov2Var;
        this.f420912e = h32Var;
        this.f420913f = gVar;
        this.f420914g = bVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dd couponCallback = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dd) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(couponCallback, "couponCallback");
        zl2.g gVar = zl2.g.f555303a;
        java.lang.String m75945x2fec8307 = this.f420911d.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        r45.h32 h32Var = this.f420912e;
        java.lang.String m75945x2fec83072 = h32Var.m75945x2fec8307(4);
        gVar.c(m75945x2fec8307, m75945x2fec83072 != null ? m75945x2fec83072 : "", false);
        r45.ov2 ov2Var = couponCallback.f213422a;
        r45.l1 l1Var = (r45.l1) ov2Var.m75936x14adae67(19);
        if (l1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a.b(l1Var);
        }
        ns2.g gVar2 = this.f420913f;
        ns2.a aVar = gVar2.f420916e;
        ns2.b bVar = this.f420914g;
        if (aVar != null) {
            java.lang.String username = bVar.f420889b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            r45.h32 h32Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mj) aVar).f200609a.f199164u;
            if (h32Var2 != null) {
                zl2.t.f(h32Var2, ov2Var);
            }
        }
        ns2.a aVar2 = gVar2.f420916e;
        if (aVar2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mj) aVar2).a(bVar.f420889b, h32Var, (bVar.f420896i || bVar.f420897j) ? false : true);
        }
        return jz5.f0.f384359a;
    }
}
