package kq1;

/* loaded from: classes13.dex */
public class e extends hq1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kq1.n f392773a;

    public e(kq1.n nVar) {
        this.f392773a = nVar;
    }

    @Override // hq1.h
    public void a(long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "***BLE onConnected*** SessionId = " + j17 + " Connected = " + z17);
        iz5.a.g(null, kq1.n.a(this.f392773a, 4, 0, 0, new kq1.i(j17, z17)));
    }

    @Override // hq1.h
    public void b(long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "***BLE onSend*** SessionId = " + j17 + " success = " + z17);
        iz5.a.g(null, kq1.n.a(this.f392773a, 0, 0, 0, new kq1.m(j17, z17)));
    }
}
