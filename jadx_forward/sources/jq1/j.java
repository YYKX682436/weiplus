package jq1;

/* loaded from: classes13.dex */
public final class j implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Runnable f382621d;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.OutputStream f382622e;

    /* renamed from: h, reason: collision with root package name */
    public final jq1.f f382625h;

    /* renamed from: i, reason: collision with root package name */
    public final jq1.e f382626i;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f382623f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f382624g = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f382627m = false;

    public j(jq1.f fVar, jq1.e eVar, android.bluetooth.BluetoothSocket bluetoothSocket) {
        this.f382621d = null;
        this.f382622e = null;
        this.f382625h = null;
        this.f382626i = null;
        this.f382625h = fVar;
        this.f382626i = eVar;
        try {
            java.io.OutputStream outputStream = bluetoothSocket.getOutputStream();
            this.f382621d = this;
            this.f382622e = outputStream;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.SendThread", "temp sockets not created", e17);
            this.f382622e = null;
            if (this.f382626i != null) {
                this.f382626i.f382594a.b(this.f382625h.f382603b, 11, "Can not get write stream");
            }
        }
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "BluetoothChatSession_send";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.SendThread", "BEGIN SendThread");
        if (this.f382622e == null) {
            return;
        }
        while (!this.f382627m) {
            if (this.f382621d == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.SendThread", "Send thread has been close. just leave");
                return;
            }
            if (!this.f382624g.isEmpty()) {
                try {
                    this.f382622e.write((byte[]) this.f382624g.pop());
                    jq1.e eVar = this.f382626i;
                    if (eVar != null) {
                        eVar.f382594a.c(this.f382625h.f382603b, true);
                    }
                } catch (java.io.IOException unused) {
                    jq1.e eVar2 = this.f382626i;
                    if (eVar2 != null) {
                        eVar2.f382594a.c(this.f382625h.f382603b, false);
                    }
                }
            } else if (this.f382623f.isEmpty()) {
                synchronized (this) {
                    try {
                        wait();
                    } catch (java.lang.InterruptedException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.SendThread", e17, "", new java.lang.Object[0]);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.SendThread", "BluetoothChatThread_SendRunnable InterruptedException...");
                    }
                }
            } else {
                synchronized (this.f382623f) {
                    iz5.a.g(null, this.f382624g.addAll(this.f382623f));
                    this.f382623f.clear();
                }
            }
        }
    }
}
