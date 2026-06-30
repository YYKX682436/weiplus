package androidx.core.app;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public abstract class JobIntentService extends android.app.Service {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f11023i = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public z2.t f11024d;

    /* renamed from: e, reason: collision with root package name */
    public z2.z f11025e;

    /* renamed from: f, reason: collision with root package name */
    public z2.s f11026f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11027g = false;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f11028h;

    public JobIntentService() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.f11028h = null;
        } else {
            this.f11028h = new java.util.ArrayList();
        }
    }

    public void a(boolean z17) {
        if (this.f11026f == null) {
            this.f11026f = new z2.s(this);
            z2.z zVar = this.f11025e;
            if (zVar != null && z17) {
                zVar.b();
            }
            this.f11026f.executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.Void[0]);
        }
    }

    public abstract void b(android.content.Intent intent);

    public void c() {
        java.util.ArrayList arrayList = this.f11028h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f11026f = null;
                java.util.ArrayList arrayList2 = this.f11028h;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    a(false);
                } else if (!this.f11027g) {
                    this.f11025e.a();
                }
            }
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        z2.t tVar = this.f11024d;
        if (tVar != null) {
            return ((z2.y) tVar).getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 26) {
            this.f11024d = new z2.y(this);
            this.f11025e = null;
            return;
        }
        this.f11024d = null;
        android.content.ComponentName componentName = new android.content.ComponentName(this, getClass());
        java.util.HashMap hashMap = f11023i;
        z2.z zVar = (z2.z) hashMap.get(componentName);
        if (zVar == null) {
            if (i17 >= 26) {
                throw new java.lang.IllegalArgumentException("Can't be here without a job id");
            }
            zVar = new z2.u(this, componentName);
            hashMap.put(componentName, zVar);
        }
        this.f11025e = zVar;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        java.util.ArrayList arrayList = this.f11028h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f11027g = true;
                this.f11025e.a();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        if (this.f11028h == null) {
            return 2;
        }
        this.f11025e.c();
        synchronized (this.f11028h) {
            java.util.ArrayList arrayList = this.f11028h;
            if (intent == null) {
                intent = new android.content.Intent();
            }
            arrayList.add(new z2.v(this, intent, i18));
            a(true);
        }
        return 3;
    }
}
