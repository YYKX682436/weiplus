package kq1;

/* loaded from: classes13.dex */
public class d extends jq1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kq1.n f392772a;

    public d(kq1.n nVar) {
        this.f392772a = nVar;
    }

    @Override // jq1.c
    public void a(long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onConnected*** SessionId = " + j17 + " Connected = " + z17);
        iz5.a.g(null, kq1.n.a(this.f392772a, 4, 1, 0, new kq1.i(j17, z17)));
    }

    @Override // jq1.c
    public void b(long j17, int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onError*** SessionId = " + j17 + " errorCode = " + i17 + " errorInfo = " + str);
        iz5.a.g(null, kq1.n.a(this.f392772a, 5, 1, 0, new kq1.j(j17, i17, str)));
    }

    @Override // jq1.c
    public void c(long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onSend*** SessionId = " + j17 + " success = " + z17);
        iz5.a.g(null, kq1.n.a(this.f392772a, 0, 1, 0, new kq1.m(j17, z17)));
    }
}
