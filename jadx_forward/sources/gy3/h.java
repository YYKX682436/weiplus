package gy3;

/* loaded from: classes13.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final gy3.j f359102d;

    /* renamed from: e, reason: collision with root package name */
    public final android.bluetooth.BluetoothSocket f359103e;

    /* renamed from: f, reason: collision with root package name */
    public final java.io.InputStream f359104f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f359105g;

    public h(gy3.j mSession, android.bluetooth.BluetoothSocket mSocket) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mSession, "mSession");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mSocket, "mSocket");
        this.f359102d = mSession;
        this.f359103e = mSocket;
        this.f359104f = null;
        try {
            this.f359104f = mSocket.getInputStream();
        } catch (java.io.IOException e17) {
            this.f359104f = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RecvThread", "socket.getInputStream failed!!! (%s)", e17.toString());
            ((gy3.d) this.f359102d.f359114a).h("Can not get read stream");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        gy3.j jVar = this.f359102d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RecvThread", "BEGIN RecvThread");
        java.io.InputStream inputStream = this.f359104f;
        if (inputStream == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RecvThread", "socket.getInputStream failed!!! Just Leave");
            return;
        }
        byte[] bArr = new byte[com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb];
        while (!this.f359105g) {
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inputStream);
                int read = inputStream.read(bArr);
                if (read > 0) {
                    byte[] bArr2 = new byte[read];
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, read);
                    gy3.d dVar = (gy3.d) jVar.f359114a;
                    dVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "recv--------, data size = " + java.lang.Integer.valueOf(read));
                    gy3.c cVar = dVar.f359092g;
                    cVar.mo50308x2936bf5f(cVar.mo50292x733c63a2(4, bArr2));
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RecvThread", "mInStream.read Failed!!! (%s)", e17.toString());
                ((gy3.d) jVar.f359114a).g();
                try {
                    this.f359103e.close();
                    return;
                } catch (java.io.IOException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RecvThread", "Close socket failed!!! (%s)", e18.toString());
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RecvThread", "Cancel is called while receiving data, just leave");
    }
}
