package cw1;

/* loaded from: classes3.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 f304855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f304856e;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 activityC13107x4291ddb8, yz5.a aVar) {
        this.f304855d = activityC13107x4291ddb8;
        this.f304856e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[2];
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8.f177179n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 activityC13107x4291ddb8 = this.f304855d;
        lVarArr[0] = new jz5.l("storage_ui_version", java.lang.Integer.valueOf(activityC13107x4291ddb8.T6() ? 2 : 1));
        lVarArr[1] = new jz5.l("storage_enter_scene", java.lang.Integer.valueOf(activityC13107x4291ddb8.f177185i));
        ((cy1.a) rVar).Hj("chat_history_clean_all_double_ack_btn", "view_clk", kz5.c1.k(lVarArr), 32903);
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.X6(activityC13107x4291ddb8, activityC13107x4291ddb8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nhw), activityC13107x4291ddb8.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), activityC13107x4291ddb8.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), new cw1.s(activityC13107x4291ddb8, this.f304856e));
    }
}
