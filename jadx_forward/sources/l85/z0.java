package l85;

/* loaded from: classes12.dex */
public class z0 extends l85.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f398773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.ServiceConnection f398776g;

    public z0(android.content.Intent intent, java.lang.String str, java.lang.String str2, android.content.ServiceConnection serviceConnection) {
        this.f398773d = intent;
        this.f398774e = str;
        this.f398775f = str2;
        this.f398776g = serviceConnection;
    }

    @Override // l85.j0
    public void bd(android.os.IBinder iBinder) {
        java.lang.String className = this.f398773d.getComponent().getClassName();
        java.lang.String str = this.f398775f;
        java.lang.String str2 = this.f398774e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected()", className, str2, str);
        if (iBinder == null) {
            return;
        }
        android.content.ComponentName componentName = new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str2);
        android.content.ServiceConnection serviceConnection = this.f398776g;
        serviceConnection.onServiceConnected(componentName, iBinder);
        l85.h1.f398714e.put(java.lang.Integer.valueOf(serviceConnection.hashCode()), iBinder);
        iBinder.linkToDeath(new l85.y0(this), 0);
    }
}
