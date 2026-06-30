package dk2;

/* loaded from: classes3.dex */
public final class f2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f314955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp f314956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314957f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f314958g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.g f314959h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ek2.i2 f314960i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(dk2.r4 r4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp jpVar, java.lang.String str, int i17, dk2.g gVar, ek2.i2 i2Var) {
        super(0);
        this.f314955d = r4Var;
        this.f314956e = jpVar;
        this.f314957f = str;
        this.f314958g = i17;
        this.f314959h = gVar;
        this.f314960i = i2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f314955d.f315542d, "[WeCoin] doPostGift consumeGift onCancel errorType");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp jpVar = this.f314956e;
        if (jpVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ip ipVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ip.f194535f;
            java.lang.String str = this.f314957f;
            int i17 = this.f314958g;
            dk2.g gVar = this.f314959h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp.b(jpVar, false, -3, ipVar, str, null, i17, gVar != null ? gVar.f315000b : null, null, this.f314960i, 144, null);
        }
        return jz5.f0.f384359a;
    }
}
