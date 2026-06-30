package com.p176xb6135e39.p177xcca8366f.gms.gcm;

/* renamed from: com.google.android.gms.gcm.GcmTaskService */
/* loaded from: classes13.dex */
public abstract class AbstractServiceC2040x720859bf extends android.app.Service {

    /* renamed from: SERVICE_ACTION_EXECUTE_TASK */
    public static final java.lang.String f6030x8b99b2ee = "com.google.android.gms.gcm.ACTION_TASK_READY";

    /* renamed from: SERVICE_ACTION_INITIALIZE */
    public static final java.lang.String f6031x41bbde0f = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";

    /* renamed from: SERVICE_PERMISSION */
    public static final java.lang.String f6032xfdcb5b9 = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";

    /* renamed from: componentName */
    private android.content.ComponentName f6033x65b34528;

    /* renamed from: lock */
    private final java.lang.Object f6034x32c52b = new java.lang.Object();
    private int zzt;
    private java.util.concurrent.ExecutorService zzu;
    private android.os.Messenger zzv;
    private com.p176xb6135e39.p177xcca8366f.gms.gcm.C2037x6d7586f0 zzw;

    /* renamed from: com.google.android.gms.gcm.GcmTaskService$zzd */
    /* loaded from: classes13.dex */
    public class zzd extends android.os.Handler {
        public zzd(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            android.os.Messenger messenger;
            if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2013x19c49f26.m18623x7093a567(com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this, message.sendingUid, "com.google.android.gms")) {
                int i17 = message.what;
                if (i17 != 1) {
                    if (i17 == 2) {
                        if (android.util.Log.isLoggable("GcmTaskService", 3)) {
                            new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 45);
                            return;
                        }
                        return;
                    } else if (i17 != 4) {
                        new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 31);
                        return;
                    } else {
                        com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this.m18708x9429c9ff();
                        return;
                    }
                }
                android.os.Bundle data = message.getData();
                if (data.isEmpty() || (messenger = message.replyTo) == null) {
                    return;
                }
                java.lang.String string = data.getString("tag");
                java.util.ArrayList parcelableArrayList = data.getParcelableArrayList("triggered_uris");
                if (com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this.zzg(string)) {
                    return;
                }
                com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this.zzd(new com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.zze(string, messenger, data.getBundle("extras"), parcelableArrayList));
            }
        }
    }

    /* renamed from: com.google.android.gms.gcm.GcmTaskService$zze */
    /* loaded from: classes13.dex */
    public class zze implements java.lang.Runnable {

        /* renamed from: extras */
        private final android.os.Bundle f6035xb32aee63;
        private final java.lang.String tag;

        /* renamed from: zzaa */
        private final com.p176xb6135e39.p177xcca8366f.gms.gcm.zzg f6036x394b60;

        /* renamed from: zzab */
        private final android.os.Messenger f6037x394b61;
        private final java.util.List<android.net.Uri> zzz;

        public zze(java.lang.String str, android.os.IBinder iBinder, android.os.Bundle bundle, java.util.List<android.net.Uri> list) {
            com.p176xb6135e39.p177xcca8366f.gms.gcm.zzg zzhVar;
            this.tag = str;
            if (iBinder == null) {
                zzhVar = null;
            } else {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
                zzhVar = queryLocalInterface instanceof com.p176xb6135e39.p177xcca8366f.gms.gcm.zzg ? (com.p176xb6135e39.p177xcca8366f.gms.gcm.zzg) queryLocalInterface : new com.p176xb6135e39.p177xcca8366f.gms.gcm.zzh(iBinder);
            }
            this.f6036x394b60 = zzhVar;
            this.f6035xb32aee63 = bundle;
            this.zzz = list;
            this.f6037x394b61 = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zze(int i17) {
            com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf abstractServiceC2040x720859bf;
            int i18;
            synchronized (com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this.f6034x32c52b) {
                try {
                    try {
                    } catch (android.os.RemoteException unused) {
                        java.lang.String valueOf = java.lang.String.valueOf(this.tag);
                        if (valueOf.length() != 0) {
                            "Error reporting result of operation to scheduler for ".concat(valueOf);
                        }
                        com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this.zzw.zze(this.tag, com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this.f6033x65b34528.getClassName());
                        if (!zzf() && !com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this.zzw.zzf(com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this.f6033x65b34528.getClassName())) {
                            abstractServiceC2040x720859bf = com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this;
                            i18 = abstractServiceC2040x720859bf.zzt;
                        }
                    }
                    if (com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this.zzw.zzf(this.tag, com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this.f6033x65b34528.getClassName())) {
                        return;
                    }
                    if (zzf()) {
                        android.os.Messenger messenger = this.f6037x394b61;
                        android.os.Message obtain = android.os.Message.obtain();
                        obtain.what = 3;
                        obtain.arg1 = i17;
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putParcelable("component", com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this.f6033x65b34528);
                        bundle.putString("tag", this.tag);
                        obtain.setData(bundle);
                        messenger.send(obtain);
                    } else {
                        this.f6036x394b60.zzf(i17);
                    }
                    com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this.zzw.zze(this.tag, com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this.f6033x65b34528.getClassName());
                    if (!zzf() && !com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this.zzw.zzf(com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this.f6033x65b34528.getClassName())) {
                        abstractServiceC2040x720859bf = com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this;
                        i18 = abstractServiceC2040x720859bf.zzt;
                        abstractServiceC2040x720859bf.stopSelf(i18);
                    }
                } finally {
                    com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this.zzw.zze(this.tag, com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this.f6033x65b34528.getClassName());
                    if (!zzf() && !com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this.zzw.zzf(com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this.f6033x65b34528.getClassName())) {
                        com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf abstractServiceC2040x720859bf2 = com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this;
                        abstractServiceC2040x720859bf2.stopSelf(abstractServiceC2040x720859bf2.zzt);
                    }
                }
            }
        }

        private final boolean zzf() {
            return this.f6037x394b61 != null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            zze(com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.this.m18709xac0927d1(new com.p176xb6135e39.p177xcca8366f.gms.gcm.C2047xaa78ff8b(this.tag, this.f6035xb32aee63, this.zzz)));
        }

        public zze(java.lang.String str, android.os.Messenger messenger, android.os.Bundle bundle, java.util.List<android.net.Uri> list) {
            this.tag = str;
            this.f6037x394b61 = messenger;
            this.f6035xb32aee63 = bundle;
            this.zzz = list;
            this.f6036x394b60 = null;
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        if (intent != null && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18602x4727d397() && f6030x8b99b2ee.equals(intent.getAction())) {
            return this.zzv.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.zzw = com.p176xb6135e39.p177xcca8366f.gms.gcm.C2037x6d7586f0.m18700x9cf0d20b(this);
        this.zzu = java.util.concurrent.Executors.newFixedThreadPool(2, new com.p176xb6135e39.p177xcca8366f.gms.gcm.zze(this));
        this.zzv = new android.os.Messenger(new com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.zzd(android.os.Looper.getMainLooper()));
        this.f6033x65b34528 = new android.content.ComponentName(this, getClass());
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        java.util.List<java.lang.Runnable> shutdownNow = this.zzu.shutdownNow();
        if (shutdownNow.isEmpty()) {
            return;
        }
        shutdownNow.size();
    }

    /* renamed from: onInitializeTasks */
    public void m18708x9429c9ff() {
    }

    /* renamed from: onRunTask */
    public abstract int m18709xac0927d1(com.p176xb6135e39.p177xcca8366f.gms.gcm.C2047xaa78ff8b c2047xaa78ff8b);

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        if (intent == null) {
            return 2;
        }
        try {
            intent.setExtrasClassLoader(com.p176xb6135e39.p177xcca8366f.gms.gcm.C2043x593e3edc.class.getClassLoader());
            java.lang.String action = intent.getAction();
            if (f6030x8b99b2ee.equals(action)) {
                java.lang.String stringExtra = intent.getStringExtra("tag");
                android.os.Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                android.os.Bundle bundleExtra = intent.getBundleExtra("extras");
                java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("triggered_uris");
                if (!(parcelableExtra instanceof com.p176xb6135e39.p177xcca8366f.gms.gcm.C2043x593e3edc)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(getPackageName()).length() + 47 + java.lang.String.valueOf(stringExtra).length());
                    return 2;
                }
                if (zzg(stringExtra)) {
                    return 2;
                }
                zzd(new com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.zze(stringExtra, ((com.p176xb6135e39.p177xcca8366f.gms.gcm.C2043x593e3edc) parcelableExtra).f6057x394b6b, bundleExtra, parcelableArrayListExtra));
            } else if (f6031x41bbde0f.equals(action)) {
                m18708x9429c9ff();
            } else {
                new java.lang.StringBuilder(java.lang.String.valueOf(action).length() + 37);
            }
            return 2;
        } finally {
            zzd(i18);
        }
    }

    private final void zzd(int i17) {
        synchronized (this.f6034x32c52b) {
            this.zzt = i17;
            if (!this.zzw.zzf(this.f6033x65b34528.getClassName())) {
                stopSelf(this.zzt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzg(java.lang.String str) {
        boolean z17;
        synchronized (this.f6034x32c52b) {
            z17 = !this.zzw.zzd(str, this.f6033x65b34528.getClassName());
            if (z17) {
                new java.lang.StringBuilder(java.lang.String.valueOf(getPackageName()).length() + 44 + java.lang.String.valueOf(str).length());
            }
        }
        return z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.zze zzeVar) {
        try {
            this.zzu.execute(zzeVar);
        } catch (java.util.concurrent.RejectedExecutionException unused) {
            zzeVar.zze(1);
        }
    }
}
