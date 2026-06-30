package gq1;

/* loaded from: classes13.dex */
public class h implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gq1.o f356037d;

    public h(gq1.o oVar) {
        this.f356037d = oVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        gq1.o oVar = this.f356037d;
        if (oVar.f356055f.size() <= 0) {
            return false;
        }
        android.bluetooth.BluetoothAdapter bluetoothAdapter = oVar.f356057h;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.stopLeScan(oVar);
        }
        if (!oVar.f356065s.e()) {
            return true;
        }
        oVar.f356065s.c(2000L, 2000L);
        return true;
    }
}
