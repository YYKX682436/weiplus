package l85;

/* loaded from: classes12.dex */
public class b1 extends l85.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l85.c1 f398666d;

    public b1(l85.c1 c1Var) {
        this.f398666d = c1Var;
    }

    @Override // l85.j0
    public void bd(android.os.IBinder iBinder) {
        l85.c1 c1Var = this.f398666d;
        if (iBinder == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected() service == null", c1Var.f398669f.getComponent().getClassName(), c1Var.f398670g, c1Var.f398671h);
            return;
        }
        c1Var.f398673m.onServiceConnected(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, c1Var.f398670g), iBinder);
        l85.h1.f398714e.put(java.lang.Integer.valueOf(c1Var.f398673m.hashCode()), iBinder);
        l85.a1 a1Var = new l85.a1(this);
        l85.h1.f398715f.put(java.lang.Integer.valueOf(c1Var.f398673m.hashCode()), a1Var);
        iBinder.linkToDeath(a1Var, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected()", c1Var.f398669f.getComponent().getClassName(), c1Var.f398670g, c1Var.f398671h);
    }
}
