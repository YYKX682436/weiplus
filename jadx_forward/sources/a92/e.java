package a92;

/* loaded from: classes12.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f83952d;

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmTokenManager", "pollingTaskForNewFcmToken, loop=" + this.f83952d);
        int i17 = this.f83952d;
        if (i17 > 5) {
            return;
        }
        this.f83952d = i17 + 1;
        java.lang.String c17 = com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.b().c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmTokenManager", "tryRetrieveNewToken: " + c17);
        if (android.text.TextUtils.isEmpty(c17)) {
            ((ku5.t0) ku5.t0.f394148d).l(this, java.util.concurrent.TimeUnit.SECONDS.toMillis(10L), "MicroMsg.FCM.FcmTokenManager");
        } else {
            jz5.g gVar = a92.f.f83953a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmTokenManager", "registerFcmTokenToServer");
            a92.b b17 = a92.b.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
            b17.c(c17);
        }
    }
}
