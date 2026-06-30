package l85;

/* loaded from: classes12.dex */
public class u0 extends l85.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398751f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398752g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f398753h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f398754i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f398755m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398756n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(android.content.Intent intent, java.lang.String str, java.lang.String str2, android.content.Intent intent2, boolean z17, android.content.Intent intent3, android.content.Context context) {
        super(intent);
        this.f398751f = str;
        this.f398752g = str2;
        this.f398753h = intent2;
        this.f398754i = z17;
        this.f398755m = intent3;
        this.f398756n = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        android.content.Intent intent = this.f398753h;
        l85.l1.a(18L, 1L, false);
        java.lang.String str = this.f398751f;
        java.lang.String str2 = this.f398752g;
        if (iBinder == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "stopService() ClassName = %s ProcessName = %s onServiceConnected() service == null", str, str2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "stopService() ClassName = %s ProcessName = %s onServiceConnected()", str, str2);
        try {
            l85.n0 d17 = l85.l0.d(iBinder);
            d17.mo145316x29afb053(intent);
            l85.h1.f398710a.put(str2, d17);
        } catch (java.lang.Exception e17) {
            if (this.f398754i) {
                l85.h1.f(intent, str2, false, this.f398755m);
                l85.l1.a(21L, 1L, false);
            }
            java.lang.String message = e17.getMessage();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "stopService ClassName = %s ProcessName = %s onServiceConnected() exception = %s stack[%s]", str, str2, message, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            l85.l1.a(19L, 1L, false);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = l85.h1.f398710a;
        java.lang.String str = this.f398752g;
        concurrentHashMap.remove(str);
        this.f398756n.unbindService(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "stopService() ClassName = %s ProcessName = %s onServiceDisconnected()", this.f398751f, str);
        l85.l1.a(20L, 1L, false);
    }
}
