package jq1;

/* loaded from: classes13.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f382602a;

    /* renamed from: b, reason: collision with root package name */
    public final long f382603b;

    /* renamed from: c, reason: collision with root package name */
    public jq1.h f382604c = null;

    /* renamed from: d, reason: collision with root package name */
    public jq1.i f382605d = null;

    /* renamed from: e, reason: collision with root package name */
    public jq1.j f382606e = null;

    /* renamed from: f, reason: collision with root package name */
    public final android.bluetooth.BluetoothDevice f382607f;

    public f(long j17) {
        this.f382602a = j17;
        this.f382603b = j17;
        this.f382607f = android.bluetooth.BluetoothAdapter.getDefaultAdapter().getRemoteDevice(a42.i.f(j17));
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothChatSession", "disconnect");
        jq1.h hVar = this.f382604c;
        if (hVar != null) {
            hVar.a();
            this.f382604c = null;
        }
        jq1.i iVar = this.f382605d;
        if (iVar != null) {
            iVar.a();
            this.f382605d = null;
        }
        jq1.j jVar = this.f382606e;
        if (jVar != null) {
            jVar.f382621d = null;
            jVar.f382627m = true;
            synchronized (jVar) {
                jVar.notify();
            }
            jVar.f382624g.clear();
            jVar.f382623f.clear();
            this.f382606e = null;
        }
    }
}
