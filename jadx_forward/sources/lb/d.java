package lb;

/* loaded from: classes13.dex */
public class d implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lb.e f399186d;

    public d(lb.e eVar, lb.a aVar) {
        this.f399186d = eVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        lb.i gVar;
        synchronized (this.f399186d.f399187a) {
            lb.e eVar = this.f399186d;
            int i17 = lb.h.f399194d;
            if (iBinder == null) {
                gVar = null;
            } else {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.nfc.sdk.service.ICUPOnlinePayService");
                gVar = (queryLocalInterface == null || !(queryLocalInterface instanceof lb.i)) ? new lb.g(iBinder) : (lb.i) queryLocalInterface;
            }
            eVar.f399189c = gVar;
            this.f399186d.f399187a.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        synchronized (this.f399186d.f399187a) {
            lb.e eVar = this.f399186d;
            eVar.f399189c = null;
            eVar.f399187a.notifyAll();
        }
    }
}
