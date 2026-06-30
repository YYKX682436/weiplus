package com.google.android.gms.gcm;

/* loaded from: classes13.dex */
public abstract class GcmTaskService extends android.app.Service {
    public static final java.lang.String SERVICE_ACTION_EXECUTE_TASK = "com.google.android.gms.gcm.ACTION_TASK_READY";
    public static final java.lang.String SERVICE_ACTION_INITIALIZE = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
    public static final java.lang.String SERVICE_PERMISSION = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
    private android.content.ComponentName componentName;
    private final java.lang.Object lock = new java.lang.Object();
    private int zzt;
    private java.util.concurrent.ExecutorService zzu;
    private android.os.Messenger zzv;
    private com.google.android.gms.gcm.GcmNetworkManager zzw;

    /* loaded from: classes13.dex */
    public class zzd extends android.os.Handler {
        public zzd(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            android.os.Messenger messenger;
            if (com.google.android.gms.common.util.UidVerifier.uidHasPackageName(com.google.android.gms.gcm.GcmTaskService.this, message.sendingUid, "com.google.android.gms")) {
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
                        com.google.android.gms.gcm.GcmTaskService.this.onInitializeTasks();
                        return;
                    }
                }
                android.os.Bundle data = message.getData();
                if (data.isEmpty() || (messenger = message.replyTo) == null) {
                    return;
                }
                java.lang.String string = data.getString("tag");
                java.util.ArrayList parcelableArrayList = data.getParcelableArrayList("triggered_uris");
                if (com.google.android.gms.gcm.GcmTaskService.this.zzg(string)) {
                    return;
                }
                com.google.android.gms.gcm.GcmTaskService.this.zzd(new com.google.android.gms.gcm.GcmTaskService.zze(string, messenger, data.getBundle("extras"), parcelableArrayList));
            }
        }
    }

    /* loaded from: classes13.dex */
    public class zze implements java.lang.Runnable {
        private final android.os.Bundle extras;
        private final java.lang.String tag;
        private final com.google.android.gms.gcm.zzg zzaa;
        private final android.os.Messenger zzab;
        private final java.util.List<android.net.Uri> zzz;

        public zze(java.lang.String str, android.os.IBinder iBinder, android.os.Bundle bundle, java.util.List<android.net.Uri> list) {
            com.google.android.gms.gcm.zzg zzhVar;
            this.tag = str;
            if (iBinder == null) {
                zzhVar = null;
            } else {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
                zzhVar = queryLocalInterface instanceof com.google.android.gms.gcm.zzg ? (com.google.android.gms.gcm.zzg) queryLocalInterface : new com.google.android.gms.gcm.zzh(iBinder);
            }
            this.zzaa = zzhVar;
            this.extras = bundle;
            this.zzz = list;
            this.zzab = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zze(int i17) {
            com.google.android.gms.gcm.GcmTaskService gcmTaskService;
            int i18;
            synchronized (com.google.android.gms.gcm.GcmTaskService.this.lock) {
                try {
                    try {
                    } catch (android.os.RemoteException unused) {
                        java.lang.String valueOf = java.lang.String.valueOf(this.tag);
                        if (valueOf.length() != 0) {
                            "Error reporting result of operation to scheduler for ".concat(valueOf);
                        }
                        com.google.android.gms.gcm.GcmTaskService.this.zzw.zze(this.tag, com.google.android.gms.gcm.GcmTaskService.this.componentName.getClassName());
                        if (!zzf() && !com.google.android.gms.gcm.GcmTaskService.this.zzw.zzf(com.google.android.gms.gcm.GcmTaskService.this.componentName.getClassName())) {
                            gcmTaskService = com.google.android.gms.gcm.GcmTaskService.this;
                            i18 = gcmTaskService.zzt;
                        }
                    }
                    if (com.google.android.gms.gcm.GcmTaskService.this.zzw.zzf(this.tag, com.google.android.gms.gcm.GcmTaskService.this.componentName.getClassName())) {
                        return;
                    }
                    if (zzf()) {
                        android.os.Messenger messenger = this.zzab;
                        android.os.Message obtain = android.os.Message.obtain();
                        obtain.what = 3;
                        obtain.arg1 = i17;
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putParcelable("component", com.google.android.gms.gcm.GcmTaskService.this.componentName);
                        bundle.putString("tag", this.tag);
                        obtain.setData(bundle);
                        messenger.send(obtain);
                    } else {
                        this.zzaa.zzf(i17);
                    }
                    com.google.android.gms.gcm.GcmTaskService.this.zzw.zze(this.tag, com.google.android.gms.gcm.GcmTaskService.this.componentName.getClassName());
                    if (!zzf() && !com.google.android.gms.gcm.GcmTaskService.this.zzw.zzf(com.google.android.gms.gcm.GcmTaskService.this.componentName.getClassName())) {
                        gcmTaskService = com.google.android.gms.gcm.GcmTaskService.this;
                        i18 = gcmTaskService.zzt;
                        gcmTaskService.stopSelf(i18);
                    }
                } finally {
                    com.google.android.gms.gcm.GcmTaskService.this.zzw.zze(this.tag, com.google.android.gms.gcm.GcmTaskService.this.componentName.getClassName());
                    if (!zzf() && !com.google.android.gms.gcm.GcmTaskService.this.zzw.zzf(com.google.android.gms.gcm.GcmTaskService.this.componentName.getClassName())) {
                        com.google.android.gms.gcm.GcmTaskService gcmTaskService2 = com.google.android.gms.gcm.GcmTaskService.this;
                        gcmTaskService2.stopSelf(gcmTaskService2.zzt);
                    }
                }
            }
        }

        private final boolean zzf() {
            return this.zzab != null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            zze(com.google.android.gms.gcm.GcmTaskService.this.onRunTask(new com.google.android.gms.gcm.TaskParams(this.tag, this.extras, this.zzz)));
        }

        public zze(java.lang.String str, android.os.Messenger messenger, android.os.Bundle bundle, java.util.List<android.net.Uri> list) {
            this.tag = str;
            this.zzab = messenger;
            this.extras = bundle;
            this.zzz = list;
            this.zzaa = null;
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        if (intent != null && com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop() && SERVICE_ACTION_EXECUTE_TASK.equals(intent.getAction())) {
            return this.zzv.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.zzw = com.google.android.gms.gcm.GcmNetworkManager.getInstance(this);
        this.zzu = java.util.concurrent.Executors.newFixedThreadPool(2, new com.google.android.gms.gcm.zze(this));
        this.zzv = new android.os.Messenger(new com.google.android.gms.gcm.GcmTaskService.zzd(android.os.Looper.getMainLooper()));
        this.componentName = new android.content.ComponentName(this, getClass());
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

    public void onInitializeTasks() {
    }

    public abstract int onRunTask(com.google.android.gms.gcm.TaskParams taskParams);

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        if (intent == null) {
            return 2;
        }
        try {
            intent.setExtrasClassLoader(com.google.android.gms.gcm.PendingCallback.class.getClassLoader());
            java.lang.String action = intent.getAction();
            if (SERVICE_ACTION_EXECUTE_TASK.equals(action)) {
                java.lang.String stringExtra = intent.getStringExtra("tag");
                android.os.Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                android.os.Bundle bundleExtra = intent.getBundleExtra("extras");
                java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("triggered_uris");
                if (!(parcelableExtra instanceof com.google.android.gms.gcm.PendingCallback)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(getPackageName()).length() + 47 + java.lang.String.valueOf(stringExtra).length());
                    return 2;
                }
                if (zzg(stringExtra)) {
                    return 2;
                }
                zzd(new com.google.android.gms.gcm.GcmTaskService.zze(stringExtra, ((com.google.android.gms.gcm.PendingCallback) parcelableExtra).zzal, bundleExtra, parcelableArrayListExtra));
            } else if (SERVICE_ACTION_INITIALIZE.equals(action)) {
                onInitializeTasks();
            } else {
                new java.lang.StringBuilder(java.lang.String.valueOf(action).length() + 37);
            }
            return 2;
        } finally {
            zzd(i18);
        }
    }

    private final void zzd(int i17) {
        synchronized (this.lock) {
            this.zzt = i17;
            if (!this.zzw.zzf(this.componentName.getClassName())) {
                stopSelf(this.zzt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzg(java.lang.String str) {
        boolean z17;
        synchronized (this.lock) {
            z17 = !this.zzw.zzd(str, this.componentName.getClassName());
            if (z17) {
                new java.lang.StringBuilder(java.lang.String.valueOf(getPackageName()).length() + 44 + java.lang.String.valueOf(str).length());
            }
        }
        return z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(com.google.android.gms.gcm.GcmTaskService.zze zzeVar) {
        try {
            this.zzu.execute(zzeVar);
        } catch (java.util.concurrent.RejectedExecutionException unused) {
            zzeVar.zze(1);
        }
    }
}
