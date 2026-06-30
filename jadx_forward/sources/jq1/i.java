package jq1;

/* loaded from: classes13.dex */
public final class i implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final android.bluetooth.BluetoothSocket f382616d;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.InputStream f382617e;

    /* renamed from: f, reason: collision with root package name */
    public final jq1.f f382618f;

    /* renamed from: g, reason: collision with root package name */
    public final jq1.e f382619g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f382620h = false;

    public i(jq1.f fVar, jq1.e eVar, android.bluetooth.BluetoothSocket bluetoothSocket) {
        this.f382616d = bluetoothSocket;
        this.f382618f = fVar;
        this.f382619g = eVar;
        this.f382617e = null;
        try {
            this.f382617e = bluetoothSocket.getInputStream();
        } catch (java.io.IOException e17) {
            this.f382617e = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RecvThread", "socket.getInputStream failed!!! (%s)", e17.toString());
        }
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RecvThread", "------cancel------");
        if (this.f382620h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.RecvThread", "Cancel is done aready, just leave");
            return;
        }
        this.f382620h = true;
        try {
            this.f382616d.close();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RecvThread", "close() of connect socket failed", e17);
        }
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "BluetoothChatSession_recv";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RecvThread", "BEGIN RecvThread");
        if (this.f382617e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RecvThread", "socket.getInputStream failed!!! Just Leave");
            return;
        }
        byte[] bArr = new byte[2048];
        while (!this.f382620h) {
            try {
                int read = this.f382617e.read(bArr);
                if (read > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RecvThread", "------On data receivce------data length = %d", java.lang.Integer.valueOf(read));
                    a42.i.b(bArr, read);
                    byte[] bArr2 = new byte[read];
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, read);
                    jq1.e eVar = this.f382619g;
                    if (eVar != null) {
                        jq1.c cVar = eVar.f382594a;
                        long j17 = this.f382618f.f382603b;
                        kq1.d dVar = (kq1.d) cVar;
                        dVar.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onRecv*** sessionId = " + j17);
                        iz5.a.g(null, kq1.n.a(dVar.f392772a, 1, 1, 0, new kq1.k(j17, bArr2)));
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RecvThread", "mInStream.read Failed!!! (%s)", e17.toString());
                try {
                    this.f382616d.close();
                    return;
                } catch (java.io.IOException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RecvThread", "Close socket failed!!! (%s)", e18.toString());
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.RecvThread", "Cancel is called while receiving data, just leave");
    }
}
