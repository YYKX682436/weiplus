package l85;

/* loaded from: classes12.dex */
public class f1 extends l85.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398697f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398698g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f398699h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f398700i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.ServiceConnection f398701m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f398702n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398703o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(android.content.Intent intent, java.lang.String str, java.lang.String str2, android.content.Intent intent2, boolean z17, android.content.ServiceConnection serviceConnection, android.content.Intent intent3, android.content.Context context) {
        super(intent);
        this.f398697f = str;
        this.f398698g = str2;
        this.f398699h = intent2;
        this.f398700i = z17;
        this.f398701m = serviceConnection;
        this.f398702n = intent3;
        this.f398703o = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        l85.l1.a(48L, 1L, false);
        java.lang.String str = this.f398697f;
        java.lang.String str2 = this.f398698g;
        if (iBinder == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s onServiceConnected() service == null", str, str2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s onServiceConnected()", str, str2);
        try {
            l85.n0 d17 = l85.l0.d(iBinder);
            d17.nb(this.f398699h);
            l85.h1.f398710a.put(str2, d17);
        } catch (java.lang.Exception e17) {
            if (this.f398700i) {
                l85.h1.g(this.f398701m, str2, false, this.f398702n);
                l85.l1.a(51L, 1L, false);
            }
            l85.l1.a(49L, 1L, false);
            java.lang.String message = e17.getMessage();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s onServiceConnected() exception = %s stack[%s]", str, str2, message, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        java.lang.String str = this.f398697f;
        java.lang.String str2 = this.f398698g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s onServiceDisconnected()", str, str2);
        l85.h1.f398710a.remove(str2);
        this.f398703o.unbindService(this);
        l85.l1.a(50L, 1L, false);
    }
}
