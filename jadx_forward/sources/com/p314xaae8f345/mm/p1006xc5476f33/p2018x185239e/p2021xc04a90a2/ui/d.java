package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes.dex */
public class d implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17114xc078d367 f238192a;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17114xc078d367 activityC17114xc078d367) {
        this.f238192a = activityC17114xc078d367;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "on receive value: %s", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("payState", "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || !optString.equals(ya.b.f77504xbb80cbe3)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "mini program pay success, go to launcherUI");
            android.content.Intent intent = new android.content.Intent();
            intent.setComponent(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.ui.LauncherUI"));
            intent.addFlags(67108864);
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17114xc078d367 activityC17114xc078d367 = this.f238192a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC17114xc078d367, arrayList.toArray(), "com/tencent/mm/plugin/remittance/mobile/ui/BankMobileRemittanceChooseUI$3", "onReceiveValue", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC17114xc078d367.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC17114xc078d367, "com/tencent/mm/plugin/remittance/mobile/ui/BankMobileRemittanceChooseUI$3", "onReceiveValue", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", e17, "parse mini program response error", e17);
        }
    }
}
