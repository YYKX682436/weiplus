package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59;

/* renamed from: com.google.android.gms.wearable.WearableListenerService */
/* loaded from: classes13.dex */
public class ServiceC2476xac435ca8 extends android.app.Service implements com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataListener, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2467x120b0cb3.MessageListener {

    /* renamed from: BIND_LISTENER_INTENT_ACTION */
    public static final java.lang.String f7513x8456e730 = "com.google.android.gms.wearable.BIND_LISTENER";

    /* renamed from: service */
    private android.content.ComponentName f7514x7643c6b5;

    /* renamed from: zzad */
    private com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.zzc f7515x394b63;

    /* renamed from: zzae */
    private android.os.IBinder f7516x394b64;

    /* renamed from: zzaf */
    private android.content.Intent f7517x394b65;

    /* renamed from: zzag */
    private android.os.Looper f7518x394b66;

    /* renamed from: zzai */
    private boolean f7520x394b68;

    /* renamed from: zzah */
    private final java.lang.Object f7519x394b67 = new java.lang.Object();

    /* renamed from: zzaj */
    private com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2497x394b72 f7521x394b69 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2497x394b72(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.zza());

    /* renamed from: com.google.android.gms.wearable.WearableListenerService$zza */
    /* loaded from: classes13.dex */
    public class zza extends com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.ChannelCallback {
        private zza() {
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.ChannelCallback
        /* renamed from: onChannelClosed */
        public final void mo19692x6cf620b0(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, int i17, int i18) {
            com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.this.m19869x6cf620b0(channel, i17, i18);
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.ChannelCallback
        /* renamed from: onChannelOpened */
        public final void mo19693x81a407ad(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel) {
            com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.this.m19870x81a407ad(channel);
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.ChannelCallback
        /* renamed from: onInputClosed */
        public final void mo19694xee922e77(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, int i17, int i18) {
            com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.this.m19873xee922e77(channel, i17, i18);
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.ChannelCallback
        /* renamed from: onOutputClosed */
        public final void mo19695x51bded4c(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, int i17, int i18) {
            com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.this.m19875x51bded4c(channel, i17, i18);
        }
    }

    /* renamed from: com.google.android.gms.wearable.WearableListenerService$zzb */
    /* loaded from: classes13.dex */
    public class zzb implements android.content.ServiceConnection {
        private zzb(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8 serviceC2476xac435ca8) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName componentName) {
        }
    }

    /* renamed from: com.google.android.gms.wearable.WearableListenerService$zzc */
    /* loaded from: classes13.dex */
    public final class zzc extends android.os.Handler {

        /* renamed from: started */
        private boolean f7523x8eeb4081;

        /* renamed from: zzal */
        private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.zzb f7525x394b6b;

        public zzc(android.os.Looper looper) {
            super(looper);
            this.f7525x394b6b = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.zzb();
        }

        private final synchronized void zzb() {
            if (this.f7523x8eeb4081) {
                return;
            }
            if (android.util.Log.isLoggable("WearableLS", 2)) {
                new java.lang.StringBuilder(java.lang.String.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.this.f7514x7643c6b5).length() + 13);
            }
            com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8 serviceC2476xac435ca8 = com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.this;
            serviceC2476xac435ca8.bindService(serviceC2476xac435ca8.f7517x394b65, this.f7525x394b6b, 1);
            this.f7523x8eeb4081 = true;
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

        /* renamed from: quit */
        public final void m19878x35224f() {
            getLooper().quit();
            zzb("quit");
        }

        private final synchronized void zzb(java.lang.String str) {
            if (this.f7523x8eeb4081) {
                if (android.util.Log.isLoggable("WearableLS", 2)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 17 + java.lang.String.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.this.f7514x7643c6b5).length());
                }
                try {
                    com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.this.unbindService(this.f7525x394b6b);
                } catch (java.lang.RuntimeException unused) {
                }
                this.f7523x8eeb4081 = false;
            }
        }
    }

    /* renamed from: com.google.android.gms.wearable.WearableListenerService$zzd */
    /* loaded from: classes13.dex */
    public final class zzd extends com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.AbstractBinderC2596x394be9 {

        /* renamed from: zzam */
        private volatile int f7527x394b6c;

