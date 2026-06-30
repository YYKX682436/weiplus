package gy3;

/* loaded from: classes13.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.UUID f359113e = java.util.UUID.fromString("0000FEEA-0000-1000-8000-00805F9B34FB");

    /* renamed from: a, reason: collision with root package name */
    public final gy3.g f359114a;

    /* renamed from: b, reason: collision with root package name */
    public gy3.f f359115b;

    /* renamed from: c, reason: collision with root package name */
    public gy3.h f359116c;

    /* renamed from: d, reason: collision with root package name */
    public gy3.i f359117d;

    public j(java.lang.String mac, gy3.g mCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mac, "mac");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mCallback, "mCallback");
        this.f359114a = mCallback;
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBluetoothSession", "disconnect");
        gy3.f fVar = this.f359115b;
        if (fVar != null) {
            fVar.a();
        }
        this.f359115b = null;
        gy3.h hVar = this.f359116c;
        if (hVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RecvThread", "RecvRunnable cancel");
            if (hVar.f359105g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RecvThread", "Cancel is done aready, just leave");
            } else {
                hVar.f359105g = true;
            }
        }
        this.f359116c = null;
        gy3.i iVar = this.f359117d;
        if (iVar != null) {
            iVar.a();
        }
        this.f359117d = null;
    }
}
