package jq1;

/* loaded from: classes13.dex */
public class g extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f382608a;

    public g(xu5.b bVar, jq1.h hVar) {
        super(bVar);
        this.f382608a = null;
        this.f382608a = new java.lang.ref.WeakReference(hVar);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        jq1.h hVar = (jq1.h) this.f382608a.get();
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothChatThreads", "null == connectTread");
            return;
        }
        int i17 = message.what;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            if (!hVar.f382613e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.ConnectThread", "Remoto device is aready disconnect, just leave");
                return;
            }
            try {
                hVar.f382609a.close();
                return;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ConnectThread", "socket close failed (%s)", e17.toString());
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ConnectThread", "------connectImp------");
        if (hVar.f382613e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.ConnectThread", "Remoto device is aready connect, just leave");
            return;
        }
        try {
            if (hVar.f382610b) {
                hVar.f382609a = hVar.f382614f.createRfcommSocketToServiceRecord(jq1.e.f382592i);
            } else {
                hVar.f382609a = hVar.f382614f.createInsecureRfcommSocketToServiceRecord(jq1.e.f382593j);
            }
            try {
                hVar.f382609a.connect();
                hVar.f382613e = true;
                jq1.f fVar = hVar.f382611c;
                jq1.e eVar = hVar.f382612d;
                android.bluetooth.BluetoothSocket bluetoothSocket = hVar.f382609a;
                fVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothChatSession", "connected");
                jq1.i iVar = fVar.f382605d;
                if (iVar != null) {
                    iVar.a();
                    fVar.f382605d = null;
                }
                jq1.j jVar = fVar.f382606e;
                if (jVar != null) {
                    jVar.f382621d = null;
                    jVar.f382627m = true;
                    synchronized (jVar) {
                        jVar.notify();
                    }
                    jVar.f382624g.clear();
                    jVar.f382623f.clear();
                    fVar.f382606e = null;
                }
                fVar.f382605d = new jq1.i(fVar, eVar, bluetoothSocket);
                ((ku5.t0) ku5.t0.f394148d).q(fVar.f382605d);
                fVar.f382606e = new jq1.j(fVar, eVar, bluetoothSocket);
                ((ku5.t0) ku5.t0.f394148d).q(fVar.f382606e);
                jq1.e eVar2 = hVar.f382612d;
                if (eVar2 != null) {
                    eVar2.f382594a.a(hVar.f382611c.f382603b, true);
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ConnectThread", "socket connect failed (%s)", e18.toString());
                try {
                    hVar.f382609a.close();
                } catch (java.io.IOException e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ConnectThread", "Close socket failed!!! (%s)", e19.toString());
                }
                jq1.e eVar3 = hVar.f382612d;
                if (eVar3 != null) {
                    eVar3.f382594a.a(hVar.f382611c.f382603b, false);
                }
            }
        } catch (java.io.IOException e27) {
            hVar.f382609a = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ConnectThread", "createRfcommSocket Failed!!! (%s)", e27.toString());
            jq1.e eVar4 = hVar.f382612d;
            if (eVar4 != null) {
                eVar4.f382594a.a(hVar.f382611c.f382603b, false);
            }
        }
    }
}
