package com.tencent.mm.plugin.fcm;

/* loaded from: classes12.dex */
public class FCMInstanceIDListenerService extends com.google.firebase.iid.FirebaseInstanceIdService {
    @Override // com.google.firebase.iid.FirebaseInstanceIdService
    public void e() {
        java.lang.String c17 = com.google.firebase.iid.FirebaseInstanceId.b().c();
        com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FCMInstanceIDListenerService", "Refreshed token: " + c17);
        if (!gm0.j1.b().n()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FCM.FCMInstanceIDListenerService", "User is not logined, not reg token");
            return;
        }
        a92.b b17 = a92.b.b();
        if (b17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FCM.FCMInstanceIDListenerService", "fcmRegister null, not reg token");
            return;
        }
        jz5.g gVar = a92.f.f2420a;
        ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.FCM.FcmTokenManager");
        b17.c(c17);
    }
}
