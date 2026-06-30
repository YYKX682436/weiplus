package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes.dex */
public class tk implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17453xf4ad1945 f243114a;

    public tk(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17453xf4ad1945 activityC17453xf4ad1945) {
        this.f243114a = activityC17453xf4ad1945;
    }

    @Override // wd0.p1
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsPersonalInfoUI", "changeSwitchWechatForStatus2CommonTips onCancalBtn.");
    }

    @Override // wd0.p1
    /* renamed from: onSuccess */
    public void mo977xe05b4124() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsPersonalInfoUI", "changeSwitchWechatForStatus2CommonTips onPositionBtn. ConfigStorageLogic.getExtStatus2FromUserInfo() = " + c01.z1.i());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21650, 0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("launch_from_webview", false);
        intent.putExtra("isWecoinAuth", true);
        j45.l.k(this.f243114a.mo55332x76847179(), "wallet", ".wecoin.ui.WeCoinRechargeView", intent, true);
    }
}