        private zzd() {
            this.f7527x394b6c = -1;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2595x394be8
        /* renamed from: onConnectedNodes */
        public final void mo19879x926e54e7(java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2623x394c09> list) {
            zza(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.zzp(this, list), "onConnectedNodes", list);
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2595x394be8
        public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 c1888xafe09e16) {
            com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.zzl zzlVar = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.zzl(this, c1888xafe09e16);
            try {
                java.lang.String valueOf = java.lang.String.valueOf(c1888xafe09e16);
                int m18026x7444f759 = c1888xafe09e16.m18026x7444f759();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 18);
                sb6.append(valueOf);
                sb6.append(", rows=");
                sb6.append(m18026x7444f759);
                if (zza(zzlVar, "onDataItemChanged", sb6.toString())) {
                }
            } finally {
                c1888xafe09e16.close();
            }
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2595x394be8
        public final void zzb(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2623x394c09 c2623x394c09) {
            zza(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.zzo(this, c2623x394c09), "onPeerDisconnected", c2623x394c09);
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2595x394be8
        public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2486x394b67 c2486x394b67) {
            zza(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.zzq(this, c2486x394b67), "onConnectedCapabilityChanged", c2486x394b67);
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2595x394be8
        public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2501x394b76 c2501x394b76) {
            zza(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.zzt(this, c2501x394b76), "onChannelEvent", c2501x394b76);
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2595x394be8
        public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2613x394bff c2613x394bff) {
            zza(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.zzm(this, c2613x394bff), "onMessageReceived", c2613x394bff);
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2595x394be8
        public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2623x394c09 c2623x394c09) {
            zza(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.zzn(this, c2623x394c09), "onPeerConnected", c2623x394c09);
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2595x394be8
        public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzi zziVar) {
            zza(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.zzs(this, zziVar), "onEntityUpdate", zziVar);
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2595x394be8
        public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzl zzlVar) {
            zza(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.zzr(this, zzlVar), "onNotificationReceived", zzlVar);
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
                com.google.android.gms.wearable.WearableListenerService r1 = com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.this
                android.content.ComponentName r1 = com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.zza(r1)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r5 = new java.lang.Object[]{r5, r1, r6}
                java.lang.String.format(r0, r5)
            L1c:
                int r5 = android.os.Binder.getCallingUid()
                int r6 = r3.f7527x394b6c
                r0 = 0
                r1 = 1
                if (r5 != r6) goto L28
            L26:
                r5 = r1
                goto L4d
            L28:
                com.google.android.gms.wearable.WearableListenerService r6 = com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.this
                com.google.android.gms.wearable.internal.zzhp r6 = com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2676x394c48.zza(r6)
                java.lang.String r2 = "com.google.android.wearable.app.cn"
                boolean r6 = r6.zze(r2)
                if (r6 == 0) goto L41
                com.google.android.gms.wearable.WearableListenerService r6 = com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.this
                java.lang.String r2 = "com.google.android.wearable.app.cn"
                boolean r6 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2013x19c49f26.m18623x7093a567(r6, r5, r2)
                if (r6 == 0) goto L41
                goto L49
            L41:
                com.google.android.gms.wearable.WearableListenerService r6 = com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.this
                boolean r6 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2013x19c49f26.m18622x6510ccbb(r6, r5)
                if (r6 == 0) goto L4c
            L49:
                r3.f7527x394b6c = r5
                goto L26
            L4c:
                r5 = r0
            L4d:
                if (r5 != 0) goto L50
                return r0
            L50:
                com.google.android.gms.wearable.WearableListenerService r5 = com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.this
                java.lang.Object r5 = com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.zzd(r5)
                monitor-enter(r5)
                com.google.android.gms.wearable.WearableListenerService r6 = com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.this     // Catch: java.lang.Throwable -> L6c
                boolean r6 = com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.zze(r6)     // Catch: java.lang.Throwable -> L6c
                if (r6 == 0) goto L61
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L6c
                return r0
            L61:
                com.google.android.gms.wearable.WearableListenerService r6 = com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.this     // Catch: java.lang.Throwable -> L6c
                com.google.android.gms.wearable.WearableListenerService$zzc r6 = com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.zzf(r6)     // Catch: java.lang.Throwable -> L6c
                r6.post(r4)     // Catch: java.lang.Throwable -> L6c
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L6c
                return r1
            L6c:
                r4 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L6c
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.zzd.zza(java.lang.Runnable, java.lang.String, java.lang.Object):boolean");
        }
    }

