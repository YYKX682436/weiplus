package l85;

/* loaded from: classes12.dex */
public class d1 implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l85.e1 f398686d;

    public d1(l85.e1 e1Var) {
        this.f398686d = e1Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        l85.e1 e1Var = this.f398686d;
        e1Var.f398695g.onServiceDisconnected(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, e1Var.f398693e));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected()", e1Var.f398692d.getComponent().getClassName(), e1Var.f398693e, e1Var.f398694f);
    }
}
