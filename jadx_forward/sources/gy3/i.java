package gy3;

/* loaded from: classes13.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final gy3.j f359106d;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.OutputStream f359107e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f359108f;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.lang.Runnable f359109g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f359110h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f359111i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f359112m;

    public i(gy3.j mSession, android.bluetooth.BluetoothSocket socket) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mSession, "mSession");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(socket, "socket");
        this.f359106d = mSession;
        this.f359110h = new java.util.LinkedList();
        this.f359111i = new java.util.LinkedList();
        this.f359112m = new java.lang.Object();
        try {
            this.f359107e = socket.getOutputStream();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.SendThread", "output sockets not created", e17);
            this.f359107e = null;
            ((gy3.d) this.f359106d.f359114a).h("Can not get write stream");
        }
        this.f359109g = this;
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SendThread", "SendThread cancel");
        this.f359109g = null;
        this.f359108f = true;
        synchronized (this.f359112m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SendThread", "mLock.notify");
            this.f359112m.notify();
        }
        this.f359111i.clear();
        this.f359110h.clear();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SendThread", "BEGIN SendThread");
        if (this.f359107e == null) {
            return;
        }
        while (true) {
            if (this.f359108f) {
                break;
            }
            if (this.f359109g == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.SendThread", "Send thread has been close. just leave");
                break;
            }
            if (!this.f359111i.isEmpty()) {
                byte[] bArr = (byte[]) this.f359111i.pop();
                if (bArr != null) {
                    if (!(bArr.length == 0)) {
                        try {
                            java.io.OutputStream outputStream = this.f359107e;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(outputStream);
                            outputStream.write(bArr);
                            ((gy3.d) this.f359106d.f359114a).i(true, bArr.length);
                        } catch (java.io.IOException unused) {
                            ((gy3.d) this.f359106d.f359114a).i(false, bArr.length);
                        }
                    }
                }
                ((gy3.d) this.f359106d.f359114a).i(false, 0);
            } else if (this.f359110h.isEmpty()) {
                synchronized (this.f359112m) {
                    if (this.f359110h.isEmpty()) {
                        try {
                            this.f359112m.wait();
                        } catch (java.lang.InterruptedException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Rtos.SendThread", e17, "", new java.lang.Object[0]);
                        }
                    }
                }
            } else {
                synchronized (this.f359112m) {
                    if (true ^ this.f359110h.isEmpty()) {
                        this.f359111i.addAll(this.f359110h);
                        this.f359110h.clear();
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SendThread", "FINISH SendThread");
    }
}
