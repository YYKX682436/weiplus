package p012xc85e97e9.p093xedfae76a;

/* renamed from: androidx.lifecycle.LifecycleService */
/* loaded from: classes13.dex */
public class ServiceC1117x1ec0700b extends android.app.Service implements p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.z0 f93116d = new p012xc85e97e9.p093xedfae76a.z0(this);

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f93116d.f93203a;
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        this.f93116d.a(p012xc85e97e9.p093xedfae76a.m.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f93116d.a(p012xc85e97e9.p093xedfae76a.m.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        p012xc85e97e9.p093xedfae76a.m mVar = p012xc85e97e9.p093xedfae76a.m.ON_STOP;
        p012xc85e97e9.p093xedfae76a.z0 z0Var = this.f93116d;
        z0Var.a(mVar);
        z0Var.a(p012xc85e97e9.p093xedfae76a.m.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(android.content.Intent intent, int i17) {
        this.f93116d.a(p012xc85e97e9.p093xedfae76a.m.ON_START);
        super.onStart(intent, i17);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        return super.onStartCommand(intent, i17, i18);
    }
}
