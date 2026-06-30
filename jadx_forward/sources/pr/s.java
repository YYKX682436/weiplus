package pr;

/* loaded from: classes11.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.u3 f439310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.u3 f439311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pr.t f439312f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var, com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2, pr.t tVar) {
        super(3);
        this.f439310d = u3Var;
        this.f439311e = u3Var2;
        this.f439312f = tVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.util.List needInfoList = (java.util.List) obj2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(needInfoList, "needInfoList");
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = this.f439310d;
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = this.f439311e;
        if (booleanValue) {
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() + 86400000));
            gm0.j1.u().c().x(u3Var2, java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(164L, 0L, 1L, false);
            new pr.h(needInfoList, gVar, new pr.r(this.f439312f, u3Var2));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(164L, 1L, 1L, false);
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() + 3600000));
            gm0.j1.u().c().x(u3Var2, java.lang.Boolean.TRUE);
        }
        return jz5.f0.f384359a;
    }
}
