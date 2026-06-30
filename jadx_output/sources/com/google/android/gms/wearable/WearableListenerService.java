package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
public class WearableListenerService extends android.app.Service implements com.google.android.gms.wearable.CapabilityApi.CapabilityListener, com.google.android.gms.wearable.ChannelApi.ChannelListener, com.google.android.gms.wearable.DataApi.DataListener, com.google.android.gms.wearable.MessageApi.MessageListener {
    public static final java.lang.String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private android.content.ComponentName service;
    private com.google.android.gms.wearable.WearableListenerService.zzc zzad;
    private android.os.IBinder zzae;
    private android.content.Intent zzaf;
    private android.os.Looper zzag;
    private boolean zzai;
    private final java.lang.Object zzah = new java.lang.Object();
    private com.google.android.gms.wearable.internal.zzas zzaj = new com.google.android.gms.wearable.internal.zzas(new com.google.android.gms.wearable.WearableListenerService.zza());

    /* loaded from: classes13.dex */
    public class zza extends com.google.android.gms.wearable.ChannelClient.ChannelCallback {
        private zza() {
        }

        @Override // com.google.android.gms.wearable.ChannelClient.ChannelCallback
        public final void onChannelClosed(com.google.android.gms.wearable.ChannelClient.Channel channel, int i17, int i18) {
            com.google.android.gms.wearable.WearableListenerService.this.onChannelClosed(channel, i17, i18);
        }

        @Override // com.google.android.gms.wearable.ChannelClient.ChannelCallback
        public final void onChannelOpened(com.google.android.gms.wearable.ChannelClient.Channel channel) {
            com.google.android.gms.wearable.WearableListenerService.this.onChannelOpened(channel);
        }

        @Override // com.google.android.gms.wearable.ChannelClient.ChannelCallback
        public final void onInputClosed(com.google.android.gms.wearable.ChannelClient.Channel channel, int i17, int i18) {
            com.google.android.gms.wearable.WearableListenerService.this.onInputClosed(channel, i17, i18);
        }

        @Override // com.google.android.gms.wearable.ChannelClient.ChannelCallback
        public final void onOutputClosed(com.google.android.gms.wearable.ChannelClient.Channel channel, int i17, int i18) {
            com.google.android.gms.wearable.WearableListenerService.this.onOutputClosed(channel, i17, i18);
        }
    }

