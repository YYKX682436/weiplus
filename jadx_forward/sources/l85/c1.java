package l85;

/* loaded from: classes12.dex */
public class c1 extends l85.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f398669f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398670g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398671h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f398672i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.ServiceConnection f398673m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f398674n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f398675o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398676p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(android.content.Intent intent, android.content.Intent intent2, java.lang.String str, java.lang.String str2, android.content.Intent intent3, android.content.ServiceConnection serviceConnection, boolean z17, int i17, android.content.Context context) {
        super(intent);
        this.f398669f = intent2;
        this.f398670g = str;
        this.f398671h = str2;
        this.f398672i = intent3;
        this.f398673m = serviceConnection;
        this.f398674n = z17;
        this.f398675o = i17;
        this.f398676p = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        android.content.Intent intent = this.f398669f;
        java.lang.String className = intent.getComponent().getClassName();
        java.lang.String str = this.f398670g;
        java.lang.String str2 = this.f398671h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s onServiceConnected()", className, str, str2);
        l85.l1.a(33L, 1L, false);
        java.util.Vector vector = l85.h1.f398712c;
        android.content.Intent intent2 = this.f398672i;
        if (vector.contains(intent2)) {
            if (iBinder == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s onServiceConnected() service == null", intent.getComponent().getClassName(), str, str2);
                return;
            }
            try {
                try {
                    l85.n0 d17 = l85.l0.d(iBinder);
                    d17.og(intent2, new l85.b1(this));
                    l85.h1.f398710a.put(str2, d17);
                } catch (java.lang.Exception e17) {
                    if (this.f398674n) {
                        l85.h1.a(this.f398672i, this.f398673m, this.f398675o, this.f398671h, false, this.f398669f);
                        l85.l1.a(36L, 1L, false);
                    }
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "bindService()  ProcessServiceClassName = %s ClassName = %s ProcessName = %s onServiceConnected() exception = %s stack[%s]", intent.getComponent().getClassName(), str, str2, e17.getMessage(), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                    l85.l1.a(34L, 1L, false);
                    vector = l85.h1.f398712c;
                }
                vector.remove(intent2);
            } catch (java.lang.Throwable th6) {
                l85.h1.f398712c.remove(intent2);
                throw th6;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = l85.h1.f398710a;
        java.lang.String str = this.f398671h;
        concurrentHashMap.remove(str);
        this.f398676p.unbindService(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s onServiceDisconnected()", this.f398669f.getComponent().getClassName(), this.f398670g, str);
        l85.l1.a(35L, 1L, false);
    }
}
