package com.google.android.gms.iid;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzt implements android.content.ServiceConnection {
    int state;
    final android.os.Messenger zzcc;
    com.google.android.gms.iid.zzy zzcd;
    final java.util.Queue<com.google.android.gms.iid.zzz<?>> zzce;
    final android.util.SparseArray<com.google.android.gms.iid.zzz<?>> zzcf;
    final /* synthetic */ com.google.android.gms.iid.zzr zzcg;

    private zzt(com.google.android.gms.iid.zzr zzrVar) {
        this.zzcg = zzrVar;
        this.state = 0;
        this.zzcc = new android.os.Messenger(new android.os.Handler(android.os.Looper.getMainLooper(), new android.os.Handler.Callback(this) { // from class: com.google.android.gms.iid.zzu
            private final com.google.android.gms.iid.zzt zzch;

            {
                this.zzch = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                return this.zzch.zzd(message);
            }
        }));
        this.zzce = new java.util.ArrayDeque();
        this.zzcf = new android.util.SparseArray<>();
    }

    private final void zzr() {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zzcg.zzbz;
        scheduledExecutorService.execute(new java.lang.Runnable(this) { // from class: com.google.android.gms.iid.zzw
            private final com.google.android.gms.iid.zzt zzch;

            {
                this.zzch = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService2;
                android.content.Context context;
                final com.google.android.gms.iid.zzt zztVar = this.zzch;
                while (true) {
                    synchronized (zztVar) {
                        if (zztVar.state != 2) {
                            return;
                        }
                        if (zztVar.zzce.isEmpty()) {
                            zztVar.zzs();
                            return;
                        }
                        final com.google.android.gms.iid.zzz<?> poll = zztVar.zzce.poll();
                        zztVar.zzcf.put(poll.zzck, poll);
                        scheduledExecutorService2 = zztVar.zzcg.zzbz;
                        scheduledExecutorService2.schedule(new java.lang.Runnable(zztVar, poll) { // from class: com.google.android.gms.iid.zzx
                            private final com.google.android.gms.iid.zzt zzch;
                            private final com.google.android.gms.iid.zzz zzci;

                            {
                                this.zzch = zztVar;
                                this.zzci = poll;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zzch.zzg(this.zzci.zzck);
                            }
                        }, 30L, java.util.concurrent.TimeUnit.SECONDS);
                        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
                            new java.lang.StringBuilder(java.lang.String.valueOf(poll).length() + 8);
                        }
                        context = zztVar.zzcg.zzk;
                        android.os.Messenger messenger = zztVar.zzcc;
                        android.os.Message obtain = android.os.Message.obtain();
                        obtain.what = poll.what;
                        obtain.arg1 = poll.zzck;
                        obtain.replyTo = messenger;
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putBoolean("oneWay", poll.zzu());
                        bundle.putString("pkg", context.getPackageName());
                        bundle.putBundle(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, poll.zzcm);
                        obtain.setData(bundle);
                        try {
                            com.google.android.gms.iid.zzy zzyVar = zztVar.zzcd;
                            android.os.Messenger messenger2 = zzyVar.zzab;
                            if (messenger2 == null) {
                                com.google.android.gms.iid.MessengerCompat messengerCompat = zzyVar.zzcj;
                                if (messengerCompat == null) {
                                    throw new java.lang.IllegalStateException("Both messengers are null");
                                    break;
                                }
                                messengerCompat.send(obtain);
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
            this.zzcd = new com.google.android.gms.iid.zzy(iBinder);
            this.state = 2;
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
        int i18 = this.state;
        if (i18 == 0) {
            throw new java.lang.IllegalStateException();
        }
        if (i18 != 1 && i18 != 2) {
            if (i18 == 3) {
                this.state = 4;
                return;
            } else {
                if (i18 == 4) {
                    return;
                }
                int i19 = this.state;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(26);
                sb6.append("Unknown state: ");
                sb6.append(i19);
                throw new java.lang.IllegalStateException(sb6.toString());
            }
        }
        android.util.Log.isLoggable("MessengerIpcClient", 2);
        this.state = 4;
        com.google.android.gms.common.stats.ConnectionTracker connectionTracker = com.google.android.gms.common.stats.ConnectionTracker.getInstance();
        context = this.zzcg.zzk;
        connectionTracker.unbindService(context, this);
        com.google.android.gms.iid.zzaa zzaaVar = new com.google.android.gms.iid.zzaa(i17, str);
        java.util.Iterator<com.google.android.gms.iid.zzz<?>> it = this.zzce.iterator();
        while (it.hasNext()) {
            it.next().zzd(zzaaVar);
        }
        this.zzce.clear();
        for (int i27 = 0; i27 < this.zzcf.size(); i27++) {
            this.zzcf.valueAt(i27).zzd(zzaaVar);
        }
        this.zzcf.clear();
    }

    public final synchronized boolean zze(com.google.android.gms.iid.zzz zzzVar) {
        android.content.Context context;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
        int i17 = this.state;
        if (i17 == 0) {
            this.zzce.add(zzzVar);
            com.google.android.gms.common.internal.Preconditions.checkState(this.state == 0);
            android.util.Log.isLoggable("MessengerIpcClient", 2);
            this.state = 1;
            android.content.Intent intent = new android.content.Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            com.google.android.gms.common.stats.ConnectionTracker connectionTracker = com.google.android.gms.common.stats.ConnectionTracker.getInstance();
            context = this.zzcg.zzk;
            if (connectionTracker.bindService(context, intent, this, 1)) {
                scheduledExecutorService = this.zzcg.zzbz;
                scheduledExecutorService.schedule(new java.lang.Runnable(this) { // from class: com.google.android.gms.iid.zzv
                    private final com.google.android.gms.iid.zzt zzch;

                    {
                        this.zzch = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzch.zzt();
                    }
                }, 30L, java.util.concurrent.TimeUnit.SECONDS);
            } else {
                zzd(0, "Unable to bind to service");
            }
            return true;
        }
        if (i17 == 1) {
            this.zzce.add(zzzVar);
            return true;
        }
        if (i17 == 2) {
            this.zzce.add(zzzVar);
            zzr();
            return true;
        }
        if (i17 != 3 && i17 != 4) {
            int i18 = this.state;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(26);
            sb6.append("Unknown state: ");
            sb6.append(i18);
            throw new java.lang.IllegalStateException(sb6.toString());
        }
        return false;
    }

    public final synchronized void zzg(int i17) {
        com.google.android.gms.iid.zzz<?> zzzVar = this.zzcf.get(i17);
        if (zzzVar != null) {
            this.zzcf.remove(i17);
            zzzVar.zzd(new com.google.android.gms.iid.zzaa(3, "Timed out waiting for response"));
            zzs();
        }
    }

    public final synchronized void zzs() {
        android.content.Context context;
        if (this.state == 2 && this.zzce.isEmpty() && this.zzcf.size() == 0) {
            android.util.Log.isLoggable("MessengerIpcClient", 2);
            this.state = 3;
            com.google.android.gms.common.stats.ConnectionTracker connectionTracker = com.google.android.gms.common.stats.ConnectionTracker.getInstance();
            context = this.zzcg.zzk;
            connectionTracker.unbindService(context, this);
        }
    }

    public final synchronized void zzt() {
        if (this.state == 1) {
            zzd(1, "Timed out while binding");
        }
    }

    public final boolean zzd(android.os.Message message) {
        int i17 = message.arg1;
        android.util.Log.isLoggable("MessengerIpcClient", 3);
        synchronized (this) {
            com.google.android.gms.iid.zzz<?> zzzVar = this.zzcf.get(i17);
            if (zzzVar == null) {
                return true;
            }
            this.zzcf.remove(i17);
            zzs();
            android.os.Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                zzzVar.zzd(new com.google.android.gms.iid.zzaa(4, "Not supported by GmsCore"));
            } else {
                zzzVar.zzh(data);
            }
            return true;
        }
    }
}
