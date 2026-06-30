package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes15.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a f180970d;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a activityC13462x5ea70b8a) {
        this.f180970d = activityC13462x5ea70b8a;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a.I;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a activityC13462x5ea70b8a = this.f180970d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13462x5ea70b8a.X6())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "User has input password.");
            return;
        }
        activityC13462x5ea70b8a.f180750g.setText(activityC13462x5ea70b8a.f180755o.f416008f);
        android.text.Editable text = activityC13462x5ea70b8a.f180750g.getText();
        if (text != null) {
            android.text.Selection.setSelection(text, text.length());
        }
    }
}
