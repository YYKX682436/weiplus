package dk2;

/* loaded from: classes3.dex */
public final class e2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f314875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp f314876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f314878g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.g f314879h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ek2.i2 f314880i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(dk2.r4 r4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp jpVar, java.lang.String str, int i17, dk2.g gVar, ek2.i2 i2Var) {
        super(1);
        this.f314875d = r4Var;
        this.f314876e = jpVar;
        this.f314877f = str;
        this.f314878g = i17;
        this.f314879h = gVar;
        this.f314880i = i2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pr4.a it = (pr4.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f314875d.f315542d, "[WeCoin] doPostGift consumeGift onFailed errorType:" + it.f439518a);
        int i17 = dk2.d2.f314843a[it.f439518a.ordinal()] == 1 ? com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6 : 10008;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp jpVar = this.f314876e;
        if (jpVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ip ipVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ip.f194535f;
            java.lang.String str = this.f314877f;
            int i18 = this.f314878g;
            dk2.g gVar = this.f314879h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp.b(jpVar, false, i17, ipVar, str, null, i18, gVar != null ? gVar.f315000b : null, null, this.f314880i, 144, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8 y8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184265a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184272h, 81L);
        return jz5.f0.f384359a;
    }
}
