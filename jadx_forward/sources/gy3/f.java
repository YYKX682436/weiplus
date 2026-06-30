package gy3;

/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final gy3.j f359098a;

    /* renamed from: b, reason: collision with root package name */
    public final android.bluetooth.BluetoothDevice f359099b;

    /* renamed from: c, reason: collision with root package name */
    public android.bluetooth.BluetoothSocket f359100c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f359101d;

    public f(gy3.j mSession, android.bluetooth.BluetoothDevice mDevice) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mSession, "mSession");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mDevice, "mDevice");
        this.f359098a = mSession;
        this.f359099b = mDevice;
        this.f359101d = new gy3.e("RtosBluetoothThreads_handlerThread", this);
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBluetoothThreads", "------disconnect------");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f359101d;
        if (!n3Var.mo50308x2936bf5f(n3Var.mo50289x733c63a2(1))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "sendMessage = %d failed!!!", 1);
        }
        n3Var.m77787xbe88f509();
    }

    public final void b(java.lang.Exception e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "socket connect failed (" + e17 + ')');
        try {
            android.bluetooth.BluetoothSocket bluetoothSocket = this.f359100c;
            if (bluetoothSocket != null) {
                bluetoothSocket.close();
            }
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "Close socket failed!!! (" + e18 + ')');
        } catch (java.lang.NullPointerException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "Close socket null!!! (" + e19 + ')');
        }
        ((gy3.d) this.f359098a.f359114a).g();
    }
}
