package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes13.dex */
public class u1 implements java.lang.Runnable {
    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = (android.os.Bundle) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.f177542c2, null, com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p2.class);
        if (bundle != null) {
            wo.v1.a(bundle.getString("device_info", ""));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "hy: can not get device info from mm");
        }
    }
}
