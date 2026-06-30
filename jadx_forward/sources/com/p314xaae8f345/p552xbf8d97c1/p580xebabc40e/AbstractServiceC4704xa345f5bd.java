package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e;

/* renamed from: com.tencent.matrix.resource.MatrixJobIntentService */
/* loaded from: classes13.dex */
public abstract class AbstractServiceC4704xa345f5bd extends android.app.Service {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.Object f134459i = new java.lang.Object();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.HashMap f134460m = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.d f134461d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.k f134462e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.c f134463f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f134464g = false;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f134465h;

    public AbstractServiceC4704xa345f5bd() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.f134465h = null;
        } else {
            this.f134465h = new java.util.ArrayList();
        }
    }

    public static void a(android.content.Context context, java.lang.Class cls, int i17, android.content.Intent intent) {
        android.content.ComponentName componentName = new android.content.ComponentName(context, (java.lang.Class<?>) cls);
        if (intent == null) {
            throw new java.lang.IllegalArgumentException("work must not be null");
        }
        synchronized (f134459i) {
            com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.k c17 = c(context, componentName, true, i17);
            c17.b(i17);
            c17.a(intent);
        }
    }

    public static com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.k c(android.content.Context context, android.content.ComponentName componentName, boolean z17, int i17) {
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.k eVar;
        java.util.HashMap hashMap = f134460m;
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.k kVar = (com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.k) hashMap.get(componentName);
        if (kVar != null) {
            return kVar;
        }
        if (android.os.Build.VERSION.SDK_INT < 26) {
            eVar = new com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.e(context, componentName);
        } else {
            if (!z17) {
                throw new java.lang.IllegalArgumentException("Can't be here without a job id");
            }
            eVar = new com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.j(context, componentName, i17);
        }
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.k kVar2 = eVar;
        hashMap.put(componentName, kVar2);
        return kVar2;
    }

    public void b(boolean z17) {
        if (this.f134463f == null) {
            this.f134463f = new com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.c(this);
            com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.k kVar = this.f134462e;
            if (kVar != null && z17) {
                kVar.d();
            }
            this.f134463f.executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.Void[0]);
        }
    }

    public abstract void d(android.content.Intent intent);

    public void e() {
        java.util.ArrayList arrayList = this.f134465h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f134463f = null;
                java.util.ArrayList arrayList2 = this.f134465h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    b(false);
                } else if (!this.f134464g) {
                    this.f134462e.c();
                }
            }
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.d dVar = this.f134461d;
        if (dVar != null) {
            return ((com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.i) dVar).getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.f134461d = new com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.i(this);
            this.f134462e = null;
        } else {
            this.f134461d = null;
            this.f134462e = c(this, new android.content.ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        java.util.ArrayList arrayList = this.f134465h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f134464g = true;
                this.f134462e.c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        if (this.f134465h == null) {
            return 2;
        }
        this.f134462e.e();
        synchronized (this.f134465h) {
            java.util.ArrayList arrayList = this.f134465h;
            if (intent == null) {
                intent = new android.content.Intent();
            }
            arrayList.add(new com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.f(this, intent, i18));
            b(true);
        }
        return 3;
    }
}
