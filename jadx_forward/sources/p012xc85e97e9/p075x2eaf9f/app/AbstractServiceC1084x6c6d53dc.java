package p012xc85e97e9.p075x2eaf9f.app;

@java.lang.Deprecated
/* renamed from: androidx.core.app.JobIntentService */
/* loaded from: classes13.dex */
public abstract class AbstractServiceC1084x6c6d53dc extends android.app.Service {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f92556i = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public z2.t f92557d;

    /* renamed from: e, reason: collision with root package name */
    public z2.z f92558e;

    /* renamed from: f, reason: collision with root package name */
    public z2.s f92559f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f92560g = false;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f92561h;

    public AbstractServiceC1084x6c6d53dc() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.f92561h = null;
        } else {
            this.f92561h = new java.util.ArrayList();
        }
    }

    public void a(boolean z17) {
        if (this.f92559f == null) {
            this.f92559f = new z2.s(this);
            z2.z zVar = this.f92558e;
            if (zVar != null && z17) {
                zVar.b();
            }
            this.f92559f.executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.Void[0]);
        }
    }

    public abstract void b(android.content.Intent intent);

    public void c() {
        java.util.ArrayList arrayList = this.f92561h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f92559f = null;
                java.util.ArrayList arrayList2 = this.f92561h;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    a(false);
                } else if (!this.f92560g) {
                    this.f92558e.a();
                }
            }
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        z2.t tVar = this.f92557d;
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
            this.f92557d = new z2.y(this);
            this.f92558e = null;
            return;
        }
        this.f92557d = null;
        android.content.ComponentName componentName = new android.content.ComponentName(this, getClass());
        java.util.HashMap hashMap = f92556i;
        z2.z zVar = (z2.z) hashMap.get(componentName);
        if (zVar == null) {
            if (i17 >= 26) {
                throw new java.lang.IllegalArgumentException("Can't be here without a job id");
            }
            zVar = new z2.u(this, componentName);
            hashMap.put(componentName, zVar);
        }
        this.f92558e = zVar;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        java.util.ArrayList arrayList = this.f92561h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f92560g = true;
                this.f92558e.a();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        if (this.f92561h == null) {
            return 2;
        }
        this.f92558e.c();
        synchronized (this.f92561h) {
            java.util.ArrayList arrayList = this.f92561h;
            if (intent == null) {
                intent = new android.content.Intent();
            }
            arrayList.add(new z2.v(this, intent, i18));
            a(true);
        }
        return 3;
    }
}
