package a92;

/* loaded from: classes12.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f2419d;

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmTokenManager", "pollingTaskForNewFcmToken, loop=" + this.f2419d);
        int i17 = this.f2419d;
        if (i17 > 5) {
            return;
        }
        this.f2419d = i17 + 1;
        java.lang.String c17 = com.google.firebase.iid.FirebaseInstanceId.b().c();
        com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmTokenManager", "tryRetrieveNewToken: " + c17);
        if (android.text.TextUtils.isEmpty(c17)) {
            ((ku5.t0) ku5.t0.f312615d).l(this, java.util.concurrent.TimeUnit.SECONDS.toMillis(10L), "MicroMsg.FCM.FcmTokenManager");
        } else {
            jz5.g gVar = a92.f.f2420a;
            com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmTokenManager", "registerFcmTokenToServer");
            a92.b b17 = a92.b.b();
            kotlin.jvm.internal.o.d(b17);
            b17.c(c17);
        }
    }
}
