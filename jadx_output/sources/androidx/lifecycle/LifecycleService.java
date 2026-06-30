package androidx.lifecycle;

/* loaded from: classes13.dex */
public class LifecycleService extends android.app.Service implements androidx.lifecycle.y {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.z0 f11583d = new androidx.lifecycle.z0(this);

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f11583d.f11670a;
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        this.f11583d.a(androidx.lifecycle.m.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f11583d.a(androidx.lifecycle.m.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        androidx.lifecycle.m mVar = androidx.lifecycle.m.ON_STOP;
        androidx.lifecycle.z0 z0Var = this.f11583d;
        z0Var.a(mVar);
        z0Var.a(androidx.lifecycle.m.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(android.content.Intent intent, int i17) {
        this.f11583d.a(androidx.lifecycle.m.ON_START);
        super.onStart(intent, i17);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        return super.onStartCommand(intent, i17, i18);
    }
}
