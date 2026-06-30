package l85;

/* loaded from: classes12.dex */
public class v0 implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l85.w0 f398758d;

    public v0(l85.w0 w0Var) {
        this.f398758d = w0Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        l85.w0 w0Var = this.f398758d;
        w0Var.f398760d.f398766h.onServiceDisconnected(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, w0Var.f398760d.f398763e));
        java.lang.String className = w0Var.f398760d.f398762d.getComponent().getClassName();
        l85.x0 x0Var = w0Var.f398760d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "bindServiceNotAutoCreate() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected()", className, x0Var.f398763e, x0Var.f398764f);
    }
}
