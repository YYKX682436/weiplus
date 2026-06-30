package l85;

/* loaded from: classes12.dex */
public class t0 extends l85.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398745g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f398746h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f398747i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f398748m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398749n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(android.content.Intent intent, java.lang.String str, java.lang.String str2, android.content.Intent intent2, boolean z17, android.content.Intent intent3, android.content.Context context) {
        super(intent);
        this.f398744f = str;
        this.f398745g = str2;
        this.f398746h = intent2;
        this.f398747i = z17;
        this.f398748m = intent3;
        this.f398749n = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        l85.l1.a(2L, 1L, false);
        java.lang.String str = this.f398744f;
        java.lang.String str2 = this.f398745g;
        if (iBinder == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "startService() ClassName = %s ProcessName = %s onServiceConnected() service == null", str, str2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "startService() ClassName = %s ProcessName = %s onServiceConnected()", str, str2);
        java.util.Vector vector = l85.h1.f398711b;
        android.content.Intent intent = this.f398746h;
        try {
            if (vector.contains(intent)) {
                try {
                    l85.n0 d17 = l85.l0.d(iBinder);
                    d17.mo145315x6e4047f3(intent);
                    l85.h1.f398710a.put(str2, d17);
                    vector.remove(intent);
                } catch (java.lang.Exception e17) {
                    if (this.f398747i) {
                        l85.l1.a(5L, 1L, false);
                        l85.h1.e(intent, str2, false, this.f398748m);
                    }
                    l85.l1.a(3L, 1L, false);
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "startService ClassName = %s ProcessName = %s  exception = %s stack[%s]", str, str2, e17.getMessage(), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                    l85.h1.f398711b.remove(intent);
                }
            }
        } catch (java.lang.Throwable th6) {
            l85.h1.f398711b.remove(intent);
            throw th6;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = l85.h1.f398710a;
        java.lang.String str = this.f398745g;
        concurrentHashMap.remove(str);
        this.f398749n.unbindService(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "startService() ClassName = %s ProcessName = %s onServiceDisconnected()", this.f398744f, str);
        l85.l1.a(4L, 1L, false);
    }
}
