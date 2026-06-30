package my3;

/* loaded from: classes13.dex */
public final class e0 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final my3.d0 f414332d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f414333e;

    public e0(my3.d0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f414332d = callback;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchServiceConnection", "onServiceConnected");
        this.f414333e = true;
        my3.g gVar = (my3.g) this.f414332d;
        gVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "innerServiceConnection onServiceConnected %s", componentName);
        my3.q qVar = gVar.f414335a;
        qVar.f414369v.d();
        qVar.f414358h = 0;
        java.util.concurrent.locks.ReentrantLock reentrantLock = qVar.f414359i;
        reentrantLock.lock();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("serviceConnectionCallbackList size ");
        java.util.ArrayList arrayList = qVar.f414361n;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", sb6.toString());
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((my3.k) ((fy3.g) it.next())).a();
            }
            arrayList.clear();
        }
        ky3.b bVar = qVar.f414357g;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ky3.b bVar2 = qVar.f414357g;
        bVar.f395149c = currentTimeMillis - bVar2.f395148b;
        bVar2.f395148b = 0L;
        reentrantLock.unlock();
        qVar.f414363p = true;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchServiceConnection", "onServiceDisconnected");
        this.f414333e = false;
        my3.g gVar = (my3.g) this.f414332d;
        gVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "innerServiceConnection onServiceDisconnected %s", componentName);
        my3.q qVar = gVar.f414335a;
        qVar.Ni();
        qVar.f414363p = false;
    }
}
