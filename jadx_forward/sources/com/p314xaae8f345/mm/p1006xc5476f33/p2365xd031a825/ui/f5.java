package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class f5 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f261800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261802f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261803g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 f261804h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(false);
        this.f261804h = activityC19116x82bf90f1;
        this.f261800d = i17;
        this.f261801e = str;
        this.f261802f = str2;
        this.f261803g = str3;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1 = this.f261804h;
        g0Var.d(22110, 1, activityC19116x82bf90f1.f261565p);
        int i17 = this.f261800d;
        if (i17 == 0) {
            java.lang.String str = activityC19116x82bf90f1.f261565p;
            java.lang.String str2 = this.f261801e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "finder_uri_username：%s, mTransactionId:%s", str2, str);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).xj(activityC19116x82bf90f1, str2, 16, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.b1.a(1));
            return;
        }
        java.lang.String str3 = this.f261803g;
        java.lang.String str4 = this.f261802f;
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "finder_uri_feedid：%s，finder_uri_nonceid：%s", str4, str3);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "finder_uri_feedid：%s，finder_uri_nonceid：%s，mTransactionId:%s ", str4, str3, activityC19116x82bf90f1.f261565p);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vj(this.f261804h, this.f261802f, this.f261803g, false, 16, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.b1.a(1));
    }
}
