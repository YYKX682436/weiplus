package ec3;

/* loaded from: classes9.dex */
public final class z0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f332639a;

    public z0(ec3.g1 g1Var) {
        this.f332639a = g1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public final boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[openClickLiteApp] callback actionName: " + str);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("returntomakeredenvelopspage", str)) {
            return false;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new ec3.y0(this.f332639a));
        return false;
    }
}
