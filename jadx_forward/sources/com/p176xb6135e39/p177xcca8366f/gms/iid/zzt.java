package com.p176xb6135e39.p177xcca8366f.gms.iid;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzt implements android.content.ServiceConnection {

    /* renamed from: state */
    int f6154x68ac491;

    /* renamed from: zzcc */
    final android.os.Messenger f6155x394ba0;

    /* renamed from: zzcd */
    com.p176xb6135e39.p177xcca8366f.gms.iid.zzy f6156x394ba1;

    /* renamed from: zzce */
    final java.util.Queue<com.p176xb6135e39.p177xcca8366f.gms.iid.zzz<?>> f6157x394ba2;

    /* renamed from: zzcf */
    final android.util.SparseArray<com.p176xb6135e39.p177xcca8366f.gms.iid.zzz<?>> f6158x394ba3;

    /* renamed from: zzcg */
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.iid.zzr f6159x394ba4;

    private zzt(com.p176xb6135e39.p177xcca8366f.gms.iid.zzr zzrVar) {
        this.f6159x394ba4 = zzrVar;
        this.f6154x68ac491 = 0;
        this.f6155x394ba0 = new android.os.Messenger(new android.os.Handler(android.os.Looper.getMainLooper(), new android.os.Handler.Callback(this) { // from class: com.google.android.gms.iid.zzu

            /* renamed from: zzch */
            private final com.p176xb6135e39.p177xcca8366f.gms.iid.zzt f6160x394ba5;

            {
                this.f6160x394ba5 = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                return this.f6160x394ba5.zzd(message);
            }
        }));
        this.f6157x394ba2 = new java.util.ArrayDeque();
        this.f6158x394ba3 = new android.util.SparseArray<>();
    }

    private final void zzr() {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.f6159x394ba4.f6151x394b98;
        scheduledExecutorService.execute(new java.lang.Runnable(this) { // from class: com.google.android.gms.iid.zzw

            /* renamed from: zzch */
            private final com.p176xb6135e39.p177xcca8366f.gms.iid.zzt f6162x394ba5;

            {
                this.f6162x394ba5 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService2;
                android.content.Context context;
                final com.p176xb6135e39.p177xcca8366f.gms.iid.zzt zztVar = this.f6162x394ba5;
                while (true) {
                    synchronized (zztVar) {
                        if (zztVar.f6154x68ac491 != 2) {
                            return;
                        }
                        if (zztVar.f6157x394ba2.isEmpty()) {
                            zztVar.zzs();
                            return;
                        }
                        final com.p176xb6135e39.p177xcca8366f.gms.iid.zzz<?> poll = zztVar.f6157x394ba2.poll();
                        zztVar.f6158x394ba3.put(poll.f6168x394ba8, poll);
                        scheduledExecutorService2 = zztVar.f6159x394ba4.f6151x394b98;
                        scheduledExecutorService2.schedule(new java.lang.Runnable(zztVar, poll) { // from class: com.google.android.gms.iid.zzx

                            /* renamed from: zzch */
                            private final com.p176xb6135e39.p177xcca8366f.gms.iid.zzt f6163x394ba5;

                            /* renamed from: zzci */
                            private final com.p176xb6135e39.p177xcca8366f.gms.iid.zzz f6164x394ba6;

                            {
                                this.f6163x394ba5 = zztVar;
                                this.f6164x394ba6 = poll;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f6163x394ba5.zzg(this.f6164x394ba6.f6168x394ba8);
                            }
                        }, 30L, java.util.concurrent.TimeUnit.SECONDS);
                        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
                            new java.lang.StringBuilder(java.lang.String.valueOf(poll).length() + 8);
                        }
                        context = zztVar.f6159x394ba4.zzk;
                        android.os.Messenger messenger = zztVar.f6155x394ba0;
                        android.os.Message obtain = android.os.Message.obtain();
                        obtain.what = poll.f6167x37aac4;
                        obtain.arg1 = poll.f6168x394ba8;
                        obtain.replyTo = messenger;
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putBoolean("oneWay", poll.zzu());
                        bundle.putString("pkg", context.getPackageName());
                        bundle.putBundle(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, poll.f6170x394baa);
                        obtain.setData(bundle);
                        try {
                            com.p176xb6135e39.p177xcca8366f.gms.iid.zzy zzyVar = zztVar.f6156x394ba1;
                            android.os.Messenger messenger2 = zzyVar.f6165x394b61;
                            if (messenger2 == null) {
                                com.p176xb6135e39.p177xcca8366f.gms.iid.C2050x1d7bb855 c2050x1d7bb855 = zzyVar.f6166x394ba7;
                                if (c2050x1d7bb855 == null) {
                                    throw new java.lang.IllegalStateException("Both messengers are null");
                                    break;
                                }
                                c2050x1d7bb855.m18769x35cf88(obtain);
                            } else {
                                messenger2.send(obtain);
                            }
                        } catch (android.os.RemoteException e17) {
                            zztVar.zzd(2, e17.getMessage());
                        }
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        android.util.Log.isLoggable("MessengerIpcClient", 2);
        if (iBinder == null) {
            zzd(0, "Null service connection");
            return;
        }
        try {
            this.f6156x394ba1 = new com.p176xb6135e39.p177xcca8366f.gms.iid.zzy(iBinder);
            this.f6154x68ac491 = 2;
            zzr();
        } catch (android.os.RemoteException e17) {
            zzd(0, e17.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(android.content.ComponentName componentName) {
        android.util.Log.isLoggable("MessengerIpcClient", 2);
        zzd(2, "Service disconnected");
    }

    public final synchronized void zzd(int i17, java.lang.String str) {
        android.content.Context context;
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            java.lang.String valueOf = java.lang.String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            }
        }
        int i18 = this.f6154x68ac491;
        if (i18 == 0) {
            throw new java.lang.IllegalStateException();
        }
        if (i18 != 1 && i18 != 2) {
            if (i18 == 3) {
                this.f6154x68ac491 = 4;
                return;
            } else {
                if (i18 == 4) {
                    return;
                }
                int i19 = this.f6154x68ac491;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(26);
                sb6.append("Unknown state: ");
                sb6.append(i19);
                throw new java.lang.IllegalStateException(sb6.toString());
            }
        }
        android.util.Log.isLoggable("MessengerIpcClient", 2);
        this.f6154x68ac491 = 4;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a m18493x9cf0d20b = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a.m18493x9cf0d20b();
        context = this.f6159x394ba4.zzk;
        m18493x9cf0d20b.m18495xa4bc737f(context, this);
        com.p176xb6135e39.p177xcca8366f.gms.iid.C2051x394b60 c2051x394b60 = new com.p176xb6135e39.p177xcca8366f.gms.iid.C2051x394b60(i17, str);
        java.util.Iterator<com.p176xb6135e39.p177xcca8366f.gms.iid.zzz<?>> it = this.f6157x394ba2.iterator();
        while (it.hasNext()) {
            it.next().zzd(c2051x394b60);
        }
        this.f6157x394ba2.clear();
        for (int i27 = 0; i27 < this.f6158x394ba3.size(); i27++) {
            this.f6158x394ba3.valueAt(i27).zzd(c2051x394b60);
        }
        this.f6158x394ba3.clear();
    }

    public final synchronized boolean zze(com.p176xb6135e39.p177xcca8366f.gms.iid.zzz zzzVar) {
        android.content.Context context;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
        int i17 = this.f6154x68ac491;
        if (i17 == 0) {
            this.f6157x394ba2.add(zzzVar);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18220xe071d469(this.f6154x68ac491 == 0);
            android.util.Log.isLoggable("MessengerIpcClient", 2);
            this.f6154x68ac491 = 1;
            android.content.Intent intent = new android.content.Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a m18493x9cf0d20b = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a.m18493x9cf0d20b();
            context = this.f6159x394ba4.zzk;
            if (m18493x9cf0d20b.m18494x54856bb8(context, intent, this, 1)) {
                scheduledExecutorService = this.f6159x394ba4.f6151x394b98;
                scheduledExecutorService.schedule(new java.lang.Runnable(this) { // from class: com.google.android.gms.iid.zzv

                    /* renamed from: zzch */
                    private final com.p176xb6135e39.p177xcca8366f.gms.iid.zzt f6161x394ba5;

                    {
                        this.f6161x394ba5 = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6161x394ba5.zzt();
                    }
                }, 30L, java.util.concurrent.TimeUnit.SECONDS);
            } else {
                zzd(0, "Unable to bind to service");
            }
            return true;
        }
        if (i17 == 1) {
            this.f6157x394ba2.add(zzzVar);
            return true;
        }
        if (i17 == 2) {
            this.f6157x394ba2.add(zzzVar);
            zzr();
            return true;
        }
        if (i17 != 3 && i17 != 4) {
            int i18 = this.f6154x68ac491;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(26);
            sb6.append("Unknown state: ");
            sb6.append(i18);
            throw new java.lang.IllegalStateException(sb6.toString());
        }
        return false;
    }

    public final synchronized void zzg(int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.iid.zzz<?> zzzVar = this.f6158x394ba3.get(i17);
        if (zzzVar != null) {
            this.f6158x394ba3.remove(i17);
            zzzVar.zzd(new com.p176xb6135e39.p177xcca8366f.gms.iid.C2051x394b60(3, "Timed out waiting for response"));
            zzs();
        }
    }

    public final synchronized void zzs() {
        android.content.Context context;
        if (this.f6154x68ac491 == 2 && this.f6157x394ba2.isEmpty() && this.f6158x394ba3.size() == 0) {
            android.util.Log.isLoggable("MessengerIpcClient", 2);
            this.f6154x68ac491 = 3;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a m18493x9cf0d20b = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a.m18493x9cf0d20b();
            context = this.f6159x394ba4.zzk;
            m18493x9cf0d20b.m18495xa4bc737f(context, this);
        }
    }

    public final synchronized void zzt() {
        if (this.f6154x68ac491 == 1) {
            zzd(1, "Timed out while binding");
        }
    }

    public final boolean zzd(android.os.Message message) {
        int i17 = message.arg1;
        android.util.Log.isLoggable("MessengerIpcClient", 3);
        synchronized (this) {
            com.p176xb6135e39.p177xcca8366f.gms.iid.zzz<?> zzzVar = this.f6158x394ba3.get(i17);
            if (zzzVar == null) {
                return true;
            }
            this.f6158x394ba3.remove(i17);
            zzs();
            android.os.Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                zzzVar.zzd(new com.p176xb6135e39.p177xcca8366f.gms.iid.C2051x394b60(4, "Not supported by GmsCore"));
            } else {
                zzzVar.zzh(data);
            }
            return true;
        }
    }
}
