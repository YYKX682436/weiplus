package iy3;

/* loaded from: classes11.dex */
public final class c implements my3.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f377452a;

    public c(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f377452a = rVar;
    }

    public void a(boolean z17, java.lang.String deviceName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceName, "deviceName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.IPCASyncInvokeTask_ConnectWatch", "onChannelReady %b %s", java.lang.Boolean.valueOf(z17), deviceName);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("result", z17);
        bundle.putString("device_name", deviceName);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f377452a;
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
