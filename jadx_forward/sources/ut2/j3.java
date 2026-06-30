package ut2;

/* loaded from: classes3.dex */
public final class j3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f512464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f512465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f512466f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f512467g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(cm2.m0 m0Var, ut2.s3 s3Var, gk2.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar) {
        super(0);
        this.f512464d = m0Var;
        this.f512465e = s3Var;
        this.f512466f = eVar;
        this.f512467g = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("open product from sku:");
        cm2.m0 m0Var = this.f512464d;
        r45.ce0 ce0Var = m0Var.F;
        sb6.append(ce0Var != null ? ce0Var.m75945x2fec8307(0) : null);
        sb6.append(" ,path:");
        r45.ce0 ce0Var2 = m0Var.F;
        sb6.append(ce0Var2 != null ? ce0Var2.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveShoppingViewHolder", sb6.toString());
        ut2.s3 s3Var = this.f512465e;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = s3Var.f374653d;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new ut2.i3(s3Var, this.f512466f, this.f512464d, this.f512467g, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
