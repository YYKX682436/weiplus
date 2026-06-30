package ec3;

/* loaded from: classes9.dex */
public final class n0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f332597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f332598f;

    public n0(java.lang.String str, boolean z17, ec3.g1 g1Var) {
        this.f332596d = str;
        this.f332597e = z17;
        this.f332598f = g1Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doGetCgiTimer] inputText: " + this.f332596d + "，interruptRecommend : " + this.f332597e);
        if (!this.f332597e) {
            ec3.g1 g1Var = this.f332598f;
            java.lang.String str = this.f332596d;
            g1Var.getClass();
            if (str == null || str.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgi] inputContent is null");
                ((ku5.t0) ku5.t0.f394148d).B(new ec3.t(g1Var));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgi] start: " + str);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[12];
                objArr[0] = 13;
                objArr[1] = 0;
                objArr[2] = g1Var.f332559w;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = g1Var.m158354x19263085();
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
                objArr[3] = activityC16373x8a110f13 != null ? activityC16373x8a110f13.s7() : null;
                objArr[4] = "";
                objArr[5] = "";
                objArr[6] = str;
                objArr[7] = java.lang.Integer.valueOf(g1Var.f332544e.size());
                objArr[8] = g1Var.f332560x;
                objArr[9] = 0;
                objArr[10] = "";
                objArr[11] = 0;
                g0Var.d(18890, objArr);
                pq5.g l17 = new ec3.a(str, g1Var.f332559w, 0).l();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = g1Var.m158354x19263085();
                l17.f(m158354x192630852 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630852 : null);
                l17.K(new ec3.y(g1Var, str));
            }
        }
        return true;
    }
}
