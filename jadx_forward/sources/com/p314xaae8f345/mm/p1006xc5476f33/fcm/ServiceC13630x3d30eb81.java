package com.p314xaae8f345.mm.p1006xc5476f33.fcm;

/* renamed from: com.tencent.mm.plugin.fcm.FCMInstanceIDListenerService */
/* loaded from: classes12.dex */
public class ServiceC13630x3d30eb81 extends com.p176xb6135e39.p271xde6bf207.iid.ServiceC2745x22326c9e {
    @Override // com.p176xb6135e39.p271xde6bf207.iid.ServiceC2745x22326c9e
    public void e() {
        java.lang.String c17 = com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.b().c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FCMInstanceIDListenerService", "Refreshed token: " + c17);
        if (!gm0.j1.b().n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FCM.FCMInstanceIDListenerService", "User is not logined, not reg token");
            return;
        }
        a92.b b17 = a92.b.b();
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FCM.FCMInstanceIDListenerService", "fcmRegister null, not reg token");
            return;
        }
        jz5.g gVar = a92.f.f83953a;
        ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.FCM.FcmTokenManager");
        b17.c(c17);
    }
}
