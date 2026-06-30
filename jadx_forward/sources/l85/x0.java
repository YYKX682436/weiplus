package l85;

/* loaded from: classes12.dex */
public class x0 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f398762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398764f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f398765g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.ServiceConnection f398766h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f398767i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f398768m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398769n;

    public x0(android.content.Intent intent, java.lang.String str, java.lang.String str2, android.content.Intent intent2, android.content.ServiceConnection serviceConnection, boolean z17, int i17, android.content.Context context) {
        this.f398762d = intent;
        this.f398763e = str;
        this.f398764f = str2;
        this.f398765g = intent2;
        this.f398766h = serviceConnection;
        this.f398767i = z17;
        this.f398768m = i17;
        this.f398769n = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        android.content.Intent intent = this.f398762d;
        java.lang.String className = intent.getComponent().getClassName();
        java.lang.String str = this.f398763e;
        java.lang.String str2 = this.f398764f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "bindServiceNotAutoCreate() ProcessServiceClassName = %s ClassName = %s ProcessName = %s onServiceConnected()", className, str, str2);
        l85.l1.a(33L, 1L, false);
        java.util.Vector vector = l85.h1.f398712c;
        android.content.Intent intent2 = this.f398765g;
        if (!vector.contains(intent2)) {
            l85.h1.f398716g = false;
            return;
        }
        if (iBinder == null) {
            l85.h1.f398716g = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "bindServiceNotAutoCreate() ProcessServiceClassName = %s ClassName = %s ProcessName = %s onServiceConnected() service == null", intent.getComponent().getClassName(), str, str2);
            return;
        }
        try {
            try {
                l85.n0 d17 = l85.l0.d(iBinder);
                d17.og(intent2, new l85.w0(this));
                l85.h1.f398710a.put(str2, d17);
            } catch (java.lang.Exception e17) {
                l85.h1.f398716g = false;
                if (this.f398767i) {
                    l85.h1.a(this.f398765g, this.f398766h, this.f398768m, this.f398764f, false, this.f398762d);
                    l85.l1.a(36L, 1L, false);
                }
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMServiceHelper", e17, "bindServiceNotAutoCreate()  ProcessServiceClassName = %s ClassName = %s ProcessName = %s onServiceConnected() exception = %s stack[%s]", intent.getComponent().getClassName(), str, str2, e17.getMessage(), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                l85.l1.a(34L, 1L, false);
                vector = l85.h1.f398712c;
            }
            vector.remove(intent2);
        } catch (java.lang.Throwable th6) {
            l85.h1.f398712c.remove(intent2);
            throw th6;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = l85.h1.f398710a;
        java.lang.String str = this.f398764f;
        concurrentHashMap.remove(str);
        this.f398769n.unbindService(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s onServiceDisconnected()", this.f398762d.getComponent().getClassName(), this.f398763e, str);
        l85.l1.a(35L, 1L, false);
    }
}
