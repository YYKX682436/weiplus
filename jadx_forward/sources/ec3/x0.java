package ec3;

/* loaded from: classes9.dex */
public final class x0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f332634a;

    public x0(ec3.g1 g1Var) {
        this.f332634a = g1Var;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[openClickLiteApp] OpenLiteApp failed");
        ((ku5.t0) ku5.t0.f394148d).B(new ec3.v0(this.f332634a));
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[openClickLiteApp] OpenLiteApp success");
        ((ku5.t0) ku5.t0.f394148d).B(new ec3.w0(this.f332634a));
    }
}
