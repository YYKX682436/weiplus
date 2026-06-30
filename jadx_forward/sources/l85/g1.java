package l85;

/* loaded from: classes12.dex */
public class g1 extends l85.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398705f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398706g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f398707h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f398708i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(android.content.Intent intent, java.lang.String str, android.content.Context context, boolean z17, android.content.Intent intent2) {
        super(intent);
        this.f398705f = str;
        this.f398706g = context;
        this.f398707h = z17;
        this.f398708i = intent2;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        java.lang.String str = this.f398705f;
        if (iBinder == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "startProcessService() ProcessName = %s onServiceConnected() service == null", str);
            return;
        }
        l85.h1.f398710a.put(str, l85.l0.d(iBinder));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "startProcessService() ProcessName = %s onServiceConnected()", str);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = l85.h1.f398710a;
        java.lang.String str = this.f398705f;
        concurrentHashMap.remove(str);
        this.f398706g.unbindService(this);
        if (this.f398707h) {
            l85.h1.d(str, false, this.f398708i);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMServiceHelper", "startProcessService() ProcessName = %s onServiceDisconnected()", str);
        l85.l1.a(4L, 1L, false);
    }
}
