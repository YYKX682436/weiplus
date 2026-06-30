package dk2;

/* loaded from: classes3.dex */
public final class d4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp f314845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f314847f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314848g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp jpVar, java.lang.String str, int i17, java.lang.String str2) {
        super(1);
        this.f314845d = jpVar;
        this.f314846e = str;
        this.f314847f = i17;
        this.f314848g = str2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pr4.a it = (pr4.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[WeCoin] consumeImpl onFailed errorType:");
        pr4.j jVar = it.f439518a;
        sb6.append(jVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAssistant2", sb6.toString());
        int i17 = dk2.c4.f314809a[jVar.ordinal()] == 1 ? com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6 : 10008;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp jpVar = this.f314845d;
        if (jpVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp.b(jpVar, false, i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ip.f194535f, this.f314846e, null, this.f314847f, this.f314848g, null, null, 400, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8 y8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184265a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184272h, 81L);
        return jz5.f0.f384359a;
    }
}
