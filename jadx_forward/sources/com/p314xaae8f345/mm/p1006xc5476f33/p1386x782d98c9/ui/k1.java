package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes15.dex */
public class k1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a f181074a;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a activityC13462x5ea70b8a) {
        this.f181074a = activityC13462x5ea70b8a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2
    public void a(int i17, java.lang.Object... objArr) {
        if (i17 != 0 || objArr == null || objArr.length < 2) {
            return;
        }
        java.lang.Object obj = objArr[0];
        if ((obj instanceof java.lang.Integer) && (objArr[1] instanceof java.lang.Integer)) {
            int intValue = ((java.lang.Integer) obj).intValue();
            int intValue2 = ((java.lang.Integer) objArr[1]).intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a activityC13462x5ea70b8a = this.f181074a;
            if (activityC13462x5ea70b8a.F.isHeld()) {
                activityC13462x5ea70b8a.F.release();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "AirKiss jni callback (%d, %d)", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
            if (intValue == 0 && intValue2 == 0) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.h1(this));
            } else {
                activityC13462x5ea70b8a.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.j1(this));
            }
        }
    }
}
