package ir2;

/* loaded from: classes2.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir2.o f375717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f375718e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ir2.o oVar, long j17) {
        super(0);
        this.f375717d = oVar;
        this.f375718e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ir2.o oVar = this.f375717d;
        int i17 = 0;
        for (java.lang.Object obj : oVar.f375721d.f375624d) {
            int i18 = i17 + 1;
            so2.j5 j5Var = null;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.j5 j5Var2 = (so2.j5) obj;
            if (j5Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2;
                long m59260x51f8f5b0 = abstractC14490x69736cb5.getFeedObject().m59260x51f8f5b0();
                long j17 = this.f375718e;
                if (m59260x51f8f5b0 == j17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f17 = cu2.u.f303974a.f(j17);
                    if (f17 != null) {
                        boolean showLikeTips = abstractC14490x69736cb5.getShowLikeTips();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 e17 = oVar.e(f17);
                        e17.V1(showLikeTips);
                        e17.X1(abstractC14490x69736cb5.getShowShareSns());
                        j5Var = e17;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DefaultLoaderActions", "updateProgressByLoalId " + abstractC14490x69736cb5.getFeedObject().m59260x51f8f5b0());
                    oVar.f(i17, 1, new jz5.l(2, 1), j5Var);
                }
            }
            i17 = i18;
        }
        return jz5.f0.f384359a;
    }
}
