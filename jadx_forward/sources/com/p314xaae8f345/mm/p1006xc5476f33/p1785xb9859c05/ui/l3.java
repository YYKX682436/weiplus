package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes.dex */
public class l3 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 f224432a;

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 activityC16143x7673980) {
        this.f224432a = activityC16143x7673980;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (message.what != 1002) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.IPCallRechargeUI", "unknow message, cannt handle.");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 activityC16143x7673980 = this.f224432a;
        activityC16143x7673980.f224196s.setVisibility(0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16143x7673980.f224191n) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16143x7673980.f224192o)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "showGotoExchangeRecordsAlert");
        db5.e1.C(activityC16143x7673980, activityC16143x7673980.f224192o, activityC16143x7673980.f224191n, activityC16143x7673980.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4c), activityC16143x7673980.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4d), false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m3(activityC16143x7673980));
    }
}
