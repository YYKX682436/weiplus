package l85;

/* loaded from: classes12.dex */
public class w0 extends l85.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l85.x0 f398760d;

    public w0(l85.x0 x0Var) {
        this.f398760d = x0Var;
    }

    @Override // l85.j0
    public void bd(android.os.IBinder iBinder) {
        l85.h1.f398716g = false;
        l85.x0 x0Var = this.f398760d;
        if (iBinder == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "bindServiceNotAutoCreate() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected() service == null", x0Var.f398762d.getComponent().getClassName(), x0Var.f398763e, x0Var.f398764f);
            return;
        }
        x0Var.f398766h.onServiceConnected(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, x0Var.f398763e), iBinder);
        l85.h1.f398714e.put(java.lang.Integer.valueOf(x0Var.f398766h.hashCode()), iBinder);
        l85.v0 v0Var = new l85.v0(this);
        l85.h1.f398715f.put(java.lang.Integer.valueOf(x0Var.f398766h.hashCode()), v0Var);
        iBinder.linkToDeath(v0Var, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "bindServiceNotAutoCreate() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected()", x0Var.f398762d.getComponent().getClassName(), x0Var.f398763e, x0Var.f398764f);
    }
}
