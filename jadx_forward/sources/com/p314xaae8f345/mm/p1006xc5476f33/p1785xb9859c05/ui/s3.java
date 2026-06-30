package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes15.dex */
public class s3 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 f224538a;

    public s3(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 activityC16143x7673980) {
        this.f224538a = activityC16143x7673980;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "start restore");
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 activityC16143x7673980 = this.f224538a;
        activityC16143x7673980.f224195r.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(257L, 14L, 1L, true);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_action_type", 200002);
        intent.putExtra("key_force_google", true);
        j45.l.n(activityC16143x7673980, "wallet_index", ".ui.WalletIapUI", intent, 2002);
        if (activityC16143x7673980.isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "[showLoadingDialog] acitivity is finished.");
        } else {
            activityC16143x7673980.f224199v = db5.e1.Q(activityC16143x7673980.mo55332x76847179(), activityC16143x7673980.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16143x7673980.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3z), true, false, null);
        }
    }
}
