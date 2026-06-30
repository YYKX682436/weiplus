package vn2;

/* loaded from: classes2.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f519769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 f519770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.q1 f519771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519772g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(jz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122, ym5.q1 q1Var, java.lang.String str) {
        super(0);
        this.f519769d = lVar;
        this.f519770e = abstractC13919x46aff122;
        this.f519771f = q1Var;
        this.f519772g = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ey2.g1 g1Var = (ey2.g1) pf5.u.f435469a.e(c61.l7.class).a(ey2.g1.class);
        jz5.l lVar = this.f519769d;
        g1Var.P6(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) lVar.f384367e).mo2128x1ed62e84());
        java.util.AbstractCollection m56388xcaeb60d0 = this.f519770e.m56388xcaeb60d0();
        java.lang.Object obj = lVar.f384367e;
        m56388xcaeb60d0.remove(obj);
        java.lang.Object obj2 = lVar.f384366d;
        ym5.q1 q1Var = this.f519771f;
        if (q1Var != null) {
            q1Var.mo56053xb9568715(((java.lang.Number) obj2).intValue(), 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f519772g, "deleteSeeLater removeAt " + ((java.lang.Number) obj2).intValue() + "  " + ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj).getFeedObject());
        return jz5.f0.f384359a;
    }
}
