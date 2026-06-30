package l85;

/* loaded from: classes12.dex */
public class y0 implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l85.z0 f398771d;

    public y0(l85.z0 z0Var) {
        this.f398771d = z0Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        l85.z0 z0Var = this.f398771d;
        z0Var.f398776g.onServiceDisconnected(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, z0Var.f398774e));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected()", z0Var.f398773d.getComponent().getClassName(), z0Var.f398774e, z0Var.f398775f);
    }
}
