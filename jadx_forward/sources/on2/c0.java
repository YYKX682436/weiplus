package on2;

/* loaded from: classes3.dex */
public final class c0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ on2.v0 f428387a;

    public c0(on2.v0 v0Var) {
        this.f428387a = v0Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        try {
            boolean z17 = true;
            if (new org.json.JSONObject((java.lang.String) obj).optInt("accept") != 1) {
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryAudienceUIC", "accepted");
                on2.v0.O6(this.f428387a);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryAudienceUIC", "not accepted");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderLiveLotteryAudienceUIC", e17, "parse back value failed", new java.lang.Object[0]);
        }
    }
}
