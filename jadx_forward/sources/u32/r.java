package u32;

/* loaded from: classes13.dex */
public class r implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public u32.q f505889d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f505890e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f505891f = new java.util.LinkedList();

    public void a(android.content.Context context) {
        if (!u32.s.a(context)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceServiceConnection", "ensureServiceInstance return false");
        } else if (l85.h1.a(new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1388x7643c6b5.C13454x7b51e96c.class), this, 1, "exdevice", true, j45.l.e("exdevice"))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceServiceConnection", "bind exdeviceservice success");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExDeviceServiceConnection", "bind exdeviceservice failed");
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        u32.a0 yVar;
        boolean z17;
        java.util.ArrayList arrayList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceServiceConnection", "onServiceConnected");
        int i17 = u32.z.f505934d;
        if (iBinder == null) {
            yVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
            yVar = (queryLocalInterface == null || !(queryLocalInterface instanceof u32.a0)) ? new u32.y(iBinder) : (u32.a0) queryLocalInterface;
        }
        u32.k1 k1Var = new u32.k1(yVar);
        u32.h1.c().f180539a = k1Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.k();
        i32.b bVar = i32.b.f369651d;
        if (bVar == null) {
            bVar = new i32.b();
            i32.b.f369651d = bVar;
        }
        try {
            yVar.Di(bVar);
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "registOnDeviceRequest failed!!! %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RDeviceTaskDispatcher", e17, "", new java.lang.Object[0]);
        }
        try {
            k1Var.f505851a.xc(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.a.f180375d);
        } catch (android.os.RemoteException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "mDispatcher.registExDeviceInvokerHandler failed!!, %s", e18.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RDeviceTaskDispatcher", e18, "", new java.lang.Object[0]);
        }
        try {
            z17 = k1Var.f505851a.wi(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ni());
        } catch (android.os.RemoteException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RDeviceTaskDispatcher", e19, "", new java.lang.Object[0]);
            z17 = false;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExDeviceServiceConnection", "simpleBluetoothRegistOnRecv error");
        }
        u32.q qVar = this.f505889d;
        if (qVar != null) {
            qVar.a();
        }
        this.f505890e = true;
        synchronized (this.f505891f) {
            arrayList = new java.util.ArrayList(this.f505891f);
            ((java.util.LinkedList) this.f505891f).clear();
        }
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            java.lang.Runnable runnable = (java.lang.Runnable) arrayList.get(i18);
            if (runnable != null) {
                runnable.run();
            }
        }
        arrayList.clear();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceServiceConnection", "onServiceDisconnected");
        this.f505890e = false;
        u32.h1.c().f180539a = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.k();
        if (ob0.r3.b()) {
            if (!gm0.j1.b().n() || gm0.m.r()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceServiceConnection", "no user login, ignore this disconnection");
            } else {
                a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            }
        }
    }
}
