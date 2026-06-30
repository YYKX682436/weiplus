package ka2;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 f387567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ha2.a f387568e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 activityC13659x4f0951e4, ha2.a aVar) {
        super(3);
        this.f387567d = activityC13659x4f0951e4;
        this.f387568e = aVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String poiId = (java.lang.String) obj;
        java.lang.String productId = (java.lang.String) obj2;
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiId, "poiId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productId, "productId");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4.P;
        this.f387567d.m7(this.f387568e, productId, booleanValue);
        return jz5.f0.f384359a;
    }
}
