package xg1;

/* loaded from: classes7.dex */
public final class e implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final int f535899d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f535900e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f535901f;

    public e(int i17, java.lang.String TAG, yz5.a onProgressLoadSuccess) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TAG, "TAG");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onProgressLoadSuccess, "onProgressLoadSuccess");
        this.f535899d = i17;
        this.f535900e = onProgressLoadSuccess;
        this.f535901f = "AppBrandPreLoadingServiceConnection[" + TAG + ']';
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        bj1.c aVar;
        java.lang.String str = this.f535901f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onServiceConnected: name = " + componentName);
        int i17 = bj1.b.f102672d;
        if (iBinder == null) {
            aVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.appbrand.preloading.IAppBrandProgressTriggerCall");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof bj1.c)) ? new bj1.a(iBinder) : (bj1.c) queryLocalInterface;
        }
        try {
            if (aVar.c4(0) == 1) {
                this.f535900e.mo152xb9724478();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onServiceConnected: IPC_TRIGGER_PROGRESS_SUCCESS");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onServiceConnected: ", e17);
            xg1.h.f535903a.a(this.f535899d);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535901f, "disconnected");
    }
}
