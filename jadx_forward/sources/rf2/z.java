package rf2;

/* loaded from: classes10.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f476502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f476503f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f476504g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(java.lang.String str, rf2.v0 v0Var, v65.n nVar, ya2.b2 b2Var) {
        super(1);
        this.f476501d = str;
        this.f476502e = v0Var;
        this.f476503f = nVar;
        this.f476504g = b2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        c61.p2 p2Var = (c61.p2) ((c61.yb) i95.n0.c(c61.yb.class));
        java.lang.String str = this.f476501d;
        boolean rj6 = p2Var.rj(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f476502e.f476449c, "follow finder " + str + " cgi success = " + booleanValue + ", isFollow = " + rj6);
        v65.n nVar = this.f476503f;
        if (booleanValue && rj6) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be();
            java.lang.String D0 = this.f476504g.D0();
            am.zd zdVar = c5560x6f070be.f135879g;
            zdVar.f90084a = D0;
            zdVar.f90085b = 4;
            zdVar.f90086c = true;
            c5560x6f070be.e();
            nVar.a(java.lang.Boolean.TRUE);
        } else {
            nVar.a(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f384359a;
    }
}
