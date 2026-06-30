package k55;

/* loaded from: classes8.dex */
public class j implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k55.k f386002d;

    public j(k55.k kVar) {
        this.f386002d = kVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        k55.h fVar;
        int i17 = k55.g.f386000d;
        if (iBinder == null) {
            fVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.remoteservice.ICommRemoteServer");
            fVar = (queryLocalInterface == null || !(queryLocalInterface instanceof k55.h)) ? new k55.f(iBinder) : (k55.h) queryLocalInterface;
        }
        k55.k kVar = this.f386002d;
        kVar.f386004b = fVar;
        java.util.List list = kVar.f386003a;
        for (java.lang.Runnable runnable : (java.lang.Runnable[]) ((java.util.LinkedList) list).toArray(new java.lang.Runnable[((java.util.LinkedList) list).size()])) {
            if (runnable != null) {
                runnable.run();
            }
        }
        ((java.util.LinkedList) kVar.f386003a).clear();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        k55.k kVar = this.f386002d;
        kVar.f386004b = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unbindService(kVar.f386005c);
    }
}
