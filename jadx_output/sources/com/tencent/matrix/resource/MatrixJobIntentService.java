package com.tencent.matrix.resource;

/* loaded from: classes13.dex */
public abstract class MatrixJobIntentService extends android.app.Service {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.Object f52926i = new java.lang.Object();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.HashMap f52927m = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.matrix.resource.d f52928d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.matrix.resource.k f52929e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.matrix.resource.c f52930f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f52931g = false;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f52932h;

    public MatrixJobIntentService() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.f52932h = null;
        } else {
            this.f52932h = new java.util.ArrayList();
        }
    }

    public static void a(android.content.Context context, java.lang.Class cls, int i17, android.content.Intent intent) {
        android.content.ComponentName componentName = new android.content.ComponentName(context, (java.lang.Class<?>) cls);
        if (intent == null) {
            throw new java.lang.IllegalArgumentException("work must not be null");
        }
        synchronized (f52926i) {
            com.tencent.matrix.resource.k c17 = c(context, componentName, true, i17);
            c17.b(i17);
            c17.a(intent);
        }
    }

    public static com.tencent.matrix.resource.k c(android.content.Context context, android.content.ComponentName componentName, boolean z17, int i17) {
        com.tencent.matrix.resource.k eVar;
        java.util.HashMap hashMap = f52927m;
        com.tencent.matrix.resource.k kVar = (com.tencent.matrix.resource.k) hashMap.get(componentName);
        if (kVar != null) {
            return kVar;
        }
        if (android.os.Build.VERSION.SDK_INT < 26) {
            eVar = new com.tencent.matrix.resource.e(context, componentName);
        } else {
            if (!z17) {
                throw new java.lang.IllegalArgumentException("Can't be here without a job id");
            }
            eVar = new com.tencent.matrix.resource.j(context, componentName, i17);
        }
        com.tencent.matrix.resource.k kVar2 = eVar;
        hashMap.put(componentName, kVar2);
        return kVar2;
    }

    public void b(boolean z17) {
        if (this.f52930f == null) {
            this.f52930f = new com.tencent.matrix.resource.c(this);
            com.tencent.matrix.resource.k kVar = this.f52929e;
            if (kVar != null && z17) {
                kVar.d();
            }
            this.f52930f.executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.Void[0]);
        }
    }

    public abstract void d(android.content.Intent intent);

    public void e() {
        java.util.ArrayList arrayList = this.f52932h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f52930f = null;
                java.util.ArrayList arrayList2 = this.f52932h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    b(false);
                } else if (!this.f52931g) {
                    this.f52929e.c();
                }
            }
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.tencent.matrix.resource.d dVar = this.f52928d;
        if (dVar != null) {
            return ((com.tencent.matrix.resource.i) dVar).getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.f52928d = new com.tencent.matrix.resource.i(this);
            this.f52929e = null;
        } else {
            this.f52928d = null;
            this.f52929e = c(this, new android.content.ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        java.util.ArrayList arrayList = this.f52932h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f52931g = true;
                this.f52929e.c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        if (this.f52932h == null) {
            return 2;
        }
        this.f52929e.e();
        synchronized (this.f52932h) {
            java.util.ArrayList arrayList = this.f52932h;
            if (intent == null) {
                intent = new android.content.Intent();
            }
            arrayList.add(new com.tencent.matrix.resource.f(this, intent, i18));
            b(true);
        }
        return 3;
    }
}
