package l85;

/* loaded from: classes12.dex */
public class e1 extends l85.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f398692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398694f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.ServiceConnection f398695g;

    public e1(android.content.Intent intent, java.lang.String str, java.lang.String str2, android.content.ServiceConnection serviceConnection) {
        this.f398692d = intent;
        this.f398693e = str;
        this.f398694f = str2;
        this.f398695g = serviceConnection;
    }

    @Override // l85.j0
    public void bd(android.os.IBinder iBinder) {
        java.lang.String className = this.f398692d.getComponent().getClassName();
        java.lang.String str = this.f398694f;
        java.lang.String str2 = this.f398693e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected()", className, str2, str);
        if (iBinder == null) {
            return;
        }
        android.content.ComponentName componentName = new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str2);
        android.content.ServiceConnection serviceConnection = this.f398695g;
        serviceConnection.onServiceConnected(componentName, iBinder);
        l85.h1.f398714e.put(java.lang.Integer.valueOf(serviceConnection.hashCode()), iBinder);
        iBinder.linkToDeath(new l85.d1(this), 0);
    }
}
