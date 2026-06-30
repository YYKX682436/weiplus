package l85;

/* loaded from: classes12.dex */
public class a1 implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l85.b1 f398664d;

    public a1(l85.b1 b1Var) {
        this.f398664d = b1Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        l85.b1 b1Var = this.f398664d;
        b1Var.f398666d.f398673m.onServiceDisconnected(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b1Var.f398666d.f398670g));
        java.lang.String className = b1Var.f398666d.f398669f.getComponent().getClassName();
        l85.c1 c1Var = b1Var.f398666d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected()", className, c1Var.f398670g, c1Var.f398671h);
    }
}
