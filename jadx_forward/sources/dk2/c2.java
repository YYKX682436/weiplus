package dk2;

/* loaded from: classes3.dex */
public final class c2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f314801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp f314802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314803f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f314804g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.g f314805h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ek2.i2 f314806i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(dk2.r4 r4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp jpVar, java.lang.String str, int i17, dk2.g gVar, ek2.i2 i2Var) {
        super(1);
        this.f314801d = r4Var;
        this.f314802e = jpVar;
        this.f314803f = str;
        this.f314804g = i17;
        this.f314805h = gVar;
        this.f314806i = i2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pr4.b it = (pr4.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f314801d.f315542d, "[WeCoin] doPostGift consumeGift onSuccess");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp jpVar = this.f314802e;
        if (jpVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ip ipVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ip.f194533d;
            java.lang.String str = this.f314803f;
            java.lang.Long valueOf = java.lang.Long.valueOf(it.f439519a);
            int i17 = this.f314804g;
            dk2.g gVar = this.f314805h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp.b(jpVar, true, 0, ipVar, str, valueOf, i17, gVar != null ? gVar.f315000b : null, null, this.f314806i, 128, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8 y8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184265a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184272h, 79L);
        return jz5.f0.f384359a;
    }
}