    /* loaded from: classes13.dex */
    public class zzb implements android.content.ServiceConnection {
        private zzb(com.google.android.gms.wearable.WearableListenerService wearableListenerService) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName componentName) {
        }
    }

    /* loaded from: classes13.dex */
    public final class zzc extends android.os.Handler {
        private boolean started;
        private final com.google.android.gms.wearable.WearableListenerService.zzb zzal;

        public zzc(android.os.Looper looper) {
            super(looper);
            this.zzal = new com.google.android.gms.wearable.WearableListenerService.zzb();
        }

        private final synchronized void zzb() {
            if (this.started) {
                return;
            }
            if (android.util.Log.isLoggable("WearableLS", 2)) {
                new java.lang.StringBuilder(java.lang.String.valueOf(com.google.android.gms.wearable.WearableListenerService.this.service).length() + 13);
            }
            com.google.android.gms.wearable.WearableListenerService wearableListenerService = com.google.android.gms.wearable.WearableListenerService.this;
            wearableListenerService.bindService(wearableListenerService.zzaf, this.zzal, 1);
            this.started = true;
        }

        @Override // android.os.Handler
        public final void dispatchMessage(android.os.Message message) {
            zzb();
            try {
                super.dispatchMessage(message);
            } finally {
                if (!hasMessages(0)) {
                    zzb("dispatch");
                }
            }
        }

        public final void quit() {
            getLooper().quit();
            zzb("quit");
        }

        private final synchronized void zzb(java.lang.String str) {
            if (this.started) {
                if (android.util.Log.isLoggable("WearableLS", 2)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 17 + java.lang.String.valueOf(com.google.android.gms.wearable.WearableListenerService.this.service).length());
                }
                try {
                    com.google.android.gms.wearable.WearableListenerService.this.unbindService(this.zzal);
                } catch (java.lang.RuntimeException unused) {
                }
                this.started = false;
            }
        }
    }

    /* loaded from: classes13.dex */
    public final class zzd extends com.google.android.gms.wearable.internal.zzen {
        private volatile int zzam;

        private zzd() {
            this.zzam = -1;
        }

        @Override // com.google.android.gms.wearable.internal.zzem
        public final void onConnectedNodes(java.util.List<com.google.android.gms.wearable.internal.zzfo> list) {
            zza(new com.google.android.gms.wearable.zzp(this, list), "onConnectedNodes", list);
        }

        @Override // com.google.android.gms.wearable.internal.zzem
        public final void zza(com.google.android.gms.common.data.DataHolder dataHolder) {
            com.google.android.gms.wearable.zzl zzlVar = new com.google.android.gms.wearable.zzl(this, dataHolder);
            try {
                java.lang.String valueOf = java.lang.String.valueOf(dataHolder);
                int count = dataHolder.getCount();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 18);
                sb6.append(valueOf);
                sb6.append(", rows=");
                sb6.append(count);
                if (zza(zzlVar, "onDataItemChanged", sb6.toString())) {
                }
            } finally {
                dataHolder.close();
            }
        }

        @Override // com.google.android.gms.wearable.internal.zzem
        public final void zzb(com.google.android.gms.wearable.internal.zzfo zzfoVar) {
            zza(new com.google.android.gms.wearable.zzo(this, zzfoVar), "onPeerDisconnected", zzfoVar);
        }

        @Override // com.google.android.gms.wearable.internal.zzem
        public final void zza(com.google.android.gms.wearable.internal.zzah zzahVar) {
            zza(new com.google.android.gms.wearable.zzq(this, zzahVar), "onConnectedCapabilityChanged", zzahVar);
        }

        @Override // com.google.android.gms.wearable.internal.zzem
        public final void zza(com.google.android.gms.wearable.internal.zzaw zzawVar) {
            zza(new com.google.android.gms.wearable.zzt(this, zzawVar), "onChannelEvent", zzawVar);
        }

        @Override // com.google.android.gms.wearable.internal.zzem
        public final void zza(com.google.android.gms.wearable.internal.zzfe zzfeVar) {
            zza(new com.google.android.gms.wearable.zzm(this, zzfeVar), "onMessageReceived", zzfeVar);
        }

        @Override // com.google.android.gms.wearable.internal.zzem
        public final void zza(com.google.android.gms.wearable.internal.zzfo zzfoVar) {
            zza(new com.google.android.gms.wearable.zzn(this, zzfoVar), "onPeerConnected", zzfoVar);
        }

        @Override // com.google.android.gms.wearable.internal.zzem
        public final void zza(com.google.android.gms.wearable.internal.zzi zziVar) {
            zza(new com.google.android.gms.wearable.zzs(this, zziVar), "onEntityUpdate", zziVar);
        }

        @Override // com.google.android.gms.wearable.internal.zzem
        public final void zza(com.google.android.gms.wearable.internal.zzl zzlVar) {
            zza(new com.google.android.gms.wearable.zzr(this, zzlVar), "onNotificationReceived", zzlVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x004f A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final boolean zza(java.lang.Runnable r4, java.lang.String r5, java.lang.Object r6) {
            /*
                r3 = this;
                java.lang.String r0 = "WearableLS"
                r1 = 3
                boolean r0 = android.util.Log.isLoggable(r0, r1)
                if (r0 == 0) goto L1c
                java.lang.String r0 = "%s: %s %s"
                com.google.android.gms.wearable.WearableListenerService r1 = com.google.android.gms.wearable.WearableListenerService.this
                android.content.ComponentName r1 = com.google.android.gms.wearable.WearableListenerService.zza(r1)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r5 = new java.lang.Object[]{r5, r1, r6}
                java.lang.String.format(r0, r5)
            L1c:
                int r5 = android.os.Binder.getCallingUid()
                int r6 = r3.zzam
                r0 = 0
                r1 = 1
                if (r5 != r6) goto L28
            L26:
                r5 = r1
                goto L4d
            L28:
                com.google.android.gms.wearable.WearableListenerService r6 = com.google.android.gms.wearable.WearableListenerService.this
                com.google.android.gms.wearable.internal.zzhp r6 = com.google.android.gms.wearable.internal.zzhp.zza(r6)
                java.lang.String r2 = "com.google.android.wearable.app.cn"
                boolean r6 = r6.zze(r2)
                if (r6 == 0) goto L41
                com.google.android.gms.wearable.WearableListenerService r6 = com.google.android.gms.wearable.WearableListenerService.this
                java.lang.String r2 = "com.google.android.wearable.app.cn"
                boolean r6 = com.google.android.gms.common.util.UidVerifier.uidHasPackageName(r6, r5, r2)
                if (r6 == 0) goto L41
                goto L49
            L41:
                com.google.android.gms.wearable.WearableListenerService r6 = com.google.android.gms.wearable.WearableListenerService.this
                boolean r6 = com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(r6, r5)
                if (r6 == 0) goto L4c
            L49:
                r3.zzam = r5
                goto L26
            L4c:
                r5 = r0
            L4d:
                if (r5 != 0) goto L50
                return r0
            L50:
                com.google.android.gms.wearable.WearableListenerService r5 = com.google.android.gms.wearable.WearableListenerService.this
                java.lang.Object r5 = com.google.android.gms.wearable.WearableListenerService.zzd(r5)
                monitor-enter(r5)
                com.google.android.gms.wearable.WearableListenerService r6 = com.google.android.gms.wearable.WearableListenerService.this     // Catch: java.lang.Throwable -> L6c
                boolean r6 = com.google.android.gms.wearable.WearableListenerService.zze(r6)     // Catch: java.lang.Throwable -> L6c
                if (r6 == 0) goto L61
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L6c
                return r0
            L61:
                com.google.android.gms.wearable.WearableListenerService r6 = com.google.android.gms.wearable.WearableListenerService.this     // Catch: java.lang.Throwable -> L6c
                com.google.android.gms.wearable.WearableListenerService$zzc r6 = com.google.android.gms.wearable.WearableListenerService.zzf(r6)     // Catch: java.lang.Throwable -> L6c
                r6.post(r4)     // Catch: java.lang.Throwable -> L6c
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L6c
                return r1
            L6c:
                r4 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L6c
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.WearableListenerService.zzd.zza(java.lang.Runnable, java.lang.String, java.lang.Object):boolean");
        }
    }

    public android.os.Looper getLooper() {
        if (this.zzag == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("WearableListenerService");
            handlerThread.start();
            this.zzag = handlerThread.getLooper();
        }
        return this.zzag;
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        if (BIND_LISTENER_INTENT_ACTION.equals(intent.getAction())) {
            return this.zzae;
        }
        return null;
    }

    @Override // com.google.android.gms.wearable.CapabilityApi.CapabilityListener
    public void onCapabilityChanged(com.google.android.gms.wearable.CapabilityInfo capabilityInfo) {
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public void onChannelClosed(com.google.android.gms.wearable.Channel channel, int i17, int i18) {
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public void onChannelOpened(com.google.android.gms.wearable.Channel channel) {
    }

    public void onConnectedNodes(java.util.List<com.google.android.gms.wearable.Node> list) {
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.service = new android.content.ComponentName(this, getClass().getName());
        if (android.util.Log.isLoggable("WearableLS", 3)) {
            new java.lang.StringBuilder(java.lang.String.valueOf(this.service).length() + 10);
        }
        this.zzad = new com.google.android.gms.wearable.WearableListenerService.zzc(getLooper());
        android.content.Intent intent = new android.content.Intent(BIND_LISTENER_INTENT_ACTION);
        this.zzaf = intent;
        intent.setComponent(this.service);
        this.zzae = new com.google.android.gms.wearable.WearableListenerService.zzd();
    }

    @Override // com.google.android.gms.wearable.DataApi.DataListener
    public void onDataChanged(com.google.android.gms.wearable.DataEventBuffer dataEventBuffer) {
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (android.util.Log.isLoggable("WearableLS", 3)) {
            new java.lang.StringBuilder(java.lang.String.valueOf(this.service).length() + 11);
        }
        synchronized (this.zzah) {
            this.zzai = true;
            com.google.android.gms.wearable.WearableListenerService.zzc zzcVar = this.zzad;
            if (zzcVar == null) {
                java.lang.String valueOf = java.lang.String.valueOf(this.service);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 111);
                sb6.append("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=");
                sb6.append(valueOf);
                throw new java.lang.IllegalStateException(sb6.toString());
            }
            zzcVar.quit();
        }
        super.onDestroy();
    }

    public void onEntityUpdate(com.google.android.gms.wearable.zzb zzbVar) {
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public void onInputClosed(com.google.android.gms.wearable.Channel channel, int i17, int i18) {
    }

    @Override // com.google.android.gms.wearable.MessageApi.MessageListener
    public void onMessageReceived(com.google.android.gms.wearable.MessageEvent messageEvent) {
    }

    public void onNotificationReceived(com.google.android.gms.wearable.zzd zzdVar) {
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public void onOutputClosed(com.google.android.gms.wearable.Channel channel, int i17, int i18) {
    }

    public void onPeerConnected(com.google.android.gms.wearable.Node node) {
    }

    public void onPeerDisconnected(com.google.android.gms.wearable.Node node) {
    }

    public void onChannelClosed(com.google.android.gms.wearable.ChannelClient.Channel channel, int i17, int i18) {
    }

    public void onChannelOpened(com.google.android.gms.wearable.ChannelClient.Channel channel) {
    }

    public void onInputClosed(com.google.android.gms.wearable.ChannelClient.Channel channel, int i17, int i18) {
    }

    public void onOutputClosed(com.google.android.gms.wearable.ChannelClient.Channel channel, int i17, int i18) {
    }
}