    /* renamed from: getLooper */
    public android.os.Looper m19868x23b2dd47() {
        if (this.f7518x394b66 == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("WearableListenerService");
            handlerThread.start();
            this.f7518x394b66 = handlerThread.getLooper();
        }
        return this.f7518x394b66;
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        if (f7513x8456e730.equals(intent.getAction())) {
            return this.f7516x394b64;
        }
        return null;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener
    /* renamed from: onCapabilityChanged */
    public void mo19646x6da6365d(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2452xeb6b7e06 interfaceC2452xeb6b7e06) {
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener
    /* renamed from: onChannelClosed */
    public void mo19675x6cf620b0(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3 interfaceC2453x8f4414e3, int i17, int i18) {
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener
    /* renamed from: onChannelOpened */
    public void mo19676x81a407ad(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3 interfaceC2453x8f4414e3) {
    }

    /* renamed from: onConnectedNodes */
    public void m19871x926e54e7(java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2470x252222> list) {
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f7514x7643c6b5 = new android.content.ComponentName(this, getClass().getName());
        if (android.util.Log.isLoggable("WearableLS", 3)) {
            new java.lang.StringBuilder(java.lang.String.valueOf(this.f7514x7643c6b5).length() + 10);
        }
        this.f7515x394b63 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.zzc(m19868x23b2dd47());
        android.content.Intent intent = new android.content.Intent(f7513x8456e730);
        this.f7517x394b65 = intent;
        intent.setComponent(this.f7514x7643c6b5);
        this.f7516x394b64 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.zzd();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataListener
    /* renamed from: onDataChanged */
    public void mo19715xf050804b(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2461xbdd2f950 c2461xbdd2f950) {
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (android.util.Log.isLoggable("WearableLS", 3)) {
            new java.lang.StringBuilder(java.lang.String.valueOf(this.f7514x7643c6b5).length() + 11);
        }
        synchronized (this.f7519x394b67) {
            this.f7520x394b68 = true;
            com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.ServiceC2476xac435ca8.zzc zzcVar = this.f7515x394b63;
            if (zzcVar == null) {
                java.lang.String valueOf = java.lang.String.valueOf(this.f7514x7643c6b5);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 111);
                sb6.append("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=");
                sb6.append(valueOf);
                throw new java.lang.IllegalStateException(sb6.toString());
            }
            zzcVar.m19878x35224f();
        }
        super.onDestroy();
    }

    /* renamed from: onEntityUpdate */
    public void m19872xa435de0b(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.zzb zzbVar) {
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener
    /* renamed from: onInputClosed */
    public void mo19677xee922e77(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3 interfaceC2453x8f4414e3, int i17, int i18) {
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2467x120b0cb3.MessageListener
    /* renamed from: onMessageReceived */
    public void mo19802xaa57a729(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2469xbbb5c2f3 interfaceC2469xbbb5c2f3) {
    }

    /* renamed from: onNotificationReceived */
    public void m19874x1c65586b(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.zzd zzdVar) {
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener
    /* renamed from: onOutputClosed */
    public void mo19678x51bded4c(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3 interfaceC2453x8f4414e3, int i17, int i18) {
    }

    /* renamed from: onPeerConnected */
    public void m19876x7152f428(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2470x252222 interfaceC2470x252222) {
    }

    /* renamed from: onPeerDisconnected */
    public void m19877xdfb324bc(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2470x252222 interfaceC2470x252222) {
    }

    /* renamed from: onChannelClosed */
    public void m19869x6cf620b0(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, int i17, int i18) {
    }

    /* renamed from: onChannelOpened */
    public void m19870x81a407ad(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel) {
    }

    /* renamed from: onInputClosed */
    public void m19873xee922e77(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, int i17, int i18) {
    }

    /* renamed from: onOutputClosed */
    public void m19875x51bded4c(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, int i17, int i18) {
    }
}
