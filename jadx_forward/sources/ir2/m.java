package ir2;

/* loaded from: classes2.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f375711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f375712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ir2.o f375713f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, boolean z17, ir2.o oVar) {
        super(1);
        this.f375711d = abstractC14490x69736cb5;
        this.f375712e = z17;
        this.f375713f = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List dataList = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        int i17 = 0;
        for (java.lang.Object obj2 : dataList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.j5 j5Var = (so2.j5) obj2;
            if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                long m59260x51f8f5b0 = abstractC14490x69736cb5.getFeedObject().m59260x51f8f5b0();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = this.f375711d;
                if (m59260x51f8f5b0 == abstractC14490x69736cb52.getFeedObject().m59260x51f8f5b0()) {
                    abstractC14490x69736cb52.V1(abstractC14490x69736cb5.getShowLikeTips());
                    abstractC14490x69736cb52.X1(abstractC14490x69736cb5.getShowShareSns());
                    if (this.f375712e) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DefaultLoaderActions", "updateByLocalId " + abstractC14490x69736cb52.getFeedObject().m59260x51f8f5b0());
                        ir2.o oVar = this.f375713f;
                        oVar.getClass();
                        oVar.f(i17, 1, 1, abstractC14490x69736cb52);
                    }
                }
            }
            i17 = i18;
        }
        return jz5.f0.f384359a;
    }
}
