package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class x7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f229206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f229207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.zg5 f229208f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f229209g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229210h;

    public x7(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d, r45.zg5 zg5Var, android.app.Dialog dialog, java.lang.String str) {
        this.f229207e = activityC16371xf216ae6d;
        this.f229208f = zg5Var;
        this.f229209g = dialog;
        this.f229210h = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[fetchLqtDetail] WalletGetUserInfoEvent callback() hasCallback:%s", java.lang.Boolean.valueOf(this.f229206d));
        if (!this.f229206d) {
            r45.zg5 qryUsrFundDetailRes = this.f229208f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(qryUsrFundDetailRes, "$qryUsrFundDetailRes");
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d.Y6(this.f229207e, qryUsrFundDetailRes, this.f229209g, this.f229210h);
        }
        this.f229206d = true;
    }
}
